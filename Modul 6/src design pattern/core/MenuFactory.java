package core;

import core.BaseMenu;

public interface MenuFactory {
    BaseMenu createMenu(MenuType type);
}