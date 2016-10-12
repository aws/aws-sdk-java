/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

/**
 * 
 */
public class ListAllowedNodeTypeModificationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    private com.amazonaws.internal.SdkInternalList<String> scaleUpModifications;

    /**
     * @return
     */

    public java.util.List<String> getScaleUpModifications() {
        if (scaleUpModifications == null) {
            scaleUpModifications = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return scaleUpModifications;
    }

    /**
     * @param scaleUpModifications
     */

    public void setScaleUpModifications(java.util.Collection<String> scaleUpModifications) {
        if (scaleUpModifications == null) {
            this.scaleUpModifications = null;
            return;
        }

        this.scaleUpModifications = new com.amazonaws.internal.SdkInternalList<String>(scaleUpModifications);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScaleUpModifications(java.util.Collection)} or {@link #withScaleUpModifications(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param scaleUpModifications
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAllowedNodeTypeModificationsResult withScaleUpModifications(String... scaleUpModifications) {
        if (this.scaleUpModifications == null) {
            setScaleUpModifications(new com.amazonaws.internal.SdkInternalList<String>(scaleUpModifications.length));
        }
        for (String ele : scaleUpModifications) {
            this.scaleUpModifications.add(ele);
        }
        return this;
    }

    /**
     * @param scaleUpModifications
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAllowedNodeTypeModificationsResult withScaleUpModifications(java.util.Collection<String> scaleUpModifications) {
        setScaleUpModifications(scaleUpModifications);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getScaleUpModifications() != null)
            sb.append("ScaleUpModifications: " + getScaleUpModifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAllowedNodeTypeModificationsResult == false)
            return false;
        ListAllowedNodeTypeModificationsResult other = (ListAllowedNodeTypeModificationsResult) obj;
        if (other.getScaleUpModifications() == null ^ this.getScaleUpModifications() == null)
            return false;
        if (other.getScaleUpModifications() != null && other.getScaleUpModifications().equals(this.getScaleUpModifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScaleUpModifications() == null) ? 0 : getScaleUpModifications().hashCode());
        return hashCode;
    }

    @Override
    public ListAllowedNodeTypeModificationsResult clone() {
        try {
            return (ListAllowedNodeTypeModificationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
