// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;


/**
 * Sword of Moonlight SYS.dat file.
 * Stores game specific information and counter names used in map events.
 * @see <a href="https://doc.swordofmoonlight.com/editor/ff/param-system-file-formats/">Source</a>
 */
public class Sys extends KaitaiStruct {
    public static Sys fromFile(String fileName) throws IOException {
        return new Sys(new ByteBufferKaitaiStream(fileName));
    }

    public enum LevelingType {
        KINGS_FIELD_1(0),
        KINGS_FIELD_2(1),
        BALANCED(2),
        SOLDIER(3),
        MAGICIAN(4);

        private final long id;
        LevelingType(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, LevelingType> byId = new HashMap<Long, LevelingType>(5);
        static {
            for (LevelingType e : LevelingType.values())
                byId.put(e.id(), e);
        }
        public static LevelingType byId(long id) { return byId.get(id); }
    }

    public enum SequenceMode {
        NONE(0),
        VIDEO(1),
        SLIDESHOW(2);

        private final long id;
        SequenceMode(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, SequenceMode> byId = new HashMap<Long, SequenceMode>(3);
        static {
            for (SequenceMode e : SequenceMode.values())
                byId.put(e.id(), e);
        }
        public static SequenceMode byId(long id) { return byId.get(id); }
    }

    public Sys(KaitaiStream _io) {
        this(_io, null, null);
    }

