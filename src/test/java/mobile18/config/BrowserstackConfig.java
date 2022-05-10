package mobile18.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:browserstack.properties"})
public interface BrowserstackConfig extends Config {

    @Key("username")
    String username();

    @Key("password")
    String password();

    @Key("app")
    String app();

    @Key("url")
    String url();
}
