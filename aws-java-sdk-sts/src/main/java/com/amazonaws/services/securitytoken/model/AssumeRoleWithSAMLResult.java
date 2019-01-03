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
package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a successful <a>AssumeRoleWithSAML</a> request, including temporary AWS credentials that can
 * be used to make AWS requests.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sts-2011-06-15/AssumeRoleWithSAML" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssumeRoleWithSAMLResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The temporary security credentials, which include an access key ID, a secret access key, and a security (or
     * session) token.
     * </p>
     * <p>
     * <b>Note:</b> The size of the security token that STS APIs return is not fixed. We strongly recommend that you
     * make no assumptions about the maximum size. As of this writing, the typical size is less than 4096 bytes, but
     * that can vary. Also, future updates to AWS might require larger sizes.
     * </p>
     */
    private Credentials credentials;
    /**
     * <p>
     * The identifiers for the temporary security credentials that the operation returns.
     * </p>
     */
    private AssumedRoleUser assumedRoleUser;
    /**
     * <p>
     * A percentage value that indicates the size of the policy in packed form. The service rejects any policy with a
     * packed size greater than 100 percent, which means the policy exceeded the allowed space.
     * </p>
     */
    private Integer packedPolicySize;
    /**
     * <p>
     * The value of the <code>NameID</code> element in the <code>Subject</code> element of the SAML assertion.
     * </p>
     */
    private String subject;
    /**
     * <p>
     * The format of the name ID, as defined by the <code>Format</code> attribute in the <code>NameID</code> element of
     * the SAML assertion. Typical examples of the format are <code>transient</code> or <code>persistent</code>.
     * </p>
     * <p>
     * If the format includes the prefix <code>urn:oasis:names:tc:SAML:2.0:nameid-format</code>, that prefix is removed.
     * For example, <code>urn:oasis:names:tc:SAML:2.0:nameid-format:transient</code> is returned as
     * <code>transient</code>. If the format includes any other prefix, the format is returned with no modifications.
     * </p>
     */
    private String subjectType;
    /**
     * <p>
     * The value of the <code>Issuer</code> element of the SAML assertion.
     * </p>
     */
    private String issuer;
    /**
     * <p>
     * The value of the <code>Recipient</code> attribute of the <code>SubjectConfirmationData</code> element of the SAML
     * assertion.
     * </p>
     */
    private String audience;
    /**
     * <p>
     * A hash value based on the concatenation of the <code>Issuer</code> response value, the AWS account ID, and the
     * friendly name (the last part of the ARN) of the SAML provider in IAM. The combination of
     * <code>NameQualifier</code> and <code>Subject</code> can be used to uniquely identify a federated user.
     * </p>
     * <p>
     * The following pseudocode shows how the hash value is calculated:
     * </p>
     * <p>
     * <code>BASE64 ( SHA1 ( "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) )</code>
     * </p>
     */
    private String nameQualifier;

    /**
     * <p>
     * The temporary security credentials, which include an access key ID, a secret access key, and a security (or
     * session) token.
     * </p>
     * <p>
     * <b>Note:</b> The size of the security token that STS APIs return is not fixed. We strongly recommend that you
     * make no assumptions about the maximum size. As of this writing, the typical size is less than 4096 bytes, but
     * that can vary. Also, future updates to AWS might require larger sizes.
     * </p>
     * 
     * @param credentials
     *        The temporary security credentials, which include an access key ID, a secret access key, and a security
     *        (or session) token.</p>
     *        <p>
     *        <b>Note:</b> The size of the security token that STS APIs return is not fixed. We strongly recommend that
     *        you make no assumptions about the maximum size. As of this writing, the typical size is less than 4096
     *        bytes, but that can vary. Also, future updates to AWS might require larger sizes.
     */

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    /**
     * <p>
     * The temporary security credentials, which include an access key ID, a secret access key, and a security (or
     * session) token.
     * </p>
     * <p>
     * <b>Note:</b> The size of the security token that STS APIs return is not fixed. We strongly recommend that you
     * make no assumptions about the maximum size. As of this writing, the typical size is less than 4096 bytes, but
     * that can vary. Also, future updates to AWS might require larger sizes.
     * </p>
     * 
     * @return The temporary security credentials, which include an access key ID, a secret access key, and a security
     *         (or session) token.</p>
     *         <p>
     *         <b>Note:</b> The size of the security token that STS APIs return is not fixed. We strongly recommend that
     *         you make no assumptions about the maximum size. As of this writing, the typical size is less than 4096
     *         bytes, but that can vary. Also, future updates to AWS might require larger sizes.
     */

    public Credentials getCredentials() {
        return this.credentials;
    }

    /**
     * <p>
     * The temporary security credentials, which include an access key ID, a secret access key, and a security (or
     * session) token.
     * </p>
     * <p>
     * <b>Note:</b> The size of the security token that STS APIs return is not fixed. We strongly recommend that you
     * make no assumptions about the maximum size. As of this writing, the typical size is less than 4096 bytes, but
     * that can vary. Also, future updates to AWS might require larger sizes.
     * </p>
     * 
     * @param credentials
     *        The temporary security credentials, which include an access key ID, a secret access key, and a security
     *        (or session) token.</p>
     *        <p>
     *        <b>Note:</b> The size of the security token that STS APIs return is not fixed. We strongly recommend that
     *        you make no assumptions about the maximum size. As of this writing, the typical size is less than 4096
     *        bytes, but that can vary. Also, future updates to AWS might require larger sizes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleWithSAMLResult withCredentials(Credentials credentials) {
        setCredentials(credentials);
        return this;
    }

    /**
     * <p>
     * The identifiers for the temporary security credentials that the operation returns.
     * </p>
     * 
     * @param assumedRoleUser
     *        The identifiers for the temporary security credentials that the operation returns.
     */

    public void setAssumedRoleUser(AssumedRoleUser assumedRoleUser) {
        this.assumedRoleUser = assumedRoleUser;
    }

    /**
     * <p>
     * The identifiers for the temporary security credentials that the operation returns.
     * </p>
     * 
     * @return The identifiers for the temporary security credentials that the operation returns.
     */

    public AssumedRoleUser getAssumedRoleUser() {
        return this.assumedRoleUser;
    }

    /**
     * <p>
     * The identifiers for the temporary security credentials that the operation returns.
     * </p>
     * 
     * @param assumedRoleUser
     *        The identifiers for the temporary security credentials that the operation returns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleWithSAMLResult withAssumedRoleUser(AssumedRoleUser assumedRoleUser) {
        setAssumedRoleUser(assumedRoleUser);
        return this;
    }

    /**
     * <p>
     * A percentage value that indicates the size of the policy in packed form. The service rejects any policy with a
     * packed size greater than 100 percent, which means the policy exceeded the allowed space.
     * </p>
     * 
     * @param packedPolicySize
     *        A percentage value that indicates the size of the policy in packed form. The service rejects any policy
     *        with a packed size greater than 100 percent, which means the policy exceeded the allowed space.
     */

    public void setPackedPolicySize(Integer packedPolicySize) {
        this.packedPolicySize = packedPolicySize;
    }

    /**
     * <p>
     * A percentage value that indicates the size of the policy in packed form. The service rejects any policy with a
     * packed size greater than 100 percent, which means the policy exceeded the allowed space.
     * </p>
     * 
     * @return A percentage value that indicates the size of the policy in packed form. The service rejects any policy
     *         with a packed size greater than 100 percent, which means the policy exceeded the allowed space.
     */

    public Integer getPackedPolicySize() {
        return this.packedPolicySize;
    }

    /**
     * <p>
     * A percentage value that indicates the size of the policy in packed form. The service rejects any policy with a
     * packed size greater than 100 percent, which means the policy exceeded the allowed space.
     * </p>
     * 
     * @param packedPolicySize
     *        A percentage value that indicates the size of the policy in packed form. The service rejects any policy
     *        with a packed size greater than 100 percent, which means the policy exceeded the allowed space.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleWithSAMLResult withPackedPolicySize(Integer packedPolicySize) {
        setPackedPolicySize(packedPolicySize);
        return this;
    }

    /**
     * <p>
     * The value of the <code>NameID</code> element in the <code>Subject</code> element of the SAML assertion.
     * </p>
     * 
     * @param subject
     *        The value of the <code>NameID</code> element in the <code>Subject</code> element of the SAML assertion.
     */

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The value of the <code>NameID</code> element in the <code>Subject</code> element of the SAML assertion.
     * </p>
     * 
     * @return The value of the <code>NameID</code> element in the <code>Subject</code> element of the SAML assertion.
     */

    public String getSubject() {
        return this.subject;
    }

    /**
     * <p>
     * The value of the <code>NameID</code> element in the <code>Subject</code> element of the SAML assertion.
     * </p>
     * 
     * @param subject
     *        The value of the <code>NameID</code> element in the <code>Subject</code> element of the SAML assertion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleWithSAMLResult withSubject(String subject) {
        setSubject(subject);
        return this;
    }

    /**
     * <p>
     * The format of the name ID, as defined by the <code>Format</code> attribute in the <code>NameID</code> element of
     * the SAML assertion. Typical examples of the format are <code>transient</code> or <code>persistent</code>.
     * </p>
     * <p>
     * If the format includes the prefix <code>urn:oasis:names:tc:SAML:2.0:nameid-format</code>, that prefix is removed.
     * For example, <code>urn:oasis:names:tc:SAML:2.0:nameid-format:transient</code> is returned as
     * <code>transient</code>. If the format includes any other prefix, the format is returned with no modifications.
     * </p>
     * 
     * @param subjectType
     *        The format of the name ID, as defined by the <code>Format</code> attribute in the <code>NameID</code>
     *        element of the SAML assertion. Typical examples of the format are <code>transient</code> or
     *        <code>persistent</code>. </p>
     *        <p>
     *        If the format includes the prefix <code>urn:oasis:names:tc:SAML:2.0:nameid-format</code>, that prefix is
     *        removed. For example, <code>urn:oasis:names:tc:SAML:2.0:nameid-format:transient</code> is returned as
     *        <code>transient</code>. If the format includes any other prefix, the format is returned with no
     *        modifications.
     */

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    /**
     * <p>
     * The format of the name ID, as defined by the <code>Format</code> attribute in the <code>NameID</code> element of
     * the SAML assertion. Typical examples of the format are <code>transient</code> or <code>persistent</code>.
     * </p>
     * <p>
     * If the format includes the prefix <code>urn:oasis:names:tc:SAML:2.0:nameid-format</code>, that prefix is removed.
     * For example, <code>urn:oasis:names:tc:SAML:2.0:nameid-format:transient</code> is returned as
     * <code>transient</code>. If the format includes any other prefix, the format is returned with no modifications.
     * </p>
     * 
     * @return The format of the name ID, as defined by the <code>Format</code> attribute in the <code>NameID</code>
     *         element of the SAML assertion. Typical examples of the format are <code>transient</code> or
     *         <code>persistent</code>. </p>
     *         <p>
     *         If the format includes the prefix <code>urn:oasis:names:tc:SAML:2.0:nameid-format</code>, that prefix is
     *         removed. For example, <code>urn:oasis:names:tc:SAML:2.0:nameid-format:transient</code> is returned as
     *         <code>transient</code>. If the format includes any other prefix, the format is returned with no
     *         modifications.
     */

    public String getSubjectType() {
        return this.subjectType;
    }

    /**
     * <p>
     * The format of the name ID, as defined by the <code>Format</code> attribute in the <code>NameID</code> element of
     * the SAML assertion. Typical examples of the format are <code>transient</code> or <code>persistent</code>.
     * </p>
     * <p>
     * If the format includes the prefix <code>urn:oasis:names:tc:SAML:2.0:nameid-format</code>, that prefix is removed.
     * For example, <code>urn:oasis:names:tc:SAML:2.0:nameid-format:transient</code> is returned as
     * <code>transient</code>. If the format includes any other prefix, the format is returned with no modifications.
     * </p>
     * 
     * @param subjectType
     *        The format of the name ID, as defined by the <code>Format</code> attribute in the <code>NameID</code>
     *        element of the SAML assertion. Typical examples of the format are <code>transient</code> or
     *        <code>persistent</code>. </p>
     *        <p>
     *        If the format includes the prefix <code>urn:oasis:names:tc:SAML:2.0:nameid-format</code>, that prefix is
     *        removed. For example, <code>urn:oasis:names:tc:SAML:2.0:nameid-format:transient</code> is returned as
     *        <code>transient</code>. If the format includes any other prefix, the format is returned with no
     *        modifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleWithSAMLResult withSubjectType(String subjectType) {
        setSubjectType(subjectType);
        return this;
    }

    /**
     * <p>
     * The value of the <code>Issuer</code> element of the SAML assertion.
     * </p>
     * 
     * @param issuer
     *        The value of the <code>Issuer</code> element of the SAML assertion.
     */

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * <p>
     * The value of the <code>Issuer</code> element of the SAML assertion.
     * </p>
     * 
     * @return The value of the <code>Issuer</code> element of the SAML assertion.
     */

    public String getIssuer() {
        return this.issuer;
    }

    /**
     * <p>
     * The value of the <code>Issuer</code> element of the SAML assertion.
     * </p>
     * 
     * @param issuer
     *        The value of the <code>Issuer</code> element of the SAML assertion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleWithSAMLResult withIssuer(String issuer) {
        setIssuer(issuer);
        return this;
    }

    /**
     * <p>
     * The value of the <code>Recipient</code> attribute of the <code>SubjectConfirmationData</code> element of the SAML
     * assertion.
     * </p>
     * 
     * @param audience
     *        The value of the <code>Recipient</code> attribute of the <code>SubjectConfirmationData</code> element of
     *        the SAML assertion.
     */

    public void setAudience(String audience) {
        this.audience = audience;
    }

    /**
     * <p>
     * The value of the <code>Recipient</code> attribute of the <code>SubjectConfirmationData</code> element of the SAML
     * assertion.
     * </p>
     * 
     * @return The value of the <code>Recipient</code> attribute of the <code>SubjectConfirmationData</code> element of
     *         the SAML assertion.
     */

    public String getAudience() {
        return this.audience;
    }

    /**
     * <p>
     * The value of the <code>Recipient</code> attribute of the <code>SubjectConfirmationData</code> element of the SAML
     * assertion.
     * </p>
     * 
     * @param audience
     *        The value of the <code>Recipient</code> attribute of the <code>SubjectConfirmationData</code> element of
     *        the SAML assertion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleWithSAMLResult withAudience(String audience) {
        setAudience(audience);
        return this;
    }

    /**
     * <p>
     * A hash value based on the concatenation of the <code>Issuer</code> response value, the AWS account ID, and the
     * friendly name (the last part of the ARN) of the SAML provider in IAM. The combination of
     * <code>NameQualifier</code> and <code>Subject</code> can be used to uniquely identify a federated user.
     * </p>
     * <p>
     * The following pseudocode shows how the hash value is calculated:
     * </p>
     * <p>
     * <code>BASE64 ( SHA1 ( "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) )</code>
     * </p>
     * 
     * @param nameQualifier
     *        A hash value based on the concatenation of the <code>Issuer</code> response value, the AWS account ID, and
     *        the friendly name (the last part of the ARN) of the SAML provider in IAM. The combination of
     *        <code>NameQualifier</code> and <code>Subject</code> can be used to uniquely identify a federated user.
     *        </p>
     *        <p>
     *        The following pseudocode shows how the hash value is calculated:
     *        </p>
     *        <p>
     *        <code>BASE64 ( SHA1 ( "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) )</code>
     */

    public void setNameQualifier(String nameQualifier) {
        this.nameQualifier = nameQualifier;
    }

    /**
     * <p>
     * A hash value based on the concatenation of the <code>Issuer</code> response value, the AWS account ID, and the
     * friendly name (the last part of the ARN) of the SAML provider in IAM. The combination of
     * <code>NameQualifier</code> and <code>Subject</code> can be used to uniquely identify a federated user.
     * </p>
     * <p>
     * The following pseudocode shows how the hash value is calculated:
     * </p>
     * <p>
     * <code>BASE64 ( SHA1 ( "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) )</code>
     * </p>
     * 
     * @return A hash value based on the concatenation of the <code>Issuer</code> response value, the AWS account ID,
     *         and the friendly name (the last part of the ARN) of the SAML provider in IAM. The combination of
     *         <code>NameQualifier</code> and <code>Subject</code> can be used to uniquely identify a federated user.
     *         </p>
     *         <p>
     *         The following pseudocode shows how the hash value is calculated:
     *         </p>
     *         <p>
     *         <code>BASE64 ( SHA1 ( "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) )</code>
     */

    public String getNameQualifier() {
        return this.nameQualifier;
    }

    /**
     * <p>
     * A hash value based on the concatenation of the <code>Issuer</code> response value, the AWS account ID, and the
     * friendly name (the last part of the ARN) of the SAML provider in IAM. The combination of
     * <code>NameQualifier</code> and <code>Subject</code> can be used to uniquely identify a federated user.
     * </p>
     * <p>
     * The following pseudocode shows how the hash value is calculated:
     * </p>
     * <p>
     * <code>BASE64 ( SHA1 ( "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) )</code>
     * </p>
     * 
     * @param nameQualifier
     *        A hash value based on the concatenation of the <code>Issuer</code> response value, the AWS account ID, and
     *        the friendly name (the last part of the ARN) of the SAML provider in IAM. The combination of
     *        <code>NameQualifier</code> and <code>Subject</code> can be used to uniquely identify a federated user.
     *        </p>
     *        <p>
     *        The following pseudocode shows how the hash value is calculated:
     *        </p>
     *        <p>
     *        <code>BASE64 ( SHA1 ( "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) )</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumeRoleWithSAMLResult withNameQualifier(String nameQualifier) {
        setNameQualifier(nameQualifier);
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
        if (getCredentials() != null)
            sb.append("Credentials: ").append(getCredentials()).append(",");
        if (getAssumedRoleUser() != null)
            sb.append("AssumedRoleUser: ").append(getAssumedRoleUser()).append(",");
        if (getPackedPolicySize() != null)
            sb.append("PackedPolicySize: ").append(getPackedPolicySize()).append(",");
        if (getSubject() != null)
            sb.append("Subject: ").append(getSubject()).append(",");
        if (getSubjectType() != null)
            sb.append("SubjectType: ").append(getSubjectType()).append(",");
        if (getIssuer() != null)
            sb.append("Issuer: ").append(getIssuer()).append(",");
        if (getAudience() != null)
            sb.append("Audience: ").append(getAudience()).append(",");
        if (getNameQualifier() != null)
            sb.append("NameQualifier: ").append(getNameQualifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssumeRoleWithSAMLResult == false)
            return false;
        AssumeRoleWithSAMLResult other = (AssumeRoleWithSAMLResult) obj;
        if (other.getCredentials() == null ^ this.getCredentials() == null)
            return false;
        if (other.getCredentials() != null && other.getCredentials().equals(this.getCredentials()) == false)
            return false;
        if (other.getAssumedRoleUser() == null ^ this.getAssumedRoleUser() == null)
            return false;
        if (other.getAssumedRoleUser() != null && other.getAssumedRoleUser().equals(this.getAssumedRoleUser()) == false)
            return false;
        if (other.getPackedPolicySize() == null ^ this.getPackedPolicySize() == null)
            return false;
        if (other.getPackedPolicySize() != null && other.getPackedPolicySize().equals(this.getPackedPolicySize()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getSubjectType() == null ^ this.getSubjectType() == null)
            return false;
        if (other.getSubjectType() != null && other.getSubjectType().equals(this.getSubjectType()) == false)
            return false;
        if (other.getIssuer() == null ^ this.getIssuer() == null)
            return false;
        if (other.getIssuer() != null && other.getIssuer().equals(this.getIssuer()) == false)
            return false;
        if (other.getAudience() == null ^ this.getAudience() == null)
            return false;
        if (other.getAudience() != null && other.getAudience().equals(this.getAudience()) == false)
            return false;
        if (other.getNameQualifier() == null ^ this.getNameQualifier() == null)
            return false;
        if (other.getNameQualifier() != null && other.getNameQualifier().equals(this.getNameQualifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        hashCode = prime * hashCode + ((getAssumedRoleUser() == null) ? 0 : getAssumedRoleUser().hashCode());
        hashCode = prime * hashCode + ((getPackedPolicySize() == null) ? 0 : getPackedPolicySize().hashCode());
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getSubjectType() == null) ? 0 : getSubjectType().hashCode());
        hashCode = prime * hashCode + ((getIssuer() == null) ? 0 : getIssuer().hashCode());
        hashCode = prime * hashCode + ((getAudience() == null) ? 0 : getAudience().hashCode());
        hashCode = prime * hashCode + ((getNameQualifier() == null) ? 0 : getNameQualifier().hashCode());
        return hashCode;
    }

    @Override
    public AssumeRoleWithSAMLResult clone() {
        try {
            return (AssumeRoleWithSAMLResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
