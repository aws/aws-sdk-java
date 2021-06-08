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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information to verify the integrity of stored model artifacts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ModelDigests" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelDigests implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides a hash value that uniquely identifies the stored model artifacts.
     * </p>
     */
    private String artifactDigest;

    /**
     * <p>
     * Provides a hash value that uniquely identifies the stored model artifacts.
     * </p>
     * 
     * @param artifactDigest
     *        Provides a hash value that uniquely identifies the stored model artifacts.
     */

    public void setArtifactDigest(String artifactDigest) {
        this.artifactDigest = artifactDigest;
    }

    /**
     * <p>
     * Provides a hash value that uniquely identifies the stored model artifacts.
     * </p>
     * 
     * @return Provides a hash value that uniquely identifies the stored model artifacts.
     */

    public String getArtifactDigest() {
        return this.artifactDigest;
    }

    /**
     * <p>
     * Provides a hash value that uniquely identifies the stored model artifacts.
     * </p>
     * 
     * @param artifactDigest
     *        Provides a hash value that uniquely identifies the stored model artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDigests withArtifactDigest(String artifactDigest) {
        setArtifactDigest(artifactDigest);
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
        if (getArtifactDigest() != null)
            sb.append("ArtifactDigest: ").append(getArtifactDigest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelDigests == false)
            return false;
        ModelDigests other = (ModelDigests) obj;
        if (other.getArtifactDigest() == null ^ this.getArtifactDigest() == null)
            return false;
        if (other.getArtifactDigest() != null && other.getArtifactDigest().equals(this.getArtifactDigest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArtifactDigest() == null) ? 0 : getArtifactDigest().hashCode());
        return hashCode;
    }

    @Override
    public ModelDigests clone() {
        try {
            return (ModelDigests) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelDigestsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
