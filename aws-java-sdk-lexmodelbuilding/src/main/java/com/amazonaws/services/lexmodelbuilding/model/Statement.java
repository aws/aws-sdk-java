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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A collection of messages that convey information to the user. At runtime, Amazon Lex selects the message to convey.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/Statement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Statement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A collection of message objects.
     * </p>
     */
    private java.util.List<Message> messages;
    /**
     * <p>
     * At runtime, if the client is using the <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html">PostText</a> API, Amazon Lex includes
     * the response card in the response. It substitutes all of the session attributes and slot values for placeholders
     * in the response card.
     * </p>
     */
    private String responseCard;

    /**
     * <p>
     * A collection of message objects.
     * </p>
     * 
     * @return A collection of message objects.
     */

    public java.util.List<Message> getMessages() {
        return messages;
    }

    /**
     * <p>
     * A collection of message objects.
     * </p>
     * 
     * @param messages
     *        A collection of message objects.
     */

    public void setMessages(java.util.Collection<Message> messages) {
        if (messages == null) {
            this.messages = null;
            return;
        }

        this.messages = new java.util.ArrayList<Message>(messages);
    }

    /**
     * <p>
     * A collection of message objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessages(java.util.Collection)} or {@link #withMessages(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param messages
     *        A collection of message objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withMessages(Message... messages) {
        if (this.messages == null) {
            setMessages(new java.util.ArrayList<Message>(messages.length));
        }
        for (Message ele : messages) {
            this.messages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of message objects.
     * </p>
     * 
     * @param messages
     *        A collection of message objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withMessages(java.util.Collection<Message> messages) {
        setMessages(messages);
        return this;
    }

    /**
     * <p>
     * At runtime, if the client is using the <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html">PostText</a> API, Amazon Lex includes
     * the response card in the response. It substitutes all of the session attributes and slot values for placeholders
     * in the response card.
     * </p>
     * 
     * @param responseCard
     *        At runtime, if the client is using the <a
     *        href="http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html">PostText</a> API, Amazon Lex
     *        includes the response card in the response. It substitutes all of the session attributes and slot values
     *        for placeholders in the response card.
     */

    public void setResponseCard(String responseCard) {
        this.responseCard = responseCard;
    }

    /**
     * <p>
     * At runtime, if the client is using the <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html">PostText</a> API, Amazon Lex includes
     * the response card in the response. It substitutes all of the session attributes and slot values for placeholders
     * in the response card.
     * </p>
     * 
     * @return At runtime, if the client is using the <a
     *         href="http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html">PostText</a> API, Amazon Lex
     *         includes the response card in the response. It substitutes all of the session attributes and slot values
     *         for placeholders in the response card.
     */

    public String getResponseCard() {
        return this.responseCard;
    }

    /**
     * <p>
     * At runtime, if the client is using the <a
     * href="http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html">PostText</a> API, Amazon Lex includes
     * the response card in the response. It substitutes all of the session attributes and slot values for placeholders
     * in the response card.
     * </p>
     * 
     * @param responseCard
     *        At runtime, if the client is using the <a
     *        href="http://docs.aws.amazon.com/lex/latest/dg/API_runtime_PostText.html">PostText</a> API, Amazon Lex
     *        includes the response card in the response. It substitutes all of the session attributes and slot values
     *        for placeholders in the response card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statement withResponseCard(String responseCard) {
        setResponseCard(responseCard);
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
        if (getMessages() != null)
            sb.append("Messages: ").append(getMessages()).append(",");
        if (getResponseCard() != null)
            sb.append("ResponseCard: ").append(getResponseCard());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Statement == false)
            return false;
        Statement other = (Statement) obj;
        if (other.getMessages() == null ^ this.getMessages() == null)
            return false;
        if (other.getMessages() != null && other.getMessages().equals(this.getMessages()) == false)
            return false;
        if (other.getResponseCard() == null ^ this.getResponseCard() == null)
            return false;
        if (other.getResponseCard() != null && other.getResponseCard().equals(this.getResponseCard()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessages() == null) ? 0 : getMessages().hashCode());
        hashCode = prime * hashCode + ((getResponseCard() == null) ? 0 : getResponseCard().hashCode());
        return hashCode;
    }

    @Override
    public Statement clone() {
        try {
            return (Statement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelbuilding.model.transform.StatementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
