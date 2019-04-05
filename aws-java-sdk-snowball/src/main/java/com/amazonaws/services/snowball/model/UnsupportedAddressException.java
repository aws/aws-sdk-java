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
package com.amazonaws.services.snowball.model;

import javax.annotation.Generated;

/**
 * <p>
 * The address is either outside the serviceable area for your region, or an error occurred. Check the address with your
 * region's carrier and try again. If the issue persists, contact AWS Support.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnsupportedAddressException extends com.amazonaws.services.snowball.model.AmazonSnowballException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new UnsupportedAddressException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public UnsupportedAddressException(String message) {
        super(message);
    }

}
