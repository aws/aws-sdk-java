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
public class DetectLabelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of labels for the real-world objects detected.
     * </p>
     */
    private java.util.List<Label> labels;
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
     * Version number of the label detection model that was used to detect labels.
     * </p>
     */
    private String labelModelVersion;

    /**
     * <p>
     * An array of labels for the real-world objects detected.
     * </p>
     * 
     * @return An array of labels for the real-world objects detected.
     */

    public java.util.List<Label> getLabels() {
        return labels;
    }

    /**
     * <p>
     * An array of labels for the real-world objects detected.
     * </p>
     * 
     * @param labels
     *        An array of labels for the real-world objects detected.
     */

    public void setLabels(java.util.Collection<Label> labels) {
        if (labels == null) {
            this.labels = null;
            return;
        }

        this.labels = new java.util.ArrayList<Label>(labels);
    }

    /**
     * <p>
     * An array of labels for the real-world objects detected.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLabels(java.util.Collection)} or {@link #withLabels(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param labels
     *        An array of labels for the real-world objects detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectLabelsResult withLabels(Label... labels) {
        if (this.labels == null) {
            setLabels(new java.util.ArrayList<Label>(labels.length));
        }
        for (Label ele : labels) {
            this.labels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of labels for the real-world objects detected.
     * </p>
     * 
     * @param labels
     *        An array of labels for the real-world objects detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectLabelsResult withLabels(java.util.Collection<Label> labels) {
        setLabels(labels);
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

    public DetectLabelsResult withOrientationCorrection(String orientationCorrection) {
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

    public DetectLabelsResult withOrientationCorrection(OrientationCorrection orientationCorrection) {
        this.orientationCorrection = orientationCorrection.toString();
        return this;
    }

    /**
     * <p>
     * Version number of the label detection model that was used to detect labels.
     * </p>
     * 
     * @param labelModelVersion
     *        Version number of the label detection model that was used to detect labels.
     */

    public void setLabelModelVersion(String labelModelVersion) {
        this.labelModelVersion = labelModelVersion;
    }

    /**
     * <p>
     * Version number of the label detection model that was used to detect labels.
     * </p>
     * 
     * @return Version number of the label detection model that was used to detect labels.
     */

    public String getLabelModelVersion() {
        return this.labelModelVersion;
    }

    /**
     * <p>
     * Version number of the label detection model that was used to detect labels.
     * </p>
     * 
     * @param labelModelVersion
     *        Version number of the label detection model that was used to detect labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectLabelsResult withLabelModelVersion(String labelModelVersion) {
        setLabelModelVersion(labelModelVersion);
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
        if (getLabels() != null)
            sb.append("Labels: ").append(getLabels()).append(",");
        if (getOrientationCorrection() != null)
            sb.append("OrientationCorrection: ").append(getOrientationCorrection()).append(",");
        if (getLabelModelVersion() != null)
            sb.append("LabelModelVersion: ").append(getLabelModelVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectLabelsResult == false)
            return false;
        DetectLabelsResult other = (DetectLabelsResult) obj;
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        if (other.getOrientationCorrection() == null ^ this.getOrientationCorrection() == null)
            return false;
        if (other.getOrientationCorrection() != null && other.getOrientationCorrection().equals(this.getOrientationCorrection()) == false)
            return false;
        if (other.getLabelModelVersion() == null ^ this.getLabelModelVersion() == null)
            return false;
        if (other.getLabelModelVersion() != null && other.getLabelModelVersion().equals(this.getLabelModelVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        hashCode = prime * hashCode + ((getOrientationCorrection() == null) ? 0 : getOrientationCorrection().hashCode());
        hashCode = prime * hashCode + ((getLabelModelVersion() == null) ? 0 : getLabelModelVersion().hashCode());
        return hashCode;
    }

    @Override
    public DetectLabelsResult clone() {
        try {
            return (DetectLabelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
