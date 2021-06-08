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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/PutResolverQueryLogConfigPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutResolverQueryLogConfigPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account that you want to share rules with.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * An AWS Identity and Access Management policy statement that lists the query logging configurations that you want
     * to share with another AWS account and the operations that you want the account to be able to perform. You can
     * specify the following operations in the <code>Actions</code> section of the statement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>route53resolver:AssociateResolverQueryLogConfig</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route53resolver:DisassociateResolverQueryLogConfig</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route53resolver:ListResolverQueryLogConfigAssociations</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route53resolver:ListResolverQueryLogConfigs</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * In the <code>Resource</code> section of the statement, you specify the ARNs for the query logging configurations
     * that you want to share with the account that you specified in <code>Arn</code>.
     * </p>
     */
    private String resolverQueryLogConfigPolicy;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account that you want to share rules with.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the account that you want to share rules with.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account that you want to share rules with.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the account that you want to share rules with.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account that you want to share rules with.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the account that you want to share rules with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResolverQueryLogConfigPolicyRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * An AWS Identity and Access Management policy statement that lists the query logging configurations that you want
     * to share with another AWS account and the operations that you want the account to be able to perform. You can
     * specify the following operations in the <code>Actions</code> section of the statement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>route53resolver:AssociateResolverQueryLogConfig</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route53resolver:DisassociateResolverQueryLogConfig</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route53resolver:ListResolverQueryLogConfigAssociations</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route53resolver:ListResolverQueryLogConfigs</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * In the <code>Resource</code> section of the statement, you specify the ARNs for the query logging configurations
     * that you want to share with the account that you specified in <code>Arn</code>.
     * </p>
     * 
     * @param resolverQueryLogConfigPolicy
     *        An AWS Identity and Access Management policy statement that lists the query logging configurations that
     *        you want to share with another AWS account and the operations that you want the account to be able to
     *        perform. You can specify the following operations in the <code>Actions</code> section of the
     *        statement:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>route53resolver:AssociateResolverQueryLogConfig</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route53resolver:DisassociateResolverQueryLogConfig</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route53resolver:ListResolverQueryLogConfigAssociations</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route53resolver:ListResolverQueryLogConfigs</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In the <code>Resource</code> section of the statement, you specify the ARNs for the query logging
     *        configurations that you want to share with the account that you specified in <code>Arn</code>.
     */

    public void setResolverQueryLogConfigPolicy(String resolverQueryLogConfigPolicy) {
        this.resolverQueryLogConfigPolicy = resolverQueryLogConfigPolicy;
    }

    /**
     * <p>
     * An AWS Identity and Access Management policy statement that lists the query logging configurations that you want
     * to share with another AWS account and the operations that you want the account to be able to perform. You can
     * specify the following operations in the <code>Actions</code> section of the statement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>route53resolver:AssociateResolverQueryLogConfig</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route53resolver:DisassociateResolverQueryLogConfig</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route53resolver:ListResolverQueryLogConfigAssociations</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route53resolver:ListResolverQueryLogConfigs</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * In the <code>Resource</code> section of the statement, you specify the ARNs for the query logging configurations
     * that you want to share with the account that you specified in <code>Arn</code>.
     * </p>
     * 
     * @return An AWS Identity and Access Management policy statement that lists the query logging configurations that
     *         you want to share with another AWS account and the operations that you want the account to be able to
     *         perform. You can specify the following operations in the <code>Actions</code> section of the
     *         statement:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>route53resolver:AssociateResolverQueryLogConfig</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route53resolver:DisassociateResolverQueryLogConfig</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route53resolver:ListResolverQueryLogConfigAssociations</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>route53resolver:ListResolverQueryLogConfigs</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         In the <code>Resource</code> section of the statement, you specify the ARNs for the query logging
     *         configurations that you want to share with the account that you specified in <code>Arn</code>.
     */

    public String getResolverQueryLogConfigPolicy() {
        return this.resolverQueryLogConfigPolicy;
    }

    /**
     * <p>
     * An AWS Identity and Access Management policy statement that lists the query logging configurations that you want
     * to share with another AWS account and the operations that you want the account to be able to perform. You can
     * specify the following operations in the <code>Actions</code> section of the statement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>route53resolver:AssociateResolverQueryLogConfig</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route53resolver:DisassociateResolverQueryLogConfig</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route53resolver:ListResolverQueryLogConfigAssociations</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>route53resolver:ListResolverQueryLogConfigs</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * In the <code>Resource</code> section of the statement, you specify the ARNs for the query logging configurations
     * that you want to share with the account that you specified in <code>Arn</code>.
     * </p>
     * 
     * @param resolverQueryLogConfigPolicy
     *        An AWS Identity and Access Management policy statement that lists the query logging configurations that
     *        you want to share with another AWS account and the operations that you want the account to be able to
     *        perform. You can specify the following operations in the <code>Actions</code> section of the
     *        statement:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>route53resolver:AssociateResolverQueryLogConfig</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route53resolver:DisassociateResolverQueryLogConfig</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route53resolver:ListResolverQueryLogConfigAssociations</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>route53resolver:ListResolverQueryLogConfigs</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In the <code>Resource</code> section of the statement, you specify the ARNs for the query logging
     *        configurations that you want to share with the account that you specified in <code>Arn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResolverQueryLogConfigPolicyRequest withResolverQueryLogConfigPolicy(String resolverQueryLogConfigPolicy) {
        setResolverQueryLogConfigPolicy(resolverQueryLogConfigPolicy);
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
        if (getResolverQueryLogConfigPolicy() != null)
            sb.append("ResolverQueryLogConfigPolicy: ").append(getResolverQueryLogConfigPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutResolverQueryLogConfigPolicyRequest == false)
            return false;
        PutResolverQueryLogConfigPolicyRequest other = (PutResolverQueryLogConfigPolicyRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getResolverQueryLogConfigPolicy() == null ^ this.getResolverQueryLogConfigPolicy() == null)
            return false;
        if (other.getResolverQueryLogConfigPolicy() != null && other.getResolverQueryLogConfigPolicy().equals(this.getResolverQueryLogConfigPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getResolverQueryLogConfigPolicy() == null) ? 0 : getResolverQueryLogConfigPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutResolverQueryLogConfigPolicyRequest clone() {
        return (PutResolverQueryLogConfigPolicyRequest) super.clone();
    }

}
