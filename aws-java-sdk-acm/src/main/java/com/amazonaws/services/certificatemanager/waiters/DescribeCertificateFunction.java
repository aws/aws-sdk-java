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

package com.amazonaws.services.certificatemanager.waiters;

import javax.annotation.Generated;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.waiters.SdkFunction;
import com.amazonaws.services.certificatemanager.model.DescribeCertificateRequest;
import com.amazonaws.services.certificatemanager.model.DescribeCertificateResult;
import com.amazonaws.services.certificatemanager.AWSCertificateManager;

@SdkInternalApi
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCertificateFunction implements SdkFunction<DescribeCertificateRequest, DescribeCertificateResult> {

    /**
     * Represents the service client
     */
    private final AWSCertificateManager client;

    /**
     * Constructs a new DescribeCertificateFunction with the given client
     * 
     * @param client
     *        Service client
     */
    public DescribeCertificateFunction(AWSCertificateManager client) {
        this.client = client;
    }

    /**
     * Makes a call to the operation specified by the waiter by taking the corresponding request and returns the
     * corresponding result
     * 
     * @param describeCertificateRequest
     *        Corresponding request for the operation
     * @return Corresponding result of the operation
     */
    @Override
    public DescribeCertificateResult apply(DescribeCertificateRequest describeCertificateRequest) {
        return client.describeCertificate(describeCertificateRequest);
    }
}
