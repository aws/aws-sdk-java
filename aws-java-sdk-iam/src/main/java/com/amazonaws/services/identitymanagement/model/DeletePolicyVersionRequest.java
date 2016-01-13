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
public class DeletePolicyVersionRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    private String policyArn;
    /**
     * <p>
     * The policy version to delete.
     * </p>
     * <p>
     * For more information about managed policy versions, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     * >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     */
    private String versionId;

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
    public DeletePolicyVersionRequest withPolicyArn(String policyArn) {
        setPolicyArn(policyArn);
        return this;
    }

    /**
     * <p>
     * The policy version to delete.
     * </p>
     * <p>
     * For more information about managed policy versions, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     * >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param versionId
     *        The policy version to delete.</p>
     *        <p>
     *        For more information about managed policy versions, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     *        >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The policy version to delete.
     * </p>
     * <p>
     * For more information about managed policy versions, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     * >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @return The policy version to delete.</p>
     *         <p>
     *         For more information about managed policy versions, see <a href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     *         >Versioning for Managed Policies</a> in the <i>IAM User
     *         Guide</i>.
     */
    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The policy version to delete.
     * </p>
     * <p>
     * For more information about managed policy versions, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     * >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param versionId
     *        The policy version to delete.</p>
     *        <p>
     *        For more information about managed policy versions, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     *        >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DeletePolicyVersionRequest withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
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
        if (getVersionId() != null)
            sb.append("VersionId: " + getVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePolicyVersionRequest == false)
            return false;
        DeletePolicyVersionRequest other = (DeletePolicyVersionRequest) obj;
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null
                && other.getPolicyArn().equals(this.getPolicyArn()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null
                && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        hashCode = prime * hashCode
                + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        return hashCode;
    }

    @Override
    public DeletePolicyVersionRequest clone() {
        return (DeletePolicyVersionRequest) super.clone();
    }
}