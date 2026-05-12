meta:
  id: evt
  title: Sword of Moonlight Map EVT Files
  file-extension: evt
  ks-version: 0.9
  endian: le
  bit-endian: le
doc: |
  Sword of Moonlight EVT file
doc-ref:
  - https://doc.swordofmoonlight.com/editor/ff/map-evt-file-format/
seq:
  - id: magic
    contents: [0x00, 0x04, 0x00, 0x00]
  - id: definition
    type: evt_definition
    repeat: expr
    repeat-expr: 251
    
types:
  evt_definition:
    seq:
      - id: name
        type: str
        size: 31
        encoding: utf8
      - id: target_type
        type: u1
        enum: target_type
      - id: target_id
        type: u2
      - id: trigger_type
        type: u1
        enum: trigger_type
      - id: trigger_item
        type: u1
      - id: trigger_cone
        type: u2
      - id: padding
        type: u2
      - id: trigger_rect_width
        type: f4
      - id: trigger_rect_height
        type: f4
      - id: trigger_radius
        type: f4
      - id: condition
        type: evt_condition
      - id: page
        type: evt_page_offset
        repeat: expr
        repeat-expr: 16
  evt_condition:
    seq:
      - id: compare_type
        type: u2
        enum: compare_type
      - id: compare_id
        type: u2
      - id: compared_value
        type: u2
      - id: comparison
        type: u2
        enum: comparison_type
  evt_page_offset:
    seq:
      - id: payload_offset
        type: u4
      - id: condition
        type: evt_condition
    instances:
      body:
        if: payload_offset > 0
        io: _root._io
        pos: payload_offset
        repeat: until
        repeat-until: _.op_id == operation_type::end
        type: evt_operation
  evt_operation:
    seq:
      - id: op_id
        type: u2
        enum: operation_type
      - id: op_size
        type: u2
      - id: operation
        size: op_size - 4
        type:
          switch-on: op_id
          cases:
            operation_type::display_message: display_message
            operation_type::display_formatted_message: display_formatted_message
            operation_type::shop_open: shop_open
            operation_type::warp_npc: warp_npc
            operation_type::warp_enemy: warp_enemy
            operation_type::activate_npc: activate_npc
            operation_type::activate_enemy: activate_enemy
            operation_type::activate_item: activate_item
            operation_type::terminate_npc: terminate_npc
            operation_type::terminate_enemy: terminate_enemy
            operation_type::screen_effect_start: screen_effect_start
            operation_type::display_bmp: display_bmp
            operation_type::display_movie: display_movie
            operation_type::play_sound_effect: play_sound_effect
            operation_type::change_bgm: change_bgm
            operation_type::bgm_playback: bgm_playback
            operation_type::warp_player_detailed: warp_player_detailed
            operation_type::warp_player_basic: warp_player_basic
  display_message:
    seq:
      - id: text
        type: str
        encoding: utf8
        terminator: 0
  display_formatted_message:
    seq:
      - id: red
        type: u1
      - id: green
        type: u1
      - id: blue
        type: u1
      - id: alpha
        type: u1
      - id: font_weight
        type: u2
      - id: padding
        type: u2
      - id: text
        type: str
        encoding: utf8
        terminator: 0
      - id: font
        type: str
        encoding: utf8
        terminator: 0
  shop_open:
    seq:
      - id: shop_id
        type: u2
  warp_npc:
    seq:
      - id: npc_id
        type: u2
      - id: x
        type: u2
      - id: z
        type: u1
      - id: direction
        type: u2
      - id: padding
        type: u2
      - id: fine_x
        type: f4
      - id: fine_y
        type: f4
      - id: fine_z
        type: f4
  warp_enemy:
    seq:
      - id: enemy_id
        type: u2
      - id: x
        type: u2
      - id: z
        type: u1
      - id: direction
        type: u2
      - id: padding
        type: u2
      - id: fine_x
        type: f4
      - id: fine_y
        type: f4
      - id: fine_z
        type: f4
  activate_npc:
    seq:
      - id: npc_id
        type: u2
  activate_enemy:
    seq:
      - id: enemy_id
        type: u2
  activate_item:
    seq:
      - id: item_id
        type: u2
  terminate_npc:
    seq:
      - id: npc_id
        type: u2
  terminate_enemy:
    seq:
      - id: enemy_id
        type: u2
  screen_effect_start:
    seq:
      - id: effect
        type: u1
        enum: screen_effect
      - id: loop
        type: b1
  display_bmp:
    seq:
      - id: display_option
        type: u1
        enum: bmp_display_options
      - id: duration
        type: u1
      - id: padding
        type: u2
      - id: filename
        type: str
        encoding: utf8
        terminator: 0
  display_movie:
    seq:
      - id: filename
        type: str
        encoding: utf8
        terminator: 0
  play_sound_effect:
    seq:
      - id: id
        type: u2
  change_bgm:
    seq:
      - id: loop_flag
        type: u2
      - id: padding
        type: u2
      - id: filename
        type: str
        encoding: utf8
        terminator: 0
    instances:
      loop:
        value: loop_flag != 0
  bgm_playback:
    seq:
      - id: playback
        type: u1
        enum: playback
  warp_player_detailed:
    seq:
      - id: map_id
        type: u1
      - id: default_start_point_flag
        type: u1
      - id: screen_effect_on_leave
        type: u1
        enum: screen_effect
      - id: screen_effect_on_enter
        type: u1
        enum: screen_effect
      - id: x
        type: u1
      - id: z
        type: u1
      - id: direction
        type: u2
      - id: fine_x
        type: f4
      - id: fine_y
        type: f4
      - id: fine_z
        type: f4
      - id: set_direction
        type: b1
      - id: set_fine_x
        type: b1
      - id: set_fine_y
        type: b1
      - id: set_fine_z
        type: b1
    instances:
      use_default_start_point:
        value: default_start_point_flag != 0
  warp_player_basic:
    seq:
      - id: x
        type: u1
      - id: z
        type: u1
      - id: direction
        type: u2
      - id: fine_x
        type: f4
      - id: fine_y
        type: f4
      - id: fine_z
        type: f4
      - id: set_direction
        type: b1
      - id: set_fine_x
        type: b1
      - id: set_fine_y
        type: b1
      - id: set_fine_z
        type: b1