    public Sys(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public Sys(KaitaiStream _io, KaitaiStruct _parent, Sys _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.sequenceSettings = new SequenceSettings(this._io, this, _root);
        this.dashEnabledFlag = this._io.readU2le();
        this.playerSpeed = new PlayerSpeed(this._io, this, _root);
        this.levelingType = LevelingType.byId(this._io.readU1());
        this.classData = new ClassData(this._io, this, _root);
        this.magicTable = new MagicTable(this._io, this, _root);
        this.menuConfiguration = new MenuConfiguration(this._io, this, _root);
        this.messages = new Messages(this._io, this, _root);
        this.systemMessages = new SystemMessages(this._io, this, _root);
        this.currencyUnit = new String(KaitaiStream.bytesTerminate(this._io.readBytes(3), (byte) 0, false), Charset.forName("Shift_JIS"));
        this.playerConfig = new PlayerConfig(this._io, this, _root);
        this.playerConfigTestPlay = new PlayerConfig(this._io, this, _root);
        this.startingMap = this._io.readU1();
        this.counterNames = new ArrayList<String>();
        for (int i = 0; i < 1024; i++) {
            this.counterNames.add(new String(KaitaiStream.bytesTerminate(this._io.readBytes(31), (byte) 0, false), Charset.forName("Shift_JIS")));
        }
        this.unknown = new ArrayList<Integer>();
        for (int i = 0; i < 1; i++) {
            this.unknown.add(this._io.readU1());
        }
        this.sounds = new ArrayList<Integer>();
        for (int i = 0; i < 16; i++) {
            this.sounds.add(this._io.readU2le());
        }
        this.menuBackgroundFilename = new String(KaitaiStream.bytesTerminate(this._io.readBytes(38), (byte) 0, false), Charset.forName("Shift_JIS"));
        this.messagesAdditional = new MessagesAdditional(this._io, this, _root);
        this.menuSoundEffect = this._io.readU1();
        this.endingPadding = new ArrayList<Integer>();
        {
            int i = 0;
            while (!this._io.isEof()) {
                this.endingPadding.add(this._io.readU1());
                i++;
            }
        }
    }

    public void _fetchInstances() {
        this.sequenceSettings._fetchInstances();
        this.playerSpeed._fetchInstances();
        this.classData._fetchInstances();
        this.magicTable._fetchInstances();
        this.menuConfiguration._fetchInstances();
        this.messages._fetchInstances();
        this.systemMessages._fetchInstances();
        this.playerConfig._fetchInstances();
        this.playerConfigTestPlay._fetchInstances();
        for (int i = 0; i < this.counterNames.size(); i++) {
        }
        for (int i = 0; i < this.unknown.size(); i++) {
        }
        for (int i = 0; i < this.sounds.size(); i++) {
        }
        this.messagesAdditional._fetchInstances();
        for (int i = 0; i < this.endingPadding.size(); i++) {
        }
    }
    public static class ClassData extends KaitaiStruct {
        public static ClassData fromFile(String fileName) throws IOException {
            return new ClassData(new ByteBufferKaitaiStream(fileName));
        }

        public ClassData(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ClassData(KaitaiStream _io, Sys _parent) {
            this(_io, _parent, null);
        }

        public ClassData(KaitaiStream _io, Sys _parent, Sys _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.names = new ArrayList<String>();
            for (int i = 0; i < 25; i++) {
                this.names.add(new String(KaitaiStream.bytesTerminate(this._io.readBytes(15), (byte) 0, false), Charset.forName("Shift_JIS")));
            }
            this.strengthTiers = new ArrayList<Integer>();
            for (int i = 0; i < 4; i++) {
                this.strengthTiers.add(this._io.readU2le());
            }
            this.magicTiers = new ArrayList<Integer>();
            for (int i = 0; i < 4; i++) {
                this.magicTiers.add(this._io.readU2le());
            }
        }

        public void _fetchInstances() {
            for (int i = 0; i < this.names.size(); i++) {
            }
            for (int i = 0; i < this.strengthTiers.size(); i++) {
            }
            for (int i = 0; i < this.magicTiers.size(); i++) {
            }
        }
        private List<String> names;
        private List<Integer> strengthTiers;
        private List<Integer> magicTiers;
        private Sys _root;
        private Sys _parent;
        public List<String> names() { return names; }
        public List<Integer> strengthTiers() { return strengthTiers; }
        public List<Integer> magicTiers() { return magicTiers; }
        public Sys _root() { return _root; }
        public Sys _parent() { return _parent; }
    }

    /**
     * Takes an array index between 0 and 250
     * Max item id is 249 but space is allocated to 250
     * in player config.
     * Corresponds to item id
     */
    public static class InventoryItem extends KaitaiStruct {

        public InventoryItem(KaitaiStream _io, int itemId) {
            this(_io, null, null, itemId);
        }

        public InventoryItem(KaitaiStream _io, Sys.PlayerConfig _parent, int itemId) {
            this(_io, _parent, null, itemId);
        }

        public InventoryItem(KaitaiStream _io, Sys.PlayerConfig _parent, Sys _root, int itemId) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            this.itemId = itemId;
            _read();
        }
        private void _read() {
        }

        public void _fetchInstances() {
        }
        private Integer quantity;
        public Integer quantity() {
            if (this.quantity != null)
                return this.quantity;
            this.quantity = ((Number) (_parent().inventoryCount().get(((Number) (itemId())).intValue()))).intValue();
            return this.quantity;
        }
        private int itemId;
        private Sys _root;
        private Sys.PlayerConfig _parent;
        public int itemId() { return itemId; }
        public Sys _root() { return _root; }
        public Sys.PlayerConfig _parent() { return _parent; }
    }

    /**
     * Parses the two seperate arrays into a single
     * object to represent each row of the magic table.
     */
    public static class Magic extends KaitaiStruct {

        public Magic(KaitaiStream _io, int i) {
            this(_io, null, null, i);
        }

        public Magic(KaitaiStream _io, Sys.MagicTable _parent, int i) {
            this(_io, _parent, null, i);
        }

        public Magic(KaitaiStream _io, Sys.MagicTable _parent, Sys _root, int i) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            this.i = i;
            _read();
        }
        private void _read() {
        }

        public void _fetchInstances() {
        }
        private Integer id;
        public Integer id() {
            if (this.id != null)
                return this.id;
            this.id = ((Number) (_parent().ids().get(((Number) (i())).intValue()))).intValue();
            return this.id;
        }
        private Boolean learnByEvent;
        public Boolean learnByEvent() {
            if (this.learnByEvent != null)
                return this.learnByEvent;
            this.learnByEvent = _parent().levels().get(((Number) (i())).intValue()) > 100;
            return this.learnByEvent;
        }
        private Integer levelRequirement;
        public Integer levelRequirement() {
            if (this.levelRequirement != null)
                return this.levelRequirement;
            this.levelRequirement = ((Number) (KaitaiStream.mod(_parent().levels().get(((Number) (i())).intValue()), 100))).intValue();
            return this.levelRequirement;
        }
        private int i;
        private Sys _root;
        private Sys.MagicTable _parent;
        public int i() { return i; }
        public Sys _root() { return _root; }
        public Sys.MagicTable _parent() { return _parent; }
    }
    public static class MagicTable extends KaitaiStruct {
        public static MagicTable fromFile(String fileName) throws IOException {
            return new MagicTable(new ByteBufferKaitaiStream(fileName));
        }

