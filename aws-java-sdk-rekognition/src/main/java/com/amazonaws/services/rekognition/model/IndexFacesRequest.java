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
     * operations, passing base64-encoded image bytes isn't supported.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed
     * using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition developer guide.
     * </p>
     */
    private Image image;
    /**
     * <p>
     * The ID you want to assign to all the faces detected in the image.
     * </p>
     */
    private String externalImageId;
    /**
     * <p>
     * An array of facial attributes that you want to be returned. This can be the default list of attributes or all
     * attributes. If you don't specify a value for <code>Attributes</code> or if you specify <code>["DEFAULT"]</code>,
     * the API returns the following subset of facial attributes: <code>BoundingBox</code>, <code>Confidence</code>,
     * <code>Pose</code>, <code>Quality</code>, and <code>Landmarks</code>. If you provide <code>["ALL"]</code>, all
     * facial attributes are returned, but the operation takes longer to complete.
     * </p>
     * <p>
     * If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a logical AND operator to determine which
     * attributes to return (in this case, all attributes).
     * </p>
     */
    private java.util.List<String> detectionAttributes;
    /**
     * <p>
     * The maximum number of faces to index. The value of <code>MaxFaces</code> must be greater than or equal to 1.
     * <code>IndexFaces</code> returns no more than 100 detected faces in an image, even if you specify a larger value
     * for <code>MaxFaces</code>.
     * </p>
     * <p>
     * If <code>IndexFaces</code> detects more faces than the value of <code>MaxFaces</code>, the faces with the lowest
     * quality are filtered out first. If there are still more faces than the value of <code>MaxFaces</code>, the faces
     * with the smallest bounding boxes are filtered out (up to the number that's needed to satisfy the value of
     * <code>MaxFaces</code>). Information about the unindexed faces is available in the <code>UnindexedFaces</code>
     * array.
     * </p>
     * <p>
     * The faces that are returned by <code>IndexFaces</code> are sorted by the largest face bounding box size to the
     * smallest size, in descending order.
     * </p>
     * <p>
     * <code>MaxFaces</code> can be used with a collection associated with any version of the face model.
     * </p>
     */
    private Integer maxFaces;
    /**
     * <p>
     * A filter that specifies how much filtering is done to identify faces that are detected with low quality. Filtered
     * faces aren't indexed. If you specify <code>AUTO</code>, filtering prioritizes the identification of faces that
     * don’t meet the required quality bar chosen by Amazon Rekognition. The quality bar is based on a variety of common
     * use cases. Low-quality detections can occur for a number of reasons. Some examples are an object that's
     * misidentified as a face, a face that's too blurry, or a face with a pose that's too extreme to use. If you
     * specify <code>NONE</code>, no filtering is performed. The default value is AUTO.
     * </p>
     * <p>
     * To use quality filtering, the collection you are using must be associated with version 3 of the face model.
     * </p>
     */
    private String qualityFilter;

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
     * operations, passing base64-encoded image bytes isn't supported.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed
     * using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition developer guide.
     * </p>
     * 
     * @param image
     *        The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     *        operations, passing base64-encoded image bytes isn't supported. </p>
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
     * operations, passing base64-encoded image bytes isn't supported.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed
     * using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition developer guide.
     * </p>
     * 
     * @return The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon
     *         Rekognition operations, passing base64-encoded image bytes isn't supported. </p>
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
     * operations, passing base64-encoded image bytes isn't supported.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed
     * using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition developer guide.
     * </p>
     * 
     * @param image
     *        The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition
     *        operations, passing base64-encoded image bytes isn't supported. </p>
     *        <p>
     *        If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes
     *        passed using the <code>Bytes</code> field. For more information, see Images in the Amazon Rekognition
     *        developer guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexFacesRequest withImage(Image image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * The ID you want to assign to all the faces detected in the image.
     * </p>
     * 
     * @param externalImageId
     *        The ID you want to assign to all the faces detected in the image.
     */

    public void setExternalImageId(String externalImageId) {
        this.externalImageId = externalImageId;
    }

    /**
     * <p>
     * The ID you want to assign to all the faces detected in the image.
     * </p>
     * 
     * @return The ID you want to assign to all the faces detected in the image.
     */

    public String getExternalImageId() {
        return this.externalImageId;
    }

    /**
     * <p>
     * The ID you want to assign to all the faces detected in the image.
     * </p>
     * 
     * @param externalImageId
     *        The ID you want to assign to all the faces detected in the image.
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
     * <code>Pose</code>, <code>Quality</code>, and <code>Landmarks</code>. If you provide <code>["ALL"]</code>, all
     * facial attributes are returned, but the operation takes longer to complete.
     * </p>
     * <p>
     * If you provide both, <code>["ALL", "DEFAULT"]</code>, the service uses a logical AND operator to determine which
     * attributes to return (in this case, all attributes).
     * </p>
     * 
     * @return An array of facial attributes that you want to be returned. This can be the default list of attributes or
     *         all attributes. If you don't specify a value for <code>Attributes</code> or if you specify
     *         <code>["DEFAULT"]</code>, the API returns the following subset of facial attributes:
     *         <code>BoundingBox</code>, <code>Confidence</code>, <code>Pose</code>, <code>Quality</code>, and
     *         <code>Landmarks</code>. If you provide <code>["ALL"]</code>, all facial attributes are returned, but the
     *         operation takes longer to complete.</p>
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
     * <code>Pose</code>, <code>Quality</code>, and <code>Landmarks</code>. If you provide <code>["ALL"]</code>, all
     * facial attributes are returned, but the operation takes longer to complete.
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
     *        <code>BoundingBox</code>, <code>Confidence</code>, <code>Pose</code>, <code>Quality</code>, and
     *        <code>Landmarks</code>. If you provide <code>["ALL"]</code>, all facial attributes are returned, but the
     *        operation takes longer to complete.</p>
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
     * <code>Pose</code>, <code>Quality</code>, and <code>Landmarks</code>. If you provide <code>["ALL"]</code>, all
     * facial attributes are returned, but the operation takes longer to complete.
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
     *        <code>BoundingBox</code>, <code>Confidence</code>, <code>Pose</code>, <code>Quality</code>, and
     *        <code>Landmarks</code>. If you provide <code>["ALL"]</code>, all facial attributes are returned, but the
     *        operation takes longer to complete.</p>
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
     * <code>Pose</code>, <code>Quality</code>, and <code>Landmarks</code>. If you provide <code>["ALL"]</code>, all
     * facial attributes are returned, but the operation takes longer to complete.
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
     *        <code>BoundingBox</code>, <code>Confidence</code>, <code>Pose</code>, <code>Quality</code>, and
     *        <code>Landmarks</code>. If you provide <code>["ALL"]</code>, all facial attributes are returned, but the
     *        operation takes longer to complete.</p>
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
     * <code>Pose</code>, <code>Quality</code>, and <code>Landmarks</code>. If you provide <code>["ALL"]</code>, all
     * facial attributes are returned, but the operation takes longer to complete.
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
     *        <code>BoundingBox</code>, <code>Confidence</code>, <code>Pose</code>, <code>Quality</code>, and
     *        <code>Landmarks</code>. If you provide <code>["ALL"]</code>, all facial attributes are returned, but the
     *        operation takes longer to complete.</p>
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
     * <p>
     * The maximum number of faces to index. The value of <code>MaxFaces</code> must be greater than or equal to 1.
     * <code>IndexFaces</code> returns no more than 100 detected faces in an image, even if you specify a larger value
     * for <code>MaxFaces</code>.
     * </p>
     * <p>
     * If <code>IndexFaces</code> detects more faces than the value of <code>MaxFaces</code>, the faces with the lowest
     * quality are filtered out first. If there are still more faces than the value of <code>MaxFaces</code>, the faces
     * with the smallest bounding boxes are filtered out (up to the number that's needed to satisfy the value of
     * <code>MaxFaces</code>). Information about the unindexed faces is available in the <code>UnindexedFaces</code>
     * array.
     * </p>
     * <p>
     * The faces that are returned by <code>IndexFaces</code> are sorted by the largest face bounding box size to the
     * smallest size, in descending order.
     * </p>
     * <p>
     * <code>MaxFaces</code> can be used with a collection associated with any version of the face model.
     * </p>
     * 
     * @param maxFaces
     *        The maximum number of faces to index. The value of <code>MaxFaces</code> must be greater than or equal to
     *        1. <code>IndexFaces</code> returns no more than 100 detected faces in an image, even if you specify a
     *        larger value for <code>MaxFaces</code>.</p>
     *        <p>
     *        If <code>IndexFaces</code> detects more faces than the value of <code>MaxFaces</code>, the faces with the
     *        lowest quality are filtered out first. If there are still more faces than the value of
     *        <code>MaxFaces</code>, the faces with the smallest bounding boxes are filtered out (up to the number
     *        that's needed to satisfy the value of <code>MaxFaces</code>). Information about the unindexed faces is
     *        available in the <code>UnindexedFaces</code> array.
     *        </p>
     *        <p>
     *        The faces that are returned by <code>IndexFaces</code> are sorted by the largest face bounding box size to
     *        the smallest size, in descending order.
     *        </p>
     *        <p>
     *        <code>MaxFaces</code> can be used with a collection associated with any version of the face model.
     */

    public void setMaxFaces(Integer maxFaces) {
        this.maxFaces = maxFaces;
    }

    /**
     * <p>
     * The maximum number of faces to index. The value of <code>MaxFaces</code> must be greater than or equal to 1.
     * <code>IndexFaces</code> returns no more than 100 detected faces in an image, even if you specify a larger value
     * for <code>MaxFaces</code>.
     * </p>
     * <p>
     * If <code>IndexFaces</code> detects more faces than the value of <code>MaxFaces</code>, the faces with the lowest
     * quality are filtered out first. If there are still more faces than the value of <code>MaxFaces</code>, the faces
     * with the smallest bounding boxes are filtered out (up to the number that's needed to satisfy the value of
     * <code>MaxFaces</code>). Information about the unindexed faces is available in the <code>UnindexedFaces</code>
     * array.
     * </p>
     * <p>
     * The faces that are returned by <code>IndexFaces</code> are sorted by the largest face bounding box size to the
     * smallest size, in descending order.
     * </p>
     * <p>
     * <code>MaxFaces</code> can be used with a collection associated with any version of the face model.
     * </p>
     * 
     * @return The maximum number of faces to index. The value of <code>MaxFaces</code> must be greater than or equal to
     *         1. <code>IndexFaces</code> returns no more than 100 detected faces in an image, even if you specify a
     *         larger value for <code>MaxFaces</code>.</p>
     *         <p>
     *         If <code>IndexFaces</code> detects more faces than the value of <code>MaxFaces</code>, the faces with the
     *         lowest quality are filtered out first. If there are still more faces than the value of
     *         <code>MaxFaces</code>, the faces with the smallest bounding boxes are filtered out (up to the number
     *         that's needed to satisfy the value of <code>MaxFaces</code>). Information about the unindexed faces is
     *         available in the <code>UnindexedFaces</code> array.
     *         </p>
     *         <p>
     *         The faces that are returned by <code>IndexFaces</code> are sorted by the largest face bounding box size
     *         to the smallest size, in descending order.
     *         </p>
     *         <p>
     *         <code>MaxFaces</code> can be used with a collection associated with any version of the face model.
     */

    public Integer getMaxFaces() {
        return this.maxFaces;
    }

    /**
     * <p>
     * The maximum number of faces to index. The value of <code>MaxFaces</code> must be greater than or equal to 1.
     * <code>IndexFaces</code> returns no more than 100 detected faces in an image, even if you specify a larger value
     * for <code>MaxFaces</code>.
     * </p>
     * <p>
     * If <code>IndexFaces</code> detects more faces than the value of <code>MaxFaces</code>, the faces with the lowest
     * quality are filtered out first. If there are still more faces than the value of <code>MaxFaces</code>, the faces
     * with the smallest bounding boxes are filtered out (up to the number that's needed to satisfy the value of
     * <code>MaxFaces</code>). Information about the unindexed faces is available in the <code>UnindexedFaces</code>
     * array.
     * </p>
     * <p>
     * The faces that are returned by <code>IndexFaces</code> are sorted by the largest face bounding box size to the
     * smallest size, in descending order.
     * </p>
     * <p>
     * <code>MaxFaces</code> can be used with a collection associated with any version of the face model.
     * </p>
     * 
     * @param maxFaces
     *        The maximum number of faces to index. The value of <code>MaxFaces</code> must be greater than or equal to
     *        1. <code>IndexFaces</code> returns no more than 100 detected faces in an image, even if you specify a
     *        larger value for <code>MaxFaces</code>.</p>
     *        <p>
     *        If <code>IndexFaces</code> detects more faces than the value of <code>MaxFaces</code>, the faces with the
     *        lowest quality are filtered out first. If there are still more faces than the value of
     *        <code>MaxFaces</code>, the faces with the smallest bounding boxes are filtered out (up to the number
     *        that's needed to satisfy the value of <code>MaxFaces</code>). Information about the unindexed faces is
     *        available in the <code>UnindexedFaces</code> array.
     *        </p>
     *        <p>
     *        The faces that are returned by <code>IndexFaces</code> are sorted by the largest face bounding box size to
     *        the smallest size, in descending order.
     *        </p>
     *        <p>
     *        <code>MaxFaces</code> can be used with a collection associated with any version of the face model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexFacesRequest withMaxFaces(Integer maxFaces) {
        setMaxFaces(maxFaces);
        return this;
    }

    /**
     * <p>
     * A filter that specifies how much filtering is done to identify faces that are detected with low quality. Filtered
     * faces aren't indexed. If you specify <code>AUTO</code>, filtering prioritizes the identification of faces that
     * don’t meet the required quality bar chosen by Amazon Rekognition. The quality bar is based on a variety of common
     * use cases. Low-quality detections can occur for a number of reasons. Some examples are an object that's
     * misidentified as a face, a face that's too blurry, or a face with a pose that's too extreme to use. If you
     * specify <code>NONE</code>, no filtering is performed. The default value is AUTO.
     * </p>
     * <p>
     * To use quality filtering, the collection you are using must be associated with version 3 of the face model.
     * </p>
     * 
     * @param qualityFilter
     *        A filter that specifies how much filtering is done to identify faces that are detected with low quality.
     *        Filtered faces aren't indexed. If you specify <code>AUTO</code>, filtering prioritizes the identification
     *        of faces that don’t meet the required quality bar chosen by Amazon Rekognition. The quality bar is based
     *        on a variety of common use cases. Low-quality detections can occur for a number of reasons. Some examples
     *        are an object that's misidentified as a face, a face that's too blurry, or a face with a pose that's too
     *        extreme to use. If you specify <code>NONE</code>, no filtering is performed. The default value is
     *        AUTO.</p>
     *        <p>
     *        To use quality filtering, the collection you are using must be associated with version 3 of the face
     *        model.
     * @see QualityFilter
     */

    public void setQualityFilter(String qualityFilter) {
        this.qualityFilter = qualityFilter;
    }

    /**
     * <p>
     * A filter that specifies how much filtering is done to identify faces that are detected with low quality. Filtered
     * faces aren't indexed. If you specify <code>AUTO</code>, filtering prioritizes the identification of faces that
     * don’t meet the required quality bar chosen by Amazon Rekognition. The quality bar is based on a variety of common
     * use cases. Low-quality detections can occur for a number of reasons. Some examples are an object that's
     * misidentified as a face, a face that's too blurry, or a face with a pose that's too extreme to use. If you
     * specify <code>NONE</code>, no filtering is performed. The default value is AUTO.
     * </p>
     * <p>
     * To use quality filtering, the collection you are using must be associated with version 3 of the face model.
     * </p>
     * 
     * @return A filter that specifies how much filtering is done to identify faces that are detected with low quality.
     *         Filtered faces aren't indexed. If you specify <code>AUTO</code>, filtering prioritizes the identification
     *         of faces that don’t meet the required quality bar chosen by Amazon Rekognition. The quality bar is based
     *         on a variety of common use cases. Low-quality detections can occur for a number of reasons. Some examples
     *         are an object that's misidentified as a face, a face that's too blurry, or a face with a pose that's too
     *         extreme to use. If you specify <code>NONE</code>, no filtering is performed. The default value is
     *         AUTO.</p>
     *         <p>
     *         To use quality filtering, the collection you are using must be associated with version 3 of the face
     *         model.
     * @see QualityFilter
     */

    public String getQualityFilter() {
        return this.qualityFilter;
    }

    /**
     * <p>
     * A filter that specifies how much filtering is done to identify faces that are detected with low quality. Filtered
     * faces aren't indexed. If you specify <code>AUTO</code>, filtering prioritizes the identification of faces that
     * don’t meet the required quality bar chosen by Amazon Rekognition. The quality bar is based on a variety of common
     * use cases. Low-quality detections can occur for a number of reasons. Some examples are an object that's
     * misidentified as a face, a face that's too blurry, or a face with a pose that's too extreme to use. If you
     * specify <code>NONE</code>, no filtering is performed. The default value is AUTO.
     * </p>
     * <p>
     * To use quality filtering, the collection you are using must be associated with version 3 of the face model.
     * </p>
     * 
     * @param qualityFilter
     *        A filter that specifies how much filtering is done to identify faces that are detected with low quality.
     *        Filtered faces aren't indexed. If you specify <code>AUTO</code>, filtering prioritizes the identification
     *        of faces that don’t meet the required quality bar chosen by Amazon Rekognition. The quality bar is based
     *        on a variety of common use cases. Low-quality detections can occur for a number of reasons. Some examples
     *        are an object that's misidentified as a face, a face that's too blurry, or a face with a pose that's too
     *        extreme to use. If you specify <code>NONE</code>, no filtering is performed. The default value is
     *        AUTO.</p>
     *        <p>
     *        To use quality filtering, the collection you are using must be associated with version 3 of the face
     *        model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QualityFilter
     */

    public IndexFacesRequest withQualityFilter(String qualityFilter) {
        setQualityFilter(qualityFilter);
        return this;
    }

    /**
     * <p>
     * A filter that specifies how much filtering is done to identify faces that are detected with low quality. Filtered
     * faces aren't indexed. If you specify <code>AUTO</code>, filtering prioritizes the identification of faces that
     * don’t meet the required quality bar chosen by Amazon Rekognition. The quality bar is based on a variety of common
     * use cases. Low-quality detections can occur for a number of reasons. Some examples are an object that's
     * misidentified as a face, a face that's too blurry, or a face with a pose that's too extreme to use. If you
     * specify <code>NONE</code>, no filtering is performed. The default value is AUTO.
     * </p>
     * <p>
     * To use quality filtering, the collection you are using must be associated with version 3 of the face model.
     * </p>
     * 
     * @param qualityFilter
     *        A filter that specifies how much filtering is done to identify faces that are detected with low quality.
     *        Filtered faces aren't indexed. If you specify <code>AUTO</code>, filtering prioritizes the identification
     *        of faces that don’t meet the required quality bar chosen by Amazon Rekognition. The quality bar is based
     *        on a variety of common use cases. Low-quality detections can occur for a number of reasons. Some examples
     *        are an object that's misidentified as a face, a face that's too blurry, or a face with a pose that's too
     *        extreme to use. If you specify <code>NONE</code>, no filtering is performed. The default value is
     *        AUTO.</p>
     *        <p>
     *        To use quality filtering, the collection you are using must be associated with version 3 of the face
     *        model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QualityFilter
     */

    public IndexFacesRequest withQualityFilter(QualityFilter qualityFilter) {
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
        if (getCollectionId() != null)
            sb.append("CollectionId: ").append(getCollectionId()).append(",");
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getExternalImageId() != null)
            sb.append("ExternalImageId: ").append(getExternalImageId()).append(",");
        if (getDetectionAttributes() != null)
            sb.append("DetectionAttributes: ").append(getDetectionAttributes()).append(",");
        if (getMaxFaces() != null)
            sb.append("MaxFaces: ").append(getMaxFaces()).append(",");
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
        if (other.getMaxFaces() == null ^ this.getMaxFaces() == null)
            return false;
        if (other.getMaxFaces() != null && other.getMaxFaces().equals(this.getMaxFaces()) == false)
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

        hashCode = prime * hashCode + ((getCollectionId() == null) ? 0 : getCollectionId().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getExternalImageId() == null) ? 0 : getExternalImageId().hashCode());
        hashCode = prime * hashCode + ((getDetectionAttributes() == null) ? 0 : getDetectionAttributes().hashCode());
        hashCode = prime * hashCode + ((getMaxFaces() == null) ? 0 : getMaxFaces().hashCode());
        hashCode = prime * hashCode + ((getQualityFilter() == null) ? 0 : getQualityFilter().hashCode());
        return hashCode;
    }

    @Override
    public IndexFacesRequest clone() {
        return (IndexFacesRequest) super.clone();
    }

}
