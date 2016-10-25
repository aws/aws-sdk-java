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
package com.amazonaws.services.inspector.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * AssessmentRunMarshaller
 */
public class AssessmentRunJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(AssessmentRun assessmentRun, StructuredJsonGenerator jsonGenerator) {

        if (assessmentRun == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (assessmentRun.getArn() != null) {
                jsonGenerator.writeFieldName("arn").writeValue(assessmentRun.getArn());
            }
            if (assessmentRun.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(assessmentRun.getName());
            }
            if (assessmentRun.getAssessmentTemplateArn() != null) {
                jsonGenerator.writeFieldName("assessmentTemplateArn").writeValue(assessmentRun.getAssessmentTemplateArn());
            }
            if (assessmentRun.getState() != null) {
                jsonGenerator.writeFieldName("state").writeValue(assessmentRun.getState());
            }
            if (assessmentRun.getDurationInSeconds() != null) {
                jsonGenerator.writeFieldName("durationInSeconds").writeValue(assessmentRun.getDurationInSeconds());
            }

            java.util.List<String> rulesPackageArnsList = assessmentRun.getRulesPackageArns();
            if (rulesPackageArnsList != null) {
                jsonGenerator.writeFieldName("rulesPackageArns");
                jsonGenerator.writeStartArray();
                for (String rulesPackageArnsListValue : rulesPackageArnsList) {
                    if (rulesPackageArnsListValue != null) {
                        jsonGenerator.writeValue(rulesPackageArnsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<Attribute> userAttributesForFindingsList = assessmentRun.getUserAttributesForFindings();
            if (userAttributesForFindingsList != null) {
                jsonGenerator.writeFieldName("userAttributesForFindings");
                jsonGenerator.writeStartArray();
                for (Attribute userAttributesForFindingsListValue : userAttributesForFindingsList) {
                    if (userAttributesForFindingsListValue != null) {

                        AttributeJsonMarshaller.getInstance().marshall(userAttributesForFindingsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (assessmentRun.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("createdAt").writeValue(assessmentRun.getCreatedAt());
            }
            if (assessmentRun.getStartedAt() != null) {
                jsonGenerator.writeFieldName("startedAt").writeValue(assessmentRun.getStartedAt());
            }
            if (assessmentRun.getCompletedAt() != null) {
                jsonGenerator.writeFieldName("completedAt").writeValue(assessmentRun.getCompletedAt());
            }
            if (assessmentRun.getStateChangedAt() != null) {
                jsonGenerator.writeFieldName("stateChangedAt").writeValue(assessmentRun.getStateChangedAt());
            }
            if (assessmentRun.getDataCollected() != null) {
                jsonGenerator.writeFieldName("dataCollected").writeValue(assessmentRun.getDataCollected());
            }

            java.util.List<AssessmentRunStateChange> stateChangesList = assessmentRun.getStateChanges();
            if (stateChangesList != null) {
                jsonGenerator.writeFieldName("stateChanges");
                jsonGenerator.writeStartArray();
                for (AssessmentRunStateChange stateChangesListValue : stateChangesList) {
                    if (stateChangesListValue != null) {

                        AssessmentRunStateChangeJsonMarshaller.getInstance().marshall(stateChangesListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.List<AssessmentRunNotification> notificationsList = assessmentRun.getNotifications();
            if (notificationsList != null) {
                jsonGenerator.writeFieldName("notifications");
                jsonGenerator.writeStartArray();
                for (AssessmentRunNotification notificationsListValue : notificationsList) {
                    if (notificationsListValue != null) {

                        AssessmentRunNotificationJsonMarshaller.getInstance().marshall(notificationsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AssessmentRunJsonMarshaller instance;

    public static AssessmentRunJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AssessmentRunJsonMarshaller();
        return instance;
    }

}
