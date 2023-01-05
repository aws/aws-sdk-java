/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains filters for the object labels returned by DetectLabels. Filters can be inclusive, exclusive, or a
 * combination of both and can be applied to individual l abels or entire label categories.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeneralLabelsSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The labels that should be included in the return from DetectLabels.
     * </p>
     */
    private java.util.List<String> labelInclusionFilters;
    /**
     * <p>
     * The labels that should be excluded from the return from DetectLabels.
     * </p>
     */
    private java.util.List<String> labelExclusionFilters;
    /**
     * <p>
     * The label categories that should be included in the return from DetectLabels.
     * </p>
     */
    private java.util.List<String> labelCategoryInclusionFilters;
    /**
     * <p>
     * The label categories that should be excluded from the return from DetectLabels.
     * </p>
     */
    private java.util.List<String> labelCategoryExclusionFilters;

    /**
     * <p>
     * The labels that should be included in the return from DetectLabels.
     * </p>
     * 
     * @return The labels that should be included in the return from DetectLabels.
     */

    public java.util.List<String> getLabelInclusionFilters() {
        return labelInclusionFilters;
    }

    /**
     * <p>
     * The labels that should be included in the return from DetectLabels.
     * </p>
     * 
     * @param labelInclusionFilters
     *        The labels that should be included in the return from DetectLabels.
     */

    public void setLabelInclusionFilters(java.util.Collection<String> labelInclusionFilters) {
        if (labelInclusionFilters == null) {
            this.labelInclusionFilters = null;
            return;
        }

        this.labelInclusionFilters = new java.util.ArrayList<String>(labelInclusionFilters);
    }

    /**
     * <p>
     * The labels that should be included in the return from DetectLabels.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLabelInclusionFilters(java.util.Collection)} or
     * {@link #withLabelInclusionFilters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param labelInclusionFilters
     *        The labels that should be included in the return from DetectLabels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneralLabelsSettings withLabelInclusionFilters(String... labelInclusionFilters) {
        if (this.labelInclusionFilters == null) {
            setLabelInclusionFilters(new java.util.ArrayList<String>(labelInclusionFilters.length));
        }
        for (String ele : labelInclusionFilters) {
            this.labelInclusionFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The labels that should be included in the return from DetectLabels.
     * </p>
     * 
     * @param labelInclusionFilters
     *        The labels that should be included in the return from DetectLabels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneralLabelsSettings withLabelInclusionFilters(java.util.Collection<String> labelInclusionFilters) {
        setLabelInclusionFilters(labelInclusionFilters);
        return this;
    }

    /**
     * <p>
     * The labels that should be excluded from the return from DetectLabels.
     * </p>
     * 
     * @return The labels that should be excluded from the return from DetectLabels.
     */

    public java.util.List<String> getLabelExclusionFilters() {
        return labelExclusionFilters;
    }

    /**
     * <p>
     * The labels that should be excluded from the return from DetectLabels.
     * </p>
     * 
     * @param labelExclusionFilters
     *        The labels that should be excluded from the return from DetectLabels.
     */

    public void setLabelExclusionFilters(java.util.Collection<String> labelExclusionFilters) {
        if (labelExclusionFilters == null) {
            this.labelExclusionFilters = null;
            return;
        }

        this.labelExclusionFilters = new java.util.ArrayList<String>(labelExclusionFilters);
    }

    /**
     * <p>
     * The labels that should be excluded from the return from DetectLabels.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLabelExclusionFilters(java.util.Collection)} or
     * {@link #withLabelExclusionFilters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param labelExclusionFilters
     *        The labels that should be excluded from the return from DetectLabels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneralLabelsSettings withLabelExclusionFilters(String... labelExclusionFilters) {
        if (this.labelExclusionFilters == null) {
            setLabelExclusionFilters(new java.util.ArrayList<String>(labelExclusionFilters.length));
        }
        for (String ele : labelExclusionFilters) {
            this.labelExclusionFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The labels that should be excluded from the return from DetectLabels.
     * </p>
     * 
     * @param labelExclusionFilters
     *        The labels that should be excluded from the return from DetectLabels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneralLabelsSettings withLabelExclusionFilters(java.util.Collection<String> labelExclusionFilters) {
        setLabelExclusionFilters(labelExclusionFilters);
        return this;
    }

    /**
     * <p>
     * The label categories that should be included in the return from DetectLabels.
     * </p>
     * 
     * @return The label categories that should be included in the return from DetectLabels.
     */

    public java.util.List<String> getLabelCategoryInclusionFilters() {
        return labelCategoryInclusionFilters;
    }

    /**
     * <p>
     * The label categories that should be included in the return from DetectLabels.
     * </p>
     * 
     * @param labelCategoryInclusionFilters
     *        The label categories that should be included in the return from DetectLabels.
     */

    public void setLabelCategoryInclusionFilters(java.util.Collection<String> labelCategoryInclusionFilters) {
        if (labelCategoryInclusionFilters == null) {
            this.labelCategoryInclusionFilters = null;
            return;
        }

        this.labelCategoryInclusionFilters = new java.util.ArrayList<String>(labelCategoryInclusionFilters);
    }

    /**
     * <p>
     * The label categories that should be included in the return from DetectLabels.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLabelCategoryInclusionFilters(java.util.Collection)} or
     * {@link #withLabelCategoryInclusionFilters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param labelCategoryInclusionFilters
     *        The label categories that should be included in the return from DetectLabels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneralLabelsSettings withLabelCategoryInclusionFilters(String... labelCategoryInclusionFilters) {
        if (this.labelCategoryInclusionFilters == null) {
            setLabelCategoryInclusionFilters(new java.util.ArrayList<String>(labelCategoryInclusionFilters.length));
        }
        for (String ele : labelCategoryInclusionFilters) {
            this.labelCategoryInclusionFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The label categories that should be included in the return from DetectLabels.
     * </p>
     * 
     * @param labelCategoryInclusionFilters
     *        The label categories that should be included in the return from DetectLabels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneralLabelsSettings withLabelCategoryInclusionFilters(java.util.Collection<String> labelCategoryInclusionFilters) {
        setLabelCategoryInclusionFilters(labelCategoryInclusionFilters);
        return this;
    }

    /**
     * <p>
     * The label categories that should be excluded from the return from DetectLabels.
     * </p>
     * 
     * @return The label categories that should be excluded from the return from DetectLabels.
     */

    public java.util.List<String> getLabelCategoryExclusionFilters() {
        return labelCategoryExclusionFilters;
    }

    /**
     * <p>
     * The label categories that should be excluded from the return from DetectLabels.
     * </p>
     * 
     * @param labelCategoryExclusionFilters
     *        The label categories that should be excluded from the return from DetectLabels.
     */

    public void setLabelCategoryExclusionFilters(java.util.Collection<String> labelCategoryExclusionFilters) {
        if (labelCategoryExclusionFilters == null) {
            this.labelCategoryExclusionFilters = null;
            return;
        }

        this.labelCategoryExclusionFilters = new java.util.ArrayList<String>(labelCategoryExclusionFilters);
    }

    /**
     * <p>
     * The label categories that should be excluded from the return from DetectLabels.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLabelCategoryExclusionFilters(java.util.Collection)} or
     * {@link #withLabelCategoryExclusionFilters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param labelCategoryExclusionFilters
     *        The label categories that should be excluded from the return from DetectLabels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneralLabelsSettings withLabelCategoryExclusionFilters(String... labelCategoryExclusionFilters) {
        if (this.labelCategoryExclusionFilters == null) {
            setLabelCategoryExclusionFilters(new java.util.ArrayList<String>(labelCategoryExclusionFilters.length));
        }
        for (String ele : labelCategoryExclusionFilters) {
            this.labelCategoryExclusionFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The label categories that should be excluded from the return from DetectLabels.
     * </p>
     * 
     * @param labelCategoryExclusionFilters
     *        The label categories that should be excluded from the return from DetectLabels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeneralLabelsSettings withLabelCategoryExclusionFilters(java.util.Collection<String> labelCategoryExclusionFilters) {
        setLabelCategoryExclusionFilters(labelCategoryExclusionFilters);
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
        if (getLabelInclusionFilters() != null)
            sb.append("LabelInclusionFilters: ").append(getLabelInclusionFilters()).append(",");
        if (getLabelExclusionFilters() != null)
            sb.append("LabelExclusionFilters: ").append(getLabelExclusionFilters()).append(",");
        if (getLabelCategoryInclusionFilters() != null)
            sb.append("LabelCategoryInclusionFilters: ").append(getLabelCategoryInclusionFilters()).append(",");
        if (getLabelCategoryExclusionFilters() != null)
            sb.append("LabelCategoryExclusionFilters: ").append(getLabelCategoryExclusionFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeneralLabelsSettings == false)
            return false;
        GeneralLabelsSettings other = (GeneralLabelsSettings) obj;
        if (other.getLabelInclusionFilters() == null ^ this.getLabelInclusionFilters() == null)
            return false;
        if (other.getLabelInclusionFilters() != null && other.getLabelInclusionFilters().equals(this.getLabelInclusionFilters()) == false)
            return false;
        if (other.getLabelExclusionFilters() == null ^ this.getLabelExclusionFilters() == null)
            return false;
        if (other.getLabelExclusionFilters() != null && other.getLabelExclusionFilters().equals(this.getLabelExclusionFilters()) == false)
            return false;
        if (other.getLabelCategoryInclusionFilters() == null ^ this.getLabelCategoryInclusionFilters() == null)
            return false;
        if (other.getLabelCategoryInclusionFilters() != null
                && other.getLabelCategoryInclusionFilters().equals(this.getLabelCategoryInclusionFilters()) == false)
            return false;
        if (other.getLabelCategoryExclusionFilters() == null ^ this.getLabelCategoryExclusionFilters() == null)
            return false;
        if (other.getLabelCategoryExclusionFilters() != null
                && other.getLabelCategoryExclusionFilters().equals(this.getLabelCategoryExclusionFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabelInclusionFilters() == null) ? 0 : getLabelInclusionFilters().hashCode());
        hashCode = prime * hashCode + ((getLabelExclusionFilters() == null) ? 0 : getLabelExclusionFilters().hashCode());
        hashCode = prime * hashCode + ((getLabelCategoryInclusionFilters() == null) ? 0 : getLabelCategoryInclusionFilters().hashCode());
        hashCode = prime * hashCode + ((getLabelCategoryExclusionFilters() == null) ? 0 : getLabelCategoryExclusionFilters().hashCode());
        return hashCode;
    }

    @Override
    public GeneralLabelsSettings clone() {
        try {
            return (GeneralLabelsSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.GeneralLabelsSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
