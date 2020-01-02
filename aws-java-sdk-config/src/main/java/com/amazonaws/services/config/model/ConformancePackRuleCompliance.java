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
 * Compliance information of one or more AWS Config rules within a conformance pack. You can filter using AWS Config
 * rule names and compliance types.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ConformancePackRuleCompliance"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConformancePackRuleCompliance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the config rule.
     * </p>
     */
    private String configRuleName;
    /**
     * <p>
     * Compliance of the AWS Config rule
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * </p>
     */
    private String complianceType;

    /**
     * <p>
     * Name of the config rule.
     * </p>
     * 
     * @param configRuleName
     *        Name of the config rule.
     */

    public void setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
    }

    /**
     * <p>
     * Name of the config rule.
     * </p>
     * 
     * @return Name of the config rule.
     */

    public String getConfigRuleName() {
        return this.configRuleName;
    }

    /**
     * <p>
     * Name of the config rule.
     * </p>
     * 
     * @param configRuleName
     *        Name of the config rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackRuleCompliance withConfigRuleName(String configRuleName) {
        setConfigRuleName(configRuleName);
        return this;
    }

    /**
     * <p>
     * Compliance of the AWS Config rule
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @param complianceType
     *        Compliance of the AWS Config rule</p>
     *        <p>
     *        The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * @see ConformancePackComplianceType
     */

    public void setComplianceType(String complianceType) {
        this.complianceType = complianceType;
    }

    /**
     * <p>
     * Compliance of the AWS Config rule
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @return Compliance of the AWS Config rule</p>
     *         <p>
     *         The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * @see ConformancePackComplianceType
     */

    public String getComplianceType() {
        return this.complianceType;
    }

    /**
     * <p>
     * Compliance of the AWS Config rule
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @param complianceType
     *        Compliance of the AWS Config rule</p>
     *        <p>
     *        The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConformancePackComplianceType
     */

    public ConformancePackRuleCompliance withComplianceType(String complianceType) {
        setComplianceType(complianceType);
        return this;
    }

    /**
     * <p>
     * Compliance of the AWS Config rule
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * </p>
     * 
     * @param complianceType
     *        Compliance of the AWS Config rule</p>
     *        <p>
     *        The allowed values are <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConformancePackComplianceType
     */

    public ConformancePackRuleCompliance withComplianceType(ConformancePackComplianceType complianceType) {
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
        if (getConfigRuleName() != null)
            sb.append("ConfigRuleName: ").append(getConfigRuleName()).append(",");
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

        if (obj instanceof ConformancePackRuleCompliance == false)
            return false;
        ConformancePackRuleCompliance other = (ConformancePackRuleCompliance) obj;
        if (other.getConfigRuleName() == null ^ this.getConfigRuleName() == null)
            return false;
        if (other.getConfigRuleName() != null && other.getConfigRuleName().equals(this.getConfigRuleName()) == false)
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

        hashCode = prime * hashCode + ((getConfigRuleName() == null) ? 0 : getConfigRuleName().hashCode());
        hashCode = prime * hashCode + ((getComplianceType() == null) ? 0 : getComplianceType().hashCode());
        return hashCode;
    }

    @Override
    public ConformancePackRuleCompliance clone() {
        try {
            return (ConformancePackRuleCompliance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ConformancePackRuleComplianceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
