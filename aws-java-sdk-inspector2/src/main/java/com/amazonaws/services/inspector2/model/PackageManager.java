/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.inspector2.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum PackageManager {

    BUNDLER("BUNDLER"),
    CARGO("CARGO"),
    COMPOSER("COMPOSER"),
    NPM("NPM"),
    NUGET("NUGET"),
    PIPENV("PIPENV"),
    POETRY("POETRY"),
    YARN("YARN"),
    GOBINARY("GOBINARY"),
    GOMOD("GOMOD"),
    JAR("JAR"),
    OS("OS"),
    PIP("PIP"),
    PYTHONPKG("PYTHONPKG"),
    NODEPKG("NODEPKG"),
    POM("POM");

    private String value;

    private PackageManager(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return PackageManager corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static PackageManager fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (PackageManager enumEntry : PackageManager.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
