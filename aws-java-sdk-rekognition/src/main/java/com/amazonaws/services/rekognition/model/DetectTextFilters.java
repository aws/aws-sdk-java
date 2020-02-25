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
 * A set of optional parameters that you can use to set the criteria that the text must meet to be included in your
 * response. <code>WordFilter</code> looks at a word’s height, width, and minimum confidence.
 * <code>RegionOfInterest</code> lets you set a specific region of the image to look for text in.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectTextFilters implements Serializable, Cloneable, StructuredPojo {

    private DetectionFilter wordFilter;
    /**
     * <p>
     * A Filter focusing on a certain area of the image. Uses a <code>BoundingBox</code> object to set the region of the
     * image.
     * </p>
     */
    private java.util.List<RegionOfInterest> regionsOfInterest;

    /**
     * @param wordFilter
     */

    public void setWordFilter(DetectionFilter wordFilter) {
        this.wordFilter = wordFilter;
    }

    /**
     * @return
     */

    public DetectionFilter getWordFilter() {
        return this.wordFilter;
    }

    /**
     * @param wordFilter
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectTextFilters withWordFilter(DetectionFilter wordFilter) {
        setWordFilter(wordFilter);
        return this;
    }

    /**
     * <p>
     * A Filter focusing on a certain area of the image. Uses a <code>BoundingBox</code> object to set the region of the
     * image.
     * </p>
     * 
     * @return A Filter focusing on a certain area of the image. Uses a <code>BoundingBox</code> object to set the
     *         region of the image.
     */

    public java.util.List<RegionOfInterest> getRegionsOfInterest() {
        return regionsOfInterest;
    }

    /**
     * <p>
     * A Filter focusing on a certain area of the image. Uses a <code>BoundingBox</code> object to set the region of the
     * image.
     * </p>
     * 
     * @param regionsOfInterest
     *        A Filter focusing on a certain area of the image. Uses a <code>BoundingBox</code> object to set the region
     *        of the image.
     */

    public void setRegionsOfInterest(java.util.Collection<RegionOfInterest> regionsOfInterest) {
        if (regionsOfInterest == null) {
            this.regionsOfInterest = null;
            return;
        }

        this.regionsOfInterest = new java.util.ArrayList<RegionOfInterest>(regionsOfInterest);
    }

    /**
     * <p>
     * A Filter focusing on a certain area of the image. Uses a <code>BoundingBox</code> object to set the region of the
     * image.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegionsOfInterest(java.util.Collection)} or {@link #withRegionsOfInterest(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param regionsOfInterest
     *        A Filter focusing on a certain area of the image. Uses a <code>BoundingBox</code> object to set the region
     *        of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectTextFilters withRegionsOfInterest(RegionOfInterest... regionsOfInterest) {
        if (this.regionsOfInterest == null) {
            setRegionsOfInterest(new java.util.ArrayList<RegionOfInterest>(regionsOfInterest.length));
        }
        for (RegionOfInterest ele : regionsOfInterest) {
            this.regionsOfInterest.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A Filter focusing on a certain area of the image. Uses a <code>BoundingBox</code> object to set the region of the
     * image.
     * </p>
     * 
     * @param regionsOfInterest
     *        A Filter focusing on a certain area of the image. Uses a <code>BoundingBox</code> object to set the region
     *        of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectTextFilters withRegionsOfInterest(java.util.Collection<RegionOfInterest> regionsOfInterest) {
        setRegionsOfInterest(regionsOfInterest);
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
        if (getWordFilter() != null)
            sb.append("WordFilter: ").append(getWordFilter()).append(",");
        if (getRegionsOfInterest() != null)
            sb.append("RegionsOfInterest: ").append(getRegionsOfInterest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectTextFilters == false)
            return false;
        DetectTextFilters other = (DetectTextFilters) obj;
        if (other.getWordFilter() == null ^ this.getWordFilter() == null)
            return false;
        if (other.getWordFilter() != null && other.getWordFilter().equals(this.getWordFilter()) == false)
            return false;
        if (other.getRegionsOfInterest() == null ^ this.getRegionsOfInterest() == null)
            return false;
        if (other.getRegionsOfInterest() != null && other.getRegionsOfInterest().equals(this.getRegionsOfInterest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWordFilter() == null) ? 0 : getWordFilter().hashCode());
        hashCode = prime * hashCode + ((getRegionsOfInterest() == null) ? 0 : getRegionsOfInterest().hashCode());
        return hashCode;
    }

    @Override
    public DetectTextFilters clone() {
        try {
            return (DetectTextFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.DetectTextFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
