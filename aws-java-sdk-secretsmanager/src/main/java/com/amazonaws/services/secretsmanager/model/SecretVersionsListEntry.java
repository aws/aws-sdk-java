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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains information about one version of a secret.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/SecretVersionsListEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecretVersionsListEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique version identifier of this version of the secret.
     * </p>
     */
    private String versionId;
    /**
     * <p>
     * An array of staging labels that are currently associated with this version of the secret.
     * </p>
     */
    private java.util.List<String> versionStages;
    /**
     * <p>
     * The date that this version of the secret was last accessed. Note that the resolution of this field is at the date
     * level and does not include the time.
     * </p>
     */
    private java.util.Date lastAccessedDate;
    /**
     * <p>
     * The date and time this version of the secret was created.
     * </p>
     */
    private java.util.Date createdDate;

    /**
     * <p>
     * The unique version identifier of this version of the secret.
     * </p>
     * 
     * @param versionId
     *        The unique version identifier of this version of the secret.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The unique version identifier of this version of the secret.
     * </p>
     * 
     * @return The unique version identifier of this version of the secret.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The unique version identifier of this version of the secret.
     * </p>
     * 
     * @param versionId
     *        The unique version identifier of this version of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretVersionsListEntry withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * <p>
     * An array of staging labels that are currently associated with this version of the secret.
     * </p>
     * 
     * @return An array of staging labels that are currently associated with this version of the secret.
     */

    public java.util.List<String> getVersionStages() {
        return versionStages;
    }

    /**
     * <p>
     * An array of staging labels that are currently associated with this version of the secret.
     * </p>
     * 
     * @param versionStages
     *        An array of staging labels that are currently associated with this version of the secret.
     */

    public void setVersionStages(java.util.Collection<String> versionStages) {
        if (versionStages == null) {
            this.versionStages = null;
            return;
        }

        this.versionStages = new java.util.ArrayList<String>(versionStages);
    }

    /**
     * <p>
     * An array of staging labels that are currently associated with this version of the secret.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVersionStages(java.util.Collection)} or {@link #withVersionStages(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param versionStages
     *        An array of staging labels that are currently associated with this version of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretVersionsListEntry withVersionStages(String... versionStages) {
        if (this.versionStages == null) {
            setVersionStages(new java.util.ArrayList<String>(versionStages.length));
        }
        for (String ele : versionStages) {
            this.versionStages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of staging labels that are currently associated with this version of the secret.
     * </p>
     * 
     * @param versionStages
     *        An array of staging labels that are currently associated with this version of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretVersionsListEntry withVersionStages(java.util.Collection<String> versionStages) {
        setVersionStages(versionStages);
        return this;
    }

    /**
     * <p>
     * The date that this version of the secret was last accessed. Note that the resolution of this field is at the date
     * level and does not include the time.
     * </p>
     * 
     * @param lastAccessedDate
     *        The date that this version of the secret was last accessed. Note that the resolution of this field is at
     *        the date level and does not include the time.
     */

    public void setLastAccessedDate(java.util.Date lastAccessedDate) {
        this.lastAccessedDate = lastAccessedDate;
    }

    /**
     * <p>
     * The date that this version of the secret was last accessed. Note that the resolution of this field is at the date
     * level and does not include the time.
     * </p>
     * 
     * @return The date that this version of the secret was last accessed. Note that the resolution of this field is at
     *         the date level and does not include the time.
     */

    public java.util.Date getLastAccessedDate() {
        return this.lastAccessedDate;
    }

    /**
     * <p>
     * The date that this version of the secret was last accessed. Note that the resolution of this field is at the date
     * level and does not include the time.
     * </p>
     * 
     * @param lastAccessedDate
     *        The date that this version of the secret was last accessed. Note that the resolution of this field is at
     *        the date level and does not include the time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretVersionsListEntry withLastAccessedDate(java.util.Date lastAccessedDate) {
        setLastAccessedDate(lastAccessedDate);
        return this;
    }

    /**
     * <p>
     * The date and time this version of the secret was created.
     * </p>
     * 
     * @param createdDate
     *        The date and time this version of the secret was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date and time this version of the secret was created.
     * </p>
     * 
     * @return The date and time this version of the secret was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date and time this version of the secret was created.
     * </p>
     * 
     * @param createdDate
     *        The date and time this version of the secret was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretVersionsListEntry withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
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
        if (getVersionStages() != null)
            sb.append("VersionStages: ").append(getVersionStages()).append(",");
        if (getLastAccessedDate() != null)
            sb.append("LastAccessedDate: ").append(getLastAccessedDate()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecretVersionsListEntry == false)
            return false;
        SecretVersionsListEntry other = (SecretVersionsListEntry) obj;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getVersionStages() == null ^ this.getVersionStages() == null)
            return false;
        if (other.getVersionStages() != null && other.getVersionStages().equals(this.getVersionStages()) == false)
            return false;
        if (other.getLastAccessedDate() == null ^ this.getLastAccessedDate() == null)
            return false;
        if (other.getLastAccessedDate() != null && other.getLastAccessedDate().equals(this.getLastAccessedDate()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode + ((getVersionStages() == null) ? 0 : getVersionStages().hashCode());
        hashCode = prime * hashCode + ((getLastAccessedDate() == null) ? 0 : getLastAccessedDate().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        return hashCode;
    }

    @Override
    public SecretVersionsListEntry clone() {
        try {
            return (SecretVersionsListEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.secretsmanager.model.transform.SecretVersionsListEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
