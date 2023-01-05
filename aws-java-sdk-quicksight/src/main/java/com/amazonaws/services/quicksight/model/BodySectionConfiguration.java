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
 * The configuration of a body section.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/BodySectionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BodySectionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of a body section.
     * </p>
     */
    private String sectionId;
    /**
     * <p>
     * The configuration of content in a body section.
     * </p>
     */
    private BodySectionContent content;
    /**
     * <p>
     * The style options of a body section.
     * </p>
     */
    private SectionStyle style;
    /**
     * <p>
     * The configuration of a page break for a section.
     * </p>
     */
    private SectionPageBreakConfiguration pageBreakConfiguration;

    /**
     * <p>
     * The unique identifier of a body section.
     * </p>
     * 
     * @param sectionId
     *        The unique identifier of a body section.
     */

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    /**
     * <p>
     * The unique identifier of a body section.
     * </p>
     * 
     * @return The unique identifier of a body section.
     */

    public String getSectionId() {
        return this.sectionId;
    }

    /**
     * <p>
     * The unique identifier of a body section.
     * </p>
     * 
     * @param sectionId
     *        The unique identifier of a body section.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BodySectionConfiguration withSectionId(String sectionId) {
        setSectionId(sectionId);
        return this;
    }

    /**
     * <p>
     * The configuration of content in a body section.
     * </p>
     * 
     * @param content
     *        The configuration of content in a body section.
     */

    public void setContent(BodySectionContent content) {
        this.content = content;
    }

    /**
     * <p>
     * The configuration of content in a body section.
     * </p>
     * 
     * @return The configuration of content in a body section.
     */

    public BodySectionContent getContent() {
        return this.content;
    }

    /**
     * <p>
     * The configuration of content in a body section.
     * </p>
     * 
     * @param content
     *        The configuration of content in a body section.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BodySectionConfiguration withContent(BodySectionContent content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The style options of a body section.
     * </p>
     * 
     * @param style
     *        The style options of a body section.
     */

    public void setStyle(SectionStyle style) {
        this.style = style;
    }

    /**
     * <p>
     * The style options of a body section.
     * </p>
     * 
     * @return The style options of a body section.
     */

    public SectionStyle getStyle() {
        return this.style;
    }

    /**
     * <p>
     * The style options of a body section.
     * </p>
     * 
     * @param style
     *        The style options of a body section.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BodySectionConfiguration withStyle(SectionStyle style) {
        setStyle(style);
        return this;
    }

    /**
     * <p>
     * The configuration of a page break for a section.
     * </p>
     * 
     * @param pageBreakConfiguration
     *        The configuration of a page break for a section.
     */

    public void setPageBreakConfiguration(SectionPageBreakConfiguration pageBreakConfiguration) {
        this.pageBreakConfiguration = pageBreakConfiguration;
    }

    /**
     * <p>
     * The configuration of a page break for a section.
     * </p>
     * 
     * @return The configuration of a page break for a section.
     */

    public SectionPageBreakConfiguration getPageBreakConfiguration() {
        return this.pageBreakConfiguration;
    }

    /**
     * <p>
     * The configuration of a page break for a section.
     * </p>
     * 
     * @param pageBreakConfiguration
     *        The configuration of a page break for a section.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BodySectionConfiguration withPageBreakConfiguration(SectionPageBreakConfiguration pageBreakConfiguration) {
        setPageBreakConfiguration(pageBreakConfiguration);
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
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getStyle() != null)
            sb.append("Style: ").append(getStyle()).append(",");
        if (getPageBreakConfiguration() != null)
            sb.append("PageBreakConfiguration: ").append(getPageBreakConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BodySectionConfiguration == false)
            return false;
        BodySectionConfiguration other = (BodySectionConfiguration) obj;
        if (other.getSectionId() == null ^ this.getSectionId() == null)
            return false;
        if (other.getSectionId() != null && other.getSectionId().equals(this.getSectionId()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getStyle() == null ^ this.getStyle() == null)
            return false;
        if (other.getStyle() != null && other.getStyle().equals(this.getStyle()) == false)
            return false;
        if (other.getPageBreakConfiguration() == null ^ this.getPageBreakConfiguration() == null)
            return false;
        if (other.getPageBreakConfiguration() != null && other.getPageBreakConfiguration().equals(this.getPageBreakConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSectionId() == null) ? 0 : getSectionId().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getStyle() == null) ? 0 : getStyle().hashCode());
        hashCode = prime * hashCode + ((getPageBreakConfiguration() == null) ? 0 : getPageBreakConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public BodySectionConfiguration clone() {
        try {
            return (BodySectionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.BodySectionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
