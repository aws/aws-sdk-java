/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents an option rendered to the user when a prompt is shown. It could be an image, a button, a link, or text.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex-2016-11-28/GenericAttachment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenericAttachment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The title of the option.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The subtitle shown below the title.
     * </p>
     */
    private String subTitle;
    /**
     * <p>
     * The URL of an attachment to the response card.
     * </p>
     */
    private String attachmentLinkUrl;
    /**
     * <p>
     * The URL of an image that is displayed to the user.
     * </p>
     */
    private String imageUrl;
    /**
     * <p>
     * The list of options to show to the user.
     * </p>
     */
    private java.util.List<Button> buttons;

    /**
     * <p>
     * The title of the option.
     * </p>
     * 
     * @param title
     *        The title of the option.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the option.
     * </p>
     * 
     * @return The title of the option.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the option.
     * </p>
     * 
     * @param title
     *        The title of the option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenericAttachment withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The subtitle shown below the title.
     * </p>
     * 
     * @param subTitle
     *        The subtitle shown below the title.
     */

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    /**
     * <p>
     * The subtitle shown below the title.
     * </p>
     * 
     * @return The subtitle shown below the title.
     */

    public String getSubTitle() {
        return this.subTitle;
    }

    /**
     * <p>
     * The subtitle shown below the title.
     * </p>
     * 
     * @param subTitle
     *        The subtitle shown below the title.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenericAttachment withSubTitle(String subTitle) {
        setSubTitle(subTitle);
        return this;
    }

    /**
     * <p>
     * The URL of an attachment to the response card.
     * </p>
     * 
     * @param attachmentLinkUrl
     *        The URL of an attachment to the response card.
     */

    public void setAttachmentLinkUrl(String attachmentLinkUrl) {
        this.attachmentLinkUrl = attachmentLinkUrl;
    }

    /**
     * <p>
     * The URL of an attachment to the response card.
     * </p>
     * 
     * @return The URL of an attachment to the response card.
     */

    public String getAttachmentLinkUrl() {
        return this.attachmentLinkUrl;
    }

    /**
     * <p>
     * The URL of an attachment to the response card.
     * </p>
     * 
     * @param attachmentLinkUrl
     *        The URL of an attachment to the response card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenericAttachment withAttachmentLinkUrl(String attachmentLinkUrl) {
        setAttachmentLinkUrl(attachmentLinkUrl);
        return this;
    }

    /**
     * <p>
     * The URL of an image that is displayed to the user.
     * </p>
     * 
     * @param imageUrl
     *        The URL of an image that is displayed to the user.
     */

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * <p>
     * The URL of an image that is displayed to the user.
     * </p>
     * 
     * @return The URL of an image that is displayed to the user.
     */

    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * <p>
     * The URL of an image that is displayed to the user.
     * </p>
     * 
     * @param imageUrl
     *        The URL of an image that is displayed to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenericAttachment withImageUrl(String imageUrl) {
        setImageUrl(imageUrl);
        return this;
    }

    /**
     * <p>
     * The list of options to show to the user.
     * </p>
     * 
     * @return The list of options to show to the user.
     */

    public java.util.List<Button> getButtons() {
        return buttons;
    }

    /**
     * <p>
     * The list of options to show to the user.
     * </p>
     * 
     * @param buttons
     *        The list of options to show to the user.
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
     * The list of options to show to the user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setButtons(java.util.Collection)} or {@link #withButtons(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param buttons
     *        The list of options to show to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenericAttachment withButtons(Button... buttons) {
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
     * The list of options to show to the user.
     * </p>
     * 
     * @param buttons
     *        The list of options to show to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenericAttachment withButtons(java.util.Collection<Button> buttons) {
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
        if (getSubTitle() != null)
            sb.append("SubTitle: ").append(getSubTitle()).append(",");
        if (getAttachmentLinkUrl() != null)
            sb.append("AttachmentLinkUrl: ").append(getAttachmentLinkUrl()).append(",");
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

        if (obj instanceof GenericAttachment == false)
            return false;
        GenericAttachment other = (GenericAttachment) obj;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getSubTitle() == null ^ this.getSubTitle() == null)
            return false;
        if (other.getSubTitle() != null && other.getSubTitle().equals(this.getSubTitle()) == false)
            return false;
        if (other.getAttachmentLinkUrl() == null ^ this.getAttachmentLinkUrl() == null)
            return false;
        if (other.getAttachmentLinkUrl() != null && other.getAttachmentLinkUrl().equals(this.getAttachmentLinkUrl()) == false)
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
        hashCode = prime * hashCode + ((getSubTitle() == null) ? 0 : getSubTitle().hashCode());
        hashCode = prime * hashCode + ((getAttachmentLinkUrl() == null) ? 0 : getAttachmentLinkUrl().hashCode());
        hashCode = prime * hashCode + ((getImageUrl() == null) ? 0 : getImageUrl().hashCode());
        hashCode = prime * hashCode + ((getButtons() == null) ? 0 : getButtons().hashCode());
        return hashCode;
    }

    @Override
    public GenericAttachment clone() {
        try {
            return (GenericAttachment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexruntime.model.transform.GenericAttachmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
