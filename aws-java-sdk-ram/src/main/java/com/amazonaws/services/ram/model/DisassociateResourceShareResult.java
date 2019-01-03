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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/DisassociateResourceShare" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateResourceShareResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the associations.
     * </p>
     */
    private java.util.List<ResourceShareAssociation> resourceShareAssociations;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * Information about the associations.
     * </p>
     * 
     * @return Information about the associations.
     */

    public java.util.List<ResourceShareAssociation> getResourceShareAssociations() {
        return resourceShareAssociations;
    }

    /**
     * <p>
     * Information about the associations.
     * </p>
     * 
     * @param resourceShareAssociations
     *        Information about the associations.
     */

    public void setResourceShareAssociations(java.util.Collection<ResourceShareAssociation> resourceShareAssociations) {
        if (resourceShareAssociations == null) {
            this.resourceShareAssociations = null;
            return;
        }

        this.resourceShareAssociations = new java.util.ArrayList<ResourceShareAssociation>(resourceShareAssociations);
    }

    /**
     * <p>
     * Information about the associations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceShareAssociations(java.util.Collection)} or
     * {@link #withResourceShareAssociations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param resourceShareAssociations
     *        Information about the associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateResourceShareResult withResourceShareAssociations(ResourceShareAssociation... resourceShareAssociations) {
        if (this.resourceShareAssociations == null) {
            setResourceShareAssociations(new java.util.ArrayList<ResourceShareAssociation>(resourceShareAssociations.length));
        }
        for (ResourceShareAssociation ele : resourceShareAssociations) {
            this.resourceShareAssociations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the associations.
     * </p>
     * 
     * @param resourceShareAssociations
     *        Information about the associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateResourceShareResult withResourceShareAssociations(java.util.Collection<ResourceShareAssociation> resourceShareAssociations) {
        setResourceShareAssociations(resourceShareAssociations);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateResourceShareResult withClientToken(String clientToken) {
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
        if (getResourceShareAssociations() != null)
            sb.append("ResourceShareAssociations: ").append(getResourceShareAssociations()).append(",");
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

        if (obj instanceof DisassociateResourceShareResult == false)
            return false;
        DisassociateResourceShareResult other = (DisassociateResourceShareResult) obj;
        if (other.getResourceShareAssociations() == null ^ this.getResourceShareAssociations() == null)
            return false;
        if (other.getResourceShareAssociations() != null && other.getResourceShareAssociations().equals(this.getResourceShareAssociations()) == false)
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

        hashCode = prime * hashCode + ((getResourceShareAssociations() == null) ? 0 : getResourceShareAssociations().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateResourceShareResult clone() {
        try {
            return (DisassociateResourceShareResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