        public MagicTable(KaitaiStream _io) {
            this(_io, null, null);
        }

        public MagicTable(KaitaiStream _io, Sys _parent) {
            this(_io, _parent, null);
        }

        public MagicTable(KaitaiStream _io, Sys _parent, Sys _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.ids = new ArrayList<Integer>();
            for (int i = 0; i < 32; i++) {
                this.ids.add(this._io.readU1());
            }
            this.levels = new ArrayList<Integer>();
            for (int i = 0; i < 32; i++) {
                this.levels.add(this._io.readU1());
            }
        }

        public void _fetchInstances() {
            for (int i = 0; i < this.ids.size(); i++) {
            }
            for (int i = 0; i < this.levels.size(); i++) {
            }
            magic();
            if (this.magic != null) {
                for (int i = 0; i < this.magic.size(); i++) {
                    this.magic.get(((Number) (i)).intValue())._fetchInstances();
                }
            }
        }
        private List<Magic> magic;
        public List<Magic> magic() {
            if (this.magic != null)
                return this.magic;
            this.magic = new ArrayList<Magic>();
            {
                Magic _it;
                int i = 0;
                do {
                    _it = new Magic(this._io, this, _root, i);
                    this.magic.add(_it);
                    i++;
                } while (!(_it.id() == 255));
            }
            return this.magic;
        }
        private List<Integer> ids;
        private List<Integer> levels;
        private Sys _root;
        private Sys _parent;
        public List<Integer> ids() { return ids; }
        public List<Integer> levels() { return levels; }
        public Sys _root() { return _root; }
        public Sys _parent() { return _parent; }
    }
    public static class MenuConfiguration extends KaitaiStruct {
        public static MenuConfiguration fromFile(String fileName) throws IOException {
            return new MenuConfiguration(new ByteBufferKaitaiStream(fileName));
        }

        public MenuConfiguration(KaitaiStream _io) {
            this(_io, null, null);
        }

        public MenuConfiguration(KaitaiStream _io, Sys _parent) {
            this(_io, _parent, null);
        }

        public MenuConfiguration(KaitaiStream _io, Sys _parent, Sys _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.allowSaveInMenuFlag = this._io.readU1();
            this.enableEquipmentWeightLimitFlag = this._io.readU1();
            this.compass = this._io.readU1();
            this.gauge = this._io.readU1();
            this.padding = this._io.readU1();
            this.menuStyle = this._io.readU1();
        }

        public void _fetchInstances() {
        }
        private Boolean allowSaveInMenu;
        public Boolean allowSaveInMenu() {
            if (this.allowSaveInMenu != null)
                return this.allowSaveInMenu;
            this.allowSaveInMenu = allowSaveInMenuFlag() != 0;
            return this.allowSaveInMenu;
        }
        private int allowSaveInMenuFlag;
        private int enableEquipmentWeightLimitFlag;
        private int compass;
        private int gauge;
        private int padding;
        private int menuStyle;
        private Sys _root;
        private Sys _parent;
        public int allowSaveInMenuFlag() { return allowSaveInMenuFlag; }
        public int enableEquipmentWeightLimitFlag() { return enableEquipmentWeightLimitFlag; }

        /**
         * Compass 0 is NONE.
         * Maximum: 4
         */
        public int compass() { return compass; }

        /**
         * Guage 0 is NONE.
         * Maximum: 4
         */
        public int gauge() { return gauge; }
        public int padding() { return padding; }

        /**
         * Menu Style 0 is NONE.
         * Maxmimum: 4
         */
        public int menuStyle() { return menuStyle; }
        public Sys _root() { return _root; }
        public Sys _parent() { return _parent; }
    }

    /**
     * Messages tab is split between here and additional messages field.
     */
    public static class Messages extends KaitaiStruct {
        public static Messages fromFile(String fileName) throws IOException {
            return new Messages(new ByteBufferKaitaiStream(fileName));
        }

        public Messages(KaitaiStream _io) {
            this(_io, null, null);
        }

