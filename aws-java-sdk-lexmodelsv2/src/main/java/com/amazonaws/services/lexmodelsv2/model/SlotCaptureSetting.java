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
 * Settings used when Amazon Lex successfully captures a slot value from a user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/SlotCaptureSetting" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlotCaptureSetting implements Serializable, Cloneable, StructuredPojo {

    private ResponseSpecification captureResponse;
    /**
     * <p>
     * Specifies the next step that the bot runs when the slot value is captured before the code hook times out.
     * </p>
     */
    private DialogState captureNextStep;
    /**
     * <p>
     * A list of conditional branches to evaluate after the slot value is captured.
     * </p>
     */
    private ConditionalSpecification captureConditional;

    private ResponseSpecification failureResponse;
    /**
     * <p>
     * Specifies the next step that the bot runs when the slot value code is not recognized.
     * </p>
     */
    private DialogState failureNextStep;
    /**
     * <p>
     * A list of conditional branches to evaluate when the slot value isn't captured.
     * </p>
     */
    private ConditionalSpecification failureConditional;
    /**
     * <p>
     * Code hook called after Amazon Lex successfully captures a slot value.
     * </p>
     */
    private DialogCodeHookInvocationSetting codeHook;
    /**
     * <p>
     * Code hook called when Amazon Lex doesn't capture a slot value.
     * </p>
     */
    private ElicitationCodeHookInvocationSetting elicitationCodeHook;

    /**
     * @param captureResponse
     */

    public void setCaptureResponse(ResponseSpecification captureResponse) {
        this.captureResponse = captureResponse;
    }

    /**
     * @return
     */

    public ResponseSpecification getCaptureResponse() {
        return this.captureResponse;
    }

    /**
     * @param captureResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotCaptureSetting withCaptureResponse(ResponseSpecification captureResponse) {
        setCaptureResponse(captureResponse);
        return this;
    }

    /**
     * <p>
     * Specifies the next step that the bot runs when the slot value is captured before the code hook times out.
     * </p>
     * 
     * @param captureNextStep
     *        Specifies the next step that the bot runs when the slot value is captured before the code hook times out.
     */

    public void setCaptureNextStep(DialogState captureNextStep) {
        this.captureNextStep = captureNextStep;
    }

    /**
     * <p>
     * Specifies the next step that the bot runs when the slot value is captured before the code hook times out.
     * </p>
     * 
     * @return Specifies the next step that the bot runs when the slot value is captured before the code hook times out.
     */

    public DialogState getCaptureNextStep() {
        return this.captureNextStep;
    }

    /**
     * <p>
     * Specifies the next step that the bot runs when the slot value is captured before the code hook times out.
     * </p>
     * 
     * @param captureNextStep
     *        Specifies the next step that the bot runs when the slot value is captured before the code hook times out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotCaptureSetting withCaptureNextStep(DialogState captureNextStep) {
        setCaptureNextStep(captureNextStep);
        return this;
    }

    /**
     * <p>
     * A list of conditional branches to evaluate after the slot value is captured.
     * </p>
     * 
     * @param captureConditional
     *        A list of conditional branches to evaluate after the slot value is captured.
     */

    public void setCaptureConditional(ConditionalSpecification captureConditional) {
        this.captureConditional = captureConditional;
    }

    /**
     * <p>
     * A list of conditional branches to evaluate after the slot value is captured.
     * </p>
     * 
     * @return A list of conditional branches to evaluate after the slot value is captured.
     */

    public ConditionalSpecification getCaptureConditional() {
        return this.captureConditional;
    }

    /**
     * <p>
     * A list of conditional branches to evaluate after the slot value is captured.
     * </p>
     * 
     * @param captureConditional
     *        A list of conditional branches to evaluate after the slot value is captured.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotCaptureSetting withCaptureConditional(ConditionalSpecification captureConditional) {
        setCaptureConditional(captureConditional);
        return this;
    }

    /**
     * @param failureResponse
     */

    public void setFailureResponse(ResponseSpecification failureResponse) {
        this.failureResponse = failureResponse;
    }

    /**
     * @return
     */

    public ResponseSpecification getFailureResponse() {
        return this.failureResponse;
    }

    /**
     * @param failureResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotCaptureSetting withFailureResponse(ResponseSpecification failureResponse) {
        setFailureResponse(failureResponse);
        return this;
    }

    /**
     * <p>
     * Specifies the next step that the bot runs when the slot value code is not recognized.
     * </p>
     * 
     * @param failureNextStep
     *        Specifies the next step that the bot runs when the slot value code is not recognized.
     */

    public void setFailureNextStep(DialogState failureNextStep) {
        this.failureNextStep = failureNextStep;
    }

    /**
     * <p>
     * Specifies the next step that the bot runs when the slot value code is not recognized.
     * </p>
     * 
     * @return Specifies the next step that the bot runs when the slot value code is not recognized.
     */

    public DialogState getFailureNextStep() {
        return this.failureNextStep;
    }

    /**
     * <p>
     * Specifies the next step that the bot runs when the slot value code is not recognized.
     * </p>
     * 
     * @param failureNextStep
     *        Specifies the next step that the bot runs when the slot value code is not recognized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotCaptureSetting withFailureNextStep(DialogState failureNextStep) {
        setFailureNextStep(failureNextStep);
        return this;
    }

    /**
     * <p>
     * A list of conditional branches to evaluate when the slot value isn't captured.
     * </p>
     * 
     * @param failureConditional
     *        A list of conditional branches to evaluate when the slot value isn't captured.
     */

    public void setFailureConditional(ConditionalSpecification failureConditional) {
        this.failureConditional = failureConditional;
    }

    /**
     * <p>
     * A list of conditional branches to evaluate when the slot value isn't captured.
     * </p>
     * 
     * @return A list of conditional branches to evaluate when the slot value isn't captured.
     */

    public ConditionalSpecification getFailureConditional() {
        return this.failureConditional;
    }

    /**
     * <p>
     * A list of conditional branches to evaluate when the slot value isn't captured.
     * </p>
     * 
     * @param failureConditional
     *        A list of conditional branches to evaluate when the slot value isn't captured.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotCaptureSetting withFailureConditional(ConditionalSpecification failureConditional) {
        setFailureConditional(failureConditional);
        return this;
    }

    /**
     * <p>
     * Code hook called after Amazon Lex successfully captures a slot value.
     * </p>
     * 
     * @param codeHook
     *        Code hook called after Amazon Lex successfully captures a slot value.
     */

    public void setCodeHook(DialogCodeHookInvocationSetting codeHook) {
        this.codeHook = codeHook;
    }

    /**
     * <p>
     * Code hook called after Amazon Lex successfully captures a slot value.
     * </p>
     * 
     * @return Code hook called after Amazon Lex successfully captures a slot value.
     */

    public DialogCodeHookInvocationSetting getCodeHook() {
        return this.codeHook;
    }

    /**
     * <p>
     * Code hook called after Amazon Lex successfully captures a slot value.
     * </p>
     * 
     * @param codeHook
     *        Code hook called after Amazon Lex successfully captures a slot value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotCaptureSetting withCodeHook(DialogCodeHookInvocationSetting codeHook) {
        setCodeHook(codeHook);
        return this;
    }

    /**
     * <p>
     * Code hook called when Amazon Lex doesn't capture a slot value.
     * </p>
     * 
     * @param elicitationCodeHook
     *        Code hook called when Amazon Lex doesn't capture a slot value.
     */

    public void setElicitationCodeHook(ElicitationCodeHookInvocationSetting elicitationCodeHook) {
        this.elicitationCodeHook = elicitationCodeHook;
    }

    /**
     * <p>
     * Code hook called when Amazon Lex doesn't capture a slot value.
     * </p>
     * 
     * @return Code hook called when Amazon Lex doesn't capture a slot value.
     */

    public ElicitationCodeHookInvocationSetting getElicitationCodeHook() {
        return this.elicitationCodeHook;
    }

    /**
     * <p>
     * Code hook called when Amazon Lex doesn't capture a slot value.
     * </p>
     * 
     * @param elicitationCodeHook
     *        Code hook called when Amazon Lex doesn't capture a slot value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotCaptureSetting withElicitationCodeHook(ElicitationCodeHookInvocationSetting elicitationCodeHook) {
        setElicitationCodeHook(elicitationCodeHook);
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
        if (getCaptureResponse() != null)
            sb.append("CaptureResponse: ").append(getCaptureResponse()).append(",");
        if (getCaptureNextStep() != null)
            sb.append("CaptureNextStep: ").append(getCaptureNextStep()).append(",");
        if (getCaptureConditional() != null)
            sb.append("CaptureConditional: ").append(getCaptureConditional()).append(",");
        if (getFailureResponse() != null)
            sb.append("FailureResponse: ").append(getFailureResponse()).append(",");
        if (getFailureNextStep() != null)
            sb.append("FailureNextStep: ").append(getFailureNextStep()).append(",");
        if (getFailureConditional() != null)
            sb.append("FailureConditional: ").append(getFailureConditional()).append(",");
        if (getCodeHook() != null)
            sb.append("CodeHook: ").append(getCodeHook()).append(",");
        if (getElicitationCodeHook() != null)
            sb.append("ElicitationCodeHook: ").append(getElicitationCodeHook());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SlotCaptureSetting == false)
            return false;
        SlotCaptureSetting other = (SlotCaptureSetting) obj;
        if (other.getCaptureResponse() == null ^ this.getCaptureResponse() == null)
            return false;
        if (other.getCaptureResponse() != null && other.getCaptureResponse().equals(this.getCaptureResponse()) == false)
            return false;
        if (other.getCaptureNextStep() == null ^ this.getCaptureNextStep() == null)
            return false;
        if (other.getCaptureNextStep() != null && other.getCaptureNextStep().equals(this.getCaptureNextStep()) == false)
            return false;
        if (other.getCaptureConditional() == null ^ this.getCaptureConditional() == null)
            return false;
        if (other.getCaptureConditional() != null && other.getCaptureConditional().equals(this.getCaptureConditional()) == false)
            return false;
        if (other.getFailureResponse() == null ^ this.getFailureResponse() == null)
            return false;
        if (other.getFailureResponse() != null && other.getFailureResponse().equals(this.getFailureResponse()) == false)
            return false;
        if (other.getFailureNextStep() == null ^ this.getFailureNextStep() == null)
            return false;
        if (other.getFailureNextStep() != null && other.getFailureNextStep().equals(this.getFailureNextStep()) == false)
            return false;
        if (other.getFailureConditional() == null ^ this.getFailureConditional() == null)
            return false;
        if (other.getFailureConditional() != null && other.getFailureConditional().equals(this.getFailureConditional()) == false)
            return false;
        if (other.getCodeHook() == null ^ this.getCodeHook() == null)
            return false;
        if (other.getCodeHook() != null && other.getCodeHook().equals(this.getCodeHook()) == false)
            return false;
        if (other.getElicitationCodeHook() == null ^ this.getElicitationCodeHook() == null)
            return false;
        if (other.getElicitationCodeHook() != null && other.getElicitationCodeHook().equals(this.getElicitationCodeHook()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCaptureResponse() == null) ? 0 : getCaptureResponse().hashCode());
        hashCode = prime * hashCode + ((getCaptureNextStep() == null) ? 0 : getCaptureNextStep().hashCode());
        hashCode = prime * hashCode + ((getCaptureConditional() == null) ? 0 : getCaptureConditional().hashCode());
        hashCode = prime * hashCode + ((getFailureResponse() == null) ? 0 : getFailureResponse().hashCode());
        hashCode = prime * hashCode + ((getFailureNextStep() == null) ? 0 : getFailureNextStep().hashCode());
        hashCode = prime * hashCode + ((getFailureConditional() == null) ? 0 : getFailureConditional().hashCode());
        hashCode = prime * hashCode + ((getCodeHook() == null) ? 0 : getCodeHook().hashCode());
        hashCode = prime * hashCode + ((getElicitationCodeHook() == null) ? 0 : getElicitationCodeHook().hashCode());
        return hashCode;
    }

    @Override
    public SlotCaptureSetting clone() {
        try {
            return (SlotCaptureSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.SlotCaptureSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
