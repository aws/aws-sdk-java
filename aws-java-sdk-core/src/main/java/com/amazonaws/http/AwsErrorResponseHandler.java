/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.http;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.util.AWSRequestMetrics;
import java.util.Arrays;
import java.util.List;

/**
 * Wrapper around protocol specific error handler to deal with some default scenarios and fill in common information.
 */
@SdkInternalApi
class AwsErrorResponseHandler implements HttpResponseHandler<AmazonServiceException> {

    private final HttpResponseHandler<AmazonServiceException> delegate;
    private final AWSRequestMetrics awsRequestMetrics;


    AwsErrorResponseHandler(HttpResponseHandler<AmazonServiceException> errorResponseHandler,
                            AWSRequestMetrics awsRequestMetrics) {
        this.delegate = errorResponseHandler;
        this.awsRequestMetrics = awsRequestMetrics;
    }

    @Override
    public AmazonServiceException handle(HttpResponse response) throws Exception {
        final AmazonServiceException ase = handleAse(response);
        ase.setStatusCode(response.getStatusCode());
        ase.setServiceName(response.getRequest().getServiceName());
        awsRequestMetrics.addPropertyWith(AWSRequestMetrics.Field.AWSRequestID, ase.getRequestId())
                .addPropertyWith(AWSRequestMetrics.Field.AWSErrorCode, ase.getErrorCode())
                .addPropertyWith(AWSRequestMetrics.Field.StatusCode, ase.getStatusCode());
        return ase;
    }

    private AmazonServiceException handleAse(HttpResponse response) throws Exception {
        final int statusCode = response.getStatusCode();
        try {
            return delegate.handle(response);
        } catch(InterruptedException e) {
            throw e;
        } catch (Exception e) {
            // If the errorResponseHandler doesn't work, then check for error responses that don't have any content
            if (statusCode == 413) {
                AmazonServiceException exception = new AmazonServiceException("Request entity too large");
                exception.setServiceName(response.getRequest().getServiceName());
                exception.setStatusCode(statusCode);
                exception.setErrorType(AmazonServiceException.ErrorType.Client);
                exception.setErrorCode("Request entity too large");
                return exception;
            } else if (statusCode >= 500 && statusCode < 600) {
                AmazonServiceException exception = new AmazonServiceException(response.getStatusText());
                exception.setServiceName(response.getRequest().getServiceName());
                exception.setStatusCode(statusCode);
                exception.setErrorType(AmazonServiceException.ErrorType.Service);
                exception.setErrorCode(response.getStatusText());
                return exception;
            } else {
                throw e;
            }
        }
    }

    @Override
    public boolean needsConnectionLeftOpen() {
        return delegate.needsConnectionLeftOpen();
    }

}
