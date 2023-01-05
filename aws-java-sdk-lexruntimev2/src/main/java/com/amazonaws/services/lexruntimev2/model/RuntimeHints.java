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
package com.amazonaws.services.lexruntimev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * You can provide Amazon Lex V2 with hints to the phrases that a customer is likely to use for a slot. When a slot with
 * hints is resolved, the phrases in the runtime hints are preferred in the resolution. You can provide hints for a
 * maximum of 100 intents. You can provide a maximum of 100 slots.
 * </p>
 * <p>
 * Before you can use runtime hints with an existing bot, you must first rebuild the bot.
 * </p>
 * <p>
 * For more information, see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/using-hints.html">Using runtime hints
 * to improve recognition of slot values</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/RuntimeHints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuntimeHints implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of the slots in the intent that should have runtime hints added, and the phrases that should be added for
     * each slot.
     * </p>
     * <p>
     * The first level of the <code>slotHints</code> map is the name of the intent. The second level is the name of the
     * slot within the intent. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/using-hints.html">Using hints to improve accuracy</a>.
     * </p>
     * <p>
     * The intent name and slot name must exist.
     * </p>
     */
    private java.util.Map<String, java.util.Map<String, RuntimeHintDetails>> slotHints;

    /**
     * <p>
     * A list of the slots in the intent that should have runtime hints added, and the phrases that should be added for
     * each slot.
     * </p>
     * <p>
     * The first level of the <code>slotHints</code> map is the name of the intent. The second level is the name of the
     * slot within the intent. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/using-hints.html">Using hints to improve accuracy</a>.
     * </p>
     * <p>
     * The intent name and slot name must exist.
     * </p>
     * 
     * @return A list of the slots in the intent that should have runtime hints added, and the phrases that should be
     *         added for each slot.</p>
     *         <p>
     *         The first level of the <code>slotHints</code> map is the name of the intent. The second level is the name
     *         of the slot within the intent. For more information, see <a
     *         href="https://docs.aws.amazon.com/lexv2/latest/dg/using-hints.html">Using hints to improve accuracy</a>.
     *         </p>
     *         <p>
     *         The intent name and slot name must exist.
     */

    public java.util.Map<String, java.util.Map<String, RuntimeHintDetails>> getSlotHints() {
        return slotHints;
    }

    /**
     * <p>
     * A list of the slots in the intent that should have runtime hints added, and the phrases that should be added for
     * each slot.
     * </p>
     * <p>
     * The first level of the <code>slotHints</code> map is the name of the intent. The second level is the name of the
     * slot within the intent. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/using-hints.html">Using hints to improve accuracy</a>.
     * </p>
     * <p>
     * The intent name and slot name must exist.
     * </p>
     * 
     * @param slotHints
     *        A list of the slots in the intent that should have runtime hints added, and the phrases that should be
     *        added for each slot.</p>
     *        <p>
     *        The first level of the <code>slotHints</code> map is the name of the intent. The second level is the name
     *        of the slot within the intent. For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/using-hints.html">Using hints to improve accuracy</a>.
     *        </p>
     *        <p>
     *        The intent name and slot name must exist.
     */

    public void setSlotHints(java.util.Map<String, java.util.Map<String, RuntimeHintDetails>> slotHints) {
        this.slotHints = slotHints;
    }

    /**
     * <p>
     * A list of the slots in the intent that should have runtime hints added, and the phrases that should be added for
     * each slot.
     * </p>
     * <p>
     * The first level of the <code>slotHints</code> map is the name of the intent. The second level is the name of the
     * slot within the intent. For more information, see <a
     * href="https://docs.aws.amazon.com/lexv2/latest/dg/using-hints.html">Using hints to improve accuracy</a>.
     * </p>
     * <p>
     * The intent name and slot name must exist.
     * </p>
     * 
     * @param slotHints
     *        A list of the slots in the intent that should have runtime hints added, and the phrases that should be
     *        added for each slot.</p>
     *        <p>
     *        The first level of the <code>slotHints</code> map is the name of the intent. The second level is the name
     *        of the slot within the intent. For more information, see <a
     *        href="https://docs.aws.amazon.com/lexv2/latest/dg/using-hints.html">Using hints to improve accuracy</a>.
     *        </p>
     *        <p>
     *        The intent name and slot name must exist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeHints withSlotHints(java.util.Map<String, java.util.Map<String, RuntimeHintDetails>> slotHints) {
        setSlotHints(slotHints);
        return this;
    }

    /**
     * Add a single SlotHints entry
     *
     * @see RuntimeHints#withSlotHints
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeHints addSlotHintsEntry(String key, java.util.Map<String, RuntimeHintDetails> value) {
        if (null == this.slotHints) {
            this.slotHints = new java.util.HashMap<String, java.util.Map<String, RuntimeHintDetails>>();
        }
        if (this.slotHints.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.slotHints.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SlotHints.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeHints clearSlotHintsEntries() {
        this.slotHints = null;
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
        if (getSlotHints() != null)
            sb.append("SlotHints: ").append(getSlotHints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuntimeHints == false)
            return false;
        RuntimeHints other = (RuntimeHints) obj;
        if (other.getSlotHints() == null ^ this.getSlotHints() == null)
            return false;
        if (other.getSlotHints() != null && other.getSlotHints().equals(this.getSlotHints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSlotHints() == null) ? 0 : getSlotHints().hashCode());
        return hashCode;
    }

    @Override
    public RuntimeHints clone() {
        try {
            return (RuntimeHints) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexruntimev2.model.transform.RuntimeHintsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
