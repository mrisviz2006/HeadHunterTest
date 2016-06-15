package ru.obygraykin;

import ru.obygraykin.helper.AccessResumeDatabaseHelper;
import ru.obygraykin.helper.CartHelper;
import ru.obygraykin.helper.TabsHelper;

/**
 * @author: obygraykin on 14.06.2016
 * @spec_id:
 * @overview:
 * @goal:
 * @setup_and_info:
 */
public class TestManager extends WebDriverManager {

    BaseHelper baseHelper;

    CartHelper cartHelper;

    TabsHelper tabsHelper;

    AccessResumeDatabaseHelper databaseHelper;

    public BaseHelper getBaseHelper() {
        if (baseHelper == null) {
            baseHelper = new BaseHelper(this);
        }
        return baseHelper;
    }

    public CartHelper getPriceHelper() {
        if (cartHelper == null) {
            cartHelper = new CartHelper(this);
        }
        return cartHelper;
    }

    public TabsHelper getTabsHelper() {
        if (tabsHelper == null) {
            tabsHelper = new TabsHelper(this);
        }
        return tabsHelper;
    }

    public AccessResumeDatabaseHelper getDatabaseHelper() {
        if (databaseHelper == null) {
            databaseHelper = new AccessResumeDatabaseHelper(this);
        }
        return databaseHelper;
    }
}
