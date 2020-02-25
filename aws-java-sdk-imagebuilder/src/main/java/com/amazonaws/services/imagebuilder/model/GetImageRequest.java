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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetImage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetImageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image that you want to retrieve.
     * </p>
     */
    private String imageBuildVersionArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image that you want to retrieve.
     * </p>
     * 
     * @param imageBuildVersionArn
     *        The Amazon Resource Name (ARN) of the image that you want to retrieve.
     */

    public void setImageBuildVersionArn(String imageBuildVersionArn) {
        this.imageBuildVersionArn = imageBuildVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image that you want to retrieve.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the image that you want to retrieve.
     */

    public String getImageBuildVersionArn() {
        return this.imageBuildVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image that you want to retrieve.
     * </p>
     * 
     * @param imageBuildVersionArn
     *        The Amazon Resource Name (ARN) of the image that you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImageRequest withImageBuildVersionArn(String imageBuildVersionArn) {
        setImageBuildVersionArn(imageBuildVersionArn);
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
        if (getImageBuildVersionArn() != null)
            sb.append("ImageBuildVersionArn: ").append(getImageBuildVersionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetImageRequest == false)
            return false;
        GetImageRequest other = (GetImageRequest) obj;
        if (other.getImageBuildVersionArn() == null ^ this.getImageBuildVersionArn() == null)
            return false;
        if (other.getImageBuildVersionArn() != null && other.getImageBuildVersionArn().equals(this.getImageBuildVersionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageBuildVersionArn() == null) ? 0 : getImageBuildVersionArn().hashCode());
        return hashCode;
    }

    @Override
    public GetImageRequest clone() {
        return (GetImageRequest) super.clone();
    }

}
