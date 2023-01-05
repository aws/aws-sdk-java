/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateDatalakeExceptionsExpiry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDatalakeExceptionsExpiryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The time-to-live (TTL) for the exception message to remain.
     * </p>
     */
    private Long exceptionMessageExpiry;

    /**
     * <p>
     * The time-to-live (TTL) for the exception message to remain.
     * </p>
     * 
     * @param exceptionMessageExpiry
     *        The time-to-live (TTL) for the exception message to remain.
     */

    public void setExceptionMessageExpiry(Long exceptionMessageExpiry) {
        this.exceptionMessageExpiry = exceptionMessageExpiry;
    }

    /**
     * <p>
     * The time-to-live (TTL) for the exception message to remain.
     * </p>
     * 
     * @return The time-to-live (TTL) for the exception message to remain.
     */

    public Long getExceptionMessageExpiry() {
        return this.exceptionMessageExpiry;
    }

    /**
     * <p>
     * The time-to-live (TTL) for the exception message to remain.
     * </p>
     * 
     * @param exceptionMessageExpiry
     *        The time-to-live (TTL) for the exception message to remain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatalakeExceptionsExpiryRequest withExceptionMessageExpiry(Long exceptionMessageExpiry) {
        setExceptionMessageExpiry(exceptionMessageExpiry);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getExceptionMessageExpiry() != null)
            sb.append("ExceptionMessageExpiry: ").append(getExceptionMessageExpiry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDatalakeExceptionsExpiryRequest == false)
            return false;
        UpdateDatalakeExceptionsExpiryRequest other = (UpdateDatalakeExceptionsExpiryRequest) obj;
        if (other.getExceptionMessageExpiry() == null ^ this.getExceptionMessageExpiry() == null)
            return false;
        if (other.getExceptionMessageExpiry() != null && other.getExceptionMessageExpiry().equals(this.getExceptionMessageExpiry()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExceptionMessageExpiry() == null) ? 0 : getExceptionMessageExpiry().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDatalakeExceptionsExpiryRequest clone() {
        return (UpdateDatalakeExceptionsExpiryRequest) super.clone();
    }

}
