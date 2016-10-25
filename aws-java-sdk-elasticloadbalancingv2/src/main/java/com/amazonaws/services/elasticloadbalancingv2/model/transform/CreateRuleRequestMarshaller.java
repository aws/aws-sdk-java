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
package com.amazonaws.services.elasticloadbalancingv2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * CreateRuleRequest Marshaller
 */

public class CreateRuleRequestMarshaller implements Marshaller<Request<CreateRuleRequest>, CreateRuleRequest> {

    public Request<CreateRuleRequest> marshall(CreateRuleRequest createRuleRequest) {

        if (createRuleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateRuleRequest> request = new DefaultRequest<CreateRuleRequest>(createRuleRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "CreateRule");
        request.addParameter("Version", "2015-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createRuleRequest.getListenerArn() != null) {
            request.addParameter("ListenerArn", StringUtils.fromString(createRuleRequest.getListenerArn()));
        }

        java.util.List<RuleCondition> conditionsList = createRuleRequest.getConditions();

        if (conditionsList != null) {
            if (conditionsList.isEmpty()) {
                request.addParameter("Conditions", "");
            } else {
                int conditionsListIndex = 1;

                for (RuleCondition conditionsListValue : conditionsList) {

                    if (conditionsListValue.getField() != null) {
                        request.addParameter("Conditions.member." + conditionsListIndex + ".Field", StringUtils.fromString(conditionsListValue.getField()));
                    }

                    java.util.List<String> valuesList = conditionsListValue.getValues();

                    if (valuesList != null) {
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

        if (createRuleRequest.getPriority() != null) {
            request.addParameter("Priority", StringUtils.fromInteger(createRuleRequest.getPriority()));
        }

        java.util.List<Action> actionsList = createRuleRequest.getActions();

        if (actionsList != null) {
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
