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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ReplacePermissionAssociations" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplacePermissionAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Specifies a data structure that you can use to track the asynchronous tasks that RAM performs to complete this
     * operation. You can use the <a>ListReplacePermissionAssociationsWork</a> operation and pass the <code>id</code>
     * value returned in this structure.
     * </p>
     */
    private ReplacePermissionAssociationsWork replacePermissionAssociationsWork;
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
     * Specifies a data structure that you can use to track the asynchronous tasks that RAM performs to complete this
     * operation. You can use the <a>ListReplacePermissionAssociationsWork</a> operation and pass the <code>id</code>
     * value returned in this structure.
     * </p>
     * 
     * @param replacePermissionAssociationsWork
     *        Specifies a data structure that you can use to track the asynchronous tasks that RAM performs to complete
     *        this operation. You can use the <a>ListReplacePermissionAssociationsWork</a> operation and pass the
     *        <code>id</code> value returned in this structure.
     */

    public void setReplacePermissionAssociationsWork(ReplacePermissionAssociationsWork replacePermissionAssociationsWork) {
        this.replacePermissionAssociationsWork = replacePermissionAssociationsWork;
    }

    /**
     * <p>
     * Specifies a data structure that you can use to track the asynchronous tasks that RAM performs to complete this
     * operation. You can use the <a>ListReplacePermissionAssociationsWork</a> operation and pass the <code>id</code>
     * value returned in this structure.
     * </p>
     * 
     * @return Specifies a data structure that you can use to track the asynchronous tasks that RAM performs to complete
     *         this operation. You can use the <a>ListReplacePermissionAssociationsWork</a> operation and pass the
     *         <code>id</code> value returned in this structure.
     */

    public ReplacePermissionAssociationsWork getReplacePermissionAssociationsWork() {
        return this.replacePermissionAssociationsWork;
    }

    /**
     * <p>
     * Specifies a data structure that you can use to track the asynchronous tasks that RAM performs to complete this
     * operation. You can use the <a>ListReplacePermissionAssociationsWork</a> operation and pass the <code>id</code>
     * value returned in this structure.
     * </p>
     * 
     * @param replacePermissionAssociationsWork
     *        Specifies a data structure that you can use to track the asynchronous tasks that RAM performs to complete
     *        this operation. You can use the <a>ListReplacePermissionAssociationsWork</a> operation and pass the
     *        <code>id</code> value returned in this structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplacePermissionAssociationsResult withReplacePermissionAssociationsWork(ReplacePermissionAssociationsWork replacePermissionAssociationsWork) {
        setReplacePermissionAssociationsWork(replacePermissionAssociationsWork);
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

    public ReplacePermissionAssociationsResult withClientToken(String clientToken) {
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
        if (getReplacePermissionAssociationsWork() != null)
            sb.append("ReplacePermissionAssociationsWork: ").append(getReplacePermissionAssociationsWork()).append(",");
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

        if (obj instanceof ReplacePermissionAssociationsResult == false)
            return false;
        ReplacePermissionAssociationsResult other = (ReplacePermissionAssociationsResult) obj;
        if (other.getReplacePermissionAssociationsWork() == null ^ this.getReplacePermissionAssociationsWork() == null)
            return false;
        if (other.getReplacePermissionAssociationsWork() != null
                && other.getReplacePermissionAssociationsWork().equals(this.getReplacePermissionAssociationsWork()) == false)
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

        hashCode = prime * hashCode + ((getReplacePermissionAssociationsWork() == null) ? 0 : getReplacePermissionAssociationsWork().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public ReplacePermissionAssociationsResult clone() {
        try {
            return (ReplacePermissionAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
