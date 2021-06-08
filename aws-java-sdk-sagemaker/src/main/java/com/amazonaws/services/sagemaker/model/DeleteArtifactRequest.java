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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteArtifact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteArtifactRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the artifact to delete.
     * </p>
     */
    private String artifactArn;
    /**
     * <p>
     * The URI of the source.
     * </p>
     */
    private ArtifactSource source;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the artifact to delete.
     * </p>
     * 
     * @param artifactArn
     *        The Amazon Resource Name (ARN) of the artifact to delete.
     */

    public void setArtifactArn(String artifactArn) {
        this.artifactArn = artifactArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the artifact to delete.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the artifact to delete.
     */

    public String getArtifactArn() {
        return this.artifactArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the artifact to delete.
     * </p>
     * 
     * @param artifactArn
     *        The Amazon Resource Name (ARN) of the artifact to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteArtifactRequest withArtifactArn(String artifactArn) {
        setArtifactArn(artifactArn);
        return this;
    }

    /**
     * <p>
     * The URI of the source.
     * </p>
     * 
     * @param source
     *        The URI of the source.
     */

    public void setSource(ArtifactSource source) {
        this.source = source;
    }

    /**
     * <p>
     * The URI of the source.
     * </p>
     * 
     * @return The URI of the source.
     */

    public ArtifactSource getSource() {
        return this.source;
    }

    /**
     * <p>
     * The URI of the source.
     * </p>
     * 
     * @param source
     *        The URI of the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteArtifactRequest withSource(ArtifactSource source) {
        setSource(source);
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
            sb.append("ArtifactArn: ").append(getArtifactArn()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteArtifactRequest == false)
            return false;
        DeleteArtifactRequest other = (DeleteArtifactRequest) obj;
        if (other.getArtifactArn() == null ^ this.getArtifactArn() == null)
            return false;
        if (other.getArtifactArn() != null && other.getArtifactArn().equals(this.getArtifactArn()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArtifactArn() == null) ? 0 : getArtifactArn().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        return hashCode;
    }

    @Override
    public DeleteArtifactRequest clone() {
        return (DeleteArtifactRequest) super.clone();
    }

}
