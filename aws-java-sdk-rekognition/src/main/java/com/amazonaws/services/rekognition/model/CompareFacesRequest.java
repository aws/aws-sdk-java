/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class CompareFacesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Source image either as bytes or an Amazon S3 object
     * </p>
     */
    private Image sourceImage;
    /**
     * <p>
     * Target image either as bytes or an Amazon S3 object
     * </p>
     */
    private Image targetImage;
    /**
     * <p>
     * The minimum level of confidence in the match you want included in the result.
     * </p>
     */
    private Float similarityThreshold;

    /**
     * <p>
     * Source image either as bytes or an Amazon S3 object
     * </p>
     * 
     * @param sourceImage
     *        Source image either as bytes or an Amazon S3 object
     */

    public void setSourceImage(Image sourceImage) {
        this.sourceImage = sourceImage;
    }

    /**
     * <p>
     * Source image either as bytes or an Amazon S3 object
     * </p>
     * 
     * @return Source image either as bytes or an Amazon S3 object
     */

    public Image getSourceImage() {
        return this.sourceImage;
    }

    /**
     * <p>
     * Source image either as bytes or an Amazon S3 object
     * </p>
     * 
     * @param sourceImage
     *        Source image either as bytes or an Amazon S3 object
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompareFacesRequest withSourceImage(Image sourceImage) {
        setSourceImage(sourceImage);
        return this;
    }

    /**
     * <p>
     * Target image either as bytes or an Amazon S3 object
     * </p>
     * 
     * @param targetImage
     *        Target image either as bytes or an Amazon S3 object
     */

    public void setTargetImage(Image targetImage) {
        this.targetImage = targetImage;
    }

    /**
     * <p>
     * Target image either as bytes or an Amazon S3 object
     * </p>
     * 
     * @return Target image either as bytes or an Amazon S3 object
     */

    public Image getTargetImage() {
        return this.targetImage;
    }

    /**
     * <p>
     * Target image either as bytes or an Amazon S3 object
     * </p>
     * 
     * @param targetImage
     *        Target image either as bytes or an Amazon S3 object
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompareFacesRequest withTargetImage(Image targetImage) {
        setTargetImage(targetImage);
        return this;
    }

    /**
     * <p>
     * The minimum level of confidence in the match you want included in the result.
     * </p>
     * 
     * @param similarityThreshold
     *        The minimum level of confidence in the match you want included in the result.
     */

    public void setSimilarityThreshold(Float similarityThreshold) {
        this.similarityThreshold = similarityThreshold;
    }

    /**
     * <p>
     * The minimum level of confidence in the match you want included in the result.
     * </p>
     * 
     * @return The minimum level of confidence in the match you want included in the result.
     */

    public Float getSimilarityThreshold() {
        return this.similarityThreshold;
    }

    /**
     * <p>
     * The minimum level of confidence in the match you want included in the result.
     * </p>
     * 
     * @param similarityThreshold
     *        The minimum level of confidence in the match you want included in the result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompareFacesRequest withSimilarityThreshold(Float similarityThreshold) {
        setSimilarityThreshold(similarityThreshold);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSourceImage() != null)
            sb.append("SourceImage: " + getSourceImage() + ",");
        if (getTargetImage() != null)
            sb.append("TargetImage: " + getTargetImage() + ",");
        if (getSimilarityThreshold() != null)
            sb.append("SimilarityThreshold: " + getSimilarityThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompareFacesRequest == false)
            return false;
        CompareFacesRequest other = (CompareFacesRequest) obj;
        if (other.getSourceImage() == null ^ this.getSourceImage() == null)
            return false;
        if (other.getSourceImage() != null && other.getSourceImage().equals(this.getSourceImage()) == false)
            return false;
        if (other.getTargetImage() == null ^ this.getTargetImage() == null)
            return false;
        if (other.getTargetImage() != null && other.getTargetImage().equals(this.getTargetImage()) == false)
            return false;
        if (other.getSimilarityThreshold() == null ^ this.getSimilarityThreshold() == null)
            return false;
        if (other.getSimilarityThreshold() != null && other.getSimilarityThreshold().equals(this.getSimilarityThreshold()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceImage() == null) ? 0 : getSourceImage().hashCode());
        hashCode = prime * hashCode + ((getTargetImage() == null) ? 0 : getTargetImage().hashCode());
        hashCode = prime * hashCode + ((getSimilarityThreshold() == null) ? 0 : getSimilarityThreshold().hashCode());
        return hashCode;
    }

    @Override
    public CompareFacesRequest clone() {
        return (CompareFacesRequest) super.clone();
    }
}
