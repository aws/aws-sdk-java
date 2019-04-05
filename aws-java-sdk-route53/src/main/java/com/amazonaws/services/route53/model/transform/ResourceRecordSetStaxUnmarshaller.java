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
package com.amazonaws.services.route53.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ResourceRecordSet StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceRecordSetStaxUnmarshaller implements Unmarshaller<ResourceRecordSet, StaxUnmarshallerContext> {

    public ResourceRecordSet unmarshall(StaxUnmarshallerContext context) throws Exception {
        ResourceRecordSet resourceRecordSet = new ResourceRecordSet();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return resourceRecordSet;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Name", targetDepth)) {
                    resourceRecordSet.setName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Type", targetDepth)) {
                    resourceRecordSet.setType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SetIdentifier", targetDepth)) {
                    resourceRecordSet.setSetIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Weight", targetDepth)) {
                    resourceRecordSet.setWeight(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Region", targetDepth)) {
                    resourceRecordSet.setRegion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("GeoLocation", targetDepth)) {
                    resourceRecordSet.setGeoLocation(GeoLocationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Failover", targetDepth)) {
                    resourceRecordSet.setFailover(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MultiValueAnswer", targetDepth)) {
                    resourceRecordSet.setMultiValueAnswer(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TTL", targetDepth)) {
                    resourceRecordSet.setTTL(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ResourceRecords", targetDepth)) {
                    resourceRecordSet.withResourceRecords(new ArrayList<ResourceRecord>());
                    continue;
                }

                if (context.testExpression("ResourceRecords/ResourceRecord", targetDepth)) {
                    resourceRecordSet.withResourceRecords(ResourceRecordStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AliasTarget", targetDepth)) {
                    resourceRecordSet.setAliasTarget(AliasTargetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("HealthCheckId", targetDepth)) {
                    resourceRecordSet.setHealthCheckId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TrafficPolicyInstanceId", targetDepth)) {
                    resourceRecordSet.setTrafficPolicyInstanceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return resourceRecordSet;
                }
            }
        }
    }

    private static ResourceRecordSetStaxUnmarshaller instance;

    public static ResourceRecordSetStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResourceRecordSetStaxUnmarshaller();
        return instance;
    }
}
