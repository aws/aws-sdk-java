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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ListCuratedEnvironmentImages"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCuratedEnvironmentImagesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about supported platforms for Docker images that are managed by AWS CodeBuild.
     * </p>
     */
    private java.util.List<EnvironmentPlatform> platforms;

    /**
     * <p>
     * Information about supported platforms for Docker images that are managed by AWS CodeBuild.
     * </p>
     * 
     * @return Information about supported platforms for Docker images that are managed by AWS CodeBuild.
     */

    public java.util.List<EnvironmentPlatform> getPlatforms() {
        return platforms;
    }

    /**
     * <p>
     * Information about supported platforms for Docker images that are managed by AWS CodeBuild.
     * </p>
     * 
     * @param platforms
     *        Information about supported platforms for Docker images that are managed by AWS CodeBuild.
     */

    public void setPlatforms(java.util.Collection<EnvironmentPlatform> platforms) {
        if (platforms == null) {
            this.platforms = null;
            return;
        }

        this.platforms = new java.util.ArrayList<EnvironmentPlatform>(platforms);
    }

    /**
     * <p>
     * Information about supported platforms for Docker images that are managed by AWS CodeBuild.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlatforms(java.util.Collection)} or {@link #withPlatforms(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param platforms
     *        Information about supported platforms for Docker images that are managed by AWS CodeBuild.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCuratedEnvironmentImagesResult withPlatforms(EnvironmentPlatform... platforms) {
        if (this.platforms == null) {
            setPlatforms(new java.util.ArrayList<EnvironmentPlatform>(platforms.length));
        }
        for (EnvironmentPlatform ele : platforms) {
            this.platforms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about supported platforms for Docker images that are managed by AWS CodeBuild.
     * </p>
     * 
     * @param platforms
     *        Information about supported platforms for Docker images that are managed by AWS CodeBuild.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCuratedEnvironmentImagesResult withPlatforms(java.util.Collection<EnvironmentPlatform> platforms) {
        setPlatforms(platforms);
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
        if (getPlatforms() != null)
            sb.append("Platforms: ").append(getPlatforms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCuratedEnvironmentImagesResult == false)
            return false;
        ListCuratedEnvironmentImagesResult other = (ListCuratedEnvironmentImagesResult) obj;
        if (other.getPlatforms() == null ^ this.getPlatforms() == null)
            return false;
        if (other.getPlatforms() != null && other.getPlatforms().equals(this.getPlatforms()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlatforms() == null) ? 0 : getPlatforms().hashCode());
        return hashCode;
    }

    @Override
    public ListCuratedEnvironmentImagesResult clone() {
        try {
            return (ListCuratedEnvironmentImagesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
