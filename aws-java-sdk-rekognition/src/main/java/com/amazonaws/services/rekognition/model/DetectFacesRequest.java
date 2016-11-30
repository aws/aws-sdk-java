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
public class DetectFacesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The image in which you want to detect faces. You can specify a blob or an S3 object.
     * </p>
     */
    private Image image;
    /**
     * <p>
     * A list of facial attributes you would like to be returned. By default, the API returns subset of facial
     * attributes.
     * </p>
     * <p>
     * For example, you can specify the value as, ["ALL"] or ["DEFAULT"]. If you provide both, ["ALL", "DEFAULT"], the
     * service uses a logical AND operator to determine which attributes to return (in this case, it is all attributes).
     * If you specify all attributes, Rekognition performs additional detection.
     * </p>
     */
    private java.util.List<String> attributes;

    /**
     * <p>
     * The image in which you want to detect faces. You can specify a blob or an S3 object.
     * </p>
     * 
     * @param image
     *        The image in which you want to detect faces. You can specify a blob or an S3 object.
     */

    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * <p>
     * The image in which you want to detect faces. You can specify a blob or an S3 object.
     * </p>
     * 
     * @return The image in which you want to detect faces. You can specify a blob or an S3 object.
     */

    public Image getImage() {
        return this.image;
    }

    /**
     * <p>
     * The image in which you want to detect faces. You can specify a blob or an S3 object.
     * </p>
     * 
     * @param image
     *        The image in which you want to detect faces. You can specify a blob or an S3 object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectFacesRequest withImage(Image image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * A list of facial attributes you would like to be returned. By default, the API returns subset of facial
     * attributes.
     * </p>
     * <p>
     * For example, you can specify the value as, ["ALL"] or ["DEFAULT"]. If you provide both, ["ALL", "DEFAULT"], the
     * service uses a logical AND operator to determine which attributes to return (in this case, it is all attributes).
     * If you specify all attributes, Rekognition performs additional detection.
     * </p>
     * 
     * @return A list of facial attributes you would like to be returned. By default, the API returns subset of facial
     *         attributes. </p>
     *         <p>
     *         For example, you can specify the value as, ["ALL"] or ["DEFAULT"]. If you provide both, ["ALL",
     *         "DEFAULT"], the service uses a logical AND operator to determine which attributes to return (in this
     *         case, it is all attributes). If you specify all attributes, Rekognition performs additional detection.
     * @see Attribute
     */

    public java.util.List<String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A list of facial attributes you would like to be returned. By default, the API returns subset of facial
     * attributes.
     * </p>
     * <p>
     * For example, you can specify the value as, ["ALL"] or ["DEFAULT"]. If you provide both, ["ALL", "DEFAULT"], the
     * service uses a logical AND operator to determine which attributes to return (in this case, it is all attributes).
     * If you specify all attributes, Rekognition performs additional detection.
     * </p>
     * 
     * @param attributes
     *        A list of facial attributes you would like to be returned. By default, the API returns subset of facial
     *        attributes. </p>
     *        <p>
     *        For example, you can specify the value as, ["ALL"] or ["DEFAULT"]. If you provide both, ["ALL",
     *        "DEFAULT"], the service uses a logical AND operator to determine which attributes to return (in this case,
     *        it is all attributes). If you specify all attributes, Rekognition performs additional detection.
     * @see Attribute
     */

    public void setAttributes(java.util.Collection<String> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<String>(attributes);
    }

    /**
     * <p>
     * A list of facial attributes you would like to be returned. By default, the API returns subset of facial
     * attributes.
     * </p>
     * <p>
     * For example, you can specify the value as, ["ALL"] or ["DEFAULT"]. If you provide both, ["ALL", "DEFAULT"], the
     * service uses a logical AND operator to determine which attributes to return (in this case, it is all attributes).
     * If you specify all attributes, Rekognition performs additional detection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        A list of facial attributes you would like to be returned. By default, the API returns subset of facial
     *        attributes. </p>
     *        <p>
     *        For example, you can specify the value as, ["ALL"] or ["DEFAULT"]. If you provide both, ["ALL",
     *        "DEFAULT"], the service uses a logical AND operator to determine which attributes to return (in this case,
     *        it is all attributes). If you specify all attributes, Rekognition performs additional detection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Attribute
     */

    public DetectFacesRequest withAttributes(String... attributes) {
        if (this.attributes == null) {
            setAttributes(new java.util.ArrayList<String>(attributes.length));
        }
        for (String ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of facial attributes you would like to be returned. By default, the API returns subset of facial
     * attributes.
     * </p>
     * <p>
     * For example, you can specify the value as, ["ALL"] or ["DEFAULT"]. If you provide both, ["ALL", "DEFAULT"], the
     * service uses a logical AND operator to determine which attributes to return (in this case, it is all attributes).
     * If you specify all attributes, Rekognition performs additional detection.
     * </p>
     * 
     * @param attributes
     *        A list of facial attributes you would like to be returned. By default, the API returns subset of facial
     *        attributes. </p>
     *        <p>
     *        For example, you can specify the value as, ["ALL"] or ["DEFAULT"]. If you provide both, ["ALL",
     *        "DEFAULT"], the service uses a logical AND operator to determine which attributes to return (in this case,
     *        it is all attributes). If you specify all attributes, Rekognition performs additional detection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Attribute
     */

    public DetectFacesRequest withAttributes(java.util.Collection<String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * <p>
     * A list of facial attributes you would like to be returned. By default, the API returns subset of facial
     * attributes.
     * </p>
     * <p>
     * For example, you can specify the value as, ["ALL"] or ["DEFAULT"]. If you provide both, ["ALL", "DEFAULT"], the
     * service uses a logical AND operator to determine which attributes to return (in this case, it is all attributes).
     * If you specify all attributes, Rekognition performs additional detection.
     * </p>
     * 
     * @param attributes
     *        A list of facial attributes you would like to be returned. By default, the API returns subset of facial
     *        attributes. </p>
     *        <p>
     *        For example, you can specify the value as, ["ALL"] or ["DEFAULT"]. If you provide both, ["ALL",
     *        "DEFAULT"], the service uses a logical AND operator to determine which attributes to return (in this case,
     *        it is all attributes). If you specify all attributes, Rekognition performs additional detection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Attribute
     */

    public DetectFacesRequest withAttributes(Attribute... attributes) {
        java.util.ArrayList<String> attributesCopy = new java.util.ArrayList<String>(attributes.length);
        for (Attribute value : attributes) {
            attributesCopy.add(value.toString());
        }
        if (getAttributes() == null) {
            setAttributes(attributesCopy);
        } else {
            getAttributes().addAll(attributesCopy);
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
        if (getImage() != null)
            sb.append("Image: " + getImage() + ",");
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectFacesRequest == false)
            return false;
        DetectFacesRequest other = (DetectFacesRequest) obj;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public DetectFacesRequest clone() {
        return (DetectFacesRequest) super.clone();
    }
}
