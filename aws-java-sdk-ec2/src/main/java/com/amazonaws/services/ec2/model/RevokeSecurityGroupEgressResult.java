/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class RevokeSecurityGroupEgressResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, returns an error.
     * </p>
     */
    private Boolean returnValue;
    /**
     * <p>
     * The outbound rules that were unknown to the service. In some cases, <code>unknownIpPermissionSet</code> might be
     * in a different format from the request parameter.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IpPermission> unknownIpPermissions;

    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, returns an error.
     * </p>
     * 
     * @param returnValue
     *        Returns <code>true</code> if the request succeeds; otherwise, returns an error.
     */

    public void setReturn(Boolean returnValue) {
        this.returnValue = returnValue;
    }

    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, returns an error.
     * </p>
     * 
     * @return Returns <code>true</code> if the request succeeds; otherwise, returns an error.
     */

    public Boolean getReturn() {
        return this.returnValue;
    }

    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, returns an error.
     * </p>
     * 
     * @param returnValue
     *        Returns <code>true</code> if the request succeeds; otherwise, returns an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSecurityGroupEgressResult withReturn(Boolean returnValue) {
        setReturn(returnValue);
        return this;
    }

    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, returns an error.
     * </p>
     * 
     * @return Returns <code>true</code> if the request succeeds; otherwise, returns an error.
     */

    public Boolean isReturn() {
        return this.returnValue;
    }

    /**
     * <p>
     * The outbound rules that were unknown to the service. In some cases, <code>unknownIpPermissionSet</code> might be
     * in a different format from the request parameter.
     * </p>
     * 
     * @return The outbound rules that were unknown to the service. In some cases, <code>unknownIpPermissionSet</code>
     *         might be in a different format from the request parameter.
     */

    public java.util.List<IpPermission> getUnknownIpPermissions() {
        if (unknownIpPermissions == null) {
            unknownIpPermissions = new com.amazonaws.internal.SdkInternalList<IpPermission>();
        }
        return unknownIpPermissions;
    }

    /**
     * <p>
     * The outbound rules that were unknown to the service. In some cases, <code>unknownIpPermissionSet</code> might be
     * in a different format from the request parameter.
     * </p>
     * 
     * @param unknownIpPermissions
     *        The outbound rules that were unknown to the service. In some cases, <code>unknownIpPermissionSet</code>
     *        might be in a different format from the request parameter.
     */

    public void setUnknownIpPermissions(java.util.Collection<IpPermission> unknownIpPermissions) {
        if (unknownIpPermissions == null) {
            this.unknownIpPermissions = null;
            return;
        }

        this.unknownIpPermissions = new com.amazonaws.internal.SdkInternalList<IpPermission>(unknownIpPermissions);
    }

    /**
     * <p>
     * The outbound rules that were unknown to the service. In some cases, <code>unknownIpPermissionSet</code> might be
     * in a different format from the request parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnknownIpPermissions(java.util.Collection)} or {@link #withUnknownIpPermissions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param unknownIpPermissions
     *        The outbound rules that were unknown to the service. In some cases, <code>unknownIpPermissionSet</code>
     *        might be in a different format from the request parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSecurityGroupEgressResult withUnknownIpPermissions(IpPermission... unknownIpPermissions) {
        if (this.unknownIpPermissions == null) {
            setUnknownIpPermissions(new com.amazonaws.internal.SdkInternalList<IpPermission>(unknownIpPermissions.length));
        }
        for (IpPermission ele : unknownIpPermissions) {
            this.unknownIpPermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The outbound rules that were unknown to the service. In some cases, <code>unknownIpPermissionSet</code> might be
     * in a different format from the request parameter.
     * </p>
     * 
     * @param unknownIpPermissions
     *        The outbound rules that were unknown to the service. In some cases, <code>unknownIpPermissionSet</code>
     *        might be in a different format from the request parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSecurityGroupEgressResult withUnknownIpPermissions(java.util.Collection<IpPermission> unknownIpPermissions) {
        setUnknownIpPermissions(unknownIpPermissions);
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
        if (getReturn() != null)
            sb.append("Return: ").append(getReturn()).append(",");
        if (getUnknownIpPermissions() != null)
            sb.append("UnknownIpPermissions: ").append(getUnknownIpPermissions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevokeSecurityGroupEgressResult == false)
            return false;
        RevokeSecurityGroupEgressResult other = (RevokeSecurityGroupEgressResult) obj;
        if (other.getReturn() == null ^ this.getReturn() == null)
            return false;
        if (other.getReturn() != null && other.getReturn().equals(this.getReturn()) == false)
            return false;
        if (other.getUnknownIpPermissions() == null ^ this.getUnknownIpPermissions() == null)
            return false;
        if (other.getUnknownIpPermissions() != null && other.getUnknownIpPermissions().equals(this.getUnknownIpPermissions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReturn() == null) ? 0 : getReturn().hashCode());
        hashCode = prime * hashCode + ((getUnknownIpPermissions() == null) ? 0 : getUnknownIpPermissions().hashCode());
        return hashCode;
    }

    @Override
    public RevokeSecurityGroupEgressResult clone() {
        try {
            return (RevokeSecurityGroupEgressResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
