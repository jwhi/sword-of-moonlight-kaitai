meta:
  id: item_prm
  file-extension: item.prm
  ks-version: 0.9
  endian: le
  bit-endian: le
seq:
  - id: items
    type: item
    repeat: eos
types:
  item:
    seq:
      - id: pr2_id
        type: u2
      - id: name
        type: strz
        encoding: Shift_JIS
        size: 31
      - id: description
        type: strz
        encoding: Shift_JIS
        size: 241
      - id: unknown1
        type: u1
        repeat: expr
        repeat-expr: 16
      - id: priority
        type: u1
        enum: priority
      - id: unknown2
        type: u1
        repeat: expr
        repeat-expr: 5
      - id: weight
        doc: |
          Weapon
          Weight (KG) when equipment weight is enabled.
          Rounded to one decimal place in editor.
          Minimum: 0.0
          Maximum: 60.0
        type: f4
      - id: slash
        type: u1
      - id: smash
        type: u1
      - id: stab
        type: u1
      - id: flame
        type: u1
      - id: earth
        type: u1
      - id: wind
        type: u1
      - id: water
        type: u1
      - id: holy
        type: u1
      - id: effect_type
        type: u1
        enum: effect_type
      - id: effect_potency
        doc: |
          Potency of magic effect.
          Minimum: 0
          Maximum: 100
        type: u1
      - id: magic_registry_id
        doc: |
          Id of the magic in the magic registry list.
          This is in "Magic" properties tab and not magic table
          in the system property editor.
        type: u1
      - id: unknown3
        type: u1
        repeat: expr
        repeat-expr: 25
enums:
  priority:
    0: default
    1: crucial
  effect_type:
    0: none
    1: dark
    2: curse
    3: hp_recover
    4: hp_decrease
    5: hp_absorb
    6: mp_recover
    7: mp_decrease
    8: mp_absorb
    9: strength_increase
    10: magic_increase
    11: poison_resistance
    12: paralyze_resistance
    13: dark_resistance
    14: curse_resistance
    15: slow_resistance
