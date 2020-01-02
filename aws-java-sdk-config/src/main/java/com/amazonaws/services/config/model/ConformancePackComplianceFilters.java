/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Filters the conformance pack by compliance types and AWS Config rule names.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ConformancePackComplianceFilters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConformancePackComplianceFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Filters the results by AWS Config rule names.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> configRuleNames;
    /**
     * <p>
     * Filters the results by compliance.
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * </p>
     */
    private String complianceType;

    /**
     * <p>
     * Filters the results by AWS Config rule names.
     * </p>
     * 
     * @return Filters the results by AWS Config rule names.
     */

    public java.util.List<String> getConfigRuleNames() {
        if (configRuleNames == null) {
            configRuleNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return configRuleNames;
    }

    /**
     * <p>
     * Filters the results by AWS Config rule names.
     * </p>
     * 
     * @param configRuleNames
     *        Filters the results by AWS Config rule names.
     */

    public void setConfigRuleNames(java.util.Collection<String> configRuleNames) {
        if (configRuleNames == null) {
            this.configRuleNames = null;
            return;
        }

        this.configRuleNames = new com.amazonaws.internal.SdkInternalList<String>(configRuleNames);
    }

    /**
     * <p>
     * Filters the results by AWS Config rule names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigRuleNames(java.util.Collection)} or {@link #withConfigRuleNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param configRuleNames
     *        Filters the results by AWS Config rule names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackComplianceFilters withConfigRuleNames(String... configRuleNames) {
        if (this.configRuleNames == null) {
            setConfigRuleNames(new com.amazonaws.internal.SdkInternalList<String>(configRuleNames.length));
        }
        for (String ele : configRuleNames) {
            this.configRuleNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the results by AWS Config rule names.
     * </p>
     * 
     * @param configRuleNames
     *        Filters the results by AWS Config rule names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackComplianceFilters withConfigRuleNames(java.util.Collection<String> configRuleNames) {
        setConfigRuleNames(configRuleNames);
        return this;
    }

    /**
     * <p>
     * Filters the results by compliance.
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @param complianceType
     *        Filters the results by compliance.</p>
     *        <p>
     *        The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * @see ConformancePackComplianceType
     */

    public void setComplianceType(String complianceType) {
        this.complianceType = complianceType;
    }

    /**
     * <p>
     * Filters the results by compliance.
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @return Filters the results by compliance.</p>
     *         <p>
     *         The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * @see ConformancePackComplianceType
     */

    public String getComplianceType() {
        return this.complianceType;
    }

    /**
     * <p>
     * Filters the results by compliance.
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @param complianceType
     *        Filters the results by compliance.</p>
     *        <p>
     *        The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConformancePackComplianceType
     */

    public ConformancePackComplianceFilters withComplianceType(String complianceType) {
        setComplianceType(complianceType);
        return this;
    }

    /**
     * <p>
     * Filters the results by compliance.
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @param complianceType
     *        Filters the results by compliance.</p>
     *        <p>
     *        The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConformancePackComplianceType
     */

    public ConformancePackComplianceFilters withComplianceType(ConformancePackComplianceType complianceType) {
        this.complianceType = complianceType.toString();
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
        if (getConfigRuleNames() != null)
            sb.append("ConfigRuleNames: ").append(getConfigRuleNames()).append(",");
        if (getComplianceType() != null)
            sb.append("ComplianceType: ").append(getComplianceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConformancePackComplianceFilters == false)
            return false;
        ConformancePackComplianceFilters other = (ConformancePackComplianceFilters) obj;
        if (other.getConfigRuleNames() == null ^ this.getConfigRuleNames() == null)
            return false;
        if (other.getConfigRuleNames() != null && other.getConfigRuleNames().equals(this.getConfigRuleNames()) == false)
            return false;
        if (other.getComplianceType() == null ^ this.getComplianceType() == null)
            return false;
        if (other.getComplianceType() != null && other.getComplianceType().equals(this.getComplianceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigRuleNames() == null) ? 0 : getConfigRuleNames().hashCode());
        hashCode = prime * hashCode + ((getComplianceType() == null) ? 0 : getComplianceType().hashCode());
        return hashCode;
    }

    @Override
    public ConformancePackComplianceFilters clone() {
        try {
            return (ConformancePackComplianceFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ConformancePackComplianceFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
