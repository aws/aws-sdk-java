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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains information about a version of a managed policy.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>CreatePolicyVersion</a>, <a>GetPolicyVersion</a>,
 * <a>ListPolicyVersions</a>, and <a>GetAccountAuthorizationDetails</a> operations.
 * </p>
 * <p>
 * For more information about managed policies, refer to <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html">Managed Policies and Inline
 * Policies</a> in the <i>Using IAM</i> guide.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/PolicyVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyVersion implements Serializable, Cloneable {

    /**
     * <p>
     * The policy document.
     * </p>
     * <p>
     * The policy document is returned in the response to the <a>GetPolicyVersion</a> and
     * <a>GetAccountAuthorizationDetails</a> operations. It is not returned in the response to the
     * <a>CreatePolicyVersion</a> or <a>ListPolicyVersions</a> operations.
     * </p>
     * <p>
     * The policy document returned in this structure is URL-encoded compliant with <a
     * href="https://tools.ietf.org/html/rfc3986">RFC 3986</a>. You can use a URL decoding method to convert the policy
     * back to plain JSON text. For example, if you use Java, you can use the <code>decode</code> method of the
     * <code>java.net.URLDecoder</code> utility class in the Java SDK. Other languages and SDKs provide similar
     * functionality.
     * </p>
     */
    private String document;
    /**
     * <p>
     * The identifier for the policy version.
     * </p>
     * <p>
     * Policy version identifiers always begin with <code>v</code> (always lowercase). When a policy is created, the
     * first policy version is <code>v1</code>.
     * </p>
     */
    private String versionId;
    /**
     * <p>
     * Specifies whether the policy version is set as the policy's default version.
     * </p>
     */
    private Boolean isDefaultVersion;
    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the policy
     * version was created.
     * </p>
     */
    private java.util.Date createDate;

    /**
     * <p>
     * The policy document.
     * </p>
     * <p>
     * The policy document is returned in the response to the <a>GetPolicyVersion</a> and
     * <a>GetAccountAuthorizationDetails</a> operations. It is not returned in the response to the
     * <a>CreatePolicyVersion</a> or <a>ListPolicyVersions</a> operations.
     * </p>
     * <p>
     * The policy document returned in this structure is URL-encoded compliant with <a
     * href="https://tools.ietf.org/html/rfc3986">RFC 3986</a>. You can use a URL decoding method to convert the policy
     * back to plain JSON text. For example, if you use Java, you can use the <code>decode</code> method of the
     * <code>java.net.URLDecoder</code> utility class in the Java SDK. Other languages and SDKs provide similar
     * functionality.
     * </p>
     * 
     * @param document
     *        The policy document.</p>
     *        <p>
     *        The policy document is returned in the response to the <a>GetPolicyVersion</a> and
     *        <a>GetAccountAuthorizationDetails</a> operations. It is not returned in the response to the
     *        <a>CreatePolicyVersion</a> or <a>ListPolicyVersions</a> operations.
     *        </p>
     *        <p>
     *        The policy document returned in this structure is URL-encoded compliant with <a
     *        href="https://tools.ietf.org/html/rfc3986">RFC 3986</a>. You can use a URL decoding method to convert the
     *        policy back to plain JSON text. For example, if you use Java, you can use the <code>decode</code> method
     *        of the <code>java.net.URLDecoder</code> utility class in the Java SDK. Other languages and SDKs provide
     *        similar functionality.
     */

    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * <p>
     * The policy document.
     * </p>
     * <p>
     * The policy document is returned in the response to the <a>GetPolicyVersion</a> and
     * <a>GetAccountAuthorizationDetails</a> operations. It is not returned in the response to the
     * <a>CreatePolicyVersion</a> or <a>ListPolicyVersions</a> operations.
     * </p>
     * <p>
     * The policy document returned in this structure is URL-encoded compliant with <a
     * href="https://tools.ietf.org/html/rfc3986">RFC 3986</a>. You can use a URL decoding method to convert the policy
     * back to plain JSON text. For example, if you use Java, you can use the <code>decode</code> method of the
     * <code>java.net.URLDecoder</code> utility class in the Java SDK. Other languages and SDKs provide similar
     * functionality.
     * </p>
     * 
     * @return The policy document.</p>
     *         <p>
     *         The policy document is returned in the response to the <a>GetPolicyVersion</a> and
     *         <a>GetAccountAuthorizationDetails</a> operations. It is not returned in the response to the
     *         <a>CreatePolicyVersion</a> or <a>ListPolicyVersions</a> operations.
     *         </p>
     *         <p>
     *         The policy document returned in this structure is URL-encoded compliant with <a
     *         href="https://tools.ietf.org/html/rfc3986">RFC 3986</a>. You can use a URL decoding method to convert the
     *         policy back to plain JSON text. For example, if you use Java, you can use the <code>decode</code> method
     *         of the <code>java.net.URLDecoder</code> utility class in the Java SDK. Other languages and SDKs provide
     *         similar functionality.
     */

    public String getDocument() {
        return this.document;
    }

    /**
     * <p>
     * The policy document.
     * </p>
     * <p>
     * The policy document is returned in the response to the <a>GetPolicyVersion</a> and
     * <a>GetAccountAuthorizationDetails</a> operations. It is not returned in the response to the
     * <a>CreatePolicyVersion</a> or <a>ListPolicyVersions</a> operations.
     * </p>
     * <p>
     * The policy document returned in this structure is URL-encoded compliant with <a
     * href="https://tools.ietf.org/html/rfc3986">RFC 3986</a>. You can use a URL decoding method to convert the policy
     * back to plain JSON text. For example, if you use Java, you can use the <code>decode</code> method of the
     * <code>java.net.URLDecoder</code> utility class in the Java SDK. Other languages and SDKs provide similar
     * functionality.
     * </p>
     * 
     * @param document
     *        The policy document.</p>
     *        <p>
     *        The policy document is returned in the response to the <a>GetPolicyVersion</a> and
     *        <a>GetAccountAuthorizationDetails</a> operations. It is not returned in the response to the
     *        <a>CreatePolicyVersion</a> or <a>ListPolicyVersions</a> operations.
     *        </p>
     *        <p>
     *        The policy document returned in this structure is URL-encoded compliant with <a
     *        href="https://tools.ietf.org/html/rfc3986">RFC 3986</a>. You can use a URL decoding method to convert the
     *        policy back to plain JSON text. For example, if you use Java, you can use the <code>decode</code> method
     *        of the <code>java.net.URLDecoder</code> utility class in the Java SDK. Other languages and SDKs provide
     *        similar functionality.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyVersion withDocument(String document) {
        setDocument(document);
        return this;
    }

    /**
     * <p>
     * The identifier for the policy version.
     * </p>
     * <p>
     * Policy version identifiers always begin with <code>v</code> (always lowercase). When a policy is created, the
     * first policy version is <code>v1</code>.
     * </p>
     * 
     * @param versionId
     *        The identifier for the policy version.</p>
     *        <p>
     *        Policy version identifiers always begin with <code>v</code> (always lowercase). When a policy is created,
     *        the first policy version is <code>v1</code>.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The identifier for the policy version.
     * </p>
     * <p>
     * Policy version identifiers always begin with <code>v</code> (always lowercase). When a policy is created, the
     * first policy version is <code>v1</code>.
     * </p>
     * 
     * @return The identifier for the policy version.</p>
     *         <p>
     *         Policy version identifiers always begin with <code>v</code> (always lowercase). When a policy is created,
     *         the first policy version is <code>v1</code>.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The identifier for the policy version.
     * </p>
     * <p>
     * Policy version identifiers always begin with <code>v</code> (always lowercase). When a policy is created, the
     * first policy version is <code>v1</code>.
     * </p>
     * 
     * @param versionId
     *        The identifier for the policy version.</p>
     *        <p>
     *        Policy version identifiers always begin with <code>v</code> (always lowercase). When a policy is created,
     *        the first policy version is <code>v1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyVersion withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * <p>
     * Specifies whether the policy version is set as the policy's default version.
     * </p>
     * 
     * @param isDefaultVersion
     *        Specifies whether the policy version is set as the policy's default version.
     */

    public void setIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
    }

    /**
     * <p>
     * Specifies whether the policy version is set as the policy's default version.
     * </p>
     * 
     * @return Specifies whether the policy version is set as the policy's default version.
     */

    public Boolean getIsDefaultVersion() {
        return this.isDefaultVersion;
    }

    /**
     * <p>
     * Specifies whether the policy version is set as the policy's default version.
     * </p>
     * 
     * @param isDefaultVersion
     *        Specifies whether the policy version is set as the policy's default version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyVersion withIsDefaultVersion(Boolean isDefaultVersion) {
        setIsDefaultVersion(isDefaultVersion);
        return this;
    }

    /**
     * <p>
     * Specifies whether the policy version is set as the policy's default version.
     * </p>
     * 
     * @return Specifies whether the policy version is set as the policy's default version.
     */

    public Boolean isDefaultVersion() {
        return this.isDefaultVersion;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the policy
     * version was created.
     * </p>
     * 
     * @param createDate
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        policy version was created.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the policy
     * version was created.
     * </p>
     * 
     * @return The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *         policy version was created.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the policy
     * version was created.
     * </p>
     * 
     * @param createDate
     *        The date and time, in <a href="http://www.iso.org/iso/iso8601">ISO 8601 date-time format</a>, when the
     *        policy version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyVersion withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
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
        if (getDocument() != null)
            sb.append("Document: ").append(getDocument()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId()).append(",");
        if (getIsDefaultVersion() != null)
            sb.append("IsDefaultVersion: ").append(getIsDefaultVersion()).append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyVersion == false)
            return false;
        PolicyVersion other = (PolicyVersion) obj;
        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getIsDefaultVersion() == null ^ this.getIsDefaultVersion() == null)
            return false;
        if (other.getIsDefaultVersion() != null && other.getIsDefaultVersion().equals(this.getIsDefaultVersion()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode + ((getIsDefaultVersion() == null) ? 0 : getIsDefaultVersion().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        return hashCode;
    }

    @Override
    public PolicyVersion clone() {
        try {
            return (PolicyVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
