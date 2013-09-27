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
package com.amazonaws.services.ec2.model;

/**
 * Event Code
 */
public enum EventCode {
    
    InstanceReboot("instance-reboot"),
    SystemReboot("system-reboot"),
    SystemMaintenance("system-maintenance"),
    InstanceRetirement("instance-retirement"),
    InstanceStop("instance-stop");

    private String value;

    private EventCode(String value) {
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
     * @return EventCode corresponding to the value
     */
    public static EventCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("instance-reboot".equals(value)) {
            return EventCode.InstanceReboot;
        } else if ("system-reboot".equals(value)) {
            return EventCode.SystemReboot;
        } else if ("system-maintenance".equals(value)) {
            return EventCode.SystemMaintenance;
        } else if ("instance-retirement".equals(value)) {
            return EventCode.InstanceRetirement;
        } else if ("instance-stop".equals(value)) {
            return EventCode.InstanceStop;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    