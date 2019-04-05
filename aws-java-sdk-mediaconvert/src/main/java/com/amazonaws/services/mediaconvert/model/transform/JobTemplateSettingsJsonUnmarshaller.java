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
package com.amazonaws.services.mediaconvert.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * JobTemplateSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobTemplateSettingsJsonUnmarshaller implements Unmarshaller<JobTemplateSettings, JsonUnmarshallerContext> {

    public JobTemplateSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        JobTemplateSettings jobTemplateSettings = new JobTemplateSettings();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("adAvailOffset", targetDepth)) {
                    context.nextToken();
                    jobTemplateSettings.setAdAvailOffset(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("availBlanking", targetDepth)) {
                    context.nextToken();
                    jobTemplateSettings.setAvailBlanking(AvailBlankingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("esam", targetDepth)) {
                    context.nextToken();
                    jobTemplateSettings.setEsam(EsamSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("inputs", targetDepth)) {
                    context.nextToken();
                    jobTemplateSettings.setInputs(new ListUnmarshaller<InputTemplate>(InputTemplateJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("motionImageInserter", targetDepth)) {
                    context.nextToken();
                    jobTemplateSettings.setMotionImageInserter(MotionImageInserterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("nielsenConfiguration", targetDepth)) {
                    context.nextToken();
                    jobTemplateSettings.setNielsenConfiguration(NielsenConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("outputGroups", targetDepth)) {
                    context.nextToken();
                    jobTemplateSettings.setOutputGroups(new ListUnmarshaller<OutputGroup>(OutputGroupJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("timecodeConfig", targetDepth)) {
                    context.nextToken();
                    jobTemplateSettings.setTimecodeConfig(TimecodeConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("timedMetadataInsertion", targetDepth)) {
                    context.nextToken();
                    jobTemplateSettings.setTimedMetadataInsertion(TimedMetadataInsertionJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return jobTemplateSettings;
    }

    private static JobTemplateSettingsJsonUnmarshaller instance;

    public static JobTemplateSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobTemplateSettingsJsonUnmarshaller();
        return instance;
    }
}
