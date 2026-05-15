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
  - id: definitions
    type: evt_definition
    repeat: expr
    repeat-expr: 1024
    # Can use this condition if events are seqential without gaps
    # repeat: until
    # repeat-until: _.target_type == target_type::none
types:
  evt_definition:
    seq:
      - id: name
        type: strz
        size: 31
        encoding: UTF-8
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
            operation_type::change_player_parameter: change_player_parameter
            operation_type::change_player_status: change_player_status
            operation_type::learn_magic: learn_magic
            operation_type::set_player_parameter_in_counter: set_player_parameter_in_counter
            operation_type::object_animation: object_animation
            operation_type::display_object: display_object
            operation_type::move_object: move_object
            operation_type::change_dash_or_save_temporarily: change_dash_or_save_temporarily
            operation_type::if_counter: if_counter
            operation_type::if_prompt: if_prompt
            operation_type::change_counter: change_counter
            operation_type::change_page: change_page
            operation_type::generate_random_counter_value: generate_random_counter_value
            operation_type::start_timer: start_timer
            operation_type::set_timer_value_in_counter: set_timer_value_in_counter
  display_message:
    seq:
      - id: text
        type: strz
        encoding: UTF-8
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
        type: strz
        encoding: UTF-8
      - id: font
        type: strz
        encoding: UTF-8
  shop_open:
    seq:
      - id: shop_id
        type: u2
  warp_npc:
    seq:
      - id: npc_id
        type: u2
      - id: x
        type: u1
        doc: |
          X coordinate on current map
          Minimum: 1
          Maximum: 99
      - id: z
        doc: |
          Z coordinate on current map
          Minimum: 1
          Maximum: 99
        type: u1
      - id: direction
        type: u2
        doc: |
          Direction the NPC will face after warping
          Minimum: 1
          Maximum: 360
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
        type: u1
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
        type: strz
        encoding: UTF-8
    instances:
      wait_for_key_press:
        value: duration == 255
  display_movie:
    seq:
      - id: filename
        type: strz
        encoding: UTF-8
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
        type: strz
        encoding: UTF-8
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
        doc: |
          When set, ignores positions defined below and disable editing them
          in the event editor. Uses default player spawn position for the
          destination map.
        type: u1
      - id: screen_effect_on_leave
        type: u1
        enum: screen_effect
        doc: |
          Screen effect to use when warp starts.
          Valid values are:
            NONE(0xFFu),
            BLACK FADES OFF(0x00u),
            BLACK FADES ON(0x01u),
            WHITE FADES OFF(0x02u),
            WHITE FADES ON(0x03u)
          Used screen effect event enum for convencience.
      - id: screen_effect_on_enter
        type: u1
        enum: screen_effect
        doc: |
          Screen effect to use when warp ends.
          Valid values are:
            NONE(0xFFu),
            BLACK FADES OFF(0x00u),
            BLACK FADES ON(0x01u),
            WHITE FADES OFF(0x02u),
            WHITE FADES ON(0x03u)
          Used screen effect event enum for convencience.
      - id: x
        doc: |
          X coordinate of destination map
          Minimum: 1
          Maximum: 99
        type: u1
      - id: z
        doc: |
          Z coordinate of destination map
          Minimum: 1
          Maximum: 99
        type: u1
      - id: direction
        doc: |
          Player direction after warp in decrees.
          Minimum: 0
          Maximum: 360
        type: u2
      - id: fine_x
        doc: |
          Distance from center of tile.
          Rounding to the first decimal place in the editor
          Minimum: -1.0
          Maximum: 1.0
        type: f4
      - id: fine_y
        doc: |
          Vertical position.
          Rounding to the first decimal place in the editor
          Minimum: -20.0
          Maximum: 20.0
        type: f4
      - id: fine_z
        doc: |
          Distance from center of tile.
          Rounding to the first decimal place in the editor
          Minimum: -1.0
          Maximum: 1.0
        type: f4
      - id: set_direction
        doc: |
          When true, update player direction after warp
          When false, value of direction is ignored
        type: b1
      - id: set_fine_x
        doc: |
          When true, use fine x defined position
          When false, I don't know. Uses player's fine x position before warp?
        type: b1
      - id: set_fine_y
        doc: |
          When true, use fine y position after warp
          When false, I don't know. Use player's y position before warp?
        type: b1
      - id: set_fine_z
        doc: |
          When true, use fine z defined position
          When false, I don't know. Uses player's fine z position before warp?
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
  change_player_parameter:
    seq:
      - id: parameter
        doc: |
          Player parameter to modify.
          Not allowed to update level through Change Player Parameter operation.
          Reused player parameter enum from setting parameter into counter.
        type: u1
        enum: player_parameter
      - id: way_changed
        type: u1
        enum: way_changed
      - id: item_id
        type: u2
      - id: padding
        type: u2
      - id: value
        type: u2
  change_player_status:
    seq:
      - id: status
        type: u1
        enum: player_status
      - id: enabled
        type: b1
  learn_magic:
    seq:
      - id: magic_table_id
        type: u2
  set_player_parameter_in_counter:
    seq:
      - id: parameter
        type: u1
        enum: player_parameter
      - id: item_id
        type: u1
      - id: counter_id
        type: u2
  object_animation:
    seq:
      - id: id
        type: u2
      - id: playback
        type: u2
        enum: playback
  display_object:
    seq:
      - id: id
        type: u2
      - id: display
        type: b1
  move_object:
    seq:
      - id: id
        type: u2
      - id: x
        type: u1
      - id: z
        type: u1
      - id: angle_x
        type: u2
      - id: angle_y
        type: u2
      - id: angle_z
        type: u2
      - id: move_time
        type: u2
      - id: fine_x
        type: f4
      - id: fine_y
        type: f4
      - id: fine_z
        type: f4
  change_dash_or_save_temporarily:
    seq:
      - id: target
        type: u1
        enum: temporarily_change_target
      - id: enabled
        type: b1
  end_game:
    seq:
      - id: ending
        type: u1
        enum: ending
  if_counter:
    seq:
      - id: id
        type: u2
      - id: value
        type: u2
      - id: value_is_counter_id_flag
        type: u1
      - id: comparison_type
        type: u1
        enum: comparison_type
    instances:
      value_is_counter_id:
        value: value_is_counter_id_flag != 0
  if_prompt:
    seq:
      - id: text
        type: strz
        encoding: UTF-8
      - id: option_1
        type: strz
        encoding: UTF-8
      - id: option_2
        type: strz
        encoding: UTF-8
  change_counter:
    seq:
      - id: id
        type: u2
      - id: value
        type: u2
      - id: value_is_counter_id_flag
        type: u1
      - id: way_changed
        type: u1
        enum: way_changed
    instances:
      value_is_counter_id:
        value: value_is_counter_id_flag != 0
  change_page:
    seq:
      - id: target
        type: u2
      - id: change_page_type
        type: u1
        enum: change_page_type
      - id: value
        type: u1
    instances:
      change_to_page:
        value: value
        if: change_page_type == change_page_type::specific
  generate_random_counter_value:
    seq:
      - id: use_counter_for_max_value_flag
        type: u2
      - id: padding
        type: u2
      - id: max_value
        type: u2
      - id: id
        type: u2
    instances:
      use_counter_for_max_value:
        value: use_counter_for_max_value_flag != 0
  start_timer:
    seq:
      - id: id
        type: u1
  set_timer_value_in_counter:
    seq:
      - id: id
        type: u1
      - id: padding
        type: u1
      - id: destination_counter_id
        type: u2
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
    100: object_animation
    101: display_object
    102: move_object
    120: change_dash_or_save_temporarily
    121: save_point
    122: end_game
    140: if_counter
    141: if_prompt
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
  player_parameter:
    0: hp
    1: mp
    2: strength
    3: magic
    4: item_quantity
    5: gold
    6: level
  way_changed:
    0: set_to
    1: increment_by
    2: decrement_by
    3: counter
  player_status:
    0: poison
    1: paralyze
    2: dark
    3: curse
    4: slow
  temporarily_change_target:
    0: dash
    1: save
  ending:
    0: normal_end
    1: ending_1
    2: ending_2
    3: ending_3
  change_page_type:
    0: forward
    1: back
    2: specific
