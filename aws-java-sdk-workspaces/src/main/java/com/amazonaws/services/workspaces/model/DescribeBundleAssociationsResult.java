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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeBundleAssociations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBundleAssociationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of information about the specified associations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BundleResourceAssociation> associations;

    /**
     * <p>
     * List of information about the specified associations.
     * </p>
     * 
     * @return List of information about the specified associations.
     */

    public java.util.List<BundleResourceAssociation> getAssociations() {
        if (associations == null) {
            associations = new com.amazonaws.internal.SdkInternalList<BundleResourceAssociation>();
        }
        return associations;
    }

    /**
     * <p>
     * List of information about the specified associations.
     * </p>
     * 
     * @param associations
     *        List of information about the specified associations.
     */

    public void setAssociations(java.util.Collection<BundleResourceAssociation> associations) {
        if (associations == null) {
            this.associations = null;
            return;
        }

        this.associations = new com.amazonaws.internal.SdkInternalList<BundleResourceAssociation>(associations);
    }

    /**
     * <p>
     * List of information about the specified associations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociations(java.util.Collection)} or {@link #withAssociations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param associations
     *        List of information about the specified associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBundleAssociationsResult withAssociations(BundleResourceAssociation... associations) {
        if (this.associations == null) {
            setAssociations(new com.amazonaws.internal.SdkInternalList<BundleResourceAssociation>(associations.length));
        }
        for (BundleResourceAssociation ele : associations) {
            this.associations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of information about the specified associations.
     * </p>
     * 
     * @param associations
     *        List of information about the specified associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBundleAssociationsResult withAssociations(java.util.Collection<BundleResourceAssociation> associations) {
        setAssociations(associations);
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
        if (getAssociations() != null)
            sb.append("Associations: ").append(getAssociations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBundleAssociationsResult == false)
            return false;
        DescribeBundleAssociationsResult other = (DescribeBundleAssociationsResult) obj;
        if (other.getAssociations() == null ^ this.getAssociations() == null)
            return false;
        if (other.getAssociations() != null && other.getAssociations().equals(this.getAssociations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociations() == null) ? 0 : getAssociations().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBundleAssociationsResult clone() {
        try {
            return (DescribeBundleAssociationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
