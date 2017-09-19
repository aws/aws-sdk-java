/*
 * Copyright (c) 2017. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package utils;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * A utility that can temporarily forcibly set environment variables and
 * then allows resetting them to the original values.
 */
public class EnvironmentVariableHelper {

    private final Map<String, String> originalEnvironmentVariables;
    private final Map<String, String> modifiableMap;
    private volatile boolean mutated = false;

    @SuppressWarnings("unchecked")
    public EnvironmentVariableHelper() {
        try {
            originalEnvironmentVariables = System.getenv();
            Field f = originalEnvironmentVariables.getClass().getDeclaredField("m");
            f.setAccessible(true);
            modifiableMap = (Map<String, String>) f.get(originalEnvironmentVariables);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void set(String key, String value) {
        mutated = true;
        modifiableMap.put(key, value);
    }

    public void reset() {
        if (mutated) {
            synchronized (this) {
                if (mutated) {
                    modifiableMap.clear();
                    modifiableMap.putAll(originalEnvironmentVariables);
                    mutated = false;
                }
            }
        }
    }

    @Override
    protected void finalize() {
        reset();
    }
}
