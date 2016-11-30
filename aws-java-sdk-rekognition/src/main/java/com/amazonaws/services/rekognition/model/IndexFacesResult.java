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
public class IndexFacesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of faces detected and added to the collection. For more information, see <a>howitworks-index-faces</a>.
     * </p>
     */
    private java.util.List<FaceRecord> faceRecords;
    /**
     * <p>
     * The algorithm detects the image orientation. If it detects that the image was rotated, it returns the degree of
     * rotation. You can use this value to correct the orientation and also appropriately analyze the bounding box
     * coordinates that are returned.
     * </p>
     */
    private String orientationCorrection;

    /**
     * <p>
     * An array of faces detected and added to the collection. For more information, see <a>howitworks-index-faces</a>.
     * </p>
     * 
     * @return An array of faces detected and added to the collection. For more information, see
     *         <a>howitworks-index-faces</a>.
     */

    public java.util.List<FaceRecord> getFaceRecords() {
        return faceRecords;
    }

    /**
     * <p>
     * An array of faces detected and added to the collection. For more information, see <a>howitworks-index-faces</a>.
     * </p>
     * 
     * @param faceRecords
     *        An array of faces detected and added to the collection. For more information, see
     *        <a>howitworks-index-faces</a>.
     */

    public void setFaceRecords(java.util.Collection<FaceRecord> faceRecords) {
        if (faceRecords == null) {
            this.faceRecords = null;
            return;
        }

        this.faceRecords = new java.util.ArrayList<FaceRecord>(faceRecords);
    }

    /**
     * <p>
     * An array of faces detected and added to the collection. For more information, see <a>howitworks-index-faces</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFaceRecords(java.util.Collection)} or {@link #withFaceRecords(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param faceRecords
     *        An array of faces detected and added to the collection. For more information, see
     *        <a>howitworks-index-faces</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexFacesResult withFaceRecords(FaceRecord... faceRecords) {
        if (this.faceRecords == null) {
            setFaceRecords(new java.util.ArrayList<FaceRecord>(faceRecords.length));
        }
        for (FaceRecord ele : faceRecords) {
            this.faceRecords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of faces detected and added to the collection. For more information, see <a>howitworks-index-faces</a>.
     * </p>
     * 
     * @param faceRecords
     *        An array of faces detected and added to the collection. For more information, see
     *        <a>howitworks-index-faces</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IndexFacesResult withFaceRecords(java.util.Collection<FaceRecord> faceRecords) {
        setFaceRecords(faceRecords);
        return this;
    }

    /**
     * <p>
     * The algorithm detects the image orientation. If it detects that the image was rotated, it returns the degree of
     * rotation. You can use this value to correct the orientation and also appropriately analyze the bounding box
     * coordinates that are returned.
     * </p>
     * 
     * @param orientationCorrection
     *        The algorithm detects the image orientation. If it detects that the image was rotated, it returns the
     *        degree of rotation. You can use this value to correct the orientation and also appropriately analyze the
     *        bounding box coordinates that are returned.
     * @see OrientationCorrection
     */

    public void setOrientationCorrection(String orientationCorrection) {
        this.orientationCorrection = orientationCorrection;
    }

    /**
     * <p>
     * The algorithm detects the image orientation. If it detects that the image was rotated, it returns the degree of
     * rotation. You can use this value to correct the orientation and also appropriately analyze the bounding box
     * coordinates that are returned.
     * </p>
     * 
     * @return The algorithm detects the image orientation. If it detects that the image was rotated, it returns the
     *         degree of rotation. You can use this value to correct the orientation and also appropriately analyze the
     *         bounding box coordinates that are returned.
     * @see OrientationCorrection
     */

    public String getOrientationCorrection() {
        return this.orientationCorrection;
    }

    /**
     * <p>
     * The algorithm detects the image orientation. If it detects that the image was rotated, it returns the degree of
     * rotation. You can use this value to correct the orientation and also appropriately analyze the bounding box
     * coordinates that are returned.
     * </p>
     * 
     * @param orientationCorrection
     *        The algorithm detects the image orientation. If it detects that the image was rotated, it returns the
     *        degree of rotation. You can use this value to correct the orientation and also appropriately analyze the
     *        bounding box coordinates that are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrientationCorrection
     */

    public IndexFacesResult withOrientationCorrection(String orientationCorrection) {
        setOrientationCorrection(orientationCorrection);
        return this;
    }

    /**
     * <p>
     * The algorithm detects the image orientation. If it detects that the image was rotated, it returns the degree of
     * rotation. You can use this value to correct the orientation and also appropriately analyze the bounding box
     * coordinates that are returned.
     * </p>
     * 
     * @param orientationCorrection
     *        The algorithm detects the image orientation. If it detects that the image was rotated, it returns the
     *        degree of rotation. You can use this value to correct the orientation and also appropriately analyze the
     *        bounding box coordinates that are returned.
     * @see OrientationCorrection
     */

    public void setOrientationCorrection(OrientationCorrection orientationCorrection) {
        this.orientationCorrection = orientationCorrection.toString();
    }

    /**
     * <p>
     * The algorithm detects the image orientation. If it detects that the image was rotated, it returns the degree of
     * rotation. You can use this value to correct the orientation and also appropriately analyze the bounding box
     * coordinates that are returned.
     * </p>
     * 
     * @param orientationCorrection
     *        The algorithm detects the image orientation. If it detects that the image was rotated, it returns the
     *        degree of rotation. You can use this value to correct the orientation and also appropriately analyze the
     *        bounding box coordinates that are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrientationCorrection
     */

    public IndexFacesResult withOrientationCorrection(OrientationCorrection orientationCorrection) {
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
        if (getFaceRecords() != null)
            sb.append("FaceRecords: " + getFaceRecords() + ",");
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

        if (obj instanceof IndexFacesResult == false)
            return false;
        IndexFacesResult other = (IndexFacesResult) obj;
        if (other.getFaceRecords() == null ^ this.getFaceRecords() == null)
            return false;
        if (other.getFaceRecords() != null && other.getFaceRecords().equals(this.getFaceRecords()) == false)
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

        hashCode = prime * hashCode + ((getFaceRecords() == null) ? 0 : getFaceRecords().hashCode());
        hashCode = prime * hashCode + ((getOrientationCorrection() == null) ? 0 : getOrientationCorrection().hashCode());
        return hashCode;
    }

    @Override
    public IndexFacesResult clone() {
        try {
            return (IndexFacesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
