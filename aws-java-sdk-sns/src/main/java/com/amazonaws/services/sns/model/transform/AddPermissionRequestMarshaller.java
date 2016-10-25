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
package com.amazonaws.services.sns.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * AddPermissionRequest Marshaller
 */

public class AddPermissionRequestMarshaller implements Marshaller<Request<AddPermissionRequest>, AddPermissionRequest> {

    public Request<AddPermissionRequest> marshall(AddPermissionRequest addPermissionRequest) {

        if (addPermissionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AddPermissionRequest> request = new DefaultRequest<AddPermissionRequest>(addPermissionRequest, "AmazonSNS");
        request.addParameter("Action", "AddPermission");
        request.addParameter("Version", "2010-03-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (addPermissionRequest.getTopicArn() != null) {
            request.addParameter("TopicArn", StringUtils.fromString(addPermissionRequest.getTopicArn()));
        }

        if (addPermissionRequest.getLabel() != null) {
            request.addParameter("Label", StringUtils.fromString(addPermissionRequest.getLabel()));
        }

        com.amazonaws.internal.SdkInternalList<String> aWSAccountIdsList = (com.amazonaws.internal.SdkInternalList<String>) addPermissionRequest
                .getAWSAccountIds();
        if (!aWSAccountIdsList.isEmpty() || !aWSAccountIdsList.isAutoConstruct()) {
            int aWSAccountIdsListIndex = 1;

            for (String aWSAccountIdsListValue : aWSAccountIdsList) {
                if (aWSAccountIdsListValue != null) {
                    request.addParameter("AWSAccountId.member." + aWSAccountIdsListIndex, StringUtils.fromString(aWSAccountIdsListValue));
                }
                aWSAccountIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> actionNamesList = (com.amazonaws.internal.SdkInternalList<String>) addPermissionRequest.getActionNames();
        if (!actionNamesList.isEmpty() || !actionNamesList.isAutoConstruct()) {
            int actionNamesListIndex = 1;

            for (String actionNamesListValue : actionNamesList) {
                if (actionNamesListValue != null) {
                    request.addParameter("ActionName.member." + actionNamesListIndex, StringUtils.fromString(actionNamesListValue));
                }
                actionNamesListIndex++;
            }
        }

        return request;
    }

}
