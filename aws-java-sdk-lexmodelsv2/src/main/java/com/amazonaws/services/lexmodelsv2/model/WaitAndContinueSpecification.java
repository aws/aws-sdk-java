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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the prompts that Amazon Lex uses while a bot is waiting for customer input.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/WaitAndContinueSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WaitAndContinueSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The response that Amazon Lex sends to indicate that the bot is waiting for the conversation to continue.
     * </p>
     */
    private ResponseSpecification waitingResponse;
    /**
     * <p>
     * The response that Amazon Lex sends to indicate that the bot is ready to continue the conversation.
     * </p>
     */
    private ResponseSpecification continueResponse;
    /**
     * <p>
     * A response that Amazon Lex sends periodically to the user to indicate that the bot is still waiting for input
     * from the user.
     * </p>
     */
    private StillWaitingResponseSpecification stillWaitingResponse;

    /**
     * <p>
     * The response that Amazon Lex sends to indicate that the bot is waiting for the conversation to continue.
     * </p>
     * 
     * @param waitingResponse
     *        The response that Amazon Lex sends to indicate that the bot is waiting for the conversation to continue.
     */

    public void setWaitingResponse(ResponseSpecification waitingResponse) {
        this.waitingResponse = waitingResponse;
    }

    /**
     * <p>
     * The response that Amazon Lex sends to indicate that the bot is waiting for the conversation to continue.
     * </p>
     * 
     * @return The response that Amazon Lex sends to indicate that the bot is waiting for the conversation to continue.
     */

    public ResponseSpecification getWaitingResponse() {
        return this.waitingResponse;
    }

    /**
     * <p>
     * The response that Amazon Lex sends to indicate that the bot is waiting for the conversation to continue.
     * </p>
     * 
     * @param waitingResponse
     *        The response that Amazon Lex sends to indicate that the bot is waiting for the conversation to continue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaitAndContinueSpecification withWaitingResponse(ResponseSpecification waitingResponse) {
        setWaitingResponse(waitingResponse);
        return this;
    }

    /**
     * <p>
     * The response that Amazon Lex sends to indicate that the bot is ready to continue the conversation.
     * </p>
     * 
     * @param continueResponse
     *        The response that Amazon Lex sends to indicate that the bot is ready to continue the conversation.
     */

    public void setContinueResponse(ResponseSpecification continueResponse) {
        this.continueResponse = continueResponse;
    }

    /**
     * <p>
     * The response that Amazon Lex sends to indicate that the bot is ready to continue the conversation.
     * </p>
     * 
     * @return The response that Amazon Lex sends to indicate that the bot is ready to continue the conversation.
     */

    public ResponseSpecification getContinueResponse() {
        return this.continueResponse;
    }

    /**
     * <p>
     * The response that Amazon Lex sends to indicate that the bot is ready to continue the conversation.
     * </p>
     * 
     * @param continueResponse
     *        The response that Amazon Lex sends to indicate that the bot is ready to continue the conversation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaitAndContinueSpecification withContinueResponse(ResponseSpecification continueResponse) {
        setContinueResponse(continueResponse);
        return this;
    }

    /**
     * <p>
     * A response that Amazon Lex sends periodically to the user to indicate that the bot is still waiting for input
     * from the user.
     * </p>
     * 
     * @param stillWaitingResponse
     *        A response that Amazon Lex sends periodically to the user to indicate that the bot is still waiting for
     *        input from the user.
     */

    public void setStillWaitingResponse(StillWaitingResponseSpecification stillWaitingResponse) {
        this.stillWaitingResponse = stillWaitingResponse;
    }

    /**
     * <p>
     * A response that Amazon Lex sends periodically to the user to indicate that the bot is still waiting for input
     * from the user.
     * </p>
     * 
     * @return A response that Amazon Lex sends periodically to the user to indicate that the bot is still waiting for
     *         input from the user.
     */

    public StillWaitingResponseSpecification getStillWaitingResponse() {
        return this.stillWaitingResponse;
    }

    /**
     * <p>
     * A response that Amazon Lex sends periodically to the user to indicate that the bot is still waiting for input
     * from the user.
     * </p>
     * 
     * @param stillWaitingResponse
     *        A response that Amazon Lex sends periodically to the user to indicate that the bot is still waiting for
     *        input from the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaitAndContinueSpecification withStillWaitingResponse(StillWaitingResponseSpecification stillWaitingResponse) {
        setStillWaitingResponse(stillWaitingResponse);
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
        if (getWaitingResponse() != null)
            sb.append("WaitingResponse: ").append(getWaitingResponse()).append(",");
        if (getContinueResponse() != null)
            sb.append("ContinueResponse: ").append(getContinueResponse()).append(",");
        if (getStillWaitingResponse() != null)
            sb.append("StillWaitingResponse: ").append(getStillWaitingResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WaitAndContinueSpecification == false)
            return false;
        WaitAndContinueSpecification other = (WaitAndContinueSpecification) obj;
        if (other.getWaitingResponse() == null ^ this.getWaitingResponse() == null)
            return false;
        if (other.getWaitingResponse() != null && other.getWaitingResponse().equals(this.getWaitingResponse()) == false)
            return false;
        if (other.getContinueResponse() == null ^ this.getContinueResponse() == null)
            return false;
        if (other.getContinueResponse() != null && other.getContinueResponse().equals(this.getContinueResponse()) == false)
            return false;
        if (other.getStillWaitingResponse() == null ^ this.getStillWaitingResponse() == null)
            return false;
        if (other.getStillWaitingResponse() != null && other.getStillWaitingResponse().equals(this.getStillWaitingResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWaitingResponse() == null) ? 0 : getWaitingResponse().hashCode());
        hashCode = prime * hashCode + ((getContinueResponse() == null) ? 0 : getContinueResponse().hashCode());
        hashCode = prime * hashCode + ((getStillWaitingResponse() == null) ? 0 : getStillWaitingResponse().hashCode());
        return hashCode;
    }

    @Override
    public WaitAndContinueSpecification clone() {
        try {
            return (WaitAndContinueSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.WaitAndContinueSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
