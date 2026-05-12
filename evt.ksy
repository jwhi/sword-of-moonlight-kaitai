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
