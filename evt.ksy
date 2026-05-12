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
        io: _root._io
        pos: payload_offset
        type: evt_operation
        repeat: until
        repeat-until: _.op_id == operation_type::end
        
  evt_operation:
    seq:
      - id: op_id
        type: u2
        enum: operation_type
      - id: op_size
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
    40: begin_screen_effect
    41: end_screen_effect
    42: display_bmp
    43: display_movie
    44: play_sound_effect
    45: change_bgm
    46: bgm_on_off
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
