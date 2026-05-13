// This is a generated file! Please edit source .ksy file and use kaitai-struct-compiler to rebuild

import io.kaitai.struct.ByteBufferKaitaiStream;
import io.kaitai.struct.KaitaiStruct;
import io.kaitai.struct.KaitaiStream;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;
import java.nio.charset.StandardCharsets;
import java.util.List;


/**
 * Sword of Moonlight EVT file
 * @see <a href="https://doc.swordofmoonlight.com/editor/ff/map-evt-file-format/">Source</a>
 */
public class Evt extends KaitaiStruct {
    public static Evt fromFile(String fileName) throws IOException {
        return new Evt(new ByteBufferKaitaiStream(fileName));
    }

    public enum BmpDisplayOptions {
        KEEP_ORIGINAL_RATIO(0),
        FULL_SCREEN_KEEP_RATIO(1),
        FULL_SCREEN_STRETCH(2);

        private final long id;
        BmpDisplayOptions(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, BmpDisplayOptions> byId = new HashMap<Long, BmpDisplayOptions>(3);
        static {
            for (BmpDisplayOptions e : BmpDisplayOptions.values())
                byId.put(e.id(), e);
        }
        public static BmpDisplayOptions byId(long id) { return byId.get(id); }
    }

    public enum ChangePageType {
        FORWARD(0),
        BACK(1),
        SPECIFIC(2);

        private final long id;
        ChangePageType(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, ChangePageType> byId = new HashMap<Long, ChangePageType>(3);
        static {
            for (ChangePageType e : ChangePageType.values())
                byId.put(e.id(), e);
        }
        public static ChangePageType byId(long id) { return byId.get(id); }
    }

    public enum CompareType {
        NONE(0),
        ITEM_QUANTITY(1),
        GOLD_QUANTITY(2),
        STRENGTH(3),
        MAGIC(4),
        LEVEL(5),
        COUNTER(6);

        private final long id;
        CompareType(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, CompareType> byId = new HashMap<Long, CompareType>(7);
        static {
            for (CompareType e : CompareType.values())
                byId.put(e.id(), e);
        }
        public static CompareType byId(long id) { return byId.get(id); }
    }

    public enum ComparisonType {
        EQUALS(0),
        NOT_EQUALS(1),
        GREATER_THAN(2),
        LESS_THAN(3);

        private final long id;
        ComparisonType(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, ComparisonType> byId = new HashMap<Long, ComparisonType>(4);
        static {
            for (ComparisonType e : ComparisonType.values())
                byId.put(e.id(), e);
        }
        public static ComparisonType byId(long id) { return byId.get(id); }
    }

    public enum Ending {
        NORMAL_END(0),
        ENDING_1(1),
        ENDING_2(2),
        ENDING_3(3);

        private final long id;
        Ending(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, Ending> byId = new HashMap<Long, Ending>(4);
        static {
            for (Ending e : Ending.values())
                byId.put(e.id(), e);
        }
        public static Ending byId(long id) { return byId.get(id); }
    }

    public enum OperationType {
        DISPLAY_MESSAGE(0),
        DISPLAY_FORMATTED_MESSAGE(1),
        ACTIVATE_NPC(20),
        ACTIVATE_ENEMY(21),
        ACTIVATE_ITEM(22),
        SHOP_OPEN(23),
        WARP_NPC(25),
        WARP_ENEMY(26),
        TERMINATE_NPC(27),
        TERMINATE_ENEMY(28),
        SCREEN_EFFECT_START(40),
        SCREEN_EFFECT_END(41),
        DISPLAY_BMP(42),
        DISPLAY_MOVIE(43),
        PLAY_SOUND_EFFECT(44),
        CHANGE_BGM(45),
        BGM_PLAYBACK(46),
        WARP_PLAYER_DETAILED(60),
        WARP_PLAYER_BASIC(61),
        CHANGE_PLAYER_PARAMETER(80),
        CHANGE_PLAYER_STATUS(81),
        LEARN_MAGIC(82),
        RECOVER_ALL(83),
        SET_PLAYER_PARAMETER_IN_COUNTER(84),
        OBJECT_ANIMATION(100),
        DISPLAY_OBJECT(101),
        MOVE_OBJECT(102),
        CHANGE_DASH_OR_SAVE_TEMPORARILY(120),
        SAVE_POINT(121),
        END_GAME(122),
        IF_COUNTER(140),
        IF_PROMPT(141),
        OTHERWISE(142),
        END_IF(143),
        CHANGE_COUNTER(144),
        CHANGE_PAGE(145),
        GENERATE_RANDOM_COUNTER_VALUE(148),
        START_TIMER(149),
        SET_TIMER_VALUE_IN_COUNTER(150),
        END(65535);

        private final long id;
        OperationType(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, OperationType> byId = new HashMap<Long, OperationType>(40);
        static {
            for (OperationType e : OperationType.values())
                byId.put(e.id(), e);
        }
        public static OperationType byId(long id) { return byId.get(id); }
    }

    public enum Playback {
        STOP(0),
        PLAY(1);

        private final long id;
        Playback(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, Playback> byId = new HashMap<Long, Playback>(2);
        static {
            for (Playback e : Playback.values())
                byId.put(e.id(), e);
        }
        public static Playback byId(long id) { return byId.get(id); }
    }

    public enum PlayerParameter {
        HP(0),
        MP(1),
        STRENGTH(2),
        MAGIC(3),
        ITEM_QUANTITY(4),
        GOLD(5),
        LEVEL(6);

        private final long id;
        PlayerParameter(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, PlayerParameter> byId = new HashMap<Long, PlayerParameter>(7);
        static {
            for (PlayerParameter e : PlayerParameter.values())
                byId.put(e.id(), e);
        }
        public static PlayerParameter byId(long id) { return byId.get(id); }
    }

    public enum PlayerStatus {
        POISON(0),
        PARALYZE(1),
        DARK(2),
        CURSE(3),
        SLOW(4);

        private final long id;
        PlayerStatus(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, PlayerStatus> byId = new HashMap<Long, PlayerStatus>(5);
        static {
            for (PlayerStatus e : PlayerStatus.values())
                byId.put(e.id(), e);
        }
        public static PlayerStatus byId(long id) { return byId.get(id); }
    }

    public enum ScreenEffect {
        BLACK_FADES_OFF(0),
        BLACK_FADES_ON(1),
        WHITE_FADES_OFF(2),
        WHITE_FADES_ON(3),
        RED(4),
        GREEN(5),
        BLUE(6),
        NONE(255);

        private final long id;
        ScreenEffect(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, ScreenEffect> byId = new HashMap<Long, ScreenEffect>(8);
        static {
            for (ScreenEffect e : ScreenEffect.values())
                byId.put(e.id(), e);
        }
        public static ScreenEffect byId(long id) { return byId.get(id); }
    }

