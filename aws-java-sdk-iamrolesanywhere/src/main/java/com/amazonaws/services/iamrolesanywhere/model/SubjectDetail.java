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
 * The state of the subject after a read or write operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/SubjectDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubjectDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ISO-8601 timestamp when the subject was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The temporary session credentials vended at the last authenticating call with this Subject.
     * </p>
     */
    private java.util.List<CredentialSummary> credentials;
    /**
     * <p>
     * The enabled status of the subject.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The specified instance properties associated with the request.
     * </p>
     */
    private java.util.List<InstanceProperty> instanceProperties;
    /**
     * <p>
     * The ISO-8601 timestamp of the last time this Subject requested temporary session credentials.
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
     * The id of the resource
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
     * The ISO-8601 timestamp when the subject was created.
     * </p>
     * 
     * @param createdAt
     *        The ISO-8601 timestamp when the subject was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The ISO-8601 timestamp when the subject was created.
     * </p>
     * 
     * @return The ISO-8601 timestamp when the subject was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The ISO-8601 timestamp when the subject was created.
     * </p>
     * 
     * @param createdAt
     *        The ISO-8601 timestamp when the subject was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectDetail withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The temporary session credentials vended at the last authenticating call with this Subject.
     * </p>
     * 
     * @return The temporary session credentials vended at the last authenticating call with this Subject.
     */

    public java.util.List<CredentialSummary> getCredentials() {
        return credentials;
    }

    /**
     * <p>
     * The temporary session credentials vended at the last authenticating call with this Subject.
     * </p>
     * 
     * @param credentials
     *        The temporary session credentials vended at the last authenticating call with this Subject.
     */

    public void setCredentials(java.util.Collection<CredentialSummary> credentials) {
        if (credentials == null) {
            this.credentials = null;
            return;
        }

        this.credentials = new java.util.ArrayList<CredentialSummary>(credentials);
    }

    /**
     * <p>
     * The temporary session credentials vended at the last authenticating call with this Subject.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCredentials(java.util.Collection)} or {@link #withCredentials(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param credentials
     *        The temporary session credentials vended at the last authenticating call with this Subject.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectDetail withCredentials(CredentialSummary... credentials) {
        if (this.credentials == null) {
            setCredentials(new java.util.ArrayList<CredentialSummary>(credentials.length));
        }
        for (CredentialSummary ele : credentials) {
            this.credentials.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The temporary session credentials vended at the last authenticating call with this Subject.
     * </p>
     * 
     * @param credentials
     *        The temporary session credentials vended at the last authenticating call with this Subject.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectDetail withCredentials(java.util.Collection<CredentialSummary> credentials) {
        setCredentials(credentials);
        return this;
    }

    /**
     * <p>
     * The enabled status of the subject.
     * </p>
     * 
     * @param enabled
     *        The enabled status of the subject.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * The enabled status of the subject.
     * </p>
     * 
     * @return The enabled status of the subject.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The enabled status of the subject.
     * </p>
     * 
     * @param enabled
     *        The enabled status of the subject.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectDetail withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * The enabled status of the subject.
     * </p>
     * 
     * @return The enabled status of the subject.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The specified instance properties associated with the request.
     * </p>
     * 
     * @return The specified instance properties associated with the request.
     */

    public java.util.List<InstanceProperty> getInstanceProperties() {
        return instanceProperties;
    }

    /**
     * <p>
     * The specified instance properties associated with the request.
     * </p>
     * 
     * @param instanceProperties
     *        The specified instance properties associated with the request.
     */

    public void setInstanceProperties(java.util.Collection<InstanceProperty> instanceProperties) {
        if (instanceProperties == null) {
            this.instanceProperties = null;
            return;
        }

        this.instanceProperties = new java.util.ArrayList<InstanceProperty>(instanceProperties);
    }

    /**
     * <p>
     * The specified instance properties associated with the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceProperties(java.util.Collection)} or {@link #withInstanceProperties(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param instanceProperties
     *        The specified instance properties associated with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectDetail withInstanceProperties(InstanceProperty... instanceProperties) {
        if (this.instanceProperties == null) {
            setInstanceProperties(new java.util.ArrayList<InstanceProperty>(instanceProperties.length));
        }
        for (InstanceProperty ele : instanceProperties) {
            this.instanceProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The specified instance properties associated with the request.
     * </p>
     * 
     * @param instanceProperties
     *        The specified instance properties associated with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectDetail withInstanceProperties(java.util.Collection<InstanceProperty> instanceProperties) {
        setInstanceProperties(instanceProperties);
        return this;
    }

    /**
     * <p>
     * The ISO-8601 timestamp of the last time this Subject requested temporary session credentials.
     * </p>
     * 
     * @param lastSeenAt
     *        The ISO-8601 timestamp of the last time this Subject requested temporary session credentials.
     */

    public void setLastSeenAt(java.util.Date lastSeenAt) {
        this.lastSeenAt = lastSeenAt;
    }

    /**
     * <p>
     * The ISO-8601 timestamp of the last time this Subject requested temporary session credentials.
     * </p>
     * 
     * @return The ISO-8601 timestamp of the last time this Subject requested temporary session credentials.
     */

    public java.util.Date getLastSeenAt() {
        return this.lastSeenAt;
    }

    /**
     * <p>
     * The ISO-8601 timestamp of the last time this Subject requested temporary session credentials.
     * </p>
     * 
     * @param lastSeenAt
     *        The ISO-8601 timestamp of the last time this Subject requested temporary session credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectDetail withLastSeenAt(java.util.Date lastSeenAt) {
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

    public SubjectDetail withSubjectArn(String subjectArn) {
        setSubjectArn(subjectArn);
        return this;
    }

    /**
     * <p>
     * The id of the resource
     * </p>
     * 
     * @param subjectId
     *        The id of the resource
     */

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * <p>
     * The id of the resource
     * </p>
     * 
     * @return The id of the resource
     */

    public String getSubjectId() {
        return this.subjectId;
    }

    /**
     * <p>
     * The id of the resource
     * </p>
     * 
     * @param subjectId
     *        The id of the resource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectDetail withSubjectId(String subjectId) {
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

    public SubjectDetail withUpdatedAt(java.util.Date updatedAt) {
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

    public SubjectDetail withX509Subject(String x509Subject) {
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
        if (getCredentials() != null)
            sb.append("Credentials: ").append(getCredentials()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getInstanceProperties() != null)
            sb.append("InstanceProperties: ").append(getInstanceProperties()).append(",");
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

        if (obj instanceof SubjectDetail == false)
            return false;
        SubjectDetail other = (SubjectDetail) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCredentials() == null ^ this.getCredentials() == null)
            return false;
        if (other.getCredentials() != null && other.getCredentials().equals(this.getCredentials()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getInstanceProperties() == null ^ this.getInstanceProperties() == null)
            return false;
        if (other.getInstanceProperties() != null && other.getInstanceProperties().equals(this.getInstanceProperties()) == false)
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
        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getInstanceProperties() == null) ? 0 : getInstanceProperties().hashCode());
        hashCode = prime * hashCode + ((getLastSeenAt() == null) ? 0 : getLastSeenAt().hashCode());
        hashCode = prime * hashCode + ((getSubjectArn() == null) ? 0 : getSubjectArn().hashCode());
        hashCode = prime * hashCode + ((getSubjectId() == null) ? 0 : getSubjectId().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getX509Subject() == null) ? 0 : getX509Subject().hashCode());
        return hashCode;
    }

    @Override
    public SubjectDetail clone() {
        try {
            return (SubjectDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iamrolesanywhere.model.transform.SubjectDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
