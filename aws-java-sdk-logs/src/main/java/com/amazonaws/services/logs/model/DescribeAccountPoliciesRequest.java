/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeAccountPolicies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAccountPoliciesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Use this parameter to limit the returned policies to only the policies that match the policy type that you
     * specify.
     * </p>
     */
    private String policyType;
    /**
     * <p>
     * Use this parameter to limit the returned policies to only the policy with the name that you specify.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * If you are using an account that is set up as a monitoring account for CloudWatch unified cross-account
     * observability, you can use this to specify the account ID of a source account. If you do, the operation returns
     * the account policy for the specified account. Currently, you can specify only one account ID in this parameter.
     * </p>
     * <p>
     * If you omit this parameter, only the policy in the current account is returned.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> accountIdentifiers;

    /**
     * <p>
     * Use this parameter to limit the returned policies to only the policies that match the policy type that you
     * specify.
     * </p>
     * 
     * @param policyType
     *        Use this parameter to limit the returned policies to only the policies that match the policy type that you
     *        specify.
     * @see PolicyType
     */

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * Use this parameter to limit the returned policies to only the policies that match the policy type that you
     * specify.
     * </p>
     * 
     * @return Use this parameter to limit the returned policies to only the policies that match the policy type that
     *         you specify.
     * @see PolicyType
     */

    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * <p>
     * Use this parameter to limit the returned policies to only the policies that match the policy type that you
     * specify.
     * </p>
     * 
     * @param policyType
     *        Use this parameter to limit the returned policies to only the policies that match the policy type that you
     *        specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public DescribeAccountPoliciesRequest withPolicyType(String policyType) {
        setPolicyType(policyType);
        return this;
    }

    /**
     * <p>
     * Use this parameter to limit the returned policies to only the policies that match the policy type that you
     * specify.
     * </p>
     * 
     * @param policyType
     *        Use this parameter to limit the returned policies to only the policies that match the policy type that you
     *        specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public DescribeAccountPoliciesRequest withPolicyType(PolicyType policyType) {
        this.policyType = policyType.toString();
        return this;
    }

    /**
     * <p>
     * Use this parameter to limit the returned policies to only the policy with the name that you specify.
     * </p>
     * 
     * @param policyName
     *        Use this parameter to limit the returned policies to only the policy with the name that you specify.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * Use this parameter to limit the returned policies to only the policy with the name that you specify.
     * </p>
     * 
     * @return Use this parameter to limit the returned policies to only the policy with the name that you specify.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * Use this parameter to limit the returned policies to only the policy with the name that you specify.
     * </p>
     * 
     * @param policyName
     *        Use this parameter to limit the returned policies to only the policy with the name that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountPoliciesRequest withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * If you are using an account that is set up as a monitoring account for CloudWatch unified cross-account
     * observability, you can use this to specify the account ID of a source account. If you do, the operation returns
     * the account policy for the specified account. Currently, you can specify only one account ID in this parameter.
     * </p>
     * <p>
     * If you omit this parameter, only the policy in the current account is returned.
     * </p>
     * 
     * @return If you are using an account that is set up as a monitoring account for CloudWatch unified cross-account
     *         observability, you can use this to specify the account ID of a source account. If you do, the operation
     *         returns the account policy for the specified account. Currently, you can specify only one account ID in
     *         this parameter.</p>
     *         <p>
     *         If you omit this parameter, only the policy in the current account is returned.
     */

    public java.util.List<String> getAccountIdentifiers() {
        if (accountIdentifiers == null) {
            accountIdentifiers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return accountIdentifiers;
    }

    /**
     * <p>
     * If you are using an account that is set up as a monitoring account for CloudWatch unified cross-account
     * observability, you can use this to specify the account ID of a source account. If you do, the operation returns
     * the account policy for the specified account. Currently, you can specify only one account ID in this parameter.
     * </p>
     * <p>
     * If you omit this parameter, only the policy in the current account is returned.
     * </p>
     * 
     * @param accountIdentifiers
     *        If you are using an account that is set up as a monitoring account for CloudWatch unified cross-account
     *        observability, you can use this to specify the account ID of a source account. If you do, the operation
     *        returns the account policy for the specified account. Currently, you can specify only one account ID in
     *        this parameter.</p>
     *        <p>
     *        If you omit this parameter, only the policy in the current account is returned.
     */

    public void setAccountIdentifiers(java.util.Collection<String> accountIdentifiers) {
        if (accountIdentifiers == null) {
            this.accountIdentifiers = null;
            return;
        }

        this.accountIdentifiers = new com.amazonaws.internal.SdkInternalList<String>(accountIdentifiers);
    }

    /**
     * <p>
     * If you are using an account that is set up as a monitoring account for CloudWatch unified cross-account
     * observability, you can use this to specify the account ID of a source account. If you do, the operation returns
     * the account policy for the specified account. Currently, you can specify only one account ID in this parameter.
     * </p>
     * <p>
     * If you omit this parameter, only the policy in the current account is returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIdentifiers(java.util.Collection)} or {@link #withAccountIdentifiers(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param accountIdentifiers
     *        If you are using an account that is set up as a monitoring account for CloudWatch unified cross-account
     *        observability, you can use this to specify the account ID of a source account. If you do, the operation
     *        returns the account policy for the specified account. Currently, you can specify only one account ID in
     *        this parameter.</p>
     *        <p>
     *        If you omit this parameter, only the policy in the current account is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountPoliciesRequest withAccountIdentifiers(String... accountIdentifiers) {
        if (this.accountIdentifiers == null) {
            setAccountIdentifiers(new com.amazonaws.internal.SdkInternalList<String>(accountIdentifiers.length));
        }
        for (String ele : accountIdentifiers) {
            this.accountIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If you are using an account that is set up as a monitoring account for CloudWatch unified cross-account
     * observability, you can use this to specify the account ID of a source account. If you do, the operation returns
     * the account policy for the specified account. Currently, you can specify only one account ID in this parameter.
     * </p>
     * <p>
     * If you omit this parameter, only the policy in the current account is returned.
     * </p>
     * 
     * @param accountIdentifiers
     *        If you are using an account that is set up as a monitoring account for CloudWatch unified cross-account
     *        observability, you can use this to specify the account ID of a source account. If you do, the operation
     *        returns the account policy for the specified account. Currently, you can specify only one account ID in
     *        this parameter.</p>
     *        <p>
     *        If you omit this parameter, only the policy in the current account is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountPoliciesRequest withAccountIdentifiers(java.util.Collection<String> accountIdentifiers) {
        setAccountIdentifiers(accountIdentifiers);
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
        if (getPolicyType() != null)
            sb.append("PolicyType: ").append(getPolicyType()).append(",");
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
        if (getAccountIdentifiers() != null)
            sb.append("AccountIdentifiers: ").append(getAccountIdentifiers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAccountPoliciesRequest == false)
            return false;
        DescribeAccountPoliciesRequest other = (DescribeAccountPoliciesRequest) obj;
        if (other.getPolicyType() == null ^ this.getPolicyType() == null)
            return false;
        if (other.getPolicyType() != null && other.getPolicyType().equals(this.getPolicyType()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getAccountIdentifiers() == null ^ this.getAccountIdentifiers() == null)
            return false;
        if (other.getAccountIdentifiers() != null && other.getAccountIdentifiers().equals(this.getAccountIdentifiers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getAccountIdentifiers() == null) ? 0 : getAccountIdentifiers().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAccountPoliciesRequest clone() {
        return (DescribeAccountPoliciesRequest) super.clone();
    }

}
