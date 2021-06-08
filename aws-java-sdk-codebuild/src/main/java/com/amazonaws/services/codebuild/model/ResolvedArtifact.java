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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a resolved build artifact. A resolve artifact is an artifact that is built and deployed to the
 * destination, such as Amazon S3.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ResolvedArtifact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResolvedArtifact implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the type of artifact.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The location of the artifact.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The identifier of the artifact.
     * </p>
     */
    private String identifier;

    /**
     * <p>
     * Specifies the type of artifact.
     * </p>
     * 
     * @param type
     *        Specifies the type of artifact.
     * @see ArtifactsType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies the type of artifact.
     * </p>
     * 
     * @return Specifies the type of artifact.
     * @see ArtifactsType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specifies the type of artifact.
     * </p>
     * 
     * @param type
     *        Specifies the type of artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactsType
     */

    public ResolvedArtifact withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specifies the type of artifact.
     * </p>
     * 
     * @param type
     *        Specifies the type of artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactsType
     */

    public ResolvedArtifact withType(ArtifactsType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The location of the artifact.
     * </p>
     * 
     * @param location
     *        The location of the artifact.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The location of the artifact.
     * </p>
     * 
     * @return The location of the artifact.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The location of the artifact.
     * </p>
     * 
     * @param location
     *        The location of the artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolvedArtifact withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The identifier of the artifact.
     * </p>
     * 
     * @param identifier
     *        The identifier of the artifact.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The identifier of the artifact.
     * </p>
     * 
     * @return The identifier of the artifact.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The identifier of the artifact.
     * </p>
     * 
     * @param identifier
     *        The identifier of the artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolvedArtifact withIdentifier(String identifier) {
        setIdentifier(identifier);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResolvedArtifact == false)
            return false;
        ResolvedArtifact other = (ResolvedArtifact) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public ResolvedArtifact clone() {
        try {
            return (ResolvedArtifact) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.ResolvedArtifactMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
