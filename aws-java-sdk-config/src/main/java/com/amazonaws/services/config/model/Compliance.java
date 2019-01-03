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
 * Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of contributors that affect
 * the compliance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/Compliance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Compliance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether an AWS resource or AWS Config rule is compliant.
     * </p>
     * <p>
     * A resource is compliant if it complies with all of the AWS Config rules that evaluate it. A resource is
     * noncompliant if it does not comply with one or more of these rules.
     * </p>
     * <p>
     * A rule is compliant if all of the resources that the rule evaluates comply with it. A rule is noncompliant if any
     * of these resources do not comply.
     * </p>
     * <p>
     * AWS Config returns the <code>INSUFFICIENT_DATA</code> value when no evaluation results are available for the AWS
     * resource or AWS Config rule.
     * </p>
     * <p>
     * For the <code>Compliance</code> data type, AWS Config supports only <code>COMPLIANT</code>,
     * <code>NON_COMPLIANT</code>, and <code>INSUFFICIENT_DATA</code> values. AWS Config does not support the
     * <code>NOT_APPLICABLE</code> value for the <code>Compliance</code> data type.
     * </p>
     */
    private String complianceType;
    /**
     * <p>
     * The number of AWS resources or AWS Config rules that cause a result of <code>NON_COMPLIANT</code>, up to a
     * maximum number.
     * </p>
     */
    private ComplianceContributorCount complianceContributorCount;

    /**
     * <p>
     * Indicates whether an AWS resource or AWS Config rule is compliant.
     * </p>
     * <p>
     * A resource is compliant if it complies with all of the AWS Config rules that evaluate it. A resource is
     * noncompliant if it does not comply with one or more of these rules.
     * </p>
     * <p>
     * A rule is compliant if all of the resources that the rule evaluates comply with it. A rule is noncompliant if any
     * of these resources do not comply.
     * </p>
     * <p>
     * AWS Config returns the <code>INSUFFICIENT_DATA</code> value when no evaluation results are available for the AWS
     * resource or AWS Config rule.
     * </p>
     * <p>
     * For the <code>Compliance</code> data type, AWS Config supports only <code>COMPLIANT</code>,
     * <code>NON_COMPLIANT</code>, and <code>INSUFFICIENT_DATA</code> values. AWS Config does not support the
     * <code>NOT_APPLICABLE</code> value for the <code>Compliance</code> data type.
     * </p>
     * 
     * @param complianceType
     *        Indicates whether an AWS resource or AWS Config rule is compliant.</p>
     *        <p>
     *        A resource is compliant if it complies with all of the AWS Config rules that evaluate it. A resource is
     *        noncompliant if it does not comply with one or more of these rules.
     *        </p>
     *        <p>
     *        A rule is compliant if all of the resources that the rule evaluates comply with it. A rule is noncompliant
     *        if any of these resources do not comply.
     *        </p>
     *        <p>
     *        AWS Config returns the <code>INSUFFICIENT_DATA</code> value when no evaluation results are available for
     *        the AWS resource or AWS Config rule.
     *        </p>
     *        <p>
     *        For the <code>Compliance</code> data type, AWS Config supports only <code>COMPLIANT</code>,
     *        <code>NON_COMPLIANT</code>, and <code>INSUFFICIENT_DATA</code> values. AWS Config does not support the
     *        <code>NOT_APPLICABLE</code> value for the <code>Compliance</code> data type.
     * @see ComplianceType
     */

    public void setComplianceType(String complianceType) {
        this.complianceType = complianceType;
    }

    /**
     * <p>
     * Indicates whether an AWS resource or AWS Config rule is compliant.
     * </p>
     * <p>
     * A resource is compliant if it complies with all of the AWS Config rules that evaluate it. A resource is
     * noncompliant if it does not comply with one or more of these rules.
     * </p>
     * <p>
     * A rule is compliant if all of the resources that the rule evaluates comply with it. A rule is noncompliant if any
     * of these resources do not comply.
     * </p>
     * <p>
     * AWS Config returns the <code>INSUFFICIENT_DATA</code> value when no evaluation results are available for the AWS
     * resource or AWS Config rule.
     * </p>
     * <p>
     * For the <code>Compliance</code> data type, AWS Config supports only <code>COMPLIANT</code>,
     * <code>NON_COMPLIANT</code>, and <code>INSUFFICIENT_DATA</code> values. AWS Config does not support the
     * <code>NOT_APPLICABLE</code> value for the <code>Compliance</code> data type.
     * </p>
     * 
     * @return Indicates whether an AWS resource or AWS Config rule is compliant.</p>
     *         <p>
     *         A resource is compliant if it complies with all of the AWS Config rules that evaluate it. A resource is
     *         noncompliant if it does not comply with one or more of these rules.
     *         </p>
     *         <p>
     *         A rule is compliant if all of the resources that the rule evaluates comply with it. A rule is
     *         noncompliant if any of these resources do not comply.
     *         </p>
     *         <p>
     *         AWS Config returns the <code>INSUFFICIENT_DATA</code> value when no evaluation results are available for
     *         the AWS resource or AWS Config rule.
     *         </p>
     *         <p>
     *         For the <code>Compliance</code> data type, AWS Config supports only <code>COMPLIANT</code>,
     *         <code>NON_COMPLIANT</code>, and <code>INSUFFICIENT_DATA</code> values. AWS Config does not support the
     *         <code>NOT_APPLICABLE</code> value for the <code>Compliance</code> data type.
     * @see ComplianceType
     */

    public String getComplianceType() {
        return this.complianceType;
    }

    /**
     * <p>
     * Indicates whether an AWS resource or AWS Config rule is compliant.
     * </p>
     * <p>
     * A resource is compliant if it complies with all of the AWS Config rules that evaluate it. A resource is
     * noncompliant if it does not comply with one or more of these rules.
     * </p>
     * <p>
     * A rule is compliant if all of the resources that the rule evaluates comply with it. A rule is noncompliant if any
     * of these resources do not comply.
     * </p>
     * <p>
     * AWS Config returns the <code>INSUFFICIENT_DATA</code> value when no evaluation results are available for the AWS
     * resource or AWS Config rule.
     * </p>
     * <p>
     * For the <code>Compliance</code> data type, AWS Config supports only <code>COMPLIANT</code>,
     * <code>NON_COMPLIANT</code>, and <code>INSUFFICIENT_DATA</code> values. AWS Config does not support the
     * <code>NOT_APPLICABLE</code> value for the <code>Compliance</code> data type.
     * </p>
     * 
     * @param complianceType
     *        Indicates whether an AWS resource or AWS Config rule is compliant.</p>
     *        <p>
     *        A resource is compliant if it complies with all of the AWS Config rules that evaluate it. A resource is
     *        noncompliant if it does not comply with one or more of these rules.
     *        </p>
     *        <p>
     *        A rule is compliant if all of the resources that the rule evaluates comply with it. A rule is noncompliant
     *        if any of these resources do not comply.
     *        </p>
     *        <p>
     *        AWS Config returns the <code>INSUFFICIENT_DATA</code> value when no evaluation results are available for
     *        the AWS resource or AWS Config rule.
     *        </p>
     *        <p>
     *        For the <code>Compliance</code> data type, AWS Config supports only <code>COMPLIANT</code>,
     *        <code>NON_COMPLIANT</code>, and <code>INSUFFICIENT_DATA</code> values. AWS Config does not support the
     *        <code>NOT_APPLICABLE</code> value for the <code>Compliance</code> data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceType
     */

    public Compliance withComplianceType(String complianceType) {
        setComplianceType(complianceType);
        return this;
    }

    /**
     * <p>
     * Indicates whether an AWS resource or AWS Config rule is compliant.
     * </p>
     * <p>
     * A resource is compliant if it complies with all of the AWS Config rules that evaluate it. A resource is
     * noncompliant if it does not comply with one or more of these rules.
     * </p>
     * <p>
     * A rule is compliant if all of the resources that the rule evaluates comply with it. A rule is noncompliant if any
     * of these resources do not comply.
     * </p>
     * <p>
     * AWS Config returns the <code>INSUFFICIENT_DATA</code> value when no evaluation results are available for the AWS
     * resource or AWS Config rule.
     * </p>
     * <p>
     * For the <code>Compliance</code> data type, AWS Config supports only <code>COMPLIANT</code>,
     * <code>NON_COMPLIANT</code>, and <code>INSUFFICIENT_DATA</code> values. AWS Config does not support the
     * <code>NOT_APPLICABLE</code> value for the <code>Compliance</code> data type.
     * </p>
     * 
     * @param complianceType
     *        Indicates whether an AWS resource or AWS Config rule is compliant.</p>
     *        <p>
     *        A resource is compliant if it complies with all of the AWS Config rules that evaluate it. A resource is
     *        noncompliant if it does not comply with one or more of these rules.
     *        </p>
     *        <p>
     *        A rule is compliant if all of the resources that the rule evaluates comply with it. A rule is noncompliant
     *        if any of these resources do not comply.
     *        </p>
     *        <p>
     *        AWS Config returns the <code>INSUFFICIENT_DATA</code> value when no evaluation results are available for
     *        the AWS resource or AWS Config rule.
     *        </p>
     *        <p>
     *        For the <code>Compliance</code> data type, AWS Config supports only <code>COMPLIANT</code>,
     *        <code>NON_COMPLIANT</code>, and <code>INSUFFICIENT_DATA</code> values. AWS Config does not support the
     *        <code>NOT_APPLICABLE</code> value for the <code>Compliance</code> data type.
     * @see ComplianceType
     */

    public void setComplianceType(ComplianceType complianceType) {
        withComplianceType(complianceType);
    }

    /**
     * <p>
     * Indicates whether an AWS resource or AWS Config rule is compliant.
     * </p>
     * <p>
     * A resource is compliant if it complies with all of the AWS Config rules that evaluate it. A resource is
     * noncompliant if it does not comply with one or more of these rules.
     * </p>
     * <p>
     * A rule is compliant if all of the resources that the rule evaluates comply with it. A rule is noncompliant if any
     * of these resources do not comply.
     * </p>
     * <p>
     * AWS Config returns the <code>INSUFFICIENT_DATA</code> value when no evaluation results are available for the AWS
     * resource or AWS Config rule.
     * </p>
     * <p>
     * For the <code>Compliance</code> data type, AWS Config supports only <code>COMPLIANT</code>,
     * <code>NON_COMPLIANT</code>, and <code>INSUFFICIENT_DATA</code> values. AWS Config does not support the
     * <code>NOT_APPLICABLE</code> value for the <code>Compliance</code> data type.
     * </p>
     * 
     * @param complianceType
     *        Indicates whether an AWS resource or AWS Config rule is compliant.</p>
     *        <p>
     *        A resource is compliant if it complies with all of the AWS Config rules that evaluate it. A resource is
     *        noncompliant if it does not comply with one or more of these rules.
     *        </p>
     *        <p>
     *        A rule is compliant if all of the resources that the rule evaluates comply with it. A rule is noncompliant
     *        if any of these resources do not comply.
     *        </p>
     *        <p>
     *        AWS Config returns the <code>INSUFFICIENT_DATA</code> value when no evaluation results are available for
     *        the AWS resource or AWS Config rule.
     *        </p>
     *        <p>
     *        For the <code>Compliance</code> data type, AWS Config supports only <code>COMPLIANT</code>,
     *        <code>NON_COMPLIANT</code>, and <code>INSUFFICIENT_DATA</code> values. AWS Config does not support the
     *        <code>NOT_APPLICABLE</code> value for the <code>Compliance</code> data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceType
     */

    public Compliance withComplianceType(ComplianceType complianceType) {
        this.complianceType = complianceType.toString();
        return this;
    }

    /**
     * <p>
     * The number of AWS resources or AWS Config rules that cause a result of <code>NON_COMPLIANT</code>, up to a
     * maximum number.
     * </p>
     * 
     * @param complianceContributorCount
     *        The number of AWS resources or AWS Config rules that cause a result of <code>NON_COMPLIANT</code>, up to a
     *        maximum number.
     */

    public void setComplianceContributorCount(ComplianceContributorCount complianceContributorCount) {
        this.complianceContributorCount = complianceContributorCount;
    }

    /**
     * <p>
     * The number of AWS resources or AWS Config rules that cause a result of <code>NON_COMPLIANT</code>, up to a
     * maximum number.
     * </p>
     * 
     * @return The number of AWS resources or AWS Config rules that cause a result of <code>NON_COMPLIANT</code>, up to
     *         a maximum number.
     */

    public ComplianceContributorCount getComplianceContributorCount() {
        return this.complianceContributorCount;
    }

    /**
     * <p>
     * The number of AWS resources or AWS Config rules that cause a result of <code>NON_COMPLIANT</code>, up to a
     * maximum number.
     * </p>
     * 
     * @param complianceContributorCount
     *        The number of AWS resources or AWS Config rules that cause a result of <code>NON_COMPLIANT</code>, up to a
     *        maximum number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Compliance withComplianceContributorCount(ComplianceContributorCount complianceContributorCount) {
        setComplianceContributorCount(complianceContributorCount);
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
        if (getComplianceType() != null)
            sb.append("ComplianceType: ").append(getComplianceType()).append(",");
        if (getComplianceContributorCount() != null)
            sb.append("ComplianceContributorCount: ").append(getComplianceContributorCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Compliance == false)
            return false;
        Compliance other = (Compliance) obj;
        if (other.getComplianceType() == null ^ this.getComplianceType() == null)
            return false;
        if (other.getComplianceType() != null && other.getComplianceType().equals(this.getComplianceType()) == false)
            return false;
        if (other.getComplianceContributorCount() == null ^ this.getComplianceContributorCount() == null)
            return false;
        if (other.getComplianceContributorCount() != null && other.getComplianceContributorCount().equals(this.getComplianceContributorCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComplianceType() == null) ? 0 : getComplianceType().hashCode());
        hashCode = prime * hashCode + ((getComplianceContributorCount() == null) ? 0 : getComplianceContributorCount().hashCode());
        return hashCode;
    }

    @Override
    public Compliance clone() {
        try {
            return (Compliance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ComplianceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
