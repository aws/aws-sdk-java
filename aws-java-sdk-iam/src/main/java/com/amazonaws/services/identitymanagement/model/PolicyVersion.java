/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains information about a version of a managed policy.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * CreatePolicyVersion, GetPolicyVersion, and ListPolicyVersions actions.
 * </p>
 * <p>
 * For more information about managed policies, refer to
 * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
 * in the <i>Using IAM</i> guide.
 * </p>
 */
public class PolicyVersion implements Serializable {

    /**
     * The policy document. <p>The policy document is returned in the
     * response to the <a>GetPolicyVersion</a> operation. It is not included
     * in the response to the <a>ListPolicyVersions</a> operation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     */
    private String document;

    /**
     * The identifier for the policy version. <p>Policy version identifiers
     * always begin with <code>v</code> (always lowercase). When a policy is
     * created, the first policy version is <code>v1</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>v[1-9][0-9]*(\.[A-Za-z0-9-]*)?<br/>
     */
    private String versionId;

    /**
     * Specifies whether the policy version is set as the policy's default
     * version.
     */
    private Boolean isDefaultVersion;

    /**
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     * 8601 date-time format</a>, when the policy version was created.
     */
    private java.util.Date createDate;

    /**
     * The policy document. <p>The policy document is returned in the
     * response to the <a>GetPolicyVersion</a> operation. It is not included
     * in the response to the <a>ListPolicyVersions</a> operation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @return The policy document. <p>The policy document is returned in the
     *         response to the <a>GetPolicyVersion</a> operation. It is not included
     *         in the response to the <a>ListPolicyVersions</a> operation.
     */
    public String getDocument() {
        return document;
    }
    
    /**
     * The policy document. <p>The policy document is returned in the
     * response to the <a>GetPolicyVersion</a> operation. It is not included
     * in the response to the <a>ListPolicyVersions</a> operation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param document The policy document. <p>The policy document is returned in the
     *         response to the <a>GetPolicyVersion</a> operation. It is not included
     *         in the response to the <a>ListPolicyVersions</a> operation.
     */
    public void setDocument(String document) {
        this.document = document;
    }
    
    /**
     * The policy document. <p>The policy document is returned in the
     * response to the <a>GetPolicyVersion</a> operation. It is not included
     * in the response to the <a>ListPolicyVersions</a> operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param document The policy document. <p>The policy document is returned in the
     *         response to the <a>GetPolicyVersion</a> operation. It is not included
     *         in the response to the <a>ListPolicyVersions</a> operation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PolicyVersion withDocument(String document) {
        this.document = document;
        return this;
    }

    /**
     * The identifier for the policy version. <p>Policy version identifiers
     * always begin with <code>v</code> (always lowercase). When a policy is
     * created, the first policy version is <code>v1</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>v[1-9][0-9]*(\.[A-Za-z0-9-]*)?<br/>
     *
     * @return The identifier for the policy version. <p>Policy version identifiers
     *         always begin with <code>v</code> (always lowercase). When a policy is
     *         created, the first policy version is <code>v1</code>.
     */
    public String getVersionId() {
        return versionId;
    }
    
    /**
     * The identifier for the policy version. <p>Policy version identifiers
     * always begin with <code>v</code> (always lowercase). When a policy is
     * created, the first policy version is <code>v1</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>v[1-9][0-9]*(\.[A-Za-z0-9-]*)?<br/>
     *
     * @param versionId The identifier for the policy version. <p>Policy version identifiers
     *         always begin with <code>v</code> (always lowercase). When a policy is
     *         created, the first policy version is <code>v1</code>.
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }
    
    /**
     * The identifier for the policy version. <p>Policy version identifiers
     * always begin with <code>v</code> (always lowercase). When a policy is
     * created, the first policy version is <code>v1</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>v[1-9][0-9]*(\.[A-Za-z0-9-]*)?<br/>
     *
     * @param versionId The identifier for the policy version. <p>Policy version identifiers
     *         always begin with <code>v</code> (always lowercase). When a policy is
     *         created, the first policy version is <code>v1</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PolicyVersion withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * Specifies whether the policy version is set as the policy's default
     * version.
     *
     * @return Specifies whether the policy version is set as the policy's default
     *         version.
     */
    public Boolean isDefaultVersion() {
        return isDefaultVersion;
    }
    
    /**
     * Specifies whether the policy version is set as the policy's default
     * version.
     *
     * @param isDefaultVersion Specifies whether the policy version is set as the policy's default
     *         version.
     */
    public void setIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
    }
    
    /**
     * Specifies whether the policy version is set as the policy's default
     * version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isDefaultVersion Specifies whether the policy version is set as the policy's default
     *         version.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PolicyVersion withIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
        return this;
    }

    /**
     * Specifies whether the policy version is set as the policy's default
     * version.
     *
     * @return Specifies whether the policy version is set as the policy's default
     *         version.
     */
    public Boolean getIsDefaultVersion() {
        return isDefaultVersion;
    }

    /**
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     * 8601 date-time format</a>, when the policy version was created.
     *
     * @return The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     *         8601 date-time format</a>, when the policy version was created.
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }
    
    /**
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     * 8601 date-time format</a>, when the policy version was created.
     *
     * @param createDate The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     *         8601 date-time format</a>, when the policy version was created.
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }
    
    /**
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     * 8601 date-time format</a>, when the policy version was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createDate The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO
     *         8601 date-time format</a>, when the policy version was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PolicyVersion withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
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
        if (getDocument() != null) sb.append("Document: " + getDocument() + ",");
        if (getVersionId() != null) sb.append("VersionId: " + getVersionId() + ",");
        if (isDefaultVersion() != null) sb.append("IsDefaultVersion: " + isDefaultVersion() + ",");
        if (getCreateDate() != null) sb.append("CreateDate: " + getCreateDate() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode()); 
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode()); 
        hashCode = prime * hashCode + ((isDefaultVersion() == null) ? 0 : isDefaultVersion().hashCode()); 
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PolicyVersion == false) return false;
        PolicyVersion other = (PolicyVersion)obj;
        
        if (other.getDocument() == null ^ this.getDocument() == null) return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false) return false; 
        if (other.getVersionId() == null ^ this.getVersionId() == null) return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false) return false; 
        if (other.isDefaultVersion() == null ^ this.isDefaultVersion() == null) return false;
        if (other.isDefaultVersion() != null && other.isDefaultVersion().equals(this.isDefaultVersion()) == false) return false; 
        if (other.getCreateDate() == null ^ this.getCreateDate() == null) return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false) return false; 
        return true;
    }
    
}
    