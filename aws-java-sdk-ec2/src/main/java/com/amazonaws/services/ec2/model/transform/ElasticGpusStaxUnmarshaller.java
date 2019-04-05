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
package com.amazonaws.services.ec2.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ElasticGpus StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ElasticGpusStaxUnmarshaller implements Unmarshaller<ElasticGpus, StaxUnmarshallerContext> {

    public ElasticGpus unmarshall(StaxUnmarshallerContext context) throws Exception {
        ElasticGpus elasticGpus = new ElasticGpus();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return elasticGpus;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("elasticGpuId", targetDepth)) {
                    elasticGpus.setElasticGpuId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("availabilityZone", targetDepth)) {
                    elasticGpus.setAvailabilityZone(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("elasticGpuType", targetDepth)) {
                    elasticGpus.setElasticGpuType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("elasticGpuHealth", targetDepth)) {
                    elasticGpus.setElasticGpuHealth(ElasticGpuHealthStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("elasticGpuState", targetDepth)) {
                    elasticGpus.setElasticGpuState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceId", targetDepth)) {
                    elasticGpus.setInstanceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return elasticGpus;
                }
            }
        }
    }

    private static ElasticGpusStaxUnmarshaller instance;

    public static ElasticGpusStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ElasticGpusStaxUnmarshaller();
        return instance;
    }
}
