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
package com.amazonaws.services.route53.model;

/**
 * Resource Record Set Region
 */
public enum ResourceRecordSetRegion {
    
    UsEast1("us-east-1"),
    UsWest1("us-west-1"),
    UsWest2("us-west-2"),
    EuWest1("eu-west-1"),
    ApSoutheast1("ap-southeast-1"),
    ApNortheast1("ap-northeast-1"),
    SaEast1("sa-east-1");

    private String value;

    private ResourceRecordSetRegion(String value) {
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
     * @return ResourceRecordSetRegion corresponding to the value
     */
    public static ResourceRecordSetRegion fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("us-east-1".equals(value)) {
            return ResourceRecordSetRegion.UsEast1;
        } else if ("us-west-1".equals(value)) {
            return ResourceRecordSetRegion.UsWest1;
        } else if ("us-west-2".equals(value)) {
            return ResourceRecordSetRegion.UsWest2;
        } else if ("eu-west-1".equals(value)) {
            return ResourceRecordSetRegion.EuWest1;
        } else if ("ap-southeast-1".equals(value)) {
            return ResourceRecordSetRegion.ApSoutheast1;
        } else if ("ap-northeast-1".equals(value)) {
            return ResourceRecordSetRegion.ApNortheast1;
        } else if ("sa-east-1".equals(value)) {
            return ResourceRecordSetRegion.SaEast1;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    