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
package com.amazonaws.services.s3control.model.transform;

import java.util.Map;

import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.s3control.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * GetAccessPointResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccessPointResultStaxUnmarshaller implements Unmarshaller<GetAccessPointResult, StaxUnmarshallerContext> {

    private static class EndpointsMapEntryUnmarshaller implements Unmarshaller<Map.Entry<String, String>, StaxUnmarshallerContext> {

        @Override
        public Entry<String, String> unmarshall(StaxUnmarshallerContext context) throws Exception {
            int originalDepth = context.getCurrentDepth();
            int targetDepth = originalDepth + 1;

            MapEntry<String, String> entry = new MapEntry<String, String>();

            while (true) {
                XMLEvent xmlEvent = context.nextEvent();
                if (xmlEvent.isEndDocument())
                    return entry;

                if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                    if (context.testExpression("key", targetDepth)) {
                        entry.setKey(StringStaxUnmarshaller.getInstance().unmarshall(context));
                        continue;
                    }
                    if (context.testExpression("value", targetDepth)) {
                        entry.setValue(StringStaxUnmarshaller.getInstance().unmarshall(context));
                        continue;
                    }
                } else if (xmlEvent.isEndElement()) {
                    if (context.getCurrentDepth() < originalDepth)
                        return entry;
                }
            }
        }

        private static EndpointsMapEntryUnmarshaller instance;

        public static EndpointsMapEntryUnmarshaller getInstance() {
            if (instance == null)
                instance = new EndpointsMapEntryUnmarshaller();
            return instance;
        }

    }

    public GetAccessPointResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetAccessPointResult getAccessPointResult = new GetAccessPointResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getAccessPointResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Name", targetDepth)) {
                    getAccessPointResult.setName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Bucket", targetDepth)) {
                    getAccessPointResult.setBucket(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NetworkOrigin", targetDepth)) {
                    getAccessPointResult.setNetworkOrigin(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VpcConfiguration", targetDepth)) {
                    getAccessPointResult.setVpcConfiguration(VpcConfigurationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PublicAccessBlockConfiguration", targetDepth)) {
                    getAccessPointResult.setPublicAccessBlockConfiguration(PublicAccessBlockConfigurationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreationDate", targetDepth)) {
                    getAccessPointResult.setCreationDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("Alias", targetDepth)) {
                    getAccessPointResult.setAlias(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AccessPointArn", targetDepth)) {
                    getAccessPointResult.setAccessPointArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Endpoints/entry", targetDepth)) {
                    Entry<String, String> entry = EndpointsMapEntryUnmarshaller.getInstance().unmarshall(context);
                    getAccessPointResult.addEndpointsEntry(entry.getKey(), entry.getValue());
                    continue;
                }

                if (context.testExpression("BucketAccountId", targetDepth)) {
                    getAccessPointResult.setBucketAccountId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getAccessPointResult;
                }
            }
        }
    }

    private static GetAccessPointResultStaxUnmarshaller instance;

    public static GetAccessPointResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetAccessPointResultStaxUnmarshaller();
        return instance;
    }
}
