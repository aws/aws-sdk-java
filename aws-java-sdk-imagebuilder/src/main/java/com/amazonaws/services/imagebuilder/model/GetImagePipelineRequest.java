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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetImagePipeline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetImagePipelineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline that you want to retrieve.
     * </p>
     */
    private String imagePipelineArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline that you want to retrieve.
     * </p>
     * 
     * @param imagePipelineArn
     *        The Amazon Resource Name (ARN) of the image pipeline that you want to retrieve.
     */

    public void setImagePipelineArn(String imagePipelineArn) {
        this.imagePipelineArn = imagePipelineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline that you want to retrieve.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the image pipeline that you want to retrieve.
     */

    public String getImagePipelineArn() {
        return this.imagePipelineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image pipeline that you want to retrieve.
     * </p>
     * 
     * @param imagePipelineArn
     *        The Amazon Resource Name (ARN) of the image pipeline that you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImagePipelineRequest withImagePipelineArn(String imagePipelineArn) {
        setImagePipelineArn(imagePipelineArn);
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
        if (getImagePipelineArn() != null)
            sb.append("ImagePipelineArn: ").append(getImagePipelineArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetImagePipelineRequest == false)
            return false;
        GetImagePipelineRequest other = (GetImagePipelineRequest) obj;
        if (other.getImagePipelineArn() == null ^ this.getImagePipelineArn() == null)
            return false;
        if (other.getImagePipelineArn() != null && other.getImagePipelineArn().equals(this.getImagePipelineArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImagePipelineArn() == null) ? 0 : getImagePipelineArn().hashCode());
        return hashCode;
    }

    @Override
    public GetImagePipelineRequest clone() {
        return (GetImagePipelineRequest) super.clone();
    }

}
