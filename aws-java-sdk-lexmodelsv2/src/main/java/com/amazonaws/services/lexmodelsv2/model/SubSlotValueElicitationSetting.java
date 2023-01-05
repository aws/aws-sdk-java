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
 * Subslot elicitation settings.
 * </p>
 * <p>
 * <code>DefaultValueSpecification</code> is a list of default values for a constituent sub slot in a composite slot.
 * Default values are used when Amazon Lex hasn't determined a value for a slot. You can specify default values from
 * context variables, session attributes, and defined values. This is similar to <code>DefaultValueSpecification</code>
 * for slots.
 * </p>
 * <p>
 * <code>PromptSpecification</code> is the prompt that Amazon Lex uses to elicit the sub slot value from the user. This
 * is similar to <code>PromptSpecification</code> for slots.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/SubSlotValueElicitationSetting"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubSlotValueElicitationSetting implements Serializable, Cloneable, StructuredPojo {

    private SlotDefaultValueSpecification defaultValueSpecification;

    private PromptSpecification promptSpecification;
    /**
     * <p>
     * If you know a specific pattern that users might respond to an Amazon Lex request for a sub slot value, you can
     * provide those utterances to improve accuracy. This is optional. In most cases Amazon Lex is capable of
     * understanding user utterances. This is similar to <code>SampleUtterances</code> for slots.
     * </p>
     */
    private java.util.List<SampleUtterance> sampleUtterances;

    private WaitAndContinueSpecification waitAndContinueSpecification;

    /**
     * @param defaultValueSpecification
     */

    public void setDefaultValueSpecification(SlotDefaultValueSpecification defaultValueSpecification) {
        this.defaultValueSpecification = defaultValueSpecification;
    }

    /**
     * @return
     */

    public SlotDefaultValueSpecification getDefaultValueSpecification() {
        return this.defaultValueSpecification;
    }

    /**
     * @param defaultValueSpecification
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubSlotValueElicitationSetting withDefaultValueSpecification(SlotDefaultValueSpecification defaultValueSpecification) {
        setDefaultValueSpecification(defaultValueSpecification);
        return this;
    }

    /**
     * @param promptSpecification
     */

    public void setPromptSpecification(PromptSpecification promptSpecification) {
        this.promptSpecification = promptSpecification;
    }

    /**
     * @return
     */

    public PromptSpecification getPromptSpecification() {
        return this.promptSpecification;
    }

    /**
     * @param promptSpecification
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubSlotValueElicitationSetting withPromptSpecification(PromptSpecification promptSpecification) {
        setPromptSpecification(promptSpecification);
        return this;
    }

    /**
     * <p>
     * If you know a specific pattern that users might respond to an Amazon Lex request for a sub slot value, you can
     * provide those utterances to improve accuracy. This is optional. In most cases Amazon Lex is capable of
     * understanding user utterances. This is similar to <code>SampleUtterances</code> for slots.
     * </p>
     * 
     * @return If you know a specific pattern that users might respond to an Amazon Lex request for a sub slot value,
     *         you can provide those utterances to improve accuracy. This is optional. In most cases Amazon Lex is
     *         capable of understanding user utterances. This is similar to <code>SampleUtterances</code> for slots.
     */

    public java.util.List<SampleUtterance> getSampleUtterances() {
        return sampleUtterances;
    }

    /**
     * <p>
     * If you know a specific pattern that users might respond to an Amazon Lex request for a sub slot value, you can
     * provide those utterances to improve accuracy. This is optional. In most cases Amazon Lex is capable of
     * understanding user utterances. This is similar to <code>SampleUtterances</code> for slots.
     * </p>
     * 
     * @param sampleUtterances
     *        If you know a specific pattern that users might respond to an Amazon Lex request for a sub slot value, you
     *        can provide those utterances to improve accuracy. This is optional. In most cases Amazon Lex is capable of
     *        understanding user utterances. This is similar to <code>SampleUtterances</code> for slots.
     */

    public void setSampleUtterances(java.util.Collection<SampleUtterance> sampleUtterances) {
        if (sampleUtterances == null) {
            this.sampleUtterances = null;
            return;
        }

        this.sampleUtterances = new java.util.ArrayList<SampleUtterance>(sampleUtterances);
    }

    /**
     * <p>
     * If you know a specific pattern that users might respond to an Amazon Lex request for a sub slot value, you can
     * provide those utterances to improve accuracy. This is optional. In most cases Amazon Lex is capable of
     * understanding user utterances. This is similar to <code>SampleUtterances</code> for slots.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSampleUtterances(java.util.Collection)} or {@link #withSampleUtterances(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param sampleUtterances
     *        If you know a specific pattern that users might respond to an Amazon Lex request for a sub slot value, you
     *        can provide those utterances to improve accuracy. This is optional. In most cases Amazon Lex is capable of
     *        understanding user utterances. This is similar to <code>SampleUtterances</code> for slots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubSlotValueElicitationSetting withSampleUtterances(SampleUtterance... sampleUtterances) {
        if (this.sampleUtterances == null) {
            setSampleUtterances(new java.util.ArrayList<SampleUtterance>(sampleUtterances.length));
        }
        for (SampleUtterance ele : sampleUtterances) {
            this.sampleUtterances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If you know a specific pattern that users might respond to an Amazon Lex request for a sub slot value, you can
     * provide those utterances to improve accuracy. This is optional. In most cases Amazon Lex is capable of
     * understanding user utterances. This is similar to <code>SampleUtterances</code> for slots.
     * </p>
     * 
     * @param sampleUtterances
     *        If you know a specific pattern that users might respond to an Amazon Lex request for a sub slot value, you
     *        can provide those utterances to improve accuracy. This is optional. In most cases Amazon Lex is capable of
     *        understanding user utterances. This is similar to <code>SampleUtterances</code> for slots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubSlotValueElicitationSetting withSampleUtterances(java.util.Collection<SampleUtterance> sampleUtterances) {
        setSampleUtterances(sampleUtterances);
        return this;
    }

    /**
     * @param waitAndContinueSpecification
     */

    public void setWaitAndContinueSpecification(WaitAndContinueSpecification waitAndContinueSpecification) {
        this.waitAndContinueSpecification = waitAndContinueSpecification;
    }

    /**
     * @return
     */

    public WaitAndContinueSpecification getWaitAndContinueSpecification() {
        return this.waitAndContinueSpecification;
    }

    /**
     * @param waitAndContinueSpecification
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubSlotValueElicitationSetting withWaitAndContinueSpecification(WaitAndContinueSpecification waitAndContinueSpecification) {
        setWaitAndContinueSpecification(waitAndContinueSpecification);
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
        if (getDefaultValueSpecification() != null)
            sb.append("DefaultValueSpecification: ").append(getDefaultValueSpecification()).append(",");
        if (getPromptSpecification() != null)
            sb.append("PromptSpecification: ").append(getPromptSpecification()).append(",");
        if (getSampleUtterances() != null)
            sb.append("SampleUtterances: ").append(getSampleUtterances()).append(",");
        if (getWaitAndContinueSpecification() != null)
            sb.append("WaitAndContinueSpecification: ").append(getWaitAndContinueSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubSlotValueElicitationSetting == false)
            return false;
        SubSlotValueElicitationSetting other = (SubSlotValueElicitationSetting) obj;
        if (other.getDefaultValueSpecification() == null ^ this.getDefaultValueSpecification() == null)
            return false;
        if (other.getDefaultValueSpecification() != null && other.getDefaultValueSpecification().equals(this.getDefaultValueSpecification()) == false)
            return false;
        if (other.getPromptSpecification() == null ^ this.getPromptSpecification() == null)
            return false;
        if (other.getPromptSpecification() != null && other.getPromptSpecification().equals(this.getPromptSpecification()) == false)
            return false;
        if (other.getSampleUtterances() == null ^ this.getSampleUtterances() == null)
            return false;
        if (other.getSampleUtterances() != null && other.getSampleUtterances().equals(this.getSampleUtterances()) == false)
            return false;
        if (other.getWaitAndContinueSpecification() == null ^ this.getWaitAndContinueSpecification() == null)
            return false;
        if (other.getWaitAndContinueSpecification() != null && other.getWaitAndContinueSpecification().equals(this.getWaitAndContinueSpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultValueSpecification() == null) ? 0 : getDefaultValueSpecification().hashCode());
        hashCode = prime * hashCode + ((getPromptSpecification() == null) ? 0 : getPromptSpecification().hashCode());
        hashCode = prime * hashCode + ((getSampleUtterances() == null) ? 0 : getSampleUtterances().hashCode());
        hashCode = prime * hashCode + ((getWaitAndContinueSpecification() == null) ? 0 : getWaitAndContinueSpecification().hashCode());
        return hashCode;
    }

    @Override
    public SubSlotValueElicitationSetting clone() {
        try {
            return (SubSlotValueElicitationSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.SubSlotValueElicitationSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
