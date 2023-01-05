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
 * GetDataProtectionPolicyRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataProtectionPolicyRequestMarshaller implements Marshaller<Request<GetDataProtectionPolicyRequest>, GetDataProtectionPolicyRequest> {

    public Request<GetDataProtectionPolicyRequest> marshall(GetDataProtectionPolicyRequest getDataProtectionPolicyRequest) {

        if (getDataProtectionPolicyRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetDataProtectionPolicyRequest> request = new DefaultRequest<GetDataProtectionPolicyRequest>(getDataProtectionPolicyRequest, "AmazonSNS");
        request.addParameter("Action", "GetDataProtectionPolicy");
        request.addParameter("Version", "2010-03-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (getDataProtectionPolicyRequest.getResourceArn() != null) {
            request.addParameter("ResourceArn", StringUtils.fromString(getDataProtectionPolicyRequest.getResourceArn()));
        }

        return request;
    }

}
