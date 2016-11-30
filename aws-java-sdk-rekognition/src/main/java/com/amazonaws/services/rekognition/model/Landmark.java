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
 * <p>
 * Indicates the location of the landmark on the face.
 * </p>
 */
public class Landmark implements Serializable, Cloneable {

    /**
     * <p>
     * Type of the landmark.
     * </p>
     */
    private String type;
    /**
     * <p>
     * x-coordinate from the top left of the landmark expressed as the ration of the width of the image. For example, if
     * the images is 700x200 and the x-coordinate of the landmark is at 350 pixels, then this value is 0.5.
     * </p>
     */
    private Float x;
    /**
     * <p>
     * y-coordinate from the top left of the landmark expressed as the ration of the height of the image. For example,
     * if the images is 700x200 and the y-coordinate of the landmark is at 100 pixels, then this value is 0.5.
     * </p>
     */
    private Float y;

    /**
     * <p>
     * Type of the landmark.
     * </p>
     * 
     * @param type
     *        Type of the landmark.
     * @see LandmarkType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type of the landmark.
     * </p>
     * 
     * @return Type of the landmark.
     * @see LandmarkType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Type of the landmark.
     * </p>
     * 
     * @param type
     *        Type of the landmark.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LandmarkType
     */

    public Landmark withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Type of the landmark.
     * </p>
     * 
     * @param type
     *        Type of the landmark.
     * @see LandmarkType
     */

    public void setType(LandmarkType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Type of the landmark.
     * </p>
     * 
     * @param type
     *        Type of the landmark.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LandmarkType
     */

    public Landmark withType(LandmarkType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * x-coordinate from the top left of the landmark expressed as the ration of the width of the image. For example, if
     * the images is 700x200 and the x-coordinate of the landmark is at 350 pixels, then this value is 0.5.
     * </p>
     * 
     * @param x
     *        x-coordinate from the top left of the landmark expressed as the ration of the width of the image. For
     *        example, if the images is 700x200 and the x-coordinate of the landmark is at 350 pixels, then this value
     *        is 0.5.
     */

    public void setX(Float x) {
        this.x = x;
    }

    /**
     * <p>
     * x-coordinate from the top left of the landmark expressed as the ration of the width of the image. For example, if
     * the images is 700x200 and the x-coordinate of the landmark is at 350 pixels, then this value is 0.5.
     * </p>
     * 
     * @return x-coordinate from the top left of the landmark expressed as the ration of the width of the image. For
     *         example, if the images is 700x200 and the x-coordinate of the landmark is at 350 pixels, then this value
     *         is 0.5.
     */

    public Float getX() {
        return this.x;
    }

    /**
     * <p>
     * x-coordinate from the top left of the landmark expressed as the ration of the width of the image. For example, if
     * the images is 700x200 and the x-coordinate of the landmark is at 350 pixels, then this value is 0.5.
     * </p>
     * 
     * @param x
     *        x-coordinate from the top left of the landmark expressed as the ration of the width of the image. For
     *        example, if the images is 700x200 and the x-coordinate of the landmark is at 350 pixels, then this value
     *        is 0.5.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Landmark withX(Float x) {
        setX(x);
        return this;
    }

    /**
     * <p>
     * y-coordinate from the top left of the landmark expressed as the ration of the height of the image. For example,
     * if the images is 700x200 and the y-coordinate of the landmark is at 100 pixels, then this value is 0.5.
     * </p>
     * 
     * @param y
     *        y-coordinate from the top left of the landmark expressed as the ration of the height of the image. For
     *        example, if the images is 700x200 and the y-coordinate of the landmark is at 100 pixels, then this value
     *        is 0.5.
     */

    public void setY(Float y) {
        this.y = y;
    }

    /**
     * <p>
     * y-coordinate from the top left of the landmark expressed as the ration of the height of the image. For example,
     * if the images is 700x200 and the y-coordinate of the landmark is at 100 pixels, then this value is 0.5.
     * </p>
     * 
     * @return y-coordinate from the top left of the landmark expressed as the ration of the height of the image. For
     *         example, if the images is 700x200 and the y-coordinate of the landmark is at 100 pixels, then this value
     *         is 0.5.
     */

    public Float getY() {
        return this.y;
    }

    /**
     * <p>
     * y-coordinate from the top left of the landmark expressed as the ration of the height of the image. For example,
     * if the images is 700x200 and the y-coordinate of the landmark is at 100 pixels, then this value is 0.5.
     * </p>
     * 
     * @param y
     *        y-coordinate from the top left of the landmark expressed as the ration of the height of the image. For
     *        example, if the images is 700x200 and the y-coordinate of the landmark is at 100 pixels, then this value
     *        is 0.5.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Landmark withY(Float y) {
        setY(y);
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getX() != null)
            sb.append("X: " + getX() + ",");
        if (getY() != null)
            sb.append("Y: " + getY());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Landmark == false)
            return false;
        Landmark other = (Landmark) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getX() == null ^ this.getX() == null)
            return false;
        if (other.getX() != null && other.getX().equals(this.getX()) == false)
            return false;
        if (other.getY() == null ^ this.getY() == null)
            return false;
        if (other.getY() != null && other.getY().equals(this.getY()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getX() == null) ? 0 : getX().hashCode());
        hashCode = prime * hashCode + ((getY() == null) ? 0 : getY().hashCode());
        return hashCode;
    }

    @Override
    public Landmark clone() {
        try {
            return (Landmark) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
