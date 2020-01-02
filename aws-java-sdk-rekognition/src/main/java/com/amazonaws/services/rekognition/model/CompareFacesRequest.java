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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompareFacesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     * operations, passing base64-encoded image bytes is not supported.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed
     * using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition developer guide.
     * </p>
     */
    private Image sourceImage;
    /**
     * <p>
     * The target image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     * operations, passing base64-encoded image bytes is not supported.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed
     * using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition developer guide.
     * </p>
     */
    private Image targetImage;
    /**
     * <p>
     * The minimum level of confidence in the face matches that a match must meet to be included in the
     * <code>FaceMatches</code> array.
     * </p>
     */
    private Float similarityThreshold;
    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces aren't
     * compared. If you specify <code>AUTO</code>, Amazon Rekognition chooses the quality bar. If you specify
     * <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>, filtering removes all faces that don’t meet the
     * chosen quality bar. The quality bar is based on a variety of common use cases. Low-quality detections can occur
     * for a number of reasons. Some examples are an object that's misidentified as a face, a face that's too blurry, or
     * a face with a pose that's too extreme to use. If you specify <code>NONE</code>, no filtering is performed. The
     * default value is <code>NONE</code>.
     * </p>
     * <p>
     * To use quality filtering, the collection you are using must be associated with version 3 of the face model or
     * higher.
     * </p>
     */
    private String qualityFilter;

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     * operations, passing base64-encoded image bytes is not supported.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed
     * using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition developer guide.
     * </p>
     * 
     * @param sourceImage
     *        The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     *        operations, passing base64-encoded image bytes is not supported. </p>
     *        <p>
     *        If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes
     *        passed using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition
     *        developer guide.
     */

    public void setSourceImage(Image sourceImage) {
        this.sourceImage = sourceImage;
    }

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     * operations, passing base64-encoded image bytes is not supported.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed
     * using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition developer guide.
     * </p>
     * 
     * @return The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon
     *         Rekognition operations, passing base64-encoded image bytes is not supported. </p>
     *         <p>
     *         If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes
     *         passed using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition
     *         developer guide.
     */

    public Image getSourceImage() {
        return this.sourceImage;
    }

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     * operations, passing base64-encoded image bytes is not supported.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed
     * using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition developer guide.
     * </p>
     * 
     * @param sourceImage
     *        The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     *        operations, passing base64-encoded image bytes is not supported. </p>
     *        <p>
     *        If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes
     *        passed using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition
     *        developer guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompareFacesRequest withSourceImage(Image sourceImage) {
        setSourceImage(sourceImage);
        return this;
    }

    /**
     * <p>
     * The target image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     * operations, passing base64-encoded image bytes is not supported.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed
     * using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition developer guide.
     * </p>
     * 
     * @param targetImage
     *        The target image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon
     *        Rekognition operations, passing base64-encoded image bytes is not supported. </p>
     *        <p>
     *        If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes
     *        passed using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition
     *        developer guide.
     */

    public void setTargetImage(Image targetImage) {
        this.targetImage = targetImage;
    }

    /**
     * <p>
     * The target image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     * operations, passing base64-encoded image bytes is not supported.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed
     * using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition developer guide.
     * </p>
     * 
     * @return The target image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon
     *         Rekognition operations, passing base64-encoded image bytes is not supported. </p>
     *         <p>
     *         If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes
     *         passed using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition
     *         developer guide.
     */

    public Image getTargetImage() {
        return this.targetImage;
    }

    /**
     * <p>
     * The target image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     * operations, passing base64-encoded image bytes is not supported.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed
     * using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition developer guide.
     * </p>
     * 
     * @param targetImage
     *        The target image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon
     *        Rekognition operations, passing base64-encoded image bytes is not supported. </p>
     *        <p>
     *        If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes
     *        passed using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition
     *        developer guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompareFacesRequest withTargetImage(Image targetImage) {
        setTargetImage(targetImage);
        return this;
    }

    /**
     * <p>
     * The minimum level of confidence in the face matches that a match must meet to be included in the
     * <code>FaceMatches</code> array.
     * </p>
     * 
     * @param similarityThreshold
     *        The minimum level of confidence in the face matches that a match must meet to be included in the
     *        <code>FaceMatches</code> array.
     */

    public void setSimilarityThreshold(Float similarityThreshold) {
        this.similarityThreshold = similarityThreshold;
    }

    /**
     * <p>
     * The minimum level of confidence in the face matches that a match must meet to be included in the
     * <code>FaceMatches</code> array.
     * </p>
     * 
     * @return The minimum level of confidence in the face matches that a match must meet to be included in the
     *         <code>FaceMatches</code> array.
     */

    public Float getSimilarityThreshold() {
        return this.similarityThreshold;
    }

    /**
     * <p>
     * The minimum level of confidence in the face matches that a match must meet to be included in the
     * <code>FaceMatches</code> array.
     * </p>
     * 
     * @param similarityThreshold
     *        The minimum level of confidence in the face matches that a match must meet to be included in the
     *        <code>FaceMatches</code> array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CompareFacesRequest withSimilarityThreshold(Float similarityThreshold) {
        setSimilarityThreshold(similarityThreshold);
        return this;
    }

    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces aren't
     * compared. If you specify <code>AUTO</code>, Amazon Rekognition chooses the quality bar. If you specify
     * <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>, filtering removes all faces that don’t meet the
     * chosen quality bar. The quality bar is based on a variety of common use cases. Low-quality detections can occur
     * for a number of reasons. Some examples are an object that's misidentified as a face, a face that's too blurry, or
     * a face with a pose that's too extreme to use. If you specify <code>NONE</code>, no filtering is performed. The
     * default value is <code>NONE</code>.
     * </p>
     * <p>
     * To use quality filtering, the collection you are using must be associated with version 3 of the face model or
     * higher.
     * </p>
     * 
     * @param qualityFilter
     *        A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces
     *        aren't compared. If you specify <code>AUTO</code>, Amazon Rekognition chooses the quality bar. If you
     *        specify <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>, filtering removes all faces that
     *        don’t meet the chosen quality bar. The quality bar is based on a variety of common use cases. Low-quality
     *        detections can occur for a number of reasons. Some examples are an object that's misidentified as a face,
     *        a face that's too blurry, or a face with a pose that's too extreme to use. If you specify
     *        <code>NONE</code>, no filtering is performed. The default value is <code>NONE</code>. </p>
     *        <p>
     *        To use quality filtering, the collection you are using must be associated with version 3 of the face model
     *        or higher.
     * @see QualityFilter
     */

    public void setQualityFilter(String qualityFilter) {
        this.qualityFilter = qualityFilter;
    }

    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces aren't
     * compared. If you specify <code>AUTO</code>, Amazon Rekognition chooses the quality bar. If you specify
     * <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>, filtering removes all faces that don’t meet the
     * chosen quality bar. The quality bar is based on a variety of common use cases. Low-quality detections can occur
     * for a number of reasons. Some examples are an object that's misidentified as a face, a face that's too blurry, or
     * a face with a pose that's too extreme to use. If you specify <code>NONE</code>, no filtering is performed. The
     * default value is <code>NONE</code>.
     * </p>
     * <p>
     * To use quality filtering, the collection you are using must be associated with version 3 of the face model or
     * higher.
     * </p>
     * 
     * @return A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces
     *         aren't compared. If you specify <code>AUTO</code>, Amazon Rekognition chooses the quality bar. If you
     *         specify <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>, filtering removes all faces that
     *         don’t meet the chosen quality bar. The quality bar is based on a variety of common use cases. Low-quality
     *         detections can occur for a number of reasons. Some examples are an object that's misidentified as a face,
     *         a face that's too blurry, or a face with a pose that's too extreme to use. If you specify
     *         <code>NONE</code>, no filtering is performed. The default value is <code>NONE</code>. </p>
     *         <p>
     *         To use quality filtering, the collection you are using must be associated with version 3 of the face
     *         model or higher.
     * @see QualityFilter
     */

    public String getQualityFilter() {
        return this.qualityFilter;
    }

    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces aren't
     * compared. If you specify <code>AUTO</code>, Amazon Rekognition chooses the quality bar. If you specify
     * <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>, filtering removes all faces that don’t meet the
     * chosen quality bar. The quality bar is based on a variety of common use cases. Low-quality detections can occur
     * for a number of reasons. Some examples are an object that's misidentified as a face, a face that's too blurry, or
     * a face with a pose that's too extreme to use. If you specify <code>NONE</code>, no filtering is performed. The
     * default value is <code>NONE</code>.
     * </p>
     * <p>
     * To use quality filtering, the collection you are using must be associated with version 3 of the face model or
     * higher.
     * </p>
     * 
     * @param qualityFilter
     *        A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces
     *        aren't compared. If you specify <code>AUTO</code>, Amazon Rekognition chooses the quality bar. If you
     *        specify <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>, filtering removes all faces that
     *        don’t meet the chosen quality bar. The quality bar is based on a variety of common use cases. Low-quality
     *        detections can occur for a number of reasons. Some examples are an object that's misidentified as a face,
     *        a face that's too blurry, or a face with a pose that's too extreme to use. If you specify
     *        <code>NONE</code>, no filtering is performed. The default value is <code>NONE</code>. </p>
     *        <p>
     *        To use quality filtering, the collection you are using must be associated with version 3 of the face model
     *        or higher.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QualityFilter
     */

    public CompareFacesRequest withQualityFilter(String qualityFilter) {
        setQualityFilter(qualityFilter);
        return this;
    }

    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces aren't
     * compared. If you specify <code>AUTO</code>, Amazon Rekognition chooses the quality bar. If you specify
     * <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>, filtering removes all faces that don’t meet the
     * chosen quality bar. The quality bar is based on a variety of common use cases. Low-quality detections can occur
     * for a number of reasons. Some examples are an object that's misidentified as a face, a face that's too blurry, or
     * a face with a pose that's too extreme to use. If you specify <code>NONE</code>, no filtering is performed. The
     * default value is <code>NONE</code>.
     * </p>
     * <p>
     * To use quality filtering, the collection you are using must be associated with version 3 of the face model or
     * higher.
     * </p>
     * 
     * @param qualityFilter
     *        A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces
     *        aren't compared. If you specify <code>AUTO</code>, Amazon Rekognition chooses the quality bar. If you
     *        specify <code>LOW</code>, <code>MEDIUM</code>, or <code>HIGH</code>, filtering removes all faces that
     *        don’t meet the chosen quality bar. The quality bar is based on a variety of common use cases. Low-quality
     *        detections can occur for a number of reasons. Some examples are an object that's misidentified as a face,
     *        a face that's too blurry, or a face with a pose that's too extreme to use. If you specify
     *        <code>NONE</code>, no filtering is performed. The default value is <code>NONE</code>. </p>
     *        <p>
     *        To use quality filtering, the collection you are using must be associated with version 3 of the face model
     *        or higher.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QualityFilter
     */

    public CompareFacesRequest withQualityFilter(QualityFilter qualityFilter) {
        this.qualityFilter = qualityFilter.toString();
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
        if (getSourceImage() != null)
            sb.append("SourceImage: ").append(getSourceImage()).append(",");
        if (getTargetImage() != null)
            sb.append("TargetImage: ").append(getTargetImage()).append(",");
        if (getSimilarityThreshold() != null)
            sb.append("SimilarityThreshold: ").append(getSimilarityThreshold()).append(",");
        if (getQualityFilter() != null)
            sb.append("QualityFilter: ").append(getQualityFilter());
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
        if (other.getQualityFilter() == null ^ this.getQualityFilter() == null)
            return false;
        if (other.getQualityFilter() != null && other.getQualityFilter().equals(this.getQualityFilter()) == false)
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
        hashCode = prime * hashCode + ((getQualityFilter() == null) ? 0 : getQualityFilter().hashCode());
        return hashCode;
    }

    @Override
    public CompareFacesRequest clone() {
        return (CompareFacesRequest) super.clone();
    }

}
