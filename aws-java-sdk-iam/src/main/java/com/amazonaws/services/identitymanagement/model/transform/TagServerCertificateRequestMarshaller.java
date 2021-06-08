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
 * TagServerCertificateRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagServerCertificateRequestMarshaller implements Marshaller<Request<TagServerCertificateRequest>, TagServerCertificateRequest> {

    public Request<TagServerCertificateRequest> marshall(TagServerCertificateRequest tagServerCertificateRequest) {

        if (tagServerCertificateRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<TagServerCertificateRequest> request = new DefaultRequest<TagServerCertificateRequest>(tagServerCertificateRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "TagServerCertificate");
        request.addParameter("Version", "2010-05-08");
        request.setHttpMethod(HttpMethodName.POST);

        if (tagServerCertificateRequest.getServerCertificateName() != null) {
            request.addParameter("ServerCertificateName", StringUtils.fromString(tagServerCertificateRequest.getServerCertificateName()));
        }

        if (!tagServerCertificateRequest.getTags().isEmpty()
                || !((com.amazonaws.internal.SdkInternalList<Tag>) tagServerCertificateRequest.getTags()).isAutoConstruct()) {
            com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) tagServerCertificateRequest.getTags();
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {
                if (tagsListValue != null) {

                    if (tagsListValue.getKey() != null) {
                        request.addParameter("Tags.member." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                    }

                    if (tagsListValue.getValue() != null) {
                        request.addParameter("Tags.member." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                    }
                }
                tagsListIndex++;
            }
        }

        return request;
    }

}
