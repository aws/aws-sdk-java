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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/UpdateResourceShare" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateResourceShareResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the resource share.
     * </p>
     */
    private ResourceShare resourceShare;
    /**
     * <p>
     * The idempotency identifier associated with this request. If you want to repeat the same operation in an
     * idempotent manner then you must include this value in the <code>clientToken</code> request parameter of that
     * later call. All other parameters must also have the same values that you used in the first call.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * Information about the resource share.
     * </p>
     * 
     * @param resourceShare
     *        Information about the resource share.
     */

    public void setResourceShare(ResourceShare resourceShare) {
        this.resourceShare = resourceShare;
    }

    /**
     * <p>
     * Information about the resource share.
     * </p>
     * 
     * @return Information about the resource share.
     */

    public ResourceShare getResourceShare() {
        return this.resourceShare;
    }

    /**
     * <p>
     * Information about the resource share.
     * </p>
     * 
     * @param resourceShare
     *        Information about the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceShareResult withResourceShare(ResourceShare resourceShare) {
        setResourceShare(resourceShare);
        return this;
    }

    /**
     * <p>
     * The idempotency identifier associated with this request. If you want to repeat the same operation in an
     * idempotent manner then you must include this value in the <code>clientToken</code> request parameter of that
     * later call. All other parameters must also have the same values that you used in the first call.
     * </p>
     * 
     * @param clientToken
     *        The idempotency identifier associated with this request. If you want to repeat the same operation in an
     *        idempotent manner then you must include this value in the <code>clientToken</code> request parameter of
     *        that later call. All other parameters must also have the same values that you used in the first call.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency identifier associated with this request. If you want to repeat the same operation in an
     * idempotent manner then you must include this value in the <code>clientToken</code> request parameter of that
     * later call. All other parameters must also have the same values that you used in the first call.
     * </p>
     * 
     * @return The idempotency identifier associated with this request. If you want to repeat the same operation in an
     *         idempotent manner then you must include this value in the <code>clientToken</code> request parameter of
     *         that later call. All other parameters must also have the same values that you used in the first call.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The idempotency identifier associated with this request. If you want to repeat the same operation in an
     * idempotent manner then you must include this value in the <code>clientToken</code> request parameter of that
     * later call. All other parameters must also have the same values that you used in the first call.
     * </p>
     * 
     * @param clientToken
     *        The idempotency identifier associated with this request. If you want to repeat the same operation in an
     *        idempotent manner then you must include this value in the <code>clientToken</code> request parameter of
     *        that later call. All other parameters must also have the same values that you used in the first call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceShareResult withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getResourceShare() != null)
            sb.append("ResourceShare: ").append(getResourceShare()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateResourceShareResult == false)
            return false;
        UpdateResourceShareResult other = (UpdateResourceShareResult) obj;
        if (other.getResourceShare() == null ^ this.getResourceShare() == null)
            return false;
        if (other.getResourceShare() != null && other.getResourceShare().equals(this.getResourceShare()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceShare() == null) ? 0 : getResourceShare().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateResourceShareResult clone() {
        try {
            return (UpdateResourceShareResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
