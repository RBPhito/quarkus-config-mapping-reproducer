package com.example.repro;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;

import java.util.Map;

public class DummyTestResource implements QuarkusTestResourceLifecycleManager {

    @Override
    public Map<String, String> start() {
        return Map.of();
    }

    @Override
    public void stop() {
    }
}
