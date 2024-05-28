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
package com.amazonaws.services.securitylake.model;

import javax.annotation.Generated;

/**
 * <p>
 * You do not have sufficient access to perform this action. Access denied errors appear when Amazon Security Lake
 * explicitly or implicitly denies an authorization request. An explicit denial occurs when a policy contains a Deny
 * statement for the specific Amazon Web Services action. An implicit denial occurs when there is no applicable Deny
 * statement and also no applicable Allow statement.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessDeniedException extends com.amazonaws.services.securitylake.model.AmazonSecurityLakeException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * A coded string to provide more information about the access denied exception. You can use the error code to check
     * the exception type.
     * </p>
     */
    private String errorCode;

    /**
     * Constructs a new AccessDeniedException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public AccessDeniedException(String message) {
        super(message);
    }

    /**
     * <p>
     * A coded string to provide more information about the access denied exception. You can use the error code to check
     * the exception type.
     * </p>
     * 
     * @param errorCode
     *        A coded string to provide more information about the access denied exception. You can use the error code
     *        to check the exception type.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * A coded string to provide more information about the access denied exception. You can use the error code to check
     * the exception type.
     * </p>
     * 
     * @return A coded string to provide more information about the access denied exception. You can use the error code
     *         to check the exception type.
     */

    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * A coded string to provide more information about the access denied exception. You can use the error code to check
     * the exception type.
     * </p>
     * 
     * @param errorCode
     *        A coded string to provide more information about the access denied exception. You can use the error code
     *        to check the exception type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessDeniedException withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

}
