/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directory.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.directory.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RegionDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegionDescriptionJsonUnmarshaller implements Unmarshaller<RegionDescription, JsonUnmarshallerContext> {

    public RegionDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        RegionDescription regionDescription = new RegionDescription();

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
                if (context.testExpression("DirectoryId", targetDepth)) {
                    context.nextToken();
                    regionDescription.setDirectoryId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegionName", targetDepth)) {
                    context.nextToken();
                    regionDescription.setRegionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegionType", targetDepth)) {
                    context.nextToken();
                    regionDescription.setRegionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    regionDescription.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcSettings", targetDepth)) {
                    context.nextToken();
                    regionDescription.setVpcSettings(DirectoryVpcSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DesiredNumberOfDomainControllers", targetDepth)) {
                    context.nextToken();
                    regionDescription.setDesiredNumberOfDomainControllers(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("LaunchTime", targetDepth)) {
                    context.nextToken();
                    regionDescription.setLaunchTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("StatusLastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    regionDescription.setStatusLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    regionDescription.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return regionDescription;
    }

    private static RegionDescriptionJsonUnmarshaller instance;

    public static RegionDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RegionDescriptionJsonUnmarshaller();
        return instance;
    }
}
