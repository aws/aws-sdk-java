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
 * Indicates which Storage Lens group ARNs to include or exclude in the Storage Lens group aggregation. You can only
 * attach Storage Lens groups to your Storage Lens dashboard if they're included in your Storage Lens group aggregation.
 * If this value is left null, then all Storage Lens groups are selected.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/StorageLensGroupLevelSelectionCriteria"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageLensGroupLevelSelectionCriteria implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates which Storage Lens group ARNs to include in the Storage Lens group aggregation.
     * </p>
     */
    private java.util.List<String> include;
    /**
     * <p>
     * Indicates which Storage Lens group ARNs to exclude from the Storage Lens group aggregation.
     * </p>
     */
    private java.util.List<String> exclude;

    /**
     * <p>
     * Indicates which Storage Lens group ARNs to include in the Storage Lens group aggregation.
     * </p>
     * 
     * @return Indicates which Storage Lens group ARNs to include in the Storage Lens group aggregation.
     */

    public java.util.List<String> getInclude() {
        return include;
    }

    /**
     * <p>
     * Indicates which Storage Lens group ARNs to include in the Storage Lens group aggregation.
     * </p>
     * 
     * @param include
     *        Indicates which Storage Lens group ARNs to include in the Storage Lens group aggregation.
     */

    public void setInclude(java.util.Collection<String> include) {
        if (include == null) {
            this.include = null;
            return;
        }

        this.include = new java.util.ArrayList<String>(include);
    }

    /**
     * <p>
     * Indicates which Storage Lens group ARNs to include in the Storage Lens group aggregation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInclude(java.util.Collection)} or {@link #withInclude(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param include
     *        Indicates which Storage Lens group ARNs to include in the Storage Lens group aggregation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensGroupLevelSelectionCriteria withInclude(String... include) {
        if (this.include == null) {
            setInclude(new java.util.ArrayList<String>(include.length));
        }
        for (String ele : include) {
            this.include.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates which Storage Lens group ARNs to include in the Storage Lens group aggregation.
     * </p>
     * 
     * @param include
     *        Indicates which Storage Lens group ARNs to include in the Storage Lens group aggregation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensGroupLevelSelectionCriteria withInclude(java.util.Collection<String> include) {
        setInclude(include);
        return this;
    }

    /**
     * <p>
     * Indicates which Storage Lens group ARNs to exclude from the Storage Lens group aggregation.
     * </p>
     * 
     * @return Indicates which Storage Lens group ARNs to exclude from the Storage Lens group aggregation.
     */

    public java.util.List<String> getExclude() {
        return exclude;
    }

    /**
     * <p>
     * Indicates which Storage Lens group ARNs to exclude from the Storage Lens group aggregation.
     * </p>
     * 
     * @param exclude
     *        Indicates which Storage Lens group ARNs to exclude from the Storage Lens group aggregation.
     */

    public void setExclude(java.util.Collection<String> exclude) {
        if (exclude == null) {
            this.exclude = null;
            return;
        }

        this.exclude = new java.util.ArrayList<String>(exclude);
    }

    /**
     * <p>
     * Indicates which Storage Lens group ARNs to exclude from the Storage Lens group aggregation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExclude(java.util.Collection)} or {@link #withExclude(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param exclude
     *        Indicates which Storage Lens group ARNs to exclude from the Storage Lens group aggregation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensGroupLevelSelectionCriteria withExclude(String... exclude) {
        if (this.exclude == null) {
            setExclude(new java.util.ArrayList<String>(exclude.length));
        }
        for (String ele : exclude) {
            this.exclude.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates which Storage Lens group ARNs to exclude from the Storage Lens group aggregation.
     * </p>
     * 
     * @param exclude
     *        Indicates which Storage Lens group ARNs to exclude from the Storage Lens group aggregation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageLensGroupLevelSelectionCriteria withExclude(java.util.Collection<String> exclude) {
        setExclude(exclude);
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
        if (getInclude() != null)
            sb.append("Include: ").append(getInclude()).append(",");
        if (getExclude() != null)
            sb.append("Exclude: ").append(getExclude());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorageLensGroupLevelSelectionCriteria == false)
            return false;
        StorageLensGroupLevelSelectionCriteria other = (StorageLensGroupLevelSelectionCriteria) obj;
        if (other.getInclude() == null ^ this.getInclude() == null)
            return false;
        if (other.getInclude() != null && other.getInclude().equals(this.getInclude()) == false)
            return false;
        if (other.getExclude() == null ^ this.getExclude() == null)
            return false;
        if (other.getExclude() != null && other.getExclude().equals(this.getExclude()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInclude() == null) ? 0 : getInclude().hashCode());
        hashCode = prime * hashCode + ((getExclude() == null) ? 0 : getExclude().hashCode());
        return hashCode;
    }

    @Override
    public StorageLensGroupLevelSelectionCriteria clone() {
        try {
            return (StorageLensGroupLevelSelectionCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
