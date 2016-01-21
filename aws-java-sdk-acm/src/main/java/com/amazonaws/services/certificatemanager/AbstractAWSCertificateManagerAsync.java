/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
package com.amazonaws.services.certificatemanager;

import com.amazonaws.services.certificatemanager.model.*;

/**
 * Abstract implementation of {@code AWSCertificateManagerAsync}. Convenient
 * method forms pass through to the corresponding overload that takes a request
 * object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
public class AbstractAWSCertificateManagerAsync extends
        AbstractAWSCertificateManager implements AWSCertificateManagerAsync {

    protected AbstractAWSCertificateManagerAsync() {
    }

    @Override
    public java.util.concurrent.Future<Void> deleteCertificateAsync(
            DeleteCertificateRequest request) {

        return deleteCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteCertificateAsync(
            DeleteCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteCertificateRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeCertificateResult> describeCertificateAsync(
            DescribeCertificateRequest request) {

        return describeCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCertificateResult> describeCertificateAsync(
            DescribeCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeCertificateRequest, DescribeCertificateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetCertificateResult> getCertificateAsync(
            GetCertificateRequest request) {

        return getCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCertificateResult> getCertificateAsync(
            GetCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCertificateRequest, GetCertificateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListCertificatesResult> listCertificatesAsync(
            ListCertificatesRequest request) {

        return listCertificatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCertificatesResult> listCertificatesAsync(
            ListCertificatesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListCertificatesRequest, ListCertificatesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RequestCertificateResult> requestCertificateAsync(
            RequestCertificateRequest request) {

        return requestCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RequestCertificateResult> requestCertificateAsync(
            RequestCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<RequestCertificateRequest, RequestCertificateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> resendValidationEmailAsync(
            ResendValidationEmailRequest request) {

        return resendValidationEmailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> resendValidationEmailAsync(
            ResendValidationEmailRequest request,
            com.amazonaws.handlers.AsyncHandler<ResendValidationEmailRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
