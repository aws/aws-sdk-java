/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of filters to apply to the conformance pack compliance score result set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ConformancePackComplianceScoresFilters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConformancePackComplianceScoresFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The names of the conformance packs whose compliance scores you want to include in the conformance pack compliance
     * score result set. You can include up to 25 conformance packs in the <code>ConformancePackNames</code> array of
     * strings, each with a character limit of 256 characters for the conformance pack name.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> conformancePackNames;

    /**
     * <p>
     * The names of the conformance packs whose compliance scores you want to include in the conformance pack compliance
     * score result set. You can include up to 25 conformance packs in the <code>ConformancePackNames</code> array of
     * strings, each with a character limit of 256 characters for the conformance pack name.
     * </p>
     * 
     * @return The names of the conformance packs whose compliance scores you want to include in the conformance pack
     *         compliance score result set. You can include up to 25 conformance packs in the
     *         <code>ConformancePackNames</code> array of strings, each with a character limit of 256 characters for the
     *         conformance pack name.
     */

    public java.util.List<String> getConformancePackNames() {
        if (conformancePackNames == null) {
            conformancePackNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return conformancePackNames;
    }

    /**
     * <p>
     * The names of the conformance packs whose compliance scores you want to include in the conformance pack compliance
     * score result set. You can include up to 25 conformance packs in the <code>ConformancePackNames</code> array of
     * strings, each with a character limit of 256 characters for the conformance pack name.
     * </p>
     * 
     * @param conformancePackNames
     *        The names of the conformance packs whose compliance scores you want to include in the conformance pack
     *        compliance score result set. You can include up to 25 conformance packs in the
     *        <code>ConformancePackNames</code> array of strings, each with a character limit of 256 characters for the
     *        conformance pack name.
     */

    public void setConformancePackNames(java.util.Collection<String> conformancePackNames) {
        if (conformancePackNames == null) {
            this.conformancePackNames = null;
            return;
        }

        this.conformancePackNames = new com.amazonaws.internal.SdkInternalList<String>(conformancePackNames);
    }

    /**
     * <p>
     * The names of the conformance packs whose compliance scores you want to include in the conformance pack compliance
     * score result set. You can include up to 25 conformance packs in the <code>ConformancePackNames</code> array of
     * strings, each with a character limit of 256 characters for the conformance pack name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConformancePackNames(java.util.Collection)} or {@link #withConformancePackNames(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param conformancePackNames
     *        The names of the conformance packs whose compliance scores you want to include in the conformance pack
     *        compliance score result set. You can include up to 25 conformance packs in the
     *        <code>ConformancePackNames</code> array of strings, each with a character limit of 256 characters for the
     *        conformance pack name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackComplianceScoresFilters withConformancePackNames(String... conformancePackNames) {
        if (this.conformancePackNames == null) {
            setConformancePackNames(new com.amazonaws.internal.SdkInternalList<String>(conformancePackNames.length));
        }
        for (String ele : conformancePackNames) {
            this.conformancePackNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the conformance packs whose compliance scores you want to include in the conformance pack compliance
     * score result set. You can include up to 25 conformance packs in the <code>ConformancePackNames</code> array of
     * strings, each with a character limit of 256 characters for the conformance pack name.
     * </p>
     * 
     * @param conformancePackNames
     *        The names of the conformance packs whose compliance scores you want to include in the conformance pack
     *        compliance score result set. You can include up to 25 conformance packs in the
     *        <code>ConformancePackNames</code> array of strings, each with a character limit of 256 characters for the
     *        conformance pack name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackComplianceScoresFilters withConformancePackNames(java.util.Collection<String> conformancePackNames) {
        setConformancePackNames(conformancePackNames);
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
        if (getConformancePackNames() != null)
            sb.append("ConformancePackNames: ").append(getConformancePackNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConformancePackComplianceScoresFilters == false)
            return false;
        ConformancePackComplianceScoresFilters other = (ConformancePackComplianceScoresFilters) obj;
        if (other.getConformancePackNames() == null ^ this.getConformancePackNames() == null)
            return false;
        if (other.getConformancePackNames() != null && other.getConformancePackNames().equals(this.getConformancePackNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConformancePackNames() == null) ? 0 : getConformancePackNames().hashCode());
        return hashCode;
    }

    @Override
    public ConformancePackComplianceScoresFilters clone() {
        try {
            return (ConformancePackComplianceScoresFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ConformancePackComplianceScoresFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
