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
  - id: menu_configuration
    type: menu_configuration
  - id: messages
    type: messages
  - id: unknown
    type: u1
    repeat: expr
    repeat-expr: 164
  - id: currency_unit
    type: strz
    encoding: SHIFT-JIS
    size: 3
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
    doc: |
      Parses the two seperate arrays into a single
      object to represent each row of the magic table.
    params:
      - id: i
        type: u1
    instances:
      id:
        value: _parent.ids[i]
      level_requirement:
        value: _parent.levels[i]
        if: _parent.levels[i] != 101
      learn_by_event:
        value: _parent.levels[i] == 101
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
  menu_configuration:
    seq:
      - id: allow_save_in_menu_flag
        type: u1
      - id: enable_equipment_weight_limit_flag
        type: u1
      - id: compass
        type: u1
        doc: |
          Compass 0 is NONE.
          Maximum: 4
      - id: gauge
        type: u1
        doc: |
          Guage 0 is NONE.
          Maximum: 4
      - id: padding
        type: u1
      - id: menu_style
        type: u1
        doc: |
          Menu Style 0 is NONE.
          Maxmimum: 4
    instances:
      allow_save_in_menu:
        value: allow_save_in_menu_flag != 0
  messages:
    doc: |
      Missing some text that is in UI
      Missing:
        unlocked with key: (empty string)
        # At offset 83 60 00
        nothing inside: EMPTY
        # At offset 83 89 09
        seems_to_be_dead: HE IS DEAD
    seq:
      - id: sealed
        type: strz
        encoding: utf-8
        size: 41
      - id: locked
        type: strz
        encoding: utf-8
        size: 41
      - id: wrong_key
        type: strz
        encoding: utf-8
        size: 41
      - id: nothing_happens
        type: strz
        encoding: utf-8
        size: 41
      - id: not_enough_mp
        type: strz
        encoding: utf-8
        size: 41
      - id: level_increased
        type: strz
        encoding: utf-8
        size: 41
      - id: magic_learned
        type: strz
        encoding: utf-8
        size: 41
      - id: strength_increased
        type: strz
        encoding: utf-8
        size: 41
      - id: magic_increased
        type: strz
        encoding: utf-8
        size: 41
    
enums:
  sequence_mode:
    0: none
    1: video
    2: slideshow
