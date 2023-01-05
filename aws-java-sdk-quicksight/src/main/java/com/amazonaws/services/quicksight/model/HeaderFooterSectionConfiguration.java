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
 * The configuration of a header or footer section.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/HeaderFooterSectionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HeaderFooterSectionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the header or footer section.
     * </p>
     */
    private String sectionId;
    /**
     * <p>
     * The layout configuration of the header or footer section.
     * </p>
     */
    private SectionLayoutConfiguration layout;
    /**
     * <p>
     * The style options of a header or footer section.
     * </p>
     */
    private SectionStyle style;

    /**
     * <p>
     * The unique identifier of the header or footer section.
     * </p>
     * 
     * @param sectionId
     *        The unique identifier of the header or footer section.
     */

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    /**
     * <p>
     * The unique identifier of the header or footer section.
     * </p>
     * 
     * @return The unique identifier of the header or footer section.
     */

    public String getSectionId() {
        return this.sectionId;
    }

    /**
     * <p>
     * The unique identifier of the header or footer section.
     * </p>
     * 
     * @param sectionId
     *        The unique identifier of the header or footer section.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeaderFooterSectionConfiguration withSectionId(String sectionId) {
        setSectionId(sectionId);
        return this;
    }

    /**
     * <p>
     * The layout configuration of the header or footer section.
     * </p>
     * 
     * @param layout
     *        The layout configuration of the header or footer section.
     */

    public void setLayout(SectionLayoutConfiguration layout) {
        this.layout = layout;
    }

    /**
     * <p>
     * The layout configuration of the header or footer section.
     * </p>
     * 
     * @return The layout configuration of the header or footer section.
     */

    public SectionLayoutConfiguration getLayout() {
        return this.layout;
    }

    /**
     * <p>
     * The layout configuration of the header or footer section.
     * </p>
     * 
     * @param layout
     *        The layout configuration of the header or footer section.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeaderFooterSectionConfiguration withLayout(SectionLayoutConfiguration layout) {
        setLayout(layout);
        return this;
    }

    /**
     * <p>
     * The style options of a header or footer section.
     * </p>
     * 
     * @param style
     *        The style options of a header or footer section.
     */

    public void setStyle(SectionStyle style) {
        this.style = style;
    }

    /**
     * <p>
     * The style options of a header or footer section.
     * </p>
     * 
     * @return The style options of a header or footer section.
     */

    public SectionStyle getStyle() {
        return this.style;
    }

    /**
     * <p>
     * The style options of a header or footer section.
     * </p>
     * 
     * @param style
     *        The style options of a header or footer section.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeaderFooterSectionConfiguration withStyle(SectionStyle style) {
        setStyle(style);
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
        if (getSectionId() != null)
            sb.append("SectionId: ").append(getSectionId()).append(",");
        if (getLayout() != null)
            sb.append("Layout: ").append(getLayout()).append(",");
        if (getStyle() != null)
            sb.append("Style: ").append(getStyle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HeaderFooterSectionConfiguration == false)
            return false;
        HeaderFooterSectionConfiguration other = (HeaderFooterSectionConfiguration) obj;
        if (other.getSectionId() == null ^ this.getSectionId() == null)
            return false;
        if (other.getSectionId() != null && other.getSectionId().equals(this.getSectionId()) == false)
            return false;
        if (other.getLayout() == null ^ this.getLayout() == null)
            return false;
        if (other.getLayout() != null && other.getLayout().equals(this.getLayout()) == false)
            return false;
        if (other.getStyle() == null ^ this.getStyle() == null)
            return false;
        if (other.getStyle() != null && other.getStyle().equals(this.getStyle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSectionId() == null) ? 0 : getSectionId().hashCode());
        hashCode = prime * hashCode + ((getLayout() == null) ? 0 : getLayout().hashCode());
        hashCode = prime * hashCode + ((getStyle() == null) ? 0 : getStyle().hashCode());
        return hashCode;
    }

    @Override
    public HeaderFooterSectionConfiguration clone() {
        try {
            return (HeaderFooterSectionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.HeaderFooterSectionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
