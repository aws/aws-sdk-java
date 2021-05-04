/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devopsguru.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ServiceName {

    API_GATEWAY("API_GATEWAY"),
    APPLICATION_ELB("APPLICATION_ELB"),
    AUTO_SCALING_GROUP("AUTO_SCALING_GROUP"),
    CLOUD_FRONT("CLOUD_FRONT"),
    DYNAMO_DB("DYNAMO_DB"),
    EC2("EC2"),
    ECS("ECS"),
    EKS("EKS"),
    ELASTIC_BEANSTALK("ELASTIC_BEANSTALK"),
    ELASTI_CACHE("ELASTI_CACHE"),
    ELB("ELB"),
    ES("ES"),
    KINESIS("KINESIS"),
    LAMBDA("LAMBDA"),
    NAT_GATEWAY("NAT_GATEWAY"),
    NETWORK_ELB("NETWORK_ELB"),
    RDS("RDS"),
    REDSHIFT("REDSHIFT"),
    ROUTE_53("ROUTE_53"),
    S3("S3"),
    SAGE_MAKER("SAGE_MAKER"),
    SNS("SNS"),
    SQS("SQS"),
    STEP_FUNCTIONS("STEP_FUNCTIONS"),
    SWF("SWF");

    private String value;

    private ServiceName(String value) {
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
     * @return ServiceName corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ServiceName fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ServiceName enumEntry : ServiceName.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
