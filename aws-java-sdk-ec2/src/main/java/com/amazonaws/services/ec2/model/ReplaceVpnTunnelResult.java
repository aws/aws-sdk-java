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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplaceVpnTunnelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Confirmation of replace tunnel operation.
     * </p>
     */
    private Boolean returnValue;

    /**
     * <p>
     * Confirmation of replace tunnel operation.
     * </p>
     * 
     * @param returnValue
     *        Confirmation of replace tunnel operation.
     */

    public void setReturn(Boolean returnValue) {
        this.returnValue = returnValue;
    }

    /**
     * <p>
     * Confirmation of replace tunnel operation.
     * </p>
     * 
     * @return Confirmation of replace tunnel operation.
     */

    public Boolean getReturn() {
        return this.returnValue;
    }

    /**
     * <p>
     * Confirmation of replace tunnel operation.
     * </p>
     * 
     * @param returnValue
     *        Confirmation of replace tunnel operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplaceVpnTunnelResult withReturn(Boolean returnValue) {
        setReturn(returnValue);
        return this;
    }

    /**
     * <p>
     * Confirmation of replace tunnel operation.
     * </p>
     * 
     * @return Confirmation of replace tunnel operation.
     */

    public Boolean isReturn() {
        return this.returnValue;
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
        if (getReturn() != null)
            sb.append("Return: ").append(getReturn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplaceVpnTunnelResult == false)
            return false;
        ReplaceVpnTunnelResult other = (ReplaceVpnTunnelResult) obj;
        if (other.getReturn() == null ^ this.getReturn() == null)
            return false;
        if (other.getReturn() != null && other.getReturn().equals(this.getReturn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReturn() == null) ? 0 : getReturn().hashCode());
        return hashCode;
    }

    @Override
    public ReplaceVpnTunnelResult clone() {
        try {
            return (ReplaceVpnTunnelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
