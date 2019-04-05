/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Result of a dry-run operation.
 * 
 * @param <X>
 *            The type of original, user facing request for the dry-run operation.
 */
public class DryRunResult<X extends AmazonWebServiceRequest> {
    
    /** Whether the dry-run was successful. */
    private boolean isSuccessful;
    
    /** The original request of the dry-run operation. */
    private DryRunSupportedRequest<X> originalRequest;
    
    /** The message included in the service response. */
    private String message;
    
    /** The original service response on the dry-run request. */
    private AmazonServiceException dryRunResponse;
    
    public DryRunResult(boolean isSuccessful,
            DryRunSupportedRequest<X> originalRequest, String message,
            AmazonServiceException dryRunResponse) {
        this.isSuccessful = isSuccessful;
        this.originalRequest = originalRequest;
        this.message = message;
        this.dryRunResponse = dryRunResponse;
    }
    
    /** Returns whether the dry-run was successful. */
    public boolean isSuccessful() {
        return isSuccessful;
    }
    
    /** Returns the original request of the dry-run operation. */
    public DryRunSupportedRequest<X> getOriginalRequest() {
        return originalRequest;
    }
    
    
    /** Returns the message included in the service response. */
    public String getMessage() {
        return message;
    }
    
    /**
     * Returns the original service response on the dry-run request. EC2 returns
     * service error response no matter the dry-run was successful or not. The
     * response is set with 412 status code when it was successful, and 403
     * status code when it failed.
     */
    public AmazonServiceException getDryRunResponse() {
        return dryRunResponse;
    }

}
