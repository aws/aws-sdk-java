/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sns.message;

import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkInternalApi;
import java.net.URI;

/**
 * Verifies that the SigningCertURL can be trusted. I.E. it is an SNS endpoint and is using HTTPs.
 */
@SdkInternalApi
class SigningCertUrlVerifier {

    private final String endpoint;

    SigningCertUrlVerifier(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Verifies the location of the signing cert is secure and from SNS.
     *
     * @param certUrl URL to verify.
     * @throws SdkClientException If signing URL cannot be trusted.
     */
    void verifyCertUrl(URI certUrl) {
        assertIsHttps(certUrl);
        assertIsFromSns(certUrl);
    }

    /**
     * The signing cert URL must be HTTPs.
     */
    private void assertIsHttps(URI certUrl) {
        if (!"https".equals(certUrl.getScheme())) {
            throw new SdkClientException("SigningCertURL was not using HTTPS: " + certUrl.toString());
        }
    }

    /**
     * If the signing cert URL is not from SNS fail.
     */
    private void assertIsFromSns(URI certUrl) {
        if (!endpoint.equals(certUrl.getHost())) {
            throw new SdkClientException(
                String.format("SigningCertUrl does not match expected endpoint. Expected %s but received endpoint was %s.",
                              endpoint, certUrl.getHost()));

        }
    }
}
