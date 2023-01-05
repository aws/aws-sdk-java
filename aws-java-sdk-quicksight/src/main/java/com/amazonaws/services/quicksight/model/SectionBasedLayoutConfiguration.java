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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for a section-based layout.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SectionBasedLayoutConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SectionBasedLayoutConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of header section configurations.
     * </p>
     */
    private java.util.List<HeaderFooterSectionConfiguration> headerSections;
    /**
     * <p>
     * A list of body section configurations.
     * </p>
     */
    private java.util.List<BodySectionConfiguration> bodySections;
    /**
     * <p>
     * A list of footer section configurations.
     * </p>
     */
    private java.util.List<HeaderFooterSectionConfiguration> footerSections;
    /**
     * <p>
     * The options for the canvas of a section-based layout.
     * </p>
     */
    private SectionBasedLayoutCanvasSizeOptions canvasSizeOptions;

    /**
     * <p>
     * A list of header section configurations.
     * </p>
     * 
     * @return A list of header section configurations.
     */

    public java.util.List<HeaderFooterSectionConfiguration> getHeaderSections() {
        return headerSections;
    }

    /**
     * <p>
     * A list of header section configurations.
     * </p>
     * 
     * @param headerSections
     *        A list of header section configurations.
     */

    public void setHeaderSections(java.util.Collection<HeaderFooterSectionConfiguration> headerSections) {
        if (headerSections == null) {
            this.headerSections = null;
            return;
        }

        this.headerSections = new java.util.ArrayList<HeaderFooterSectionConfiguration>(headerSections);
    }

    /**
     * <p>
     * A list of header section configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHeaderSections(java.util.Collection)} or {@link #withHeaderSections(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param headerSections
     *        A list of header section configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SectionBasedLayoutConfiguration withHeaderSections(HeaderFooterSectionConfiguration... headerSections) {
        if (this.headerSections == null) {
            setHeaderSections(new java.util.ArrayList<HeaderFooterSectionConfiguration>(headerSections.length));
        }
        for (HeaderFooterSectionConfiguration ele : headerSections) {
            this.headerSections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of header section configurations.
     * </p>
     * 
     * @param headerSections
     *        A list of header section configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SectionBasedLayoutConfiguration withHeaderSections(java.util.Collection<HeaderFooterSectionConfiguration> headerSections) {
        setHeaderSections(headerSections);
        return this;
    }

    /**
     * <p>
     * A list of body section configurations.
     * </p>
     * 
     * @return A list of body section configurations.
     */

    public java.util.List<BodySectionConfiguration> getBodySections() {
        return bodySections;
    }

    /**
     * <p>
     * A list of body section configurations.
     * </p>
     * 
     * @param bodySections
     *        A list of body section configurations.
     */

    public void setBodySections(java.util.Collection<BodySectionConfiguration> bodySections) {
        if (bodySections == null) {
            this.bodySections = null;
            return;
        }

        this.bodySections = new java.util.ArrayList<BodySectionConfiguration>(bodySections);
    }

    /**
     * <p>
     * A list of body section configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBodySections(java.util.Collection)} or {@link #withBodySections(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param bodySections
     *        A list of body section configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SectionBasedLayoutConfiguration withBodySections(BodySectionConfiguration... bodySections) {
        if (this.bodySections == null) {
            setBodySections(new java.util.ArrayList<BodySectionConfiguration>(bodySections.length));
        }
        for (BodySectionConfiguration ele : bodySections) {
            this.bodySections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of body section configurations.
     * </p>
     * 
     * @param bodySections
     *        A list of body section configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SectionBasedLayoutConfiguration withBodySections(java.util.Collection<BodySectionConfiguration> bodySections) {
        setBodySections(bodySections);
        return this;
    }

    /**
     * <p>
     * A list of footer section configurations.
     * </p>
     * 
     * @return A list of footer section configurations.
     */

    public java.util.List<HeaderFooterSectionConfiguration> getFooterSections() {
        return footerSections;
    }

    /**
     * <p>
     * A list of footer section configurations.
     * </p>
     * 
     * @param footerSections
     *        A list of footer section configurations.
     */

    public void setFooterSections(java.util.Collection<HeaderFooterSectionConfiguration> footerSections) {
        if (footerSections == null) {
            this.footerSections = null;
            return;
        }

        this.footerSections = new java.util.ArrayList<HeaderFooterSectionConfiguration>(footerSections);
    }

    /**
     * <p>
     * A list of footer section configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFooterSections(java.util.Collection)} or {@link #withFooterSections(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param footerSections
     *        A list of footer section configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SectionBasedLayoutConfiguration withFooterSections(HeaderFooterSectionConfiguration... footerSections) {
        if (this.footerSections == null) {
            setFooterSections(new java.util.ArrayList<HeaderFooterSectionConfiguration>(footerSections.length));
        }
        for (HeaderFooterSectionConfiguration ele : footerSections) {
            this.footerSections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of footer section configurations.
     * </p>
     * 
     * @param footerSections
     *        A list of footer section configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SectionBasedLayoutConfiguration withFooterSections(java.util.Collection<HeaderFooterSectionConfiguration> footerSections) {
        setFooterSections(footerSections);
        return this;
    }

    /**
     * <p>
     * The options for the canvas of a section-based layout.
     * </p>
     * 
     * @param canvasSizeOptions
     *        The options for the canvas of a section-based layout.
     */

    public void setCanvasSizeOptions(SectionBasedLayoutCanvasSizeOptions canvasSizeOptions) {
        this.canvasSizeOptions = canvasSizeOptions;
    }

    /**
     * <p>
     * The options for the canvas of a section-based layout.
     * </p>
     * 
     * @return The options for the canvas of a section-based layout.
     */

    public SectionBasedLayoutCanvasSizeOptions getCanvasSizeOptions() {
        return this.canvasSizeOptions;
    }

    /**
     * <p>
     * The options for the canvas of a section-based layout.
     * </p>
     * 
     * @param canvasSizeOptions
     *        The options for the canvas of a section-based layout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SectionBasedLayoutConfiguration withCanvasSizeOptions(SectionBasedLayoutCanvasSizeOptions canvasSizeOptions) {
        setCanvasSizeOptions(canvasSizeOptions);
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
        if (getHeaderSections() != null)
            sb.append("HeaderSections: ").append(getHeaderSections()).append(",");
        if (getBodySections() != null)
            sb.append("BodySections: ").append(getBodySections()).append(",");
        if (getFooterSections() != null)
            sb.append("FooterSections: ").append(getFooterSections()).append(",");
        if (getCanvasSizeOptions() != null)
            sb.append("CanvasSizeOptions: ").append(getCanvasSizeOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SectionBasedLayoutConfiguration == false)
            return false;
        SectionBasedLayoutConfiguration other = (SectionBasedLayoutConfiguration) obj;
        if (other.getHeaderSections() == null ^ this.getHeaderSections() == null)
            return false;
        if (other.getHeaderSections() != null && other.getHeaderSections().equals(this.getHeaderSections()) == false)
            return false;
        if (other.getBodySections() == null ^ this.getBodySections() == null)
            return false;
        if (other.getBodySections() != null && other.getBodySections().equals(this.getBodySections()) == false)
            return false;
        if (other.getFooterSections() == null ^ this.getFooterSections() == null)
            return false;
        if (other.getFooterSections() != null && other.getFooterSections().equals(this.getFooterSections()) == false)
            return false;
        if (other.getCanvasSizeOptions() == null ^ this.getCanvasSizeOptions() == null)
            return false;
        if (other.getCanvasSizeOptions() != null && other.getCanvasSizeOptions().equals(this.getCanvasSizeOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeaderSections() == null) ? 0 : getHeaderSections().hashCode());
        hashCode = prime * hashCode + ((getBodySections() == null) ? 0 : getBodySections().hashCode());
        hashCode = prime * hashCode + ((getFooterSections() == null) ? 0 : getFooterSections().hashCode());
        hashCode = prime * hashCode + ((getCanvasSizeOptions() == null) ? 0 : getCanvasSizeOptions().hashCode());
        return hashCode;
    }

    @Override
    public SectionBasedLayoutConfiguration clone() {
        try {
            return (SectionBasedLayoutConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SectionBasedLayoutConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
