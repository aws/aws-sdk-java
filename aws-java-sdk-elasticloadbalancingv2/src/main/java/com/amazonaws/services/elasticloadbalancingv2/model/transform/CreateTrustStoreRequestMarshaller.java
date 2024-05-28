/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancingv2.model.transform;

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreateTrustStoreRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTrustStoreRequestMarshaller implements Marshaller<Request<CreateTrustStoreRequest>, CreateTrustStoreRequest> {

    public Request<CreateTrustStoreRequest> marshall(CreateTrustStoreRequest createTrustStoreRequest) {

        if (createTrustStoreRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateTrustStoreRequest> request = new DefaultRequest<CreateTrustStoreRequest>(createTrustStoreRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "CreateTrustStore");
        request.addParameter("Version", "2015-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (createTrustStoreRequest.getName() != null) {
            request.addParameter("Name", StringUtils.fromString(createTrustStoreRequest.getName()));
        }

        if (createTrustStoreRequest.getCaCertificatesBundleS3Bucket() != null) {
            request.addParameter("CaCertificatesBundleS3Bucket", StringUtils.fromString(createTrustStoreRequest.getCaCertificatesBundleS3Bucket()));
        }

        if (createTrustStoreRequest.getCaCertificatesBundleS3Key() != null) {
            request.addParameter("CaCertificatesBundleS3Key", StringUtils.fromString(createTrustStoreRequest.getCaCertificatesBundleS3Key()));
        }

        if (createTrustStoreRequest.getCaCertificatesBundleS3ObjectVersion() != null) {
            request.addParameter("CaCertificatesBundleS3ObjectVersion",
                    StringUtils.fromString(createTrustStoreRequest.getCaCertificatesBundleS3ObjectVersion()));
        }

        if (createTrustStoreRequest.getTags() != null) {
            java.util.List<Tag> tagsList = createTrustStoreRequest.getTags();
            if (tagsList.isEmpty()) {
                request.addParameter("Tags", "");
            } else {
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
        }

        return request;
    }

}
