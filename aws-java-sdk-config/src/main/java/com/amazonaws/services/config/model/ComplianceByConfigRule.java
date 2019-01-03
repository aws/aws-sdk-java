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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Indicates whether an AWS Config rule is compliant. A rule is compliant if all of the resources that the rule
 * evaluated comply with it. A rule is noncompliant if any of these resources do not comply.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ComplianceByConfigRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComplianceByConfigRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the AWS Config rule.
     * </p>
     */
    private String configRuleName;
    /**
     * <p>
     * Indicates whether the AWS Config rule is compliant.
     * </p>
     */
    private Compliance compliance;

    /**
     * <p>
     * The name of the AWS Config rule.
     * </p>
     * 
     * @param configRuleName
     *        The name of the AWS Config rule.
     */

    public void setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
    }

    /**
     * <p>
     * The name of the AWS Config rule.
     * </p>
     * 
     * @return The name of the AWS Config rule.
     */

    public String getConfigRuleName() {
        return this.configRuleName;
    }

    /**
     * <p>
     * The name of the AWS Config rule.
     * </p>
     * 
     * @param configRuleName
     *        The name of the AWS Config rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceByConfigRule withConfigRuleName(String configRuleName) {
        setConfigRuleName(configRuleName);
        return this;
    }

    /**
     * <p>
     * Indicates whether the AWS Config rule is compliant.
     * </p>
     * 
     * @param compliance
     *        Indicates whether the AWS Config rule is compliant.
     */

    public void setCompliance(Compliance compliance) {
        this.compliance = compliance;
    }

    /**
     * <p>
     * Indicates whether the AWS Config rule is compliant.
     * </p>
     * 
     * @return Indicates whether the AWS Config rule is compliant.
     */

    public Compliance getCompliance() {
        return this.compliance;
    }

    /**
     * <p>
     * Indicates whether the AWS Config rule is compliant.
     * </p>
     * 
     * @param compliance
     *        Indicates whether the AWS Config rule is compliant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceByConfigRule withCompliance(Compliance compliance) {
        setCompliance(compliance);
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
        if (getCompliance() != null)
            sb.append("Compliance: ").append(getCompliance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComplianceByConfigRule == false)
            return false;
        ComplianceByConfigRule other = (ComplianceByConfigRule) obj;
        if (other.getConfigRuleName() == null ^ this.getConfigRuleName() == null)
            return false;
        if (other.getConfigRuleName() != null && other.getConfigRuleName().equals(this.getConfigRuleName()) == false)
            return false;
        if (other.getCompliance() == null ^ this.getCompliance() == null)
            return false;
        if (other.getCompliance() != null && other.getCompliance().equals(this.getCompliance()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigRuleName() == null) ? 0 : getConfigRuleName().hashCode());
        hashCode = prime * hashCode + ((getCompliance() == null) ? 0 : getCompliance().hashCode());
        return hashCode;
    }

    @Override
    public ComplianceByConfigRule clone() {
        try {
            return (ComplianceByConfigRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ComplianceByConfigRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
