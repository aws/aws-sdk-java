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
 * Provides a prompt for making sure that the user is ready for the intent to be fulfilled.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/IntentConfirmationSetting"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IntentConfirmationSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Prompts the user to confirm the intent. This question should have a yes or no answer.
     * </p>
     * <p>
     * Amazon Lex uses this prompt to ensure that the user acknowledges that the intent is ready for fulfillment. For
     * example, with the <code>OrderPizza</code> intent, you might want to confirm that the order is correct before
     * placing it. For other intents, such as intents that simply respond to user questions, you might not need to ask
     * the user for confirmation before providing the information.
     * </p>
     */
    private PromptSpecification promptSpecification;
    /**
     * <p>
     * When the user answers "no" to the question defined in <code>promptSpecification</code>, Amazon Lex responds with
     * this response to acknowledge that the intent was canceled.
     * </p>
     */
    private ResponseSpecification declinationResponse;

    /**
     * <p>
     * Prompts the user to confirm the intent. This question should have a yes or no answer.
     * </p>
     * <p>
     * Amazon Lex uses this prompt to ensure that the user acknowledges that the intent is ready for fulfillment. For
     * example, with the <code>OrderPizza</code> intent, you might want to confirm that the order is correct before
     * placing it. For other intents, such as intents that simply respond to user questions, you might not need to ask
     * the user for confirmation before providing the information.
     * </p>
     * 
     * @param promptSpecification
     *        Prompts the user to confirm the intent. This question should have a yes or no answer.</p>
     *        <p>
     *        Amazon Lex uses this prompt to ensure that the user acknowledges that the intent is ready for fulfillment.
     *        For example, with the <code>OrderPizza</code> intent, you might want to confirm that the order is correct
     *        before placing it. For other intents, such as intents that simply respond to user questions, you might not
     *        need to ask the user for confirmation before providing the information.
     */

    public void setPromptSpecification(PromptSpecification promptSpecification) {
        this.promptSpecification = promptSpecification;
    }

    /**
     * <p>
     * Prompts the user to confirm the intent. This question should have a yes or no answer.
     * </p>
     * <p>
     * Amazon Lex uses this prompt to ensure that the user acknowledges that the intent is ready for fulfillment. For
     * example, with the <code>OrderPizza</code> intent, you might want to confirm that the order is correct before
     * placing it. For other intents, such as intents that simply respond to user questions, you might not need to ask
     * the user for confirmation before providing the information.
     * </p>
     * 
     * @return Prompts the user to confirm the intent. This question should have a yes or no answer.</p>
     *         <p>
     *         Amazon Lex uses this prompt to ensure that the user acknowledges that the intent is ready for
     *         fulfillment. For example, with the <code>OrderPizza</code> intent, you might want to confirm that the
     *         order is correct before placing it. For other intents, such as intents that simply respond to user
     *         questions, you might not need to ask the user for confirmation before providing the information.
     */

    public PromptSpecification getPromptSpecification() {
        return this.promptSpecification;
    }

    /**
     * <p>
     * Prompts the user to confirm the intent. This question should have a yes or no answer.
     * </p>
     * <p>
     * Amazon Lex uses this prompt to ensure that the user acknowledges that the intent is ready for fulfillment. For
     * example, with the <code>OrderPizza</code> intent, you might want to confirm that the order is correct before
     * placing it. For other intents, such as intents that simply respond to user questions, you might not need to ask
     * the user for confirmation before providing the information.
     * </p>
     * 
     * @param promptSpecification
     *        Prompts the user to confirm the intent. This question should have a yes or no answer.</p>
     *        <p>
     *        Amazon Lex uses this prompt to ensure that the user acknowledges that the intent is ready for fulfillment.
     *        For example, with the <code>OrderPizza</code> intent, you might want to confirm that the order is correct
     *        before placing it. For other intents, such as intents that simply respond to user questions, you might not
     *        need to ask the user for confirmation before providing the information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentConfirmationSetting withPromptSpecification(PromptSpecification promptSpecification) {
        setPromptSpecification(promptSpecification);
        return this;
    }

    /**
     * <p>
     * When the user answers "no" to the question defined in <code>promptSpecification</code>, Amazon Lex responds with
     * this response to acknowledge that the intent was canceled.
     * </p>
     * 
     * @param declinationResponse
     *        When the user answers "no" to the question defined in <code>promptSpecification</code>, Amazon Lex
     *        responds with this response to acknowledge that the intent was canceled.
     */

    public void setDeclinationResponse(ResponseSpecification declinationResponse) {
        this.declinationResponse = declinationResponse;
    }

    /**
     * <p>
     * When the user answers "no" to the question defined in <code>promptSpecification</code>, Amazon Lex responds with
     * this response to acknowledge that the intent was canceled.
     * </p>
     * 
     * @return When the user answers "no" to the question defined in <code>promptSpecification</code>, Amazon Lex
     *         responds with this response to acknowledge that the intent was canceled.
     */

    public ResponseSpecification getDeclinationResponse() {
        return this.declinationResponse;
    }

    /**
     * <p>
     * When the user answers "no" to the question defined in <code>promptSpecification</code>, Amazon Lex responds with
     * this response to acknowledge that the intent was canceled.
     * </p>
     * 
     * @param declinationResponse
     *        When the user answers "no" to the question defined in <code>promptSpecification</code>, Amazon Lex
     *        responds with this response to acknowledge that the intent was canceled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentConfirmationSetting withDeclinationResponse(ResponseSpecification declinationResponse) {
        setDeclinationResponse(declinationResponse);
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
        if (getPromptSpecification() != null)
            sb.append("PromptSpecification: ").append(getPromptSpecification()).append(",");
        if (getDeclinationResponse() != null)
            sb.append("DeclinationResponse: ").append(getDeclinationResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IntentConfirmationSetting == false)
            return false;
        IntentConfirmationSetting other = (IntentConfirmationSetting) obj;
        if (other.getPromptSpecification() == null ^ this.getPromptSpecification() == null)
            return false;
        if (other.getPromptSpecification() != null && other.getPromptSpecification().equals(this.getPromptSpecification()) == false)
            return false;
        if (other.getDeclinationResponse() == null ^ this.getDeclinationResponse() == null)
            return false;
        if (other.getDeclinationResponse() != null && other.getDeclinationResponse().equals(this.getDeclinationResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPromptSpecification() == null) ? 0 : getPromptSpecification().hashCode());
        hashCode = prime * hashCode + ((getDeclinationResponse() == null) ? 0 : getDeclinationResponse().hashCode());
        return hashCode;
    }

    @Override
    public IntentConfirmationSetting clone() {
        try {
            return (IntentConfirmationSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.IntentConfirmationSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
