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
 * DisableAlarmActionsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisableAlarmActionsRequestMarshaller implements Marshaller<Request<DisableAlarmActionsRequest>, DisableAlarmActionsRequest> {

    public Request<DisableAlarmActionsRequest> marshall(DisableAlarmActionsRequest disableAlarmActionsRequest) {

        if (disableAlarmActionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DisableAlarmActionsRequest> request = new DefaultRequest<DisableAlarmActionsRequest>(disableAlarmActionsRequest, "AmazonCloudWatch");
        request.addParameter("Action", "DisableAlarmActions");
        request.addParameter("Version", "2010-08-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (!disableAlarmActionsRequest.getAlarmNames().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) disableAlarmActionsRequest.getAlarmNames()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> alarmNamesList = (com.amazonaws.internal.SdkInternalList<String>) disableAlarmActionsRequest
                    .getAlarmNames();
            int alarmNamesListIndex = 1;

            for (String alarmNamesListValue : alarmNamesList) {
                if (alarmNamesListValue != null) {
                    request.addParameter("AlarmNames.member." + alarmNamesListIndex, StringUtils.fromString(alarmNamesListValue));
                }
                alarmNamesListIndex++;
            }
        }

        return request;
    }

}
