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
 * Text config for Message Header.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/InAppMessageHeaderConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InAppMessageHeaderConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The alignment of the text. Valid values: LEFT, CENTER, RIGHT.
     * </p>
     */
    private String alignment;
    /**
     * <p>
     * Message Header.
     * </p>
     */
    private String header;
    /**
     * <p>
     * The text color.
     * </p>
     */
    private String textColor;

    /**
     * <p>
     * The alignment of the text. Valid values: LEFT, CENTER, RIGHT.
     * </p>
     * 
     * @param alignment
     *        The alignment of the text. Valid values: LEFT, CENTER, RIGHT.
     * @see Alignment
     */

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    /**
     * <p>
     * The alignment of the text. Valid values: LEFT, CENTER, RIGHT.
     * </p>
     * 
     * @return The alignment of the text. Valid values: LEFT, CENTER, RIGHT.
     * @see Alignment
     */

    public String getAlignment() {
        return this.alignment;
    }

    /**
     * <p>
     * The alignment of the text. Valid values: LEFT, CENTER, RIGHT.
     * </p>
     * 
     * @param alignment
     *        The alignment of the text. Valid values: LEFT, CENTER, RIGHT.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Alignment
     */

    public InAppMessageHeaderConfig withAlignment(String alignment) {
        setAlignment(alignment);
        return this;
    }

    /**
     * <p>
     * The alignment of the text. Valid values: LEFT, CENTER, RIGHT.
     * </p>
     * 
     * @param alignment
     *        The alignment of the text. Valid values: LEFT, CENTER, RIGHT.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Alignment
     */

    public InAppMessageHeaderConfig withAlignment(Alignment alignment) {
        this.alignment = alignment.toString();
        return this;
    }

    /**
     * <p>
     * Message Header.
     * </p>
     * 
     * @param header
     *        Message Header.
     */

    public void setHeader(String header) {
        this.header = header;
    }

    /**
     * <p>
     * Message Header.
     * </p>
     * 
     * @return Message Header.
     */

    public String getHeader() {
        return this.header;
    }

    /**
     * <p>
     * Message Header.
     * </p>
     * 
     * @param header
     *        Message Header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppMessageHeaderConfig withHeader(String header) {
        setHeader(header);
        return this;
    }

    /**
     * <p>
     * The text color.
     * </p>
     * 
     * @param textColor
     *        The text color.
     */

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    /**
     * <p>
     * The text color.
     * </p>
     * 
     * @return The text color.
     */

    public String getTextColor() {
        return this.textColor;
    }

    /**
     * <p>
     * The text color.
     * </p>
     * 
     * @param textColor
     *        The text color.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppMessageHeaderConfig withTextColor(String textColor) {
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
        if (getAlignment() != null)
            sb.append("Alignment: ").append(getAlignment()).append(",");
        if (getHeader() != null)
            sb.append("Header: ").append(getHeader()).append(",");
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

        if (obj instanceof InAppMessageHeaderConfig == false)
            return false;
        InAppMessageHeaderConfig other = (InAppMessageHeaderConfig) obj;
        if (other.getAlignment() == null ^ this.getAlignment() == null)
            return false;
        if (other.getAlignment() != null && other.getAlignment().equals(this.getAlignment()) == false)
            return false;
        if (other.getHeader() == null ^ this.getHeader() == null)
            return false;
        if (other.getHeader() != null && other.getHeader().equals(this.getHeader()) == false)
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

        hashCode = prime * hashCode + ((getAlignment() == null) ? 0 : getAlignment().hashCode());
        hashCode = prime * hashCode + ((getHeader() == null) ? 0 : getHeader().hashCode());
        hashCode = prime * hashCode + ((getTextColor() == null) ? 0 : getTextColor().hashCode());
        return hashCode;
    }

    @Override
    public InAppMessageHeaderConfig clone() {
        try {
            return (InAppMessageHeaderConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.InAppMessageHeaderConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
