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
 * The options that style a section.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SectionStyle" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SectionStyle implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The height of a section.
     * </p>
     * <p>
     * Heights can only be defined for header and footer sections. The default height margin is 0.5 inches.
     * </p>
     */
    private String height;
    /**
     * <p>
     * The spacing between section content and its top, bottom, left, and right edges.
     * </p>
     * <p>
     * There is no padding by default.
     * </p>
     */
    private Spacing padding;

    /**
     * <p>
     * The height of a section.
     * </p>
     * <p>
     * Heights can only be defined for header and footer sections. The default height margin is 0.5 inches.
     * </p>
     * 
     * @param height
     *        The height of a section.</p>
     *        <p>
     *        Heights can only be defined for header and footer sections. The default height margin is 0.5 inches.
     */

    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * <p>
     * The height of a section.
     * </p>
     * <p>
     * Heights can only be defined for header and footer sections. The default height margin is 0.5 inches.
     * </p>
     * 
     * @return The height of a section.</p>
     *         <p>
     *         Heights can only be defined for header and footer sections. The default height margin is 0.5 inches.
     */

    public String getHeight() {
        return this.height;
    }

    /**
     * <p>
     * The height of a section.
     * </p>
     * <p>
     * Heights can only be defined for header and footer sections. The default height margin is 0.5 inches.
     * </p>
     * 
     * @param height
     *        The height of a section.</p>
     *        <p>
     *        Heights can only be defined for header and footer sections. The default height margin is 0.5 inches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SectionStyle withHeight(String height) {
        setHeight(height);
        return this;
    }

    /**
     * <p>
     * The spacing between section content and its top, bottom, left, and right edges.
     * </p>
     * <p>
     * There is no padding by default.
     * </p>
     * 
     * @param padding
     *        The spacing between section content and its top, bottom, left, and right edges.</p>
     *        <p>
     *        There is no padding by default.
     */

    public void setPadding(Spacing padding) {
        this.padding = padding;
    }

    /**
     * <p>
     * The spacing between section content and its top, bottom, left, and right edges.
     * </p>
     * <p>
     * There is no padding by default.
     * </p>
     * 
     * @return The spacing between section content and its top, bottom, left, and right edges.</p>
     *         <p>
     *         There is no padding by default.
     */

    public Spacing getPadding() {
        return this.padding;
    }

    /**
     * <p>
     * The spacing between section content and its top, bottom, left, and right edges.
     * </p>
     * <p>
     * There is no padding by default.
     * </p>
     * 
     * @param padding
     *        The spacing between section content and its top, bottom, left, and right edges.</p>
     *        <p>
     *        There is no padding by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SectionStyle withPadding(Spacing padding) {
        setPadding(padding);
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
        if (getHeight() != null)
            sb.append("Height: ").append(getHeight()).append(",");
        if (getPadding() != null)
            sb.append("Padding: ").append(getPadding());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SectionStyle == false)
            return false;
        SectionStyle other = (SectionStyle) obj;
        if (other.getHeight() == null ^ this.getHeight() == null)
            return false;
        if (other.getHeight() != null && other.getHeight().equals(this.getHeight()) == false)
            return false;
        if (other.getPadding() == null ^ this.getPadding() == null)
            return false;
        if (other.getPadding() != null && other.getPadding().equals(this.getPadding()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeight() == null) ? 0 : getHeight().hashCode());
        hashCode = prime * hashCode + ((getPadding() == null) ? 0 : getPadding().hashCode());
        return hashCode;
    }

    @Override
    public SectionStyle clone() {
        try {
            return (SectionStyle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SectionStyleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
