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
package com.amazonaws.services.cloudformation.model.transform;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * GetTemplateSummaryResult StAX Unmarshaller
 */
public class GetTemplateSummaryResultStaxUnmarshaller implements Unmarshaller<GetTemplateSummaryResult, StaxUnmarshallerContext> {

    public GetTemplateSummaryResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetTemplateSummaryResult getTemplateSummaryResult = new GetTemplateSummaryResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getTemplateSummaryResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Parameters/member", targetDepth)) {
                    getTemplateSummaryResult.withParameters(ParameterDeclarationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Description", targetDepth)) {
                    getTemplateSummaryResult.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Capabilities/member", targetDepth)) {
                    getTemplateSummaryResult.withCapabilities(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CapabilitiesReason", targetDepth)) {
                    getTemplateSummaryResult.setCapabilitiesReason(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ResourceTypes/member", targetDepth)) {
                    getTemplateSummaryResult.withResourceTypes(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Version", targetDepth)) {
                    getTemplateSummaryResult.setVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Metadata", targetDepth)) {
                    getTemplateSummaryResult.setMetadata(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DeclaredTransforms/member", targetDepth)) {
                    getTemplateSummaryResult.withDeclaredTransforms(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getTemplateSummaryResult;
                }
            }
        }
    }

    private static GetTemplateSummaryResultStaxUnmarshaller instance;

    public static GetTemplateSummaryResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetTemplateSummaryResultStaxUnmarshaller();
        return instance;
    }
}
