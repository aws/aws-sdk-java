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
     * Specifies whether the intent's confirmation is sent to the user. When this field is false, confirmation and
     * declination responses aren't sent. If the <code>active</code> field isn't specified, the default is true.
     * </p>
     */
    private Boolean active;

    private ResponseSpecification confirmationResponse;
    /**
     * <p>
     * Specifies the next step that the bot executes when the customer confirms the intent.
     * </p>
     */
    private DialogState confirmationNextStep;
    /**
     * <p>
     * A list of conditional branches to evaluate after the intent is closed.
     * </p>
     */
    private ConditionalSpecification confirmationConditional;
    /**
     * <p>
     * Specifies the next step that the bot executes when the customer declines the intent.
     * </p>
     */
    private DialogState declinationNextStep;
    /**
     * <p>
     * A list of conditional branches to evaluate after the intent is declined.
     * </p>
     */
    private ConditionalSpecification declinationConditional;

    private ResponseSpecification failureResponse;
    /**
     * <p>
     * The next step to take in the conversation if the confirmation step fails.
     * </p>
     */
    private DialogState failureNextStep;

    private ConditionalSpecification failureConditional;
    /**
     * <p>
     * The <code>DialogCodeHookInvocationSetting</code> object associated with intent's confirmation step. The dialog
     * code hook is triggered based on these invocation settings when the confirmation next step or declination next
     * step or failure next step is <code>InvokeDialogCodeHook</code>.
     * </p>
     */
    private DialogCodeHookInvocationSetting codeHook;
    /**
     * <p>
     * The <code>DialogCodeHookInvocationSetting</code> used when the code hook is invoked during confirmation prompt
     * retries.
     * </p>
     */
    private ElicitationCodeHookInvocationSetting elicitationCodeHook;

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
     * <p>
     * Specifies whether the intent's confirmation is sent to the user. When this field is false, confirmation and
     * declination responses aren't sent. If the <code>active</code> field isn't specified, the default is true.
     * </p>
     * 
     * @param active
     *        Specifies whether the intent's confirmation is sent to the user. When this field is false, confirmation
     *        and declination responses aren't sent. If the <code>active</code> field isn't specified, the default is
     *        true.
     */

    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * <p>
     * Specifies whether the intent's confirmation is sent to the user. When this field is false, confirmation and
     * declination responses aren't sent. If the <code>active</code> field isn't specified, the default is true.
     * </p>
     * 
     * @return Specifies whether the intent's confirmation is sent to the user. When this field is false, confirmation
     *         and declination responses aren't sent. If the <code>active</code> field isn't specified, the default is
     *         true.
     */

    public Boolean getActive() {
        return this.active;
    }

    /**
     * <p>
     * Specifies whether the intent's confirmation is sent to the user. When this field is false, confirmation and
     * declination responses aren't sent. If the <code>active</code> field isn't specified, the default is true.
     * </p>
     * 
     * @param active
     *        Specifies whether the intent's confirmation is sent to the user. When this field is false, confirmation
     *        and declination responses aren't sent. If the <code>active</code> field isn't specified, the default is
     *        true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentConfirmationSetting withActive(Boolean active) {
        setActive(active);
        return this;
    }

    /**
     * <p>
     * Specifies whether the intent's confirmation is sent to the user. When this field is false, confirmation and
     * declination responses aren't sent. If the <code>active</code> field isn't specified, the default is true.
     * </p>
     * 
     * @return Specifies whether the intent's confirmation is sent to the user. When this field is false, confirmation
     *         and declination responses aren't sent. If the <code>active</code> field isn't specified, the default is
     *         true.
     */

    public Boolean isActive() {
        return this.active;
    }

    /**
     * @param confirmationResponse
     */

    public void setConfirmationResponse(ResponseSpecification confirmationResponse) {
        this.confirmationResponse = confirmationResponse;
    }

    /**
     * @return
     */

    public ResponseSpecification getConfirmationResponse() {
        return this.confirmationResponse;
    }

    /**
     * @param confirmationResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentConfirmationSetting withConfirmationResponse(ResponseSpecification confirmationResponse) {
        setConfirmationResponse(confirmationResponse);
        return this;
    }

    /**
     * <p>
     * Specifies the next step that the bot executes when the customer confirms the intent.
     * </p>
     * 
     * @param confirmationNextStep
     *        Specifies the next step that the bot executes when the customer confirms the intent.
     */

    public void setConfirmationNextStep(DialogState confirmationNextStep) {
        this.confirmationNextStep = confirmationNextStep;
    }

    /**
     * <p>
     * Specifies the next step that the bot executes when the customer confirms the intent.
     * </p>
     * 
     * @return Specifies the next step that the bot executes when the customer confirms the intent.
     */

    public DialogState getConfirmationNextStep() {
        return this.confirmationNextStep;
    }

    /**
     * <p>
     * Specifies the next step that the bot executes when the customer confirms the intent.
     * </p>
     * 
     * @param confirmationNextStep
     *        Specifies the next step that the bot executes when the customer confirms the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentConfirmationSetting withConfirmationNextStep(DialogState confirmationNextStep) {
        setConfirmationNextStep(confirmationNextStep);
        return this;
    }

    /**
     * <p>
     * A list of conditional branches to evaluate after the intent is closed.
     * </p>
     * 
     * @param confirmationConditional
     *        A list of conditional branches to evaluate after the intent is closed.
     */

    public void setConfirmationConditional(ConditionalSpecification confirmationConditional) {
        this.confirmationConditional = confirmationConditional;
    }

    /**
     * <p>
     * A list of conditional branches to evaluate after the intent is closed.
     * </p>
     * 
     * @return A list of conditional branches to evaluate after the intent is closed.
     */

    public ConditionalSpecification getConfirmationConditional() {
        return this.confirmationConditional;
    }

    /**
     * <p>
     * A list of conditional branches to evaluate after the intent is closed.
     * </p>
     * 
     * @param confirmationConditional
     *        A list of conditional branches to evaluate after the intent is closed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentConfirmationSetting withConfirmationConditional(ConditionalSpecification confirmationConditional) {
        setConfirmationConditional(confirmationConditional);
        return this;
    }

    /**
     * <p>
     * Specifies the next step that the bot executes when the customer declines the intent.
     * </p>
     * 
     * @param declinationNextStep
     *        Specifies the next step that the bot executes when the customer declines the intent.
     */

    public void setDeclinationNextStep(DialogState declinationNextStep) {
        this.declinationNextStep = declinationNextStep;
    }

    /**
     * <p>
     * Specifies the next step that the bot executes when the customer declines the intent.
     * </p>
     * 
     * @return Specifies the next step that the bot executes when the customer declines the intent.
     */

    public DialogState getDeclinationNextStep() {
        return this.declinationNextStep;
    }

    /**
     * <p>
     * Specifies the next step that the bot executes when the customer declines the intent.
     * </p>
     * 
     * @param declinationNextStep
     *        Specifies the next step that the bot executes when the customer declines the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentConfirmationSetting withDeclinationNextStep(DialogState declinationNextStep) {
        setDeclinationNextStep(declinationNextStep);
        return this;
    }

    /**
     * <p>
     * A list of conditional branches to evaluate after the intent is declined.
     * </p>
     * 
     * @param declinationConditional
     *        A list of conditional branches to evaluate after the intent is declined.
     */

    public void setDeclinationConditional(ConditionalSpecification declinationConditional) {
        this.declinationConditional = declinationConditional;
    }

    /**
     * <p>
     * A list of conditional branches to evaluate after the intent is declined.
     * </p>
     * 
     * @return A list of conditional branches to evaluate after the intent is declined.
     */

    public ConditionalSpecification getDeclinationConditional() {
        return this.declinationConditional;
    }

    /**
     * <p>
     * A list of conditional branches to evaluate after the intent is declined.
     * </p>
     * 
     * @param declinationConditional
     *        A list of conditional branches to evaluate after the intent is declined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentConfirmationSetting withDeclinationConditional(ConditionalSpecification declinationConditional) {
        setDeclinationConditional(declinationConditional);
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

    public IntentConfirmationSetting withFailureResponse(ResponseSpecification failureResponse) {
        setFailureResponse(failureResponse);
        return this;
    }

    /**
     * <p>
     * The next step to take in the conversation if the confirmation step fails.
     * </p>
     * 
     * @param failureNextStep
     *        The next step to take in the conversation if the confirmation step fails.
     */

    public void setFailureNextStep(DialogState failureNextStep) {
        this.failureNextStep = failureNextStep;
    }

    /**
     * <p>
     * The next step to take in the conversation if the confirmation step fails.
     * </p>
     * 
     * @return The next step to take in the conversation if the confirmation step fails.
     */

    public DialogState getFailureNextStep() {
        return this.failureNextStep;
    }

    /**
     * <p>
     * The next step to take in the conversation if the confirmation step fails.
     * </p>
     * 
     * @param failureNextStep
     *        The next step to take in the conversation if the confirmation step fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentConfirmationSetting withFailureNextStep(DialogState failureNextStep) {
        setFailureNextStep(failureNextStep);
        return this;
    }

    /**
     * @param failureConditional
     */

    public void setFailureConditional(ConditionalSpecification failureConditional) {
        this.failureConditional = failureConditional;
    }

    /**
     * @return
     */

    public ConditionalSpecification getFailureConditional() {
        return this.failureConditional;
    }

    /**
     * @param failureConditional
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentConfirmationSetting withFailureConditional(ConditionalSpecification failureConditional) {
        setFailureConditional(failureConditional);
        return this;
    }

    /**
     * <p>
     * The <code>DialogCodeHookInvocationSetting</code> object associated with intent's confirmation step. The dialog
     * code hook is triggered based on these invocation settings when the confirmation next step or declination next
     * step or failure next step is <code>InvokeDialogCodeHook</code>.
     * </p>
     * 
     * @param codeHook
     *        The <code>DialogCodeHookInvocationSetting</code> object associated with intent's confirmation step. The
     *        dialog code hook is triggered based on these invocation settings when the confirmation next step or
     *        declination next step or failure next step is <code>InvokeDialogCodeHook</code>.
     */

    public void setCodeHook(DialogCodeHookInvocationSetting codeHook) {
        this.codeHook = codeHook;
    }

    /**
     * <p>
     * The <code>DialogCodeHookInvocationSetting</code> object associated with intent's confirmation step. The dialog
     * code hook is triggered based on these invocation settings when the confirmation next step or declination next
     * step or failure next step is <code>InvokeDialogCodeHook</code>.
     * </p>
     * 
     * @return The <code>DialogCodeHookInvocationSetting</code> object associated with intent's confirmation step. The
     *         dialog code hook is triggered based on these invocation settings when the confirmation next step or
     *         declination next step or failure next step is <code>InvokeDialogCodeHook</code>.
     */

    public DialogCodeHookInvocationSetting getCodeHook() {
        return this.codeHook;
    }

    /**
     * <p>
     * The <code>DialogCodeHookInvocationSetting</code> object associated with intent's confirmation step. The dialog
     * code hook is triggered based on these invocation settings when the confirmation next step or declination next
     * step or failure next step is <code>InvokeDialogCodeHook</code>.
     * </p>
     * 
     * @param codeHook
     *        The <code>DialogCodeHookInvocationSetting</code> object associated with intent's confirmation step. The
     *        dialog code hook is triggered based on these invocation settings when the confirmation next step or
     *        declination next step or failure next step is <code>InvokeDialogCodeHook</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentConfirmationSetting withCodeHook(DialogCodeHookInvocationSetting codeHook) {
        setCodeHook(codeHook);
        return this;
    }

    /**
     * <p>
     * The <code>DialogCodeHookInvocationSetting</code> used when the code hook is invoked during confirmation prompt
     * retries.
     * </p>
     * 
     * @param elicitationCodeHook
     *        The <code>DialogCodeHookInvocationSetting</code> used when the code hook is invoked during confirmation
     *        prompt retries.
     */

    public void setElicitationCodeHook(ElicitationCodeHookInvocationSetting elicitationCodeHook) {
        this.elicitationCodeHook = elicitationCodeHook;
    }

    /**
     * <p>
     * The <code>DialogCodeHookInvocationSetting</code> used when the code hook is invoked during confirmation prompt
     * retries.
     * </p>
     * 
     * @return The <code>DialogCodeHookInvocationSetting</code> used when the code hook is invoked during confirmation
     *         prompt retries.
     */

    public ElicitationCodeHookInvocationSetting getElicitationCodeHook() {
        return this.elicitationCodeHook;
    }

    /**
     * <p>
     * The <code>DialogCodeHookInvocationSetting</code> used when the code hook is invoked during confirmation prompt
     * retries.
     * </p>
     * 
     * @param elicitationCodeHook
     *        The <code>DialogCodeHookInvocationSetting</code> used when the code hook is invoked during confirmation
     *        prompt retries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentConfirmationSetting withElicitationCodeHook(ElicitationCodeHookInvocationSetting elicitationCodeHook) {
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
        if (getPromptSpecification() != null)
            sb.append("PromptSpecification: ").append(getPromptSpecification()).append(",");
        if (getDeclinationResponse() != null)
            sb.append("DeclinationResponse: ").append(getDeclinationResponse()).append(",");
        if (getActive() != null)
            sb.append("Active: ").append(getActive()).append(",");
        if (getConfirmationResponse() != null)
            sb.append("ConfirmationResponse: ").append(getConfirmationResponse()).append(",");
        if (getConfirmationNextStep() != null)
            sb.append("ConfirmationNextStep: ").append(getConfirmationNextStep()).append(",");
        if (getConfirmationConditional() != null)
            sb.append("ConfirmationConditional: ").append(getConfirmationConditional()).append(",");
        if (getDeclinationNextStep() != null)
            sb.append("DeclinationNextStep: ").append(getDeclinationNextStep()).append(",");
        if (getDeclinationConditional() != null)
            sb.append("DeclinationConditional: ").append(getDeclinationConditional()).append(",");
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
        if (other.getActive() == null ^ this.getActive() == null)
            return false;
        if (other.getActive() != null && other.getActive().equals(this.getActive()) == false)
            return false;
        if (other.getConfirmationResponse() == null ^ this.getConfirmationResponse() == null)
            return false;
        if (other.getConfirmationResponse() != null && other.getConfirmationResponse().equals(this.getConfirmationResponse()) == false)
            return false;
        if (other.getConfirmationNextStep() == null ^ this.getConfirmationNextStep() == null)
            return false;
        if (other.getConfirmationNextStep() != null && other.getConfirmationNextStep().equals(this.getConfirmationNextStep()) == false)
            return false;
        if (other.getConfirmationConditional() == null ^ this.getConfirmationConditional() == null)
            return false;
        if (other.getConfirmationConditional() != null && other.getConfirmationConditional().equals(this.getConfirmationConditional()) == false)
            return false;
        if (other.getDeclinationNextStep() == null ^ this.getDeclinationNextStep() == null)
            return false;
        if (other.getDeclinationNextStep() != null && other.getDeclinationNextStep().equals(this.getDeclinationNextStep()) == false)
            return false;
        if (other.getDeclinationConditional() == null ^ this.getDeclinationConditional() == null)
            return false;
        if (other.getDeclinationConditional() != null && other.getDeclinationConditional().equals(this.getDeclinationConditional()) == false)
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

        hashCode = prime * hashCode + ((getPromptSpecification() == null) ? 0 : getPromptSpecification().hashCode());
        hashCode = prime * hashCode + ((getDeclinationResponse() == null) ? 0 : getDeclinationResponse().hashCode());
        hashCode = prime * hashCode + ((getActive() == null) ? 0 : getActive().hashCode());
        hashCode = prime * hashCode + ((getConfirmationResponse() == null) ? 0 : getConfirmationResponse().hashCode());
        hashCode = prime * hashCode + ((getConfirmationNextStep() == null) ? 0 : getConfirmationNextStep().hashCode());
        hashCode = prime * hashCode + ((getConfirmationConditional() == null) ? 0 : getConfirmationConditional().hashCode());
        hashCode = prime * hashCode + ((getDeclinationNextStep() == null) ? 0 : getDeclinationNextStep().hashCode());
        hashCode = prime * hashCode + ((getDeclinationConditional() == null) ? 0 : getDeclinationConditional().hashCode());
        hashCode = prime * hashCode + ((getFailureResponse() == null) ? 0 : getFailureResponse().hashCode());
        hashCode = prime * hashCode + ((getFailureNextStep() == null) ? 0 : getFailureNextStep().hashCode());
        hashCode = prime * hashCode + ((getFailureConditional() == null) ? 0 : getFailureConditional().hashCode());
        hashCode = prime * hashCode + ((getCodeHook() == null) ? 0 : getCodeHook().hashCode());
        hashCode = prime * hashCode + ((getElicitationCodeHook() == null) ? 0 : getElicitationCodeHook().hashCode());
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
