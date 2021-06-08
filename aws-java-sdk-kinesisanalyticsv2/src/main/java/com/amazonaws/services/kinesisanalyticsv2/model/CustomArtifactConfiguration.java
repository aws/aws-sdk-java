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
 * Specifies dependency JARs, as well as JAR files that contain user-defined functions (UDF).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/CustomArtifactConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomArtifactConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * <code>UDF</code> stands for user-defined functions. This type of artifact must be in an S3 bucket. A
     * <code>DEPENDENCY_JAR</code> can be in either Maven or an S3 bucket.
     * </p>
     */
    private String artifactType;

    private S3ContentLocation s3ContentLocation;
    /**
     * <p>
     * The parameters required to fully specify a Maven reference.
     * </p>
     */
    private MavenReference mavenReference;

    /**
     * <p>
     * <code>UDF</code> stands for user-defined functions. This type of artifact must be in an S3 bucket. A
     * <code>DEPENDENCY_JAR</code> can be in either Maven or an S3 bucket.
     * </p>
     * 
     * @param artifactType
     *        <code>UDF</code> stands for user-defined functions. This type of artifact must be in an S3 bucket. A
     *        <code>DEPENDENCY_JAR</code> can be in either Maven or an S3 bucket.
     * @see ArtifactType
     */

    public void setArtifactType(String artifactType) {
        this.artifactType = artifactType;
    }

    /**
     * <p>
     * <code>UDF</code> stands for user-defined functions. This type of artifact must be in an S3 bucket. A
     * <code>DEPENDENCY_JAR</code> can be in either Maven or an S3 bucket.
     * </p>
     * 
     * @return <code>UDF</code> stands for user-defined functions. This type of artifact must be in an S3 bucket. A
     *         <code>DEPENDENCY_JAR</code> can be in either Maven or an S3 bucket.
     * @see ArtifactType
     */

    public String getArtifactType() {
        return this.artifactType;
    }

    /**
     * <p>
     * <code>UDF</code> stands for user-defined functions. This type of artifact must be in an S3 bucket. A
     * <code>DEPENDENCY_JAR</code> can be in either Maven or an S3 bucket.
     * </p>
     * 
     * @param artifactType
     *        <code>UDF</code> stands for user-defined functions. This type of artifact must be in an S3 bucket. A
     *        <code>DEPENDENCY_JAR</code> can be in either Maven or an S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactType
     */

    public CustomArtifactConfiguration withArtifactType(String artifactType) {
        setArtifactType(artifactType);
        return this;
    }

    /**
     * <p>
     * <code>UDF</code> stands for user-defined functions. This type of artifact must be in an S3 bucket. A
     * <code>DEPENDENCY_JAR</code> can be in either Maven or an S3 bucket.
     * </p>
     * 
     * @param artifactType
     *        <code>UDF</code> stands for user-defined functions. This type of artifact must be in an S3 bucket. A
     *        <code>DEPENDENCY_JAR</code> can be in either Maven or an S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactType
     */

    public CustomArtifactConfiguration withArtifactType(ArtifactType artifactType) {
        this.artifactType = artifactType.toString();
        return this;
    }

    /**
     * @param s3ContentLocation
     */

    public void setS3ContentLocation(S3ContentLocation s3ContentLocation) {
        this.s3ContentLocation = s3ContentLocation;
    }

    /**
     * @return
     */

    public S3ContentLocation getS3ContentLocation() {
        return this.s3ContentLocation;
    }

    /**
     * @param s3ContentLocation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomArtifactConfiguration withS3ContentLocation(S3ContentLocation s3ContentLocation) {
        setS3ContentLocation(s3ContentLocation);
        return this;
    }

    /**
     * <p>
     * The parameters required to fully specify a Maven reference.
     * </p>
     * 
     * @param mavenReference
     *        The parameters required to fully specify a Maven reference.
     */

    public void setMavenReference(MavenReference mavenReference) {
        this.mavenReference = mavenReference;
    }

    /**
     * <p>
     * The parameters required to fully specify a Maven reference.
     * </p>
     * 
     * @return The parameters required to fully specify a Maven reference.
     */

    public MavenReference getMavenReference() {
        return this.mavenReference;
    }

    /**
     * <p>
     * The parameters required to fully specify a Maven reference.
     * </p>
     * 
     * @param mavenReference
     *        The parameters required to fully specify a Maven reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomArtifactConfiguration withMavenReference(MavenReference mavenReference) {
        setMavenReference(mavenReference);
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
        if (getArtifactType() != null)
            sb.append("ArtifactType: ").append(getArtifactType()).append(",");
        if (getS3ContentLocation() != null)
            sb.append("S3ContentLocation: ").append(getS3ContentLocation()).append(",");
        if (getMavenReference() != null)
            sb.append("MavenReference: ").append(getMavenReference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomArtifactConfiguration == false)
            return false;
        CustomArtifactConfiguration other = (CustomArtifactConfiguration) obj;
        if (other.getArtifactType() == null ^ this.getArtifactType() == null)
            return false;
        if (other.getArtifactType() != null && other.getArtifactType().equals(this.getArtifactType()) == false)
            return false;
        if (other.getS3ContentLocation() == null ^ this.getS3ContentLocation() == null)
            return false;
        if (other.getS3ContentLocation() != null && other.getS3ContentLocation().equals(this.getS3ContentLocation()) == false)
            return false;
        if (other.getMavenReference() == null ^ this.getMavenReference() == null)
            return false;
        if (other.getMavenReference() != null && other.getMavenReference().equals(this.getMavenReference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArtifactType() == null) ? 0 : getArtifactType().hashCode());
        hashCode = prime * hashCode + ((getS3ContentLocation() == null) ? 0 : getS3ContentLocation().hashCode());
        hashCode = prime * hashCode + ((getMavenReference() == null) ? 0 : getMavenReference().hashCode());
        return hashCode;
    }

    @Override
    public CustomArtifactConfiguration clone() {
        try {
            return (CustomArtifactConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.CustomArtifactConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
