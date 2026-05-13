meta:
  id: sys
  file-extension: .dat
  ks-version: 0.9
  endian: le
  bit-endian: le
seq:
  - id: sequence_settings
    type: sequence_settings
  - id: dash_enabled_flag
    type: u2
  - id: player_speed
    type: player_speed
  - id: class_data
    type: class_data
  - id: magic_table
    type: magic_table
types:
  sequence_settings:
      seq:
      - id: title_sequence_mode
        type: u1
        enum: sequence_mode
      - id: title_sequence_filename
        type: strz
        size: 31
        encoding: UTF-8
      - id: title_image
        type: strz
        size: 31
        encoding: UTF-8
      - id: opening_sequence_mode
        type: u1
        enum: sequence_mode
      - id: opening_sequence_filename
        type: strz
        size: 31
        encoding: UTF-8
      - id: ending1_sequence_mode
        type: u1
        enum: sequence_mode
      - id: ending1_sequence_filename
        type: strz
        size: 31
        encoding: UTF-8
      - id: ending2_sequence_mode
        type: u1
        enum: sequence_mode
      - id: ending2_filename
        type: strz
        size: 31
        encoding: UTF-8
      - id: ending3_mode
        type: u1
        enum: sequence_mode
      - id: ending3_filename
        type: strz
        size: 31
        encoding: UTF-8
      - id: credits_mode
        type: u1
        enum: sequence_mode
      - id: credits_filename
        type: strz
        size: 31
        encoding: UTF-8
      - id: credits_final_image_filename
        type: strz
        size: 31
        encoding: UTF-8
  player_speed:
    seq:
      - id: walk
        type: f4
        doc: |
          Rounded to first decimal place in UI
          Minimum: 0.1
          Maximum: 10.0
      - id: dash
        type: f4
        doc: |
          Rounded to first decimal place in UI
          Minimum: 0.1
          Maximum: 10.0
      - id: turn_speed
        type: u1
        doc: |
          Turn speed in degrees per second
          Minimum: 1
          Maximum: 360
      - id: padding
        type: u2
        doc: |
          Noticed while parsing evt files that extra null bytes got added to
          the end of some sections. Either padding or start of class object.
          This has always been 00 00 for files I tested with.
  class_data:
    seq:
      - id: names
        type: strz
        size: 15
        encoding: UTF-8
        repeat: expr
        repeat-expr: 25
      - id: strength_tiers
        type: u2
        repeat: expr
        repeat-expr: 4
      - id: magic_tiers
        type: u2
        repeat: expr
        repeat-expr: 4
  magic:
    params:
      - id: i
        type: u1
    instances:
      id:
        value: _parent.ids[i]
      level_requirement:
        value: _parent.levels[i]
  magic_table:
    seq:
      - id: ids
        type: u1
        repeat: expr
        repeat-expr: 32
      - id: levels
        type: u1
        repeat: expr
        repeat-expr: 32
    instances:
      magic:
        type: magic(_index)
        repeat: expr
        repeat-expr: 32
enums:
  sequence_mode:
    0: none
    1: video
    2: slideshow
