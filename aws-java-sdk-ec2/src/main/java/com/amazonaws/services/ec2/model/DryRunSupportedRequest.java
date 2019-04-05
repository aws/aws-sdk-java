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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;

/**
 * Generic interface for operation request that is supported with dry-run.
 * 
 * @param <X>
 *            The type of original, user facing request represented by this
 *            DryRunSupportedRequest.
 */
public interface DryRunSupportedRequest<X extends AmazonWebServiceRequest> {
    
    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    public Request<X> getDryRunRequest();

}
