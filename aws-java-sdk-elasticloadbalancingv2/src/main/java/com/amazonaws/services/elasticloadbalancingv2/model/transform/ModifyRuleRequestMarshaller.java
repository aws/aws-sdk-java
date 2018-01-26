/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancingv2.model.transform;

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ModifyRuleRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyRuleRequestMarshaller implements Marshaller<Request<ModifyRuleRequest>, ModifyRuleRequest> {

    public Request<ModifyRuleRequest> marshall(ModifyRuleRequest modifyRuleRequest) {

        if (modifyRuleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyRuleRequest> request = new DefaultRequest<ModifyRuleRequest>(modifyRuleRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "ModifyRule");
        request.addParameter("Version", "2015-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyRuleRequest.getRuleArn() != null) {
            request.addParameter("RuleArn", StringUtils.fromString(modifyRuleRequest.getRuleArn()));
        }

        if (modifyRuleRequest.getConditions() != null) {
            java.util.List<RuleCondition> conditionsList = modifyRuleRequest.getConditions();
            if (conditionsList.isEmpty()) {
                request.addParameter("Conditions", "");
            } else {
                int conditionsListIndex = 1;

                for (RuleCondition conditionsListValue : conditionsList) {

                    if (conditionsListValue.getField() != null) {
                        request.addParameter("Conditions.member." + conditionsListIndex + ".Field", StringUtils.fromString(conditionsListValue.getField()));
                    }

                    if (conditionsListValue.getValues() != null) {
                        java.util.List<String> valuesList = conditionsListValue.getValues();
                        if (valuesList.isEmpty()) {
                            request.addParameter("Conditions.member." + conditionsListIndex + ".Values", "");
                        } else {
                            int valuesListIndex = 1;

                            for (String valuesListValue : valuesList) {
                                if (valuesListValue != null) {
                                    request.addParameter("Conditions.member." + conditionsListIndex + ".Values.member." + valuesListIndex,
                                            StringUtils.fromString(valuesListValue));
                                }
                                valuesListIndex++;
                            }
                        }
                    }
                    conditionsListIndex++;
                }
            }
        }

        if (modifyRuleRequest.getActions() != null) {
            java.util.List<Action> actionsList = modifyRuleRequest.getActions();
            if (actionsList.isEmpty()) {
                request.addParameter("Actions", "");
            } else {
                int actionsListIndex = 1;

                for (Action actionsListValue : actionsList) {

                    if (actionsListValue.getType() != null) {
                        request.addParameter("Actions.member." + actionsListIndex + ".Type", StringUtils.fromString(actionsListValue.getType()));
                    }

                    if (actionsListValue.getTargetGroupArn() != null) {
                        request.addParameter("Actions.member." + actionsListIndex + ".TargetGroupArn",
                                StringUtils.fromString(actionsListValue.getTargetGroupArn()));
                    }
                    actionsListIndex++;
                }
            }
        }

        return request;
    }

}
