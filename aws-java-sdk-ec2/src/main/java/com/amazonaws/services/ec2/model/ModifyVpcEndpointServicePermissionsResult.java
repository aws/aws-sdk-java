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
public class ModifyVpcEndpointServicePermissionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the added principals.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AddedPrincipal> addedPrincipals;
    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, it returns an error.
     * </p>
     */
    private Boolean returnValue;

    /**
     * <p>
     * Information about the added principals.
     * </p>
     * 
     * @return Information about the added principals.
     */

    public java.util.List<AddedPrincipal> getAddedPrincipals() {
        if (addedPrincipals == null) {
            addedPrincipals = new com.amazonaws.internal.SdkInternalList<AddedPrincipal>();
        }
        return addedPrincipals;
    }

    /**
     * <p>
     * Information about the added principals.
     * </p>
     * 
     * @param addedPrincipals
     *        Information about the added principals.
     */

    public void setAddedPrincipals(java.util.Collection<AddedPrincipal> addedPrincipals) {
        if (addedPrincipals == null) {
            this.addedPrincipals = null;
            return;
        }

        this.addedPrincipals = new com.amazonaws.internal.SdkInternalList<AddedPrincipal>(addedPrincipals);
    }

    /**
     * <p>
     * Information about the added principals.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddedPrincipals(java.util.Collection)} or {@link #withAddedPrincipals(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param addedPrincipals
     *        Information about the added principals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointServicePermissionsResult withAddedPrincipals(AddedPrincipal... addedPrincipals) {
        if (this.addedPrincipals == null) {
            setAddedPrincipals(new com.amazonaws.internal.SdkInternalList<AddedPrincipal>(addedPrincipals.length));
        }
        for (AddedPrincipal ele : addedPrincipals) {
            this.addedPrincipals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the added principals.
     * </p>
     * 
     * @param addedPrincipals
     *        Information about the added principals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointServicePermissionsResult withAddedPrincipals(java.util.Collection<AddedPrincipal> addedPrincipals) {
        setAddedPrincipals(addedPrincipals);
        return this;
    }

    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, it returns an error.
     * </p>
     * 
     * @param returnValue
     *        Returns <code>true</code> if the request succeeds; otherwise, it returns an error.
     */

    public void setReturnValue(Boolean returnValue) {
        this.returnValue = returnValue;
    }

    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, it returns an error.
     * </p>
     * 
     * @return Returns <code>true</code> if the request succeeds; otherwise, it returns an error.
     */

    public Boolean getReturnValue() {
        return this.returnValue;
    }

    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, it returns an error.
     * </p>
     * 
     * @param returnValue
     *        Returns <code>true</code> if the request succeeds; otherwise, it returns an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointServicePermissionsResult withReturnValue(Boolean returnValue) {
        setReturnValue(returnValue);
        return this;
    }

    /**
     * <p>
     * Returns <code>true</code> if the request succeeds; otherwise, it returns an error.
     * </p>
     * 
     * @return Returns <code>true</code> if the request succeeds; otherwise, it returns an error.
     */

    public Boolean isReturnValue() {
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
        if (getAddedPrincipals() != null)
            sb.append("AddedPrincipals: ").append(getAddedPrincipals()).append(",");
        if (getReturnValue() != null)
            sb.append("ReturnValue: ").append(getReturnValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVpcEndpointServicePermissionsResult == false)
            return false;
        ModifyVpcEndpointServicePermissionsResult other = (ModifyVpcEndpointServicePermissionsResult) obj;
        if (other.getAddedPrincipals() == null ^ this.getAddedPrincipals() == null)
            return false;
        if (other.getAddedPrincipals() != null && other.getAddedPrincipals().equals(this.getAddedPrincipals()) == false)
            return false;
        if (other.getReturnValue() == null ^ this.getReturnValue() == null)
            return false;
        if (other.getReturnValue() != null && other.getReturnValue().equals(this.getReturnValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddedPrincipals() == null) ? 0 : getAddedPrincipals().hashCode());
        hashCode = prime * hashCode + ((getReturnValue() == null) ? 0 : getReturnValue().hashCode());
        return hashCode;
    }

    @Override
    public ModifyVpcEndpointServicePermissionsResult clone() {
        try {
            return (ModifyVpcEndpointServicePermissionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
