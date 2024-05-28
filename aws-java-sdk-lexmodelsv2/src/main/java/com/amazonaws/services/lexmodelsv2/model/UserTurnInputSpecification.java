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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the user messages in the turn in the input.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UserTurnInputSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserTurnInputSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The utterance input in the user turn.
     * </p>
     */
    private UtteranceInputSpecification utteranceInput;
    /**
     * <p>
     * Request attributes of the user turn.
     * </p>
     */
    private java.util.Map<String, String> requestAttributes;
    /**
     * <p>
     * Contains information about the session state in the input.
     * </p>
     */
    private InputSessionStateSpecification sessionState;

    /**
     * <p>
     * The utterance input in the user turn.
     * </p>
     * 
     * @param utteranceInput
     *        The utterance input in the user turn.
     */

    public void setUtteranceInput(UtteranceInputSpecification utteranceInput) {
        this.utteranceInput = utteranceInput;
    }

    /**
     * <p>
     * The utterance input in the user turn.
     * </p>
     * 
     * @return The utterance input in the user turn.
     */

    public UtteranceInputSpecification getUtteranceInput() {
        return this.utteranceInput;
    }

    /**
     * <p>
     * The utterance input in the user turn.
     * </p>
     * 
     * @param utteranceInput
     *        The utterance input in the user turn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserTurnInputSpecification withUtteranceInput(UtteranceInputSpecification utteranceInput) {
        setUtteranceInput(utteranceInput);
        return this;
    }

    /**
     * <p>
     * Request attributes of the user turn.
     * </p>
     * 
     * @return Request attributes of the user turn.
     */

    public java.util.Map<String, String> getRequestAttributes() {
        return requestAttributes;
    }

    /**
     * <p>
     * Request attributes of the user turn.
     * </p>
     * 
     * @param requestAttributes
     *        Request attributes of the user turn.
     */

    public void setRequestAttributes(java.util.Map<String, String> requestAttributes) {
        this.requestAttributes = requestAttributes;
    }

    /**
     * <p>
     * Request attributes of the user turn.
     * </p>
     * 
     * @param requestAttributes
     *        Request attributes of the user turn.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserTurnInputSpecification withRequestAttributes(java.util.Map<String, String> requestAttributes) {
        setRequestAttributes(requestAttributes);
        return this;
    }

    /**
     * Add a single RequestAttributes entry
     *
     * @see UserTurnInputSpecification#withRequestAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UserTurnInputSpecification addRequestAttributesEntry(String key, String value) {
        if (null == this.requestAttributes) {
            this.requestAttributes = new java.util.HashMap<String, String>();
        }
        if (this.requestAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.requestAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RequestAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserTurnInputSpecification clearRequestAttributesEntries() {
        this.requestAttributes = null;
        return this;
    }

    /**
     * <p>
     * Contains information about the session state in the input.
     * </p>
     * 
     * @param sessionState
     *        Contains information about the session state in the input.
     */

    public void setSessionState(InputSessionStateSpecification sessionState) {
        this.sessionState = sessionState;
    }

    /**
     * <p>
     * Contains information about the session state in the input.
     * </p>
     * 
     * @return Contains information about the session state in the input.
     */

    public InputSessionStateSpecification getSessionState() {
        return this.sessionState;
    }

    /**
     * <p>
     * Contains information about the session state in the input.
     * </p>
     * 
     * @param sessionState
     *        Contains information about the session state in the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserTurnInputSpecification withSessionState(InputSessionStateSpecification sessionState) {
        setSessionState(sessionState);
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
        if (getUtteranceInput() != null)
            sb.append("UtteranceInput: ").append(getUtteranceInput()).append(",");
        if (getRequestAttributes() != null)
            sb.append("RequestAttributes: ").append(getRequestAttributes()).append(",");
        if (getSessionState() != null)
            sb.append("SessionState: ").append(getSessionState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserTurnInputSpecification == false)
            return false;
        UserTurnInputSpecification other = (UserTurnInputSpecification) obj;
        if (other.getUtteranceInput() == null ^ this.getUtteranceInput() == null)
            return false;
        if (other.getUtteranceInput() != null && other.getUtteranceInput().equals(this.getUtteranceInput()) == false)
            return false;
        if (other.getRequestAttributes() == null ^ this.getRequestAttributes() == null)
            return false;
        if (other.getRequestAttributes() != null && other.getRequestAttributes().equals(this.getRequestAttributes()) == false)
            return false;
        if (other.getSessionState() == null ^ this.getSessionState() == null)
            return false;
        if (other.getSessionState() != null && other.getSessionState().equals(this.getSessionState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUtteranceInput() == null) ? 0 : getUtteranceInput().hashCode());
        hashCode = prime * hashCode + ((getRequestAttributes() == null) ? 0 : getRequestAttributes().hashCode());
        hashCode = prime * hashCode + ((getSessionState() == null) ? 0 : getSessionState().hashCode());
        return hashCode;
    }

    @Override
    public UserTurnInputSpecification clone() {
        try {
            return (UserTurnInputSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.UserTurnInputSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
