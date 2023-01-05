/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * PutDataProtectionPolicyRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutDataProtectionPolicyRequestMarshaller implements Marshaller<Request<PutDataProtectionPolicyRequest>, PutDataProtectionPolicyRequest> {

    public Request<PutDataProtectionPolicyRequest> marshall(PutDataProtectionPolicyRequest putDataProtectionPolicyRequest) {

        if (putDataProtectionPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutDataProtectionPolicyRequest> request = new DefaultRequest<PutDataProtectionPolicyRequest>(putDataProtectionPolicyRequest, "AmazonSNS");
        request.addParameter("Action", "PutDataProtectionPolicy");
        request.addParameter("Version", "2010-03-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (putDataProtectionPolicyRequest.getResourceArn() != null) {
            request.addParameter("ResourceArn", StringUtils.fromString(putDataProtectionPolicyRequest.getResourceArn()));
        }

        if (putDataProtectionPolicyRequest.getDataProtectionPolicy() != null) {
            request.addParameter("DataProtectionPolicy", StringUtils.fromString(putDataProtectionPolicyRequest.getDataProtectionPolicy()));
        }

        return request;
    }

}
