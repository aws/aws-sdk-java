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
package com.amazonaws.services.identitymanagement.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * GetServiceLastAccessedDetailsResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceLastAccessedDetailsResultStaxUnmarshaller implements Unmarshaller<GetServiceLastAccessedDetailsResult, StaxUnmarshallerContext> {

    public GetServiceLastAccessedDetailsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetServiceLastAccessedDetailsResult getServiceLastAccessedDetailsResult = new GetServiceLastAccessedDetailsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getServiceLastAccessedDetailsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("JobStatus", targetDepth)) {
                    getServiceLastAccessedDetailsResult.setJobStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("JobCreationDate", targetDepth)) {
                    getServiceLastAccessedDetailsResult.setJobCreationDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("ServicesLastAccessed", targetDepth)) {
                    getServiceLastAccessedDetailsResult.withServicesLastAccessed(new ArrayList<ServiceLastAccessed>());
                    continue;
                }

                if (context.testExpression("ServicesLastAccessed/member", targetDepth)) {
                    getServiceLastAccessedDetailsResult.withServicesLastAccessed(ServiceLastAccessedStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("JobCompletionDate", targetDepth)) {
                    getServiceLastAccessedDetailsResult.setJobCompletionDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("IsTruncated", targetDepth)) {
                    getServiceLastAccessedDetailsResult.setIsTruncated(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Marker", targetDepth)) {
                    getServiceLastAccessedDetailsResult.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Error", targetDepth)) {
                    getServiceLastAccessedDetailsResult.setError(ErrorDetailsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getServiceLastAccessedDetailsResult;
                }
            }
        }
    }

    private static GetServiceLastAccessedDetailsResultStaxUnmarshaller instance;

    public static GetServiceLastAccessedDetailsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetServiceLastAccessedDetailsResultStaxUnmarshaller();
        return instance;
    }
}
