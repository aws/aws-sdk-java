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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateArtifact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateArtifactResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the artifact.
     * </p>
     */
    private String artifactArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the artifact.
     * </p>
     * 
     * @param artifactArn
     *        The Amazon Resource Name (ARN) of the artifact.
     */

    public void setArtifactArn(String artifactArn) {
        this.artifactArn = artifactArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the artifact.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the artifact.
     */

    public String getArtifactArn() {
        return this.artifactArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the artifact.
     * </p>
     * 
     * @param artifactArn
     *        The Amazon Resource Name (ARN) of the artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateArtifactResult withArtifactArn(String artifactArn) {
        setArtifactArn(artifactArn);
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
        if (getArtifactArn() != null)
            sb.append("ArtifactArn: ").append(getArtifactArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateArtifactResult == false)
            return false;
        UpdateArtifactResult other = (UpdateArtifactResult) obj;
        if (other.getArtifactArn() == null ^ this.getArtifactArn() == null)
            return false;
        if (other.getArtifactArn() != null && other.getArtifactArn().equals(this.getArtifactArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArtifactArn() == null) ? 0 : getArtifactArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateArtifactResult clone() {
        try {
            return (UpdateArtifactResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
