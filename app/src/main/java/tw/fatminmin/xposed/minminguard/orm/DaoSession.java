package tw.fatminmin.xposed.minminguard.orm;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import tw.fatminmin.xposed.minminguard.orm.AppData;

import tw.fatminmin.xposed.minminguard.orm.AppDataDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig appDataDaoConfig;

    private final AppDataDao appDataDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        appDataDaoConfig = daoConfigMap.get(AppDataDao.class).clone();
        appDataDaoConfig.initIdentityScope(type);

        appDataDao = new AppDataDao(appDataDaoConfig, this);

        registerDao(AppData.class, appDataDao);
    }
    
    public void clear() {
        appDataDaoConfig.getIdentityScope().clear();
    }

    public AppDataDao getAppDataDao() {
        return appDataDao;
    }

}