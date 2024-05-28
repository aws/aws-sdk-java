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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Specifies the Storage Lens groups to include in the Storage Lens group aggregation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/StorageLensGroupLevel" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageLensGroupLevel implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates which Storage Lens group ARNs to include or exclude in the Storage Lens group aggregation. If this
     * value is left null, then all Storage Lens groups are selected.
     * </p>
     */
    private StorageLensGroupLevelSelectionCriteria selectionCriteria;

    /**
     * <p>
     * Indicates which Storage Lens group ARNs to include or exclude in the Storage Lens group aggregation. If this
     * value is left null, then all Storage Lens groups are selected.
     * </p>
     * 
     * @param selectionCriteria
     *        Indicates which Storage Lens group ARNs to include or exclude in the Storage Lens group aggregation. If
     *        this value is left null, then all Storage Lens groups are selected.
     */

    public void setSelectionCriteria(StorageLensGroupLevelSelectionCriteria selectionCriteria) {
        this.selectionCriteria = selectionCriteria;
    }

    /**
     * <p>
     * Indicates which Storage Lens group ARNs to include or exclude in the Storage Lens group aggregation. If this
     * value is left null, then all Storage Lens groups are selected.
     * </p>
     * 
     * @return Indicates which Storage Lens group ARNs to include or exclude in the Storage Lens group aggregation. If
     *         this value is left null, then all Storage Lens groups are selected.
     */

    public StorageLensGroupLevelSelectionCriteria getSelectionCriteria() {
        return this.selectionCriteria;
    }

    /**
     * <p>
     * Indicates which Storage Lens group ARNs to include or exclude in the Storage Lens group aggregation. If this
     * value is left null, then all Storage Lens groups are selected.
     * </p>
     * 
     * @param selectionCriteria
     *        Indicates which Storage Lens group ARNs to include or exclude in the Storage Lens group aggregation. If
     *        this value is left null, then all Storage Lens groups are selected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensGroupLevel withSelectionCriteria(StorageLensGroupLevelSelectionCriteria selectionCriteria) {
        setSelectionCriteria(selectionCriteria);
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
        if (getSelectionCriteria() != null)
            sb.append("SelectionCriteria: ").append(getSelectionCriteria());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorageLensGroupLevel == false)
            return false;
        StorageLensGroupLevel other = (StorageLensGroupLevel) obj;
        if (other.getSelectionCriteria() == null ^ this.getSelectionCriteria() == null)
            return false;
        if (other.getSelectionCriteria() != null && other.getSelectionCriteria().equals(this.getSelectionCriteria()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSelectionCriteria() == null) ? 0 : getSelectionCriteria().hashCode());
        return hashCode;
    }

    @Override
    public StorageLensGroupLevel clone() {
        try {
            return (StorageLensGroupLevel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
