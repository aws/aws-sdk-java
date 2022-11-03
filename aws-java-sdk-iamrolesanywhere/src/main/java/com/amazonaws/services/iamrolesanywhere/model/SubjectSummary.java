/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iamrolesanywhere.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary representation of Subject resources returned in read operations; primarily ListSubjects.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/SubjectSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubjectSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ISO-8601 time stamp of when the certificate was first used in a <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The enabled status of the Subject.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The ISO-8601 time stamp of when the certificate was last used in a <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation.
     * </p>
     */
    private java.util.Date lastSeenAt;
    /**
     * <p>
     * The ARN of the resource.
     * </p>
     */
    private String subjectArn;
    /**
     * <p>
     * The id of the resource.
     * </p>
     */
    private String subjectId;
    /**
     * <p>
     * The ISO-8601 timestamp when the subject was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The x509 principal identifier of the authenticating certificate.
     * </p>
     */
    private String x509Subject;

    /**
     * <p>
     * The ISO-8601 time stamp of when the certificate was first used in a <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation.
     * </p>
     * 
     * @param createdAt
     *        The ISO-8601 time stamp of when the certificate was first used in a <a
     *        href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *        >CreateSession</a> operation.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The ISO-8601 time stamp of when the certificate was first used in a <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation.
     * </p>
     * 
     * @return The ISO-8601 time stamp of when the certificate was first used in a <a
     *         href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *         >CreateSession</a> operation.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The ISO-8601 time stamp of when the certificate was first used in a <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation.
     * </p>
     * 
     * @param createdAt
     *        The ISO-8601 time stamp of when the certificate was first used in a <a
     *        href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *        >CreateSession</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The enabled status of the Subject.
     * </p>
     * 
     * @param enabled
     *        The enabled status of the Subject.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * The enabled status of the Subject.
     * </p>
     * 
     * @return The enabled status of the Subject.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The enabled status of the Subject.
     * </p>
     * 
     * @param enabled
     *        The enabled status of the Subject.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectSummary withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * The enabled status of the Subject.
     * </p>
     * 
     * @return The enabled status of the Subject.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The ISO-8601 time stamp of when the certificate was last used in a <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation.
     * </p>
     * 
     * @param lastSeenAt
     *        The ISO-8601 time stamp of when the certificate was last used in a <a
     *        href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *        >CreateSession</a> operation.
     */

    public void setLastSeenAt(java.util.Date lastSeenAt) {
        this.lastSeenAt = lastSeenAt;
    }

    /**
     * <p>
     * The ISO-8601 time stamp of when the certificate was last used in a <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation.
     * </p>
     * 
     * @return The ISO-8601 time stamp of when the certificate was last used in a <a
     *         href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *         >CreateSession</a> operation.
     */

    public java.util.Date getLastSeenAt() {
        return this.lastSeenAt;
    }

    /**
     * <p>
     * The ISO-8601 time stamp of when the certificate was last used in a <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operation.
     * </p>
     * 
     * @param lastSeenAt
     *        The ISO-8601 time stamp of when the certificate was last used in a <a
     *        href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *        >CreateSession</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectSummary withLastSeenAt(java.util.Date lastSeenAt) {
        setLastSeenAt(lastSeenAt);
        return this;
    }

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @param subjectArn
     *        The ARN of the resource.
     */

    public void setSubjectArn(String subjectArn) {
        this.subjectArn = subjectArn;
    }

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @return The ARN of the resource.
     */

    public String getSubjectArn() {
        return this.subjectArn;
    }

    /**
     * <p>
     * The ARN of the resource.
     * </p>
     * 
     * @param subjectArn
     *        The ARN of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectSummary withSubjectArn(String subjectArn) {
        setSubjectArn(subjectArn);
        return this;
    }

    /**
     * <p>
     * The id of the resource.
     * </p>
     * 
     * @param subjectId
     *        The id of the resource.
     */

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * <p>
     * The id of the resource.
     * </p>
     * 
     * @return The id of the resource.
     */

    public String getSubjectId() {
        return this.subjectId;
    }

    /**
     * <p>
     * The id of the resource.
     * </p>
     * 
     * @param subjectId
     *        The id of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectSummary withSubjectId(String subjectId) {
        setSubjectId(subjectId);
        return this;
    }

    /**
     * <p>
     * The ISO-8601 timestamp when the subject was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The ISO-8601 timestamp when the subject was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The ISO-8601 timestamp when the subject was last updated.
     * </p>
     * 
     * @return The ISO-8601 timestamp when the subject was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The ISO-8601 timestamp when the subject was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The ISO-8601 timestamp when the subject was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The x509 principal identifier of the authenticating certificate.
     * </p>
     * 
     * @param x509Subject
     *        The x509 principal identifier of the authenticating certificate.
     */

    public void setX509Subject(String x509Subject) {
        this.x509Subject = x509Subject;
    }

    /**
     * <p>
     * The x509 principal identifier of the authenticating certificate.
     * </p>
     * 
     * @return The x509 principal identifier of the authenticating certificate.
     */

    public String getX509Subject() {
        return this.x509Subject;
    }

    /**
     * <p>
     * The x509 principal identifier of the authenticating certificate.
     * </p>
     * 
     * @param x509Subject
     *        The x509 principal identifier of the authenticating certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectSummary withX509Subject(String x509Subject) {
        setX509Subject(x509Subject);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getLastSeenAt() != null)
            sb.append("LastSeenAt: ").append(getLastSeenAt()).append(",");
        if (getSubjectArn() != null)
            sb.append("SubjectArn: ").append(getSubjectArn()).append(",");
        if (getSubjectId() != null)
            sb.append("SubjectId: ").append(getSubjectId()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getX509Subject() != null)
            sb.append("X509Subject: ").append(getX509Subject());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubjectSummary == false)
            return false;
        SubjectSummary other = (SubjectSummary) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getLastSeenAt() == null ^ this.getLastSeenAt() == null)
            return false;
        if (other.getLastSeenAt() != null && other.getLastSeenAt().equals(this.getLastSeenAt()) == false)
            return false;
        if (other.getSubjectArn() == null ^ this.getSubjectArn() == null)
            return false;
        if (other.getSubjectArn() != null && other.getSubjectArn().equals(this.getSubjectArn()) == false)
            return false;
        if (other.getSubjectId() == null ^ this.getSubjectId() == null)
            return false;
        if (other.getSubjectId() != null && other.getSubjectId().equals(this.getSubjectId()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getX509Subject() == null ^ this.getX509Subject() == null)
            return false;
        if (other.getX509Subject() != null && other.getX509Subject().equals(this.getX509Subject()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getLastSeenAt() == null) ? 0 : getLastSeenAt().hashCode());
        hashCode = prime * hashCode + ((getSubjectArn() == null) ? 0 : getSubjectArn().hashCode());
        hashCode = prime * hashCode + ((getSubjectId() == null) ? 0 : getSubjectId().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getX509Subject() == null) ? 0 : getX509Subject().hashCode());
        return hashCode;
    }

    @Override
    public SubjectSummary clone() {
        try {
            return (SubjectSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iamrolesanywhere.model.transform.SubjectSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