        public Messages(KaitaiStream _io, Sys _parent) {
            this(_io, _parent, null);
        }

        public Messages(KaitaiStream _io, Sys _parent, Sys _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.sealed = new String(KaitaiStream.bytesTerminate(this._io.readBytes(41), (byte) 0, false), Charset.forName("Shift_JIS"));
            this.locked = new String(KaitaiStream.bytesTerminate(this._io.readBytes(41), (byte) 0, false), Charset.forName("Shift_JIS"));
            this.wrongKey = new String(KaitaiStream.bytesTerminate(this._io.readBytes(41), (byte) 0, false), Charset.forName("Shift_JIS"));
            this.nothingHappens = new String(KaitaiStream.bytesTerminate(this._io.readBytes(41), (byte) 0, false), Charset.forName("Shift_JIS"));
            this.notEnoughMp = new String(KaitaiStream.bytesTerminate(this._io.readBytes(41), (byte) 0, false), Charset.forName("Shift_JIS"));
            this.levelIncreased = new String(KaitaiStream.bytesTerminate(this._io.readBytes(41), (byte) 0, false), Charset.forName("Shift_JIS"));
            this.magicLearned = new String(KaitaiStream.bytesTerminate(this._io.readBytes(41), (byte) 0, false), Charset.forName("Shift_JIS"));
            this.strengthIncreased = new String(KaitaiStream.bytesTerminate(this._io.readBytes(41), (byte) 0, false), Charset.forName("Shift_JIS"));
            this.magicIncreased = new String(KaitaiStream.bytesTerminate(this._io.readBytes(41), (byte) 0, false), Charset.forName("Shift_JIS"));
        }

        public void _fetchInstances() {
        }
        private String sealed;
        private String locked;
        private String wrongKey;
        private String nothingHappens;
        private String notEnoughMp;
        private String levelIncreased;
        private String magicLearned;
        private String strengthIncreased;
        private String magicIncreased;
        private Sys _root;
        private Sys _parent;
        public String sealed() { return sealed; }
        public String locked() { return locked; }
        public String wrongKey() { return wrongKey; }
        public String nothingHappens() { return nothingHappens; }
        public String notEnoughMp() { return notEnoughMp; }
        public String levelIncreased() { return levelIncreased; }
        public String magicLearned() { return magicLearned; }
        public String strengthIncreased() { return strengthIncreased; }
        public String magicIncreased() { return magicIncreased; }
        public Sys _root() { return _root; }
        public Sys _parent() { return _parent; }
    }
    public static class MessagesAdditional extends KaitaiStruct {
        public static MessagesAdditional fromFile(String fileName) throws IOException {
            return new MessagesAdditional(new ByteBufferKaitaiStream(fileName));
        }

        public MessagesAdditional(KaitaiStream _io) {
            this(_io, null, null);
        }

        public MessagesAdditional(KaitaiStream _io, Sys _parent) {
            this(_io, _parent, null);
        }

        public MessagesAdditional(KaitaiStream _io, Sys _parent, Sys _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.nothingInside = new String(KaitaiStream.bytesTerminate(this._io.readBytes(41), (byte) 0, false), Charset.forName("Shift_JIS"));
            this.seemsToBeDead = new String(KaitaiStream.bytesTerminate(this._io.readBytes(41), (byte) 0, false), Charset.forName("Shift_JIS"));
            this.unlockedWithKey = new String(KaitaiStream.bytesTerminate(this._io.readBytes(41), (byte) 0, false), Charset.forName("Shift_JIS"));
        }

        public void _fetchInstances() {
        }
        private String nothingInside;
        private String seemsToBeDead;
        private String unlockedWithKey;
        private Sys _root;
        private Sys _parent;
        public String nothingInside() { return nothingInside; }
        public String seemsToBeDead() { return seemsToBeDead; }
        public String unlockedWithKey() { return unlockedWithKey; }
        public Sys _root() { return _root; }
        public Sys _parent() { return _parent; }
    }
    public static class PlayerConfig extends KaitaiStruct {
        public static PlayerConfig fromFile(String fileName) throws IOException {
            return new PlayerConfig(new ByteBufferKaitaiStream(fileName));
        }

        public PlayerConfig(KaitaiStream _io) {
            this(_io, null, null);
        }

