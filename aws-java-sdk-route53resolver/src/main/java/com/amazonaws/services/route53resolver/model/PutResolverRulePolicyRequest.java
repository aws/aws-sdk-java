/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/PutResolverRulePolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutResolverRulePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule that you want to share with another account.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * An AWS Identity and Access Management policy statement that lists the rules that you want to share with another
     * AWS account and the operations that you want the account to be able to perform. You can specify the following
     * operations in the <code>Action</code> section of the statement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>route53resolver:GetResolverRule</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route53resolver:AssociateResolverRule</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route53resolver:DisassociateResolverRule</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route53resolver:ListResolverRules</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route53resolver:ListResolverRuleAssociations</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * In the <code>Resource</code> section of the statement, specify the ARN for the rule that you want to share with
     * another account. Specify the same ARN that you specified in <code>Arn</code>.
     * </p>
     */
    private String resolverRulePolicy;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule that you want to share with another account.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the rule that you want to share with another account.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule that you want to share with another account.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the rule that you want to share with another account.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the rule that you want to share with another account.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the rule that you want to share with another account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResolverRulePolicyRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * An AWS Identity and Access Management policy statement that lists the rules that you want to share with another
     * AWS account and the operations that you want the account to be able to perform. You can specify the following
     * operations in the <code>Action</code> section of the statement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>route53resolver:GetResolverRule</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route53resolver:AssociateResolverRule</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route53resolver:DisassociateResolverRule</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route53resolver:ListResolverRules</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route53resolver:ListResolverRuleAssociations</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * In the <code>Resource</code> section of the statement, specify the ARN for the rule that you want to share with
     * another account. Specify the same ARN that you specified in <code>Arn</code>.
     * </p>
     * 
     * @param resolverRulePolicy
     *        An AWS Identity and Access Management policy statement that lists the rules that you want to share with
     *        another AWS account and the operations that you want the account to be able to perform. You can specify
     *        the following operations in the <code>Action</code> section of the statement:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>route53resolver:GetResolverRule</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route53resolver:AssociateResolverRule</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route53resolver:DisassociateResolverRule</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route53resolver:ListResolverRules</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route53resolver:ListResolverRuleAssociations</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In the <code>Resource</code> section of the statement, specify the ARN for the rule that you want to share
     *        with another account. Specify the same ARN that you specified in <code>Arn</code>.
     */

    public void setResolverRulePolicy(String resolverRulePolicy) {
        this.resolverRulePolicy = resolverRulePolicy;
    }

    /**
     * <p>
     * An AWS Identity and Access Management policy statement that lists the rules that you want to share with another
     * AWS account and the operations that you want the account to be able to perform. You can specify the following
     * operations in the <code>Action</code> section of the statement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>route53resolver:GetResolverRule</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route53resolver:AssociateResolverRule</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route53resolver:DisassociateResolverRule</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route53resolver:ListResolverRules</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route53resolver:ListResolverRuleAssociations</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * In the <code>Resource</code> section of the statement, specify the ARN for the rule that you want to share with
     * another account. Specify the same ARN that you specified in <code>Arn</code>.
     * </p>
     * 
     * @return An AWS Identity and Access Management policy statement that lists the rules that you want to share with
     *         another AWS account and the operations that you want the account to be able to perform. You can specify
     *         the following operations in the <code>Action</code> section of the statement:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>route53resolver:GetResolverRule</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route53resolver:AssociateResolverRule</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route53resolver:DisassociateResolverRule</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route53resolver:ListResolverRules</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route53resolver:ListResolverRuleAssociations</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         In the <code>Resource</code> section of the statement, specify the ARN for the rule that you want to
     *         share with another account. Specify the same ARN that you specified in <code>Arn</code>.
     */

    public String getResolverRulePolicy() {
        return this.resolverRulePolicy;
    }

    /**
     * <p>
     * An AWS Identity and Access Management policy statement that lists the rules that you want to share with another
     * AWS account and the operations that you want the account to be able to perform. You can specify the following
     * operations in the <code>Action</code> section of the statement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>route53resolver:GetResolverRule</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route53resolver:AssociateResolverRule</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route53resolver:DisassociateResolverRule</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route53resolver:ListResolverRules</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route53resolver:ListResolverRuleAssociations</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * In the <code>Resource</code> section of the statement, specify the ARN for the rule that you want to share with
     * another account. Specify the same ARN that you specified in <code>Arn</code>.
     * </p>
     * 
     * @param resolverRulePolicy
     *        An AWS Identity and Access Management policy statement that lists the rules that you want to share with
     *        another AWS account and the operations that you want the account to be able to perform. You can specify
     *        the following operations in the <code>Action</code> section of the statement:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>route53resolver:GetResolverRule</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route53resolver:AssociateResolverRule</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route53resolver:DisassociateResolverRule</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route53resolver:ListResolverRules</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route53resolver:ListResolverRuleAssociations</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In the <code>Resource</code> section of the statement, specify the ARN for the rule that you want to share
     *        with another account. Specify the same ARN that you specified in <code>Arn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResolverRulePolicyRequest withResolverRulePolicy(String resolverRulePolicy) {
        setResolverRulePolicy(resolverRulePolicy);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getResolverRulePolicy() != null)
            sb.append("ResolverRulePolicy: ").append(getResolverRulePolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutResolverRulePolicyRequest == false)
            return false;
        PutResolverRulePolicyRequest other = (PutResolverRulePolicyRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getResolverRulePolicy() == null ^ this.getResolverRulePolicy() == null)
            return false;
        if (other.getResolverRulePolicy() != null && other.getResolverRulePolicy().equals(this.getResolverRulePolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getResolverRulePolicy() == null) ? 0 : getResolverRulePolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutResolverRulePolicyRequest clone() {
        return (PutResolverRulePolicyRequest) super.clone();
    }

}
