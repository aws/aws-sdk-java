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
package com.amazonaws.services.cloudwatch.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * PutCompositeAlarmRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutCompositeAlarmRequestMarshaller implements Marshaller<Request<PutCompositeAlarmRequest>, PutCompositeAlarmRequest> {

    public Request<PutCompositeAlarmRequest> marshall(PutCompositeAlarmRequest putCompositeAlarmRequest) {

        if (putCompositeAlarmRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutCompositeAlarmRequest> request = new DefaultRequest<PutCompositeAlarmRequest>(putCompositeAlarmRequest, "AmazonCloudWatch");
        request.addParameter("Action", "PutCompositeAlarm");
        request.addParameter("Version", "2010-08-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (putCompositeAlarmRequest.getActionsEnabled() != null) {
            request.addParameter("ActionsEnabled", StringUtils.fromBoolean(putCompositeAlarmRequest.getActionsEnabled()));
        }

        if (!putCompositeAlarmRequest.getAlarmActions().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) putCompositeAlarmRequest.getAlarmActions()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> alarmActionsList = (com.amazonaws.internal.SdkInternalList<String>) putCompositeAlarmRequest
                    .getAlarmActions();
            int alarmActionsListIndex = 1;

            for (String alarmActionsListValue : alarmActionsList) {
                if (alarmActionsListValue != null) {
                    request.addParameter("AlarmActions.member." + alarmActionsListIndex, StringUtils.fromString(alarmActionsListValue));
                }
                alarmActionsListIndex++;
            }
        }

        if (putCompositeAlarmRequest.getAlarmDescription() != null) {
            request.addParameter("AlarmDescription", StringUtils.fromString(putCompositeAlarmRequest.getAlarmDescription()));
        }

        if (putCompositeAlarmRequest.getAlarmName() != null) {
            request.addParameter("AlarmName", StringUtils.fromString(putCompositeAlarmRequest.getAlarmName()));
        }

        if (putCompositeAlarmRequest.getAlarmRule() != null) {
            request.addParameter("AlarmRule", StringUtils.fromString(putCompositeAlarmRequest.getAlarmRule()));
        }

        if (!putCompositeAlarmRequest.getInsufficientDataActions().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) putCompositeAlarmRequest.getInsufficientDataActions()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> insufficientDataActionsList = (com.amazonaws.internal.SdkInternalList<String>) putCompositeAlarmRequest
                    .getInsufficientDataActions();
            int insufficientDataActionsListIndex = 1;

            for (String insufficientDataActionsListValue : insufficientDataActionsList) {
                if (insufficientDataActionsListValue != null) {
                    request.addParameter("InsufficientDataActions.member." + insufficientDataActionsListIndex,
                            StringUtils.fromString(insufficientDataActionsListValue));
                }
                insufficientDataActionsListIndex++;
            }
        }

        if (!putCompositeAlarmRequest.getOKActions().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) putCompositeAlarmRequest.getOKActions()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> oKActionsList = (com.amazonaws.internal.SdkInternalList<String>) putCompositeAlarmRequest
                    .getOKActions();
            int oKActionsListIndex = 1;

            for (String oKActionsListValue : oKActionsList) {
                if (oKActionsListValue != null) {
                    request.addParameter("OKActions.member." + oKActionsListIndex, StringUtils.fromString(oKActionsListValue));
                }
                oKActionsListIndex++;
            }
        }

        if (!putCompositeAlarmRequest.getTags().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Tag>) putCompositeAlarmRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) putCompositeAlarmRequest.getTags();
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {

                if (tagsListValue.getKey() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                }

                if (tagsListValue.getValue() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                }
                tagsListIndex++;
            }
        }

        return request;
    }

}
