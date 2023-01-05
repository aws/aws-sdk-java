/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a package version.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PackageVersionHistory implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The package version.
     * </p>
     */
    private String packageVersion;
    /**
     * <p>
     * A message associated with the package version when it was uploaded.
     * </p>
     */
    private String commitMessage;
    /**
     * <p>
     * The date and time when the package was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The package version.
     * </p>
     * 
     * @param packageVersion
     *        The package version.
     */

    public void setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
    }

    /**
     * <p>
     * The package version.
     * </p>
     * 
     * @return The package version.
     */

    public String getPackageVersion() {
        return this.packageVersion;
    }

    /**
     * <p>
     * The package version.
     * </p>
     * 
     * @param packageVersion
     *        The package version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageVersionHistory withPackageVersion(String packageVersion) {
        setPackageVersion(packageVersion);
        return this;
    }

    /**
     * <p>
     * A message associated with the package version when it was uploaded.
     * </p>
     * 
     * @param commitMessage
     *        A message associated with the package version when it was uploaded.
     */

    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    /**
     * <p>
     * A message associated with the package version when it was uploaded.
     * </p>
     * 
     * @return A message associated with the package version when it was uploaded.
     */

    public String getCommitMessage() {
        return this.commitMessage;
    }

    /**
     * <p>
     * A message associated with the package version when it was uploaded.
     * </p>
     * 
     * @param commitMessage
     *        A message associated with the package version when it was uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageVersionHistory withCommitMessage(String commitMessage) {
        setCommitMessage(commitMessage);
        return this;
    }

    /**
     * <p>
     * The date and time when the package was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the package was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time when the package was created.
     * </p>
     * 
     * @return The date and time when the package was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time when the package was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the package was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PackageVersionHistory withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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
        if (getPackageVersion() != null)
            sb.append("PackageVersion: ").append(getPackageVersion()).append(",");
        if (getCommitMessage() != null)
            sb.append("CommitMessage: ").append(getCommitMessage()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PackageVersionHistory == false)
            return false;
        PackageVersionHistory other = (PackageVersionHistory) obj;
        if (other.getPackageVersion() == null ^ this.getPackageVersion() == null)
            return false;
        if (other.getPackageVersion() != null && other.getPackageVersion().equals(this.getPackageVersion()) == false)
            return false;
        if (other.getCommitMessage() == null ^ this.getCommitMessage() == null)
            return false;
        if (other.getCommitMessage() != null && other.getCommitMessage().equals(this.getCommitMessage()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPackageVersion() == null) ? 0 : getPackageVersion().hashCode());
        hashCode = prime * hashCode + ((getCommitMessage() == null) ? 0 : getCommitMessage().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return hashCode;
    }

    @Override
    public PackageVersionHistory clone() {
        try {
            return (PackageVersionHistory) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.PackageVersionHistoryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
