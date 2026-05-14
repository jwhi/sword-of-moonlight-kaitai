meta:
  id: sys
  file-extension: .dat
  ks-version: 0.9
  endian: le
  bit-endian: le
doc: |
  Sword of Moonlight SYS.dat file.
  Stores game specific information and counter names used in map events.
doc-ref:
  - https://doc.swordofmoonlight.com/editor/ff/param-system-file-formats/
seq:
  - id: sequence_settings
    type: sequence_settings
  - id: dash_enabled_flag
    type: u2
  - id: player_speed
    type: player_speed
  - id: leveling_type
    type: u1
    enum: leveling_type
  - id: class_data
    type: class_data
  - id: magic_table
    type: magic_table
  - id: menu_configuration
    type: menu_configuration
  - id: messages
    type: messages
  - id: system_messages
    type: system_messages
  - id: currency_unit
    type: strz
    encoding: Shift_JIS
    size: 3
  - id: player_config
    type: player_config
  - id: player_config_test_play
    type: player_config
  - id: starting_map
    type: u1
  - id: counter_names
    type: strz
    encoding: Shift_JIS
    size: 31
    repeat: expr
    repeat-expr: 1024
  - id: unknown
    type: u1
    repeat: expr
    repeat-expr: 1
  - id: sounds
    doc: |
      0 padded filename of sound effect in Sword of Moonlight's se folder
      (Sword of Moonlight\data\sound\se).
      Max value 0xFFFF (65535) is NONE (no sound effect set).
      
      Example:
      Sound 539 (0x21B) is 0539.snd (Wind sound effect)
    doc-ref:
      - https://doc.swordofmoonlight.com/editor/contentauthoring/auth-sounds/
      - https://doc.swordofmoonlight.com/editor/ff/snd-file-format/
    type: u2
    repeat: expr
    repeat-expr: 16
  - id: menu_background_filename
    type: strz
    size: 38
    encoding: Shift_JIS
  - id: messages_additional
    type: messages_additional
  - id: menu_sound_effect
    doc: |
      Default menu sound effect.
      0 = NONE
      1-4 = Menu sound effect
    type: u1
  - id: ending_padding
    type: u1
    repeat: eos
types:
  sequence_settings:
      seq:
      - id: title_sequence_mode
        type: u1
        enum: sequence_mode
      - id: title_sequence_filename
        type: strz
        size: 31
        encoding: Shift_JIS
      - id: title_image
        type: strz
        size: 31
        encoding: Shift_JIS
      - id: opening_sequence_mode
        type: u1
        enum: sequence_mode
      - id: opening_sequence_filename
        type: strz
        size: 31
        encoding: Shift_JIS
      - id: ending1_sequence_mode
        type: u1
        enum: sequence_mode
      - id: ending1_sequence_filename
        type: strz
        size: 31
        encoding: Shift_JIS
      - id: ending2_sequence_mode
        type: u1
        enum: sequence_mode
      - id: ending2_filename
        type: strz
        size: 31
        encoding: Shift_JIS
      - id: ending3_mode
        type: u1
        enum: sequence_mode
      - id: ending3_filename
        type: strz
        size: 31
        encoding: Shift_JIS
      - id: credits_mode
        type: u1
        enum: sequence_mode
      - id: credits_filename
        type: strz
        size: 31
        encoding: Shift_JIS
      - id: credits_final_image_filename
        type: strz
        size: 31
        encoding: Shift_JIS
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
        type: u2
        doc: |
          Turn speed in degrees per second
          Minimum: 1
          Maximum: 360
  class_data:
    seq:
      - id: names
        type: strz
        size: 15
        encoding: Shift_JIS
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
        value: _parent.levels[i] % 100
      learn_by_event:
        value: _parent.levels[i] > 100
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
        repeat: until
        repeat-until: _.id == 255
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
      Messages tab is split between here and additional messages field.
    seq:
      - id: sealed
        type: strz
        encoding: Shift_JIS
        size: 41
      - id: locked
        type: strz
        encoding: Shift_JIS
        size: 41
      - id: wrong_key
        type: strz
        encoding: Shift_JIS
        size: 41
      - id: nothing_happens
        type: strz
        encoding: Shift_JIS
        size: 41
      - id: not_enough_mp
        type: strz
        encoding: Shift_JIS
        size: 41
      - id: level_increased
        type: strz
        encoding: Shift_JIS
        size: 41
      - id: magic_learned
        type: strz
        encoding: Shift_JIS
        size: 41
      - id: strength_increased
        type: strz
        encoding: Shift_JIS
        size: 41
      - id: magic_increased
        type: strz
        encoding: Shift_JIS
        size: 41
  system_messages:
    doc: |
      Defined in example project, but don't seem to be defined in new projects
      for the english translation patch 1.2.
      Provided example values and translation for each field.
    seq:
      - id: saving
        doc: |
          セーブ中
          Saving...
        type: strz
        encoding: Shift_JIS
        size: 41
      - id: save_complete
        doc: |
          セーブ完了
          Save Complete
        type: strz
        encoding: Shift_JIS
        size: 41
      - id: loading
        doc: |
          ロード中
          Loading...
        type: strz
        encoding: Shift_JIS
        size: 41
      - id: load_complete
        doc: |
          ロード完了
          Loading Complete
        type: strz
        encoding: Shift_JIS
        size: 41
  inventory_item:
    doc: |
      Takes an array index between 0 and 250
      Max item id is 249 but space is allocated to 250
      in player config.
      Corresponds to item id
    params:
      - id: item_id
        type: u1
    instances:
      quantity:
        value: _parent.inventory_count[item_id]
  player_config:
    seq:
      - id: initial_strength
        type: u2
      - id: initial_magic
        type: u2
      - id: initial_hp
        type: u2
      - id: initial_mp
        type: u2
      - id: initial_gold
        type: u4
      - id: initial_experience
        type: u4
      - id: initial_level
        type: u1
      - id: weapon
        type: u1
      - id: head_armor
        type: u1
      - id: chest_armor
        type: u1
      - id: hands_armor
        type: u1
      - id: feet_armor
        type: u1
      - id: shield
        type: u1
      - id: accessory
        type: u1
      - id: magic
        type: u1
      - id: inventory_count
        type: u1
        repeat: expr
        repeat-expr: 251
    instances:
      inventory:
        type: inventory_item(_index)
        repeat: expr
        repeat-expr: 251
  messages_additional:
    seq:
      - id: nothing_inside
        type: strz
        encoding: Shift_JIS
        size: 41
      - id: seems_to_be_dead
        type: strz
        encoding: Shift_JIS
        size: 41
      - id: unlocked_with_key
        type: strz
        encoding: Shift_JIS
        size: 41
enums:
  sequence_mode:
    0: none
    1: video
    2: slideshow
  leveling_type:
    0: kings_field_1
    1: kings_field_2
    2: balanced
    3: soldier
    4: magician
