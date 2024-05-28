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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DisassociateWorkspaceApplication"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateWorkspaceApplicationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the targeted association.
     * </p>
     */
    private WorkspaceResourceAssociation association;

    /**
     * <p>
     * Information about the targeted association.
     * </p>
     * 
     * @param association
     *        Information about the targeted association.
     */

    public void setAssociation(WorkspaceResourceAssociation association) {
        this.association = association;
    }

    /**
     * <p>
     * Information about the targeted association.
     * </p>
     * 
     * @return Information about the targeted association.
     */

    public WorkspaceResourceAssociation getAssociation() {
        return this.association;
    }

    /**
     * <p>
     * Information about the targeted association.
     * </p>
     * 
     * @param association
     *        Information about the targeted association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateWorkspaceApplicationResult withAssociation(WorkspaceResourceAssociation association) {
        setAssociation(association);
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
        if (getAssociation() != null)
            sb.append("Association: ").append(getAssociation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateWorkspaceApplicationResult == false)
            return false;
        DisassociateWorkspaceApplicationResult other = (DisassociateWorkspaceApplicationResult) obj;
        if (other.getAssociation() == null ^ this.getAssociation() == null)
            return false;
        if (other.getAssociation() != null && other.getAssociation().equals(this.getAssociation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociation() == null) ? 0 : getAssociation().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateWorkspaceApplicationResult clone() {
        try {
            return (DisassociateWorkspaceApplicationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
