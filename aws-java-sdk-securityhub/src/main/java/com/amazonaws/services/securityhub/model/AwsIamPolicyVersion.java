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
 * A version of an IAM policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsIamPolicyVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsIamPolicyVersion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the policy version.
     * </p>
     */
    private String versionId;
    /**
     * <p>
     * Whether the version is the default version.
     * </p>
     */
    private Boolean isDefaultVersion;
    /**
     * <p>
     * Indicates when the version was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String createDate;

    /**
     * <p>
     * The identifier of the policy version.
     * </p>
     * 
     * @param versionId
     *        The identifier of the policy version.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The identifier of the policy version.
     * </p>
     * 
     * @return The identifier of the policy version.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The identifier of the policy version.
     * </p>
     * 
     * @param versionId
     *        The identifier of the policy version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamPolicyVersion withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * <p>
     * Whether the version is the default version.
     * </p>
     * 
     * @param isDefaultVersion
     *        Whether the version is the default version.
     */

    public void setIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
    }

    /**
     * <p>
     * Whether the version is the default version.
     * </p>
     * 
     * @return Whether the version is the default version.
     */

    public Boolean getIsDefaultVersion() {
        return this.isDefaultVersion;
    }

    /**
     * <p>
     * Whether the version is the default version.
     * </p>
     * 
     * @param isDefaultVersion
     *        Whether the version is the default version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamPolicyVersion withIsDefaultVersion(Boolean isDefaultVersion) {
        setIsDefaultVersion(isDefaultVersion);
        return this;
    }

    /**
     * <p>
     * Whether the version is the default version.
     * </p>
     * 
     * @return Whether the version is the default version.
     */

    public Boolean isDefaultVersion() {
        return this.isDefaultVersion;
    }

    /**
     * <p>
     * Indicates when the version was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createDate
     *        Indicates when the version was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * Indicates when the version was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the version was created.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * Indicates when the version was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createDate
     *        Indicates when the version was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamPolicyVersion withCreateDate(String createDate) {
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

        if (obj instanceof AwsIamPolicyVersion == false)
            return false;
        AwsIamPolicyVersion other = (AwsIamPolicyVersion) obj;
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

        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode + ((getIsDefaultVersion() == null) ? 0 : getIsDefaultVersion().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        return hashCode;
    }

    @Override
    public AwsIamPolicyVersion clone() {
        try {
            return (AwsIamPolicyVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsIamPolicyVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
