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
 * DeleteIntegrationResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteIntegrationResultStaxUnmarshaller implements Unmarshaller<DeleteIntegrationResult, StaxUnmarshallerContext> {

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

    public DeleteIntegrationResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DeleteIntegrationResult deleteIntegrationResult = new DeleteIntegrationResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return deleteIntegrationResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("SourceArn", targetDepth)) {
                    deleteIntegrationResult.setSourceArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TargetArn", targetDepth)) {
                    deleteIntegrationResult.setTargetArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IntegrationName", targetDepth)) {
                    deleteIntegrationResult.setIntegrationName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IntegrationArn", targetDepth)) {
                    deleteIntegrationResult.setIntegrationArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("KMSKeyId", targetDepth)) {
                    deleteIntegrationResult.setKMSKeyId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AdditionalEncryptionContext/entry", targetDepth)) {
                    Entry<String, String> entry = AdditionalEncryptionContextMapEntryUnmarshaller.getInstance().unmarshall(context);
                    deleteIntegrationResult.addAdditionalEncryptionContextEntry(entry.getKey(), entry.getValue());
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    deleteIntegrationResult.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Tags", targetDepth)) {
                    deleteIntegrationResult.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("Tags/Tag", targetDepth)) {
                    deleteIntegrationResult.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreateTime", targetDepth)) {
                    deleteIntegrationResult.setCreateTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("Errors", targetDepth)) {
                    deleteIntegrationResult.withErrors(new ArrayList<IntegrationError>());
                    continue;
                }

                if (context.testExpression("Errors/IntegrationError", targetDepth)) {
                    deleteIntegrationResult.withErrors(IntegrationErrorStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DataFilter", targetDepth)) {
                    deleteIntegrationResult.setDataFilter(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Description", targetDepth)) {
                    deleteIntegrationResult.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return deleteIntegrationResult;
                }
            }
        }
    }

    private static DeleteIntegrationResultStaxUnmarshaller instance;

    public static DeleteIntegrationResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteIntegrationResultStaxUnmarshaller();
        return instance;
    }
}
