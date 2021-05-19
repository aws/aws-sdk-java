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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The information required to specify a Maven reference. You can use Maven references to specify dependency JAR files.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/MavenReference" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MavenReference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The group ID of the Maven reference.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * The artifact ID of the Maven reference.
     * </p>
     */
    private String artifactId;
    /**
     * <p>
     * The version of the Maven reference.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The group ID of the Maven reference.
     * </p>
     * 
     * @param groupId
     *        The group ID of the Maven reference.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The group ID of the Maven reference.
     * </p>
     * 
     * @return The group ID of the Maven reference.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The group ID of the Maven reference.
     * </p>
     * 
     * @param groupId
     *        The group ID of the Maven reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MavenReference withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * The artifact ID of the Maven reference.
     * </p>
     * 
     * @param artifactId
     *        The artifact ID of the Maven reference.
     */

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    /**
     * <p>
     * The artifact ID of the Maven reference.
     * </p>
     * 
     * @return The artifact ID of the Maven reference.
     */

    public String getArtifactId() {
        return this.artifactId;
    }

    /**
     * <p>
     * The artifact ID of the Maven reference.
     * </p>
     * 
     * @param artifactId
     *        The artifact ID of the Maven reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MavenReference withArtifactId(String artifactId) {
        setArtifactId(artifactId);
        return this;
    }

    /**
     * <p>
     * The version of the Maven reference.
     * </p>
     * 
     * @param version
     *        The version of the Maven reference.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the Maven reference.
     * </p>
     * 
     * @return The version of the Maven reference.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the Maven reference.
     * </p>
     * 
     * @param version
     *        The version of the Maven reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MavenReference withVersion(String version) {
        setVersion(version);
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
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getArtifactId() != null)
            sb.append("ArtifactId: ").append(getArtifactId()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MavenReference == false)
            return false;
        MavenReference other = (MavenReference) obj;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getArtifactId() == null ^ this.getArtifactId() == null)
            return false;
        if (other.getArtifactId() != null && other.getArtifactId().equals(this.getArtifactId()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getArtifactId() == null) ? 0 : getArtifactId().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public MavenReference clone() {
        try {
            return (MavenReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.MavenReferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
