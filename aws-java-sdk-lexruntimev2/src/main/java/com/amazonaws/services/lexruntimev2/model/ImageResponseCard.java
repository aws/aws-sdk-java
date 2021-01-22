/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexruntimev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A card that is shown to the user by a messaging platform. You define the contents of the card, the card is displayed
 * by the platform.
 * </p>
 * <p>
 * When you use a response card, the response from the user is constrained to the text associated with a button on the
 * card.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/ImageResponseCard" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageResponseCard implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The title to display on the response card. The format of the title is determined by the platform displaying the
     * response card.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The subtitle to display on the response card. The format of the subtitle is determined by the platform displaying
     * the response card.
     * </p>
     */
    private String subtitle;
    /**
     * <p>
     * The URL of an image to display on the response card. The image URL must be publicly available so that the
     * platform displaying the response card has access to the image.
     * </p>
     */
    private String imageUrl;
    /**
     * <p>
     * A list of buttons that should be displayed on the response card. The arrangement of the buttons is determined by
     * the platform that displays the button.
     * </p>
     */
    private java.util.List<Button> buttons;

    /**
     * <p>
     * The title to display on the response card. The format of the title is determined by the platform displaying the
     * response card.
     * </p>
     * 
     * @param title
     *        The title to display on the response card. The format of the title is determined by the platform
     *        displaying the response card.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title to display on the response card. The format of the title is determined by the platform displaying the
     * response card.
     * </p>
     * 
     * @return The title to display on the response card. The format of the title is determined by the platform
     *         displaying the response card.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title to display on the response card. The format of the title is determined by the platform displaying the
     * response card.
     * </p>
     * 
     * @param title
     *        The title to display on the response card. The format of the title is determined by the platform
     *        displaying the response card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageResponseCard withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The subtitle to display on the response card. The format of the subtitle is determined by the platform displaying
     * the response card.
     * </p>
     * 
     * @param subtitle
     *        The subtitle to display on the response card. The format of the subtitle is determined by the platform
     *        displaying the response card.
     */

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    /**
     * <p>
     * The subtitle to display on the response card. The format of the subtitle is determined by the platform displaying
     * the response card.
     * </p>
     * 
     * @return The subtitle to display on the response card. The format of the subtitle is determined by the platform
     *         displaying the response card.
     */

    public String getSubtitle() {
        return this.subtitle;
    }

    /**
     * <p>
     * The subtitle to display on the response card. The format of the subtitle is determined by the platform displaying
     * the response card.
     * </p>
     * 
     * @param subtitle
     *        The subtitle to display on the response card. The format of the subtitle is determined by the platform
     *        displaying the response card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageResponseCard withSubtitle(String subtitle) {
        setSubtitle(subtitle);
        return this;
    }

    /**
     * <p>
     * The URL of an image to display on the response card. The image URL must be publicly available so that the
     * platform displaying the response card has access to the image.
     * </p>
     * 
     * @param imageUrl
     *        The URL of an image to display on the response card. The image URL must be publicly available so that the
     *        platform displaying the response card has access to the image.
     */

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * <p>
     * The URL of an image to display on the response card. The image URL must be publicly available so that the
     * platform displaying the response card has access to the image.
     * </p>
     * 
     * @return The URL of an image to display on the response card. The image URL must be publicly available so that the
     *         platform displaying the response card has access to the image.
     */

    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * <p>
     * The URL of an image to display on the response card. The image URL must be publicly available so that the
     * platform displaying the response card has access to the image.
     * </p>
     * 
     * @param imageUrl
     *        The URL of an image to display on the response card. The image URL must be publicly available so that the
     *        platform displaying the response card has access to the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageResponseCard withImageUrl(String imageUrl) {
        setImageUrl(imageUrl);
        return this;
    }

    /**
     * <p>
     * A list of buttons that should be displayed on the response card. The arrangement of the buttons is determined by
     * the platform that displays the button.
     * </p>
     * 
     * @return A list of buttons that should be displayed on the response card. The arrangement of the buttons is
     *         determined by the platform that displays the button.
     */

    public java.util.List<Button> getButtons() {
        return buttons;
    }

    /**
     * <p>
     * A list of buttons that should be displayed on the response card. The arrangement of the buttons is determined by
     * the platform that displays the button.
     * </p>
     * 
     * @param buttons
     *        A list of buttons that should be displayed on the response card. The arrangement of the buttons is
     *        determined by the platform that displays the button.
     */

    public void setButtons(java.util.Collection<Button> buttons) {
        if (buttons == null) {
            this.buttons = null;
            return;
        }

        this.buttons = new java.util.ArrayList<Button>(buttons);
    }

    /**
     * <p>
     * A list of buttons that should be displayed on the response card. The arrangement of the buttons is determined by
     * the platform that displays the button.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setButtons(java.util.Collection)} or {@link #withButtons(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param buttons
     *        A list of buttons that should be displayed on the response card. The arrangement of the buttons is
     *        determined by the platform that displays the button.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageResponseCard withButtons(Button... buttons) {
        if (this.buttons == null) {
            setButtons(new java.util.ArrayList<Button>(buttons.length));
        }
        for (Button ele : buttons) {
            this.buttons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of buttons that should be displayed on the response card. The arrangement of the buttons is determined by
     * the platform that displays the button.
     * </p>
     * 
     * @param buttons
     *        A list of buttons that should be displayed on the response card. The arrangement of the buttons is
     *        determined by the platform that displays the button.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageResponseCard withButtons(java.util.Collection<Button> buttons) {
        setButtons(buttons);
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
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getSubtitle() != null)
            sb.append("Subtitle: ").append(getSubtitle()).append(",");
        if (getImageUrl() != null)
            sb.append("ImageUrl: ").append(getImageUrl()).append(",");
        if (getButtons() != null)
            sb.append("Buttons: ").append(getButtons());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageResponseCard == false)
            return false;
        ImageResponseCard other = (ImageResponseCard) obj;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getSubtitle() == null ^ this.getSubtitle() == null)
            return false;
        if (other.getSubtitle() != null && other.getSubtitle().equals(this.getSubtitle()) == false)
            return false;
        if (other.getImageUrl() == null ^ this.getImageUrl() == null)
            return false;
        if (other.getImageUrl() != null && other.getImageUrl().equals(this.getImageUrl()) == false)
            return false;
        if (other.getButtons() == null ^ this.getButtons() == null)
            return false;
        if (other.getButtons() != null && other.getButtons().equals(this.getButtons()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getSubtitle() == null) ? 0 : getSubtitle().hashCode());
        hashCode = prime * hashCode + ((getImageUrl() == null) ? 0 : getImageUrl().hashCode());
        hashCode = prime * hashCode + ((getButtons() == null) ? 0 : getButtons().hashCode());
        return hashCode;
    }

    @Override
    public ImageResponseCard clone() {
        try {
            return (ImageResponseCard) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexruntimev2.model.transform.ImageResponseCardMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
