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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * IAM access key details related to a finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsIamAccessKeyDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsIamAccessKeyDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user associated with the IAM access key related to a finding.
     * </p>
     * <p>
     * The <code>UserName</code> parameter has been replaced with the <code>PrincipalName</code> parameter because
     * access keys can also be assigned to principals that are not IAM users.
     * </p>
     */
    @Deprecated
    private String userName;
    /**
     * <p>
     * The status of the IAM access key related to a finding.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Indicates when the IAM access key was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String createdAt;
    /**
     * <p>
     * The ID of the principal associated with an access key.
     * </p>
     */
    private String principalId;
    /**
     * <p>
     * The type of principal associated with an access key.
     * </p>
     */
    private String principalType;
    /**
     * <p>
     * The name of the principal.
     * </p>
     */
    private String principalName;
    /**
     * <p>
     * The AWS account ID of the account for the key.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The identifier of the access key.
     * </p>
     */
    private String accessKeyId;
    /**
     * <p>
     * Information about the session that the key was used for.
     * </p>
     */
    private AwsIamAccessKeySessionContext sessionContext;

    /**
     * <p>
     * The user associated with the IAM access key related to a finding.
     * </p>
     * <p>
     * The <code>UserName</code> parameter has been replaced with the <code>PrincipalName</code> parameter because
     * access keys can also be assigned to principals that are not IAM users.
     * </p>
     * 
     * @param userName
     *        The user associated with the IAM access key related to a finding.</p>
     *        <p>
     *        The <code>UserName</code> parameter has been replaced with the <code>PrincipalName</code> parameter
     *        because access keys can also be assigned to principals that are not IAM users.
     */
    @Deprecated
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The user associated with the IAM access key related to a finding.
     * </p>
     * <p>
     * The <code>UserName</code> parameter has been replaced with the <code>PrincipalName</code> parameter because
     * access keys can also be assigned to principals that are not IAM users.
     * </p>
     * 
     * @return The user associated with the IAM access key related to a finding.</p>
     *         <p>
     *         The <code>UserName</code> parameter has been replaced with the <code>PrincipalName</code> parameter
     *         because access keys can also be assigned to principals that are not IAM users.
     */
    @Deprecated
    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The user associated with the IAM access key related to a finding.
     * </p>
     * <p>
     * The <code>UserName</code> parameter has been replaced with the <code>PrincipalName</code> parameter because
     * access keys can also be assigned to principals that are not IAM users.
     * </p>
     * 
     * @param userName
     *        The user associated with the IAM access key related to a finding.</p>
     *        <p>
     *        The <code>UserName</code> parameter has been replaced with the <code>PrincipalName</code> parameter
     *        because access keys can also be assigned to principals that are not IAM users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public AwsIamAccessKeyDetails withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The status of the IAM access key related to a finding.
     * </p>
     * 
     * @param status
     *        The status of the IAM access key related to a finding.
     * @see AwsIamAccessKeyStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the IAM access key related to a finding.
     * </p>
     * 
     * @return The status of the IAM access key related to a finding.
     * @see AwsIamAccessKeyStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the IAM access key related to a finding.
     * </p>
     * 
     * @param status
     *        The status of the IAM access key related to a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AwsIamAccessKeyStatus
     */

    public AwsIamAccessKeyDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the IAM access key related to a finding.
     * </p>
     * 
     * @param status
     *        The status of the IAM access key related to a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AwsIamAccessKeyStatus
     */

    public AwsIamAccessKeyDetails withStatus(AwsIamAccessKeyStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Indicates when the IAM access key was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createdAt
     *        Indicates when the IAM access key was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Indicates when the IAM access key was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the IAM access key was created.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Indicates when the IAM access key was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createdAt
     *        Indicates when the IAM access key was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamAccessKeyDetails withCreatedAt(String createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The ID of the principal associated with an access key.
     * </p>
     * 
     * @param principalId
     *        The ID of the principal associated with an access key.
     */

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * The ID of the principal associated with an access key.
     * </p>
     * 
     * @return The ID of the principal associated with an access key.
     */

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * <p>
     * The ID of the principal associated with an access key.
     * </p>
     * 
     * @param principalId
     *        The ID of the principal associated with an access key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamAccessKeyDetails withPrincipalId(String principalId) {
        setPrincipalId(principalId);
        return this;
    }

    /**
     * <p>
     * The type of principal associated with an access key.
     * </p>
     * 
     * @param principalType
     *        The type of principal associated with an access key.
     */

    public void setPrincipalType(String principalType) {
        this.principalType = principalType;
    }

    /**
     * <p>
     * The type of principal associated with an access key.
     * </p>
     * 
     * @return The type of principal associated with an access key.
     */

    public String getPrincipalType() {
        return this.principalType;
    }

    /**
     * <p>
     * The type of principal associated with an access key.
     * </p>
     * 
     * @param principalType
     *        The type of principal associated with an access key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamAccessKeyDetails withPrincipalType(String principalType) {
        setPrincipalType(principalType);
        return this;
    }

    /**
     * <p>
     * The name of the principal.
     * </p>
     * 
     * @param principalName
     *        The name of the principal.
     */

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    /**
     * <p>
     * The name of the principal.
     * </p>
     * 
     * @return The name of the principal.
     */

    public String getPrincipalName() {
        return this.principalName;
    }

    /**
     * <p>
     * The name of the principal.
     * </p>
     * 
     * @param principalName
     *        The name of the principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamAccessKeyDetails withPrincipalName(String principalName) {
        setPrincipalName(principalName);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the account for the key.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID of the account for the key.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The AWS account ID of the account for the key.
     * </p>
     * 
     * @return The AWS account ID of the account for the key.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The AWS account ID of the account for the key.
     * </p>
     * 
     * @param accountId
     *        The AWS account ID of the account for the key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamAccessKeyDetails withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The identifier of the access key.
     * </p>
     * 
     * @param accessKeyId
     *        The identifier of the access key.
     */

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * <p>
     * The identifier of the access key.
     * </p>
     * 
     * @return The identifier of the access key.
     */

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * <p>
     * The identifier of the access key.
     * </p>
     * 
     * @param accessKeyId
     *        The identifier of the access key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamAccessKeyDetails withAccessKeyId(String accessKeyId) {
        setAccessKeyId(accessKeyId);
        return this;
    }

    /**
     * <p>
     * Information about the session that the key was used for.
     * </p>
     * 
     * @param sessionContext
     *        Information about the session that the key was used for.
     */

    public void setSessionContext(AwsIamAccessKeySessionContext sessionContext) {
        this.sessionContext = sessionContext;
    }

    /**
     * <p>
     * Information about the session that the key was used for.
     * </p>
     * 
     * @return Information about the session that the key was used for.
     */

    public AwsIamAccessKeySessionContext getSessionContext() {
        return this.sessionContext;
    }

    /**
     * <p>
     * Information about the session that the key was used for.
     * </p>
     * 
     * @param sessionContext
     *        Information about the session that the key was used for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamAccessKeyDetails withSessionContext(AwsIamAccessKeySessionContext sessionContext) {
        setSessionContext(sessionContext);
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
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getPrincipalId() != null)
            sb.append("PrincipalId: ").append(getPrincipalId()).append(",");
        if (getPrincipalType() != null)
            sb.append("PrincipalType: ").append(getPrincipalType()).append(",");
        if (getPrincipalName() != null)
            sb.append("PrincipalName: ").append(getPrincipalName()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getAccessKeyId() != null)
            sb.append("AccessKeyId: ").append(getAccessKeyId()).append(",");
        if (getSessionContext() != null)
            sb.append("SessionContext: ").append(getSessionContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsIamAccessKeyDetails == false)
            return false;
        AwsIamAccessKeyDetails other = (AwsIamAccessKeyDetails) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getPrincipalId() == null ^ this.getPrincipalId() == null)
            return false;
        if (other.getPrincipalId() != null && other.getPrincipalId().equals(this.getPrincipalId()) == false)
            return false;
        if (other.getPrincipalType() == null ^ this.getPrincipalType() == null)
            return false;
        if (other.getPrincipalType() != null && other.getPrincipalType().equals(this.getPrincipalType()) == false)
            return false;
        if (other.getPrincipalName() == null ^ this.getPrincipalName() == null)
            return false;
        if (other.getPrincipalName() != null && other.getPrincipalName().equals(this.getPrincipalName()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getAccessKeyId() == null ^ this.getAccessKeyId() == null)
            return false;
        if (other.getAccessKeyId() != null && other.getAccessKeyId().equals(this.getAccessKeyId()) == false)
            return false;
        if (other.getSessionContext() == null ^ this.getSessionContext() == null)
            return false;
        if (other.getSessionContext() != null && other.getSessionContext().equals(this.getSessionContext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        hashCode = prime * hashCode + ((getPrincipalType() == null) ? 0 : getPrincipalType().hashCode());
        hashCode = prime * hashCode + ((getPrincipalName() == null) ? 0 : getPrincipalName().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getAccessKeyId() == null) ? 0 : getAccessKeyId().hashCode());
        hashCode = prime * hashCode + ((getSessionContext() == null) ? 0 : getSessionContext().hashCode());
        return hashCode;
    }

    @Override
    public AwsIamAccessKeyDetails clone() {
        try {
            return (AwsIamAccessKeyDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsIamAccessKeyDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
