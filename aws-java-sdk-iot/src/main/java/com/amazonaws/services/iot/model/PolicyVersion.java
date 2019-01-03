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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a policy version.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyVersion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The policy version ID.
     * </p>
     */
    private String versionId;
    /**
     * <p>
     * Specifies whether the policy version is the default.
     * </p>
     */
    private Boolean isDefaultVersion;
    /**
     * <p>
     * The date and time the policy was created.
     * </p>
     */
    private java.util.Date createDate;

    /**
     * <p>
     * The policy version ID.
     * </p>
     * 
     * @param versionId
     *        The policy version ID.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The policy version ID.
     * </p>
     * 
     * @return The policy version ID.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The policy version ID.
     * </p>
     * 
     * @param versionId
     *        The policy version ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyVersion withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * <p>
     * Specifies whether the policy version is the default.
     * </p>
     * 
     * @param isDefaultVersion
     *        Specifies whether the policy version is the default.
     */

    public void setIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
    }

    /**
     * <p>
     * Specifies whether the policy version is the default.
     * </p>
     * 
     * @return Specifies whether the policy version is the default.
     */

    public Boolean getIsDefaultVersion() {
        return this.isDefaultVersion;
    }

    /**
     * <p>
     * Specifies whether the policy version is the default.
     * </p>
     * 
     * @param isDefaultVersion
     *        Specifies whether the policy version is the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyVersion withIsDefaultVersion(Boolean isDefaultVersion) {
        setIsDefaultVersion(isDefaultVersion);
        return this;
    }

    /**
     * <p>
     * Specifies whether the policy version is the default.
     * </p>
     * 
     * @return Specifies whether the policy version is the default.
     */

    public Boolean isDefaultVersion() {
        return this.isDefaultVersion;
    }

    /**
     * <p>
     * The date and time the policy was created.
     * </p>
     * 
     * @param createDate
     *        The date and time the policy was created.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time the policy was created.
     * </p>
     * 
     * @return The date and time the policy was created.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The date and time the policy was created.
     * </p>
     * 
     * @param createDate
     *        The date and time the policy was created.
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
    public PolicyVersion clone() {
        try {
            return (PolicyVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.PolicyVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
