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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A container for the prefix-level storage metrics for S3 Storage Lens.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PrefixLevelStorageMetrics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrefixLevelStorageMetrics implements Serializable, Cloneable {

    /**
     * <p>
     * A container for whether prefix-level storage metrics are enabled.
     * </p>
     */
    private Boolean isEnabled;

    private SelectionCriteria selectionCriteria;

    /**
     * <p>
     * A container for whether prefix-level storage metrics are enabled.
     * </p>
     * 
     * @param isEnabled
     *        A container for whether prefix-level storage metrics are enabled.
     */

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * <p>
     * A container for whether prefix-level storage metrics are enabled.
     * </p>
     * 
     * @return A container for whether prefix-level storage metrics are enabled.
     */

    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * <p>
     * A container for whether prefix-level storage metrics are enabled.
     * </p>
     * 
     * @param isEnabled
     *        A container for whether prefix-level storage metrics are enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrefixLevelStorageMetrics withIsEnabled(Boolean isEnabled) {
        setIsEnabled(isEnabled);
        return this;
    }

    /**
     * <p>
     * A container for whether prefix-level storage metrics are enabled.
     * </p>
     * 
     * @return A container for whether prefix-level storage metrics are enabled.
     */

    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * @param selectionCriteria
     */

    public void setSelectionCriteria(SelectionCriteria selectionCriteria) {
        this.selectionCriteria = selectionCriteria;
    }

    /**
     * @return
     */

    public SelectionCriteria getSelectionCriteria() {
        return this.selectionCriteria;
    }

    /**
     * @param selectionCriteria
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrefixLevelStorageMetrics withSelectionCriteria(SelectionCriteria selectionCriteria) {
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
        if (getIsEnabled() != null)
            sb.append("IsEnabled: ").append(getIsEnabled()).append(",");
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

        if (obj instanceof PrefixLevelStorageMetrics == false)
            return false;
        PrefixLevelStorageMetrics other = (PrefixLevelStorageMetrics) obj;
        if (other.getIsEnabled() == null ^ this.getIsEnabled() == null)
            return false;
        if (other.getIsEnabled() != null && other.getIsEnabled().equals(this.getIsEnabled()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getIsEnabled() == null) ? 0 : getIsEnabled().hashCode());
        hashCode = prime * hashCode + ((getSelectionCriteria() == null) ? 0 : getSelectionCriteria().hashCode());
        return hashCode;
    }

    @Override
    public PrefixLevelStorageMetrics clone() {
        try {
            return (PrefixLevelStorageMetrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
