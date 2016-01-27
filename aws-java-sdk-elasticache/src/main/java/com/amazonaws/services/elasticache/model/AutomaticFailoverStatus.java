/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticache.model;

/**
 * Automatic Failover Status
 */
public enum AutomaticFailoverStatus {
    
    Enabled("enabled"),
    Disabled("disabled"),
    Enabling("enabling"),
    Disabling("disabling");

    private String value;

    private AutomaticFailoverStatus(String value) {
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
     *            real value
     * @return AutomaticFailoverStatus corresponding to the value
     */
    public static AutomaticFailoverStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("enabled".equals(value)) {
            return AutomaticFailoverStatus.Enabled;
        } else if ("disabled".equals(value)) {
            return AutomaticFailoverStatus.Disabled;
        } else if ("enabling".equals(value)) {
            return AutomaticFailoverStatus.Enabling;
        } else if ("disabling".equals(value)) {
            return AutomaticFailoverStatus.Disabling;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    