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
 * Specifies next steps to run after the dialog code hook finishes.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/PostDialogCodeHookInvocationSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostDialogCodeHookInvocationSpecification implements Serializable, Cloneable, StructuredPojo {

    private ResponseSpecification successResponse;
    /**
     * <p>
     * Specifics the next step the bot runs after the dialog code hook finishes successfully.
     * </p>
     */
    private DialogState successNextStep;
    /**
     * <p>
     * A list of conditional branches to evaluate after the dialog code hook finishes successfully.
     * </p>
     */
    private ConditionalSpecification successConditional;

    private ResponseSpecification failureResponse;
    /**
     * <p>
     * Specifies the next step the bot runs after the dialog code hook throws an exception or returns with the
     * <code>State</code> field of the <code>Intent</code> object set to <code>Failed</code>.
     * </p>
     */
    private DialogState failureNextStep;
    /**
     * <p>
     * A list of conditional branches to evaluate after the dialog code hook throws an exception or returns with the
     * <code>State</code> field of the <code>Intent</code> object set to <code>Failed</code>.
     * </p>
     */
    private ConditionalSpecification failureConditional;

    private ResponseSpecification timeoutResponse;
    /**
     * <p>
     * Specifies the next step that the bot runs when the code hook times out.
     * </p>
     */
    private DialogState timeoutNextStep;
    /**
     * <p>
     * A list of conditional branches to evaluate if the code hook times out.
     * </p>
     */
    private ConditionalSpecification timeoutConditional;

    /**
     * @param successResponse
     */

    public void setSuccessResponse(ResponseSpecification successResponse) {
        this.successResponse = successResponse;
    }

    /**
     * @return
     */

    public ResponseSpecification getSuccessResponse() {
        return this.successResponse;
    }

    /**
     * @param successResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostDialogCodeHookInvocationSpecification withSuccessResponse(ResponseSpecification successResponse) {
        setSuccessResponse(successResponse);
        return this;
    }

    /**
     * <p>
     * Specifics the next step the bot runs after the dialog code hook finishes successfully.
     * </p>
     * 
     * @param successNextStep
     *        Specifics the next step the bot runs after the dialog code hook finishes successfully.
     */

    public void setSuccessNextStep(DialogState successNextStep) {
        this.successNextStep = successNextStep;
    }

    /**
     * <p>
     * Specifics the next step the bot runs after the dialog code hook finishes successfully.
     * </p>
     * 
     * @return Specifics the next step the bot runs after the dialog code hook finishes successfully.
     */

    public DialogState getSuccessNextStep() {
        return this.successNextStep;
    }

    /**
     * <p>
     * Specifics the next step the bot runs after the dialog code hook finishes successfully.
     * </p>
     * 
     * @param successNextStep
     *        Specifics the next step the bot runs after the dialog code hook finishes successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostDialogCodeHookInvocationSpecification withSuccessNextStep(DialogState successNextStep) {
        setSuccessNextStep(successNextStep);
        return this;
    }

    /**
     * <p>
     * A list of conditional branches to evaluate after the dialog code hook finishes successfully.
     * </p>
     * 
     * @param successConditional
     *        A list of conditional branches to evaluate after the dialog code hook finishes successfully.
     */

    public void setSuccessConditional(ConditionalSpecification successConditional) {
        this.successConditional = successConditional;
    }

    /**
     * <p>
     * A list of conditional branches to evaluate after the dialog code hook finishes successfully.
     * </p>
     * 
     * @return A list of conditional branches to evaluate after the dialog code hook finishes successfully.
     */

    public ConditionalSpecification getSuccessConditional() {
        return this.successConditional;
    }

    /**
     * <p>
     * A list of conditional branches to evaluate after the dialog code hook finishes successfully.
     * </p>
     * 
     * @param successConditional
     *        A list of conditional branches to evaluate after the dialog code hook finishes successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostDialogCodeHookInvocationSpecification withSuccessConditional(ConditionalSpecification successConditional) {
        setSuccessConditional(successConditional);
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

    public PostDialogCodeHookInvocationSpecification withFailureResponse(ResponseSpecification failureResponse) {
        setFailureResponse(failureResponse);
        return this;
    }

    /**
     * <p>
     * Specifies the next step the bot runs after the dialog code hook throws an exception or returns with the
     * <code>State</code> field of the <code>Intent</code> object set to <code>Failed</code>.
     * </p>
     * 
     * @param failureNextStep
     *        Specifies the next step the bot runs after the dialog code hook throws an exception or returns with the
     *        <code>State</code> field of the <code>Intent</code> object set to <code>Failed</code>.
     */

    public void setFailureNextStep(DialogState failureNextStep) {
        this.failureNextStep = failureNextStep;
    }

    /**
     * <p>
     * Specifies the next step the bot runs after the dialog code hook throws an exception or returns with the
     * <code>State</code> field of the <code>Intent</code> object set to <code>Failed</code>.
     * </p>
     * 
     * @return Specifies the next step the bot runs after the dialog code hook throws an exception or returns with the
     *         <code>State</code> field of the <code>Intent</code> object set to <code>Failed</code>.
     */

    public DialogState getFailureNextStep() {
        return this.failureNextStep;
    }

    /**
     * <p>
     * Specifies the next step the bot runs after the dialog code hook throws an exception or returns with the
     * <code>State</code> field of the <code>Intent</code> object set to <code>Failed</code>.
     * </p>
     * 
     * @param failureNextStep
     *        Specifies the next step the bot runs after the dialog code hook throws an exception or returns with the
     *        <code>State</code> field of the <code>Intent</code> object set to <code>Failed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostDialogCodeHookInvocationSpecification withFailureNextStep(DialogState failureNextStep) {
        setFailureNextStep(failureNextStep);
        return this;
    }

    /**
     * <p>
     * A list of conditional branches to evaluate after the dialog code hook throws an exception or returns with the
     * <code>State</code> field of the <code>Intent</code> object set to <code>Failed</code>.
     * </p>
     * 
     * @param failureConditional
     *        A list of conditional branches to evaluate after the dialog code hook throws an exception or returns with
     *        the <code>State</code> field of the <code>Intent</code> object set to <code>Failed</code>.
     */

    public void setFailureConditional(ConditionalSpecification failureConditional) {
        this.failureConditional = failureConditional;
    }

    /**
     * <p>
     * A list of conditional branches to evaluate after the dialog code hook throws an exception or returns with the
     * <code>State</code> field of the <code>Intent</code> object set to <code>Failed</code>.
     * </p>
     * 
     * @return A list of conditional branches to evaluate after the dialog code hook throws an exception or returns with
     *         the <code>State</code> field of the <code>Intent</code> object set to <code>Failed</code>.
     */

    public ConditionalSpecification getFailureConditional() {
        return this.failureConditional;
    }

    /**
     * <p>
     * A list of conditional branches to evaluate after the dialog code hook throws an exception or returns with the
     * <code>State</code> field of the <code>Intent</code> object set to <code>Failed</code>.
     * </p>
     * 
     * @param failureConditional
     *        A list of conditional branches to evaluate after the dialog code hook throws an exception or returns with
     *        the <code>State</code> field of the <code>Intent</code> object set to <code>Failed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostDialogCodeHookInvocationSpecification withFailureConditional(ConditionalSpecification failureConditional) {
        setFailureConditional(failureConditional);
        return this;
    }

    /**
     * @param timeoutResponse
     */

    public void setTimeoutResponse(ResponseSpecification timeoutResponse) {
        this.timeoutResponse = timeoutResponse;
    }

    /**
     * @return
     */

    public ResponseSpecification getTimeoutResponse() {
        return this.timeoutResponse;
    }

    /**
     * @param timeoutResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostDialogCodeHookInvocationSpecification withTimeoutResponse(ResponseSpecification timeoutResponse) {
        setTimeoutResponse(timeoutResponse);
        return this;
    }

    /**
     * <p>
     * Specifies the next step that the bot runs when the code hook times out.
     * </p>
     * 
     * @param timeoutNextStep
     *        Specifies the next step that the bot runs when the code hook times out.
     */

    public void setTimeoutNextStep(DialogState timeoutNextStep) {
        this.timeoutNextStep = timeoutNextStep;
    }

    /**
     * <p>
     * Specifies the next step that the bot runs when the code hook times out.
     * </p>
     * 
     * @return Specifies the next step that the bot runs when the code hook times out.
     */

    public DialogState getTimeoutNextStep() {
        return this.timeoutNextStep;
    }

    /**
     * <p>
     * Specifies the next step that the bot runs when the code hook times out.
     * </p>
     * 
     * @param timeoutNextStep
     *        Specifies the next step that the bot runs when the code hook times out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostDialogCodeHookInvocationSpecification withTimeoutNextStep(DialogState timeoutNextStep) {
        setTimeoutNextStep(timeoutNextStep);
        return this;
    }

    /**
     * <p>
     * A list of conditional branches to evaluate if the code hook times out.
     * </p>
     * 
     * @param timeoutConditional
     *        A list of conditional branches to evaluate if the code hook times out.
     */

    public void setTimeoutConditional(ConditionalSpecification timeoutConditional) {
        this.timeoutConditional = timeoutConditional;
    }

    /**
     * <p>
     * A list of conditional branches to evaluate if the code hook times out.
     * </p>
     * 
     * @return A list of conditional branches to evaluate if the code hook times out.
     */

    public ConditionalSpecification getTimeoutConditional() {
        return this.timeoutConditional;
    }

    /**
     * <p>
     * A list of conditional branches to evaluate if the code hook times out.
     * </p>
     * 
     * @param timeoutConditional
     *        A list of conditional branches to evaluate if the code hook times out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostDialogCodeHookInvocationSpecification withTimeoutConditional(ConditionalSpecification timeoutConditional) {
        setTimeoutConditional(timeoutConditional);
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
        if (getSuccessResponse() != null)
            sb.append("SuccessResponse: ").append(getSuccessResponse()).append(",");
        if (getSuccessNextStep() != null)
            sb.append("SuccessNextStep: ").append(getSuccessNextStep()).append(",");
        if (getSuccessConditional() != null)
            sb.append("SuccessConditional: ").append(getSuccessConditional()).append(",");
        if (getFailureResponse() != null)
            sb.append("FailureResponse: ").append(getFailureResponse()).append(",");
        if (getFailureNextStep() != null)
            sb.append("FailureNextStep: ").append(getFailureNextStep()).append(",");
        if (getFailureConditional() != null)
            sb.append("FailureConditional: ").append(getFailureConditional()).append(",");
        if (getTimeoutResponse() != null)
            sb.append("TimeoutResponse: ").append(getTimeoutResponse()).append(",");
        if (getTimeoutNextStep() != null)
            sb.append("TimeoutNextStep: ").append(getTimeoutNextStep()).append(",");
        if (getTimeoutConditional() != null)
            sb.append("TimeoutConditional: ").append(getTimeoutConditional());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostDialogCodeHookInvocationSpecification == false)
            return false;
        PostDialogCodeHookInvocationSpecification other = (PostDialogCodeHookInvocationSpecification) obj;
        if (other.getSuccessResponse() == null ^ this.getSuccessResponse() == null)
            return false;
        if (other.getSuccessResponse() != null && other.getSuccessResponse().equals(this.getSuccessResponse()) == false)
            return false;
        if (other.getSuccessNextStep() == null ^ this.getSuccessNextStep() == null)
            return false;
        if (other.getSuccessNextStep() != null && other.getSuccessNextStep().equals(this.getSuccessNextStep()) == false)
            return false;
        if (other.getSuccessConditional() == null ^ this.getSuccessConditional() == null)
            return false;
        if (other.getSuccessConditional() != null && other.getSuccessConditional().equals(this.getSuccessConditional()) == false)
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
        if (other.getTimeoutResponse() == null ^ this.getTimeoutResponse() == null)
            return false;
        if (other.getTimeoutResponse() != null && other.getTimeoutResponse().equals(this.getTimeoutResponse()) == false)
            return false;
        if (other.getTimeoutNextStep() == null ^ this.getTimeoutNextStep() == null)
            return false;
        if (other.getTimeoutNextStep() != null && other.getTimeoutNextStep().equals(this.getTimeoutNextStep()) == false)
            return false;
        if (other.getTimeoutConditional() == null ^ this.getTimeoutConditional() == null)
            return false;
        if (other.getTimeoutConditional() != null && other.getTimeoutConditional().equals(this.getTimeoutConditional()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessResponse() == null) ? 0 : getSuccessResponse().hashCode());
        hashCode = prime * hashCode + ((getSuccessNextStep() == null) ? 0 : getSuccessNextStep().hashCode());
        hashCode = prime * hashCode + ((getSuccessConditional() == null) ? 0 : getSuccessConditional().hashCode());
        hashCode = prime * hashCode + ((getFailureResponse() == null) ? 0 : getFailureResponse().hashCode());
        hashCode = prime * hashCode + ((getFailureNextStep() == null) ? 0 : getFailureNextStep().hashCode());
        hashCode = prime * hashCode + ((getFailureConditional() == null) ? 0 : getFailureConditional().hashCode());
        hashCode = prime * hashCode + ((getTimeoutResponse() == null) ? 0 : getTimeoutResponse().hashCode());
        hashCode = prime * hashCode + ((getTimeoutNextStep() == null) ? 0 : getTimeoutNextStep().hashCode());
        hashCode = prime * hashCode + ((getTimeoutConditional() == null) ? 0 : getTimeoutConditional().hashCode());
        return hashCode;
    }

    @Override
    public PostDialogCodeHookInvocationSpecification clone() {
        try {
            return (PostDialogCodeHookInvocationSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.PostDialogCodeHookInvocationSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
