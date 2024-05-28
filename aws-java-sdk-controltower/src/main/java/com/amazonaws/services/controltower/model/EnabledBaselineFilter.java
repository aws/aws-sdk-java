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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A filter applied on the <code>ListEnabledBaseline</code> operation. Allowed filters are
 * <code>baselineIdentifiers</code> and <code>targetIdentifiers</code>. The filter can be applied for either, or both.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/EnabledBaselineFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnabledBaselineFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifiers for the <code>Baseline</code> objects returned as part of the filter operation.
     * </p>
     */
    private java.util.List<String> baselineIdentifiers;
    /**
     * <p>
     * Identifiers for the targets of the <code>Baseline</code> filter operation.
     * </p>
     */
    private java.util.List<String> targetIdentifiers;

    /**
     * <p>
     * Identifiers for the <code>Baseline</code> objects returned as part of the filter operation.
     * </p>
     * 
     * @return Identifiers for the <code>Baseline</code> objects returned as part of the filter operation.
     */

    public java.util.List<String> getBaselineIdentifiers() {
        return baselineIdentifiers;
    }

    /**
     * <p>
     * Identifiers for the <code>Baseline</code> objects returned as part of the filter operation.
     * </p>
     * 
     * @param baselineIdentifiers
     *        Identifiers for the <code>Baseline</code> objects returned as part of the filter operation.
     */

    public void setBaselineIdentifiers(java.util.Collection<String> baselineIdentifiers) {
        if (baselineIdentifiers == null) {
            this.baselineIdentifiers = null;
            return;
        }

        this.baselineIdentifiers = new java.util.ArrayList<String>(baselineIdentifiers);
    }

    /**
     * <p>
     * Identifiers for the <code>Baseline</code> objects returned as part of the filter operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBaselineIdentifiers(java.util.Collection)} or {@link #withBaselineIdentifiers(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param baselineIdentifiers
     *        Identifiers for the <code>Baseline</code> objects returned as part of the filter operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnabledBaselineFilter withBaselineIdentifiers(String... baselineIdentifiers) {
        if (this.baselineIdentifiers == null) {
            setBaselineIdentifiers(new java.util.ArrayList<String>(baselineIdentifiers.length));
        }
        for (String ele : baselineIdentifiers) {
            this.baselineIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Identifiers for the <code>Baseline</code> objects returned as part of the filter operation.
     * </p>
     * 
     * @param baselineIdentifiers
     *        Identifiers for the <code>Baseline</code> objects returned as part of the filter operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnabledBaselineFilter withBaselineIdentifiers(java.util.Collection<String> baselineIdentifiers) {
        setBaselineIdentifiers(baselineIdentifiers);
        return this;
    }

    /**
     * <p>
     * Identifiers for the targets of the <code>Baseline</code> filter operation.
     * </p>
     * 
     * @return Identifiers for the targets of the <code>Baseline</code> filter operation.
     */

    public java.util.List<String> getTargetIdentifiers() {
        return targetIdentifiers;
    }

    /**
     * <p>
     * Identifiers for the targets of the <code>Baseline</code> filter operation.
     * </p>
     * 
     * @param targetIdentifiers
     *        Identifiers for the targets of the <code>Baseline</code> filter operation.
     */

    public void setTargetIdentifiers(java.util.Collection<String> targetIdentifiers) {
        if (targetIdentifiers == null) {
            this.targetIdentifiers = null;
            return;
        }

        this.targetIdentifiers = new java.util.ArrayList<String>(targetIdentifiers);
    }

    /**
     * <p>
     * Identifiers for the targets of the <code>Baseline</code> filter operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetIdentifiers(java.util.Collection)} or {@link #withTargetIdentifiers(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param targetIdentifiers
     *        Identifiers for the targets of the <code>Baseline</code> filter operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnabledBaselineFilter withTargetIdentifiers(String... targetIdentifiers) {
        if (this.targetIdentifiers == null) {
            setTargetIdentifiers(new java.util.ArrayList<String>(targetIdentifiers.length));
        }
        for (String ele : targetIdentifiers) {
            this.targetIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Identifiers for the targets of the <code>Baseline</code> filter operation.
     * </p>
     * 
     * @param targetIdentifiers
     *        Identifiers for the targets of the <code>Baseline</code> filter operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnabledBaselineFilter withTargetIdentifiers(java.util.Collection<String> targetIdentifiers) {
        setTargetIdentifiers(targetIdentifiers);
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
        if (getBaselineIdentifiers() != null)
            sb.append("BaselineIdentifiers: ").append(getBaselineIdentifiers()).append(",");
        if (getTargetIdentifiers() != null)
            sb.append("TargetIdentifiers: ").append(getTargetIdentifiers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnabledBaselineFilter == false)
            return false;
        EnabledBaselineFilter other = (EnabledBaselineFilter) obj;
        if (other.getBaselineIdentifiers() == null ^ this.getBaselineIdentifiers() == null)
            return false;
        if (other.getBaselineIdentifiers() != null && other.getBaselineIdentifiers().equals(this.getBaselineIdentifiers()) == false)
            return false;
        if (other.getTargetIdentifiers() == null ^ this.getTargetIdentifiers() == null)
            return false;
        if (other.getTargetIdentifiers() != null && other.getTargetIdentifiers().equals(this.getTargetIdentifiers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaselineIdentifiers() == null) ? 0 : getBaselineIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getTargetIdentifiers() == null) ? 0 : getTargetIdentifiers().hashCode());
        return hashCode;
    }

    @Override
    public EnabledBaselineFilter clone() {
        try {
            return (EnabledBaselineFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.controltower.model.transform.EnabledBaselineFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
