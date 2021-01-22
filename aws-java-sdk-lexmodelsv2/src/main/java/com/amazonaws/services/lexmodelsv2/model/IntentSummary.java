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
 * Summary information about an intent returned by the <code>ListIntents</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/IntentSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IntentSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier assigned to the intent. Use this ID to get detailed information about the intent with the
     * <code>DescribeIntent</code> operation.
     * </p>
     */
    private String intentId;
    /**
     * <p>
     * The name of the intent.
     * </p>
     */
    private String intentName;
    /**
     * <p>
     * The description of the intent.
     * </p>
     */
    private String description;
    /**
     * <p>
     * If this intent is derived from a built-in intent, the name of the parent intent.
     * </p>
     */
    private String parentIntentSignature;
    /**
     * <p>
     * The input contexts that must be active for this intent to be considered for recognition.
     * </p>
     */
    private java.util.List<InputContext> inputContexts;
    /**
     * <p>
     * The output contexts that are activated when this intent is fulfilled.
     * </p>
     */
    private java.util.List<OutputContext> outputContexts;
    /**
     * <p>
     * The timestamp of the date and time that the intent was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The unique identifier assigned to the intent. Use this ID to get detailed information about the intent with the
     * <code>DescribeIntent</code> operation.
     * </p>
     * 
     * @param intentId
     *        The unique identifier assigned to the intent. Use this ID to get detailed information about the intent
     *        with the <code>DescribeIntent</code> operation.
     */

    public void setIntentId(String intentId) {
        this.intentId = intentId;
    }

    /**
     * <p>
     * The unique identifier assigned to the intent. Use this ID to get detailed information about the intent with the
     * <code>DescribeIntent</code> operation.
     * </p>
     * 
     * @return The unique identifier assigned to the intent. Use this ID to get detailed information about the intent
     *         with the <code>DescribeIntent</code> operation.
     */

    public String getIntentId() {
        return this.intentId;
    }

    /**
     * <p>
     * The unique identifier assigned to the intent. Use this ID to get detailed information about the intent with the
     * <code>DescribeIntent</code> operation.
     * </p>
     * 
     * @param intentId
     *        The unique identifier assigned to the intent. Use this ID to get detailed information about the intent
     *        with the <code>DescribeIntent</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentSummary withIntentId(String intentId) {
        setIntentId(intentId);
        return this;
    }

    /**
     * <p>
     * The name of the intent.
     * </p>
     * 
     * @param intentName
     *        The name of the intent.
     */

    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }

    /**
     * <p>
     * The name of the intent.
     * </p>
     * 
     * @return The name of the intent.
     */

    public String getIntentName() {
        return this.intentName;
    }

    /**
     * <p>
     * The name of the intent.
     * </p>
     * 
     * @param intentName
     *        The name of the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentSummary withIntentName(String intentName) {
        setIntentName(intentName);
        return this;
    }

    /**
     * <p>
     * The description of the intent.
     * </p>
     * 
     * @param description
     *        The description of the intent.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the intent.
     * </p>
     * 
     * @return The description of the intent.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the intent.
     * </p>
     * 
     * @param description
     *        The description of the intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * If this intent is derived from a built-in intent, the name of the parent intent.
     * </p>
     * 
     * @param parentIntentSignature
     *        If this intent is derived from a built-in intent, the name of the parent intent.
     */

    public void setParentIntentSignature(String parentIntentSignature) {
        this.parentIntentSignature = parentIntentSignature;
    }

    /**
     * <p>
     * If this intent is derived from a built-in intent, the name of the parent intent.
     * </p>
     * 
     * @return If this intent is derived from a built-in intent, the name of the parent intent.
     */

    public String getParentIntentSignature() {
        return this.parentIntentSignature;
    }

    /**
     * <p>
     * If this intent is derived from a built-in intent, the name of the parent intent.
     * </p>
     * 
     * @param parentIntentSignature
     *        If this intent is derived from a built-in intent, the name of the parent intent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentSummary withParentIntentSignature(String parentIntentSignature) {
        setParentIntentSignature(parentIntentSignature);
        return this;
    }

    /**
     * <p>
     * The input contexts that must be active for this intent to be considered for recognition.
     * </p>
     * 
     * @return The input contexts that must be active for this intent to be considered for recognition.
     */

    public java.util.List<InputContext> getInputContexts() {
        return inputContexts;
    }

    /**
     * <p>
     * The input contexts that must be active for this intent to be considered for recognition.
     * </p>
     * 
     * @param inputContexts
     *        The input contexts that must be active for this intent to be considered for recognition.
     */

    public void setInputContexts(java.util.Collection<InputContext> inputContexts) {
        if (inputContexts == null) {
            this.inputContexts = null;
            return;
        }

        this.inputContexts = new java.util.ArrayList<InputContext>(inputContexts);
    }

    /**
     * <p>
     * The input contexts that must be active for this intent to be considered for recognition.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputContexts(java.util.Collection)} or {@link #withInputContexts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param inputContexts
     *        The input contexts that must be active for this intent to be considered for recognition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentSummary withInputContexts(InputContext... inputContexts) {
        if (this.inputContexts == null) {
            setInputContexts(new java.util.ArrayList<InputContext>(inputContexts.length));
        }
        for (InputContext ele : inputContexts) {
            this.inputContexts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The input contexts that must be active for this intent to be considered for recognition.
     * </p>
     * 
     * @param inputContexts
     *        The input contexts that must be active for this intent to be considered for recognition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentSummary withInputContexts(java.util.Collection<InputContext> inputContexts) {
        setInputContexts(inputContexts);
        return this;
    }

    /**
     * <p>
     * The output contexts that are activated when this intent is fulfilled.
     * </p>
     * 
     * @return The output contexts that are activated when this intent is fulfilled.
     */

    public java.util.List<OutputContext> getOutputContexts() {
        return outputContexts;
    }

    /**
     * <p>
     * The output contexts that are activated when this intent is fulfilled.
     * </p>
     * 
     * @param outputContexts
     *        The output contexts that are activated when this intent is fulfilled.
     */

    public void setOutputContexts(java.util.Collection<OutputContext> outputContexts) {
        if (outputContexts == null) {
            this.outputContexts = null;
            return;
        }

        this.outputContexts = new java.util.ArrayList<OutputContext>(outputContexts);
    }

    /**
     * <p>
     * The output contexts that are activated when this intent is fulfilled.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputContexts(java.util.Collection)} or {@link #withOutputContexts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param outputContexts
     *        The output contexts that are activated when this intent is fulfilled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentSummary withOutputContexts(OutputContext... outputContexts) {
        if (this.outputContexts == null) {
            setOutputContexts(new java.util.ArrayList<OutputContext>(outputContexts.length));
        }
        for (OutputContext ele : outputContexts) {
            this.outputContexts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The output contexts that are activated when this intent is fulfilled.
     * </p>
     * 
     * @param outputContexts
     *        The output contexts that are activated when this intent is fulfilled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentSummary withOutputContexts(java.util.Collection<OutputContext> outputContexts) {
        setOutputContexts(outputContexts);
        return this;
    }

    /**
     * <p>
     * The timestamp of the date and time that the intent was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The timestamp of the date and time that the intent was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The timestamp of the date and time that the intent was last updated.
     * </p>
     * 
     * @return The timestamp of the date and time that the intent was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The timestamp of the date and time that the intent was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The timestamp of the date and time that the intent was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntentSummary withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
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
        if (getIntentId() != null)
            sb.append("IntentId: ").append(getIntentId()).append(",");
        if (getIntentName() != null)
            sb.append("IntentName: ").append(getIntentName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getParentIntentSignature() != null)
            sb.append("ParentIntentSignature: ").append(getParentIntentSignature()).append(",");
        if (getInputContexts() != null)
            sb.append("InputContexts: ").append(getInputContexts()).append(",");
        if (getOutputContexts() != null)
            sb.append("OutputContexts: ").append(getOutputContexts()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IntentSummary == false)
            return false;
        IntentSummary other = (IntentSummary) obj;
        if (other.getIntentId() == null ^ this.getIntentId() == null)
            return false;
        if (other.getIntentId() != null && other.getIntentId().equals(this.getIntentId()) == false)
            return false;
        if (other.getIntentName() == null ^ this.getIntentName() == null)
            return false;
        if (other.getIntentName() != null && other.getIntentName().equals(this.getIntentName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getParentIntentSignature() == null ^ this.getParentIntentSignature() == null)
            return false;
        if (other.getParentIntentSignature() != null && other.getParentIntentSignature().equals(this.getParentIntentSignature()) == false)
            return false;
        if (other.getInputContexts() == null ^ this.getInputContexts() == null)
            return false;
        if (other.getInputContexts() != null && other.getInputContexts().equals(this.getInputContexts()) == false)
            return false;
        if (other.getOutputContexts() == null ^ this.getOutputContexts() == null)
            return false;
        if (other.getOutputContexts() != null && other.getOutputContexts().equals(this.getOutputContexts()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntentId() == null) ? 0 : getIntentId().hashCode());
        hashCode = prime * hashCode + ((getIntentName() == null) ? 0 : getIntentName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getParentIntentSignature() == null) ? 0 : getParentIntentSignature().hashCode());
        hashCode = prime * hashCode + ((getInputContexts() == null) ? 0 : getInputContexts().hashCode());
        hashCode = prime * hashCode + ((getOutputContexts() == null) ? 0 : getOutputContexts().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public IntentSummary clone() {
        try {
            return (IntentSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.IntentSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
