/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class CreatePolicyVersionRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    private String policyArn;
    /**
     * <p>
     * The policy document.
     * </p>
     */
    private String policyDocument;
    /**
     * <p>
     * Specifies whether to set this version as the policy's default version.
     * </p>
     * <p>
     * When this parameter is <code>true</code>, the new policy version becomes
     * the operative version; that is, the version that is in effect for the IAM
     * users, groups, and roles that the policy is attached to.
     * </p>
     * <p>
     * For more information about managed policy versions, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     * >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     */
    private Boolean setAsDefault;

    /**
     * @param policyArn
     */
    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * @return
     */
    public String getPolicyArn() {
        return this.policyArn;
    }

    /**
     * @param policyArn
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreatePolicyVersionRequest withPolicyArn(String policyArn) {
        setPolicyArn(policyArn);
        return this;
    }

    /**
     * <p>
     * The policy document.
     * </p>
     * 
     * @param policyDocument
     *        The policy document.
     */
    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The policy document.
     * </p>
     * 
     * @return The policy document.
     */
    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * The policy document.
     * </p>
     * 
     * @param policyDocument
     *        The policy document.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreatePolicyVersionRequest withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
        return this;
    }

    /**
     * <p>
     * Specifies whether to set this version as the policy's default version.
     * </p>
     * <p>
     * When this parameter is <code>true</code>, the new policy version becomes
     * the operative version; that is, the version that is in effect for the IAM
     * users, groups, and roles that the policy is attached to.
     * </p>
     * <p>
     * For more information about managed policy versions, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     * >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param setAsDefault
     *        Specifies whether to set this version as the policy's default
     *        version.</p>
     *        <p>
     *        When this parameter is <code>true</code>, the new policy version
     *        becomes the operative version; that is, the version that is in
     *        effect for the IAM users, groups, and roles that the policy is
     *        attached to.
     *        </p>
     *        <p>
     *        For more information about managed policy versions, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     *        >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
     */
    public void setSetAsDefault(Boolean setAsDefault) {
        this.setAsDefault = setAsDefault;
    }

    /**
     * <p>
     * Specifies whether to set this version as the policy's default version.
     * </p>
     * <p>
     * When this parameter is <code>true</code>, the new policy version becomes
     * the operative version; that is, the version that is in effect for the IAM
     * users, groups, and roles that the policy is attached to.
     * </p>
     * <p>
     * For more information about managed policy versions, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     * >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @return Specifies whether to set this version as the policy's default
     *         version.</p>
     *         <p>
     *         When this parameter is <code>true</code>, the new policy version
     *         becomes the operative version; that is, the version that is in
     *         effect for the IAM users, groups, and roles that the policy is
     *         attached to.
     *         </p>
     *         <p>
     *         For more information about managed policy versions, see <a href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     *         >Versioning for Managed Policies</a> in the <i>IAM User
     *         Guide</i>.
     */
    public Boolean getSetAsDefault() {
        return this.setAsDefault;
    }

    /**
     * <p>
     * Specifies whether to set this version as the policy's default version.
     * </p>
     * <p>
     * When this parameter is <code>true</code>, the new policy version becomes
     * the operative version; that is, the version that is in effect for the IAM
     * users, groups, and roles that the policy is attached to.
     * </p>
     * <p>
     * For more information about managed policy versions, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     * >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param setAsDefault
     *        Specifies whether to set this version as the policy's default
     *        version.</p>
     *        <p>
     *        When this parameter is <code>true</code>, the new policy version
     *        becomes the operative version; that is, the version that is in
     *        effect for the IAM users, groups, and roles that the policy is
     *        attached to.
     *        </p>
     *        <p>
     *        For more information about managed policy versions, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     *        >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreatePolicyVersionRequest withSetAsDefault(Boolean setAsDefault) {
        setSetAsDefault(setAsDefault);
        return this;
    }

    /**
     * <p>
     * Specifies whether to set this version as the policy's default version.
     * </p>
     * <p>
     * When this parameter is <code>true</code>, the new policy version becomes
     * the operative version; that is, the version that is in effect for the IAM
     * users, groups, and roles that the policy is attached to.
     * </p>
     * <p>
     * For more information about managed policy versions, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     * >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @return Specifies whether to set this version as the policy's default
     *         version.</p>
     *         <p>
     *         When this parameter is <code>true</code>, the new policy version
     *         becomes the operative version; that is, the version that is in
     *         effect for the IAM users, groups, and roles that the policy is
     *         attached to.
     *         </p>
     *         <p>
     *         For more information about managed policy versions, see <a href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     *         >Versioning for Managed Policies</a> in the <i>IAM User
     *         Guide</i>.
     */
    public Boolean isSetAsDefault() {
        return this.setAsDefault;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPolicyArn() != null)
            sb.append("PolicyArn: " + getPolicyArn() + ",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: " + getPolicyDocument() + ",");
        if (getSetAsDefault() != null)
            sb.append("SetAsDefault: " + getSetAsDefault());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePolicyVersionRequest == false)
            return false;
        CreatePolicyVersionRequest other = (CreatePolicyVersionRequest) obj;
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null
                && other.getPolicyArn().equals(this.getPolicyArn()) == false)
            return false;
        if (other.getPolicyDocument() == null
                ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null
                && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getSetAsDefault() == null ^ this.getSetAsDefault() == null)
            return false;
        if (other.getSetAsDefault() != null
                && other.getSetAsDefault().equals(this.getSetAsDefault()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getPolicyDocument() == null) ? 0 : getPolicyDocument()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSetAsDefault() == null) ? 0 : getSetAsDefault()
                        .hashCode());
        return hashCode;
    }

    @Override
    public CreatePolicyVersionRequest clone() {
        return (CreatePolicyVersionRequest) super.clone();
    }
}