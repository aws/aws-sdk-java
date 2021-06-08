/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53.model;

import javax.annotation.Generated;

/**
 * <p>
 * The key-signing key (KSK) that you specified can't be deactivated because it's the only KSK for a currently-enabled
 * DNSSEC. Disable DNSSEC signing, or add or enable another KSK.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeySigningKeyInUseException extends com.amazonaws.services.route53.model.AmazonRoute53Exception {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new KeySigningKeyInUseException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public KeySigningKeyInUseException(String message) {
        super(message);
    }

}
