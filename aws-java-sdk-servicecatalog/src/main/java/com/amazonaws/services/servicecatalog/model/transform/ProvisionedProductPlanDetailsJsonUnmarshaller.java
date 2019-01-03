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
package com.amazonaws.services.servicecatalog.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ProvisionedProductPlanDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionedProductPlanDetailsJsonUnmarshaller implements Unmarshaller<ProvisionedProductPlanDetails, JsonUnmarshallerContext> {

    public ProvisionedProductPlanDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        ProvisionedProductPlanDetails provisionedProductPlanDetails = new ProvisionedProductPlanDetails();

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
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    provisionedProductPlanDetails.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("PathId", targetDepth)) {
                    context.nextToken();
                    provisionedProductPlanDetails.setPathId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProductId", targetDepth)) {
                    context.nextToken();
                    provisionedProductPlanDetails.setProductId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PlanName", targetDepth)) {
                    context.nextToken();
                    provisionedProductPlanDetails.setPlanName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PlanId", targetDepth)) {
                    context.nextToken();
                    provisionedProductPlanDetails.setPlanId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProvisionProductId", targetDepth)) {
                    context.nextToken();
                    provisionedProductPlanDetails.setProvisionProductId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProvisionProductName", targetDepth)) {
                    context.nextToken();
                    provisionedProductPlanDetails.setProvisionProductName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PlanType", targetDepth)) {
                    context.nextToken();
                    provisionedProductPlanDetails.setPlanType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProvisioningArtifactId", targetDepth)) {
                    context.nextToken();
                    provisionedProductPlanDetails.setProvisioningArtifactId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    provisionedProductPlanDetails.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UpdatedTime", targetDepth)) {
                    context.nextToken();
                    provisionedProductPlanDetails.setUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("NotificationArns", targetDepth)) {
                    context.nextToken();
                    provisionedProductPlanDetails.setNotificationArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("ProvisioningParameters", targetDepth)) {
                    context.nextToken();
                    provisionedProductPlanDetails.setProvisioningParameters(new ListUnmarshaller<UpdateProvisioningParameter>(
                            UpdateProvisioningParameterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    provisionedProductPlanDetails.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    context.nextToken();
                    provisionedProductPlanDetails.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return provisionedProductPlanDetails;
    }

    private static ProvisionedProductPlanDetailsJsonUnmarshaller instance;

    public static ProvisionedProductPlanDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProvisionedProductPlanDetailsJsonUnmarshaller();
        return instance;
    }
}
