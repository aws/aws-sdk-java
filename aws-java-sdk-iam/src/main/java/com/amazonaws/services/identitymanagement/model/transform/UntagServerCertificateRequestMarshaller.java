/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.identitymanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * UntagServerCertificateRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UntagServerCertificateRequestMarshaller implements Marshaller<Request<UntagServerCertificateRequest>, UntagServerCertificateRequest> {

    public Request<UntagServerCertificateRequest> marshall(UntagServerCertificateRequest untagServerCertificateRequest) {

        if (untagServerCertificateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UntagServerCertificateRequest> request = new DefaultRequest<UntagServerCertificateRequest>(untagServerCertificateRequest,
                "AmazonIdentityManagement");
        request.addParameter("Action", "UntagServerCertificate");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        if (untagServerCertificateRequest.getServerCertificateName() != null) {
            request.addParameter("ServerCertificateName", StringUtils.fromString(untagServerCertificateRequest.getServerCertificateName()));
        }

        if (!untagServerCertificateRequest.getTagKeys().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<String>) untagServerCertificateRequest.getTagKeys()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<String> tagKeysList = (com.amazonaws.internal.SdkInternalList<String>) untagServerCertificateRequest
                    .getTagKeys();
            int tagKeysListIndex = 1;

            for (String tagKeysListValue : tagKeysList) {
                if (tagKeysListValue != null) {
                    request.addParameter("TagKeys.member." + tagKeysListIndex, StringUtils.fromString(tagKeysListValue));
                }
                tagKeysListIndex++;
            }
        }

        return request;
    }

}
