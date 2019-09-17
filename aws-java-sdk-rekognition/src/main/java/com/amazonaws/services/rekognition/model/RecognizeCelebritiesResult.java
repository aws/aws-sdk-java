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
public class RecognizeCelebritiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details about each celebrity found in the image. Amazon Rekognition can detect a maximum of 15 celebrities in an
     * image.
     * </p>
     */
    private java.util.List<Celebrity> celebrityFaces;
    /**
     * <p>
     * Details about each unrecognized face in the image.
     * </p>
     */
    private java.util.List<ComparedFace> unrecognizedFaces;
    /**
     * <p>
     * The orientation of the input image (counterclockwise direction). If your application displays the image, you can
     * use this value to correct the orientation. The bounding box coordinates returned in <code>CelebrityFaces</code>
     * and <code>UnrecognizedFaces</code> represent face locations before the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable image (Exif) metadata that includes the
     * image's orientation. If so, and the Exif metadata for the input image populates the orientation field, the value
     * of <code>OrientationCorrection</code> is null. The <code>CelebrityFaces</code> and <code>UnrecognizedFaces</code>
     * bounding box coordinates represent face locations after Exif metadata is used to correct the image orientation.
     * Images in .png format don't contain Exif metadata.
     * </p>
     * </note>
     */
    private String orientationCorrection;

    /**
     * <p>
     * Details about each celebrity found in the image. Amazon Rekognition can detect a maximum of 15 celebrities in an
     * image.
     * </p>
     * 
     * @return Details about each celebrity found in the image. Amazon Rekognition can detect a maximum of 15
     *         celebrities in an image.
     */

    public java.util.List<Celebrity> getCelebrityFaces() {
        return celebrityFaces;
    }

    /**
     * <p>
     * Details about each celebrity found in the image. Amazon Rekognition can detect a maximum of 15 celebrities in an
     * image.
     * </p>
     * 
     * @param celebrityFaces
     *        Details about each celebrity found in the image. Amazon Rekognition can detect a maximum of 15 celebrities
     *        in an image.
     */

    public void setCelebrityFaces(java.util.Collection<Celebrity> celebrityFaces) {
        if (celebrityFaces == null) {
            this.celebrityFaces = null;
            return;
        }

        this.celebrityFaces = new java.util.ArrayList<Celebrity>(celebrityFaces);
    }

    /**
     * <p>
     * Details about each celebrity found in the image. Amazon Rekognition can detect a maximum of 15 celebrities in an
     * image.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCelebrityFaces(java.util.Collection)} or {@link #withCelebrityFaces(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param celebrityFaces
     *        Details about each celebrity found in the image. Amazon Rekognition can detect a maximum of 15 celebrities
     *        in an image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeCelebritiesResult withCelebrityFaces(Celebrity... celebrityFaces) {
        if (this.celebrityFaces == null) {
            setCelebrityFaces(new java.util.ArrayList<Celebrity>(celebrityFaces.length));
        }
        for (Celebrity ele : celebrityFaces) {
            this.celebrityFaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details about each celebrity found in the image. Amazon Rekognition can detect a maximum of 15 celebrities in an
     * image.
     * </p>
     * 
     * @param celebrityFaces
     *        Details about each celebrity found in the image. Amazon Rekognition can detect a maximum of 15 celebrities
     *        in an image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeCelebritiesResult withCelebrityFaces(java.util.Collection<Celebrity> celebrityFaces) {
        setCelebrityFaces(celebrityFaces);
        return this;
    }

    /**
     * <p>
     * Details about each unrecognized face in the image.
     * </p>
     * 
     * @return Details about each unrecognized face in the image.
     */

    public java.util.List<ComparedFace> getUnrecognizedFaces() {
        return unrecognizedFaces;
    }

    /**
     * <p>
     * Details about each unrecognized face in the image.
     * </p>
     * 
     * @param unrecognizedFaces
     *        Details about each unrecognized face in the image.
     */

    public void setUnrecognizedFaces(java.util.Collection<ComparedFace> unrecognizedFaces) {
        if (unrecognizedFaces == null) {
            this.unrecognizedFaces = null;
            return;
        }

        this.unrecognizedFaces = new java.util.ArrayList<ComparedFace>(unrecognizedFaces);
    }

    /**
     * <p>
     * Details about each unrecognized face in the image.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnrecognizedFaces(java.util.Collection)} or {@link #withUnrecognizedFaces(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param unrecognizedFaces
     *        Details about each unrecognized face in the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeCelebritiesResult withUnrecognizedFaces(ComparedFace... unrecognizedFaces) {
        if (this.unrecognizedFaces == null) {
            setUnrecognizedFaces(new java.util.ArrayList<ComparedFace>(unrecognizedFaces.length));
        }
        for (ComparedFace ele : unrecognizedFaces) {
            this.unrecognizedFaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details about each unrecognized face in the image.
     * </p>
     * 
     * @param unrecognizedFaces
     *        Details about each unrecognized face in the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeCelebritiesResult withUnrecognizedFaces(java.util.Collection<ComparedFace> unrecognizedFaces) {
        setUnrecognizedFaces(unrecognizedFaces);
        return this;
    }

    /**
     * <p>
     * The orientation of the input image (counterclockwise direction). If your application displays the image, you can
     * use this value to correct the orientation. The bounding box coordinates returned in <code>CelebrityFaces</code>
     * and <code>UnrecognizedFaces</code> represent face locations before the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable image (Exif) metadata that includes the
     * image's orientation. If so, and the Exif metadata for the input image populates the orientation field, the value
     * of <code>OrientationCorrection</code> is null. The <code>CelebrityFaces</code> and <code>UnrecognizedFaces</code>
     * bounding box coordinates represent face locations after Exif metadata is used to correct the image orientation.
     * Images in .png format don't contain Exif metadata.
     * </p>
     * </note>
     * 
     * @param orientationCorrection
     *        The orientation of the input image (counterclockwise direction). If your application displays the image,
     *        you can use this value to correct the orientation. The bounding box coordinates returned in
     *        <code>CelebrityFaces</code> and <code>UnrecognizedFaces</code> represent face locations before the image
     *        orientation is corrected. </p> <note>
     *        <p>
     *        If the input image is in .jpeg format, it might contain exchangeable image (Exif) metadata that includes
     *        the image's orientation. If so, and the Exif metadata for the input image populates the orientation field,
     *        the value of <code>OrientationCorrection</code> is null. The <code>CelebrityFaces</code> and
     *        <code>UnrecognizedFaces</code> bounding box coordinates represent face locations after Exif metadata is
     *        used to correct the image orientation. Images in .png format don't contain Exif metadata.
     *        </p>
     * @see OrientationCorrection
     */

    public void setOrientationCorrection(String orientationCorrection) {
        this.orientationCorrection = orientationCorrection;
    }

    /**
     * <p>
     * The orientation of the input image (counterclockwise direction). If your application displays the image, you can
     * use this value to correct the orientation. The bounding box coordinates returned in <code>CelebrityFaces</code>
     * and <code>UnrecognizedFaces</code> represent face locations before the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable image (Exif) metadata that includes the
     * image's orientation. If so, and the Exif metadata for the input image populates the orientation field, the value
     * of <code>OrientationCorrection</code> is null. The <code>CelebrityFaces</code> and <code>UnrecognizedFaces</code>
     * bounding box coordinates represent face locations after Exif metadata is used to correct the image orientation.
     * Images in .png format don't contain Exif metadata.
     * </p>
     * </note>
     * 
     * @return The orientation of the input image (counterclockwise direction). If your application displays the image,
     *         you can use this value to correct the orientation. The bounding box coordinates returned in
     *         <code>CelebrityFaces</code> and <code>UnrecognizedFaces</code> represent face locations before the image
     *         orientation is corrected. </p> <note>
     *         <p>
     *         If the input image is in .jpeg format, it might contain exchangeable image (Exif) metadata that includes
     *         the image's orientation. If so, and the Exif metadata for the input image populates the orientation
     *         field, the value of <code>OrientationCorrection</code> is null. The <code>CelebrityFaces</code> and
     *         <code>UnrecognizedFaces</code> bounding box coordinates represent face locations after Exif metadata is
     *         used to correct the image orientation. Images in .png format don't contain Exif metadata.
     *         </p>
     * @see OrientationCorrection
     */

    public String getOrientationCorrection() {
        return this.orientationCorrection;
    }

    /**
     * <p>
     * The orientation of the input image (counterclockwise direction). If your application displays the image, you can
     * use this value to correct the orientation. The bounding box coordinates returned in <code>CelebrityFaces</code>
     * and <code>UnrecognizedFaces</code> represent face locations before the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable image (Exif) metadata that includes the
     * image's orientation. If so, and the Exif metadata for the input image populates the orientation field, the value
     * of <code>OrientationCorrection</code> is null. The <code>CelebrityFaces</code> and <code>UnrecognizedFaces</code>
     * bounding box coordinates represent face locations after Exif metadata is used to correct the image orientation.
     * Images in .png format don't contain Exif metadata.
     * </p>
     * </note>
     * 
     * @param orientationCorrection
     *        The orientation of the input image (counterclockwise direction). If your application displays the image,
     *        you can use this value to correct the orientation. The bounding box coordinates returned in
     *        <code>CelebrityFaces</code> and <code>UnrecognizedFaces</code> represent face locations before the image
     *        orientation is corrected. </p> <note>
     *        <p>
     *        If the input image is in .jpeg format, it might contain exchangeable image (Exif) metadata that includes
     *        the image's orientation. If so, and the Exif metadata for the input image populates the orientation field,
     *        the value of <code>OrientationCorrection</code> is null. The <code>CelebrityFaces</code> and
     *        <code>UnrecognizedFaces</code> bounding box coordinates represent face locations after Exif metadata is
     *        used to correct the image orientation. Images in .png format don't contain Exif metadata.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrientationCorrection
     */

    public RecognizeCelebritiesResult withOrientationCorrection(String orientationCorrection) {
        setOrientationCorrection(orientationCorrection);
        return this;
    }

    /**
     * <p>
     * The orientation of the input image (counterclockwise direction). If your application displays the image, you can
     * use this value to correct the orientation. The bounding box coordinates returned in <code>CelebrityFaces</code>
     * and <code>UnrecognizedFaces</code> represent face locations before the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable image (Exif) metadata that includes the
     * image's orientation. If so, and the Exif metadata for the input image populates the orientation field, the value
     * of <code>OrientationCorrection</code> is null. The <code>CelebrityFaces</code> and <code>UnrecognizedFaces</code>
     * bounding box coordinates represent face locations after Exif metadata is used to correct the image orientation.
     * Images in .png format don't contain Exif metadata.
     * </p>
     * </note>
     * 
     * @param orientationCorrection
     *        The orientation of the input image (counterclockwise direction). If your application displays the image,
     *        you can use this value to correct the orientation. The bounding box coordinates returned in
     *        <code>CelebrityFaces</code> and <code>UnrecognizedFaces</code> represent face locations before the image
     *        orientation is corrected. </p> <note>
     *        <p>
     *        If the input image is in .jpeg format, it might contain exchangeable image (Exif) metadata that includes
     *        the image's orientation. If so, and the Exif metadata for the input image populates the orientation field,
     *        the value of <code>OrientationCorrection</code> is null. The <code>CelebrityFaces</code> and
     *        <code>UnrecognizedFaces</code> bounding box coordinates represent face locations after Exif metadata is
     *        used to correct the image orientation. Images in .png format don't contain Exif metadata.
     *        </p>
     * @see OrientationCorrection
     */

    public void setOrientationCorrection(OrientationCorrection orientationCorrection) {
        withOrientationCorrection(orientationCorrection);
    }

    /**
     * <p>
     * The orientation of the input image (counterclockwise direction). If your application displays the image, you can
     * use this value to correct the orientation. The bounding box coordinates returned in <code>CelebrityFaces</code>
     * and <code>UnrecognizedFaces</code> represent face locations before the image orientation is corrected.
     * </p>
     * <note>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable image (Exif) metadata that includes the
     * image's orientation. If so, and the Exif metadata for the input image populates the orientation field, the value
     * of <code>OrientationCorrection</code> is null. The <code>CelebrityFaces</code> and <code>UnrecognizedFaces</code>
     * bounding box coordinates represent face locations after Exif metadata is used to correct the image orientation.
     * Images in .png format don't contain Exif metadata.
     * </p>
     * </note>
     * 
     * @param orientationCorrection
     *        The orientation of the input image (counterclockwise direction). If your application displays the image,
     *        you can use this value to correct the orientation. The bounding box coordinates returned in
     *        <code>CelebrityFaces</code> and <code>UnrecognizedFaces</code> represent face locations before the image
     *        orientation is corrected. </p> <note>
     *        <p>
     *        If the input image is in .jpeg format, it might contain exchangeable image (Exif) metadata that includes
     *        the image's orientation. If so, and the Exif metadata for the input image populates the orientation field,
     *        the value of <code>OrientationCorrection</code> is null. The <code>CelebrityFaces</code> and
     *        <code>UnrecognizedFaces</code> bounding box coordinates represent face locations after Exif metadata is
     *        used to correct the image orientation. Images in .png format don't contain Exif metadata.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrientationCorrection
     */

    public RecognizeCelebritiesResult withOrientationCorrection(OrientationCorrection orientationCorrection) {
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
        if (getCelebrityFaces() != null)
            sb.append("CelebrityFaces: ").append(getCelebrityFaces()).append(",");
        if (getUnrecognizedFaces() != null)
            sb.append("UnrecognizedFaces: ").append(getUnrecognizedFaces()).append(",");
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

        if (obj instanceof RecognizeCelebritiesResult == false)
            return false;
        RecognizeCelebritiesResult other = (RecognizeCelebritiesResult) obj;
        if (other.getCelebrityFaces() == null ^ this.getCelebrityFaces() == null)
            return false;
        if (other.getCelebrityFaces() != null && other.getCelebrityFaces().equals(this.getCelebrityFaces()) == false)
            return false;
        if (other.getUnrecognizedFaces() == null ^ this.getUnrecognizedFaces() == null)
            return false;
        if (other.getUnrecognizedFaces() != null && other.getUnrecognizedFaces().equals(this.getUnrecognizedFaces()) == false)
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

        hashCode = prime * hashCode + ((getCelebrityFaces() == null) ? 0 : getCelebrityFaces().hashCode());
        hashCode = prime * hashCode + ((getUnrecognizedFaces() == null) ? 0 : getUnrecognizedFaces().hashCode());
        hashCode = prime * hashCode + ((getOrientationCorrection() == null) ? 0 : getOrientationCorrection().hashCode());
        return hashCode;
    }

    @Override
    public RecognizeCelebritiesResult clone() {
        try {
            return (RecognizeCelebritiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
