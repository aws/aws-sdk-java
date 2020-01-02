/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DeletePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the policy that you want to delete. <code>PolicyId</code> is returned by <code>PutPolicy</code> and by
     * <code>ListPolicies</code>.
     * </p>
     */
    private String policyId;
    /**
     * <p>
     * If <code>True</code>, the request performs cleanup according to the policy type.
     * </p>
     * <p>
     * For AWS WAF and Shield Advanced policies, the cleanup does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Deletes rule groups created by AWS Firewall Manager
     * </p>
     * </li>
     * <li>
     * <p>
     * Removes web ACLs from in-scope resources
     * </p>
     * </li>
     * <li>
     * <p>
     * Deletes web ACLs that contain no rules or rule groups
     * </p>
     * </li>
     * </ul>
     * <p>
     * For security group policies, the cleanup does the following for each security group in the policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Disassociates the security group from in-scope resources
     * </p>
     * </li>
     * <li>
     * <p>
     * Deletes the security group if it was created through Firewall Manager and if it's no longer associated with any
     * resources through another policy
     * </p>
     * </li>
     * </ul>
     * <p>
     * After the cleanup, in-scope resources are no longer protected by web ACLs in this policy. Protection of
     * out-of-scope resources remains unchanged. Scope is determined by tags that you create and accounts that you
     * associate with the policy. When creating the policy, if you specify that only resources in specific accounts or
     * with specific tags are in scope of the policy, those accounts and resources are handled by the policy. All others
     * are out of scope. If you don't specify tags or accounts, all resources are in scope.
     * </p>
     */
    private Boolean deleteAllPolicyResources;

    /**
     * <p>
     * The ID of the policy that you want to delete. <code>PolicyId</code> is returned by <code>PutPolicy</code> and by
     * <code>ListPolicies</code>.
     * </p>
     * 
     * @param policyId
     *        The ID of the policy that you want to delete. <code>PolicyId</code> is returned by <code>PutPolicy</code>
     *        and by <code>ListPolicies</code>.
     */

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The ID of the policy that you want to delete. <code>PolicyId</code> is returned by <code>PutPolicy</code> and by
     * <code>ListPolicies</code>.
     * </p>
     * 
     * @return The ID of the policy that you want to delete. <code>PolicyId</code> is returned by <code>PutPolicy</code>
     *         and by <code>ListPolicies</code>.
     */

    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * <p>
     * The ID of the policy that you want to delete. <code>PolicyId</code> is returned by <code>PutPolicy</code> and by
     * <code>ListPolicies</code>.
     * </p>
     * 
     * @param policyId
     *        The ID of the policy that you want to delete. <code>PolicyId</code> is returned by <code>PutPolicy</code>
     *        and by <code>ListPolicies</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePolicyRequest withPolicyId(String policyId) {
        setPolicyId(policyId);
        return this;
    }

    /**
     * <p>
     * If <code>True</code>, the request performs cleanup according to the policy type.
     * </p>
     * <p>
     * For AWS WAF and Shield Advanced policies, the cleanup does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Deletes rule groups created by AWS Firewall Manager
     * </p>
     * </li>
     * <li>
     * <p>
     * Removes web ACLs from in-scope resources
     * </p>
     * </li>
     * <li>
     * <p>
     * Deletes web ACLs that contain no rules or rule groups
     * </p>
     * </li>
     * </ul>
     * <p>
     * For security group policies, the cleanup does the following for each security group in the policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Disassociates the security group from in-scope resources
     * </p>
     * </li>
     * <li>
     * <p>
     * Deletes the security group if it was created through Firewall Manager and if it's no longer associated with any
     * resources through another policy
     * </p>
     * </li>
     * </ul>
     * <p>
     * After the cleanup, in-scope resources are no longer protected by web ACLs in this policy. Protection of
     * out-of-scope resources remains unchanged. Scope is determined by tags that you create and accounts that you
     * associate with the policy. When creating the policy, if you specify that only resources in specific accounts or
     * with specific tags are in scope of the policy, those accounts and resources are handled by the policy. All others
     * are out of scope. If you don't specify tags or accounts, all resources are in scope.
     * </p>
     * 
     * @param deleteAllPolicyResources
     *        If <code>True</code>, the request performs cleanup according to the policy type. </p>
     *        <p>
     *        For AWS WAF and Shield Advanced policies, the cleanup does the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Deletes rule groups created by AWS Firewall Manager
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Removes web ACLs from in-scope resources
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Deletes web ACLs that contain no rules or rule groups
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For security group policies, the cleanup does the following for each security group in the policy:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Disassociates the security group from in-scope resources
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Deletes the security group if it was created through Firewall Manager and if it's no longer associated
     *        with any resources through another policy
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        After the cleanup, in-scope resources are no longer protected by web ACLs in this policy. Protection of
     *        out-of-scope resources remains unchanged. Scope is determined by tags that you create and accounts that
     *        you associate with the policy. When creating the policy, if you specify that only resources in specific
     *        accounts or with specific tags are in scope of the policy, those accounts and resources are handled by the
     *        policy. All others are out of scope. If you don't specify tags or accounts, all resources are in scope.
     */

    public void setDeleteAllPolicyResources(Boolean deleteAllPolicyResources) {
        this.deleteAllPolicyResources = deleteAllPolicyResources;
    }

    /**
     * <p>
     * If <code>True</code>, the request performs cleanup according to the policy type.
     * </p>
     * <p>
     * For AWS WAF and Shield Advanced policies, the cleanup does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Deletes rule groups created by AWS Firewall Manager
     * </p>
     * </li>
     * <li>
     * <p>
     * Removes web ACLs from in-scope resources
     * </p>
     * </li>
     * <li>
     * <p>
     * Deletes web ACLs that contain no rules or rule groups
     * </p>
     * </li>
     * </ul>
     * <p>
     * For security group policies, the cleanup does the following for each security group in the policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Disassociates the security group from in-scope resources
     * </p>
     * </li>
     * <li>
     * <p>
     * Deletes the security group if it was created through Firewall Manager and if it's no longer associated with any
     * resources through another policy
     * </p>
     * </li>
     * </ul>
     * <p>
     * After the cleanup, in-scope resources are no longer protected by web ACLs in this policy. Protection of
     * out-of-scope resources remains unchanged. Scope is determined by tags that you create and accounts that you
     * associate with the policy. When creating the policy, if you specify that only resources in specific accounts or
     * with specific tags are in scope of the policy, those accounts and resources are handled by the policy. All others
     * are out of scope. If you don't specify tags or accounts, all resources are in scope.
     * </p>
     * 
     * @return If <code>True</code>, the request performs cleanup according to the policy type. </p>
     *         <p>
     *         For AWS WAF and Shield Advanced policies, the cleanup does the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Deletes rule groups created by AWS Firewall Manager
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Removes web ACLs from in-scope resources
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Deletes web ACLs that contain no rules or rule groups
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For security group policies, the cleanup does the following for each security group in the policy:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Disassociates the security group from in-scope resources
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Deletes the security group if it was created through Firewall Manager and if it's no longer associated
     *         with any resources through another policy
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         After the cleanup, in-scope resources are no longer protected by web ACLs in this policy. Protection of
     *         out-of-scope resources remains unchanged. Scope is determined by tags that you create and accounts that
     *         you associate with the policy. When creating the policy, if you specify that only resources in specific
     *         accounts or with specific tags are in scope of the policy, those accounts and resources are handled by
     *         the policy. All others are out of scope. If you don't specify tags or accounts, all resources are in
     *         scope.
     */

    public Boolean getDeleteAllPolicyResources() {
        return this.deleteAllPolicyResources;
    }

    /**
     * <p>
     * If <code>True</code>, the request performs cleanup according to the policy type.
     * </p>
     * <p>
     * For AWS WAF and Shield Advanced policies, the cleanup does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Deletes rule groups created by AWS Firewall Manager
     * </p>
     * </li>
     * <li>
     * <p>
     * Removes web ACLs from in-scope resources
     * </p>
     * </li>
     * <li>
     * <p>
     * Deletes web ACLs that contain no rules or rule groups
     * </p>
     * </li>
     * </ul>
     * <p>
     * For security group policies, the cleanup does the following for each security group in the policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Disassociates the security group from in-scope resources
     * </p>
     * </li>
     * <li>
     * <p>
     * Deletes the security group if it was created through Firewall Manager and if it's no longer associated with any
     * resources through another policy
     * </p>
     * </li>
     * </ul>
     * <p>
     * After the cleanup, in-scope resources are no longer protected by web ACLs in this policy. Protection of
     * out-of-scope resources remains unchanged. Scope is determined by tags that you create and accounts that you
     * associate with the policy. When creating the policy, if you specify that only resources in specific accounts or
     * with specific tags are in scope of the policy, those accounts and resources are handled by the policy. All others
     * are out of scope. If you don't specify tags or accounts, all resources are in scope.
     * </p>
     * 
     * @param deleteAllPolicyResources
     *        If <code>True</code>, the request performs cleanup according to the policy type. </p>
     *        <p>
     *        For AWS WAF and Shield Advanced policies, the cleanup does the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Deletes rule groups created by AWS Firewall Manager
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Removes web ACLs from in-scope resources
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Deletes web ACLs that contain no rules or rule groups
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For security group policies, the cleanup does the following for each security group in the policy:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Disassociates the security group from in-scope resources
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Deletes the security group if it was created through Firewall Manager and if it's no longer associated
     *        with any resources through another policy
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        After the cleanup, in-scope resources are no longer protected by web ACLs in this policy. Protection of
     *        out-of-scope resources remains unchanged. Scope is determined by tags that you create and accounts that
     *        you associate with the policy. When creating the policy, if you specify that only resources in specific
     *        accounts or with specific tags are in scope of the policy, those accounts and resources are handled by the
     *        policy. All others are out of scope. If you don't specify tags or accounts, all resources are in scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePolicyRequest withDeleteAllPolicyResources(Boolean deleteAllPolicyResources) {
        setDeleteAllPolicyResources(deleteAllPolicyResources);
        return this;
    }

    /**
     * <p>
     * If <code>True</code>, the request performs cleanup according to the policy type.
     * </p>
     * <p>
     * For AWS WAF and Shield Advanced policies, the cleanup does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Deletes rule groups created by AWS Firewall Manager
     * </p>
     * </li>
     * <li>
     * <p>
     * Removes web ACLs from in-scope resources
     * </p>
     * </li>
     * <li>
     * <p>
     * Deletes web ACLs that contain no rules or rule groups
     * </p>
     * </li>
     * </ul>
     * <p>
     * For security group policies, the cleanup does the following for each security group in the policy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Disassociates the security group from in-scope resources
     * </p>
     * </li>
     * <li>
     * <p>
     * Deletes the security group if it was created through Firewall Manager and if it's no longer associated with any
     * resources through another policy
     * </p>
     * </li>
     * </ul>
     * <p>
     * After the cleanup, in-scope resources are no longer protected by web ACLs in this policy. Protection of
     * out-of-scope resources remains unchanged. Scope is determined by tags that you create and accounts that you
     * associate with the policy. When creating the policy, if you specify that only resources in specific accounts or
     * with specific tags are in scope of the policy, those accounts and resources are handled by the policy. All others
     * are out of scope. If you don't specify tags or accounts, all resources are in scope.
     * </p>
     * 
     * @return If <code>True</code>, the request performs cleanup according to the policy type. </p>
     *         <p>
     *         For AWS WAF and Shield Advanced policies, the cleanup does the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Deletes rule groups created by AWS Firewall Manager
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Removes web ACLs from in-scope resources
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Deletes web ACLs that contain no rules or rule groups
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For security group policies, the cleanup does the following for each security group in the policy:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Disassociates the security group from in-scope resources
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Deletes the security group if it was created through Firewall Manager and if it's no longer associated
     *         with any resources through another policy
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         After the cleanup, in-scope resources are no longer protected by web ACLs in this policy. Protection of
     *         out-of-scope resources remains unchanged. Scope is determined by tags that you create and accounts that
     *         you associate with the policy. When creating the policy, if you specify that only resources in specific
     *         accounts or with specific tags are in scope of the policy, those accounts and resources are handled by
     *         the policy. All others are out of scope. If you don't specify tags or accounts, all resources are in
     *         scope.
     */

    public Boolean isDeleteAllPolicyResources() {
        return this.deleteAllPolicyResources;
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
        if (getPolicyId() != null)
            sb.append("PolicyId: ").append(getPolicyId()).append(",");
        if (getDeleteAllPolicyResources() != null)
            sb.append("DeleteAllPolicyResources: ").append(getDeleteAllPolicyResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePolicyRequest == false)
            return false;
        DeletePolicyRequest other = (DeletePolicyRequest) obj;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getDeleteAllPolicyResources() == null ^ this.getDeleteAllPolicyResources() == null)
            return false;
        if (other.getDeleteAllPolicyResources() != null && other.getDeleteAllPolicyResources().equals(this.getDeleteAllPolicyResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode + ((getDeleteAllPolicyResources() == null) ? 0 : getDeleteAllPolicyResources().hashCode());
        return hashCode;
    }

    @Override
    public DeletePolicyRequest clone() {
        return (DeletePolicyRequest) super.clone();
    }

}
