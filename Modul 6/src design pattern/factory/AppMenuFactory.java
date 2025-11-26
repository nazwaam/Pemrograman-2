package factory;

import core.BaseMenu;
import core.MenuFactory;
import core.MenuType;
import service.IMovieService;
import ui.InputDataMenu;
import ui.MainMenu;
import ui.ViewDataMenu;

public class AppMenuFactory implements MenuFactory {

    private final IMovieService movieService;

    public AppMenuFactory(IMovieService movieService) {
        this.movieService = movieService;
    }

    @Override
    public BaseMenu createMenu(MenuType type) {
        switch (type) {
            case MAIN:
                return new MainMenu();
            case INPUT:
                return new InputDataMenu(movieService);
            case VIEW:
                return new ViewDataMenu(movieService);
            default:
                throw new IllegalArgumentException("Unknown menu type");
        }
    }
}