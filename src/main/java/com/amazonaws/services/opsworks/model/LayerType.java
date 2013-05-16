/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworks.model;

/**
 * Layer Type
 */
public enum LayerType {
    
    Lb("lb"),
    Web("web"),
    PhpApp("php-app"),
    RailsApp("rails-app"),
    NodejsApp("nodejs-app"),
    Memcached("memcached"),
    DbMaster("db-master"),
    MonitoringMaster("monitoring-master"),
    Custom("custom");

    private String value;

    private LayerType(String value) {
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
     * @return LayerType corresponding to the value
     */
    public static LayerType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("lb".equals(value)) {
            return LayerType.Lb;
        } else if ("web".equals(value)) {
            return LayerType.Web;
        } else if ("php-app".equals(value)) {
            return LayerType.PhpApp;
        } else if ("rails-app".equals(value)) {
            return LayerType.RailsApp;
        } else if ("nodejs-app".equals(value)) {
            return LayerType.NodejsApp;
        } else if ("memcached".equals(value)) {
            return LayerType.Memcached;
        } else if ("db-master".equals(value)) {
            return LayerType.DbMaster;
        } else if ("monitoring-master".equals(value)) {
            return LayerType.MonitoringMaster;
        } else if ("custom".equals(value)) {
            return LayerType.Custom;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    