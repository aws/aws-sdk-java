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
 * The options for the legend setup of a visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/LegendOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LegendOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines whether or not the legend is visible.
     * </p>
     */
    private String visibility;
    /**
     * <p>
     * The custom title for the legend.
     * </p>
     */
    private LabelOptions title;
    /**
     * <p>
     * The positions for the legend. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AUTO</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RIGHT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOTTOM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LEFT</code>
     * </p>
     * </li>
     * </ul>
     */
    private String position;
    /**
     * <p>
     * The width of the legend. If this value is omitted, a default width is used when rendering.
     * </p>
     */
    private String width;
    /**
     * <p>
     * The height of the legend. If this value is omitted, a default height is used when rendering.
     * </p>
     */
    private String height;

    /**
     * <p>
     * Determines whether or not the legend is visible.
     * </p>
     * 
     * @param visibility
     *        Determines whether or not the legend is visible.
     * @see Visibility
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * Determines whether or not the legend is visible.
     * </p>
     * 
     * @return Determines whether or not the legend is visible.
     * @see Visibility
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * Determines whether or not the legend is visible.
     * </p>
     * 
     * @param visibility
     *        Determines whether or not the legend is visible.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public LegendOptions withVisibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * Determines whether or not the legend is visible.
     * </p>
     * 
     * @param visibility
     *        Determines whether or not the legend is visible.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public LegendOptions withVisibility(Visibility visibility) {
        this.visibility = visibility.toString();
        return this;
    }

    /**
     * <p>
     * The custom title for the legend.
     * </p>
     * 
     * @param title
     *        The custom title for the legend.
     */

    public void setTitle(LabelOptions title) {
        this.title = title;
    }

    /**
     * <p>
     * The custom title for the legend.
     * </p>
     * 
     * @return The custom title for the legend.
     */

    public LabelOptions getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The custom title for the legend.
     * </p>
     * 
     * @param title
     *        The custom title for the legend.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LegendOptions withTitle(LabelOptions title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The positions for the legend. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AUTO</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RIGHT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOTTOM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LEFT</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param position
     *        The positions for the legend. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AUTO</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RIGHT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BOTTOM</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LEFT</code>
     *        </p>
     *        </li>
     * @see LegendPosition
     */

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * <p>
     * The positions for the legend. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AUTO</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RIGHT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOTTOM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LEFT</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The positions for the legend. Choose one of the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AUTO</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RIGHT</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BOTTOM</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LEFT</code>
     *         </p>
     *         </li>
     * @see LegendPosition
     */

    public String getPosition() {
        return this.position;
    }

    /**
     * <p>
     * The positions for the legend. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AUTO</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RIGHT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOTTOM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LEFT</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param position
     *        The positions for the legend. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AUTO</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RIGHT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BOTTOM</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LEFT</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LegendPosition
     */

    public LegendOptions withPosition(String position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * The positions for the legend. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AUTO</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RIGHT</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOTTOM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LEFT</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param position
     *        The positions for the legend. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AUTO</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RIGHT</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BOTTOM</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LEFT</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LegendPosition
     */

    public LegendOptions withPosition(LegendPosition position) {
        this.position = position.toString();
        return this;
    }

    /**
     * <p>
     * The width of the legend. If this value is omitted, a default width is used when rendering.
     * </p>
     * 
     * @param width
     *        The width of the legend. If this value is omitted, a default width is used when rendering.
     */

    public void setWidth(String width) {
        this.width = width;
    }

    /**
     * <p>
     * The width of the legend. If this value is omitted, a default width is used when rendering.
     * </p>
     * 
     * @return The width of the legend. If this value is omitted, a default width is used when rendering.
     */

    public String getWidth() {
        return this.width;
    }

    /**
     * <p>
     * The width of the legend. If this value is omitted, a default width is used when rendering.
     * </p>
     * 
     * @param width
     *        The width of the legend. If this value is omitted, a default width is used when rendering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LegendOptions withWidth(String width) {
        setWidth(width);
        return this;
    }

    /**
     * <p>
     * The height of the legend. If this value is omitted, a default height is used when rendering.
     * </p>
     * 
     * @param height
     *        The height of the legend. If this value is omitted, a default height is used when rendering.
     */

    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * <p>
     * The height of the legend. If this value is omitted, a default height is used when rendering.
     * </p>
     * 
     * @return The height of the legend. If this value is omitted, a default height is used when rendering.
     */

    public String getHeight() {
        return this.height;
    }

    /**
     * <p>
     * The height of the legend. If this value is omitted, a default height is used when rendering.
     * </p>
     * 
     * @param height
     *        The height of the legend. If this value is omitted, a default height is used when rendering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LegendOptions withHeight(String height) {
        setHeight(height);
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
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getPosition() != null)
            sb.append("Position: ").append(getPosition()).append(",");
        if (getWidth() != null)
            sb.append("Width: ").append(getWidth()).append(",");
        if (getHeight() != null)
            sb.append("Height: ").append(getHeight());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LegendOptions == false)
            return false;
        LegendOptions other = (LegendOptions) obj;
        if (other.getVisibility() == null ^ this.getVisibility() == null)
            return false;
        if (other.getVisibility() != null && other.getVisibility().equals(this.getVisibility()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getWidth() == null ^ this.getWidth() == null)
            return false;
        if (other.getWidth() != null && other.getWidth().equals(this.getWidth()) == false)
            return false;
        if (other.getHeight() == null ^ this.getHeight() == null)
            return false;
        if (other.getHeight() != null && other.getHeight().equals(this.getHeight()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getWidth() == null) ? 0 : getWidth().hashCode());
        hashCode = prime * hashCode + ((getHeight() == null) ? 0 : getHeight().hashCode());
        return hashCode;
    }

    @Override
    public LegendOptions clone() {
        try {
            return (LegendOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.LegendOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
