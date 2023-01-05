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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a statement the Amazon Lex conveys to the user when the intent is successfully fulfilled.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/IntentClosingSetting" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IntentClosingSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The response that Amazon Lex sends to the user when the intent is complete.
     * </p>
     */
    private ResponseSpecification closingResponse;
    /**
     * <p>
     * Specifies whether an intent's closing response is used. When this field is false, the closing response isn't sent
     * to the user. If the <code>active</code> field isn't specified, the default is true.
     * </p>
     */
    private Boolean active;
    /**
     * <p>
     * Specifies the next step that the bot executes after playing the intent's closing response.
     * </p>
     */
    private DialogState nextStep;
    /**
     * <p>
     * A list of conditional branches associated with the intent's closing response. These branches are executed when
     * the <code>nextStep</code> attribute is set to <code>EvalutateConditional</code>.
     * </p>
     */
    private ConditionalSpecification conditional;

    /**
     * <p>
     * The response that Amazon Lex sends to the user when the intent is complete.
     * </p>
     * 
     * @param closingResponse
     *        The response that Amazon Lex sends to the user when the intent is complete.
     */

    public void setClosingResponse(ResponseSpecification closingResponse) {
        this.closingResponse = closingResponse;
    }

    /**
     * <p>
     * The response that Amazon Lex sends to the user when the intent is complete.
     * </p>
     * 
     * @return The response that Amazon Lex sends to the user when the intent is complete.
     */

    public ResponseSpecification getClosingResponse() {
        return this.closingResponse;
    }

    /**
     * <p>
     * The response that Amazon Lex sends to the user when the intent is complete.
     * </p>
     * 
     * @param closingResponse
     *        The response that Amazon Lex sends to the user when the intent is complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentClosingSetting withClosingResponse(ResponseSpecification closingResponse) {
        setClosingResponse(closingResponse);
        return this;
    }

    /**
     * <p>
     * Specifies whether an intent's closing response is used. When this field is false, the closing response isn't sent
     * to the user. If the <code>active</code> field isn't specified, the default is true.
     * </p>
     * 
     * @param active
     *        Specifies whether an intent's closing response is used. When this field is false, the closing response
     *        isn't sent to the user. If the <code>active</code> field isn't specified, the default is true.
     */

    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * <p>
     * Specifies whether an intent's closing response is used. When this field is false, the closing response isn't sent
     * to the user. If the <code>active</code> field isn't specified, the default is true.
     * </p>
     * 
     * @return Specifies whether an intent's closing response is used. When this field is false, the closing response
     *         isn't sent to the user. If the <code>active</code> field isn't specified, the default is true.
     */

    public Boolean getActive() {
        return this.active;
    }

    /**
     * <p>
     * Specifies whether an intent's closing response is used. When this field is false, the closing response isn't sent
     * to the user. If the <code>active</code> field isn't specified, the default is true.
     * </p>
     * 
     * @param active
     *        Specifies whether an intent's closing response is used. When this field is false, the closing response
     *        isn't sent to the user. If the <code>active</code> field isn't specified, the default is true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentClosingSetting withActive(Boolean active) {
        setActive(active);
        return this;
    }

    /**
     * <p>
     * Specifies whether an intent's closing response is used. When this field is false, the closing response isn't sent
     * to the user. If the <code>active</code> field isn't specified, the default is true.
     * </p>
     * 
     * @return Specifies whether an intent's closing response is used. When this field is false, the closing response
     *         isn't sent to the user. If the <code>active</code> field isn't specified, the default is true.
     */

    public Boolean isActive() {
        return this.active;
    }

    /**
     * <p>
     * Specifies the next step that the bot executes after playing the intent's closing response.
     * </p>
     * 
     * @param nextStep
     *        Specifies the next step that the bot executes after playing the intent's closing response.
     */

    public void setNextStep(DialogState nextStep) {
        this.nextStep = nextStep;
    }

    /**
     * <p>
     * Specifies the next step that the bot executes after playing the intent's closing response.
     * </p>
     * 
     * @return Specifies the next step that the bot executes after playing the intent's closing response.
     */

    public DialogState getNextStep() {
        return this.nextStep;
    }

    /**
     * <p>
     * Specifies the next step that the bot executes after playing the intent's closing response.
     * </p>
     * 
     * @param nextStep
     *        Specifies the next step that the bot executes after playing the intent's closing response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentClosingSetting withNextStep(DialogState nextStep) {
        setNextStep(nextStep);
        return this;
    }

    /**
     * <p>
     * A list of conditional branches associated with the intent's closing response. These branches are executed when
     * the <code>nextStep</code> attribute is set to <code>EvalutateConditional</code>.
     * </p>
     * 
     * @param conditional
     *        A list of conditional branches associated with the intent's closing response. These branches are executed
     *        when the <code>nextStep</code> attribute is set to <code>EvalutateConditional</code>.
     */

    public void setConditional(ConditionalSpecification conditional) {
        this.conditional = conditional;
    }

    /**
     * <p>
     * A list of conditional branches associated with the intent's closing response. These branches are executed when
     * the <code>nextStep</code> attribute is set to <code>EvalutateConditional</code>.
     * </p>
     * 
     * @return A list of conditional branches associated with the intent's closing response. These branches are executed
     *         when the <code>nextStep</code> attribute is set to <code>EvalutateConditional</code>.
     */

    public ConditionalSpecification getConditional() {
        return this.conditional;
    }

    /**
     * <p>
     * A list of conditional branches associated with the intent's closing response. These branches are executed when
     * the <code>nextStep</code> attribute is set to <code>EvalutateConditional</code>.
     * </p>
     * 
     * @param conditional
     *        A list of conditional branches associated with the intent's closing response. These branches are executed
     *        when the <code>nextStep</code> attribute is set to <code>EvalutateConditional</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentClosingSetting withConditional(ConditionalSpecification conditional) {
        setConditional(conditional);
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
        if (getClosingResponse() != null)
            sb.append("ClosingResponse: ").append(getClosingResponse()).append(",");
        if (getActive() != null)
            sb.append("Active: ").append(getActive()).append(",");
        if (getNextStep() != null)
            sb.append("NextStep: ").append(getNextStep()).append(",");
        if (getConditional() != null)
            sb.append("Conditional: ").append(getConditional());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IntentClosingSetting == false)
            return false;
        IntentClosingSetting other = (IntentClosingSetting) obj;
        if (other.getClosingResponse() == null ^ this.getClosingResponse() == null)
            return false;
        if (other.getClosingResponse() != null && other.getClosingResponse().equals(this.getClosingResponse()) == false)
            return false;
        if (other.getActive() == null ^ this.getActive() == null)
            return false;
        if (other.getActive() != null && other.getActive().equals(this.getActive()) == false)
            return false;
        if (other.getNextStep() == null ^ this.getNextStep() == null)
            return false;
        if (other.getNextStep() != null && other.getNextStep().equals(this.getNextStep()) == false)
            return false;
        if (other.getConditional() == null ^ this.getConditional() == null)
            return false;
        if (other.getConditional() != null && other.getConditional().equals(this.getConditional()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClosingResponse() == null) ? 0 : getClosingResponse().hashCode());
        hashCode = prime * hashCode + ((getActive() == null) ? 0 : getActive().hashCode());
        hashCode = prime * hashCode + ((getNextStep() == null) ? 0 : getNextStep().hashCode());
        hashCode = prime * hashCode + ((getConditional() == null) ? 0 : getConditional().hashCode());
        return hashCode;
    }

    @Override
    public IntentClosingSetting clone() {
        try {
            return (IntentClosingSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.IntentClosingSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
