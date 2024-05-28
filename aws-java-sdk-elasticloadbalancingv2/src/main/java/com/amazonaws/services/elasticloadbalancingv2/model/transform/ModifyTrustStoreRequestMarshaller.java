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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticloadbalancingv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * ModifyTrustStoreRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyTrustStoreRequestMarshaller implements Marshaller<Request<ModifyTrustStoreRequest>, ModifyTrustStoreRequest> {

    public Request<ModifyTrustStoreRequest> marshall(ModifyTrustStoreRequest modifyTrustStoreRequest) {

        if (modifyTrustStoreRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ModifyTrustStoreRequest> request = new DefaultRequest<ModifyTrustStoreRequest>(modifyTrustStoreRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "ModifyTrustStore");
        request.addParameter("Version", "2015-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyTrustStoreRequest.getTrustStoreArn() != null) {
            request.addParameter("TrustStoreArn", StringUtils.fromString(modifyTrustStoreRequest.getTrustStoreArn()));
        }

        if (modifyTrustStoreRequest.getCaCertificatesBundleS3Bucket() != null) {
            request.addParameter("CaCertificatesBundleS3Bucket", StringUtils.fromString(modifyTrustStoreRequest.getCaCertificatesBundleS3Bucket()));
        }

        if (modifyTrustStoreRequest.getCaCertificatesBundleS3Key() != null) {
            request.addParameter("CaCertificatesBundleS3Key", StringUtils.fromString(modifyTrustStoreRequest.getCaCertificatesBundleS3Key()));
        }

        if (modifyTrustStoreRequest.getCaCertificatesBundleS3ObjectVersion() != null) {
            request.addParameter("CaCertificatesBundleS3ObjectVersion",
                    StringUtils.fromString(modifyTrustStoreRequest.getCaCertificatesBundleS3ObjectVersion()));
        }

        return request;
    }

}
