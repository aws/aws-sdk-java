/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.opsworks.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ElasticLoadBalancerMarshaller
 */
public class ElasticLoadBalancerJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(ElasticLoadBalancer elasticLoadBalancer,
            JSONWriter jsonWriter) {
        if (elasticLoadBalancer == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (elasticLoadBalancer.getElasticLoadBalancerName() != null) {
                jsonWriter.key("ElasticLoadBalancerName").value(
                        elasticLoadBalancer.getElasticLoadBalancerName());
            }

            if (elasticLoadBalancer.getRegion() != null) {
                jsonWriter.key("Region").value(elasticLoadBalancer.getRegion());
            }

            if (elasticLoadBalancer.getDnsName() != null) {
                jsonWriter.key("DnsName").value(
                        elasticLoadBalancer.getDnsName());
            }

            if (elasticLoadBalancer.getStackId() != null) {
                jsonWriter.key("StackId").value(
                        elasticLoadBalancer.getStackId());
            }

            if (elasticLoadBalancer.getLayerId() != null) {
                jsonWriter.key("LayerId").value(
                        elasticLoadBalancer.getLayerId());
            }

            if (elasticLoadBalancer.getVpcId() != null) {
                jsonWriter.key("VpcId").value(elasticLoadBalancer.getVpcId());
            }

            com.amazonaws.internal.SdkInternalList<String> availabilityZonesList = (com.amazonaws.internal.SdkInternalList<String>) elasticLoadBalancer
                    .getAvailabilityZones();
            if (!availabilityZonesList.isEmpty()
                    || !availabilityZonesList.isAutoConstruct()) {
                jsonWriter.key("AvailabilityZones");
                jsonWriter.array();
                for (String availabilityZonesListValue : availabilityZonesList) {
                    if (availabilityZonesListValue != null) {
                        jsonWriter.value(availabilityZonesListValue);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<String> subnetIdsList = (com.amazonaws.internal.SdkInternalList<String>) elasticLoadBalancer
                    .getSubnetIds();
            if (!subnetIdsList.isEmpty() || !subnetIdsList.isAutoConstruct()) {
                jsonWriter.key("SubnetIds");
                jsonWriter.array();
                for (String subnetIdsListValue : subnetIdsList) {
                    if (subnetIdsListValue != null) {
                        jsonWriter.value(subnetIdsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            com.amazonaws.internal.SdkInternalList<String> ec2InstanceIdsList = (com.amazonaws.internal.SdkInternalList<String>) elasticLoadBalancer
                    .getEc2InstanceIds();
            if (!ec2InstanceIdsList.isEmpty()
                    || !ec2InstanceIdsList.isAutoConstruct()) {
                jsonWriter.key("Ec2InstanceIds");
                jsonWriter.array();
                for (String ec2InstanceIdsListValue : ec2InstanceIdsList) {
                    if (ec2InstanceIdsListValue != null) {
                        jsonWriter.value(ec2InstanceIdsListValue);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ElasticLoadBalancerJsonMarshaller instance;

    public static ElasticLoadBalancerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ElasticLoadBalancerJsonMarshaller();
        return instance;
    }

}
