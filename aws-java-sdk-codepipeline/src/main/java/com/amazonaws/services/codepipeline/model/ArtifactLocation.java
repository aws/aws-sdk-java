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
 * Represents information about the location of an artifact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ArtifactLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ArtifactLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of artifact in the location.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The Amazon S3 bucket that contains the artifact.
     * </p>
     */
    private S3ArtifactLocation s3Location;

    /**
     * <p>
     * The type of artifact in the location.
     * </p>
     * 
     * @param type
     *        The type of artifact in the location.
     * @see ArtifactLocationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of artifact in the location.
     * </p>
     * 
     * @return The type of artifact in the location.
     * @see ArtifactLocationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of artifact in the location.
     * </p>
     * 
     * @param type
     *        The type of artifact in the location.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactLocationType
     */

    public ArtifactLocation withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of artifact in the location.
     * </p>
     * 
     * @param type
     *        The type of artifact in the location.
     * @see ArtifactLocationType
     */

    public void setType(ArtifactLocationType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of artifact in the location.
     * </p>
     * 
     * @param type
     *        The type of artifact in the location.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactLocationType
     */

    public ArtifactLocation withType(ArtifactLocationType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket that contains the artifact.
     * </p>
     * 
     * @param s3Location
     *        The Amazon S3 bucket that contains the artifact.
     */

    public void setS3Location(S3ArtifactLocation s3Location) {
        this.s3Location = s3Location;
    }

    /**
     * <p>
     * The Amazon S3 bucket that contains the artifact.
     * </p>
     * 
     * @return The Amazon S3 bucket that contains the artifact.
     */

    public S3ArtifactLocation getS3Location() {
        return this.s3Location;
    }

    /**
     * <p>
     * The Amazon S3 bucket that contains the artifact.
     * </p>
     * 
     * @param s3Location
     *        The Amazon S3 bucket that contains the artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArtifactLocation withS3Location(S3ArtifactLocation s3Location) {
        setS3Location(s3Location);
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
        if (getS3Location() != null)
            sb.append("S3Location: ").append(getS3Location());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArtifactLocation == false)
            return false;
        ArtifactLocation other = (ArtifactLocation) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getS3Location() == null ^ this.getS3Location() == null)
            return false;
        if (other.getS3Location() != null && other.getS3Location().equals(this.getS3Location()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getS3Location() == null) ? 0 : getS3Location().hashCode());
        return hashCode;
    }

    @Override
    public ArtifactLocation clone() {
        try {
            return (ArtifactLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ArtifactLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
