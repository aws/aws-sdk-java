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
 * Artifact details for the action execution, such as the artifact location.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ArtifactDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ArtifactDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The artifact object name for the action execution.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon S3 artifact location for the action execution.
     * </p>
     */
    private S3Location s3location;

    /**
     * <p>
     * The artifact object name for the action execution.
     * </p>
     * 
     * @param name
     *        The artifact object name for the action execution.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The artifact object name for the action execution.
     * </p>
     * 
     * @return The artifact object name for the action execution.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The artifact object name for the action execution.
     * </p>
     * 
     * @param name
     *        The artifact object name for the action execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArtifactDetail withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 artifact location for the action execution.
     * </p>
     * 
     * @param s3location
     *        The Amazon S3 artifact location for the action execution.
     */

    public void setS3location(S3Location s3location) {
        this.s3location = s3location;
    }

    /**
     * <p>
     * The Amazon S3 artifact location for the action execution.
     * </p>
     * 
     * @return The Amazon S3 artifact location for the action execution.
     */

    public S3Location getS3location() {
        return this.s3location;
    }

    /**
     * <p>
     * The Amazon S3 artifact location for the action execution.
     * </p>
     * 
     * @param s3location
     *        The Amazon S3 artifact location for the action execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArtifactDetail withS3location(S3Location s3location) {
        setS3location(s3location);
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
        if (getS3location() != null)
            sb.append("S3location: ").append(getS3location());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArtifactDetail == false)
            return false;
        ArtifactDetail other = (ArtifactDetail) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getS3location() == null ^ this.getS3location() == null)
            return false;
        if (other.getS3location() != null && other.getS3location().equals(this.getS3location()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getS3location() == null) ? 0 : getS3location().hashCode());
        return hashCode;
    }

    @Override
    public ArtifactDetail clone() {
        try {
            return (ArtifactDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ArtifactDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
