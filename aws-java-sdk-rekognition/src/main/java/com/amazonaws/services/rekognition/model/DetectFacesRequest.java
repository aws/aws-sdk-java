/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class DetectFacesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
    private Image image;
    /**
     * <p>
     * An array of facial attributes you want to be returned. A <code>DEFAULT</code> subset of facial attributes -
     * <code>BoundingBox</code>, <code>Confidence</code>, <code>Pose</code>, <code>Quality</code>, and
     * <code>Landmarks</code> - will always be returned. You can request for specific facial attributes (in addition to
     * the default list) - by using [<code>"DEFAULT", "FACE_OCCLUDED"</code>] or just [<code>"FACE_OCCLUDED"</code>].
     * You can request for all facial attributes by using [<code>"ALL"]</code>. Requesting more attributes may increase
     * response time.
     * </p>
     * <p>
     * If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a logical "AND" operator to determine
     * which attributes to return (in this case, all attributes).
     * </p>
     * <p>
     * Note that while the FaceOccluded and EyeDirection attributes are supported when using <code>DetectFaces</code>,
     * they aren't supported when analyzing videos with <code>StartFaceDetection</code> and
     * <code>GetFaceDetection</code>.
     * </p>
     */
    private java.util.List<String> attributes;

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
     * @param image
     *        The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     *        operations, passing base64-encoded image bytes is not supported. </p>
     *        <p>
     *        If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes
     *        passed using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition
     *        developer guide.
     */

    public void setImage(Image image) {
        this.image = image;
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

    public Image getImage() {
        return this.image;
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
     * @param image
     *        The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     *        operations, passing base64-encoded image bytes is not supported. </p>
     *        <p>
     *        If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes
     *        passed using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition
     *        developer guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectFacesRequest withImage(Image image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * An array of facial attributes you want to be returned. A <code>DEFAULT</code> subset of facial attributes -
     * <code>BoundingBox</code>, <code>Confidence</code>, <code>Pose</code>, <code>Quality</code>, and
     * <code>Landmarks</code> - will always be returned. You can request for specific facial attributes (in addition to
     * the default list) - by using [<code>"DEFAULT", "FACE_OCCLUDED"</code>] or just [<code>"FACE_OCCLUDED"</code>].
     * You can request for all facial attributes by using [<code>"ALL"]</code>. Requesting more attributes may increase
     * response time.
     * </p>
     * <p>
     * If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a logical "AND" operator to determine
     * which attributes to return (in this case, all attributes).
     * </p>
     * <p>
     * Note that while the FaceOccluded and EyeDirection attributes are supported when using <code>DetectFaces</code>,
     * they aren't supported when analyzing videos with <code>StartFaceDetection</code> and
     * <code>GetFaceDetection</code>.
     * </p>
     * 
     * @return An array of facial attributes you want to be returned. A <code>DEFAULT</code> subset of facial attributes
     *         - <code>BoundingBox</code>, <code>Confidence</code>, <code>Pose</code>, <code>Quality</code>, and
     *         <code>Landmarks</code> - will always be returned. You can request for specific facial attributes (in
     *         addition to the default list) - by using [<code>"DEFAULT", "FACE_OCCLUDED"</code>] or just [
     *         <code>"FACE_OCCLUDED"</code>]. You can request for all facial attributes by using [<code>"ALL"]</code>.
     *         Requesting more attributes may increase response time.</p>
     *         <p>
     *         If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a logical "AND" operator to
     *         determine which attributes to return (in this case, all attributes).
     *         </p>
     *         <p>
     *         Note that while the FaceOccluded and EyeDirection attributes are supported when using
     *         <code>DetectFaces</code>, they aren't supported when analyzing videos with
     *         <code>StartFaceDetection</code> and <code>GetFaceDetection</code>.
     * @see Attribute
     */

    public java.util.List<String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * An array of facial attributes you want to be returned. A <code>DEFAULT</code> subset of facial attributes -
     * <code>BoundingBox</code>, <code>Confidence</code>, <code>Pose</code>, <code>Quality</code>, and
     * <code>Landmarks</code> - will always be returned. You can request for specific facial attributes (in addition to
     * the default list) - by using [<code>"DEFAULT", "FACE_OCCLUDED"</code>] or just [<code>"FACE_OCCLUDED"</code>].
     * You can request for all facial attributes by using [<code>"ALL"]</code>. Requesting more attributes may increase
     * response time.
     * </p>
     * <p>
     * If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a logical "AND" operator to determine
     * which attributes to return (in this case, all attributes).
     * </p>
     * <p>
     * Note that while the FaceOccluded and EyeDirection attributes are supported when using <code>DetectFaces</code>,
     * they aren't supported when analyzing videos with <code>StartFaceDetection</code> and
     * <code>GetFaceDetection</code>.
     * </p>
     * 
     * @param attributes
     *        An array of facial attributes you want to be returned. A <code>DEFAULT</code> subset of facial attributes
     *        - <code>BoundingBox</code>, <code>Confidence</code>, <code>Pose</code>, <code>Quality</code>, and
     *        <code>Landmarks</code> - will always be returned. You can request for specific facial attributes (in
     *        addition to the default list) - by using [<code>"DEFAULT", "FACE_OCCLUDED"</code>] or just [
     *        <code>"FACE_OCCLUDED"</code>]. You can request for all facial attributes by using [<code>"ALL"]</code>.
     *        Requesting more attributes may increase response time.</p>
     *        <p>
     *        If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a logical "AND" operator to
     *        determine which attributes to return (in this case, all attributes).
     *        </p>
     *        <p>
     *        Note that while the FaceOccluded and EyeDirection attributes are supported when using
     *        <code>DetectFaces</code>, they aren't supported when analyzing videos with <code>StartFaceDetection</code>
     *        and <code>GetFaceDetection</code>.
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
     * An array of facial attributes you want to be returned. A <code>DEFAULT</code> subset of facial attributes -
     * <code>BoundingBox</code>, <code>Confidence</code>, <code>Pose</code>, <code>Quality</code>, and
     * <code>Landmarks</code> - will always be returned. You can request for specific facial attributes (in addition to
     * the default list) - by using [<code>"DEFAULT", "FACE_OCCLUDED"</code>] or just [<code>"FACE_OCCLUDED"</code>].
     * You can request for all facial attributes by using [<code>"ALL"]</code>. Requesting more attributes may increase
     * response time.
     * </p>
     * <p>
     * If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a logical "AND" operator to determine
     * which attributes to return (in this case, all attributes).
     * </p>
     * <p>
     * Note that while the FaceOccluded and EyeDirection attributes are supported when using <code>DetectFaces</code>,
     * they aren't supported when analyzing videos with <code>StartFaceDetection</code> and
     * <code>GetFaceDetection</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        An array of facial attributes you want to be returned. A <code>DEFAULT</code> subset of facial attributes
     *        - <code>BoundingBox</code>, <code>Confidence</code>, <code>Pose</code>, <code>Quality</code>, and
     *        <code>Landmarks</code> - will always be returned. You can request for specific facial attributes (in
     *        addition to the default list) - by using [<code>"DEFAULT", "FACE_OCCLUDED"</code>] or just [
     *        <code>"FACE_OCCLUDED"</code>]. You can request for all facial attributes by using [<code>"ALL"]</code>.
     *        Requesting more attributes may increase response time.</p>
     *        <p>
     *        If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a logical "AND" operator to
     *        determine which attributes to return (in this case, all attributes).
     *        </p>
     *        <p>
     *        Note that while the FaceOccluded and EyeDirection attributes are supported when using
     *        <code>DetectFaces</code>, they aren't supported when analyzing videos with <code>StartFaceDetection</code>
     *        and <code>GetFaceDetection</code>.
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
     * An array of facial attributes you want to be returned. A <code>DEFAULT</code> subset of facial attributes -
     * <code>BoundingBox</code>, <code>Confidence</code>, <code>Pose</code>, <code>Quality</code>, and
     * <code>Landmarks</code> - will always be returned. You can request for specific facial attributes (in addition to
     * the default list) - by using [<code>"DEFAULT", "FACE_OCCLUDED"</code>] or just [<code>"FACE_OCCLUDED"</code>].
     * You can request for all facial attributes by using [<code>"ALL"]</code>. Requesting more attributes may increase
     * response time.
     * </p>
     * <p>
     * If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a logical "AND" operator to determine
     * which attributes to return (in this case, all attributes).
     * </p>
     * <p>
     * Note that while the FaceOccluded and EyeDirection attributes are supported when using <code>DetectFaces</code>,
     * they aren't supported when analyzing videos with <code>StartFaceDetection</code> and
     * <code>GetFaceDetection</code>.
     * </p>
     * 
     * @param attributes
     *        An array of facial attributes you want to be returned. A <code>DEFAULT</code> subset of facial attributes
     *        - <code>BoundingBox</code>, <code>Confidence</code>, <code>Pose</code>, <code>Quality</code>, and
     *        <code>Landmarks</code> - will always be returned. You can request for specific facial attributes (in
     *        addition to the default list) - by using [<code>"DEFAULT", "FACE_OCCLUDED"</code>] or just [
     *        <code>"FACE_OCCLUDED"</code>]. You can request for all facial attributes by using [<code>"ALL"]</code>.
     *        Requesting more attributes may increase response time.</p>
     *        <p>
     *        If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a logical "AND" operator to
     *        determine which attributes to return (in this case, all attributes).
     *        </p>
     *        <p>
     *        Note that while the FaceOccluded and EyeDirection attributes are supported when using
     *        <code>DetectFaces</code>, they aren't supported when analyzing videos with <code>StartFaceDetection</code>
     *        and <code>GetFaceDetection</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Attribute
     */

    public DetectFacesRequest withAttributes(java.util.Collection<String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * <p>
     * An array of facial attributes you want to be returned. A <code>DEFAULT</code> subset of facial attributes -
     * <code>BoundingBox</code>, <code>Confidence</code>, <code>Pose</code>, <code>Quality</code>, and
     * <code>Landmarks</code> - will always be returned. You can request for specific facial attributes (in addition to
     * the default list) - by using [<code>"DEFAULT", "FACE_OCCLUDED"</code>] or just [<code>"FACE_OCCLUDED"</code>].
     * You can request for all facial attributes by using [<code>"ALL"]</code>. Requesting more attributes may increase
     * response time.
     * </p>
     * <p>
     * If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a logical "AND" operator to determine
     * which attributes to return (in this case, all attributes).
     * </p>
     * <p>
     * Note that while the FaceOccluded and EyeDirection attributes are supported when using <code>DetectFaces</code>,
     * they aren't supported when analyzing videos with <code>StartFaceDetection</code> and
     * <code>GetFaceDetection</code>.
     * </p>
     * 
     * @param attributes
     *        An array of facial attributes you want to be returned. A <code>DEFAULT</code> subset of facial attributes
     *        - <code>BoundingBox</code>, <code>Confidence</code>, <code>Pose</code>, <code>Quality</code>, and
     *        <code>Landmarks</code> - will always be returned. You can request for specific facial attributes (in
     *        addition to the default list) - by using [<code>"DEFAULT", "FACE_OCCLUDED"</code>] or just [
     *        <code>"FACE_OCCLUDED"</code>]. You can request for all facial attributes by using [<code>"ALL"]</code>.
     *        Requesting more attributes may increase response time.</p>
     *        <p>
     *        If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a logical "AND" operator to
     *        determine which attributes to return (in this case, all attributes).
     *        </p>
     *        <p>
     *        Note that while the FaceOccluded and EyeDirection attributes are supported when using
     *        <code>DetectFaces</code>, they aren't supported when analyzing videos with <code>StartFaceDetection</code>
     *        and <code>GetFaceDetection</code>.
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
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
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
