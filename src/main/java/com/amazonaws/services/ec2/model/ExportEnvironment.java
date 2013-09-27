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
 * Export Environment
 */
public enum ExportEnvironment {
    
    Citrix("citrix"),
    Vmware("vmware"),
    Microsoft("microsoft");

    private String value;

    private ExportEnvironment(String value) {
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
     * @return ExportEnvironment corresponding to the value
     */
    public static ExportEnvironment fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("citrix".equals(value)) {
            return ExportEnvironment.Citrix;
        } else if ("vmware".equals(value)) {
            return ExportEnvironment.Vmware;
        } else if ("microsoft".equals(value)) {
            return ExportEnvironment.Microsoft;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    