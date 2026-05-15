meta:
  id: item_pr2
  file-extension: item.pr2
  ks-version: 0.9
  endian: le
  bit-endian: le
doc-ref:
    - https://doc.swordofmoonlight.com/editor/ff/param-item-file-formats/#item-pr2-format
seq:
  - id: item_count
    type: u4
  - id: items
    type: item
    repeat: expr
    repeat-expr: item_count
types:
  item:
    seq:
      - id: model_name
        type: strz
        encoding: Shift_JIS
        size: 31
      - id: model_filename
        type: strz
        encoding: Shift_JIS
        size: 31
      - id: item_type
        type: u2
        enum: item_type
      - id: menu_elevation_offset
        doc: |
          Elevation offset in the menu
        type: f4
      - id: menu_tilt_degrees
        doc: |
          Tilt of the item when displayed in the menu.
        type: u2
      - id: world_tilt_degrees
        doc: |
          Tilt of the item when displayed in the world.
        type: u2
      - id: data
        type:
          switch-on: item_type
          cases:
            item_type::usable: usable_item
            item_type::weapon: weapon_item
            item_type::armour: armour_item
            _: unknown_item_type
      
  usable_item:
    seq:
      - id: unknown
        type: u4
      - id: slot_key_id
        doc: |
          Special ID which must match with an objects to be able to slot the
          item into the object. See Object PRF.
        type: u1
      - id: unknown2
        type: u1
      - id: unknown3
        type: u2
      - id: unknown4
        type: u2
      - id: unknown5
        type: u2
      - id: unknown6
        type: u2
      - id: unknown7
        type: u2
  weapon_item:
    seq:
      - id: swing_animation_id
        doc: |
          The animation ID (in arm.mdl) to use for the swing
        type: u1
      - id: sound_delay
        doc: |
          Delay after swing when sound will play
        type: u1
      - id: sound_id
        doc: |
          The sound effect to play for the swing.
        type: u2
      - id: hit_window_start
        doc: |
          The starting frame where hits will register on an entity
        type: u1
      - id: hit_window_end
        doc: |
          The ending frame where hits will no longer register on an entity
        type: u1
      - id: attack_arc
        doc: |
          The arc of the attack in degrees, either side of the player.
        type: u2
      - id: attack_range
        doc: |
          The range of the attack. 1 = 1 metre
        type: f4
      - id: unknown
        doc: |
          Could be padding? Not sure. Sound pitch maybe?.. (needs testing)
        type: u2
      - id: magic_window_start
        doc: |
          The starting frame where sword magic can be cast
        type: u1
      - id: magic_window_end
        doc: |
          The ending frame where sword magic can no longer be cast
        type: u1
  armour_item:
    seq:
      - id: equip_type
        type: u1
        enum: equip_type
      - id: unknown
        doc: |
           Unknown. These first few values are mixes of either
           00 or FF (probably signed), They probably have _some_ purpose...
        type: u1
        repeat: expr
        repeat-expr: 15
  unknown_item_type:
    seq:
      - id: raw
        type: u1
        repeat: expr
        repeat-expr: 16
enums:
  item_type:
    0: usable
    1: weapon
    2: armour
  equip_type:
    0: helm
    1: body
    2: arms
    3: boots
    4: suit
    5: shield
    6: accessory
