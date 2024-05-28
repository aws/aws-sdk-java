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
 * AddTrustStoreRevocationsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddTrustStoreRevocationsRequestMarshaller implements Marshaller<Request<AddTrustStoreRevocationsRequest>, AddTrustStoreRevocationsRequest> {

    public Request<AddTrustStoreRevocationsRequest> marshall(AddTrustStoreRevocationsRequest addTrustStoreRevocationsRequest) {

        if (addTrustStoreRevocationsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AddTrustStoreRevocationsRequest> request = new DefaultRequest<AddTrustStoreRevocationsRequest>(addTrustStoreRevocationsRequest,
                "AmazonElasticLoadBalancing");
        request.addParameter("Action", "AddTrustStoreRevocations");
        request.addParameter("Version", "2015-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (addTrustStoreRevocationsRequest.getTrustStoreArn() != null) {
            request.addParameter("TrustStoreArn", StringUtils.fromString(addTrustStoreRevocationsRequest.getTrustStoreArn()));
        }

        if (addTrustStoreRevocationsRequest.getRevocationContents() != null) {
            java.util.List<RevocationContent> revocationContentsList = addTrustStoreRevocationsRequest.getRevocationContents();
            if (revocationContentsList.isEmpty()) {
                request.addParameter("RevocationContents", "");
            } else {
                int revocationContentsListIndex = 1;

                for (RevocationContent revocationContentsListValue : revocationContentsList) {
                    if (revocationContentsListValue != null) {

                        if (revocationContentsListValue.getS3Bucket() != null) {
                            request.addParameter("RevocationContents.member." + revocationContentsListIndex + ".S3Bucket",
                                    StringUtils.fromString(revocationContentsListValue.getS3Bucket()));
                        }

                        if (revocationContentsListValue.getS3Key() != null) {
                            request.addParameter("RevocationContents.member." + revocationContentsListIndex + ".S3Key",
                                    StringUtils.fromString(revocationContentsListValue.getS3Key()));
                        }

                        if (revocationContentsListValue.getS3ObjectVersion() != null) {
                            request.addParameter("RevocationContents.member." + revocationContentsListIndex + ".S3ObjectVersion",
                                    StringUtils.fromString(revocationContentsListValue.getS3ObjectVersion()));
                        }

                        if (revocationContentsListValue.getRevocationType() != null) {
                            request.addParameter("RevocationContents.member." + revocationContentsListIndex + ".RevocationType",
                                    StringUtils.fromString(revocationContentsListValue.getRevocationType()));
                        }
                    }
                    revocationContentsListIndex++;
                }
            }
        }

        return request;
    }

}
