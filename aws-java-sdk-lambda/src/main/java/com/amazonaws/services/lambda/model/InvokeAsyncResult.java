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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A success response (<code>202 Accepted</code>) indicates that the request is queued for invocation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/InvokeAsync" target="_top">AWS API
 *      Documentation</a>
 */
@Deprecated
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvokeAsyncResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status code.
     * </p>
     */
    private Integer status;

    /**
     * <p>
     * The status code.
     * </p>
     * 
     * @param status
     *        The status code.
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The status code.
     * </p>
     * 
     * @return The status code.
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status code.
     * </p>
     * 
     * @param status
     *        The status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvokeAsyncResult withStatus(Integer status) {
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

        if (obj instanceof InvokeAsyncResult == false)
            return false;
        InvokeAsyncResult other = (InvokeAsyncResult) obj;
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
    public InvokeAsyncResult clone() {
        try {
            return (InvokeAsyncResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
