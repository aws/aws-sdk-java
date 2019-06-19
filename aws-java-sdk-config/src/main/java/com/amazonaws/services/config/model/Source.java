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
 * Provides the AWS Config rule owner (AWS or customer), the rule identifier, and the events that trigger the evaluation
 * of your AWS resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/Source" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Source implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether AWS or the customer owns and manages the AWS Config rule.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * For AWS Config managed rules, a predefined identifier from a list. For example, <code>IAM_PASSWORD_POLICY</code>
     * is a managed rule. To reference a managed rule, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">Using AWS
     * Managed Config Rules</a>.
     * </p>
     * <p>
     * For custom rules, the identifier is the Amazon Resource Name (ARN) of the rule's AWS Lambda function, such as
     * <code>arn:aws:lambda:us-east-2:123456789012:function:custom_rule_name</code>.
     * </p>
     */
    private String sourceIdentifier;
    /**
     * <p>
     * Provides the source and type of the event that causes AWS Config to evaluate your AWS resources.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SourceDetail> sourceDetails;

    /**
     * <p>
     * Indicates whether AWS or the customer owns and manages the AWS Config rule.
     * </p>
     * 
     * @param owner
     *        Indicates whether AWS or the customer owns and manages the AWS Config rule.
     * @see Owner
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * Indicates whether AWS or the customer owns and manages the AWS Config rule.
     * </p>
     * 
     * @return Indicates whether AWS or the customer owns and manages the AWS Config rule.
     * @see Owner
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * Indicates whether AWS or the customer owns and manages the AWS Config rule.
     * </p>
     * 
     * @param owner
     *        Indicates whether AWS or the customer owns and manages the AWS Config rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Owner
     */

    public Source withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * Indicates whether AWS or the customer owns and manages the AWS Config rule.
     * </p>
     * 
     * @param owner
     *        Indicates whether AWS or the customer owns and manages the AWS Config rule.
     * @see Owner
     */

    public void setOwner(Owner owner) {
        withOwner(owner);
    }

    /**
     * <p>
     * Indicates whether AWS or the customer owns and manages the AWS Config rule.
     * </p>
     * 
     * @param owner
     *        Indicates whether AWS or the customer owns and manages the AWS Config rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Owner
     */

    public Source withOwner(Owner owner) {
        this.owner = owner.toString();
        return this;
    }

    /**
     * <p>
     * For AWS Config managed rules, a predefined identifier from a list. For example, <code>IAM_PASSWORD_POLICY</code>
     * is a managed rule. To reference a managed rule, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">Using AWS
     * Managed Config Rules</a>.
     * </p>
     * <p>
     * For custom rules, the identifier is the Amazon Resource Name (ARN) of the rule's AWS Lambda function, such as
     * <code>arn:aws:lambda:us-east-2:123456789012:function:custom_rule_name</code>.
     * </p>
     * 
     * @param sourceIdentifier
     *        For AWS Config managed rules, a predefined identifier from a list. For example,
     *        <code>IAM_PASSWORD_POLICY</code> is a managed rule. To reference a managed rule, see <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html"
     *        >Using AWS Managed Config Rules</a>.</p>
     *        <p>
     *        For custom rules, the identifier is the Amazon Resource Name (ARN) of the rule's AWS Lambda function, such
     *        as <code>arn:aws:lambda:us-east-2:123456789012:function:custom_rule_name</code>.
     */

    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    /**
     * <p>
     * For AWS Config managed rules, a predefined identifier from a list. For example, <code>IAM_PASSWORD_POLICY</code>
     * is a managed rule. To reference a managed rule, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">Using AWS
     * Managed Config Rules</a>.
     * </p>
     * <p>
     * For custom rules, the identifier is the Amazon Resource Name (ARN) of the rule's AWS Lambda function, such as
     * <code>arn:aws:lambda:us-east-2:123456789012:function:custom_rule_name</code>.
     * </p>
     * 
     * @return For AWS Config managed rules, a predefined identifier from a list. For example,
     *         <code>IAM_PASSWORD_POLICY</code> is a managed rule. To reference a managed rule, see <a
     *         href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html"
     *         >Using AWS Managed Config Rules</a>.</p>
     *         <p>
     *         For custom rules, the identifier is the Amazon Resource Name (ARN) of the rule's AWS Lambda function,
     *         such as <code>arn:aws:lambda:us-east-2:123456789012:function:custom_rule_name</code>.
     */

    public String getSourceIdentifier() {
        return this.sourceIdentifier;
    }

    /**
     * <p>
     * For AWS Config managed rules, a predefined identifier from a list. For example, <code>IAM_PASSWORD_POLICY</code>
     * is a managed rule. To reference a managed rule, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">Using AWS
     * Managed Config Rules</a>.
     * </p>
     * <p>
     * For custom rules, the identifier is the Amazon Resource Name (ARN) of the rule's AWS Lambda function, such as
     * <code>arn:aws:lambda:us-east-2:123456789012:function:custom_rule_name</code>.
     * </p>
     * 
     * @param sourceIdentifier
     *        For AWS Config managed rules, a predefined identifier from a list. For example,
     *        <code>IAM_PASSWORD_POLICY</code> is a managed rule. To reference a managed rule, see <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html"
     *        >Using AWS Managed Config Rules</a>.</p>
     *        <p>
     *        For custom rules, the identifier is the Amazon Resource Name (ARN) of the rule's AWS Lambda function, such
     *        as <code>arn:aws:lambda:us-east-2:123456789012:function:custom_rule_name</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Source withSourceIdentifier(String sourceIdentifier) {
        setSourceIdentifier(sourceIdentifier);
        return this;
    }

    /**
     * <p>
     * Provides the source and type of the event that causes AWS Config to evaluate your AWS resources.
     * </p>
     * 
     * @return Provides the source and type of the event that causes AWS Config to evaluate your AWS resources.
     */

    public java.util.List<SourceDetail> getSourceDetails() {
        if (sourceDetails == null) {
            sourceDetails = new com.amazonaws.internal.SdkInternalList<SourceDetail>();
        }
        return sourceDetails;
    }

    /**
     * <p>
     * Provides the source and type of the event that causes AWS Config to evaluate your AWS resources.
     * </p>
     * 
     * @param sourceDetails
     *        Provides the source and type of the event that causes AWS Config to evaluate your AWS resources.
     */

    public void setSourceDetails(java.util.Collection<SourceDetail> sourceDetails) {
        if (sourceDetails == null) {
            this.sourceDetails = null;
            return;
        }

        this.sourceDetails = new com.amazonaws.internal.SdkInternalList<SourceDetail>(sourceDetails);
    }

    /**
     * <p>
     * Provides the source and type of the event that causes AWS Config to evaluate your AWS resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceDetails(java.util.Collection)} or {@link #withSourceDetails(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param sourceDetails
     *        Provides the source and type of the event that causes AWS Config to evaluate your AWS resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Source withSourceDetails(SourceDetail... sourceDetails) {
        if (this.sourceDetails == null) {
            setSourceDetails(new com.amazonaws.internal.SdkInternalList<SourceDetail>(sourceDetails.length));
        }
        for (SourceDetail ele : sourceDetails) {
            this.sourceDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides the source and type of the event that causes AWS Config to evaluate your AWS resources.
     * </p>
     * 
     * @param sourceDetails
     *        Provides the source and type of the event that causes AWS Config to evaluate your AWS resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Source withSourceDetails(java.util.Collection<SourceDetail> sourceDetails) {
        setSourceDetails(sourceDetails);
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
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getSourceIdentifier() != null)
            sb.append("SourceIdentifier: ").append(getSourceIdentifier()).append(",");
        if (getSourceDetails() != null)
            sb.append("SourceDetails: ").append(getSourceDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Source == false)
            return false;
        Source other = (Source) obj;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getSourceIdentifier() == null ^ this.getSourceIdentifier() == null)
            return false;
        if (other.getSourceIdentifier() != null && other.getSourceIdentifier().equals(this.getSourceIdentifier()) == false)
            return false;
        if (other.getSourceDetails() == null ^ this.getSourceDetails() == null)
            return false;
        if (other.getSourceDetails() != null && other.getSourceDetails().equals(this.getSourceDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getSourceIdentifier() == null) ? 0 : getSourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSourceDetails() == null) ? 0 : getSourceDetails().hashCode());
        return hashCode;
    }

    @Override
    public Source clone() {
        try {
            return (Source) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.SourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
