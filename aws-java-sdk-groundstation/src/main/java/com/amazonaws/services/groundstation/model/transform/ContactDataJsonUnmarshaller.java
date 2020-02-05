/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.groundstation.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.groundstation.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ContactData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContactDataJsonUnmarshaller implements Unmarshaller<ContactData, JsonUnmarshallerContext> {

    public ContactData unmarshall(JsonUnmarshallerContext context) throws Exception {
        ContactData contactData = new ContactData();

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
                if (context.testExpression("contactId", targetDepth)) {
                    context.nextToken();
                    contactData.setContactId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("contactStatus", targetDepth)) {
                    context.nextToken();
                    contactData.setContactStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    contactData.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("errorMessage", targetDepth)) {
                    context.nextToken();
                    contactData.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("groundStation", targetDepth)) {
                    context.nextToken();
                    contactData.setGroundStation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("maximumElevation", targetDepth)) {
                    context.nextToken();
                    contactData.setMaximumElevation(ElevationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("missionProfileArn", targetDepth)) {
                    context.nextToken();
                    contactData.setMissionProfileArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("postPassEndTime", targetDepth)) {
                    context.nextToken();
                    contactData.setPostPassEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("prePassStartTime", targetDepth)) {
                    context.nextToken();
                    contactData.setPrePassStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("region", targetDepth)) {
                    context.nextToken();
                    contactData.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("satelliteArn", targetDepth)) {
                    context.nextToken();
                    contactData.setSatelliteArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    contactData.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    contactData.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return contactData;
    }

    private static ContactDataJsonUnmarshaller instance;

    public static ContactDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContactDataJsonUnmarshaller();
        return instance;
    }
}
