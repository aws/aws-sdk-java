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
 * Indicates whether an AWS Config rule is compliant based on account ID, region, compliance, and rule name.
 * </p>
 * <p>
 * A rule is compliant if all of the resources that the rule evaluated comply with it. It is noncompliant if any of
 * these resources do not comply.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/AggregateComplianceByConfigRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AggregateComplianceByConfigRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the AWS Config rule.
     * </p>
     */
    private String configRuleName;
    /**
     * <p>
     * Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of contributors that
     * affect the compliance.
     * </p>
     */
    private Compliance compliance;
    /**
     * <p>
     * The 12-digit account ID of the source account.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The source region from where the data is aggregated.
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

    public AggregateComplianceByConfigRule withConfigRuleName(String configRuleName) {
        setConfigRuleName(configRuleName);
        return this;
    }

    /**
     * <p>
     * Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of contributors that
     * affect the compliance.
     * </p>
     * 
     * @param compliance
     *        Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of contributors
     *        that affect the compliance.
     */

    public void setCompliance(Compliance compliance) {
        this.compliance = compliance;
    }

    /**
     * <p>
     * Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of contributors that
     * affect the compliance.
     * </p>
     * 
     * @return Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of contributors
     *         that affect the compliance.
     */

    public Compliance getCompliance() {
        return this.compliance;
    }

    /**
     * <p>
     * Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of contributors that
     * affect the compliance.
     * </p>
     * 
     * @param compliance
     *        Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of contributors
     *        that affect the compliance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregateComplianceByConfigRule withCompliance(Compliance compliance) {
        setCompliance(compliance);
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

    public AggregateComplianceByConfigRule withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The source region from where the data is aggregated.
     * </p>
     * 
     * @param awsRegion
     *        The source region from where the data is aggregated.
     */

    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    /**
     * <p>
     * The source region from where the data is aggregated.
     * </p>
     * 
     * @return The source region from where the data is aggregated.
     */

    public String getAwsRegion() {
        return this.awsRegion;
    }

    /**
     * <p>
     * The source region from where the data is aggregated.
     * </p>
     * 
     * @param awsRegion
     *        The source region from where the data is aggregated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregateComplianceByConfigRule withAwsRegion(String awsRegion) {
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
        if (getCompliance() != null)
            sb.append("Compliance: ").append(getCompliance()).append(",");
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

        if (obj instanceof AggregateComplianceByConfigRule == false)
            return false;
        AggregateComplianceByConfigRule other = (AggregateComplianceByConfigRule) obj;
        if (other.getConfigRuleName() == null ^ this.getConfigRuleName() == null)
            return false;
        if (other.getConfigRuleName() != null && other.getConfigRuleName().equals(this.getConfigRuleName()) == false)
            return false;
        if (other.getCompliance() == null ^ this.getCompliance() == null)
            return false;
        if (other.getCompliance() != null && other.getCompliance().equals(this.getCompliance()) == false)
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
        hashCode = prime * hashCode + ((getCompliance() == null) ? 0 : getCompliance().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getAwsRegion() == null) ? 0 : getAwsRegion().hashCode());
        return hashCode;
    }

    @Override
    public AggregateComplianceByConfigRule clone() {
        try {
            return (AggregateComplianceByConfigRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.AggregateComplianceByConfigRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
