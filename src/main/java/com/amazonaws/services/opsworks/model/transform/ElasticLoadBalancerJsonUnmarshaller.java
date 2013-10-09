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

package com.amazonaws.services.opsworks.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;


/**
 * Elastic Load Balancer JSON Unmarshaller
 */
public class ElasticLoadBalancerJsonUnmarshaller implements Unmarshaller<ElasticLoadBalancer, JsonUnmarshallerContext> {

    

    public ElasticLoadBalancer unmarshall(JsonUnmarshallerContext context) throws Exception {
        ElasticLoadBalancer elasticLoadBalancer = new ElasticLoadBalancer();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ElasticLoadBalancerName", targetDepth)) {
                    context.nextToken();
                    elasticLoadBalancer.setElasticLoadBalancerName(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Region", targetDepth)) {
                    context.nextToken();
                    elasticLoadBalancer.setRegion(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DnsName", targetDepth)) {
                    context.nextToken();
                    elasticLoadBalancer.setDnsName(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StackId", targetDepth)) {
                    context.nextToken();
                    elasticLoadBalancer.setStackId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LayerId", targetDepth)) {
                    context.nextToken();
                    elasticLoadBalancer.setLayerId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    context.nextToken();
                    elasticLoadBalancer.setVpcId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AvailabilityZones", targetDepth)) {
                    elasticLoadBalancer.setAvailabilityZones(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("SubnetIds", targetDepth)) {
                    elasticLoadBalancer.setSubnetIds(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Ec2InstanceIds", targetDepth)) {
                    elasticLoadBalancer.setEc2InstanceIds(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return elasticLoadBalancer;
    }

    private static ElasticLoadBalancerJsonUnmarshaller instance;
    public static ElasticLoadBalancerJsonUnmarshaller getInstance() {
        if (instance == null) instance = new ElasticLoadBalancerJsonUnmarshaller();
        return instance;
    }
}
    