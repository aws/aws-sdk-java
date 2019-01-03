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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/AttachPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier (ID) of the policy that you want to attach to the target. You can get the ID for the policy
     * by calling the <a>ListPolicies</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a policy ID string requires "p-" followed by
     * from 8 to 128 lower-case letters or digits.
     * </p>
     */
    private String policyId;
    /**
     * <p>
     * The unique identifier (ID) of the root, OU, or account that you want to attach the policy to. You can get the ID
     * by calling the <a>ListRoots</a>, <a>ListOrganizationalUnitsForParent</a>, or <a>ListAccounts</a> operations.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a target ID string requires one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Account: a string that consists of exactly 12 digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits
     * (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case
     * letters or digits.
     * </p>
     * </li>
     * </ul>
     */
    private String targetId;

    /**
     * <p>
     * The unique identifier (ID) of the policy that you want to attach to the target. You can get the ID for the policy
     * by calling the <a>ListPolicies</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a policy ID string requires "p-" followed by
     * from 8 to 128 lower-case letters or digits.
     * </p>
     * 
     * @param policyId
     *        The unique identifier (ID) of the policy that you want to attach to the target. You can get the ID for the
     *        policy by calling the <a>ListPolicies</a> operation.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a policy ID string requires "p-"
     *        followed by from 8 to 128 lower-case letters or digits.
     */

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the policy that you want to attach to the target. You can get the ID for the policy
     * by calling the <a>ListPolicies</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a policy ID string requires "p-" followed by
     * from 8 to 128 lower-case letters or digits.
     * </p>
     * 
     * @return The unique identifier (ID) of the policy that you want to attach to the target. You can get the ID for
     *         the policy by calling the <a>ListPolicies</a> operation.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a policy ID string requires "p-"
     *         followed by from 8 to 128 lower-case letters or digits.
     */

    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the policy that you want to attach to the target. You can get the ID for the policy
     * by calling the <a>ListPolicies</a> operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a policy ID string requires "p-" followed by
     * from 8 to 128 lower-case letters or digits.
     * </p>
     * 
     * @param policyId
     *        The unique identifier (ID) of the policy that you want to attach to the target. You can get the ID for the
     *        policy by calling the <a>ListPolicies</a> operation.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a policy ID string requires "p-"
     *        followed by from 8 to 128 lower-case letters or digits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachPolicyRequest withPolicyId(String policyId) {
        setPolicyId(policyId);
        return this;
    }

    /**
     * <p>
     * The unique identifier (ID) of the root, OU, or account that you want to attach the policy to. You can get the ID
     * by calling the <a>ListRoots</a>, <a>ListOrganizationalUnitsForParent</a>, or <a>ListAccounts</a> operations.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a target ID string requires one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Account: a string that consists of exactly 12 digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits
     * (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case
     * letters or digits.
     * </p>
     * </li>
     * </ul>
     * 
     * @param targetId
     *        The unique identifier (ID) of the root, OU, or account that you want to attach the policy to. You can get
     *        the ID by calling the <a>ListRoots</a>, <a>ListOrganizationalUnitsForParent</a>, or <a>ListAccounts</a>
     *        operations.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a target ID string requires one of the
     *        following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Account: a string that consists of exactly 12 digits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or
     *        digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional
     *        lower-case letters or digits.
     *        </p>
     *        </li>
     */

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the root, OU, or account that you want to attach the policy to. You can get the ID
     * by calling the <a>ListRoots</a>, <a>ListOrganizationalUnitsForParent</a>, or <a>ListAccounts</a> operations.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a target ID string requires one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Account: a string that consists of exactly 12 digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits
     * (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case
     * letters or digits.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The unique identifier (ID) of the root, OU, or account that you want to attach the policy to. You can get
     *         the ID by calling the <a>ListRoots</a>, <a>ListOrganizationalUnitsForParent</a>, or <a>ListAccounts</a>
     *         operations.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a target ID string requires one of
     *         the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Account: a string that consists of exactly 12 digits.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or
     *         digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional
     *         lower-case letters or digits.
     *         </p>
     *         </li>
     */

    public String getTargetId() {
        return this.targetId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the root, OU, or account that you want to attach the policy to. You can get the ID
     * by calling the <a>ListRoots</a>, <a>ListOrganizationalUnitsForParent</a>, or <a>ListAccounts</a> operations.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a target ID string requires one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Account: a string that consists of exactly 12 digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits
     * (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional lower-case
     * letters or digits.
     * </p>
     * </li>
     * </ul>
     * 
     * @param targetId
     *        The unique identifier (ID) of the root, OU, or account that you want to attach the policy to. You can get
     *        the ID by calling the <a>ListRoots</a>, <a>ListOrganizationalUnitsForParent</a>, or <a>ListAccounts</a>
     *        operations.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a target ID string requires one of the
     *        following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Root: a string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Account: a string that consists of exactly 12 digits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Organizational unit (OU): a string that begins with "ou-" followed by from 4 to 32 lower-case letters or
     *        digits (the ID of the root that the OU is in) followed by a second "-" dash and from 8 to 32 additional
     *        lower-case letters or digits.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachPolicyRequest withTargetId(String targetId) {
        setTargetId(targetId);
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
        if (getPolicyId() != null)
            sb.append("PolicyId: ").append(getPolicyId()).append(",");
        if (getTargetId() != null)
            sb.append("TargetId: ").append(getTargetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachPolicyRequest == false)
            return false;
        AttachPolicyRequest other = (AttachPolicyRequest) obj;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getTargetId() == null ^ this.getTargetId() == null)
            return false;
        if (other.getTargetId() != null && other.getTargetId().equals(this.getTargetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode + ((getTargetId() == null) ? 0 : getTargetId().hashCode());
        return hashCode;
    }

    @Override
    public AttachPolicyRequest clone() {
        return (AttachPolicyRequest) super.clone();
    }

}
