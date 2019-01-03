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
 * The details of an AWS Config evaluation for an account ID and region in an aggregator. Provides the AWS resource that
 * was evaluated, the compliance of the resource, related time stamps, and supplementary information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/AggregateEvaluationResult" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AggregateEvaluationResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Uniquely identifies the evaluation result.
     * </p>
     */
    private EvaluationResultIdentifier evaluationResultIdentifier;
    /**
     * <p>
     * The resource compliance status.
     * </p>
     * <p>
     * For the <code>AggregationEvaluationResult</code> data type, AWS Config supports only the <code>COMPLIANT</code>
     * and <code>NON_COMPLIANT</code>. AWS Config does not support the <code>NOT_APPLICABLE</code> and
     * <code>INSUFFICIENT_DATA</code> value.
     * </p>
     */
    private String complianceType;
    /**
     * <p>
     * The time when AWS Config recorded the aggregate evaluation result.
     * </p>
     */
    private java.util.Date resultRecordedTime;
    /**
     * <p>
     * The time when the AWS Config rule evaluated the AWS resource.
     * </p>
     */
    private java.util.Date configRuleInvokedTime;
    /**
     * <p>
     * Supplementary information about how the agrregate evaluation determined the compliance.
     * </p>
     */
    private String annotation;
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
     * Uniquely identifies the evaluation result.
     * </p>
     * 
     * @param evaluationResultIdentifier
     *        Uniquely identifies the evaluation result.
     */

    public void setEvaluationResultIdentifier(EvaluationResultIdentifier evaluationResultIdentifier) {
        this.evaluationResultIdentifier = evaluationResultIdentifier;
    }

    /**
     * <p>
     * Uniquely identifies the evaluation result.
     * </p>
     * 
     * @return Uniquely identifies the evaluation result.
     */

    public EvaluationResultIdentifier getEvaluationResultIdentifier() {
        return this.evaluationResultIdentifier;
    }

    /**
     * <p>
     * Uniquely identifies the evaluation result.
     * </p>
     * 
     * @param evaluationResultIdentifier
     *        Uniquely identifies the evaluation result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregateEvaluationResult withEvaluationResultIdentifier(EvaluationResultIdentifier evaluationResultIdentifier) {
        setEvaluationResultIdentifier(evaluationResultIdentifier);
        return this;
    }

    /**
     * <p>
     * The resource compliance status.
     * </p>
     * <p>
     * For the <code>AggregationEvaluationResult</code> data type, AWS Config supports only the <code>COMPLIANT</code>
     * and <code>NON_COMPLIANT</code>. AWS Config does not support the <code>NOT_APPLICABLE</code> and
     * <code>INSUFFICIENT_DATA</code> value.
     * </p>
     * 
     * @param complianceType
     *        The resource compliance status.</p>
     *        <p>
     *        For the <code>AggregationEvaluationResult</code> data type, AWS Config supports only the
     *        <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>. AWS Config does not support the
     *        <code>NOT_APPLICABLE</code> and <code>INSUFFICIENT_DATA</code> value.
     * @see ComplianceType
     */

    public void setComplianceType(String complianceType) {
        this.complianceType = complianceType;
    }

    /**
     * <p>
     * The resource compliance status.
     * </p>
     * <p>
     * For the <code>AggregationEvaluationResult</code> data type, AWS Config supports only the <code>COMPLIANT</code>
     * and <code>NON_COMPLIANT</code>. AWS Config does not support the <code>NOT_APPLICABLE</code> and
     * <code>INSUFFICIENT_DATA</code> value.
     * </p>
     * 
     * @return The resource compliance status.</p>
     *         <p>
     *         For the <code>AggregationEvaluationResult</code> data type, AWS Config supports only the
     *         <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>. AWS Config does not support the
     *         <code>NOT_APPLICABLE</code> and <code>INSUFFICIENT_DATA</code> value.
     * @see ComplianceType
     */

    public String getComplianceType() {
        return this.complianceType;
    }

    /**
     * <p>
     * The resource compliance status.
     * </p>
     * <p>
     * For the <code>AggregationEvaluationResult</code> data type, AWS Config supports only the <code>COMPLIANT</code>
     * and <code>NON_COMPLIANT</code>. AWS Config does not support the <code>NOT_APPLICABLE</code> and
     * <code>INSUFFICIENT_DATA</code> value.
     * </p>
     * 
     * @param complianceType
     *        The resource compliance status.</p>
     *        <p>
     *        For the <code>AggregationEvaluationResult</code> data type, AWS Config supports only the
     *        <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>. AWS Config does not support the
     *        <code>NOT_APPLICABLE</code> and <code>INSUFFICIENT_DATA</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceType
     */

    public AggregateEvaluationResult withComplianceType(String complianceType) {
        setComplianceType(complianceType);
        return this;
    }

    /**
     * <p>
     * The resource compliance status.
     * </p>
     * <p>
     * For the <code>AggregationEvaluationResult</code> data type, AWS Config supports only the <code>COMPLIANT</code>
     * and <code>NON_COMPLIANT</code>. AWS Config does not support the <code>NOT_APPLICABLE</code> and
     * <code>INSUFFICIENT_DATA</code> value.
     * </p>
     * 
     * @param complianceType
     *        The resource compliance status.</p>
     *        <p>
     *        For the <code>AggregationEvaluationResult</code> data type, AWS Config supports only the
     *        <code>COMPLIANT</code> and <code>NON_COMPLIANT</code>. AWS Config does not support the
     *        <code>NOT_APPLICABLE</code> and <code>INSUFFICIENT_DATA</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceType
     */

    public AggregateEvaluationResult withComplianceType(ComplianceType complianceType) {
        this.complianceType = complianceType.toString();
        return this;
    }

    /**
     * <p>
     * The time when AWS Config recorded the aggregate evaluation result.
     * </p>
     * 
     * @param resultRecordedTime
     *        The time when AWS Config recorded the aggregate evaluation result.
     */

    public void setResultRecordedTime(java.util.Date resultRecordedTime) {
        this.resultRecordedTime = resultRecordedTime;
    }

    /**
     * <p>
     * The time when AWS Config recorded the aggregate evaluation result.
     * </p>
     * 
     * @return The time when AWS Config recorded the aggregate evaluation result.
     */

    public java.util.Date getResultRecordedTime() {
        return this.resultRecordedTime;
    }

    /**
     * <p>
     * The time when AWS Config recorded the aggregate evaluation result.
     * </p>
     * 
     * @param resultRecordedTime
     *        The time when AWS Config recorded the aggregate evaluation result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregateEvaluationResult withResultRecordedTime(java.util.Date resultRecordedTime) {
        setResultRecordedTime(resultRecordedTime);
        return this;
    }

    /**
     * <p>
     * The time when the AWS Config rule evaluated the AWS resource.
     * </p>
     * 
     * @param configRuleInvokedTime
     *        The time when the AWS Config rule evaluated the AWS resource.
     */

    public void setConfigRuleInvokedTime(java.util.Date configRuleInvokedTime) {
        this.configRuleInvokedTime = configRuleInvokedTime;
    }

    /**
     * <p>
     * The time when the AWS Config rule evaluated the AWS resource.
     * </p>
     * 
     * @return The time when the AWS Config rule evaluated the AWS resource.
     */

    public java.util.Date getConfigRuleInvokedTime() {
        return this.configRuleInvokedTime;
    }

    /**
     * <p>
     * The time when the AWS Config rule evaluated the AWS resource.
     * </p>
     * 
     * @param configRuleInvokedTime
     *        The time when the AWS Config rule evaluated the AWS resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregateEvaluationResult withConfigRuleInvokedTime(java.util.Date configRuleInvokedTime) {
        setConfigRuleInvokedTime(configRuleInvokedTime);
        return this;
    }

    /**
     * <p>
     * Supplementary information about how the agrregate evaluation determined the compliance.
     * </p>
     * 
     * @param annotation
     *        Supplementary information about how the agrregate evaluation determined the compliance.
     */

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    /**
     * <p>
     * Supplementary information about how the agrregate evaluation determined the compliance.
     * </p>
     * 
     * @return Supplementary information about how the agrregate evaluation determined the compliance.
     */

    public String getAnnotation() {
        return this.annotation;
    }

    /**
     * <p>
     * Supplementary information about how the agrregate evaluation determined the compliance.
     * </p>
     * 
     * @param annotation
     *        Supplementary information about how the agrregate evaluation determined the compliance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregateEvaluationResult withAnnotation(String annotation) {
        setAnnotation(annotation);
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

    public AggregateEvaluationResult withAccountId(String accountId) {
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

    public AggregateEvaluationResult withAwsRegion(String awsRegion) {
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
        if (getEvaluationResultIdentifier() != null)
            sb.append("EvaluationResultIdentifier: ").append(getEvaluationResultIdentifier()).append(",");
        if (getComplianceType() != null)
            sb.append("ComplianceType: ").append(getComplianceType()).append(",");
        if (getResultRecordedTime() != null)
            sb.append("ResultRecordedTime: ").append(getResultRecordedTime()).append(",");
        if (getConfigRuleInvokedTime() != null)
            sb.append("ConfigRuleInvokedTime: ").append(getConfigRuleInvokedTime()).append(",");
        if (getAnnotation() != null)
            sb.append("Annotation: ").append(getAnnotation()).append(",");
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

        if (obj instanceof AggregateEvaluationResult == false)
            return false;
        AggregateEvaluationResult other = (AggregateEvaluationResult) obj;
        if (other.getEvaluationResultIdentifier() == null ^ this.getEvaluationResultIdentifier() == null)
            return false;
        if (other.getEvaluationResultIdentifier() != null && other.getEvaluationResultIdentifier().equals(this.getEvaluationResultIdentifier()) == false)
            return false;
        if (other.getComplianceType() == null ^ this.getComplianceType() == null)
            return false;
        if (other.getComplianceType() != null && other.getComplianceType().equals(this.getComplianceType()) == false)
            return false;
        if (other.getResultRecordedTime() == null ^ this.getResultRecordedTime() == null)
            return false;
        if (other.getResultRecordedTime() != null && other.getResultRecordedTime().equals(this.getResultRecordedTime()) == false)
            return false;
        if (other.getConfigRuleInvokedTime() == null ^ this.getConfigRuleInvokedTime() == null)
            return false;
        if (other.getConfigRuleInvokedTime() != null && other.getConfigRuleInvokedTime().equals(this.getConfigRuleInvokedTime()) == false)
            return false;
        if (other.getAnnotation() == null ^ this.getAnnotation() == null)
            return false;
        if (other.getAnnotation() != null && other.getAnnotation().equals(this.getAnnotation()) == false)
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

        hashCode = prime * hashCode + ((getEvaluationResultIdentifier() == null) ? 0 : getEvaluationResultIdentifier().hashCode());
        hashCode = prime * hashCode + ((getComplianceType() == null) ? 0 : getComplianceType().hashCode());
        hashCode = prime * hashCode + ((getResultRecordedTime() == null) ? 0 : getResultRecordedTime().hashCode());
        hashCode = prime * hashCode + ((getConfigRuleInvokedTime() == null) ? 0 : getConfigRuleInvokedTime().hashCode());
        hashCode = prime * hashCode + ((getAnnotation() == null) ? 0 : getAnnotation().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getAwsRegion() == null) ? 0 : getAwsRegion().hashCode());
        return hashCode;
    }

    @Override
    public AggregateEvaluationResult clone() {
        try {
            return (AggregateEvaluationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.AggregateEvaluationResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
