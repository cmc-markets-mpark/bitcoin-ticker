package au.cmcmarkets.ticker

import au.cmcmarkets.ticker.core.di.DaggerAppComponent
import com.facebook.stetho.Stetho
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication


class CmcApp : DaggerApplication() {

    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG) {
            // SQLite and network debugging though Chrome developer tools
            Stetho.initializeWithDefaults(this)
        }
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.factory().create(this)
    }
}
