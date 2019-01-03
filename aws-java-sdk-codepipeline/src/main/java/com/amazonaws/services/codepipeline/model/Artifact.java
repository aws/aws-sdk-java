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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents information about an artifact that will be worked upon by actions in the pipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/Artifact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Artifact implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The artifact's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The artifact's revision ID. Depending on the type of object, this could be a commit ID (GitHub) or a revision ID
     * (Amazon S3).
     * </p>
     */
    private String revision;
    /**
     * <p>
     * The location of an artifact.
     * </p>
     */
    private ArtifactLocation location;

    /**
     * <p>
     * The artifact's name.
     * </p>
     * 
     * @param name
     *        The artifact's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The artifact's name.
     * </p>
     * 
     * @return The artifact's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The artifact's name.
     * </p>
     * 
     * @param name
     *        The artifact's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Artifact withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The artifact's revision ID. Depending on the type of object, this could be a commit ID (GitHub) or a revision ID
     * (Amazon S3).
     * </p>
     * 
     * @param revision
     *        The artifact's revision ID. Depending on the type of object, this could be a commit ID (GitHub) or a
     *        revision ID (Amazon S3).
     */

    public void setRevision(String revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The artifact's revision ID. Depending on the type of object, this could be a commit ID (GitHub) or a revision ID
     * (Amazon S3).
     * </p>
     * 
     * @return The artifact's revision ID. Depending on the type of object, this could be a commit ID (GitHub) or a
     *         revision ID (Amazon S3).
     */

    public String getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The artifact's revision ID. Depending on the type of object, this could be a commit ID (GitHub) or a revision ID
     * (Amazon S3).
     * </p>
     * 
     * @param revision
     *        The artifact's revision ID. Depending on the type of object, this could be a commit ID (GitHub) or a
     *        revision ID (Amazon S3).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Artifact withRevision(String revision) {
        setRevision(revision);
        return this;
    }

    /**
     * <p>
     * The location of an artifact.
     * </p>
     * 
     * @param location
     *        The location of an artifact.
     */

    public void setLocation(ArtifactLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The location of an artifact.
     * </p>
     * 
     * @return The location of an artifact.
     */

    public ArtifactLocation getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The location of an artifact.
     * </p>
     * 
     * @param location
     *        The location of an artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Artifact withLocation(ArtifactLocation location) {
        setLocation(location);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Artifact == false)
            return false;
        Artifact other = (Artifact) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public Artifact clone() {
        try {
            return (Artifact) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ArtifactMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