        public PlayerConfig(KaitaiStream _io, Sys _parent) {
            this(_io, _parent, null);
        }

        public PlayerConfig(KaitaiStream _io, Sys _parent, Sys _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.initialStrength = this._io.readU2le();
            this.initialMagic = this._io.readU2le();
            this.initialHp = this._io.readU2le();
            this.initialMp = this._io.readU2le();
            this.initialGold = this._io.readU4le();
            this.initialExperience = this._io.readU4le();
            this.initialLevel = this._io.readU1();
            this.weapon = this._io.readU1();
            this.headArmor = this._io.readU1();
            this.chestArmor = this._io.readU1();
            this.handsArmor = this._io.readU1();
            this.feetArmor = this._io.readU1();
            this.shield = this._io.readU1();
            this.accessory = this._io.readU1();
            this.magic = this._io.readU1();
            this.inventoryCount = new ArrayList<Integer>();
            for (int i = 0; i < 251; i++) {
                this.inventoryCount.add(this._io.readU1());
            }
        }

        public void _fetchInstances() {
            for (int i = 0; i < this.inventoryCount.size(); i++) {
            }
            inventory();
            if (this.inventory != null) {
                for (int i = 0; i < this.inventory.size(); i++) {
                    this.inventory.get(((Number) (i)).intValue())._fetchInstances();
                }
            }
        }
        private List<InventoryItem> inventory;
        public List<InventoryItem> inventory() {
            if (this.inventory != null)
                return this.inventory;
            this.inventory = new ArrayList<InventoryItem>();
            for (int i = 0; i < 251; i++) {
                this.inventory.add(new InventoryItem(this._io, this, _root, i));
            }
            return this.inventory;
        }
        private int initialStrength;
        private int initialMagic;
        private int initialHp;
        private int initialMp;
        private long initialGold;
        private long initialExperience;
        private int initialLevel;
        private int weapon;
        private int headArmor;
        private int chestArmor;
        private int handsArmor;
        private int feetArmor;
        private int shield;
        private int accessory;
        private int magic;
        private List<Integer> inventoryCount;
        private Sys _root;
        private Sys _parent;
        public int initialStrength() { return initialStrength; }
        public int initialMagic() { return initialMagic; }
        public int initialHp() { return initialHp; }
        public int initialMp() { return initialMp; }
        public long initialGold() { return initialGold; }
        public long initialExperience() { return initialExperience; }
        public int initialLevel() { return initialLevel; }
        public int weapon() { return weapon; }
        public int headArmor() { return headArmor; }
        public int chestArmor() { return chestArmor; }
        public int handsArmor() { return handsArmor; }
        public int feetArmor() { return feetArmor; }
        public int shield() { return shield; }
        public int accessory() { return accessory; }
        public int magic() { return magic; }
        public List<Integer> inventoryCount() { return inventoryCount; }
        public Sys _root() { return _root; }
        public Sys _parent() { return _parent; }
    }
    public static class PlayerSpeed extends KaitaiStruct {
        public static PlayerSpeed fromFile(String fileName) throws IOException {
            return new PlayerSpeed(new ByteBufferKaitaiStream(fileName));
        }

        public PlayerSpeed(KaitaiStream _io) {
            this(_io, null, null);
        }

        public PlayerSpeed(KaitaiStream _io, Sys _parent) {
            this(_io, _parent, null);
        }

        public PlayerSpeed(KaitaiStream _io, Sys _parent, Sys _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.walk = this._io.readF4le();
            this.dash = this._io.readF4le();
            this.turnSpeed = this._io.readU2le();
        }

        public void _fetchInstances() {
        }
        private float walk;
        private float dash;
        private int turnSpeed;
        private Sys _root;
        private Sys _parent;

        /**
         * Rounded to first decimal place in UI
         * Minimum: 0.1
         * Maximum: 10.0
         */
        public float walk() { return walk; }

        /**
         * Rounded to first decimal place in UI
         * Minimum: 0.1
         * Maximum: 10.0
         */
        public float dash() { return dash; }

        /**
         * Turn speed in degrees per second
         * Minimum: 1
         * Maximum: 360
         */
        public int turnSpeed() { return turnSpeed; }
        public Sys _root() { return _root; }
        public Sys _parent() { return _parent; }
    }
    public static class SequenceSettings extends KaitaiStruct {
        public static SequenceSettings fromFile(String fileName) throws IOException {
            return new SequenceSettings(new ByteBufferKaitaiStream(fileName));
        }

