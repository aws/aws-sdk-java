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
 * SetAlarmStateRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetAlarmStateRequestMarshaller implements Marshaller<Request<SetAlarmStateRequest>, SetAlarmStateRequest> {

    public Request<SetAlarmStateRequest> marshall(SetAlarmStateRequest setAlarmStateRequest) {

        if (setAlarmStateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SetAlarmStateRequest> request = new DefaultRequest<SetAlarmStateRequest>(setAlarmStateRequest, "AmazonCloudWatch");
        request.addParameter("Action", "SetAlarmState");
        request.addParameter("Version", "2010-08-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (setAlarmStateRequest.getAlarmName() != null) {
            request.addParameter("AlarmName", StringUtils.fromString(setAlarmStateRequest.getAlarmName()));
        }

        if (setAlarmStateRequest.getStateValue() != null) {
            request.addParameter("StateValue", StringUtils.fromString(setAlarmStateRequest.getStateValue()));
        }

        if (setAlarmStateRequest.getStateReason() != null) {
            request.addParameter("StateReason", StringUtils.fromString(setAlarmStateRequest.getStateReason()));
        }

        if (setAlarmStateRequest.getStateReasonData() != null) {
            request.addParameter("StateReasonData", StringUtils.fromString(setAlarmStateRequest.getStateReasonData()));
        }

        return request;
    }

}
