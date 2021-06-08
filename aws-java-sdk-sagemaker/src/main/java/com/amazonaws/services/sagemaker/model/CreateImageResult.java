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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateImage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateImageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image.
     * </p>
     */
    private String imageArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image.
     * </p>
     * 
     * @param imageArn
     *        The Amazon Resource Name (ARN) of the image.
     */

    public void setImageArn(String imageArn) {
        this.imageArn = imageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the image.
     */

    public String getImageArn() {
        return this.imageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image.
     * </p>
     * 
     * @param imageArn
     *        The Amazon Resource Name (ARN) of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageResult withImageArn(String imageArn) {
        setImageArn(imageArn);
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
        if (getImageArn() != null)
            sb.append("ImageArn: ").append(getImageArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateImageResult == false)
            return false;
        CreateImageResult other = (CreateImageResult) obj;
        if (other.getImageArn() == null ^ this.getImageArn() == null)
            return false;
        if (other.getImageArn() != null && other.getImageArn().equals(this.getImageArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageArn() == null) ? 0 : getImageArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateImageResult clone() {
        try {
            return (CreateImageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
