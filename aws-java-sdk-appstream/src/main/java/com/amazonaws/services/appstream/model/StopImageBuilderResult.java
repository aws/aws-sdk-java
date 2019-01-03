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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/StopImageBuilder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopImageBuilderResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the image builder.
     * </p>
     */
    private ImageBuilder imageBuilder;

    /**
     * <p>
     * Information about the image builder.
     * </p>
     * 
     * @param imageBuilder
     *        Information about the image builder.
     */

    public void setImageBuilder(ImageBuilder imageBuilder) {
        this.imageBuilder = imageBuilder;
    }

    /**
     * <p>
     * Information about the image builder.
     * </p>
     * 
     * @return Information about the image builder.
     */

    public ImageBuilder getImageBuilder() {
        return this.imageBuilder;
    }

    /**
     * <p>
     * Information about the image builder.
     * </p>
     * 
     * @param imageBuilder
     *        Information about the image builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopImageBuilderResult withImageBuilder(ImageBuilder imageBuilder) {
        setImageBuilder(imageBuilder);
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
        if (getImageBuilder() != null)
            sb.append("ImageBuilder: ").append(getImageBuilder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopImageBuilderResult == false)
            return false;
        StopImageBuilderResult other = (StopImageBuilderResult) obj;
        if (other.getImageBuilder() == null ^ this.getImageBuilder() == null)
            return false;
        if (other.getImageBuilder() != null && other.getImageBuilder().equals(this.getImageBuilder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageBuilder() == null) ? 0 : getImageBuilder().hashCode());
        return hashCode;
    }

    @Override
    public StopImageBuilderResult clone() {
        try {
            return (StopImageBuilderResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