    public enum TargetType {
        NPC(0),
        ENEMY(1),
        OBJECT(2),
        SYSTEM(254),
        NONE(255);

        private final long id;
        TargetType(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, TargetType> byId = new HashMap<Long, TargetType>(5);
        static {
            for (TargetType e : TargetType.values())
                byId.put(e.id(), e);
        }
        public static TargetType byId(long id) { return byId.get(id); }
    }

    public enum TemporarilyChangeTarget {
        DASH(0),
        SAVE(1);

        private final long id;
        TemporarilyChangeTarget(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, TemporarilyChangeTarget> byId = new HashMap<Long, TemporarilyChangeTarget>(2);
        static {
            for (TemporarilyChangeTarget e : TemporarilyChangeTarget.values())
                byId.put(e.id(), e);
        }
        public static TemporarilyChangeTarget byId(long id) { return byId.get(id); }
    }

    public enum TriggerType {
        NONE(0),
        EXAMINE(1),
        USE_ITEM(2),
        APPROACH_SQUARE(4),
        APPROACH_CIRCLE(8),
        DEATH_ENEMY_OR_NPC(16),
        ALWAYS_ON(32),
        USE_ITEM_ANYWHERE(64),
        PLAYER_DEATH(255);

        private final long id;
        TriggerType(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, TriggerType> byId = new HashMap<Long, TriggerType>(9);
        static {
            for (TriggerType e : TriggerType.values())
                byId.put(e.id(), e);
        }
        public static TriggerType byId(long id) { return byId.get(id); }
    }

    public enum WayChanged {
        SET_TO(0),
        INCREMENT_BY(1),
        DECREMENT_BY(2),
        COUNTER(3);

        private final long id;
        WayChanged(long id) { this.id = id; }
        public long id() { return id; }
        private static final Map<Long, WayChanged> byId = new HashMap<Long, WayChanged>(4);
        static {
            for (WayChanged e : WayChanged.values())
                byId.put(e.id(), e);
        }
        public static WayChanged byId(long id) { return byId.get(id); }
    }

    public Evt(KaitaiStream _io) {
        this(_io, null, null);
    }

    public Evt(KaitaiStream _io, KaitaiStruct _parent) {
        this(_io, _parent, null);
    }

    public Evt(KaitaiStream _io, KaitaiStruct _parent, Evt _root) {
        super(_io);
        this._parent = _parent;
        this._root = _root == null ? this : _root;
        _read();
    }
    private void _read() {
        this.magic = this._io.readBytes(4);
        if (!(Arrays.equals(this.magic, new byte[] { 0, 4, 0, 0 }))) {
            throw new KaitaiStream.ValidationNotEqualError(new byte[] { 0, 4, 0, 0 }, this.magic, this._io, "/seq/0");
        }
        this.definition = new ArrayList<EvtDefinition>();
        for (int i = 0; i < 251; i++) {
            this.definition.add(new EvtDefinition(this._io, this, _root));
        }
    }

    public void _fetchInstances() {
        for (int i = 0; i < this.definition.size(); i++) {
            this.definition.get(((Number) (i)).intValue())._fetchInstances();
        }
    }
    public static class ActivateEnemy extends KaitaiStruct {
        public static ActivateEnemy fromFile(String fileName) throws IOException {
            return new ActivateEnemy(new ByteBufferKaitaiStream(fileName));
        }

