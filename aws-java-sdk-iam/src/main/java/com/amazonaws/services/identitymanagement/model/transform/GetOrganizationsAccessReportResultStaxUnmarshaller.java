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
package com.amazonaws.services.identitymanagement.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * GetOrganizationsAccessReportResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOrganizationsAccessReportResultStaxUnmarshaller implements Unmarshaller<GetOrganizationsAccessReportResult, StaxUnmarshallerContext> {

    public GetOrganizationsAccessReportResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetOrganizationsAccessReportResult getOrganizationsAccessReportResult = new GetOrganizationsAccessReportResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getOrganizationsAccessReportResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("JobStatus", targetDepth)) {
                    getOrganizationsAccessReportResult.setJobStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("JobCreationDate", targetDepth)) {
                    getOrganizationsAccessReportResult.setJobCreationDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("JobCompletionDate", targetDepth)) {
                    getOrganizationsAccessReportResult.setJobCompletionDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("NumberOfServicesAccessible", targetDepth)) {
                    getOrganizationsAccessReportResult.setNumberOfServicesAccessible(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NumberOfServicesNotAccessed", targetDepth)) {
                    getOrganizationsAccessReportResult.setNumberOfServicesNotAccessed(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AccessDetails", targetDepth)) {
                    getOrganizationsAccessReportResult.withAccessDetails(new ArrayList<AccessDetail>());
                    continue;
                }

                if (context.testExpression("AccessDetails/member", targetDepth)) {
                    getOrganizationsAccessReportResult.withAccessDetails(AccessDetailStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IsTruncated", targetDepth)) {
                    getOrganizationsAccessReportResult.setIsTruncated(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Marker", targetDepth)) {
                    getOrganizationsAccessReportResult.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ErrorDetails", targetDepth)) {
                    getOrganizationsAccessReportResult.setErrorDetails(ErrorDetailsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getOrganizationsAccessReportResult;
                }
            }
        }
    }

    private static GetOrganizationsAccessReportResultStaxUnmarshaller instance;

    public static GetOrganizationsAccessReportResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetOrganizationsAccessReportResultStaxUnmarshaller();
        return instance;
    }
}
