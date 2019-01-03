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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateAssociation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAssociationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The description of the association that was updated.
     * </p>
     */
    private AssociationDescription associationDescription;

    /**
     * <p>
     * The description of the association that was updated.
     * </p>
     * 
     * @param associationDescription
     *        The description of the association that was updated.
     */

    public void setAssociationDescription(AssociationDescription associationDescription) {
        this.associationDescription = associationDescription;
    }

    /**
     * <p>
     * The description of the association that was updated.
     * </p>
     * 
     * @return The description of the association that was updated.
     */

    public AssociationDescription getAssociationDescription() {
        return this.associationDescription;
    }

    /**
     * <p>
     * The description of the association that was updated.
     * </p>
     * 
     * @param associationDescription
     *        The description of the association that was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAssociationResult withAssociationDescription(AssociationDescription associationDescription) {
        setAssociationDescription(associationDescription);
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
        if (getAssociationDescription() != null)
            sb.append("AssociationDescription: ").append(getAssociationDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAssociationResult == false)
            return false;
        UpdateAssociationResult other = (UpdateAssociationResult) obj;
        if (other.getAssociationDescription() == null ^ this.getAssociationDescription() == null)
            return false;
        if (other.getAssociationDescription() != null && other.getAssociationDescription().equals(this.getAssociationDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationDescription() == null) ? 0 : getAssociationDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAssociationResult clone() {
        try {
            return (UpdateAssociationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
