/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a location within the frame that Rekognition checks for text. Uses a <code>BoundingBox</code> object to set
 * a region of the screen.
 * </p>
 * <p>
 * A word is included in the region if the word is more than half in that region. If there is more than one region, the
 * word will be compared with all regions of the screen. Any word more than half in a region is kept in the results.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegionOfInterest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The box representing a region of interest on screen.
     * </p>
     */
    private BoundingBox boundingBox;

    /**
     * <p>
     * The box representing a region of interest on screen.
     * </p>
     * 
     * @param boundingBox
     *        The box representing a region of interest on screen.
     */

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    /**
     * <p>
     * The box representing a region of interest on screen.
     * </p>
     * 
     * @return The box representing a region of interest on screen.
     */

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    /**
     * <p>
     * The box representing a region of interest on screen.
     * </p>
     * 
     * @param boundingBox
     *        The box representing a region of interest on screen.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionOfInterest withBoundingBox(BoundingBox boundingBox) {
        setBoundingBox(boundingBox);
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
        if (getBoundingBox() != null)
            sb.append("BoundingBox: ").append(getBoundingBox());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegionOfInterest == false)
            return false;
        RegionOfInterest other = (RegionOfInterest) obj;
        if (other.getBoundingBox() == null ^ this.getBoundingBox() == null)
            return false;
        if (other.getBoundingBox() != null && other.getBoundingBox().equals(this.getBoundingBox()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBoundingBox() == null) ? 0 : getBoundingBox().hashCode());
        return hashCode;
    }

    @Override
    public RegionOfInterest clone() {
        try {
            return (RegionOfInterest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.RegionOfInterestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
