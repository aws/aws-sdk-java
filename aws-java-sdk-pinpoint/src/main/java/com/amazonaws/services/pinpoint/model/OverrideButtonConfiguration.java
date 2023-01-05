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
 * Override button configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/OverrideButtonConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OverrideButtonConfiguration implements Serializable, Cloneable, StructuredPojo {

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

    public OverrideButtonConfiguration withButtonAction(String buttonAction) {
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

    public OverrideButtonConfiguration withButtonAction(ButtonAction buttonAction) {
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

    public OverrideButtonConfiguration withLink(String link) {
        setLink(link);
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
        if (getButtonAction() != null)
            sb.append("ButtonAction: ").append(getButtonAction()).append(",");
        if (getLink() != null)
            sb.append("Link: ").append(getLink());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OverrideButtonConfiguration == false)
            return false;
        OverrideButtonConfiguration other = (OverrideButtonConfiguration) obj;
        if (other.getButtonAction() == null ^ this.getButtonAction() == null)
            return false;
        if (other.getButtonAction() != null && other.getButtonAction().equals(this.getButtonAction()) == false)
            return false;
        if (other.getLink() == null ^ this.getLink() == null)
            return false;
        if (other.getLink() != null && other.getLink().equals(this.getLink()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getButtonAction() == null) ? 0 : getButtonAction().hashCode());
        hashCode = prime * hashCode + ((getLink() == null) ? 0 : getLink().hashCode());
        return hashCode;
    }

    @Override
    public OverrideButtonConfiguration clone() {
        try {
            return (OverrideButtonConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.OverrideButtonConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
