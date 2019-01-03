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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/ListCompatibleImages" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCompatibleImagesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A JSON-formatted object that describes a compatible AMI.
     * </p>
     */
    private java.util.List<CompatibleImage> compatibleImages;
    /**
     * <p>
     * Because HTTP requests are stateless, this is the starting point for your next list of returned images.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A JSON-formatted object that describes a compatible AMI.
     * </p>
     * 
     * @return A JSON-formatted object that describes a compatible AMI.
     */

    public java.util.List<CompatibleImage> getCompatibleImages() {
        return compatibleImages;
    }

    /**
     * <p>
     * A JSON-formatted object that describes a compatible AMI.
     * </p>
     * 
     * @param compatibleImages
     *        A JSON-formatted object that describes a compatible AMI.
     */

    public void setCompatibleImages(java.util.Collection<CompatibleImage> compatibleImages) {
        if (compatibleImages == null) {
            this.compatibleImages = null;
            return;
        }

        this.compatibleImages = new java.util.ArrayList<CompatibleImage>(compatibleImages);
    }

    /**
     * <p>
     * A JSON-formatted object that describes a compatible AMI.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCompatibleImages(java.util.Collection)} or {@link #withCompatibleImages(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param compatibleImages
     *        A JSON-formatted object that describes a compatible AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCompatibleImagesResult withCompatibleImages(CompatibleImage... compatibleImages) {
        if (this.compatibleImages == null) {
            setCompatibleImages(new java.util.ArrayList<CompatibleImage>(compatibleImages.length));
        }
        for (CompatibleImage ele : compatibleImages) {
            this.compatibleImages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A JSON-formatted object that describes a compatible AMI.
     * </p>
     * 
     * @param compatibleImages
     *        A JSON-formatted object that describes a compatible AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCompatibleImagesResult withCompatibleImages(java.util.Collection<CompatibleImage> compatibleImages) {
        setCompatibleImages(compatibleImages);
        return this;
    }

    /**
     * <p>
     * Because HTTP requests are stateless, this is the starting point for your next list of returned images.
     * </p>
     * 
     * @param nextToken
     *        Because HTTP requests are stateless, this is the starting point for your next list of returned images.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Because HTTP requests are stateless, this is the starting point for your next list of returned images.
     * </p>
     * 
     * @return Because HTTP requests are stateless, this is the starting point for your next list of returned images.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Because HTTP requests are stateless, this is the starting point for your next list of returned images.
     * </p>
     * 
     * @param nextToken
     *        Because HTTP requests are stateless, this is the starting point for your next list of returned images.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCompatibleImagesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getCompatibleImages() != null)
            sb.append("CompatibleImages: ").append(getCompatibleImages()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCompatibleImagesResult == false)
            return false;
        ListCompatibleImagesResult other = (ListCompatibleImagesResult) obj;
        if (other.getCompatibleImages() == null ^ this.getCompatibleImages() == null)
            return false;
        if (other.getCompatibleImages() != null && other.getCompatibleImages().equals(this.getCompatibleImages()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompatibleImages() == null) ? 0 : getCompatibleImages().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCompatibleImagesResult clone() {
        try {
            return (ListCompatibleImagesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
