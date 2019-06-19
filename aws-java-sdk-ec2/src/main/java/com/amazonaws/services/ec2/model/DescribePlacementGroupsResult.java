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
public class DescribePlacementGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the placement groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PlacementGroup> placementGroups;

    /**
     * <p>
     * Information about the placement groups.
     * </p>
     * 
     * @return Information about the placement groups.
     */

    public java.util.List<PlacementGroup> getPlacementGroups() {
        if (placementGroups == null) {
            placementGroups = new com.amazonaws.internal.SdkInternalList<PlacementGroup>();
        }
        return placementGroups;
    }

    /**
     * <p>
     * Information about the placement groups.
     * </p>
     * 
     * @param placementGroups
     *        Information about the placement groups.
     */

    public void setPlacementGroups(java.util.Collection<PlacementGroup> placementGroups) {
        if (placementGroups == null) {
            this.placementGroups = null;
            return;
        }

        this.placementGroups = new com.amazonaws.internal.SdkInternalList<PlacementGroup>(placementGroups);
    }

    /**
     * <p>
     * Information about the placement groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlacementGroups(java.util.Collection)} or {@link #withPlacementGroups(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param placementGroups
     *        Information about the placement groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePlacementGroupsResult withPlacementGroups(PlacementGroup... placementGroups) {
        if (this.placementGroups == null) {
            setPlacementGroups(new com.amazonaws.internal.SdkInternalList<PlacementGroup>(placementGroups.length));
        }
        for (PlacementGroup ele : placementGroups) {
            this.placementGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the placement groups.
     * </p>
     * 
     * @param placementGroups
     *        Information about the placement groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePlacementGroupsResult withPlacementGroups(java.util.Collection<PlacementGroup> placementGroups) {
        setPlacementGroups(placementGroups);
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
        if (getPlacementGroups() != null)
            sb.append("PlacementGroups: ").append(getPlacementGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePlacementGroupsResult == false)
            return false;
        DescribePlacementGroupsResult other = (DescribePlacementGroupsResult) obj;
        if (other.getPlacementGroups() == null ^ this.getPlacementGroups() == null)
            return false;
        if (other.getPlacementGroups() != null && other.getPlacementGroups().equals(this.getPlacementGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlacementGroups() == null) ? 0 : getPlacementGroups().hashCode());
        return hashCode;
    }

    @Override
    public DescribePlacementGroupsResult clone() {
        try {
            return (DescribePlacementGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
