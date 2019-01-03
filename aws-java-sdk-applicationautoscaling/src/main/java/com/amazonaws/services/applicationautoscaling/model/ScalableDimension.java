/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.applicationautoscaling.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ScalableDimension {

    EcsServiceDesiredCount("ecs:service:DesiredCount"),
    Ec2SpotFleetRequestTargetCapacity("ec2:spot-fleet-request:TargetCapacity"),
    ElasticmapreduceInstancegroupInstanceCount("elasticmapreduce:instancegroup:InstanceCount"),
    AppstreamFleetDesiredCapacity("appstream:fleet:DesiredCapacity"),
    DynamodbTableReadCapacityUnits("dynamodb:table:ReadCapacityUnits"),
    DynamodbTableWriteCapacityUnits("dynamodb:table:WriteCapacityUnits"),
    DynamodbIndexReadCapacityUnits("dynamodb:index:ReadCapacityUnits"),
    DynamodbIndexWriteCapacityUnits("dynamodb:index:WriteCapacityUnits"),
    RdsClusterReadReplicaCount("rds:cluster:ReadReplicaCount"),
    SagemakerVariantDesiredInstanceCount("sagemaker:variant:DesiredInstanceCount"),
    CustomResourceResourceTypeProperty("custom-resource:ResourceType:Property");

    private String value;

    private ScalableDimension(String value) {
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
     * @return ScalableDimension corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ScalableDimension fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ScalableDimension enumEntry : ScalableDimension.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
