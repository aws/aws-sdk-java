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
package com.amazonaws.services.kms.model;

import javax.annotation.Generated;

/**
 * <p>
 * The request was rejected because the trust anchor certificate in the request is not the trust anchor certificate for
 * the specified AWS CloudHSM cluster.
 * </p>
 * <p>
 * When you <a href="http://docs.aws.amazon.com/cloudhsm/latest/userguide/initialize-cluster.html#sign-csr">initialize
 * the cluster</a>, you create the trust anchor certificate and save it in the <code>customerCA.crt</code> file.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IncorrectTrustAnchorException extends com.amazonaws.services.kms.model.AWSKMSException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new IncorrectTrustAnchorException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public IncorrectTrustAnchorException(String message) {
        super(message);
    }

}