        public SequenceSettings(KaitaiStream _io) {
            this(_io, null, null);
        }

        public SequenceSettings(KaitaiStream _io, Sys _parent) {
            this(_io, _parent, null);
        }

        public SequenceSettings(KaitaiStream _io, Sys _parent, Sys _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.titleSequenceMode = Sys.SequenceMode.byId(this._io.readU1());
            this.titleSequenceFilename = new String(KaitaiStream.bytesTerminate(this._io.readBytes(31), (byte) 0, false), Charset.forName("Shift_JIS"));
            this.titleImage = new String(KaitaiStream.bytesTerminate(this._io.readBytes(31), (byte) 0, false), Charset.forName("Shift_JIS"));
            this.openingSequenceMode = Sys.SequenceMode.byId(this._io.readU1());
            this.openingSequenceFilename = new String(KaitaiStream.bytesTerminate(this._io.readBytes(31), (byte) 0, false), Charset.forName("Shift_JIS"));
            this.ending1SequenceMode = Sys.SequenceMode.byId(this._io.readU1());
            this.ending1SequenceFilename = new String(KaitaiStream.bytesTerminate(this._io.readBytes(31), (byte) 0, false), Charset.forName("Shift_JIS"));
            this.ending2SequenceMode = Sys.SequenceMode.byId(this._io.readU1());
            this.ending2Filename = new String(KaitaiStream.bytesTerminate(this._io.readBytes(31), (byte) 0, false), Charset.forName("Shift_JIS"));
            this.ending3Mode = Sys.SequenceMode.byId(this._io.readU1());
            this.ending3Filename = new String(KaitaiStream.bytesTerminate(this._io.readBytes(31), (byte) 0, false), Charset.forName("Shift_JIS"));
            this.creditsMode = Sys.SequenceMode.byId(this._io.readU1());
            this.creditsFilename = new String(KaitaiStream.bytesTerminate(this._io.readBytes(31), (byte) 0, false), Charset.forName("Shift_JIS"));
            this.creditsFinalImageFilename = new String(KaitaiStream.bytesTerminate(this._io.readBytes(31), (byte) 0, false), Charset.forName("Shift_JIS"));
        }

        public void _fetchInstances() {
        }
        private SequenceMode titleSequenceMode;
        private String titleSequenceFilename;
        private String titleImage;
        private SequenceMode openingSequenceMode;
        private String openingSequenceFilename;
        private SequenceMode ending1SequenceMode;
        private String ending1SequenceFilename;
        private SequenceMode ending2SequenceMode;
        private String ending2Filename;
        private SequenceMode ending3Mode;
        private String ending3Filename;
        private SequenceMode creditsMode;
        private String creditsFilename;
        private String creditsFinalImageFilename;
        private Sys _root;
        private Sys _parent;
        public SequenceMode titleSequenceMode() { return titleSequenceMode; }
        public String titleSequenceFilename() { return titleSequenceFilename; }
        public String titleImage() { return titleImage; }
        public SequenceMode openingSequenceMode() { return openingSequenceMode; }
        public String openingSequenceFilename() { return openingSequenceFilename; }
        public SequenceMode ending1SequenceMode() { return ending1SequenceMode; }
        public String ending1SequenceFilename() { return ending1SequenceFilename; }
        public SequenceMode ending2SequenceMode() { return ending2SequenceMode; }
        public String ending2Filename() { return ending2Filename; }
        public SequenceMode ending3Mode() { return ending3Mode; }
        public String ending3Filename() { return ending3Filename; }
        public SequenceMode creditsMode() { return creditsMode; }
        public String creditsFilename() { return creditsFilename; }
        public String creditsFinalImageFilename() { return creditsFinalImageFilename; }
        public Sys _root() { return _root; }
        public Sys _parent() { return _parent; }
    }

    /**
     * Defined in example project, but don't seem to be defined in new projects
     * for the english translation patch 1.2.
     * Provided example values and translation for each field.
     */
    public static class SystemMessages extends KaitaiStruct {
        public static SystemMessages fromFile(String fileName) throws IOException {
            return new SystemMessages(new ByteBufferKaitaiStream(fileName));
        }

