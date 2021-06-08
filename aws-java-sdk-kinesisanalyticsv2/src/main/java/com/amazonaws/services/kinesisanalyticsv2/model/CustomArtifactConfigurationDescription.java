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
 * Specifies a dependency JAR or a JAR of user-defined functions.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/CustomArtifactConfigurationDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomArtifactConfigurationDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * <code>UDF</code> stands for user-defined functions. This type of artifact must be in an S3 bucket. A
     * <code>DEPENDENCY_JAR</code> can be in either Maven or an S3 bucket.
     * </p>
     */
    private String artifactType;

    private S3ContentLocation s3ContentLocationDescription;
    /**
     * <p>
     * The parameters that are required to specify a Maven dependency.
     * </p>
     */
    private MavenReference mavenReferenceDescription;

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

    public CustomArtifactConfigurationDescription withArtifactType(String artifactType) {
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

    public CustomArtifactConfigurationDescription withArtifactType(ArtifactType artifactType) {
        this.artifactType = artifactType.toString();
        return this;
    }

    /**
     * @param s3ContentLocationDescription
     */

    public void setS3ContentLocationDescription(S3ContentLocation s3ContentLocationDescription) {
        this.s3ContentLocationDescription = s3ContentLocationDescription;
    }

    /**
     * @return
     */

    public S3ContentLocation getS3ContentLocationDescription() {
        return this.s3ContentLocationDescription;
    }

    /**
     * @param s3ContentLocationDescription
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomArtifactConfigurationDescription withS3ContentLocationDescription(S3ContentLocation s3ContentLocationDescription) {
        setS3ContentLocationDescription(s3ContentLocationDescription);
        return this;
    }

    /**
     * <p>
     * The parameters that are required to specify a Maven dependency.
     * </p>
     * 
     * @param mavenReferenceDescription
     *        The parameters that are required to specify a Maven dependency.
     */

    public void setMavenReferenceDescription(MavenReference mavenReferenceDescription) {
        this.mavenReferenceDescription = mavenReferenceDescription;
    }

    /**
     * <p>
     * The parameters that are required to specify a Maven dependency.
     * </p>
     * 
     * @return The parameters that are required to specify a Maven dependency.
     */

    public MavenReference getMavenReferenceDescription() {
        return this.mavenReferenceDescription;
    }

    /**
     * <p>
     * The parameters that are required to specify a Maven dependency.
     * </p>
     * 
     * @param mavenReferenceDescription
     *        The parameters that are required to specify a Maven dependency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomArtifactConfigurationDescription withMavenReferenceDescription(MavenReference mavenReferenceDescription) {
        setMavenReferenceDescription(mavenReferenceDescription);
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
        if (getS3ContentLocationDescription() != null)
            sb.append("S3ContentLocationDescription: ").append(getS3ContentLocationDescription()).append(",");
        if (getMavenReferenceDescription() != null)
            sb.append("MavenReferenceDescription: ").append(getMavenReferenceDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomArtifactConfigurationDescription == false)
            return false;
        CustomArtifactConfigurationDescription other = (CustomArtifactConfigurationDescription) obj;
        if (other.getArtifactType() == null ^ this.getArtifactType() == null)
            return false;
        if (other.getArtifactType() != null && other.getArtifactType().equals(this.getArtifactType()) == false)
            return false;
        if (other.getS3ContentLocationDescription() == null ^ this.getS3ContentLocationDescription() == null)
            return false;
        if (other.getS3ContentLocationDescription() != null && other.getS3ContentLocationDescription().equals(this.getS3ContentLocationDescription()) == false)
            return false;
        if (other.getMavenReferenceDescription() == null ^ this.getMavenReferenceDescription() == null)
            return false;
        if (other.getMavenReferenceDescription() != null && other.getMavenReferenceDescription().equals(this.getMavenReferenceDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArtifactType() == null) ? 0 : getArtifactType().hashCode());
        hashCode = prime * hashCode + ((getS3ContentLocationDescription() == null) ? 0 : getS3ContentLocationDescription().hashCode());
        hashCode = prime * hashCode + ((getMavenReferenceDescription() == null) ? 0 : getMavenReferenceDescription().hashCode());
        return hashCode;
    }

    @Override
    public CustomArtifactConfigurationDescription clone() {
        try {
            return (CustomArtifactConfigurationDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.CustomArtifactConfigurationDescriptionMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
