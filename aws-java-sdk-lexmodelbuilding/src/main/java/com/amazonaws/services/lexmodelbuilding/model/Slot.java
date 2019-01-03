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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Identifies the version of a specific slot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/Slot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Slot implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the slot.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the slot.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies whether the slot is required or optional.
     * </p>
     */
    private String slotConstraint;
    /**
     * <p>
     * The type of the slot, either a custom slot type that you defined or one of the built-in slot types.
     * </p>
     */
    private String slotType;
    /**
     * <p>
     * The version of the slot type.
     * </p>
     */
    private String slotTypeVersion;
    /**
     * <p>
     * The prompt that Amazon Lex uses to elicit the slot value from the user.
     * </p>
     */
    private Prompt valueElicitationPrompt;
    /**
     * <p>
     * Directs Lex the order in which to elicit this slot value from the user. For example, if the intent has two slots
     * with priorities 1 and 2, AWS Lex first elicits a value for the slot with priority 1.
     * </p>
     * <p>
     * If multiple slots share the same priority, the order in which Lex elicits values is arbitrary.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * If you know a specific pattern with which users might respond to an Amazon Lex request for a slot value, you can
     * provide those utterances to improve accuracy. This is optional. In most cases, Amazon Lex is capable of
     * understanding user utterances.
     * </p>
     */
    private java.util.List<String> sampleUtterances;
    /**
     * <p>
     * A set of possible responses for the slot type used by text-based clients. A user chooses an option from the
     * response card, instead of using text to reply.
     * </p>
     */
    private String responseCard;

    /**
     * <p>
     * The name of the slot.
     * </p>
     * 
     * @param name
     *        The name of the slot.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the slot.
     * </p>
     * 
     * @return The name of the slot.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the slot.
     * </p>
     * 
     * @param name
     *        The name of the slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Slot withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the slot.
     * </p>
     * 
     * @param description
     *        A description of the slot.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the slot.
     * </p>
     * 
     * @return A description of the slot.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the slot.
     * </p>
     * 
     * @param description
     *        A description of the slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Slot withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies whether the slot is required or optional.
     * </p>
     * 
     * @param slotConstraint
     *        Specifies whether the slot is required or optional.
     * @see SlotConstraint
     */

    public void setSlotConstraint(String slotConstraint) {
        this.slotConstraint = slotConstraint;
    }

    /**
     * <p>
     * Specifies whether the slot is required or optional.
     * </p>
     * 
     * @return Specifies whether the slot is required or optional.
     * @see SlotConstraint
     */

    public String getSlotConstraint() {
        return this.slotConstraint;
    }

    /**
     * <p>
     * Specifies whether the slot is required or optional.
     * </p>
     * 
     * @param slotConstraint
     *        Specifies whether the slot is required or optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SlotConstraint
     */

    public Slot withSlotConstraint(String slotConstraint) {
        setSlotConstraint(slotConstraint);
        return this;
    }

    /**
     * <p>
     * Specifies whether the slot is required or optional.
     * </p>
     * 
     * @param slotConstraint
     *        Specifies whether the slot is required or optional.
     * @see SlotConstraint
     */

    public void setSlotConstraint(SlotConstraint slotConstraint) {
        withSlotConstraint(slotConstraint);
    }

    /**
     * <p>
     * Specifies whether the slot is required or optional.
     * </p>
     * 
     * @param slotConstraint
     *        Specifies whether the slot is required or optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SlotConstraint
     */

    public Slot withSlotConstraint(SlotConstraint slotConstraint) {
        this.slotConstraint = slotConstraint.toString();
        return this;
    }

    /**
     * <p>
     * The type of the slot, either a custom slot type that you defined or one of the built-in slot types.
     * </p>
     * 
     * @param slotType
     *        The type of the slot, either a custom slot type that you defined or one of the built-in slot types.
     */

    public void setSlotType(String slotType) {
        this.slotType = slotType;
    }

    /**
     * <p>
     * The type of the slot, either a custom slot type that you defined or one of the built-in slot types.
     * </p>
     * 
     * @return The type of the slot, either a custom slot type that you defined or one of the built-in slot types.
     */

    public String getSlotType() {
        return this.slotType;
    }

    /**
     * <p>
     * The type of the slot, either a custom slot type that you defined or one of the built-in slot types.
     * </p>
     * 
     * @param slotType
     *        The type of the slot, either a custom slot type that you defined or one of the built-in slot types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Slot withSlotType(String slotType) {
        setSlotType(slotType);
        return this;
    }

    /**
     * <p>
     * The version of the slot type.
     * </p>
     * 
     * @param slotTypeVersion
     *        The version of the slot type.
     */

    public void setSlotTypeVersion(String slotTypeVersion) {
        this.slotTypeVersion = slotTypeVersion;
    }

    /**
     * <p>
     * The version of the slot type.
     * </p>
     * 
     * @return The version of the slot type.
     */

    public String getSlotTypeVersion() {
        return this.slotTypeVersion;
    }

    /**
     * <p>
     * The version of the slot type.
     * </p>
     * 
     * @param slotTypeVersion
     *        The version of the slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Slot withSlotTypeVersion(String slotTypeVersion) {
        setSlotTypeVersion(slotTypeVersion);
        return this;
    }

    /**
     * <p>
     * The prompt that Amazon Lex uses to elicit the slot value from the user.
     * </p>
     * 
     * @param valueElicitationPrompt
     *        The prompt that Amazon Lex uses to elicit the slot value from the user.
     */

    public void setValueElicitationPrompt(Prompt valueElicitationPrompt) {
        this.valueElicitationPrompt = valueElicitationPrompt;
    }

    /**
     * <p>
     * The prompt that Amazon Lex uses to elicit the slot value from the user.
     * </p>
     * 
     * @return The prompt that Amazon Lex uses to elicit the slot value from the user.
     */

    public Prompt getValueElicitationPrompt() {
        return this.valueElicitationPrompt;
    }

    /**
     * <p>
     * The prompt that Amazon Lex uses to elicit the slot value from the user.
     * </p>
     * 
     * @param valueElicitationPrompt
     *        The prompt that Amazon Lex uses to elicit the slot value from the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Slot withValueElicitationPrompt(Prompt valueElicitationPrompt) {
        setValueElicitationPrompt(valueElicitationPrompt);
        return this;
    }

    /**
     * <p>
     * Directs Lex the order in which to elicit this slot value from the user. For example, if the intent has two slots
     * with priorities 1 and 2, AWS Lex first elicits a value for the slot with priority 1.
     * </p>
     * <p>
     * If multiple slots share the same priority, the order in which Lex elicits values is arbitrary.
     * </p>
     * 
     * @param priority
     *        Directs Lex the order in which to elicit this slot value from the user. For example, if the intent has two
     *        slots with priorities 1 and 2, AWS Lex first elicits a value for the slot with priority 1.</p>
     *        <p>
     *        If multiple slots share the same priority, the order in which Lex elicits values is arbitrary.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * Directs Lex the order in which to elicit this slot value from the user. For example, if the intent has two slots
     * with priorities 1 and 2, AWS Lex first elicits a value for the slot with priority 1.
     * </p>
     * <p>
     * If multiple slots share the same priority, the order in which Lex elicits values is arbitrary.
     * </p>
     * 
     * @return Directs Lex the order in which to elicit this slot value from the user. For example, if the intent has
     *         two slots with priorities 1 and 2, AWS Lex first elicits a value for the slot with priority 1.</p>
     *         <p>
     *         If multiple slots share the same priority, the order in which Lex elicits values is arbitrary.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * Directs Lex the order in which to elicit this slot value from the user. For example, if the intent has two slots
     * with priorities 1 and 2, AWS Lex first elicits a value for the slot with priority 1.
     * </p>
     * <p>
     * If multiple slots share the same priority, the order in which Lex elicits values is arbitrary.
     * </p>
     * 
     * @param priority
     *        Directs Lex the order in which to elicit this slot value from the user. For example, if the intent has two
     *        slots with priorities 1 and 2, AWS Lex first elicits a value for the slot with priority 1.</p>
     *        <p>
     *        If multiple slots share the same priority, the order in which Lex elicits values is arbitrary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Slot withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * If you know a specific pattern with which users might respond to an Amazon Lex request for a slot value, you can
     * provide those utterances to improve accuracy. This is optional. In most cases, Amazon Lex is capable of
     * understanding user utterances.
     * </p>
     * 
     * @return If you know a specific pattern with which users might respond to an Amazon Lex request for a slot value,
     *         you can provide those utterances to improve accuracy. This is optional. In most cases, Amazon Lex is
     *         capable of understanding user utterances.
     */

    public java.util.List<String> getSampleUtterances() {
        return sampleUtterances;
    }

    /**
     * <p>
     * If you know a specific pattern with which users might respond to an Amazon Lex request for a slot value, you can
     * provide those utterances to improve accuracy. This is optional. In most cases, Amazon Lex is capable of
     * understanding user utterances.
     * </p>
     * 
     * @param sampleUtterances
     *        If you know a specific pattern with which users might respond to an Amazon Lex request for a slot value,
     *        you can provide those utterances to improve accuracy. This is optional. In most cases, Amazon Lex is
     *        capable of understanding user utterances.
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
     * If you know a specific pattern with which users might respond to an Amazon Lex request for a slot value, you can
     * provide those utterances to improve accuracy. This is optional. In most cases, Amazon Lex is capable of
     * understanding user utterances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSampleUtterances(java.util.Collection)} or {@link #withSampleUtterances(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param sampleUtterances
     *        If you know a specific pattern with which users might respond to an Amazon Lex request for a slot value,
     *        you can provide those utterances to improve accuracy. This is optional. In most cases, Amazon Lex is
     *        capable of understanding user utterances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Slot withSampleUtterances(String... sampleUtterances) {
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
     * If you know a specific pattern with which users might respond to an Amazon Lex request for a slot value, you can
     * provide those utterances to improve accuracy. This is optional. In most cases, Amazon Lex is capable of
     * understanding user utterances.
     * </p>
     * 
     * @param sampleUtterances
     *        If you know a specific pattern with which users might respond to an Amazon Lex request for a slot value,
     *        you can provide those utterances to improve accuracy. This is optional. In most cases, Amazon Lex is
     *        capable of understanding user utterances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Slot withSampleUtterances(java.util.Collection<String> sampleUtterances) {
        setSampleUtterances(sampleUtterances);
        return this;
    }

    /**
     * <p>
     * A set of possible responses for the slot type used by text-based clients. A user chooses an option from the
     * response card, instead of using text to reply.
     * </p>
     * 
     * @param responseCard
     *        A set of possible responses for the slot type used by text-based clients. A user chooses an option from
     *        the response card, instead of using text to reply.
     */

    public void setResponseCard(String responseCard) {
        this.responseCard = responseCard;
    }

    /**
     * <p>
     * A set of possible responses for the slot type used by text-based clients. A user chooses an option from the
     * response card, instead of using text to reply.
     * </p>
     * 
     * @return A set of possible responses for the slot type used by text-based clients. A user chooses an option from
     *         the response card, instead of using text to reply.
     */

    public String getResponseCard() {
        return this.responseCard;
    }

    /**
     * <p>
     * A set of possible responses for the slot type used by text-based clients. A user chooses an option from the
     * response card, instead of using text to reply.
     * </p>
     * 
     * @param responseCard
     *        A set of possible responses for the slot type used by text-based clients. A user chooses an option from
     *        the response card, instead of using text to reply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Slot withResponseCard(String responseCard) {
        setResponseCard(responseCard);
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
        if (getSlotConstraint() != null)
            sb.append("SlotConstraint: ").append(getSlotConstraint()).append(",");
        if (getSlotType() != null)
            sb.append("SlotType: ").append(getSlotType()).append(",");
        if (getSlotTypeVersion() != null)
            sb.append("SlotTypeVersion: ").append(getSlotTypeVersion()).append(",");
        if (getValueElicitationPrompt() != null)
            sb.append("ValueElicitationPrompt: ").append(getValueElicitationPrompt()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getSampleUtterances() != null)
            sb.append("SampleUtterances: ").append(getSampleUtterances()).append(",");
        if (getResponseCard() != null)
            sb.append("ResponseCard: ").append(getResponseCard());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Slot == false)
            return false;
        Slot other = (Slot) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSlotConstraint() == null ^ this.getSlotConstraint() == null)
            return false;
        if (other.getSlotConstraint() != null && other.getSlotConstraint().equals(this.getSlotConstraint()) == false)
            return false;
        if (other.getSlotType() == null ^ this.getSlotType() == null)
            return false;
        if (other.getSlotType() != null && other.getSlotType().equals(this.getSlotType()) == false)
            return false;
        if (other.getSlotTypeVersion() == null ^ this.getSlotTypeVersion() == null)
            return false;
        if (other.getSlotTypeVersion() != null && other.getSlotTypeVersion().equals(this.getSlotTypeVersion()) == false)
            return false;
        if (other.getValueElicitationPrompt() == null ^ this.getValueElicitationPrompt() == null)
            return false;
        if (other.getValueElicitationPrompt() != null && other.getValueElicitationPrompt().equals(this.getValueElicitationPrompt()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getSampleUtterances() == null ^ this.getSampleUtterances() == null)
            return false;
        if (other.getSampleUtterances() != null && other.getSampleUtterances().equals(this.getSampleUtterances()) == false)
            return false;
        if (other.getResponseCard() == null ^ this.getResponseCard() == null)
            return false;
        if (other.getResponseCard() != null && other.getResponseCard().equals(this.getResponseCard()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSlotConstraint() == null) ? 0 : getSlotConstraint().hashCode());
        hashCode = prime * hashCode + ((getSlotType() == null) ? 0 : getSlotType().hashCode());
        hashCode = prime * hashCode + ((getSlotTypeVersion() == null) ? 0 : getSlotTypeVersion().hashCode());
        hashCode = prime * hashCode + ((getValueElicitationPrompt() == null) ? 0 : getValueElicitationPrompt().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getSampleUtterances() == null) ? 0 : getSampleUtterances().hashCode());
        hashCode = prime * hashCode + ((getResponseCard() == null) ? 0 : getResponseCard().hashCode());
        return hashCode;
    }

    @Override
    public Slot clone() {
        try {
            return (Slot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelbuilding.model.transform.SlotMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