        public SystemMessages(KaitaiStream _io) {
            this(_io, null, null);
        }

        public SystemMessages(KaitaiStream _io, Sys _parent) {
            this(_io, _parent, null);
        }

        public SystemMessages(KaitaiStream _io, Sys _parent, Sys _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.saving = new String(KaitaiStream.bytesTerminate(this._io.readBytes(41), (byte) 0, false), Charset.forName("Shift_JIS"));
            this.saveComplete = new String(KaitaiStream.bytesTerminate(this._io.readBytes(41), (byte) 0, false), Charset.forName("Shift_JIS"));
            this.loading = new String(KaitaiStream.bytesTerminate(this._io.readBytes(41), (byte) 0, false), Charset.forName("Shift_JIS"));
            this.loadComplete = new String(KaitaiStream.bytesTerminate(this._io.readBytes(41), (byte) 0, false), Charset.forName("Shift_JIS"));
        }

        public void _fetchInstances() {
        }
        private String saving;
        private String saveComplete;
        private String loading;
        private String loadComplete;
        private Sys _root;
        private Sys _parent;

        /**
         * セーブ中
         * Saving...
         */
        public String saving() { return saving; }

        /**
         * セーブ完了
         * Save Complete
         */
        public String saveComplete() { return saveComplete; }

        /**
         * ロード中
         * Loading...
         */
        public String loading() { return loading; }

        /**
         * ロード完了
         * Loading Complete
         */
        public String loadComplete() { return loadComplete; }
        public Sys _root() { return _root; }
        public Sys _parent() { return _parent; }
    }
    private SequenceSettings sequenceSettings;
    private int dashEnabledFlag;
    private PlayerSpeed playerSpeed;
    private LevelingType levelingType;
    private ClassData classData;
    private MagicTable magicTable;
    private MenuConfiguration menuConfiguration;
    private Messages messages;
    private SystemMessages systemMessages;
    private String currencyUnit;
    private PlayerConfig playerConfig;
    private PlayerConfig playerConfigTestPlay;
    private int startingMap;
    private List<String> counterNames;
    private List<Integer> unknown;
    private List<Integer> sounds;
    private String menuBackgroundFilename;
    private MessagesAdditional messagesAdditional;
    private int menuSoundEffect;
    private List<Integer> endingPadding;
    private Sys _root;
    private KaitaiStruct _parent;
    public SequenceSettings sequenceSettings() { return sequenceSettings; }
    public int dashEnabledFlag() { return dashEnabledFlag; }
    public PlayerSpeed playerSpeed() { return playerSpeed; }
    public LevelingType levelingType() { return levelingType; }
    public ClassData classData() { return classData; }
    public MagicTable magicTable() { return magicTable; }
    public MenuConfiguration menuConfiguration() { return menuConfiguration; }
    public Messages messages() { return messages; }
    public SystemMessages systemMessages() { return systemMessages; }
    public String currencyUnit() { return currencyUnit; }
    public PlayerConfig playerConfig() { return playerConfig; }
    public PlayerConfig playerConfigTestPlay() { return playerConfigTestPlay; }
    public int startingMap() { return startingMap; }
    public List<String> counterNames() { return counterNames; }
    public List<Integer> unknown() { return unknown; }

    /**
     * 0 padded filename of sound effect in Sword of Moonlight's se folder
     * (Sword of Moonlight\data\sound\se).
     * Max value 0xFFFF (65535) is NONE (no sound effect set).
     * 
     * Example:
     * Sound 539 (0x21B) is 0539.snd (Wind sound effect)
     * @see <a href="https://doc.swordofmoonlight.com/editor/contentauthoring/auth-sounds/">Source</a>
     * @see <a href="https://doc.swordofmoonlight.com/editor/ff/snd-file-format/">Source</a>
     */
    public List<Integer> sounds() { return sounds; }
    public String menuBackgroundFilename() { return menuBackgroundFilename; }
    public MessagesAdditional messagesAdditional() { return messagesAdditional; }

    /**
     * Default menu sound effect.
     * 0 = NONE
     * 1-4 = Menu sound effect
     */
    public int menuSoundEffect() { return menuSoundEffect; }
    public List<Integer> endingPadding() { return endingPadding; }
    public Sys _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
