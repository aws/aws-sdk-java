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
 * A button that appears on a response card show to the user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/Button" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Button implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The text that is displayed on the button.
     * </p>
     */
    private String text;
    /**
     * <p>
     * The value returned to Amazon Lex V2 when a user chooses the button.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The text that is displayed on the button.
     * </p>
     * 
     * @param text
     *        The text that is displayed on the button.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The text that is displayed on the button.
     * </p>
     * 
     * @return The text that is displayed on the button.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The text that is displayed on the button.
     * </p>
     * 
     * @param text
     *        The text that is displayed on the button.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Button withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * The value returned to Amazon Lex V2 when a user chooses the button.
     * </p>
     * 
     * @param value
     *        The value returned to Amazon Lex V2 when a user chooses the button.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value returned to Amazon Lex V2 when a user chooses the button.
     * </p>
     * 
     * @return The value returned to Amazon Lex V2 when a user chooses the button.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value returned to Amazon Lex V2 when a user chooses the button.
     * </p>
     * 
     * @param value
     *        The value returned to Amazon Lex V2 when a user chooses the button.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Button withValue(String value) {
        setValue(value);
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
        if (getText() != null)
            sb.append("Text: ").append(getText()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Button == false)
            return false;
        Button other = (Button) obj;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public Button clone() {
        try {
            return (Button) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexruntimev2.model.transform.ButtonMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
