/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworks.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * ElasticLoadBalancerMarshaller
 */
public class ElasticLoadBalancerJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ElasticLoadBalancer elasticLoadBalancer, StructuredJsonGenerator jsonGenerator) {

        if (elasticLoadBalancer == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (elasticLoadBalancer.getElasticLoadBalancerName() != null) {
                jsonGenerator.writeFieldName("ElasticLoadBalancerName").writeValue(elasticLoadBalancer.getElasticLoadBalancerName());
            }
            if (elasticLoadBalancer.getRegion() != null) {
                jsonGenerator.writeFieldName("Region").writeValue(elasticLoadBalancer.getRegion());
            }
            if (elasticLoadBalancer.getDnsName() != null) {
                jsonGenerator.writeFieldName("DnsName").writeValue(elasticLoadBalancer.getDnsName());
            }
            if (elasticLoadBalancer.getStackId() != null) {
                jsonGenerator.writeFieldName("StackId").writeValue(elasticLoadBalancer.getStackId());
            }
            if (elasticLoadBalancer.getLayerId() != null) {
                jsonGenerator.writeFieldName("LayerId").writeValue(elasticLoadBalancer.getLayerId());
            }
            if (elasticLoadBalancer.getVpcId() != null) {
                jsonGenerator.writeFieldName("VpcId").writeValue(elasticLoadBalancer.getVpcId());
            }

            com.amazonaws.internal.SdkInternalList<String> availabilityZonesList = (com.amazonaws.internal.SdkInternalList<String>) elasticLoadBalancer
                    .getAvailabilityZones();
            if (!availabilityZonesList.isEmpty() || !availabilityZonesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("AvailabilityZones");
                jsonGenerator.writeStartArray();
                for (String availabilityZonesListValue : availabilityZonesList) {
                    if (availabilityZonesListValue != null) {
                        jsonGenerator.writeValue(availabilityZonesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<String> subnetIdsList = (com.amazonaws.internal.SdkInternalList<String>) elasticLoadBalancer.getSubnetIds();
            if (!subnetIdsList.isEmpty() || !subnetIdsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("SubnetIds");
                jsonGenerator.writeStartArray();
                for (String subnetIdsListValue : subnetIdsList) {
                    if (subnetIdsListValue != null) {
                        jsonGenerator.writeValue(subnetIdsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            com.amazonaws.internal.SdkInternalList<String> ec2InstanceIdsList = (com.amazonaws.internal.SdkInternalList<String>) elasticLoadBalancer
                    .getEc2InstanceIds();
            if (!ec2InstanceIdsList.isEmpty() || !ec2InstanceIdsList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("Ec2InstanceIds");
                jsonGenerator.writeStartArray();
                for (String ec2InstanceIdsListValue : ec2InstanceIdsList) {
                    if (ec2InstanceIdsListValue != null) {
                        jsonGenerator.writeValue(ec2InstanceIdsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ElasticLoadBalancerJsonMarshaller instance;

    public static ElasticLoadBalancerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ElasticLoadBalancerJsonMarshaller();
        return instance;
    }

}
