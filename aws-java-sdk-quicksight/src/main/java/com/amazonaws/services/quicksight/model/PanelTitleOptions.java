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
 * The options that determine the title styles for each small multiples panel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/PanelTitleOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PanelTitleOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines whether or not panel titles are displayed.
     * </p>
     */
    private String visibility;

    private FontConfiguration fontConfiguration;
    /**
     * <p>
     * Sets the horizontal text alignment of the title within each panel.
     * </p>
     */
    private String horizontalTextAlignment;

    /**
     * <p>
     * Determines whether or not panel titles are displayed.
     * </p>
     * 
     * @param visibility
     *        Determines whether or not panel titles are displayed.
     * @see Visibility
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * Determines whether or not panel titles are displayed.
     * </p>
     * 
     * @return Determines whether or not panel titles are displayed.
     * @see Visibility
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * Determines whether or not panel titles are displayed.
     * </p>
     * 
     * @param visibility
     *        Determines whether or not panel titles are displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public PanelTitleOptions withVisibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * Determines whether or not panel titles are displayed.
     * </p>
     * 
     * @param visibility
     *        Determines whether or not panel titles are displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public PanelTitleOptions withVisibility(Visibility visibility) {
        this.visibility = visibility.toString();
        return this;
    }

    /**
     * @param fontConfiguration
     */

    public void setFontConfiguration(FontConfiguration fontConfiguration) {
        this.fontConfiguration = fontConfiguration;
    }

    /**
     * @return
     */

    public FontConfiguration getFontConfiguration() {
        return this.fontConfiguration;
    }

    /**
     * @param fontConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PanelTitleOptions withFontConfiguration(FontConfiguration fontConfiguration) {
        setFontConfiguration(fontConfiguration);
        return this;
    }

    /**
     * <p>
     * Sets the horizontal text alignment of the title within each panel.
     * </p>
     * 
     * @param horizontalTextAlignment
     *        Sets the horizontal text alignment of the title within each panel.
     * @see HorizontalTextAlignment
     */

    public void setHorizontalTextAlignment(String horizontalTextAlignment) {
        this.horizontalTextAlignment = horizontalTextAlignment;
    }

    /**
     * <p>
     * Sets the horizontal text alignment of the title within each panel.
     * </p>
     * 
     * @return Sets the horizontal text alignment of the title within each panel.
     * @see HorizontalTextAlignment
     */

    public String getHorizontalTextAlignment() {
        return this.horizontalTextAlignment;
    }

    /**
     * <p>
     * Sets the horizontal text alignment of the title within each panel.
     * </p>
     * 
     * @param horizontalTextAlignment
     *        Sets the horizontal text alignment of the title within each panel.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HorizontalTextAlignment
     */

    public PanelTitleOptions withHorizontalTextAlignment(String horizontalTextAlignment) {
        setHorizontalTextAlignment(horizontalTextAlignment);
        return this;
    }

    /**
     * <p>
     * Sets the horizontal text alignment of the title within each panel.
     * </p>
     * 
     * @param horizontalTextAlignment
     *        Sets the horizontal text alignment of the title within each panel.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HorizontalTextAlignment
     */

    public PanelTitleOptions withHorizontalTextAlignment(HorizontalTextAlignment horizontalTextAlignment) {
        this.horizontalTextAlignment = horizontalTextAlignment.toString();
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
        if (getVisibility() != null)
            sb.append("Visibility: ").append(getVisibility()).append(",");
        if (getFontConfiguration() != null)
            sb.append("FontConfiguration: ").append(getFontConfiguration()).append(",");
        if (getHorizontalTextAlignment() != null)
            sb.append("HorizontalTextAlignment: ").append(getHorizontalTextAlignment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PanelTitleOptions == false)
            return false;
        PanelTitleOptions other = (PanelTitleOptions) obj;
        if (other.getVisibility() == null ^ this.getVisibility() == null)
            return false;
        if (other.getVisibility() != null && other.getVisibility().equals(this.getVisibility()) == false)
            return false;
        if (other.getFontConfiguration() == null ^ this.getFontConfiguration() == null)
            return false;
        if (other.getFontConfiguration() != null && other.getFontConfiguration().equals(this.getFontConfiguration()) == false)
            return false;
        if (other.getHorizontalTextAlignment() == null ^ this.getHorizontalTextAlignment() == null)
            return false;
        if (other.getHorizontalTextAlignment() != null && other.getHorizontalTextAlignment().equals(this.getHorizontalTextAlignment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        hashCode = prime * hashCode + ((getFontConfiguration() == null) ? 0 : getFontConfiguration().hashCode());
        hashCode = prime * hashCode + ((getHorizontalTextAlignment() == null) ? 0 : getHorizontalTextAlignment().hashCode());
        return hashCode;
    }

    @Override
    public PanelTitleOptions clone() {
        try {
            return (PanelTitleOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.PanelTitleOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
