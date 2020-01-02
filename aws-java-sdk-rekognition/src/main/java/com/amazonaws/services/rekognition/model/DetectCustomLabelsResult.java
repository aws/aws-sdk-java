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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectCustomLabelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of custom labels detected in the input image.
     * </p>
     */
    private java.util.List<CustomLabel> customLabels;

    /**
     * <p>
     * An array of custom labels detected in the input image.
     * </p>
     * 
     * @return An array of custom labels detected in the input image.
     */

    public java.util.List<CustomLabel> getCustomLabels() {
        return customLabels;
    }

    /**
     * <p>
     * An array of custom labels detected in the input image.
     * </p>
     * 
     * @param customLabels
     *        An array of custom labels detected in the input image.
     */

    public void setCustomLabels(java.util.Collection<CustomLabel> customLabels) {
        if (customLabels == null) {
            this.customLabels = null;
            return;
        }

        this.customLabels = new java.util.ArrayList<CustomLabel>(customLabels);
    }

    /**
     * <p>
     * An array of custom labels detected in the input image.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomLabels(java.util.Collection)} or {@link #withCustomLabels(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param customLabels
     *        An array of custom labels detected in the input image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectCustomLabelsResult withCustomLabels(CustomLabel... customLabels) {
        if (this.customLabels == null) {
            setCustomLabels(new java.util.ArrayList<CustomLabel>(customLabels.length));
        }
        for (CustomLabel ele : customLabels) {
            this.customLabels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of custom labels detected in the input image.
     * </p>
     * 
     * @param customLabels
     *        An array of custom labels detected in the input image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectCustomLabelsResult withCustomLabels(java.util.Collection<CustomLabel> customLabels) {
        setCustomLabels(customLabels);
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
        if (getCustomLabels() != null)
            sb.append("CustomLabels: ").append(getCustomLabels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectCustomLabelsResult == false)
            return false;
        DetectCustomLabelsResult other = (DetectCustomLabelsResult) obj;
        if (other.getCustomLabels() == null ^ this.getCustomLabels() == null)
            return false;
        if (other.getCustomLabels() != null && other.getCustomLabels().equals(this.getCustomLabels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomLabels() == null) ? 0 : getCustomLabels().hashCode());
        return hashCode;
    }

    @Override
    public DetectCustomLabelsResult clone() {
        try {
            return (DetectCustomLabelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
