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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/GetImageRecipePolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetImageRecipePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe whose policy you want to retrieve.
     * </p>
     */
    private String imageRecipeArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe whose policy you want to retrieve.
     * </p>
     * 
     * @param imageRecipeArn
     *        The Amazon Resource Name (ARN) of the image recipe whose policy you want to retrieve.
     */

    public void setImageRecipeArn(String imageRecipeArn) {
        this.imageRecipeArn = imageRecipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe whose policy you want to retrieve.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the image recipe whose policy you want to retrieve.
     */

    public String getImageRecipeArn() {
        return this.imageRecipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image recipe whose policy you want to retrieve.
     * </p>
     * 
     * @param imageRecipeArn
     *        The Amazon Resource Name (ARN) of the image recipe whose policy you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImageRecipePolicyRequest withImageRecipeArn(String imageRecipeArn) {
        setImageRecipeArn(imageRecipeArn);
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
        if (getImageRecipeArn() != null)
            sb.append("ImageRecipeArn: ").append(getImageRecipeArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetImageRecipePolicyRequest == false)
            return false;
        GetImageRecipePolicyRequest other = (GetImageRecipePolicyRequest) obj;
        if (other.getImageRecipeArn() == null ^ this.getImageRecipeArn() == null)
            return false;
        if (other.getImageRecipeArn() != null && other.getImageRecipeArn().equals(this.getImageRecipeArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageRecipeArn() == null) ? 0 : getImageRecipeArn().hashCode());
        return hashCode;
    }

    @Override
    public GetImageRecipePolicyRequest clone() {
        return (GetImageRecipePolicyRequest) super.clone();
    }

}
