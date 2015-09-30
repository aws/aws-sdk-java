/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemail.model;

/**
 * Dsn Action
 */
public enum DsnAction {
    
    Failed("failed"),
    Delayed("delayed"),
    Delivered("delivered"),
    Relayed("relayed"),
    Expanded("expanded");

    private String value;

    private DsnAction(String value) {
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
     * @return DsnAction corresponding to the value
     */
    public static DsnAction fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("failed".equals(value)) {
            return DsnAction.Failed;
        } else if ("delayed".equals(value)) {
            return DsnAction.Delayed;
        } else if ("delivered".equals(value)) {
            return DsnAction.Delivered;
        } else if ("relayed".equals(value)) {
            return DsnAction.Relayed;
        } else if ("expanded".equals(value)) {
            return DsnAction.Expanded;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    