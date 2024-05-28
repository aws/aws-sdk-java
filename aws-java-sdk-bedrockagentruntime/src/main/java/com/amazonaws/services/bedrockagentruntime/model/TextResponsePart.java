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
package com.amazonaws.services.bedrockagentruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the part of the generated text that contains a citation, alongside where it begins and ends.
 * </p>
 * <p>
 * This data type is used in the following API operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_RetrieveAndGenerate.html#API_agent-runtime_RetrieveAndGenerate_ResponseSyntax"
 * >RetrieveAndGenerate response</a> – in the <code>textResponsePart</code> field
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html#API_agent-runtime_InvokeAgent_ResponseSyntax"
 * >InvokeAgent response</a> – in the <code>textResponsePart</code> field
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/TextResponsePart"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TextResponsePart implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains information about where the text with a citation begins and ends in the generated output.
     * </p>
     */
    private Span span;
    /**
     * <p>
     * The part of the generated text that contains a citation.
     * </p>
     */
    private String text;

    /**
     * <p>
     * Contains information about where the text with a citation begins and ends in the generated output.
     * </p>
     * 
     * @param span
     *        Contains information about where the text with a citation begins and ends in the generated output.
     */

    public void setSpan(Span span) {
        this.span = span;
    }

    /**
     * <p>
     * Contains information about where the text with a citation begins and ends in the generated output.
     * </p>
     * 
     * @return Contains information about where the text with a citation begins and ends in the generated output.
     */

    public Span getSpan() {
        return this.span;
    }

    /**
     * <p>
     * Contains information about where the text with a citation begins and ends in the generated output.
     * </p>
     * 
     * @param span
     *        Contains information about where the text with a citation begins and ends in the generated output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextResponsePart withSpan(Span span) {
        setSpan(span);
        return this;
    }

    /**
     * <p>
     * The part of the generated text that contains a citation.
     * </p>
     * 
     * @param text
     *        The part of the generated text that contains a citation.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The part of the generated text that contains a citation.
     * </p>
     * 
     * @return The part of the generated text that contains a citation.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The part of the generated text that contains a citation.
     * </p>
     * 
     * @param text
     *        The part of the generated text that contains a citation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextResponsePart withText(String text) {
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
        if (getSpan() != null)
            sb.append("Span: ").append(getSpan()).append(",");
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

        if (obj instanceof TextResponsePart == false)
            return false;
        TextResponsePart other = (TextResponsePart) obj;
        if (other.getSpan() == null ^ this.getSpan() == null)
            return false;
        if (other.getSpan() != null && other.getSpan().equals(this.getSpan()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getSpan() == null) ? 0 : getSpan().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        return hashCode;
    }

    @Override
    public TextResponsePart clone() {
        try {
            return (TextResponsePart) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagentruntime.model.transform.TextResponsePartMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
