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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectFacesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details of each face found in the image.
     * </p>
     */
    private java.util.List<FaceDetail> faceDetails;
    /**
     * <p>
     * The value of <code>OrientationCorrection</code> is always null.
     * </p>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata that
     * includes the image's orientation. Amazon Rekognition uses this orientation information to perform image
     * correction. The bounding box coordinates are translated to represent object locations after the orientation
     * information in the Exif metadata is used to correct the image orientation. Images in .png format don't contain
     * Exif metadata.
     * </p>
     * <p>
     * Amazon Rekognition doesn’t perform image correction for images in .png format and .jpeg images without
     * orientation information in the image Exif metadata. The bounding box coordinates aren't translated and represent
     * the object locations before the image is rotated.
     * </p>
     */
    private String orientationCorrection;

    /**
     * <p>
     * Details of each face found in the image.
     * </p>
     * 
     * @return Details of each face found in the image.
     */

    public java.util.List<FaceDetail> getFaceDetails() {
        return faceDetails;
    }

    /**
     * <p>
     * Details of each face found in the image.
     * </p>
     * 
     * @param faceDetails
     *        Details of each face found in the image.
     */

    public void setFaceDetails(java.util.Collection<FaceDetail> faceDetails) {
        if (faceDetails == null) {
            this.faceDetails = null;
            return;
        }

        this.faceDetails = new java.util.ArrayList<FaceDetail>(faceDetails);
    }

    /**
     * <p>
     * Details of each face found in the image.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFaceDetails(java.util.Collection)} or {@link #withFaceDetails(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param faceDetails
     *        Details of each face found in the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectFacesResult withFaceDetails(FaceDetail... faceDetails) {
        if (this.faceDetails == null) {
            setFaceDetails(new java.util.ArrayList<FaceDetail>(faceDetails.length));
        }
        for (FaceDetail ele : faceDetails) {
            this.faceDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details of each face found in the image.
     * </p>
     * 
     * @param faceDetails
     *        Details of each face found in the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectFacesResult withFaceDetails(java.util.Collection<FaceDetail> faceDetails) {
        setFaceDetails(faceDetails);
        return this;
    }

    /**
     * <p>
     * The value of <code>OrientationCorrection</code> is always null.
     * </p>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata that
     * includes the image's orientation. Amazon Rekognition uses this orientation information to perform image
     * correction. The bounding box coordinates are translated to represent object locations after the orientation
     * information in the Exif metadata is used to correct the image orientation. Images in .png format don't contain
     * Exif metadata.
     * </p>
     * <p>
     * Amazon Rekognition doesn’t perform image correction for images in .png format and .jpeg images without
     * orientation information in the image Exif metadata. The bounding box coordinates aren't translated and represent
     * the object locations before the image is rotated.
     * </p>
     * 
     * @param orientationCorrection
     *        The value of <code>OrientationCorrection</code> is always null.</p>
     *        <p>
     *        If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata
     *        that includes the image's orientation. Amazon Rekognition uses this orientation information to perform
     *        image correction. The bounding box coordinates are translated to represent object locations after the
     *        orientation information in the Exif metadata is used to correct the image orientation. Images in .png
     *        format don't contain Exif metadata.
     *        </p>
     *        <p>
     *        Amazon Rekognition doesn’t perform image correction for images in .png format and .jpeg images without
     *        orientation information in the image Exif metadata. The bounding box coordinates aren't translated and
     *        represent the object locations before the image is rotated.
     * @see OrientationCorrection
     */

    public void setOrientationCorrection(String orientationCorrection) {
        this.orientationCorrection = orientationCorrection;
    }

    /**
     * <p>
     * The value of <code>OrientationCorrection</code> is always null.
     * </p>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata that
     * includes the image's orientation. Amazon Rekognition uses this orientation information to perform image
     * correction. The bounding box coordinates are translated to represent object locations after the orientation
     * information in the Exif metadata is used to correct the image orientation. Images in .png format don't contain
     * Exif metadata.
     * </p>
     * <p>
     * Amazon Rekognition doesn’t perform image correction for images in .png format and .jpeg images without
     * orientation information in the image Exif metadata. The bounding box coordinates aren't translated and represent
     * the object locations before the image is rotated.
     * </p>
     * 
     * @return The value of <code>OrientationCorrection</code> is always null.</p>
     *         <p>
     *         If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata
     *         that includes the image's orientation. Amazon Rekognition uses this orientation information to perform
     *         image correction. The bounding box coordinates are translated to represent object locations after the
     *         orientation information in the Exif metadata is used to correct the image orientation. Images in .png
     *         format don't contain Exif metadata.
     *         </p>
     *         <p>
     *         Amazon Rekognition doesn’t perform image correction for images in .png format and .jpeg images without
     *         orientation information in the image Exif metadata. The bounding box coordinates aren't translated and
     *         represent the object locations before the image is rotated.
     * @see OrientationCorrection
     */

    public String getOrientationCorrection() {
        return this.orientationCorrection;
    }

    /**
     * <p>
     * The value of <code>OrientationCorrection</code> is always null.
     * </p>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata that
     * includes the image's orientation. Amazon Rekognition uses this orientation information to perform image
     * correction. The bounding box coordinates are translated to represent object locations after the orientation
     * information in the Exif metadata is used to correct the image orientation. Images in .png format don't contain
     * Exif metadata.
     * </p>
     * <p>
     * Amazon Rekognition doesn’t perform image correction for images in .png format and .jpeg images without
     * orientation information in the image Exif metadata. The bounding box coordinates aren't translated and represent
     * the object locations before the image is rotated.
     * </p>
     * 
     * @param orientationCorrection
     *        The value of <code>OrientationCorrection</code> is always null.</p>
     *        <p>
     *        If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata
     *        that includes the image's orientation. Amazon Rekognition uses this orientation information to perform
     *        image correction. The bounding box coordinates are translated to represent object locations after the
     *        orientation information in the Exif metadata is used to correct the image orientation. Images in .png
     *        format don't contain Exif metadata.
     *        </p>
     *        <p>
     *        Amazon Rekognition doesn’t perform image correction for images in .png format and .jpeg images without
     *        orientation information in the image Exif metadata. The bounding box coordinates aren't translated and
     *        represent the object locations before the image is rotated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrientationCorrection
     */

    public DetectFacesResult withOrientationCorrection(String orientationCorrection) {
        setOrientationCorrection(orientationCorrection);
        return this;
    }

    /**
     * <p>
     * The value of <code>OrientationCorrection</code> is always null.
     * </p>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata that
     * includes the image's orientation. Amazon Rekognition uses this orientation information to perform image
     * correction. The bounding box coordinates are translated to represent object locations after the orientation
     * information in the Exif metadata is used to correct the image orientation. Images in .png format don't contain
     * Exif metadata.
     * </p>
     * <p>
     * Amazon Rekognition doesn’t perform image correction for images in .png format and .jpeg images without
     * orientation information in the image Exif metadata. The bounding box coordinates aren't translated and represent
     * the object locations before the image is rotated.
     * </p>
     * 
     * @param orientationCorrection
     *        The value of <code>OrientationCorrection</code> is always null.</p>
     *        <p>
     *        If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata
     *        that includes the image's orientation. Amazon Rekognition uses this orientation information to perform
     *        image correction. The bounding box coordinates are translated to represent object locations after the
     *        orientation information in the Exif metadata is used to correct the image orientation. Images in .png
     *        format don't contain Exif metadata.
     *        </p>
     *        <p>
     *        Amazon Rekognition doesn’t perform image correction for images in .png format and .jpeg images without
     *        orientation information in the image Exif metadata. The bounding box coordinates aren't translated and
     *        represent the object locations before the image is rotated.
     * @see OrientationCorrection
     */

    public void setOrientationCorrection(OrientationCorrection orientationCorrection) {
        withOrientationCorrection(orientationCorrection);
    }

    /**
     * <p>
     * The value of <code>OrientationCorrection</code> is always null.
     * </p>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata that
     * includes the image's orientation. Amazon Rekognition uses this orientation information to perform image
     * correction. The bounding box coordinates are translated to represent object locations after the orientation
     * information in the Exif metadata is used to correct the image orientation. Images in .png format don't contain
     * Exif metadata.
     * </p>
     * <p>
     * Amazon Rekognition doesn’t perform image correction for images in .png format and .jpeg images without
     * orientation information in the image Exif metadata. The bounding box coordinates aren't translated and represent
     * the object locations before the image is rotated.
     * </p>
     * 
     * @param orientationCorrection
     *        The value of <code>OrientationCorrection</code> is always null.</p>
     *        <p>
     *        If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata
     *        that includes the image's orientation. Amazon Rekognition uses this orientation information to perform
     *        image correction. The bounding box coordinates are translated to represent object locations after the
     *        orientation information in the Exif metadata is used to correct the image orientation. Images in .png
     *        format don't contain Exif metadata.
     *        </p>
     *        <p>
     *        Amazon Rekognition doesn’t perform image correction for images in .png format and .jpeg images without
     *        orientation information in the image Exif metadata. The bounding box coordinates aren't translated and
     *        represent the object locations before the image is rotated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrientationCorrection
     */

    public DetectFacesResult withOrientationCorrection(OrientationCorrection orientationCorrection) {
        this.orientationCorrection = orientationCorrection.toString();
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
        if (getFaceDetails() != null)
            sb.append("FaceDetails: ").append(getFaceDetails()).append(",");
        if (getOrientationCorrection() != null)
            sb.append("OrientationCorrection: ").append(getOrientationCorrection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectFacesResult == false)
            return false;
        DetectFacesResult other = (DetectFacesResult) obj;
        if (other.getFaceDetails() == null ^ this.getFaceDetails() == null)
            return false;
        if (other.getFaceDetails() != null && other.getFaceDetails().equals(this.getFaceDetails()) == false)
            return false;
        if (other.getOrientationCorrection() == null ^ this.getOrientationCorrection() == null)
            return false;
        if (other.getOrientationCorrection() != null && other.getOrientationCorrection().equals(this.getOrientationCorrection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFaceDetails() == null) ? 0 : getFaceDetails().hashCode());
        hashCode = prime * hashCode + ((getOrientationCorrection() == null) ? 0 : getOrientationCorrection().hashCode());
        return hashCode;
    }

    @Override
    public DetectFacesResult clone() {
        try {
            return (DetectFacesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
