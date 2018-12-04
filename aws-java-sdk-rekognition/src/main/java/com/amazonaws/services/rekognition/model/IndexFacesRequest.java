/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class IndexFacesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of an existing collection to which you want to add the faces that are detected in the input images.
     * </p>
     */
    private String collectionId;
    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     * operations, passing base64-encoded image bytes is not supported.
     * </p>
     */
    private Image image;
    /**
     * <p>
     * ID you want to assign to all the faces detected in the image.
     * </p>
     */
    private String externalImageId;
    /**
     * <p>
     * An array of facial attributes that you want to be returned. This can be the default list of attributes or all
     * attributes. If you don't specify a value for <code>Attributes</code> or if you specify <code>["DEFAULT"]</code>,
     * the API returns the following subset of facial attributes: <code>BoundingBox</code>, <code>Confidence</code>,
     * <code>Pose</code>, <code>Quality</code> and <code>Landmarks</code>. If you provide <code>["ALL"]</code>, all
     * facial attributes are returned but the operation will take longer to complete.
     * </p>
     * <p>
     * If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a logical AND operator to determine which
     * attributes to return (in this case, all attributes).
     * </p>
     */
    private java.util.List<String> detectionAttributes;

    /**
     * <p>
     * The ID of an existing collection to which you want to add the faces that are detected in the input images.
     * </p>
     * 
     * @param collectionId
     *        The ID of an existing collection to which you want to add the faces that are detected in the input images.
     */

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * <p>
     * The ID of an existing collection to which you want to add the faces that are detected in the input images.
     * </p>
     * 
     * @return The ID of an existing collection to which you want to add the faces that are detected in the input
     *         images.
     */

    public String getCollectionId() {
        return this.collectionId;
    }

    /**
     * <p>
     * The ID of an existing collection to which you want to add the faces that are detected in the input images.
     * </p>
     * 
     * @param collectionId
     *        The ID of an existing collection to which you want to add the faces that are detected in the input images.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexFacesRequest withCollectionId(String collectionId) {
        setCollectionId(collectionId);
        return this;
    }

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     * operations, passing base64-encoded image bytes is not supported.
     * </p>
     * 
     * @param image
     *        The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     *        operations, passing base64-encoded image bytes is not supported.
     */

    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     * operations, passing base64-encoded image bytes is not supported.
     * </p>
     * 
     * @return The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon
     *         Rekognition operations, passing base64-encoded image bytes is not supported.
     */

    public Image getImage() {
        return this.image;
    }

    /**
     * <p>
     * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     * operations, passing base64-encoded image bytes is not supported.
     * </p>
     * 
     * @param image
     *        The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     *        operations, passing base64-encoded image bytes is not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexFacesRequest withImage(Image image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * ID you want to assign to all the faces detected in the image.
     * </p>
     * 
     * @param externalImageId
     *        ID you want to assign to all the faces detected in the image.
     */

    public void setExternalImageId(String externalImageId) {
        this.externalImageId = externalImageId;
    }

    /**
     * <p>
     * ID you want to assign to all the faces detected in the image.
     * </p>
     * 
     * @return ID you want to assign to all the faces detected in the image.
     */

    public String getExternalImageId() {
        return this.externalImageId;
    }

    /**
     * <p>
     * ID you want to assign to all the faces detected in the image.
     * </p>
     * 
     * @param externalImageId
     *        ID you want to assign to all the faces detected in the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexFacesRequest withExternalImageId(String externalImageId) {
        setExternalImageId(externalImageId);
        return this;
    }

    /**
     * <p>
     * An array of facial attributes that you want to be returned. This can be the default list of attributes or all
     * attributes. If you don't specify a value for <code>Attributes</code> or if you specify <code>["DEFAULT"]</code>,
     * the API returns the following subset of facial attributes: <code>BoundingBox</code>, <code>Confidence</code>,
     * <code>Pose</code>, <code>Quality</code> and <code>Landmarks</code>. If you provide <code>["ALL"]</code>, all
     * facial attributes are returned but the operation will take longer to complete.
     * </p>
     * <p>
     * If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a logical AND operator to determine which
     * attributes to return (in this case, all attributes).
     * </p>
     * 
     * @return An array of facial attributes that you want to be returned. This can be the default list of attributes or
     *         all attributes. If you don't specify a value for <code>Attributes</code> or if you specify
     *         <code>["DEFAULT"]</code>, the API returns the following subset of facial attributes:
     *         <code>BoundingBox</code>, <code>Confidence</code>, <code>Pose</code>, <code>Quality</code> and
     *         <code>Landmarks</code>. If you provide <code>["ALL"]</code>, all facial attributes are returned but the
     *         operation will take longer to complete.</p>
     *         <p>
     *         If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a logical AND operator to
     *         determine which attributes to return (in this case, all attributes).
     * @see Attribute
     */

    public java.util.List<String> getDetectionAttributes() {
        return detectionAttributes;
    }

    /**
     * <p>
     * An array of facial attributes that you want to be returned. This can be the default list of attributes or all
     * attributes. If you don't specify a value for <code>Attributes</code> or if you specify <code>["DEFAULT"]</code>,
     * the API returns the following subset of facial attributes: <code>BoundingBox</code>, <code>Confidence</code>,
     * <code>Pose</code>, <code>Quality</code> and <code>Landmarks</code>. If you provide <code>["ALL"]</code>, all
     * facial attributes are returned but the operation will take longer to complete.
     * </p>
     * <p>
     * If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a logical AND operator to determine which
     * attributes to return (in this case, all attributes).
     * </p>
     * 
     * @param detectionAttributes
     *        An array of facial attributes that you want to be returned. This can be the default list of attributes or
     *        all attributes. If you don't specify a value for <code>Attributes</code> or if you specify
     *        <code>["DEFAULT"]</code>, the API returns the following subset of facial attributes:
     *        <code>BoundingBox</code>, <code>Confidence</code>, <code>Pose</code>, <code>Quality</code> and
     *        <code>Landmarks</code>. If you provide <code>["ALL"]</code>, all facial attributes are returned but the
     *        operation will take longer to complete.</p>
     *        <p>
     *        If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a logical AND operator to determine
     *        which attributes to return (in this case, all attributes).
     * @see Attribute
     */

    public void setDetectionAttributes(java.util.Collection<String> detectionAttributes) {
        if (detectionAttributes == null) {
            this.detectionAttributes = null;
            return;
        }

        this.detectionAttributes = new java.util.ArrayList<String>(detectionAttributes);
    }

    /**
     * <p>
     * An array of facial attributes that you want to be returned. This can be the default list of attributes or all
     * attributes. If you don't specify a value for <code>Attributes</code> or if you specify <code>["DEFAULT"]</code>,
     * the API returns the following subset of facial attributes: <code>BoundingBox</code>, <code>Confidence</code>,
     * <code>Pose</code>, <code>Quality</code> and <code>Landmarks</code>. If you provide <code>["ALL"]</code>, all
     * facial attributes are returned but the operation will take longer to complete.
     * </p>
     * <p>
     * If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a logical AND operator to determine which
     * attributes to return (in this case, all attributes).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDetectionAttributes(java.util.Collection)} or {@link #withDetectionAttributes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param detectionAttributes
     *        An array of facial attributes that you want to be returned. This can be the default list of attributes or
     *        all attributes. If you don't specify a value for <code>Attributes</code> or if you specify
     *        <code>["DEFAULT"]</code>, the API returns the following subset of facial attributes:
     *        <code>BoundingBox</code>, <code>Confidence</code>, <code>Pose</code>, <code>Quality</code> and
     *        <code>Landmarks</code>. If you provide <code>["ALL"]</code>, all facial attributes are returned but the
     *        operation will take longer to complete.</p>
     *        <p>
     *        If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a logical AND operator to determine
     *        which attributes to return (in this case, all attributes).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Attribute
     */

    public IndexFacesRequest withDetectionAttributes(String... detectionAttributes) {
        if (this.detectionAttributes == null) {
            setDetectionAttributes(new java.util.ArrayList<String>(detectionAttributes.length));
        }
        for (String ele : detectionAttributes) {
            this.detectionAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of facial attributes that you want to be returned. This can be the default list of attributes or all
     * attributes. If you don't specify a value for <code>Attributes</code> or if you specify <code>["DEFAULT"]</code>,
     * the API returns the following subset of facial attributes: <code>BoundingBox</code>, <code>Confidence</code>,
     * <code>Pose</code>, <code>Quality</code> and <code>Landmarks</code>. If you provide <code>["ALL"]</code>, all
     * facial attributes are returned but the operation will take longer to complete.
     * </p>
     * <p>
     * If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a logical AND operator to determine which
     * attributes to return (in this case, all attributes).
     * </p>
     * 
     * @param detectionAttributes
     *        An array of facial attributes that you want to be returned. This can be the default list of attributes or
     *        all attributes. If you don't specify a value for <code>Attributes</code> or if you specify
     *        <code>["DEFAULT"]</code>, the API returns the following subset of facial attributes:
     *        <code>BoundingBox</code>, <code>Confidence</code>, <code>Pose</code>, <code>Quality</code> and
     *        <code>Landmarks</code>. If you provide <code>["ALL"]</code>, all facial attributes are returned but the
     *        operation will take longer to complete.</p>
     *        <p>
     *        If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a logical AND operator to determine
     *        which attributes to return (in this case, all attributes).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Attribute
     */

    public IndexFacesRequest withDetectionAttributes(java.util.Collection<String> detectionAttributes) {
        setDetectionAttributes(detectionAttributes);
        return this;
    }

    /**
     * <p>
     * An array of facial attributes that you want to be returned. This can be the default list of attributes or all
     * attributes. If you don't specify a value for <code>Attributes</code> or if you specify <code>["DEFAULT"]</code>,
     * the API returns the following subset of facial attributes: <code>BoundingBox</code>, <code>Confidence</code>,
     * <code>Pose</code>, <code>Quality</code> and <code>Landmarks</code>. If you provide <code>["ALL"]</code>, all
     * facial attributes are returned but the operation will take longer to complete.
     * </p>
     * <p>
     * If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a logical AND operator to determine which
     * attributes to return (in this case, all attributes).
     * </p>
     * 
     * @param detectionAttributes
     *        An array of facial attributes that you want to be returned. This can be the default list of attributes or
     *        all attributes. If you don't specify a value for <code>Attributes</code> or if you specify
     *        <code>["DEFAULT"]</code>, the API returns the following subset of facial attributes:
     *        <code>BoundingBox</code>, <code>Confidence</code>, <code>Pose</code>, <code>Quality</code> and
     *        <code>Landmarks</code>. If you provide <code>["ALL"]</code>, all facial attributes are returned but the
     *        operation will take longer to complete.</p>
     *        <p>
     *        If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a logical AND operator to determine
     *        which attributes to return (in this case, all attributes).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Attribute
     */

    public IndexFacesRequest withDetectionAttributes(Attribute... detectionAttributes) {
        java.util.ArrayList<String> detectionAttributesCopy = new java.util.ArrayList<String>(detectionAttributes.length);
        for (Attribute value : detectionAttributes) {
            detectionAttributesCopy.add(value.toString());
        }
        if (getDetectionAttributes() == null) {
            setDetectionAttributes(detectionAttributesCopy);
        } else {
            getDetectionAttributes().addAll(detectionAttributesCopy);
        }
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
        if (getCollectionId() != null)
            sb.append("CollectionId: ").append(getCollectionId()).append(",");
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getExternalImageId() != null)
            sb.append("ExternalImageId: ").append(getExternalImageId()).append(",");
        if (getDetectionAttributes() != null)
            sb.append("DetectionAttributes: ").append(getDetectionAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IndexFacesRequest == false)
            return false;
        IndexFacesRequest other = (IndexFacesRequest) obj;
        if (other.getCollectionId() == null ^ this.getCollectionId() == null)
            return false;
        if (other.getCollectionId() != null && other.getCollectionId().equals(this.getCollectionId()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getExternalImageId() == null ^ this.getExternalImageId() == null)
            return false;
        if (other.getExternalImageId() != null && other.getExternalImageId().equals(this.getExternalImageId()) == false)
            return false;
        if (other.getDetectionAttributes() == null ^ this.getDetectionAttributes() == null)
            return false;
        if (other.getDetectionAttributes() != null && other.getDetectionAttributes().equals(this.getDetectionAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectionId() == null) ? 0 : getCollectionId().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getExternalImageId() == null) ? 0 : getExternalImageId().hashCode());
        hashCode = prime * hashCode + ((getDetectionAttributes() == null) ? 0 : getDetectionAttributes().hashCode());
        return hashCode;
    }

    @Override
    public IndexFacesRequest clone() {
        return (IndexFacesRequest) super.clone();
    }

}
