package service;

import constant.MenuOption;
import entity.user.UserRole;

import java.util.List;

public interface MenuOptionService {

    /**
     * Returns menu option by given numeric number. If number does not match returns null.
     *
     * @param number - number of option
     *
     * @return menu option
     */
     MenuOption getOption(int number);

    /**
     * Returns all available menu options for user role.
     *
     * @return menu options list
     */
     List<MenuOption> getAvailableOptions(UserRole role);

    /**
     * Processes given option executing needed operation.
     *
     * @param option - given option to process
     */
     void processOption(MenuOption option);
}
