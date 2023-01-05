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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Default button configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DefaultButtonConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultButtonConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The background color of the button.
     * </p>
     */
    private String backgroundColor;
    /**
     * <p>
     * The border radius of the button.
     * </p>
     */
    private Integer borderRadius;
    /**
     * <p>
     * Action triggered by the button.
     * </p>
     */
    private String buttonAction;
    /**
     * <p>
     * Button destination.
     * </p>
     */
    private String link;
    /**
     * <p>
     * Button text.
     * </p>
     */
    private String text;
    /**
     * <p>
     * The text color of the button.
     * </p>
     */
    private String textColor;

    /**
     * <p>
     * The background color of the button.
     * </p>
     * 
     * @param backgroundColor
     *        The background color of the button.
     */

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    /**
     * <p>
     * The background color of the button.
     * </p>
     * 
     * @return The background color of the button.
     */

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    /**
     * <p>
     * The background color of the button.
     * </p>
     * 
     * @param backgroundColor
     *        The background color of the button.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultButtonConfiguration withBackgroundColor(String backgroundColor) {
        setBackgroundColor(backgroundColor);
        return this;
    }

    /**
     * <p>
     * The border radius of the button.
     * </p>
     * 
     * @param borderRadius
     *        The border radius of the button.
     */

    public void setBorderRadius(Integer borderRadius) {
        this.borderRadius = borderRadius;
    }

    /**
     * <p>
     * The border radius of the button.
     * </p>
     * 
     * @return The border radius of the button.
     */

    public Integer getBorderRadius() {
        return this.borderRadius;
    }

    /**
     * <p>
     * The border radius of the button.
     * </p>
     * 
     * @param borderRadius
     *        The border radius of the button.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultButtonConfiguration withBorderRadius(Integer borderRadius) {
        setBorderRadius(borderRadius);
        return this;
    }

    /**
     * <p>
     * Action triggered by the button.
     * </p>
     * 
     * @param buttonAction
     *        Action triggered by the button.
     * @see ButtonAction
     */

    public void setButtonAction(String buttonAction) {
        this.buttonAction = buttonAction;
    }

    /**
     * <p>
     * Action triggered by the button.
     * </p>
     * 
     * @return Action triggered by the button.
     * @see ButtonAction
     */

    public String getButtonAction() {
        return this.buttonAction;
    }

    /**
     * <p>
     * Action triggered by the button.
     * </p>
     * 
     * @param buttonAction
     *        Action triggered by the button.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ButtonAction
     */

    public DefaultButtonConfiguration withButtonAction(String buttonAction) {
        setButtonAction(buttonAction);
        return this;
    }

    /**
     * <p>
     * Action triggered by the button.
     * </p>
     * 
     * @param buttonAction
     *        Action triggered by the button.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ButtonAction
     */

    public DefaultButtonConfiguration withButtonAction(ButtonAction buttonAction) {
        this.buttonAction = buttonAction.toString();
        return this;
    }

    /**
     * <p>
     * Button destination.
     * </p>
     * 
     * @param link
     *        Button destination.
     */

    public void setLink(String link) {
        this.link = link;
    }

    /**
     * <p>
     * Button destination.
     * </p>
     * 
     * @return Button destination.
     */

    public String getLink() {
        return this.link;
    }

    /**
     * <p>
     * Button destination.
     * </p>
     * 
     * @param link
     *        Button destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultButtonConfiguration withLink(String link) {
        setLink(link);
        return this;
    }

    /**
     * <p>
     * Button text.
     * </p>
     * 
     * @param text
     *        Button text.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * Button text.
     * </p>
     * 
     * @return Button text.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * Button text.
     * </p>
     * 
     * @param text
     *        Button text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultButtonConfiguration withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * The text color of the button.
     * </p>
     * 
     * @param textColor
     *        The text color of the button.
     */

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    /**
     * <p>
     * The text color of the button.
     * </p>
     * 
     * @return The text color of the button.
     */

    public String getTextColor() {
        return this.textColor;
    }

    /**
     * <p>
     * The text color of the button.
     * </p>
     * 
     * @param textColor
     *        The text color of the button.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultButtonConfiguration withTextColor(String textColor) {
        setTextColor(textColor);
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
        if (getBackgroundColor() != null)
            sb.append("BackgroundColor: ").append(getBackgroundColor()).append(",");
        if (getBorderRadius() != null)
            sb.append("BorderRadius: ").append(getBorderRadius()).append(",");
        if (getButtonAction() != null)
            sb.append("ButtonAction: ").append(getButtonAction()).append(",");
        if (getLink() != null)
            sb.append("Link: ").append(getLink()).append(",");
        if (getText() != null)
            sb.append("Text: ").append(getText()).append(",");
        if (getTextColor() != null)
            sb.append("TextColor: ").append(getTextColor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultButtonConfiguration == false)
            return false;
        DefaultButtonConfiguration other = (DefaultButtonConfiguration) obj;
        if (other.getBackgroundColor() == null ^ this.getBackgroundColor() == null)
            return false;
        if (other.getBackgroundColor() != null && other.getBackgroundColor().equals(this.getBackgroundColor()) == false)
            return false;
        if (other.getBorderRadius() == null ^ this.getBorderRadius() == null)
            return false;
        if (other.getBorderRadius() != null && other.getBorderRadius().equals(this.getBorderRadius()) == false)
            return false;
        if (other.getButtonAction() == null ^ this.getButtonAction() == null)
            return false;
        if (other.getButtonAction() != null && other.getButtonAction().equals(this.getButtonAction()) == false)
            return false;
        if (other.getLink() == null ^ this.getLink() == null)
            return false;
        if (other.getLink() != null && other.getLink().equals(this.getLink()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getTextColor() == null ^ this.getTextColor() == null)
            return false;
        if (other.getTextColor() != null && other.getTextColor().equals(this.getTextColor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackgroundColor() == null) ? 0 : getBackgroundColor().hashCode());
        hashCode = prime * hashCode + ((getBorderRadius() == null) ? 0 : getBorderRadius().hashCode());
        hashCode = prime * hashCode + ((getButtonAction() == null) ? 0 : getButtonAction().hashCode());
        hashCode = prime * hashCode + ((getLink() == null) ? 0 : getLink().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getTextColor() == null) ? 0 : getTextColor().hashCode());
        return hashCode;
    }

    @Override
    public DefaultButtonConfiguration clone() {
        try {
            return (DefaultButtonConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.DefaultButtonConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
