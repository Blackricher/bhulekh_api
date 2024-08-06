package com.bhulekh.helper;

public class DataBaseContextHolder {

    private static final ThreadLocal<DatabaseContext> dbContextHolder = new ThreadLocal<>();

    public static void setCurrentDb(DatabaseContext dbType) {
        dbContextHolder.set(dbType);
    }

    public static DatabaseContext getCurrentDb() {
        return dbContextHolder.get();
    }

    public static void clear() {
        dbContextHolder.remove();
    }
}
