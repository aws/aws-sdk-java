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
 * Configuration setting for a response sent to the user before Amazon Lex starts eliciting slots.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/InitialResponseSetting"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InitialResponseSetting implements Serializable, Cloneable, StructuredPojo {

    private ResponseSpecification initialResponse;
    /**
     * <p>
     * The next step in the conversation.
     * </p>
     */
    private DialogState nextStep;

    private ConditionalSpecification conditional;

    private DialogCodeHookInvocationSetting codeHook;

    /**
     * @param initialResponse
     */

    public void setInitialResponse(ResponseSpecification initialResponse) {
        this.initialResponse = initialResponse;
    }

    /**
     * @return
     */

    public ResponseSpecification getInitialResponse() {
        return this.initialResponse;
    }

    /**
     * @param initialResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitialResponseSetting withInitialResponse(ResponseSpecification initialResponse) {
        setInitialResponse(initialResponse);
        return this;
    }

    /**
     * <p>
     * The next step in the conversation.
     * </p>
     * 
     * @param nextStep
     *        The next step in the conversation.
     */

    public void setNextStep(DialogState nextStep) {
        this.nextStep = nextStep;
    }

    /**
     * <p>
     * The next step in the conversation.
     * </p>
     * 
     * @return The next step in the conversation.
     */

    public DialogState getNextStep() {
        return this.nextStep;
    }

    /**
     * <p>
     * The next step in the conversation.
     * </p>
     * 
     * @param nextStep
     *        The next step in the conversation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitialResponseSetting withNextStep(DialogState nextStep) {
        setNextStep(nextStep);
        return this;
    }

    /**
     * @param conditional
     */

    public void setConditional(ConditionalSpecification conditional) {
        this.conditional = conditional;
    }

    /**
     * @return
     */

    public ConditionalSpecification getConditional() {
        return this.conditional;
    }

    /**
     * @param conditional
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitialResponseSetting withConditional(ConditionalSpecification conditional) {
        setConditional(conditional);
        return this;
    }

    /**
     * @param codeHook
     */

    public void setCodeHook(DialogCodeHookInvocationSetting codeHook) {
        this.codeHook = codeHook;
    }

    /**
     * @return
     */

    public DialogCodeHookInvocationSetting getCodeHook() {
        return this.codeHook;
    }

    /**
     * @param codeHook
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitialResponseSetting withCodeHook(DialogCodeHookInvocationSetting codeHook) {
        setCodeHook(codeHook);
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
        if (getInitialResponse() != null)
            sb.append("InitialResponse: ").append(getInitialResponse()).append(",");
        if (getNextStep() != null)
            sb.append("NextStep: ").append(getNextStep()).append(",");
        if (getConditional() != null)
            sb.append("Conditional: ").append(getConditional()).append(",");
        if (getCodeHook() != null)
            sb.append("CodeHook: ").append(getCodeHook());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InitialResponseSetting == false)
            return false;
        InitialResponseSetting other = (InitialResponseSetting) obj;
        if (other.getInitialResponse() == null ^ this.getInitialResponse() == null)
            return false;
        if (other.getInitialResponse() != null && other.getInitialResponse().equals(this.getInitialResponse()) == false)
            return false;
        if (other.getNextStep() == null ^ this.getNextStep() == null)
            return false;
        if (other.getNextStep() != null && other.getNextStep().equals(this.getNextStep()) == false)
            return false;
        if (other.getConditional() == null ^ this.getConditional() == null)
            return false;
        if (other.getConditional() != null && other.getConditional().equals(this.getConditional()) == false)
            return false;
        if (other.getCodeHook() == null ^ this.getCodeHook() == null)
            return false;
        if (other.getCodeHook() != null && other.getCodeHook().equals(this.getCodeHook()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInitialResponse() == null) ? 0 : getInitialResponse().hashCode());
        hashCode = prime * hashCode + ((getNextStep() == null) ? 0 : getNextStep().hashCode());
        hashCode = prime * hashCode + ((getConditional() == null) ? 0 : getConditional().hashCode());
        hashCode = prime * hashCode + ((getCodeHook() == null) ? 0 : getCodeHook().hashCode());
        return hashCode;
    }

    @Override
    public InitialResponseSetting clone() {
        try {
            return (InitialResponseSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.InitialResponseSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
