package models;

import java.util.TreeMap;

public class StoreAndBackUpData {

    private static TreeMap<String, User> useraAccounts;
    

    public StoreAndBackUpData() {
        useraAccounts = new TreeMap<>();

    }

    public static TreeMap<String, User> getUseraAccounts() {
        return useraAccounts;
    }

    public static void setUseraAccounts(TreeMap<String, User> useraAccounts) {
        StoreAndBackUpData.useraAccounts = useraAccounts;
    }

}
