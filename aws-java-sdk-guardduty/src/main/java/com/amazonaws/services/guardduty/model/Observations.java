/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the observed behavior.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/Observations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Observations implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The text that was unusual.
     * </p>
     */
    private java.util.List<String> text;

    /**
     * <p>
     * The text that was unusual.
     * </p>
     * 
     * @return The text that was unusual.
     */

    public java.util.List<String> getText() {
        return text;
    }

    /**
     * <p>
     * The text that was unusual.
     * </p>
     * 
     * @param text
     *        The text that was unusual.
     */

    public void setText(java.util.Collection<String> text) {
        if (text == null) {
            this.text = null;
            return;
        }

        this.text = new java.util.ArrayList<String>(text);
    }

    /**
     * <p>
     * The text that was unusual.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setText(java.util.Collection)} or {@link #withText(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param text
     *        The text that was unusual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observations withText(String... text) {
        if (this.text == null) {
            setText(new java.util.ArrayList<String>(text.length));
        }
        for (String ele : text) {
            this.text.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The text that was unusual.
     * </p>
     * 
     * @param text
     *        The text that was unusual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Observations withText(java.util.Collection<String> text) {
        setText(text);
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
            sb.append("Text: ").append(getText());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Observations == false)
            return false;
        Observations other = (Observations) obj;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        return hashCode;
    }

    @Override
    public Observations clone() {
        try {
            return (Observations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.ObservationsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
