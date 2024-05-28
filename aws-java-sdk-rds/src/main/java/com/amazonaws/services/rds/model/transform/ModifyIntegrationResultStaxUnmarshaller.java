/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model.transform;

import java.util.Map;

import java.util.ArrayList;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ModifyIntegrationResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyIntegrationResultStaxUnmarshaller implements Unmarshaller<ModifyIntegrationResult, StaxUnmarshallerContext> {

    private static class AdditionalEncryptionContextMapEntryUnmarshaller implements Unmarshaller<Map.Entry<String, String>, StaxUnmarshallerContext> {

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

        private static AdditionalEncryptionContextMapEntryUnmarshaller instance;

        public static AdditionalEncryptionContextMapEntryUnmarshaller getInstance() {
            if (instance == null)
                instance = new AdditionalEncryptionContextMapEntryUnmarshaller();
            return instance;
        }

    }

    public ModifyIntegrationResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ModifyIntegrationResult modifyIntegrationResult = new ModifyIntegrationResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return modifyIntegrationResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("SourceArn", targetDepth)) {
                    modifyIntegrationResult.setSourceArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TargetArn", targetDepth)) {
                    modifyIntegrationResult.setTargetArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IntegrationName", targetDepth)) {
                    modifyIntegrationResult.setIntegrationName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IntegrationArn", targetDepth)) {
                    modifyIntegrationResult.setIntegrationArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("KMSKeyId", targetDepth)) {
                    modifyIntegrationResult.setKMSKeyId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AdditionalEncryptionContext/entry", targetDepth)) {
                    Entry<String, String> entry = AdditionalEncryptionContextMapEntryUnmarshaller.getInstance().unmarshall(context);
                    modifyIntegrationResult.addAdditionalEncryptionContextEntry(entry.getKey(), entry.getValue());
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    modifyIntegrationResult.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Tags", targetDepth)) {
                    modifyIntegrationResult.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("Tags/Tag", targetDepth)) {
                    modifyIntegrationResult.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreateTime", targetDepth)) {
                    modifyIntegrationResult.setCreateTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("Errors", targetDepth)) {
                    modifyIntegrationResult.withErrors(new ArrayList<IntegrationError>());
                    continue;
                }

                if (context.testExpression("Errors/IntegrationError", targetDepth)) {
                    modifyIntegrationResult.withErrors(IntegrationErrorStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DataFilter", targetDepth)) {
                    modifyIntegrationResult.setDataFilter(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Description", targetDepth)) {
                    modifyIntegrationResult.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return modifyIntegrationResult;
                }
            }
        }
    }

    private static ModifyIntegrationResultStaxUnmarshaller instance;

    public static ModifyIntegrationResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModifyIntegrationResultStaxUnmarshaller();
        return instance;
    }
}
