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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFpgaImagesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about one or more FPGA images.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<FpgaImage> fpgaImages;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about one or more FPGA images.
     * </p>
     * 
     * @return Information about one or more FPGA images.
     */

    public java.util.List<FpgaImage> getFpgaImages() {
        if (fpgaImages == null) {
            fpgaImages = new com.amazonaws.internal.SdkInternalList<FpgaImage>();
        }
        return fpgaImages;
    }

    /**
     * <p>
     * Information about one or more FPGA images.
     * </p>
     * 
     * @param fpgaImages
     *        Information about one or more FPGA images.
     */

    public void setFpgaImages(java.util.Collection<FpgaImage> fpgaImages) {
        if (fpgaImages == null) {
            this.fpgaImages = null;
            return;
        }

        this.fpgaImages = new com.amazonaws.internal.SdkInternalList<FpgaImage>(fpgaImages);
    }

    /**
     * <p>
     * Information about one or more FPGA images.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFpgaImages(java.util.Collection)} or {@link #withFpgaImages(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param fpgaImages
     *        Information about one or more FPGA images.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFpgaImagesResult withFpgaImages(FpgaImage... fpgaImages) {
        if (this.fpgaImages == null) {
            setFpgaImages(new com.amazonaws.internal.SdkInternalList<FpgaImage>(fpgaImages.length));
        }
        for (FpgaImage ele : fpgaImages) {
            this.fpgaImages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about one or more FPGA images.
     * </p>
     * 
     * @param fpgaImages
     *        Information about one or more FPGA images.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFpgaImagesResult withFpgaImages(java.util.Collection<FpgaImage> fpgaImages) {
        setFpgaImages(fpgaImages);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFpgaImagesResult withNextToken(String nextToken) {
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
        if (getFpgaImages() != null)
            sb.append("FpgaImages: ").append(getFpgaImages()).append(",");
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

        if (obj instanceof DescribeFpgaImagesResult == false)
            return false;
        DescribeFpgaImagesResult other = (DescribeFpgaImagesResult) obj;
        if (other.getFpgaImages() == null ^ this.getFpgaImages() == null)
            return false;
        if (other.getFpgaImages() != null && other.getFpgaImages().equals(this.getFpgaImages()) == false)
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

        hashCode = prime * hashCode + ((getFpgaImages() == null) ? 0 : getFpgaImages().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFpgaImagesResult clone() {
        try {
            return (DescribeFpgaImagesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
