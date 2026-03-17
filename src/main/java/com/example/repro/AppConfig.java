package com.example.repro;

import io.quarkus.runtime.annotations.StaticInitSafe;
import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;

@StaticInitSafe
@ConfigMapping(prefix = "demo")
public interface AppConfig {
    @WithDefault("test")
    String name();
}
