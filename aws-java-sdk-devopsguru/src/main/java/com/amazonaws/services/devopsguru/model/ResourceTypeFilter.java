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
package com.amazonaws.services.devopsguru.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ResourceTypeFilter {

    LOG_GROUPS("LOG_GROUPS"),
    CLOUDFRONT_DISTRIBUTION("CLOUDFRONT_DISTRIBUTION"),
    DYNAMODB_TABLE("DYNAMODB_TABLE"),
    EC2_NAT_GATEWAY("EC2_NAT_GATEWAY"),
    ECS_CLUSTER("ECS_CLUSTER"),
    ECS_SERVICE("ECS_SERVICE"),
    EKS_CLUSTER("EKS_CLUSTER"),
    ELASTIC_BEANSTALK_ENVIRONMENT("ELASTIC_BEANSTALK_ENVIRONMENT"),
    ELASTIC_LOAD_BALANCER_LOAD_BALANCER("ELASTIC_LOAD_BALANCER_LOAD_BALANCER"),
    ELASTIC_LOAD_BALANCING_V2_LOAD_BALANCER("ELASTIC_LOAD_BALANCING_V2_LOAD_BALANCER"),
    ELASTIC_LOAD_BALANCING_V2_TARGET_GROUP("ELASTIC_LOAD_BALANCING_V2_TARGET_GROUP"),
    ELASTICACHE_CACHE_CLUSTER("ELASTICACHE_CACHE_CLUSTER"),
    ELASTICSEARCH_DOMAIN("ELASTICSEARCH_DOMAIN"),
    KINESIS_STREAM("KINESIS_STREAM"),
    LAMBDA_FUNCTION("LAMBDA_FUNCTION"),
    OPEN_SEARCH_SERVICE_DOMAIN("OPEN_SEARCH_SERVICE_DOMAIN"),
    RDS_DB_INSTANCE("RDS_DB_INSTANCE"),
    RDS_DB_CLUSTER("RDS_DB_CLUSTER"),
    REDSHIFT_CLUSTER("REDSHIFT_CLUSTER"),
    ROUTE53_HOSTED_ZONE("ROUTE53_HOSTED_ZONE"),
    ROUTE53_HEALTH_CHECK("ROUTE53_HEALTH_CHECK"),
    S3_BUCKET("S3_BUCKET"),
    SAGEMAKER_ENDPOINT("SAGEMAKER_ENDPOINT"),
    SNS_TOPIC("SNS_TOPIC"),
    SQS_QUEUE("SQS_QUEUE"),
    STEP_FUNCTIONS_ACTIVITY("STEP_FUNCTIONS_ACTIVITY"),
    STEP_FUNCTIONS_STATE_MACHINE("STEP_FUNCTIONS_STATE_MACHINE");

    private String value;

    private ResourceTypeFilter(String value) {
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
     * @return ResourceTypeFilter corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ResourceTypeFilter fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ResourceTypeFilter enumEntry : ResourceTypeFilter.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
