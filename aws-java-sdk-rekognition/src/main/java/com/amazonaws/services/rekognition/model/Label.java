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
 * Structure containing details about the detected label, including bounding box, name, and level of confidence.
 * </p>
 */
public class Label implements Serializable, Cloneable {

    /**
     * <p>
     * The name (label) of the object.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Level of confidence.
     * </p>
     */
    private Float confidence;

    /**
     * <p>
     * The name (label) of the object.
     * </p>
     * 
     * @param name
     *        The name (label) of the object.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name (label) of the object.
     * </p>
     * 
     * @return The name (label) of the object.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name (label) of the object.
     * </p>
     * 
     * @param name
     *        The name (label) of the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Label withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Level of confidence.
     * </p>
     * 
     * @param confidence
     *        Level of confidence.
     */

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * Level of confidence.
     * </p>
     * 
     * @return Level of confidence.
     */

    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * Level of confidence.
     * </p>
     * 
     * @param confidence
     *        Level of confidence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Label withConfidence(Float confidence) {
        setConfidence(confidence);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getConfidence() != null)
            sb.append("Confidence: " + getConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Label == false)
            return false;
        Label other = (Label) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        return hashCode;
    }

    @Override
    public Label clone() {
        try {
            return (Label) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
