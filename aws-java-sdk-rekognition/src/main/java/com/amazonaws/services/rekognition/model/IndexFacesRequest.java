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
public class IndexFacesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ID of an existing collection to which you want to add the faces that are detected in the input images.
     * </p>
     */
    private String collectionId;

    private Image image;
    /**
     * <p>
     * ID you want to assign to all the faces detected in the image.
     * </p>
     */
    private String externalImageId;
    /**
     * <p>
     * (Optional) Returns detailed attributes of indexed faces. By default, the operation returns a subset of the facial
     * attributes.
     * </p>
     * <p>
     * For example, you can specify the value as, ["ALL"] or ["DEFAULT"]. If you provide both, ["ALL", "DEFAULT"],
     * Rekognition uses the logical AND operator to determine which attributes to return (in this case, it is all
     * attributes). If you specify all attributes, the service performs additional detection, in addition to the
     * default.
     * </p>
     */
    private java.util.List<String> detectionAttributes;

    /**
     * <p>
     * ID of an existing collection to which you want to add the faces that are detected in the input images.
     * </p>
     * 
     * @param collectionId
     *        ID of an existing collection to which you want to add the faces that are detected in the input images.
     */

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * <p>
     * ID of an existing collection to which you want to add the faces that are detected in the input images.
     * </p>
     * 
     * @return ID of an existing collection to which you want to add the faces that are detected in the input images.
     */

    public String getCollectionId() {
        return this.collectionId;
    }

    /**
     * <p>
     * ID of an existing collection to which you want to add the faces that are detected in the input images.
     * </p>
     * 
     * @param collectionId
     *        ID of an existing collection to which you want to add the faces that are detected in the input images.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexFacesRequest withCollectionId(String collectionId) {
        setCollectionId(collectionId);
        return this;
    }

    /**
     * @param image
     */

    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * @return
     */

    public Image getImage() {
        return this.image;
    }

    /**
     * @param image
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
     * (Optional) Returns detailed attributes of indexed faces. By default, the operation returns a subset of the facial
     * attributes.
     * </p>
     * <p>
     * For example, you can specify the value as, ["ALL"] or ["DEFAULT"]. If you provide both, ["ALL", "DEFAULT"],
     * Rekognition uses the logical AND operator to determine which attributes to return (in this case, it is all
     * attributes). If you specify all attributes, the service performs additional detection, in addition to the
     * default.
     * </p>
     * 
     * @return (Optional) Returns detailed attributes of indexed faces. By default, the operation returns a subset of
     *         the facial attributes. </p>
     *         <p>
     *         For example, you can specify the value as, ["ALL"] or ["DEFAULT"]. If you provide both, ["ALL",
     *         "DEFAULT"], Rekognition uses the logical AND operator to determine which attributes to return (in this
     *         case, it is all attributes). If you specify all attributes, the service performs additional detection, in
     *         addition to the default.
     * @see Attribute
     */

    public java.util.List<String> getDetectionAttributes() {
        return detectionAttributes;
    }

    /**
     * <p>
     * (Optional) Returns detailed attributes of indexed faces. By default, the operation returns a subset of the facial
     * attributes.
     * </p>
     * <p>
     * For example, you can specify the value as, ["ALL"] or ["DEFAULT"]. If you provide both, ["ALL", "DEFAULT"],
     * Rekognition uses the logical AND operator to determine which attributes to return (in this case, it is all
     * attributes). If you specify all attributes, the service performs additional detection, in addition to the
     * default.
     * </p>
     * 
     * @param detectionAttributes
     *        (Optional) Returns detailed attributes of indexed faces. By default, the operation returns a subset of the
     *        facial attributes. </p>
     *        <p>
     *        For example, you can specify the value as, ["ALL"] or ["DEFAULT"]. If you provide both, ["ALL",
     *        "DEFAULT"], Rekognition uses the logical AND operator to determine which attributes to return (in this
     *        case, it is all attributes). If you specify all attributes, the service performs additional detection, in
     *        addition to the default.
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
     * (Optional) Returns detailed attributes of indexed faces. By default, the operation returns a subset of the facial
     * attributes.
     * </p>
     * <p>
     * For example, you can specify the value as, ["ALL"] or ["DEFAULT"]. If you provide both, ["ALL", "DEFAULT"],
     * Rekognition uses the logical AND operator to determine which attributes to return (in this case, it is all
     * attributes). If you specify all attributes, the service performs additional detection, in addition to the
     * default.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDetectionAttributes(java.util.Collection)} or {@link #withDetectionAttributes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param detectionAttributes
     *        (Optional) Returns detailed attributes of indexed faces. By default, the operation returns a subset of the
     *        facial attributes. </p>
     *        <p>
     *        For example, you can specify the value as, ["ALL"] or ["DEFAULT"]. If you provide both, ["ALL",
     *        "DEFAULT"], Rekognition uses the logical AND operator to determine which attributes to return (in this
     *        case, it is all attributes). If you specify all attributes, the service performs additional detection, in
     *        addition to the default.
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
     * (Optional) Returns detailed attributes of indexed faces. By default, the operation returns a subset of the facial
     * attributes.
     * </p>
     * <p>
     * For example, you can specify the value as, ["ALL"] or ["DEFAULT"]. If you provide both, ["ALL", "DEFAULT"],
     * Rekognition uses the logical AND operator to determine which attributes to return (in this case, it is all
     * attributes). If you specify all attributes, the service performs additional detection, in addition to the
     * default.
     * </p>
     * 
     * @param detectionAttributes
     *        (Optional) Returns detailed attributes of indexed faces. By default, the operation returns a subset of the
     *        facial attributes. </p>
     *        <p>
     *        For example, you can specify the value as, ["ALL"] or ["DEFAULT"]. If you provide both, ["ALL",
     *        "DEFAULT"], Rekognition uses the logical AND operator to determine which attributes to return (in this
     *        case, it is all attributes). If you specify all attributes, the service performs additional detection, in
     *        addition to the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Attribute
     */

    public IndexFacesRequest withDetectionAttributes(java.util.Collection<String> detectionAttributes) {
        setDetectionAttributes(detectionAttributes);
        return this;
    }

    /**
     * <p>
     * (Optional) Returns detailed attributes of indexed faces. By default, the operation returns a subset of the facial
     * attributes.
     * </p>
     * <p>
     * For example, you can specify the value as, ["ALL"] or ["DEFAULT"]. If you provide both, ["ALL", "DEFAULT"],
     * Rekognition uses the logical AND operator to determine which attributes to return (in this case, it is all
     * attributes). If you specify all attributes, the service performs additional detection, in addition to the
     * default.
     * </p>
     * 
     * @param detectionAttributes
     *        (Optional) Returns detailed attributes of indexed faces. By default, the operation returns a subset of the
     *        facial attributes. </p>
     *        <p>
     *        For example, you can specify the value as, ["ALL"] or ["DEFAULT"]. If you provide both, ["ALL",
     *        "DEFAULT"], Rekognition uses the logical AND operator to determine which attributes to return (in this
     *        case, it is all attributes). If you specify all attributes, the service performs additional detection, in
     *        addition to the default.
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
            sb.append("CollectionId: " + getCollectionId() + ",");
        if (getImage() != null)
            sb.append("Image: " + getImage() + ",");
        if (getExternalImageId() != null)
            sb.append("ExternalImageId: " + getExternalImageId() + ",");
        if (getDetectionAttributes() != null)
            sb.append("DetectionAttributes: " + getDetectionAttributes());
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
