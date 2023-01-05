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
 * Text config for Message Body.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/InAppMessageBodyConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InAppMessageBodyConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The alignment of the text. Valid values: LEFT, CENTER, RIGHT.
     * </p>
     */
    private String alignment;
    /**
     * <p>
     * Message Body.
     * </p>
     */
    private String body;
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

    public InAppMessageBodyConfig withAlignment(String alignment) {
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

    public InAppMessageBodyConfig withAlignment(Alignment alignment) {
        this.alignment = alignment.toString();
        return this;
    }

    /**
     * <p>
     * Message Body.
     * </p>
     * 
     * @param body
     *        Message Body.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * Message Body.
     * </p>
     * 
     * @return Message Body.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * <p>
     * Message Body.
     * </p>
     * 
     * @param body
     *        Message Body.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppMessageBodyConfig withBody(String body) {
        setBody(body);
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

    public InAppMessageBodyConfig withTextColor(String textColor) {
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
        if (getBody() != null)
            sb.append("Body: ").append(getBody()).append(",");
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

        if (obj instanceof InAppMessageBodyConfig == false)
            return false;
        InAppMessageBodyConfig other = (InAppMessageBodyConfig) obj;
        if (other.getAlignment() == null ^ this.getAlignment() == null)
            return false;
        if (other.getAlignment() != null && other.getAlignment().equals(this.getAlignment()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
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
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getTextColor() == null) ? 0 : getTextColor().hashCode());
        return hashCode;
    }

    @Override
    public InAppMessageBodyConfig clone() {
        try {
            return (InAppMessageBodyConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.InAppMessageBodyConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
