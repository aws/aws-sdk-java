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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIpamScopeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the created scope.
     * </p>
     */
    private IpamScope ipamScope;

    /**
     * <p>
     * Information about the created scope.
     * </p>
     * 
     * @param ipamScope
     *        Information about the created scope.
     */

    public void setIpamScope(IpamScope ipamScope) {
        this.ipamScope = ipamScope;
    }

    /**
     * <p>
     * Information about the created scope.
     * </p>
     * 
     * @return Information about the created scope.
     */

    public IpamScope getIpamScope() {
        return this.ipamScope;
    }

    /**
     * <p>
     * Information about the created scope.
     * </p>
     * 
     * @param ipamScope
     *        Information about the created scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIpamScopeResult withIpamScope(IpamScope ipamScope) {
        setIpamScope(ipamScope);
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
        if (getIpamScope() != null)
            sb.append("IpamScope: ").append(getIpamScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIpamScopeResult == false)
            return false;
        CreateIpamScopeResult other = (CreateIpamScopeResult) obj;
        if (other.getIpamScope() == null ^ this.getIpamScope() == null)
            return false;
        if (other.getIpamScope() != null && other.getIpamScope().equals(this.getIpamScope()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpamScope() == null) ? 0 : getIpamScope().hashCode());
        return hashCode;
    }

    @Override
    public CreateIpamScopeResult clone() {
        try {
            return (CreateIpamScopeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
