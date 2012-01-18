/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Source Type
 */
public enum SourceType {
    
    CacheCluster("cache-cluster"),
    CacheParameterGroup("cache-parameter-group"),
    CacheSecurityGroup("cache-security-group");

    private String value;

    private SourceType(String value) {
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
     * @return SourceType corresponding to the value
     */
    public static SourceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("cache-cluster".equals(value)) {
            return SourceType.CacheCluster;
        } else if ("cache-parameter-group".equals(value)) {
            return SourceType.CacheParameterGroup;
        } else if ("cache-security-group".equals(value)) {
            return SourceType.CacheSecurityGroup;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    