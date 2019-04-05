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
package com.amazonaws.services.cloudformation.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ContinueUpdateRollbackRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContinueUpdateRollbackRequestMarshaller implements Marshaller<Request<ContinueUpdateRollbackRequest>, ContinueUpdateRollbackRequest> {

    public Request<ContinueUpdateRollbackRequest> marshall(ContinueUpdateRollbackRequest continueUpdateRollbackRequest) {

        if (continueUpdateRollbackRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ContinueUpdateRollbackRequest> request = new DefaultRequest<ContinueUpdateRollbackRequest>(continueUpdateRollbackRequest,
                "AmazonCloudFormation");
        request.addParameter("Action", "ContinueUpdateRollback");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (continueUpdateRollbackRequest.getStackName() != null) {
            request.addParameter("StackName", StringUtils.fromString(continueUpdateRollbackRequest.getStackName()));
        }

        if (continueUpdateRollbackRequest.getRoleARN() != null) {
            request.addParameter("RoleARN", StringUtils.fromString(continueUpdateRollbackRequest.getRoleARN()));
        }

        if (continueUpdateRollbackRequest.getResourcesToSkip().isEmpty()
                && !((com.amazonaws.internal.SdkInternalList<String>) continueUpdateRollbackRequest.getResourcesToSkip()).isAutoConstruct()) {
            request.addParameter("ResourcesToSkip", "");
        }
        if (!continueUpdateRollbackRequest.getResourcesToSkip().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) continueUpdateRollbackRequest.getResourcesToSkip()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> resourcesToSkipList = (com.amazonaws.internal.SdkInternalList<String>) continueUpdateRollbackRequest
                    .getResourcesToSkip();
            int resourcesToSkipListIndex = 1;

            for (String resourcesToSkipListValue : resourcesToSkipList) {
                if (resourcesToSkipListValue != null) {
                    request.addParameter("ResourcesToSkip.member." + resourcesToSkipListIndex, StringUtils.fromString(resourcesToSkipListValue));
                }
                resourcesToSkipListIndex++;
            }
        }

        if (continueUpdateRollbackRequest.getClientRequestToken() != null) {
            request.addParameter("ClientRequestToken", StringUtils.fromString(continueUpdateRollbackRequest.getClientRequestToken()));
        }

        return request;
    }

}
