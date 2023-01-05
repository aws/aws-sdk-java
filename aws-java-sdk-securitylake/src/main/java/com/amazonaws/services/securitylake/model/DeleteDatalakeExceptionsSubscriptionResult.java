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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/DeleteDatalakeExceptionsSubscription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDatalakeExceptionsSubscriptionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Retrieves the status of the delete Security Lake operation for an account.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Retrieves the status of the delete Security Lake operation for an account.
     * </p>
     * 
     * @param status
     *        Retrieves the status of the delete Security Lake operation for an account.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Retrieves the status of the delete Security Lake operation for an account.
     * </p>
     * 
     * @return Retrieves the status of the delete Security Lake operation for an account.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Retrieves the status of the delete Security Lake operation for an account.
     * </p>
     * 
     * @param status
     *        Retrieves the status of the delete Security Lake operation for an account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDatalakeExceptionsSubscriptionResult withStatus(String status) {
        setStatus(status);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDatalakeExceptionsSubscriptionResult == false)
            return false;
        DeleteDatalakeExceptionsSubscriptionResult other = (DeleteDatalakeExceptionsSubscriptionResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDatalakeExceptionsSubscriptionResult clone() {
        try {
            return (DeleteDatalakeExceptionsSubscriptionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
