/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudformation.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Get Stack Policy Request Marshaller
 */
public class GetStackPolicyRequestMarshaller implements Marshaller<Request<GetStackPolicyRequest>, GetStackPolicyRequest> {

    public Request<GetStackPolicyRequest> marshall(GetStackPolicyRequest getStackPolicyRequest) {

        if (getStackPolicyRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<GetStackPolicyRequest> request = new DefaultRequest<GetStackPolicyRequest>(getStackPolicyRequest, "AmazonCloudFormation");
        request.addParameter("Action", "GetStackPolicy");
        request.addParameter("Version", "2010-05-15");

        if (getStackPolicyRequest.getStackName() != null) {
            request.addParameter("StackName", StringUtils.fromString(getStackPolicyRequest.getStackName()));
        }


        return request;
    }
}
