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
 * Filters the compliance results based on account ID, region, compliance type, and rule name.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ConfigRuleComplianceFilters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigRuleComplianceFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the AWS Config rule.
     * </p>
     */
    private String configRuleName;
    /**
     * <p>
     * The rule compliance status.
     * </p>
     * <p>
     * For the <code>ConfigRuleComplianceFilters</code> data type, AWS Config supports only <code>COMPLIANT</code> and
     * <code>NON_COMPLIANT</code>. AWS Config does not support the <code>NOT_APPLICABLE</code> and the
     * <code>INSUFFICIENT_DATA</code> values.
     * </p>
     */
    private String complianceType;
    /**
     * <p>
     * The 12-digit account ID of the source account.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The source region where the data is aggregated.
     * </p>
     */
    private String awsRegion;

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

    public ConfigRuleComplianceFilters withConfigRuleName(String configRuleName) {
        setConfigRuleName(configRuleName);
        return this;
    }

    /**
     * <p>
     * The rule compliance status.
     * </p>
     * <p>
     * For the <code>ConfigRuleComplianceFilters</code> data type, AWS Config supports only <code>COMPLIANT</code> and
     * <code>NON_COMPLIANT</code>. AWS Config does not support the <code>NOT_APPLICABLE</code> and the
     * <code>INSUFFICIENT_DATA</code> values.
     * </p>
     * 
     * @param complianceType
     *        The rule compliance status.</p>
     *        <p>
     *        For the <code>ConfigRuleComplianceFilters</code> data type, AWS Config supports only
     *        <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>. AWS Config does not support the
     *        <code>NOT_APPLICABLE</code> and the <code>INSUFFICIENT_DATA</code> values.
     * @see ComplianceType
     */

    public void setComplianceType(String complianceType) {
        this.complianceType = complianceType;
    }

    /**
     * <p>
     * The rule compliance status.
     * </p>
     * <p>
     * For the <code>ConfigRuleComplianceFilters</code> data type, AWS Config supports only <code>COMPLIANT</code> and
     * <code>NON_COMPLIANT</code>. AWS Config does not support the <code>NOT_APPLICABLE</code> and the
     * <code>INSUFFICIENT_DATA</code> values.
     * </p>
     * 
     * @return The rule compliance status.</p>
     *         <p>
     *         For the <code>ConfigRuleComplianceFilters</code> data type, AWS Config supports only
     *         <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>. AWS Config does not support the
     *         <code>NOT_APPLICABLE</code> and the <code>INSUFFICIENT_DATA</code> values.
     * @see ComplianceType
     */

    public String getComplianceType() {
        return this.complianceType;
    }

    /**
     * <p>
     * The rule compliance status.
     * </p>
     * <p>
     * For the <code>ConfigRuleComplianceFilters</code> data type, AWS Config supports only <code>COMPLIANT</code> and
     * <code>NON_COMPLIANT</code>. AWS Config does not support the <code>NOT_APPLICABLE</code> and the
     * <code>INSUFFICIENT_DATA</code> values.
     * </p>
     * 
     * @param complianceType
     *        The rule compliance status.</p>
     *        <p>
     *        For the <code>ConfigRuleComplianceFilters</code> data type, AWS Config supports only
     *        <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>. AWS Config does not support the
     *        <code>NOT_APPLICABLE</code> and the <code>INSUFFICIENT_DATA</code> values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceType
     */

    public ConfigRuleComplianceFilters withComplianceType(String complianceType) {
        setComplianceType(complianceType);
        return this;
    }

    /**
     * <p>
     * The rule compliance status.
     * </p>
     * <p>
     * For the <code>ConfigRuleComplianceFilters</code> data type, AWS Config supports only <code>COMPLIANT</code> and
     * <code>NON_COMPLIANT</code>. AWS Config does not support the <code>NOT_APPLICABLE</code> and the
     * <code>INSUFFICIENT_DATA</code> values.
     * </p>
     * 
     * @param complianceType
     *        The rule compliance status.</p>
     *        <p>
     *        For the <code>ConfigRuleComplianceFilters</code> data type, AWS Config supports only
     *        <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>. AWS Config does not support the
     *        <code>NOT_APPLICABLE</code> and the <code>INSUFFICIENT_DATA</code> values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceType
     */

    public ConfigRuleComplianceFilters withComplianceType(ComplianceType complianceType) {
        this.complianceType = complianceType.toString();
        return this;
    }

    /**
     * <p>
     * The 12-digit account ID of the source account.
     * </p>
     * 
     * @param accountId
     *        The 12-digit account ID of the source account.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The 12-digit account ID of the source account.
     * </p>
     * 
     * @return The 12-digit account ID of the source account.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The 12-digit account ID of the source account.
     * </p>
     * 
     * @param accountId
     *        The 12-digit account ID of the source account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRuleComplianceFilters withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The source region where the data is aggregated.
     * </p>
     * 
     * @param awsRegion
     *        The source region where the data is aggregated.
     */

    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    /**
     * <p>
     * The source region where the data is aggregated.
     * </p>
     * 
     * @return The source region where the data is aggregated.
     */

    public String getAwsRegion() {
        return this.awsRegion;
    }

    /**
     * <p>
     * The source region where the data is aggregated.
     * </p>
     * 
     * @param awsRegion
     *        The source region where the data is aggregated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigRuleComplianceFilters withAwsRegion(String awsRegion) {
        setAwsRegion(awsRegion);
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
            sb.append("ComplianceType: ").append(getComplianceType()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getAwsRegion() != null)
            sb.append("AwsRegion: ").append(getAwsRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigRuleComplianceFilters == false)
            return false;
        ConfigRuleComplianceFilters other = (ConfigRuleComplianceFilters) obj;
        if (other.getConfigRuleName() == null ^ this.getConfigRuleName() == null)
            return false;
        if (other.getConfigRuleName() != null && other.getConfigRuleName().equals(this.getConfigRuleName()) == false)
            return false;
        if (other.getComplianceType() == null ^ this.getComplianceType() == null)
            return false;
        if (other.getComplianceType() != null && other.getComplianceType().equals(this.getComplianceType()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getAwsRegion() == null ^ this.getAwsRegion() == null)
            return false;
        if (other.getAwsRegion() != null && other.getAwsRegion().equals(this.getAwsRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigRuleName() == null) ? 0 : getConfigRuleName().hashCode());
        hashCode = prime * hashCode + ((getComplianceType() == null) ? 0 : getComplianceType().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getAwsRegion() == null) ? 0 : getAwsRegion().hashCode());
        return hashCode;
    }

    @Override
    public ConfigRuleComplianceFilters clone() {
        try {
            return (ConfigRuleComplianceFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ConfigRuleComplianceFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
