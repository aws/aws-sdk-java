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
 * The configuration for the message content.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/InAppMessageContent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InAppMessageContent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The background color for the message.
     * </p>
     */
    private String backgroundColor;
    /**
     * <p>
     * The configuration for the message body.
     * </p>
     */
    private InAppMessageBodyConfig bodyConfig;
    /**
     * <p>
     * The configuration for the message header.
     * </p>
     */
    private InAppMessageHeaderConfig headerConfig;
    /**
     * <p>
     * The image url for the background of message.
     * </p>
     */
    private String imageUrl;
    /**
     * <p>
     * The first button inside the message.
     * </p>
     */
    private InAppMessageButton primaryBtn;
    /**
     * <p>
     * The second button inside message.
     * </p>
     */
    private InAppMessageButton secondaryBtn;

    /**
     * <p>
     * The background color for the message.
     * </p>
     * 
     * @param backgroundColor
     *        The background color for the message.
     */

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    /**
     * <p>
     * The background color for the message.
     * </p>
     * 
     * @return The background color for the message.
     */

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    /**
     * <p>
     * The background color for the message.
     * </p>
     * 
     * @param backgroundColor
     *        The background color for the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppMessageContent withBackgroundColor(String backgroundColor) {
        setBackgroundColor(backgroundColor);
        return this;
    }

    /**
     * <p>
     * The configuration for the message body.
     * </p>
     * 
     * @param bodyConfig
     *        The configuration for the message body.
     */

    public void setBodyConfig(InAppMessageBodyConfig bodyConfig) {
        this.bodyConfig = bodyConfig;
    }

    /**
     * <p>
     * The configuration for the message body.
     * </p>
     * 
     * @return The configuration for the message body.
     */

    public InAppMessageBodyConfig getBodyConfig() {
        return this.bodyConfig;
    }

    /**
     * <p>
     * The configuration for the message body.
     * </p>
     * 
     * @param bodyConfig
     *        The configuration for the message body.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppMessageContent withBodyConfig(InAppMessageBodyConfig bodyConfig) {
        setBodyConfig(bodyConfig);
        return this;
    }

    /**
     * <p>
     * The configuration for the message header.
     * </p>
     * 
     * @param headerConfig
     *        The configuration for the message header.
     */

    public void setHeaderConfig(InAppMessageHeaderConfig headerConfig) {
        this.headerConfig = headerConfig;
    }

    /**
     * <p>
     * The configuration for the message header.
     * </p>
     * 
     * @return The configuration for the message header.
     */

    public InAppMessageHeaderConfig getHeaderConfig() {
        return this.headerConfig;
    }

    /**
     * <p>
     * The configuration for the message header.
     * </p>
     * 
     * @param headerConfig
     *        The configuration for the message header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppMessageContent withHeaderConfig(InAppMessageHeaderConfig headerConfig) {
        setHeaderConfig(headerConfig);
        return this;
    }

    /**
     * <p>
     * The image url for the background of message.
     * </p>
     * 
     * @param imageUrl
     *        The image url for the background of message.
     */

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * <p>
     * The image url for the background of message.
     * </p>
     * 
     * @return The image url for the background of message.
     */

    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * <p>
     * The image url for the background of message.
     * </p>
     * 
     * @param imageUrl
     *        The image url for the background of message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppMessageContent withImageUrl(String imageUrl) {
        setImageUrl(imageUrl);
        return this;
    }

    /**
     * <p>
     * The first button inside the message.
     * </p>
     * 
     * @param primaryBtn
     *        The first button inside the message.
     */

    public void setPrimaryBtn(InAppMessageButton primaryBtn) {
        this.primaryBtn = primaryBtn;
    }

    /**
     * <p>
     * The first button inside the message.
     * </p>
     * 
     * @return The first button inside the message.
     */

    public InAppMessageButton getPrimaryBtn() {
        return this.primaryBtn;
    }

    /**
     * <p>
     * The first button inside the message.
     * </p>
     * 
     * @param primaryBtn
     *        The first button inside the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppMessageContent withPrimaryBtn(InAppMessageButton primaryBtn) {
        setPrimaryBtn(primaryBtn);
        return this;
    }

    /**
     * <p>
     * The second button inside message.
     * </p>
     * 
     * @param secondaryBtn
     *        The second button inside message.
     */

    public void setSecondaryBtn(InAppMessageButton secondaryBtn) {
        this.secondaryBtn = secondaryBtn;
    }

    /**
     * <p>
     * The second button inside message.
     * </p>
     * 
     * @return The second button inside message.
     */

    public InAppMessageButton getSecondaryBtn() {
        return this.secondaryBtn;
    }

    /**
     * <p>
     * The second button inside message.
     * </p>
     * 
     * @param secondaryBtn
     *        The second button inside message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppMessageContent withSecondaryBtn(InAppMessageButton secondaryBtn) {
        setSecondaryBtn(secondaryBtn);
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
        if (getBodyConfig() != null)
            sb.append("BodyConfig: ").append(getBodyConfig()).append(",");
        if (getHeaderConfig() != null)
            sb.append("HeaderConfig: ").append(getHeaderConfig()).append(",");
        if (getImageUrl() != null)
            sb.append("ImageUrl: ").append(getImageUrl()).append(",");
        if (getPrimaryBtn() != null)
            sb.append("PrimaryBtn: ").append(getPrimaryBtn()).append(",");
        if (getSecondaryBtn() != null)
            sb.append("SecondaryBtn: ").append(getSecondaryBtn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InAppMessageContent == false)
            return false;
        InAppMessageContent other = (InAppMessageContent) obj;
        if (other.getBackgroundColor() == null ^ this.getBackgroundColor() == null)
            return false;
        if (other.getBackgroundColor() != null && other.getBackgroundColor().equals(this.getBackgroundColor()) == false)
            return false;
        if (other.getBodyConfig() == null ^ this.getBodyConfig() == null)
            return false;
        if (other.getBodyConfig() != null && other.getBodyConfig().equals(this.getBodyConfig()) == false)
            return false;
        if (other.getHeaderConfig() == null ^ this.getHeaderConfig() == null)
            return false;
        if (other.getHeaderConfig() != null && other.getHeaderConfig().equals(this.getHeaderConfig()) == false)
            return false;
        if (other.getImageUrl() == null ^ this.getImageUrl() == null)
            return false;
        if (other.getImageUrl() != null && other.getImageUrl().equals(this.getImageUrl()) == false)
            return false;
        if (other.getPrimaryBtn() == null ^ this.getPrimaryBtn() == null)
            return false;
        if (other.getPrimaryBtn() != null && other.getPrimaryBtn().equals(this.getPrimaryBtn()) == false)
            return false;
        if (other.getSecondaryBtn() == null ^ this.getSecondaryBtn() == null)
            return false;
        if (other.getSecondaryBtn() != null && other.getSecondaryBtn().equals(this.getSecondaryBtn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackgroundColor() == null) ? 0 : getBackgroundColor().hashCode());
        hashCode = prime * hashCode + ((getBodyConfig() == null) ? 0 : getBodyConfig().hashCode());
        hashCode = prime * hashCode + ((getHeaderConfig() == null) ? 0 : getHeaderConfig().hashCode());
        hashCode = prime * hashCode + ((getImageUrl() == null) ? 0 : getImageUrl().hashCode());
        hashCode = prime * hashCode + ((getPrimaryBtn() == null) ? 0 : getPrimaryBtn().hashCode());
        hashCode = prime * hashCode + ((getSecondaryBtn() == null) ? 0 : getSecondaryBtn().hashCode());
        return hashCode;
    }

    @Override
    public InAppMessageContent clone() {
        try {
            return (InAppMessageContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.InAppMessageContentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
