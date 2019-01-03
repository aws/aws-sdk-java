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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetIntent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIntentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the intent.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the intent.
     * </p>
     */
    private String description;
    /**
     * <p>
     * An array of intent slots configured for the intent.
     * </p>
     */
    private java.util.List<Slot> slots;
    /**
     * <p>
     * An array of sample utterances configured for the intent.
     * </p>
     */
    private java.util.List<String> sampleUtterances;
    /**
     * <p>
     * If defined in the bot, Amazon Lex uses prompt to confirm the intent before fulfilling the user's request. For
     * more information, see <a>PutIntent</a>.
     * </p>
     */
    private Prompt confirmationPrompt;
    /**
     * <p>
     * If the user answers "no" to the question defined in <code>confirmationPrompt</code>, Amazon Lex responds with
     * this statement to acknowledge that the intent was canceled.
     * </p>
     */
    private Statement rejectionStatement;
    /**
     * <p>
     * If defined in the bot, Amazon Lex uses this prompt to solicit additional user activity after the intent is
     * fulfilled. For more information, see <a>PutIntent</a>.
     * </p>
     */
    private FollowUpPrompt followUpPrompt;
    /**
     * <p>
     * After the Lambda function specified in the <code>fulfillmentActivity</code> element fulfills the intent, Amazon
     * Lex conveys this statement to the user.
     * </p>
     */
    private Statement conclusionStatement;
    /**
     * <p>
     * If defined in the bot, Amazon Amazon Lex invokes this Lambda function for each user input. For more information,
     * see <a>PutIntent</a>.
     * </p>
     */
    private CodeHook dialogCodeHook;
    /**
     * <p>
     * Describes how the intent is fulfilled. For more information, see <a>PutIntent</a>.
     * </p>
     */
    private FulfillmentActivity fulfillmentActivity;
    /**
     * <p>
     * A unique identifier for a built-in intent.
     * </p>
     */
    private String parentIntentSignature;
    /**
     * <p>
     * The date that the intent was updated. When you create a resource, the creation date and the last updated date are
     * the same.
     * </p>
     */
    private java.util.Date lastUpdatedDate;
    /**
     * <p>
     * The date that the intent was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The version of the intent.
     * </p>
     */
    private String version;
    /**
     * <p>
     * Checksum of the intent.
     * </p>
     */
    private String checksum;

    /**
     * <p>
     * The name of the intent.
     * </p>
     * 
     * @param name
     *        The name of the intent.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the intent.
     * </p>
     * 
     * @return The name of the intent.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the intent.
     * </p>
     * 
     * @param name
     *        The name of the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntentResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the intent.
     * </p>
     * 
     * @param description
     *        A description of the intent.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the intent.
     * </p>
     * 
     * @return A description of the intent.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the intent.
     * </p>
     * 
     * @param description
     *        A description of the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntentResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * An array of intent slots configured for the intent.
     * </p>
     * 
     * @return An array of intent slots configured for the intent.
     */

    public java.util.List<Slot> getSlots() {
        return slots;
    }

    /**
     * <p>
     * An array of intent slots configured for the intent.
     * </p>
     * 
     * @param slots
     *        An array of intent slots configured for the intent.
     */

    public void setSlots(java.util.Collection<Slot> slots) {
        if (slots == null) {
            this.slots = null;
            return;
        }

        this.slots = new java.util.ArrayList<Slot>(slots);
    }

    /**
     * <p>
     * An array of intent slots configured for the intent.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSlots(java.util.Collection)} or {@link #withSlots(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param slots
     *        An array of intent slots configured for the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntentResult withSlots(Slot... slots) {
        if (this.slots == null) {
            setSlots(new java.util.ArrayList<Slot>(slots.length));
        }
        for (Slot ele : slots) {
            this.slots.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of intent slots configured for the intent.
     * </p>
     * 
     * @param slots
     *        An array of intent slots configured for the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntentResult withSlots(java.util.Collection<Slot> slots) {
        setSlots(slots);
        return this;
    }

    /**
     * <p>
     * An array of sample utterances configured for the intent.
     * </p>
     * 
     * @return An array of sample utterances configured for the intent.
     */

    public java.util.List<String> getSampleUtterances() {
        return sampleUtterances;
    }

    /**
     * <p>
     * An array of sample utterances configured for the intent.
     * </p>
     * 
     * @param sampleUtterances
     *        An array of sample utterances configured for the intent.
     */

    public void setSampleUtterances(java.util.Collection<String> sampleUtterances) {
        if (sampleUtterances == null) {
            this.sampleUtterances = null;
            return;
        }

        this.sampleUtterances = new java.util.ArrayList<String>(sampleUtterances);
    }

    /**
     * <p>
     * An array of sample utterances configured for the intent.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSampleUtterances(java.util.Collection)} or {@link #withSampleUtterances(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param sampleUtterances
     *        An array of sample utterances configured for the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntentResult withSampleUtterances(String... sampleUtterances) {
        if (this.sampleUtterances == null) {
            setSampleUtterances(new java.util.ArrayList<String>(sampleUtterances.length));
        }
        for (String ele : sampleUtterances) {
            this.sampleUtterances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of sample utterances configured for the intent.
     * </p>
     * 
     * @param sampleUtterances
     *        An array of sample utterances configured for the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntentResult withSampleUtterances(java.util.Collection<String> sampleUtterances) {
        setSampleUtterances(sampleUtterances);
        return this;
    }

    /**
     * <p>
     * If defined in the bot, Amazon Lex uses prompt to confirm the intent before fulfilling the user's request. For
     * more information, see <a>PutIntent</a>.
     * </p>
     * 
     * @param confirmationPrompt
     *        If defined in the bot, Amazon Lex uses prompt to confirm the intent before fulfilling the user's request.
     *        For more information, see <a>PutIntent</a>.
     */

    public void setConfirmationPrompt(Prompt confirmationPrompt) {
        this.confirmationPrompt = confirmationPrompt;
    }

    /**
     * <p>
     * If defined in the bot, Amazon Lex uses prompt to confirm the intent before fulfilling the user's request. For
     * more information, see <a>PutIntent</a>.
     * </p>
     * 
     * @return If defined in the bot, Amazon Lex uses prompt to confirm the intent before fulfilling the user's request.
     *         For more information, see <a>PutIntent</a>.
     */

    public Prompt getConfirmationPrompt() {
        return this.confirmationPrompt;
    }

    /**
     * <p>
     * If defined in the bot, Amazon Lex uses prompt to confirm the intent before fulfilling the user's request. For
     * more information, see <a>PutIntent</a>.
     * </p>
     * 
     * @param confirmationPrompt
     *        If defined in the bot, Amazon Lex uses prompt to confirm the intent before fulfilling the user's request.
     *        For more information, see <a>PutIntent</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntentResult withConfirmationPrompt(Prompt confirmationPrompt) {
        setConfirmationPrompt(confirmationPrompt);
        return this;
    }

    /**
     * <p>
     * If the user answers "no" to the question defined in <code>confirmationPrompt</code>, Amazon Lex responds with
     * this statement to acknowledge that the intent was canceled.
     * </p>
     * 
     * @param rejectionStatement
     *        If the user answers "no" to the question defined in <code>confirmationPrompt</code>, Amazon Lex responds
     *        with this statement to acknowledge that the intent was canceled.
     */

    public void setRejectionStatement(Statement rejectionStatement) {
        this.rejectionStatement = rejectionStatement;
    }

    /**
     * <p>
     * If the user answers "no" to the question defined in <code>confirmationPrompt</code>, Amazon Lex responds with
     * this statement to acknowledge that the intent was canceled.
     * </p>
     * 
     * @return If the user answers "no" to the question defined in <code>confirmationPrompt</code>, Amazon Lex responds
     *         with this statement to acknowledge that the intent was canceled.
     */

    public Statement getRejectionStatement() {
        return this.rejectionStatement;
    }

    /**
     * <p>
     * If the user answers "no" to the question defined in <code>confirmationPrompt</code>, Amazon Lex responds with
     * this statement to acknowledge that the intent was canceled.
     * </p>
     * 
     * @param rejectionStatement
     *        If the user answers "no" to the question defined in <code>confirmationPrompt</code>, Amazon Lex responds
     *        with this statement to acknowledge that the intent was canceled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntentResult withRejectionStatement(Statement rejectionStatement) {
        setRejectionStatement(rejectionStatement);
        return this;
    }

    /**
     * <p>
     * If defined in the bot, Amazon Lex uses this prompt to solicit additional user activity after the intent is
     * fulfilled. For more information, see <a>PutIntent</a>.
     * </p>
     * 
     * @param followUpPrompt
     *        If defined in the bot, Amazon Lex uses this prompt to solicit additional user activity after the intent is
     *        fulfilled. For more information, see <a>PutIntent</a>.
     */

    public void setFollowUpPrompt(FollowUpPrompt followUpPrompt) {
        this.followUpPrompt = followUpPrompt;
    }

    /**
     * <p>
     * If defined in the bot, Amazon Lex uses this prompt to solicit additional user activity after the intent is
     * fulfilled. For more information, see <a>PutIntent</a>.
     * </p>
     * 
     * @return If defined in the bot, Amazon Lex uses this prompt to solicit additional user activity after the intent
     *         is fulfilled. For more information, see <a>PutIntent</a>.
     */

    public FollowUpPrompt getFollowUpPrompt() {
        return this.followUpPrompt;
    }

    /**
     * <p>
     * If defined in the bot, Amazon Lex uses this prompt to solicit additional user activity after the intent is
     * fulfilled. For more information, see <a>PutIntent</a>.
     * </p>
     * 
     * @param followUpPrompt
     *        If defined in the bot, Amazon Lex uses this prompt to solicit additional user activity after the intent is
     *        fulfilled. For more information, see <a>PutIntent</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntentResult withFollowUpPrompt(FollowUpPrompt followUpPrompt) {
        setFollowUpPrompt(followUpPrompt);
        return this;
    }

    /**
     * <p>
     * After the Lambda function specified in the <code>fulfillmentActivity</code> element fulfills the intent, Amazon
     * Lex conveys this statement to the user.
     * </p>
     * 
     * @param conclusionStatement
     *        After the Lambda function specified in the <code>fulfillmentActivity</code> element fulfills the intent,
     *        Amazon Lex conveys this statement to the user.
     */

    public void setConclusionStatement(Statement conclusionStatement) {
        this.conclusionStatement = conclusionStatement;
    }

    /**
     * <p>
     * After the Lambda function specified in the <code>fulfillmentActivity</code> element fulfills the intent, Amazon
     * Lex conveys this statement to the user.
     * </p>
     * 
     * @return After the Lambda function specified in the <code>fulfillmentActivity</code> element fulfills the intent,
     *         Amazon Lex conveys this statement to the user.
     */

    public Statement getConclusionStatement() {
        return this.conclusionStatement;
    }

    /**
     * <p>
     * After the Lambda function specified in the <code>fulfillmentActivity</code> element fulfills the intent, Amazon
     * Lex conveys this statement to the user.
     * </p>
     * 
     * @param conclusionStatement
     *        After the Lambda function specified in the <code>fulfillmentActivity</code> element fulfills the intent,
     *        Amazon Lex conveys this statement to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntentResult withConclusionStatement(Statement conclusionStatement) {
        setConclusionStatement(conclusionStatement);
        return this;
    }

    /**
     * <p>
     * If defined in the bot, Amazon Amazon Lex invokes this Lambda function for each user input. For more information,
     * see <a>PutIntent</a>.
     * </p>
     * 
     * @param dialogCodeHook
     *        If defined in the bot, Amazon Amazon Lex invokes this Lambda function for each user input. For more
     *        information, see <a>PutIntent</a>.
     */

    public void setDialogCodeHook(CodeHook dialogCodeHook) {
        this.dialogCodeHook = dialogCodeHook;
    }

    /**
     * <p>
     * If defined in the bot, Amazon Amazon Lex invokes this Lambda function for each user input. For more information,
     * see <a>PutIntent</a>.
     * </p>
     * 
     * @return If defined in the bot, Amazon Amazon Lex invokes this Lambda function for each user input. For more
     *         information, see <a>PutIntent</a>.
     */

    public CodeHook getDialogCodeHook() {
        return this.dialogCodeHook;
    }

    /**
     * <p>
     * If defined in the bot, Amazon Amazon Lex invokes this Lambda function for each user input. For more information,
     * see <a>PutIntent</a>.
     * </p>
     * 
     * @param dialogCodeHook
     *        If defined in the bot, Amazon Amazon Lex invokes this Lambda function for each user input. For more
     *        information, see <a>PutIntent</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntentResult withDialogCodeHook(CodeHook dialogCodeHook) {
        setDialogCodeHook(dialogCodeHook);
        return this;
    }

    /**
     * <p>
     * Describes how the intent is fulfilled. For more information, see <a>PutIntent</a>.
     * </p>
     * 
     * @param fulfillmentActivity
     *        Describes how the intent is fulfilled. For more information, see <a>PutIntent</a>.
     */

    public void setFulfillmentActivity(FulfillmentActivity fulfillmentActivity) {
        this.fulfillmentActivity = fulfillmentActivity;
    }

    /**
     * <p>
     * Describes how the intent is fulfilled. For more information, see <a>PutIntent</a>.
     * </p>
     * 
     * @return Describes how the intent is fulfilled. For more information, see <a>PutIntent</a>.
     */

    public FulfillmentActivity getFulfillmentActivity() {
        return this.fulfillmentActivity;
    }

    /**
     * <p>
     * Describes how the intent is fulfilled. For more information, see <a>PutIntent</a>.
     * </p>
     * 
     * @param fulfillmentActivity
     *        Describes how the intent is fulfilled. For more information, see <a>PutIntent</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntentResult withFulfillmentActivity(FulfillmentActivity fulfillmentActivity) {
        setFulfillmentActivity(fulfillmentActivity);
        return this;
    }

    /**
     * <p>
     * A unique identifier for a built-in intent.
     * </p>
     * 
     * @param parentIntentSignature
     *        A unique identifier for a built-in intent.
     */

    public void setParentIntentSignature(String parentIntentSignature) {
        this.parentIntentSignature = parentIntentSignature;
    }

    /**
     * <p>
     * A unique identifier for a built-in intent.
     * </p>
     * 
     * @return A unique identifier for a built-in intent.
     */

    public String getParentIntentSignature() {
        return this.parentIntentSignature;
    }

    /**
     * <p>
     * A unique identifier for a built-in intent.
     * </p>
     * 
     * @param parentIntentSignature
     *        A unique identifier for a built-in intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntentResult withParentIntentSignature(String parentIntentSignature) {
        setParentIntentSignature(parentIntentSignature);
        return this;
    }

    /**
     * <p>
     * The date that the intent was updated. When you create a resource, the creation date and the last updated date are
     * the same.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date that the intent was updated. When you create a resource, the creation date and the last updated
     *        date are the same.
     */

    public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>
     * The date that the intent was updated. When you create a resource, the creation date and the last updated date are
     * the same.
     * </p>
     * 
     * @return The date that the intent was updated. When you create a resource, the creation date and the last updated
     *         date are the same.
     */

    public java.util.Date getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    /**
     * <p>
     * The date that the intent was updated. When you create a resource, the creation date and the last updated date are
     * the same.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date that the intent was updated. When you create a resource, the creation date and the last updated
     *        date are the same.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntentResult withLastUpdatedDate(java.util.Date lastUpdatedDate) {
        setLastUpdatedDate(lastUpdatedDate);
        return this;
    }

    /**
     * <p>
     * The date that the intent was created.
     * </p>
     * 
     * @param createdDate
     *        The date that the intent was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date that the intent was created.
     * </p>
     * 
     * @return The date that the intent was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date that the intent was created.
     * </p>
     * 
     * @param createdDate
     *        The date that the intent was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntentResult withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The version of the intent.
     * </p>
     * 
     * @param version
     *        The version of the intent.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the intent.
     * </p>
     * 
     * @return The version of the intent.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the intent.
     * </p>
     * 
     * @param version
     *        The version of the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntentResult withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * Checksum of the intent.
     * </p>
     * 
     * @param checksum
     *        Checksum of the intent.
     */

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * Checksum of the intent.
     * </p>
     * 
     * @return Checksum of the intent.
     */

    public String getChecksum() {
        return this.checksum;
    }

    /**
     * <p>
     * Checksum of the intent.
     * </p>
     * 
     * @param checksum
     *        Checksum of the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIntentResult withChecksum(String checksum) {
        setChecksum(checksum);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSlots() != null)
            sb.append("Slots: ").append(getSlots()).append(",");
        if (getSampleUtterances() != null)
            sb.append("SampleUtterances: ").append(getSampleUtterances()).append(",");
        if (getConfirmationPrompt() != null)
            sb.append("ConfirmationPrompt: ").append(getConfirmationPrompt()).append(",");
        if (getRejectionStatement() != null)
            sb.append("RejectionStatement: ").append(getRejectionStatement()).append(",");
        if (getFollowUpPrompt() != null)
            sb.append("FollowUpPrompt: ").append(getFollowUpPrompt()).append(",");
        if (getConclusionStatement() != null)
            sb.append("ConclusionStatement: ").append(getConclusionStatement()).append(",");
        if (getDialogCodeHook() != null)
            sb.append("DialogCodeHook: ").append(getDialogCodeHook()).append(",");
        if (getFulfillmentActivity() != null)
            sb.append("FulfillmentActivity: ").append(getFulfillmentActivity()).append(",");
        if (getParentIntentSignature() != null)
            sb.append("ParentIntentSignature: ").append(getParentIntentSignature()).append(",");
        if (getLastUpdatedDate() != null)
            sb.append("LastUpdatedDate: ").append(getLastUpdatedDate()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getChecksum() != null)
            sb.append("Checksum: ").append(getChecksum());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIntentResult == false)
            return false;
        GetIntentResult other = (GetIntentResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSlots() == null ^ this.getSlots() == null)
            return false;
        if (other.getSlots() != null && other.getSlots().equals(this.getSlots()) == false)
            return false;
        if (other.getSampleUtterances() == null ^ this.getSampleUtterances() == null)
            return false;
        if (other.getSampleUtterances() != null && other.getSampleUtterances().equals(this.getSampleUtterances()) == false)
            return false;
        if (other.getConfirmationPrompt() == null ^ this.getConfirmationPrompt() == null)
            return false;
        if (other.getConfirmationPrompt() != null && other.getConfirmationPrompt().equals(this.getConfirmationPrompt()) == false)
            return false;
        if (other.getRejectionStatement() == null ^ this.getRejectionStatement() == null)
            return false;
        if (other.getRejectionStatement() != null && other.getRejectionStatement().equals(this.getRejectionStatement()) == false)
            return false;
        if (other.getFollowUpPrompt() == null ^ this.getFollowUpPrompt() == null)
            return false;
        if (other.getFollowUpPrompt() != null && other.getFollowUpPrompt().equals(this.getFollowUpPrompt()) == false)
            return false;
        if (other.getConclusionStatement() == null ^ this.getConclusionStatement() == null)
            return false;
        if (other.getConclusionStatement() != null && other.getConclusionStatement().equals(this.getConclusionStatement()) == false)
            return false;
        if (other.getDialogCodeHook() == null ^ this.getDialogCodeHook() == null)
            return false;
        if (other.getDialogCodeHook() != null && other.getDialogCodeHook().equals(this.getDialogCodeHook()) == false)
            return false;
        if (other.getFulfillmentActivity() == null ^ this.getFulfillmentActivity() == null)
            return false;
        if (other.getFulfillmentActivity() != null && other.getFulfillmentActivity().equals(this.getFulfillmentActivity()) == false)
            return false;
        if (other.getParentIntentSignature() == null ^ this.getParentIntentSignature() == null)
            return false;
        if (other.getParentIntentSignature() != null && other.getParentIntentSignature().equals(this.getParentIntentSignature()) == false)
            return false;
        if (other.getLastUpdatedDate() == null ^ this.getLastUpdatedDate() == null)
            return false;
        if (other.getLastUpdatedDate() != null && other.getLastUpdatedDate().equals(this.getLastUpdatedDate()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSlots() == null) ? 0 : getSlots().hashCode());
        hashCode = prime * hashCode + ((getSampleUtterances() == null) ? 0 : getSampleUtterances().hashCode());
        hashCode = prime * hashCode + ((getConfirmationPrompt() == null) ? 0 : getConfirmationPrompt().hashCode());
        hashCode = prime * hashCode + ((getRejectionStatement() == null) ? 0 : getRejectionStatement().hashCode());
        hashCode = prime * hashCode + ((getFollowUpPrompt() == null) ? 0 : getFollowUpPrompt().hashCode());
        hashCode = prime * hashCode + ((getConclusionStatement() == null) ? 0 : getConclusionStatement().hashCode());
        hashCode = prime * hashCode + ((getDialogCodeHook() == null) ? 0 : getDialogCodeHook().hashCode());
        hashCode = prime * hashCode + ((getFulfillmentActivity() == null) ? 0 : getFulfillmentActivity().hashCode());
        hashCode = prime * hashCode + ((getParentIntentSignature() == null) ? 0 : getParentIntentSignature().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        return hashCode;
    }

    @Override
    public GetIntentResult clone() {
        try {
            return (GetIntentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