        public ActivateEnemy(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActivateEnemy(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public ActivateEnemy(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.enemyId = this._io.readU2le();
        }

        public void _fetchInstances() {
        }
        private int enemyId;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public int enemyId() { return enemyId; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class ActivateItem extends KaitaiStruct {
        public static ActivateItem fromFile(String fileName) throws IOException {
            return new ActivateItem(new ByteBufferKaitaiStream(fileName));
        }

        public ActivateItem(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActivateItem(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public ActivateItem(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.itemId = this._io.readU2le();
        }

        public void _fetchInstances() {
        }
        private int itemId;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public int itemId() { return itemId; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class ActivateNpc extends KaitaiStruct {
        public static ActivateNpc fromFile(String fileName) throws IOException {
            return new ActivateNpc(new ByteBufferKaitaiStream(fileName));
        }

        public ActivateNpc(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ActivateNpc(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public ActivateNpc(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.npcId = this._io.readU2le();
        }

        public void _fetchInstances() {
        }
        private int npcId;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public int npcId() { return npcId; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class BgmPlayback extends KaitaiStruct {
        public static BgmPlayback fromFile(String fileName) throws IOException {
            return new BgmPlayback(new ByteBufferKaitaiStream(fileName));
        }

        public BgmPlayback(KaitaiStream _io) {
            this(_io, null, null);
        }

        public BgmPlayback(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public BgmPlayback(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.playback = Evt.Playback.byId(this._io.readU1());
        }

        public void _fetchInstances() {
        }
        private Playback playback;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public Playback playback() { return playback; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class ChangeBgm extends KaitaiStruct {
        public static ChangeBgm fromFile(String fileName) throws IOException {
            return new ChangeBgm(new ByteBufferKaitaiStream(fileName));
        }

        public ChangeBgm(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ChangeBgm(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public ChangeBgm(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.loopFlag = this._io.readU2le();
            this.padding = this._io.readU2le();
            this.filename = new String(this._io.readBytesTerm((byte) 0, false, true, true), StandardCharsets.UTF_8);
        }

        public void _fetchInstances() {
        }
        private Boolean loop;
        public Boolean loop() {
            if (this.loop != null)
                return this.loop;
            this.loop = loopFlag() != 0;
            return this.loop;
        }
        private int loopFlag;
        private int padding;
        private String filename;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public int loopFlag() { return loopFlag; }
        public int padding() { return padding; }
        public String filename() { return filename; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class ChangeCounter extends KaitaiStruct {
        public static ChangeCounter fromFile(String fileName) throws IOException {
            return new ChangeCounter(new ByteBufferKaitaiStream(fileName));
        }

        public ChangeCounter(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ChangeCounter(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public ChangeCounter(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.id = this._io.readU2le();
            this.value = this._io.readU2le();
            this.valueIsCounterIdFlag = this._io.readU1();
            this.wayChanged = Evt.WayChanged.byId(this._io.readU1());
        }

        public void _fetchInstances() {
        }
        private Boolean valueIsCounterId;
        public Boolean valueIsCounterId() {
            if (this.valueIsCounterId != null)
                return this.valueIsCounterId;
            this.valueIsCounterId = valueIsCounterIdFlag() != 0;
            return this.valueIsCounterId;
        }
        private int id;
        private int value;
        private int valueIsCounterIdFlag;
        private WayChanged wayChanged;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public int id() { return id; }
        public int value() { return value; }
        public int valueIsCounterIdFlag() { return valueIsCounterIdFlag; }
        public WayChanged wayChanged() { return wayChanged; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class ChangeDashOrSaveTemporarily extends KaitaiStruct {
        public static ChangeDashOrSaveTemporarily fromFile(String fileName) throws IOException {
            return new ChangeDashOrSaveTemporarily(new ByteBufferKaitaiStream(fileName));
        }

        public ChangeDashOrSaveTemporarily(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ChangeDashOrSaveTemporarily(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public ChangeDashOrSaveTemporarily(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.target = Evt.TemporarilyChangeTarget.byId(this._io.readU1());
            this.enabled = this._io.readBitsIntLe(1) != 0;
        }

        public void _fetchInstances() {
        }
        private TemporarilyChangeTarget target;
        private boolean enabled;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public TemporarilyChangeTarget target() { return target; }
        public boolean enabled() { return enabled; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class ChangePage extends KaitaiStruct {
        public static ChangePage fromFile(String fileName) throws IOException {
            return new ChangePage(new ByteBufferKaitaiStream(fileName));
        }

        public ChangePage(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ChangePage(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public ChangePage(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.target = this._io.readU2le();
            this.changePageType = Evt.ChangePageType.byId(this._io.readU1());
            this.value = this._io.readU1();
        }

        public void _fetchInstances() {
        }
        private Integer changeToPage;
        public Integer changeToPage() {
            if (this.changeToPage != null)
                return this.changeToPage;
            if (changePageType() == Evt.ChangePageType.SPECIFIC) {
                this.changeToPage = ((Number) (value())).intValue();
            }
            return this.changeToPage;
        }
        private int target;
        private ChangePageType changePageType;
        private int value;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public int target() { return target; }
        public ChangePageType changePageType() { return changePageType; }
        public int value() { return value; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class ChangePlayerParameter extends KaitaiStruct {
        public static ChangePlayerParameter fromFile(String fileName) throws IOException {
            return new ChangePlayerParameter(new ByteBufferKaitaiStream(fileName));
        }

        public ChangePlayerParameter(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ChangePlayerParameter(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public ChangePlayerParameter(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.parameter = Evt.PlayerParameter.byId(this._io.readU1());
            this.wayChanged = Evt.WayChanged.byId(this._io.readU1());
            this.itemId = this._io.readU2le();
            this.padding = this._io.readU2le();
            this.value = this._io.readU2le();
        }

        public void _fetchInstances() {
        }
        private PlayerParameter parameter;
        private WayChanged wayChanged;
        private int itemId;
        private int padding;
        private int value;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public PlayerParameter parameter() { return parameter; }
        public WayChanged wayChanged() { return wayChanged; }
        public int itemId() { return itemId; }
        public int padding() { return padding; }
        public int value() { return value; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class ChangePlayerStatus extends KaitaiStruct {
        public static ChangePlayerStatus fromFile(String fileName) throws IOException {
            return new ChangePlayerStatus(new ByteBufferKaitaiStream(fileName));
        }

        public ChangePlayerStatus(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ChangePlayerStatus(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public ChangePlayerStatus(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.status = Evt.PlayerStatus.byId(this._io.readU1());
            this.enabled = this._io.readBitsIntLe(1) != 0;
        }

        public void _fetchInstances() {
        }
        private PlayerStatus status;
        private boolean enabled;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public PlayerStatus status() { return status; }
        public boolean enabled() { return enabled; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class DisplayBmp extends KaitaiStruct {
        public static DisplayBmp fromFile(String fileName) throws IOException {
            return new DisplayBmp(new ByteBufferKaitaiStream(fileName));
        }

        public DisplayBmp(KaitaiStream _io) {
            this(_io, null, null);
        }

        public DisplayBmp(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public DisplayBmp(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.displayOption = Evt.BmpDisplayOptions.byId(this._io.readU1());
            this.duration = this._io.readU1();
            this.padding = this._io.readU2le();
            this.filename = new String(this._io.readBytesTerm((byte) 0, false, true, true), StandardCharsets.UTF_8);
        }

        public void _fetchInstances() {
        }
        private BmpDisplayOptions displayOption;
        private int duration;
        private int padding;
        private String filename;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public BmpDisplayOptions displayOption() { return displayOption; }
        public int duration() { return duration; }
        public int padding() { return padding; }
        public String filename() { return filename; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class DisplayFormattedMessage extends KaitaiStruct {
        public static DisplayFormattedMessage fromFile(String fileName) throws IOException {
            return new DisplayFormattedMessage(new ByteBufferKaitaiStream(fileName));
        }

        public DisplayFormattedMessage(KaitaiStream _io) {
            this(_io, null, null);
        }

        public DisplayFormattedMessage(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public DisplayFormattedMessage(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.red = this._io.readU1();
            this.green = this._io.readU1();
            this.blue = this._io.readU1();
            this.alpha = this._io.readU1();
            this.fontWeight = this._io.readU2le();
            this.padding = this._io.readU2le();
            this.text = new String(this._io.readBytesTerm((byte) 0, false, true, true), StandardCharsets.UTF_8);
            this.font = new String(this._io.readBytesTerm((byte) 0, false, true, true), StandardCharsets.UTF_8);
        }

        public void _fetchInstances() {
        }
        private int red;
        private int green;
        private int blue;
        private int alpha;
        private int fontWeight;
        private int padding;
        private String text;
        private String font;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public int red() { return red; }
        public int green() { return green; }
        public int blue() { return blue; }
        public int alpha() { return alpha; }
        public int fontWeight() { return fontWeight; }
        public int padding() { return padding; }
        public String text() { return text; }
        public String font() { return font; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class DisplayMessage extends KaitaiStruct {
        public static DisplayMessage fromFile(String fileName) throws IOException {
            return new DisplayMessage(new ByteBufferKaitaiStream(fileName));
        }

        public DisplayMessage(KaitaiStream _io) {
            this(_io, null, null);
        }

        public DisplayMessage(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public DisplayMessage(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.text = new String(this._io.readBytesTerm((byte) 0, false, true, true), StandardCharsets.UTF_8);
        }

        public void _fetchInstances() {
        }
        private String text;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public String text() { return text; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class DisplayMovie extends KaitaiStruct {
        public static DisplayMovie fromFile(String fileName) throws IOException {
            return new DisplayMovie(new ByteBufferKaitaiStream(fileName));
        }

        public DisplayMovie(KaitaiStream _io) {
            this(_io, null, null);
        }

        public DisplayMovie(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public DisplayMovie(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.filename = new String(this._io.readBytesTerm((byte) 0, false, true, true), StandardCharsets.UTF_8);
        }

        public void _fetchInstances() {
        }
        private String filename;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public String filename() { return filename; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class DisplayObject extends KaitaiStruct {
        public static DisplayObject fromFile(String fileName) throws IOException {
            return new DisplayObject(new ByteBufferKaitaiStream(fileName));
        }

        public DisplayObject(KaitaiStream _io) {
            this(_io, null, null);
        }

        public DisplayObject(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public DisplayObject(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.id = this._io.readU2le();
            this.display = this._io.readBitsIntLe(1) != 0;
        }

        public void _fetchInstances() {
        }
        private int id;
        private boolean display;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public int id() { return id; }
        public boolean display() { return display; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class EndGame extends KaitaiStruct {
        public static EndGame fromFile(String fileName) throws IOException {
            return new EndGame(new ByteBufferKaitaiStream(fileName));
        }

        public EndGame(KaitaiStream _io) {
            this(_io, null, null);
        }

        public EndGame(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public EndGame(KaitaiStream _io, KaitaiStruct _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.ending = Evt.Ending.byId(this._io.readU1());
        }

        public void _fetchInstances() {
        }
        private Ending ending;
        private Evt _root;
        private KaitaiStruct _parent;
        public Ending ending() { return ending; }
        public Evt _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class EvtCondition extends KaitaiStruct {
        public static EvtCondition fromFile(String fileName) throws IOException {
            return new EvtCondition(new ByteBufferKaitaiStream(fileName));
        }

        public EvtCondition(KaitaiStream _io) {
            this(_io, null, null);
        }

        public EvtCondition(KaitaiStream _io, KaitaiStruct _parent) {
            this(_io, _parent, null);
        }

        public EvtCondition(KaitaiStream _io, KaitaiStruct _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.compareType = Evt.CompareType.byId(this._io.readU2le());
            this.compareId = this._io.readU2le();
            this.comparedValue = this._io.readU2le();
            this.comparison = Evt.ComparisonType.byId(this._io.readU2le());
        }

        public void _fetchInstances() {
        }
        private CompareType compareType;
        private int compareId;
        private int comparedValue;
        private ComparisonType comparison;
        private Evt _root;
        private KaitaiStruct _parent;
        public CompareType compareType() { return compareType; }
        public int compareId() { return compareId; }
        public int comparedValue() { return comparedValue; }
        public ComparisonType comparison() { return comparison; }
        public Evt _root() { return _root; }
        public KaitaiStruct _parent() { return _parent; }
    }
    public static class EvtDefinition extends KaitaiStruct {
        public static EvtDefinition fromFile(String fileName) throws IOException {
            return new EvtDefinition(new ByteBufferKaitaiStream(fileName));
        }

        public EvtDefinition(KaitaiStream _io) {
            this(_io, null, null);
        }

        public EvtDefinition(KaitaiStream _io, Evt _parent) {
            this(_io, _parent, null);
        }

        public EvtDefinition(KaitaiStream _io, Evt _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.name = new String(this._io.readBytes(31), StandardCharsets.UTF_8);
            this.targetType = Evt.TargetType.byId(this._io.readU1());
            this.targetId = this._io.readU2le();
            this.triggerType = Evt.TriggerType.byId(this._io.readU1());
            this.triggerItem = this._io.readU1();
            this.triggerCone = this._io.readU2le();
            this.padding = this._io.readU2le();
            this.triggerRectWidth = this._io.readF4le();
            this.triggerRectHeight = this._io.readF4le();
            this.triggerRadius = this._io.readF4le();
            this.condition = new EvtCondition(this._io, this, _root);
            this.page = new ArrayList<EvtPageOffset>();
            for (int i = 0; i < 16; i++) {
                this.page.add(new EvtPageOffset(this._io, this, _root));
            }
        }

        public void _fetchInstances() {
            this.condition._fetchInstances();
            for (int i = 0; i < this.page.size(); i++) {
                this.page.get(((Number) (i)).intValue())._fetchInstances();
            }
        }
        private String name;
        private TargetType targetType;
        private int targetId;
        private TriggerType triggerType;
        private int triggerItem;
        private int triggerCone;
        private int padding;
        private float triggerRectWidth;
        private float triggerRectHeight;
        private float triggerRadius;
        private EvtCondition condition;
        private List<EvtPageOffset> page;
        private Evt _root;
        private Evt _parent;
        public String name() { return name; }
        public TargetType targetType() { return targetType; }
        public int targetId() { return targetId; }
        public TriggerType triggerType() { return triggerType; }
        public int triggerItem() { return triggerItem; }
        public int triggerCone() { return triggerCone; }
        public int padding() { return padding; }
        public float triggerRectWidth() { return triggerRectWidth; }
        public float triggerRectHeight() { return triggerRectHeight; }
        public float triggerRadius() { return triggerRadius; }
        public EvtCondition condition() { return condition; }
        public List<EvtPageOffset> page() { return page; }
        public Evt _root() { return _root; }
        public Evt _parent() { return _parent; }
    }
    public static class EvtOperation extends KaitaiStruct {
        public static EvtOperation fromFile(String fileName) throws IOException {
            return new EvtOperation(new ByteBufferKaitaiStream(fileName));
        }

        public EvtOperation(KaitaiStream _io) {
            this(_io, null, null);
        }

        public EvtOperation(KaitaiStream _io, Evt.EvtPageOffset _parent) {
            this(_io, _parent, null);
        }

        public EvtOperation(KaitaiStream _io, Evt.EvtPageOffset _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.opId = Evt.OperationType.byId(this._io.readU2le());
            this.opSize = this._io.readU2le();
            {
                OperationType on = opId();
                if (on != null) {
                    switch (opId()) {
                    case ACTIVATE_ENEMY: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new ActivateEnemy(_io_operation, this, _root);
                        break;
                    }
                    case ACTIVATE_ITEM: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new ActivateItem(_io_operation, this, _root);
                        break;
                    }
                    case ACTIVATE_NPC: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new ActivateNpc(_io_operation, this, _root);
                        break;
                    }
                    case BGM_PLAYBACK: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new BgmPlayback(_io_operation, this, _root);
                        break;
                    }
                    case CHANGE_BGM: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new ChangeBgm(_io_operation, this, _root);
                        break;
                    }
                    case CHANGE_COUNTER: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new ChangeCounter(_io_operation, this, _root);
                        break;
                    }
                    case CHANGE_DASH_OR_SAVE_TEMPORARILY: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new ChangeDashOrSaveTemporarily(_io_operation, this, _root);
                        break;
                    }
                    case CHANGE_PAGE: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new ChangePage(_io_operation, this, _root);
                        break;
                    }
                    case CHANGE_PLAYER_PARAMETER: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new ChangePlayerParameter(_io_operation, this, _root);
                        break;
                    }
                    case CHANGE_PLAYER_STATUS: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new ChangePlayerStatus(_io_operation, this, _root);
                        break;
                    }
                    case DISPLAY_BMP: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new DisplayBmp(_io_operation, this, _root);
                        break;
                    }
                    case DISPLAY_FORMATTED_MESSAGE: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new DisplayFormattedMessage(_io_operation, this, _root);
                        break;
                    }
                    case DISPLAY_MESSAGE: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new DisplayMessage(_io_operation, this, _root);
                        break;
                    }
                    case DISPLAY_MOVIE: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new DisplayMovie(_io_operation, this, _root);
                        break;
                    }
                    case DISPLAY_OBJECT: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new DisplayObject(_io_operation, this, _root);
                        break;
                    }
                    case GENERATE_RANDOM_COUNTER_VALUE: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new GenerateRandomCounterValue(_io_operation, this, _root);
                        break;
                    }
                    case IF_COUNTER: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new IfCounter(_io_operation, this, _root);
                        break;
                    }
                    case IF_PROMPT: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new IfPrompt(_io_operation, this, _root);
                        break;
                    }
                    case LEARN_MAGIC: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new LearnMagic(_io_operation, this, _root);
                        break;
                    }
                    case MOVE_OBJECT: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new MoveObject(_io_operation, this, _root);
                        break;
                    }
                    case OBJECT_ANIMATION: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new ObjectAnimation(_io_operation, this, _root);
                        break;
                    }
                    case PLAY_SOUND_EFFECT: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new PlaySoundEffect(_io_operation, this, _root);
                        break;
                    }
                    case SCREEN_EFFECT_START: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new ScreenEffectStart(_io_operation, this, _root);
                        break;
                    }
                    case SET_PLAYER_PARAMETER_IN_COUNTER: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new SetPlayerParameterInCounter(_io_operation, this, _root);
                        break;
                    }
                    case SET_TIMER_VALUE_IN_COUNTER: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new SetTimerValueInCounter(_io_operation, this, _root);
                        break;
                    }
                    case SHOP_OPEN: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new ShopOpen(_io_operation, this, _root);
                        break;
                    }
                    case START_TIMER: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new StartTimer(_io_operation, this, _root);
                        break;
                    }
                    case TERMINATE_ENEMY: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new TerminateEnemy(_io_operation, this, _root);
                        break;
                    }
                    case TERMINATE_NPC: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new TerminateNpc(_io_operation, this, _root);
                        break;
                    }
                    case WARP_ENEMY: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new WarpEnemy(_io_operation, this, _root);
                        break;
                    }
                    case WARP_NPC: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new WarpNpc(_io_operation, this, _root);
                        break;
                    }
                    case WARP_PLAYER_BASIC: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new WarpPlayerBasic(_io_operation, this, _root);
                        break;
                    }
                    case WARP_PLAYER_DETAILED: {
                        KaitaiStream _io_operation = this._io.substream(opSize() - 4);
                        this.operation = new WarpPlayerDetailed(_io_operation, this, _root);
                        break;
                    }
                    default: {
                        this.operation = this._io.readBytes(opSize() - 4);
                        break;
                    }
                    }
                } else {
                    this.operation = this._io.readBytes(opSize() - 4);
                }
            }
        }

        public void _fetchInstances() {
            {
                OperationType on = opId();
                if (on != null) {
                    switch (opId()) {
                    case ACTIVATE_ENEMY: {
                        ((ActivateEnemy) (this.operation))._fetchInstances();
                        break;
                    }
                    case ACTIVATE_ITEM: {
                        ((ActivateItem) (this.operation))._fetchInstances();
                        break;
                    }
                    case ACTIVATE_NPC: {
                        ((ActivateNpc) (this.operation))._fetchInstances();
                        break;
                    }
                    case BGM_PLAYBACK: {
                        ((BgmPlayback) (this.operation))._fetchInstances();
                        break;
                    }
                    case CHANGE_BGM: {
                        ((ChangeBgm) (this.operation))._fetchInstances();
                        break;
                    }
                    case CHANGE_COUNTER: {
                        ((ChangeCounter) (this.operation))._fetchInstances();
                        break;
                    }
                    case CHANGE_DASH_OR_SAVE_TEMPORARILY: {
                        ((ChangeDashOrSaveTemporarily) (this.operation))._fetchInstances();
                        break;
                    }
                    case CHANGE_PAGE: {
                        ((ChangePage) (this.operation))._fetchInstances();
                        break;
                    }
                    case CHANGE_PLAYER_PARAMETER: {
                        ((ChangePlayerParameter) (this.operation))._fetchInstances();
                        break;
                    }
                    case CHANGE_PLAYER_STATUS: {
                        ((ChangePlayerStatus) (this.operation))._fetchInstances();
                        break;
                    }
                    case DISPLAY_BMP: {
                        ((DisplayBmp) (this.operation))._fetchInstances();
                        break;
                    }
                    case DISPLAY_FORMATTED_MESSAGE: {
                        ((DisplayFormattedMessage) (this.operation))._fetchInstances();
                        break;
                    }
                    case DISPLAY_MESSAGE: {
                        ((DisplayMessage) (this.operation))._fetchInstances();
                        break;
                    }
                    case DISPLAY_MOVIE: {
                        ((DisplayMovie) (this.operation))._fetchInstances();
                        break;
                    }
                    case DISPLAY_OBJECT: {
                        ((DisplayObject) (this.operation))._fetchInstances();
                        break;
                    }
                    case GENERATE_RANDOM_COUNTER_VALUE: {
                        ((GenerateRandomCounterValue) (this.operation))._fetchInstances();
                        break;
                    }
                    case IF_COUNTER: {
                        ((IfCounter) (this.operation))._fetchInstances();
                        break;
                    }
                    case IF_PROMPT: {
                        ((IfPrompt) (this.operation))._fetchInstances();
                        break;
                    }
                    case LEARN_MAGIC: {
                        ((LearnMagic) (this.operation))._fetchInstances();
                        break;
                    }
                    case MOVE_OBJECT: {
                        ((MoveObject) (this.operation))._fetchInstances();
                        break;
                    }
                    case OBJECT_ANIMATION: {
                        ((ObjectAnimation) (this.operation))._fetchInstances();
                        break;
                    }
                    case PLAY_SOUND_EFFECT: {
                        ((PlaySoundEffect) (this.operation))._fetchInstances();
                        break;
                    }
                    case SCREEN_EFFECT_START: {
                        ((ScreenEffectStart) (this.operation))._fetchInstances();
                        break;
                    }
                    case SET_PLAYER_PARAMETER_IN_COUNTER: {
                        ((SetPlayerParameterInCounter) (this.operation))._fetchInstances();
                        break;
                    }
                    case SET_TIMER_VALUE_IN_COUNTER: {
                        ((SetTimerValueInCounter) (this.operation))._fetchInstances();
                        break;
                    }
                    case SHOP_OPEN: {
                        ((ShopOpen) (this.operation))._fetchInstances();
                        break;
                    }
                    case START_TIMER: {
                        ((StartTimer) (this.operation))._fetchInstances();
                        break;
                    }
                    case TERMINATE_ENEMY: {
                        ((TerminateEnemy) (this.operation))._fetchInstances();
                        break;
                    }
                    case TERMINATE_NPC: {
                        ((TerminateNpc) (this.operation))._fetchInstances();
                        break;
                    }
                    case WARP_ENEMY: {
                        ((WarpEnemy) (this.operation))._fetchInstances();
                        break;
                    }
                    case WARP_NPC: {
                        ((WarpNpc) (this.operation))._fetchInstances();
                        break;
                    }
                    case WARP_PLAYER_BASIC: {
                        ((WarpPlayerBasic) (this.operation))._fetchInstances();
                        break;
                    }
                    case WARP_PLAYER_DETAILED: {
                        ((WarpPlayerDetailed) (this.operation))._fetchInstances();
                        break;
                    }
                    default: {
                        break;
                    }
                    }
                } else {
                }
            }
        }
        private OperationType opId;
        private int opSize;
        private Object operation;
        private Evt _root;
        private Evt.EvtPageOffset _parent;
        public OperationType opId() { return opId; }
        public int opSize() { return opSize; }
        public Object operation() { return operation; }
        public Evt _root() { return _root; }
        public Evt.EvtPageOffset _parent() { return _parent; }
    }
    public static class EvtPageOffset extends KaitaiStruct {
        public static EvtPageOffset fromFile(String fileName) throws IOException {
            return new EvtPageOffset(new ByteBufferKaitaiStream(fileName));
        }

        public EvtPageOffset(KaitaiStream _io) {
            this(_io, null, null);
        }

        public EvtPageOffset(KaitaiStream _io, Evt.EvtDefinition _parent) {
            this(_io, _parent, null);
        }

        public EvtPageOffset(KaitaiStream _io, Evt.EvtDefinition _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.payloadOffset = this._io.readU4le();
            this.condition = new EvtCondition(this._io, this, _root);
        }

        public void _fetchInstances() {
            this.condition._fetchInstances();
            body();
            if (this.body != null) {
                for (int i = 0; i < this.body.size(); i++) {
                    this.body.get(((Number) (i)).intValue())._fetchInstances();
                }
            }
        }
        private List<EvtOperation> body;
        public List<EvtOperation> body() {
            if (this.body != null)
                return this.body;
            if (payloadOffset() > 0) {
                KaitaiStream io = _root()._io();
                long _pos = io.pos();
                io.seek(payloadOffset());
                this.body = new ArrayList<EvtOperation>();
                {
                    EvtOperation _it;
                    int i = 0;
                    do {
                        _it = new EvtOperation(io, this, _root);
                        this.body.add(_it);
                        i++;
                    } while (!(_it.opId() == Evt.OperationType.END));
                }
                io.seek(_pos);
            }
            return this.body;
        }
        private long payloadOffset;
        private EvtCondition condition;
        private Evt _root;
        private Evt.EvtDefinition _parent;
        public long payloadOffset() { return payloadOffset; }
        public EvtCondition condition() { return condition; }
        public Evt _root() { return _root; }
        public Evt.EvtDefinition _parent() { return _parent; }
    }
    public static class GenerateRandomCounterValue extends KaitaiStruct {
        public static GenerateRandomCounterValue fromFile(String fileName) throws IOException {
            return new GenerateRandomCounterValue(new ByteBufferKaitaiStream(fileName));
        }

        public GenerateRandomCounterValue(KaitaiStream _io) {
            this(_io, null, null);
        }

        public GenerateRandomCounterValue(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public GenerateRandomCounterValue(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.useCounterForMaxValueFlag = this._io.readU1();
            this.padding = this._io.readU2le();
            this.maxValue = this._io.readU2le();
            this.id = this._io.readU2le();
        }

        public void _fetchInstances() {
        }
        private Boolean useCounterForMaxValue;
        public Boolean useCounterForMaxValue() {
            if (this.useCounterForMaxValue != null)
                return this.useCounterForMaxValue;
            this.useCounterForMaxValue = useCounterForMaxValueFlag() != 0;
            return this.useCounterForMaxValue;
        }
        private int useCounterForMaxValueFlag;
        private int padding;
        private int maxValue;
        private int id;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public int useCounterForMaxValueFlag() { return useCounterForMaxValueFlag; }
        public int padding() { return padding; }
        public int maxValue() { return maxValue; }
        public int id() { return id; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class IfCounter extends KaitaiStruct {
        public static IfCounter fromFile(String fileName) throws IOException {
            return new IfCounter(new ByteBufferKaitaiStream(fileName));
        }

        public IfCounter(KaitaiStream _io) {
            this(_io, null, null);
        }

        public IfCounter(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public IfCounter(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.id = this._io.readU2le();
            this.value = this._io.readU2le();
            this.valueIsCounterIdFlag = this._io.readU1();
            this.comparisonType = Evt.ComparisonType.byId(this._io.readU1());
        }

        public void _fetchInstances() {
        }
        private Boolean valueIsCounterId;
        public Boolean valueIsCounterId() {
            if (this.valueIsCounterId != null)
                return this.valueIsCounterId;
            this.valueIsCounterId = valueIsCounterIdFlag() != 0;
            return this.valueIsCounterId;
        }
        private int id;
        private int value;
        private int valueIsCounterIdFlag;
        private ComparisonType comparisonType;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public int id() { return id; }
        public int value() { return value; }
        public int valueIsCounterIdFlag() { return valueIsCounterIdFlag; }
        public ComparisonType comparisonType() { return comparisonType; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class IfPrompt extends KaitaiStruct {
        public static IfPrompt fromFile(String fileName) throws IOException {
            return new IfPrompt(new ByteBufferKaitaiStream(fileName));
        }

        public IfPrompt(KaitaiStream _io) {
            this(_io, null, null);
        }

        public IfPrompt(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public IfPrompt(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.text = new String(this._io.readBytesTerm((byte) 0, false, true, true), StandardCharsets.UTF_8);
            this.option1 = new String(this._io.readBytesTerm((byte) 0, false, true, true), StandardCharsets.UTF_8);
            this.option2 = new String(this._io.readBytesTerm((byte) 0, false, true, true), StandardCharsets.UTF_8);
        }

        public void _fetchInstances() {
        }
        private String text;
        private String option1;
        private String option2;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public String text() { return text; }
        public String option1() { return option1; }
        public String option2() { return option2; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class LearnMagic extends KaitaiStruct {
        public static LearnMagic fromFile(String fileName) throws IOException {
            return new LearnMagic(new ByteBufferKaitaiStream(fileName));
        }

        public LearnMagic(KaitaiStream _io) {
            this(_io, null, null);
        }

        public LearnMagic(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public LearnMagic(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.magicTableId = this._io.readU2le();
        }

        public void _fetchInstances() {
        }
        private int magicTableId;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public int magicTableId() { return magicTableId; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class MoveObject extends KaitaiStruct {
        public static MoveObject fromFile(String fileName) throws IOException {
            return new MoveObject(new ByteBufferKaitaiStream(fileName));
        }

        public MoveObject(KaitaiStream _io) {
            this(_io, null, null);
        }

        public MoveObject(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public MoveObject(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.id = this._io.readU2le();
            this.x = this._io.readU1();
            this.z = this._io.readU1();
            this.angleX = this._io.readU2le();
            this.angleY = this._io.readU2le();
            this.angleZ = this._io.readU2le();
            this.moveTime = this._io.readU2le();
            this.fineX = this._io.readF4le();
            this.fineY = this._io.readF4le();
            this.fineZ = this._io.readF4le();
        }

        public void _fetchInstances() {
        }
        private int id;
        private int x;
        private int z;
        private int angleX;
        private int angleY;
        private int angleZ;
        private int moveTime;
        private float fineX;
        private float fineY;
        private float fineZ;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public int id() { return id; }
        public int x() { return x; }
        public int z() { return z; }
        public int angleX() { return angleX; }
        public int angleY() { return angleY; }
        public int angleZ() { return angleZ; }
        public int moveTime() { return moveTime; }
        public float fineX() { return fineX; }
        public float fineY() { return fineY; }
        public float fineZ() { return fineZ; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class ObjectAnimation extends KaitaiStruct {
        public static ObjectAnimation fromFile(String fileName) throws IOException {
            return new ObjectAnimation(new ByteBufferKaitaiStream(fileName));
        }

        public ObjectAnimation(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ObjectAnimation(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public ObjectAnimation(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.id = this._io.readU2le();
            this.playback = Evt.Playback.byId(this._io.readU2le());
        }

        public void _fetchInstances() {
        }
        private int id;
        private Playback playback;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public int id() { return id; }
        public Playback playback() { return playback; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class PlaySoundEffect extends KaitaiStruct {
        public static PlaySoundEffect fromFile(String fileName) throws IOException {
            return new PlaySoundEffect(new ByteBufferKaitaiStream(fileName));
        }

        public PlaySoundEffect(KaitaiStream _io) {
            this(_io, null, null);
        }

        public PlaySoundEffect(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public PlaySoundEffect(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.id = this._io.readU2le();
        }

        public void _fetchInstances() {
        }
        private int id;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public int id() { return id; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class ScreenEffectStart extends KaitaiStruct {
        public static ScreenEffectStart fromFile(String fileName) throws IOException {
            return new ScreenEffectStart(new ByteBufferKaitaiStream(fileName));
        }

        public ScreenEffectStart(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ScreenEffectStart(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public ScreenEffectStart(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.effect = Evt.ScreenEffect.byId(this._io.readU1());
            this.loop = this._io.readBitsIntLe(1) != 0;
        }

        public void _fetchInstances() {
        }
        private ScreenEffect effect;
        private boolean loop;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public ScreenEffect effect() { return effect; }
        public boolean loop() { return loop; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class SetPlayerParameterInCounter extends KaitaiStruct {
        public static SetPlayerParameterInCounter fromFile(String fileName) throws IOException {
            return new SetPlayerParameterInCounter(new ByteBufferKaitaiStream(fileName));
        }

        public SetPlayerParameterInCounter(KaitaiStream _io) {
            this(_io, null, null);
        }

        public SetPlayerParameterInCounter(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public SetPlayerParameterInCounter(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.parameter = Evt.PlayerParameter.byId(this._io.readU1());
            this.itemId = this._io.readU1();
            this.counterId = this._io.readU2le();
        }

        public void _fetchInstances() {
        }
        private PlayerParameter parameter;
        private int itemId;
        private int counterId;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public PlayerParameter parameter() { return parameter; }
        public int itemId() { return itemId; }
        public int counterId() { return counterId; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class SetTimerValueInCounter extends KaitaiStruct {
        public static SetTimerValueInCounter fromFile(String fileName) throws IOException {
            return new SetTimerValueInCounter(new ByteBufferKaitaiStream(fileName));
        }

        public SetTimerValueInCounter(KaitaiStream _io) {
            this(_io, null, null);
        }

        public SetTimerValueInCounter(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public SetTimerValueInCounter(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.id = this._io.readU1();
            this.padding = this._io.readU1();
            this.destinationCounterId = this._io.readU2le();
        }

        public void _fetchInstances() {
        }
        private int id;
        private int padding;
        private int destinationCounterId;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public int id() { return id; }
        public int padding() { return padding; }
        public int destinationCounterId() { return destinationCounterId; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class ShopOpen extends KaitaiStruct {
        public static ShopOpen fromFile(String fileName) throws IOException {
            return new ShopOpen(new ByteBufferKaitaiStream(fileName));
        }

        public ShopOpen(KaitaiStream _io) {
            this(_io, null, null);
        }

        public ShopOpen(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public ShopOpen(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.shopId = this._io.readU2le();
        }

        public void _fetchInstances() {
        }
        private int shopId;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public int shopId() { return shopId; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class StartTimer extends KaitaiStruct {
        public static StartTimer fromFile(String fileName) throws IOException {
            return new StartTimer(new ByteBufferKaitaiStream(fileName));
        }

        public StartTimer(KaitaiStream _io) {
            this(_io, null, null);
        }

        public StartTimer(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public StartTimer(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.id = this._io.readU1();
        }

        public void _fetchInstances() {
        }
        private int id;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public int id() { return id; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class TerminateEnemy extends KaitaiStruct {
        public static TerminateEnemy fromFile(String fileName) throws IOException {
            return new TerminateEnemy(new ByteBufferKaitaiStream(fileName));
        }

        public TerminateEnemy(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TerminateEnemy(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public TerminateEnemy(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.enemyId = this._io.readU2le();
        }

        public void _fetchInstances() {
        }
        private int enemyId;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public int enemyId() { return enemyId; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class TerminateNpc extends KaitaiStruct {
        public static TerminateNpc fromFile(String fileName) throws IOException {
            return new TerminateNpc(new ByteBufferKaitaiStream(fileName));
        }

        public TerminateNpc(KaitaiStream _io) {
            this(_io, null, null);
        }

        public TerminateNpc(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public TerminateNpc(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.npcId = this._io.readU2le();
        }

        public void _fetchInstances() {
        }
        private int npcId;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public int npcId() { return npcId; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class WarpEnemy extends KaitaiStruct {
        public static WarpEnemy fromFile(String fileName) throws IOException {
            return new WarpEnemy(new ByteBufferKaitaiStream(fileName));
        }

        public WarpEnemy(KaitaiStream _io) {
            this(_io, null, null);
        }

        public WarpEnemy(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public WarpEnemy(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.enemyId = this._io.readU2le();
            this.x = this._io.readU1();
            this.z = this._io.readU1();
            this.direction = this._io.readU2le();
            this.padding = this._io.readU2le();
            this.fineX = this._io.readF4le();
            this.fineY = this._io.readF4le();
            this.fineZ = this._io.readF4le();
        }

        public void _fetchInstances() {
        }
        private int enemyId;
        private int x;
        private int z;
        private int direction;
        private int padding;
        private float fineX;
        private float fineY;
        private float fineZ;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public int enemyId() { return enemyId; }
        public int x() { return x; }
        public int z() { return z; }
        public int direction() { return direction; }
        public int padding() { return padding; }
        public float fineX() { return fineX; }
        public float fineY() { return fineY; }
        public float fineZ() { return fineZ; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class WarpNpc extends KaitaiStruct {
        public static WarpNpc fromFile(String fileName) throws IOException {
            return new WarpNpc(new ByteBufferKaitaiStream(fileName));
        }

        public WarpNpc(KaitaiStream _io) {
            this(_io, null, null);
        }

        public WarpNpc(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public WarpNpc(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.npcId = this._io.readU2le();
            this.x = this._io.readU1();
            this.z = this._io.readU1();
            this.direction = this._io.readU2le();
            this.padding = this._io.readU2le();
            this.fineX = this._io.readF4le();
            this.fineY = this._io.readF4le();
            this.fineZ = this._io.readF4le();
        }

        public void _fetchInstances() {
        }
        private int npcId;
        private int x;
        private int z;
        private int direction;
        private int padding;
        private float fineX;
        private float fineY;
        private float fineZ;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public int npcId() { return npcId; }
        public int x() { return x; }
        public int z() { return z; }
        public int direction() { return direction; }
        public int padding() { return padding; }
        public float fineX() { return fineX; }
        public float fineY() { return fineY; }
        public float fineZ() { return fineZ; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class WarpPlayerBasic extends KaitaiStruct {
        public static WarpPlayerBasic fromFile(String fileName) throws IOException {
            return new WarpPlayerBasic(new ByteBufferKaitaiStream(fileName));
        }

        public WarpPlayerBasic(KaitaiStream _io) {
            this(_io, null, null);
        }

        public WarpPlayerBasic(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public WarpPlayerBasic(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.x = this._io.readU1();
            this.z = this._io.readU1();
            this.direction = this._io.readU2le();
            this.fineX = this._io.readF4le();
            this.fineY = this._io.readF4le();
            this.fineZ = this._io.readF4le();
            this.setDirection = this._io.readBitsIntLe(1) != 0;
            this.setFineX = this._io.readBitsIntLe(1) != 0;
            this.setFineY = this._io.readBitsIntLe(1) != 0;
            this.setFineZ = this._io.readBitsIntLe(1) != 0;
        }

        public void _fetchInstances() {
        }
        private int x;
        private int z;
        private int direction;
        private float fineX;
        private float fineY;
        private float fineZ;
        private boolean setDirection;
        private boolean setFineX;
        private boolean setFineY;
        private boolean setFineZ;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public int x() { return x; }
        public int z() { return z; }
        public int direction() { return direction; }
        public float fineX() { return fineX; }
        public float fineY() { return fineY; }
        public float fineZ() { return fineZ; }
        public boolean setDirection() { return setDirection; }
        public boolean setFineX() { return setFineX; }
        public boolean setFineY() { return setFineY; }
        public boolean setFineZ() { return setFineZ; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    public static class WarpPlayerDetailed extends KaitaiStruct {
        public static WarpPlayerDetailed fromFile(String fileName) throws IOException {
            return new WarpPlayerDetailed(new ByteBufferKaitaiStream(fileName));
        }

        public WarpPlayerDetailed(KaitaiStream _io) {
            this(_io, null, null);
        }

        public WarpPlayerDetailed(KaitaiStream _io, Evt.EvtOperation _parent) {
            this(_io, _parent, null);
        }

        public WarpPlayerDetailed(KaitaiStream _io, Evt.EvtOperation _parent, Evt _root) {
            super(_io);
            this._parent = _parent;
            this._root = _root;
            _read();
        }
        private void _read() {
            this.mapId = this._io.readU1();
            this.defaultStartPointFlag = this._io.readU1();
            this.screenEffectOnLeave = Evt.ScreenEffect.byId(this._io.readU1());
            this.screenEffectOnEnter = Evt.ScreenEffect.byId(this._io.readU1());
            this.x = this._io.readU1();
            this.z = this._io.readU1();
            this.direction = this._io.readU2le();
            this.fineX = this._io.readF4le();
            this.fineY = this._io.readF4le();
            this.fineZ = this._io.readF4le();
            this.setDirection = this._io.readBitsIntLe(1) != 0;
            this.setFineX = this._io.readBitsIntLe(1) != 0;
            this.setFineY = this._io.readBitsIntLe(1) != 0;
            this.setFineZ = this._io.readBitsIntLe(1) != 0;
        }

        public void _fetchInstances() {
        }
        private Boolean useDefaultStartPoint;
        public Boolean useDefaultStartPoint() {
            if (this.useDefaultStartPoint != null)
                return this.useDefaultStartPoint;
            this.useDefaultStartPoint = defaultStartPointFlag() != 0;
            return this.useDefaultStartPoint;
        }
        private int mapId;
        private int defaultStartPointFlag;
        private ScreenEffect screenEffectOnLeave;
        private ScreenEffect screenEffectOnEnter;
        private int x;
        private int z;
        private int direction;
        private float fineX;
        private float fineY;
        private float fineZ;
        private boolean setDirection;
        private boolean setFineX;
        private boolean setFineY;
        private boolean setFineZ;
        private Evt _root;
        private Evt.EvtOperation _parent;
        public int mapId() { return mapId; }
        public int defaultStartPointFlag() { return defaultStartPointFlag; }
        public ScreenEffect screenEffectOnLeave() { return screenEffectOnLeave; }
        public ScreenEffect screenEffectOnEnter() { return screenEffectOnEnter; }
        public int x() { return x; }
        public int z() { return z; }
        public int direction() { return direction; }
        public float fineX() { return fineX; }
        public float fineY() { return fineY; }
        public float fineZ() { return fineZ; }
        public boolean setDirection() { return setDirection; }
        public boolean setFineX() { return setFineX; }
        public boolean setFineY() { return setFineY; }
        public boolean setFineZ() { return setFineZ; }
        public Evt _root() { return _root; }
        public Evt.EvtOperation _parent() { return _parent; }
    }
    private byte[] magic;
    private List<EvtDefinition> definition;
    private Evt _root;
    private KaitaiStruct _parent;
    public byte[] magic() { return magic; }
    public List<EvtDefinition> definition() { return definition; }
    public Evt _root() { return _root; }
    public KaitaiStruct _parent() { return _parent; }
}
