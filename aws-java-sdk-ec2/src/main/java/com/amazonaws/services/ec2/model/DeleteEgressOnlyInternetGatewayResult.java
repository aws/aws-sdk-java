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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteEgressOnlyInternetGatewayResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, it returns an error.
     * </p>
     */
    private Boolean returnCode;

    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, it returns an error.
     * </p>
     * 
     * @param returnCode
     *        Returns <code>true</code> if the request succeeds; otherwise, it returns an error.
     */

    public void setReturnCode(Boolean returnCode) {
        this.returnCode = returnCode;
    }

    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, it returns an error.
     * </p>
     * 
     * @return Returns <code>true</code> if the request succeeds; otherwise, it returns an error.
     */

    public Boolean getReturnCode() {
        return this.returnCode;
    }

    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, it returns an error.
     * </p>
     * 
     * @param returnCode
     *        Returns <code>true</code> if the request succeeds; otherwise, it returns an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEgressOnlyInternetGatewayResult withReturnCode(Boolean returnCode) {
        setReturnCode(returnCode);
        return this;
    }

    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, it returns an error.
     * </p>
     * 
     * @return Returns <code>true</code> if the request succeeds; otherwise, it returns an error.
     */

    public Boolean isReturnCode() {
        return this.returnCode;
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
        if (getReturnCode() != null)
            sb.append("ReturnCode: ").append(getReturnCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteEgressOnlyInternetGatewayResult == false)
            return false;
        DeleteEgressOnlyInternetGatewayResult other = (DeleteEgressOnlyInternetGatewayResult) obj;
        if (other.getReturnCode() == null ^ this.getReturnCode() == null)
            return false;
        if (other.getReturnCode() != null && other.getReturnCode().equals(this.getReturnCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReturnCode() == null) ? 0 : getReturnCode().hashCode());
        return hashCode;
    }

    @Override
    public DeleteEgressOnlyInternetGatewayResult clone() {
        try {
            return (DeleteEgressOnlyInternetGatewayResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