enums:
  comparison_type:
    0: equals
    1: not_equals
    2: greater_than
    3: less_than
  target_type:
    0x00: npc
    0x01: enemy
    0x02: object
    0xFE: system
    0xFF: none
  trigger_type:
    1: examine
    2: use_item
    4: approach_square
    8: approach_circle
    16: death_enemy_or_npc
    32: always_on
    64: use_item_anywhere
    0: none
    255: player_death
  compare_type:
    0: none
    1: item_quantity
    2: gold_quantity
    3: strength
    4: magic
    5: level
    6: counter
  operation_type:
    0: display_message
    1: display_formatted_message
    23: shop_open
    25: warp_npc
    26: warp_enemy
    20: activate_npc
    21: activate_enemy
    22: activate_item
    27: terminate_npc
    28: terminate_enemy
    40: screen_effect_start
    41: screen_effect_end
    42: display_bmp
    43: display_movie
    44: play_sound_effect
    45: change_bgm
    46: bgm_playback
    60: warp_player_detailed
    61: warp_player_basic
    80: change_player_parameter
    81: change_player_status
    82: learn_magic
    83: recover_all
    84: set_player_parameter_in_counter
    100: object_animation_on_off
    101: display_object_on_off
    102: move_object
    120: change_dash_save_temporarily
    121: save_point
    122: end_game
    140: if_counter_condition
    141: if_message_prompt
    142: otherwise
    143: end_if
    144: change_counter
    145: change_page
    148: generate_random_counter_value
    149: start_timer
    150: set_timer_value_in_counter
    65535: end
  screen_effect:
    0: black_fades_off
    1: black_fades_on
    2: white_fades_off
    3: white_fades_on
    4: red
    5: green
    6: blue
    255: none
  bmp_display_options:
    0: keep_original_ratio
    1: full_screen_keep_ratio
    2: full_screen_stretch
  playback:
    0: stop
    1: play
