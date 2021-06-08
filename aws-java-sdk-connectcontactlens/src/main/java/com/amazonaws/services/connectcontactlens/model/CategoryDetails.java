/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcontactlens.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the category rule that was matched.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-contact-lens-2020-08-21/CategoryDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CategoryDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The section of audio where the category rule was detected.
     * </p>
     */
    private java.util.List<PointOfInterest> pointsOfInterest;

    /**
     * <p>
     * The section of audio where the category rule was detected.
     * </p>
     * 
     * @return The section of audio where the category rule was detected.
     */

    public java.util.List<PointOfInterest> getPointsOfInterest() {
        return pointsOfInterest;
    }

    /**
     * <p>
     * The section of audio where the category rule was detected.
     * </p>
     * 
     * @param pointsOfInterest
     *        The section of audio where the category rule was detected.
     */

    public void setPointsOfInterest(java.util.Collection<PointOfInterest> pointsOfInterest) {
        if (pointsOfInterest == null) {
            this.pointsOfInterest = null;
            return;
        }

        this.pointsOfInterest = new java.util.ArrayList<PointOfInterest>(pointsOfInterest);
    }

    /**
     * <p>
     * The section of audio where the category rule was detected.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPointsOfInterest(java.util.Collection)} or {@link #withPointsOfInterest(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param pointsOfInterest
     *        The section of audio where the category rule was detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CategoryDetails withPointsOfInterest(PointOfInterest... pointsOfInterest) {
        if (this.pointsOfInterest == null) {
            setPointsOfInterest(new java.util.ArrayList<PointOfInterest>(pointsOfInterest.length));
        }
        for (PointOfInterest ele : pointsOfInterest) {
            this.pointsOfInterest.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The section of audio where the category rule was detected.
     * </p>
     * 
     * @param pointsOfInterest
     *        The section of audio where the category rule was detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CategoryDetails withPointsOfInterest(java.util.Collection<PointOfInterest> pointsOfInterest) {
        setPointsOfInterest(pointsOfInterest);
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
        if (getPointsOfInterest() != null)
            sb.append("PointsOfInterest: ").append(getPointsOfInterest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CategoryDetails == false)
            return false;
        CategoryDetails other = (CategoryDetails) obj;
        if (other.getPointsOfInterest() == null ^ this.getPointsOfInterest() == null)
            return false;
        if (other.getPointsOfInterest() != null && other.getPointsOfInterest().equals(this.getPointsOfInterest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPointsOfInterest() == null) ? 0 : getPointsOfInterest().hashCode());
        return hashCode;
    }

    @Override
    public CategoryDetails clone() {
        try {
            return (CategoryDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcontactlens.model.transform.CategoryDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
