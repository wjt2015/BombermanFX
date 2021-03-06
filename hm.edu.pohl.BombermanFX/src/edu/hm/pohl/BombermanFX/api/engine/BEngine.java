package edu.hm.pohl.BombermanFX.api.engine;

import java.util.ArrayList;
import java.util.List;

import edu.hm.pohl.BombermanFX.api.engine.impl.BombEngine;
import edu.hm.pohl.BombermanFX.api.engine.impl.EntityEngine;
import edu.hm.pohl.BombermanFX.api.engine.impl.FlameEngine;
import edu.hm.pohl.BombermanFX.api.engine.impl.PowerupEngine;
import edu.hm.pohl.BombermanFX.api.map.BMap;
import edu.hm.pohl.BombermanFX.api.model.impl.Bomb;
import edu.hm.pohl.BombermanFX.api.model.impl.Flame;
import edu.hm.pohl.BombermanFX.api.model.impl.Monster;
import edu.hm.pohl.BombermanFX.api.model.impl.Player;
import edu.hm.pohl.BombermanFX.api.model.impl.Powerup;
import edu.hm.pohl.BombermanFX.ui.widgets.BCanvas;

public abstract class BEngine {

    public static final List<Player> players = new ArrayList<>();
    public static final List<Monster> monsters = new ArrayList<>();
    public static final List<Bomb> bombs = new ArrayList<>();
    public static final List<Flame> flames = new ArrayList<>();
    public static final List<Powerup> powerups = new ArrayList<>();

    public static final BEngine entityEngine = new EntityEngine();
    public static final BEngine bombEngine = new BombEngine();
    public static final BEngine flameEngine = new FlameEngine();
    public static final BEngine powerupEngine = new PowerupEngine();

    public static final BMap map = new BMap();
    public static final BCanvas canvas = new BCanvas();

    public abstract void perform();
}
