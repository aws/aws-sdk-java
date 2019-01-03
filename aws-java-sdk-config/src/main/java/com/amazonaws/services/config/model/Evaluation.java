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
 * Identifies an AWS resource and indicates whether it complies with the AWS Config rule that it was evaluated against.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/Evaluation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Evaluation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of AWS resource that was evaluated.
     * </p>
     */
    private String complianceResourceType;
    /**
     * <p>
     * The ID of the AWS resource that was evaluated.
     * </p>
     */
    private String complianceResourceId;
    /**
     * <p>
     * Indicates whether the AWS resource complies with the AWS Config rule that it was evaluated against.
     * </p>
     * <p>
     * For the <code>Evaluation</code> data type, AWS Config supports only the <code>COMPLIANT</code>,
     * <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code> values. AWS Config does not support the
     * <code>INSUFFICIENT_DATA</code> value for this data type.
     * </p>
     * <p>
     * Similarly, AWS Config does not accept <code>INSUFFICIENT_DATA</code> as the value for <code>ComplianceType</code>
     * from a <code>PutEvaluations</code> request. For example, an AWS Lambda function for a custom AWS Config rule
     * cannot pass an <code>INSUFFICIENT_DATA</code> value to AWS Config.
     * </p>
     */
    private String complianceType;
    /**
     * <p>
     * Supplementary information about how the evaluation determined the compliance.
     * </p>
     */
    private String annotation;
    /**
     * <p>
     * The time of the event in AWS Config that triggered the evaluation. For event-based evaluations, the time
     * indicates when AWS Config created the configuration item that triggered the evaluation. For periodic evaluations,
     * the time indicates when AWS Config triggered the evaluation at the frequency that you specified (for example,
     * every 24 hours).
     * </p>
     */
    private java.util.Date orderingTimestamp;

    /**
     * <p>
     * The type of AWS resource that was evaluated.
     * </p>
     * 
     * @param complianceResourceType
     *        The type of AWS resource that was evaluated.
     */

    public void setComplianceResourceType(String complianceResourceType) {
        this.complianceResourceType = complianceResourceType;
    }

    /**
     * <p>
     * The type of AWS resource that was evaluated.
     * </p>
     * 
     * @return The type of AWS resource that was evaluated.
     */

    public String getComplianceResourceType() {
        return this.complianceResourceType;
    }

    /**
     * <p>
     * The type of AWS resource that was evaluated.
     * </p>
     * 
     * @param complianceResourceType
     *        The type of AWS resource that was evaluated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation withComplianceResourceType(String complianceResourceType) {
        setComplianceResourceType(complianceResourceType);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS resource that was evaluated.
     * </p>
     * 
     * @param complianceResourceId
     *        The ID of the AWS resource that was evaluated.
     */

    public void setComplianceResourceId(String complianceResourceId) {
        this.complianceResourceId = complianceResourceId;
    }

    /**
     * <p>
     * The ID of the AWS resource that was evaluated.
     * </p>
     * 
     * @return The ID of the AWS resource that was evaluated.
     */

    public String getComplianceResourceId() {
        return this.complianceResourceId;
    }

    /**
     * <p>
     * The ID of the AWS resource that was evaluated.
     * </p>
     * 
     * @param complianceResourceId
     *        The ID of the AWS resource that was evaluated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation withComplianceResourceId(String complianceResourceId) {
        setComplianceResourceId(complianceResourceId);
        return this;
    }

    /**
     * <p>
     * Indicates whether the AWS resource complies with the AWS Config rule that it was evaluated against.
     * </p>
     * <p>
     * For the <code>Evaluation</code> data type, AWS Config supports only the <code>COMPLIANT</code>,
     * <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code> values. AWS Config does not support the
     * <code>INSUFFICIENT_DATA</code> value for this data type.
     * </p>
     * <p>
     * Similarly, AWS Config does not accept <code>INSUFFICIENT_DATA</code> as the value for <code>ComplianceType</code>
     * from a <code>PutEvaluations</code> request. For example, an AWS Lambda function for a custom AWS Config rule
     * cannot pass an <code>INSUFFICIENT_DATA</code> value to AWS Config.
     * </p>
     * 
     * @param complianceType
     *        Indicates whether the AWS resource complies with the AWS Config rule that it was evaluated against.</p>
     *        <p>
     *        For the <code>Evaluation</code> data type, AWS Config supports only the <code>COMPLIANT</code>,
     *        <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code> values. AWS Config does not support the
     *        <code>INSUFFICIENT_DATA</code> value for this data type.
     *        </p>
     *        <p>
     *        Similarly, AWS Config does not accept <code>INSUFFICIENT_DATA</code> as the value for
     *        <code>ComplianceType</code> from a <code>PutEvaluations</code> request. For example, an AWS Lambda
     *        function for a custom AWS Config rule cannot pass an <code>INSUFFICIENT_DATA</code> value to AWS Config.
     * @see ComplianceType
     */

    public void setComplianceType(String complianceType) {
        this.complianceType = complianceType;
    }

    /**
     * <p>
     * Indicates whether the AWS resource complies with the AWS Config rule that it was evaluated against.
     * </p>
     * <p>
     * For the <code>Evaluation</code> data type, AWS Config supports only the <code>COMPLIANT</code>,
     * <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code> values. AWS Config does not support the
     * <code>INSUFFICIENT_DATA</code> value for this data type.
     * </p>
     * <p>
     * Similarly, AWS Config does not accept <code>INSUFFICIENT_DATA</code> as the value for <code>ComplianceType</code>
     * from a <code>PutEvaluations</code> request. For example, an AWS Lambda function for a custom AWS Config rule
     * cannot pass an <code>INSUFFICIENT_DATA</code> value to AWS Config.
     * </p>
     * 
     * @return Indicates whether the AWS resource complies with the AWS Config rule that it was evaluated against.</p>
     *         <p>
     *         For the <code>Evaluation</code> data type, AWS Config supports only the <code>COMPLIANT</code>,
     *         <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code> values. AWS Config does not support the
     *         <code>INSUFFICIENT_DATA</code> value for this data type.
     *         </p>
     *         <p>
     *         Similarly, AWS Config does not accept <code>INSUFFICIENT_DATA</code> as the value for
     *         <code>ComplianceType</code> from a <code>PutEvaluations</code> request. For example, an AWS Lambda
     *         function for a custom AWS Config rule cannot pass an <code>INSUFFICIENT_DATA</code> value to AWS Config.
     * @see ComplianceType
     */

    public String getComplianceType() {
        return this.complianceType;
    }

    /**
     * <p>
     * Indicates whether the AWS resource complies with the AWS Config rule that it was evaluated against.
     * </p>
     * <p>
     * For the <code>Evaluation</code> data type, AWS Config supports only the <code>COMPLIANT</code>,
     * <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code> values. AWS Config does not support the
     * <code>INSUFFICIENT_DATA</code> value for this data type.
     * </p>
     * <p>
     * Similarly, AWS Config does not accept <code>INSUFFICIENT_DATA</code> as the value for <code>ComplianceType</code>
     * from a <code>PutEvaluations</code> request. For example, an AWS Lambda function for a custom AWS Config rule
     * cannot pass an <code>INSUFFICIENT_DATA</code> value to AWS Config.
     * </p>
     * 
     * @param complianceType
     *        Indicates whether the AWS resource complies with the AWS Config rule that it was evaluated against.</p>
     *        <p>
     *        For the <code>Evaluation</code> data type, AWS Config supports only the <code>COMPLIANT</code>,
     *        <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code> values. AWS Config does not support the
     *        <code>INSUFFICIENT_DATA</code> value for this data type.
     *        </p>
     *        <p>
     *        Similarly, AWS Config does not accept <code>INSUFFICIENT_DATA</code> as the value for
     *        <code>ComplianceType</code> from a <code>PutEvaluations</code> request. For example, an AWS Lambda
     *        function for a custom AWS Config rule cannot pass an <code>INSUFFICIENT_DATA</code> value to AWS Config.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceType
     */

    public Evaluation withComplianceType(String complianceType) {
        setComplianceType(complianceType);
        return this;
    }

    /**
     * <p>
     * Indicates whether the AWS resource complies with the AWS Config rule that it was evaluated against.
     * </p>
     * <p>
     * For the <code>Evaluation</code> data type, AWS Config supports only the <code>COMPLIANT</code>,
     * <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code> values. AWS Config does not support the
     * <code>INSUFFICIENT_DATA</code> value for this data type.
     * </p>
     * <p>
     * Similarly, AWS Config does not accept <code>INSUFFICIENT_DATA</code> as the value for <code>ComplianceType</code>
     * from a <code>PutEvaluations</code> request. For example, an AWS Lambda function for a custom AWS Config rule
     * cannot pass an <code>INSUFFICIENT_DATA</code> value to AWS Config.
     * </p>
     * 
     * @param complianceType
     *        Indicates whether the AWS resource complies with the AWS Config rule that it was evaluated against.</p>
     *        <p>
     *        For the <code>Evaluation</code> data type, AWS Config supports only the <code>COMPLIANT</code>,
     *        <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code> values. AWS Config does not support the
     *        <code>INSUFFICIENT_DATA</code> value for this data type.
     *        </p>
     *        <p>
     *        Similarly, AWS Config does not accept <code>INSUFFICIENT_DATA</code> as the value for
     *        <code>ComplianceType</code> from a <code>PutEvaluations</code> request. For example, an AWS Lambda
     *        function for a custom AWS Config rule cannot pass an <code>INSUFFICIENT_DATA</code> value to AWS Config.
     * @see ComplianceType
     */

    public void setComplianceType(ComplianceType complianceType) {
        withComplianceType(complianceType);
    }

    /**
     * <p>
     * Indicates whether the AWS resource complies with the AWS Config rule that it was evaluated against.
     * </p>
     * <p>
     * For the <code>Evaluation</code> data type, AWS Config supports only the <code>COMPLIANT</code>,
     * <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code> values. AWS Config does not support the
     * <code>INSUFFICIENT_DATA</code> value for this data type.
     * </p>
     * <p>
     * Similarly, AWS Config does not accept <code>INSUFFICIENT_DATA</code> as the value for <code>ComplianceType</code>
     * from a <code>PutEvaluations</code> request. For example, an AWS Lambda function for a custom AWS Config rule
     * cannot pass an <code>INSUFFICIENT_DATA</code> value to AWS Config.
     * </p>
     * 
     * @param complianceType
     *        Indicates whether the AWS resource complies with the AWS Config rule that it was evaluated against.</p>
     *        <p>
     *        For the <code>Evaluation</code> data type, AWS Config supports only the <code>COMPLIANT</code>,
     *        <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code> values. AWS Config does not support the
     *        <code>INSUFFICIENT_DATA</code> value for this data type.
     *        </p>
     *        <p>
     *        Similarly, AWS Config does not accept <code>INSUFFICIENT_DATA</code> as the value for
     *        <code>ComplianceType</code> from a <code>PutEvaluations</code> request. For example, an AWS Lambda
     *        function for a custom AWS Config rule cannot pass an <code>INSUFFICIENT_DATA</code> value to AWS Config.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceType
     */

    public Evaluation withComplianceType(ComplianceType complianceType) {
        this.complianceType = complianceType.toString();
        return this;
    }

    /**
     * <p>
     * Supplementary information about how the evaluation determined the compliance.
     * </p>
     * 
     * @param annotation
     *        Supplementary information about how the evaluation determined the compliance.
     */

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    /**
     * <p>
     * Supplementary information about how the evaluation determined the compliance.
     * </p>
     * 
     * @return Supplementary information about how the evaluation determined the compliance.
     */

    public String getAnnotation() {
        return this.annotation;
    }

    /**
     * <p>
     * Supplementary information about how the evaluation determined the compliance.
     * </p>
     * 
     * @param annotation
     *        Supplementary information about how the evaluation determined the compliance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation withAnnotation(String annotation) {
        setAnnotation(annotation);
        return this;
    }

    /**
     * <p>
     * The time of the event in AWS Config that triggered the evaluation. For event-based evaluations, the time
     * indicates when AWS Config created the configuration item that triggered the evaluation. For periodic evaluations,
     * the time indicates when AWS Config triggered the evaluation at the frequency that you specified (for example,
     * every 24 hours).
     * </p>
     * 
     * @param orderingTimestamp
     *        The time of the event in AWS Config that triggered the evaluation. For event-based evaluations, the time
     *        indicates when AWS Config created the configuration item that triggered the evaluation. For periodic
     *        evaluations, the time indicates when AWS Config triggered the evaluation at the frequency that you
     *        specified (for example, every 24 hours).
     */

    public void setOrderingTimestamp(java.util.Date orderingTimestamp) {
        this.orderingTimestamp = orderingTimestamp;
    }

    /**
     * <p>
     * The time of the event in AWS Config that triggered the evaluation. For event-based evaluations, the time
     * indicates when AWS Config created the configuration item that triggered the evaluation. For periodic evaluations,
     * the time indicates when AWS Config triggered the evaluation at the frequency that you specified (for example,
     * every 24 hours).
     * </p>
     * 
     * @return The time of the event in AWS Config that triggered the evaluation. For event-based evaluations, the time
     *         indicates when AWS Config created the configuration item that triggered the evaluation. For periodic
     *         evaluations, the time indicates when AWS Config triggered the evaluation at the frequency that you
     *         specified (for example, every 24 hours).
     */

    public java.util.Date getOrderingTimestamp() {
        return this.orderingTimestamp;
    }

    /**
     * <p>
     * The time of the event in AWS Config that triggered the evaluation. For event-based evaluations, the time
     * indicates when AWS Config created the configuration item that triggered the evaluation. For periodic evaluations,
     * the time indicates when AWS Config triggered the evaluation at the frequency that you specified (for example,
     * every 24 hours).
     * </p>
     * 
     * @param orderingTimestamp
     *        The time of the event in AWS Config that triggered the evaluation. For event-based evaluations, the time
     *        indicates when AWS Config created the configuration item that triggered the evaluation. For periodic
     *        evaluations, the time indicates when AWS Config triggered the evaluation at the frequency that you
     *        specified (for example, every 24 hours).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Evaluation withOrderingTimestamp(java.util.Date orderingTimestamp) {
        setOrderingTimestamp(orderingTimestamp);
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
        if (getComplianceResourceType() != null)
            sb.append("ComplianceResourceType: ").append(getComplianceResourceType()).append(",");
        if (getComplianceResourceId() != null)
            sb.append("ComplianceResourceId: ").append(getComplianceResourceId()).append(",");
        if (getComplianceType() != null)
            sb.append("ComplianceType: ").append(getComplianceType()).append(",");
        if (getAnnotation() != null)
            sb.append("Annotation: ").append(getAnnotation()).append(",");
        if (getOrderingTimestamp() != null)
            sb.append("OrderingTimestamp: ").append(getOrderingTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Evaluation == false)
            return false;
        Evaluation other = (Evaluation) obj;
        if (other.getComplianceResourceType() == null ^ this.getComplianceResourceType() == null)
            return false;
        if (other.getComplianceResourceType() != null && other.getComplianceResourceType().equals(this.getComplianceResourceType()) == false)
            return false;
        if (other.getComplianceResourceId() == null ^ this.getComplianceResourceId() == null)
            return false;
        if (other.getComplianceResourceId() != null && other.getComplianceResourceId().equals(this.getComplianceResourceId()) == false)
            return false;
        if (other.getComplianceType() == null ^ this.getComplianceType() == null)
            return false;
        if (other.getComplianceType() != null && other.getComplianceType().equals(this.getComplianceType()) == false)
            return false;
        if (other.getAnnotation() == null ^ this.getAnnotation() == null)
            return false;
        if (other.getAnnotation() != null && other.getAnnotation().equals(this.getAnnotation()) == false)
            return false;
        if (other.getOrderingTimestamp() == null ^ this.getOrderingTimestamp() == null)
            return false;
        if (other.getOrderingTimestamp() != null && other.getOrderingTimestamp().equals(this.getOrderingTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComplianceResourceType() == null) ? 0 : getComplianceResourceType().hashCode());
        hashCode = prime * hashCode + ((getComplianceResourceId() == null) ? 0 : getComplianceResourceId().hashCode());
        hashCode = prime * hashCode + ((getComplianceType() == null) ? 0 : getComplianceType().hashCode());
        hashCode = prime * hashCode + ((getAnnotation() == null) ? 0 : getAnnotation().hashCode());
        hashCode = prime * hashCode + ((getOrderingTimestamp() == null) ? 0 : getOrderingTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public Evaluation clone() {
        try {
            return (Evaluation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.EvaluationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
