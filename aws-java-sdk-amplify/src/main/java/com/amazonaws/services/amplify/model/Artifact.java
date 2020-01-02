/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Structure for artifact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/Artifact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Artifact implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * File name for the artifact.
     * </p>
     */
    private String artifactFileName;
    /**
     * <p>
     * Unique Id for a artifact.
     * </p>
     */
    private String artifactId;

    /**
     * <p>
     * File name for the artifact.
     * </p>
     * 
     * @param artifactFileName
     *        File name for the artifact.
     */

    public void setArtifactFileName(String artifactFileName) {
        this.artifactFileName = artifactFileName;
    }

    /**
     * <p>
     * File name for the artifact.
     * </p>
     * 
     * @return File name for the artifact.
     */

    public String getArtifactFileName() {
        return this.artifactFileName;
    }

    /**
     * <p>
     * File name for the artifact.
     * </p>
     * 
     * @param artifactFileName
     *        File name for the artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Artifact withArtifactFileName(String artifactFileName) {
        setArtifactFileName(artifactFileName);
        return this;
    }

    /**
     * <p>
     * Unique Id for a artifact.
     * </p>
     * 
     * @param artifactId
     *        Unique Id for a artifact.
     */

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    /**
     * <p>
     * Unique Id for a artifact.
     * </p>
     * 
     * @return Unique Id for a artifact.
     */

    public String getArtifactId() {
        return this.artifactId;
    }

    /**
     * <p>
     * Unique Id for a artifact.
     * </p>
     * 
     * @param artifactId
     *        Unique Id for a artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Artifact withArtifactId(String artifactId) {
        setArtifactId(artifactId);
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
        if (getArtifactFileName() != null)
            sb.append("ArtifactFileName: ").append(getArtifactFileName()).append(",");
        if (getArtifactId() != null)
            sb.append("ArtifactId: ").append(getArtifactId());
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
        if (other.getArtifactFileName() == null ^ this.getArtifactFileName() == null)
            return false;
        if (other.getArtifactFileName() != null && other.getArtifactFileName().equals(this.getArtifactFileName()) == false)
            return false;
        if (other.getArtifactId() == null ^ this.getArtifactId() == null)
            return false;
        if (other.getArtifactId() != null && other.getArtifactId().equals(this.getArtifactId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArtifactFileName() == null) ? 0 : getArtifactFileName().hashCode());
        hashCode = prime * hashCode + ((getArtifactId() == null) ? 0 : getArtifactId().hashCode());
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
        com.amazonaws.services.amplify.model.transform.ArtifactMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
