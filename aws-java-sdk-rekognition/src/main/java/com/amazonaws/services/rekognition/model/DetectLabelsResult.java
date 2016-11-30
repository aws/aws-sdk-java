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

/**
 * 
 */
public class DetectLabelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of labels for the real-world objects detected.
     * </p>
     */
    private java.util.List<Label> labels;
    /**
     * <p>
     * Amazon Rekognition returns the orientation of the input image that was detected (clockwise direction). If your
     * application displays the image, you can use this value to correct the orientation. If Rekognition detects that
     * the input image was rotated (for example, by 90 degrees), it first corrects the orientation before detecting the
     * labels.
     * </p>
     */
    private String orientationCorrection;

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
     * Amazon Rekognition returns the orientation of the input image that was detected (clockwise direction). If your
     * application displays the image, you can use this value to correct the orientation. If Rekognition detects that
     * the input image was rotated (for example, by 90 degrees), it first corrects the orientation before detecting the
     * labels.
     * </p>
     * 
     * @param orientationCorrection
     *        Amazon Rekognition returns the orientation of the input image that was detected (clockwise direction). If
     *        your application displays the image, you can use this value to correct the orientation. If Rekognition
     *        detects that the input image was rotated (for example, by 90 degrees), it first corrects the orientation
     *        before detecting the labels.
     * @see OrientationCorrection
     */

    public void setOrientationCorrection(String orientationCorrection) {
        this.orientationCorrection = orientationCorrection;
    }

    /**
     * <p>
     * Amazon Rekognition returns the orientation of the input image that was detected (clockwise direction). If your
     * application displays the image, you can use this value to correct the orientation. If Rekognition detects that
     * the input image was rotated (for example, by 90 degrees), it first corrects the orientation before detecting the
     * labels.
     * </p>
     * 
     * @return Amazon Rekognition returns the orientation of the input image that was detected (clockwise direction). If
     *         your application displays the image, you can use this value to correct the orientation. If Rekognition
     *         detects that the input image was rotated (for example, by 90 degrees), it first corrects the orientation
     *         before detecting the labels.
     * @see OrientationCorrection
     */

    public String getOrientationCorrection() {
        return this.orientationCorrection;
    }

    /**
     * <p>
     * Amazon Rekognition returns the orientation of the input image that was detected (clockwise direction). If your
     * application displays the image, you can use this value to correct the orientation. If Rekognition detects that
     * the input image was rotated (for example, by 90 degrees), it first corrects the orientation before detecting the
     * labels.
     * </p>
     * 
     * @param orientationCorrection
     *        Amazon Rekognition returns the orientation of the input image that was detected (clockwise direction). If
     *        your application displays the image, you can use this value to correct the orientation. If Rekognition
     *        detects that the input image was rotated (for example, by 90 degrees), it first corrects the orientation
     *        before detecting the labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrientationCorrection
     */

    public DetectLabelsResult withOrientationCorrection(String orientationCorrection) {
        setOrientationCorrection(orientationCorrection);
        return this;
    }

    /**
     * <p>
     * Amazon Rekognition returns the orientation of the input image that was detected (clockwise direction). If your
     * application displays the image, you can use this value to correct the orientation. If Rekognition detects that
     * the input image was rotated (for example, by 90 degrees), it first corrects the orientation before detecting the
     * labels.
     * </p>
     * 
     * @param orientationCorrection
     *        Amazon Rekognition returns the orientation of the input image that was detected (clockwise direction). If
     *        your application displays the image, you can use this value to correct the orientation. If Rekognition
     *        detects that the input image was rotated (for example, by 90 degrees), it first corrects the orientation
     *        before detecting the labels.
     * @see OrientationCorrection
     */

    public void setOrientationCorrection(OrientationCorrection orientationCorrection) {
        this.orientationCorrection = orientationCorrection.toString();
    }

    /**
     * <p>
     * Amazon Rekognition returns the orientation of the input image that was detected (clockwise direction). If your
     * application displays the image, you can use this value to correct the orientation. If Rekognition detects that
     * the input image was rotated (for example, by 90 degrees), it first corrects the orientation before detecting the
     * labels.
     * </p>
     * 
     * @param orientationCorrection
     *        Amazon Rekognition returns the orientation of the input image that was detected (clockwise direction). If
     *        your application displays the image, you can use this value to correct the orientation. If Rekognition
     *        detects that the input image was rotated (for example, by 90 degrees), it first corrects the orientation
     *        before detecting the labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrientationCorrection
     */

    public DetectLabelsResult withOrientationCorrection(OrientationCorrection orientationCorrection) {
        setOrientationCorrection(orientationCorrection);
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
        if (getLabels() != null)
            sb.append("Labels: " + getLabels() + ",");
        if (getOrientationCorrection() != null)
            sb.append("OrientationCorrection: " + getOrientationCorrection());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        hashCode = prime * hashCode + ((getOrientationCorrection() == null) ? 0 : getOrientationCorrection().hashCode());
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
