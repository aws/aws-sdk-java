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
 * The next action that Amazon Lex V2 should take.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/DialogAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DialogAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The next action that the bot should take in its interaction with the user. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Close</code> - Indicates that there will not be a response from the user. For example, the statement
     * "Your order has been placed" does not require a response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - The next action is asking the user if the intent is complete and ready to be
     * fulfilled. This is a yes/no question such as "Place the order?"
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Delegate</code> - The next action is determined by Amazon Lex V2.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - The next action is to elicit an intent from the user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - The next action is to elicit a slot value from the user.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * The name of the slot that should be elicited from the user.
     * </p>
     */
    private String slotToElicit;
    /**
     * <p>
     * Configures the slot to use spell-by-letter or spell-by-word style. When you use a style on a slot, users can
     * spell out their input to make it clear to your bot.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Spell by letter - "b" "o" "b"
     * </p>
     * </li>
     * <li>
     * <p>
     * Spell by word - "b as in boy" "o as in oscar" "b as in boy"
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/using-spelling.html"> Using
     * spelling to enter slot values </a>.
     * </p>
     */
    private String slotElicitationStyle;
    /**
     * <p>
     * The name of the constituent sub slot of the composite slot specified in slotToElicit that should be elicited from
     * the user.
     * </p>
     */
    private ElicitSubSlot subSlotToElicit;

    /**
     * <p>
     * The next action that the bot should take in its interaction with the user. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Close</code> - Indicates that there will not be a response from the user. For example, the statement
     * "Your order has been placed" does not require a response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - The next action is asking the user if the intent is complete and ready to be
     * fulfilled. This is a yes/no question such as "Place the order?"
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Delegate</code> - The next action is determined by Amazon Lex V2.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - The next action is to elicit an intent from the user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - The next action is to elicit a slot value from the user.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The next action that the bot should take in its interaction with the user. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Close</code> - Indicates that there will not be a response from the user. For example, the statement
     *        "Your order has been placed" does not require a response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConfirmIntent</code> - The next action is asking the user if the intent is complete and ready to be
     *        fulfilled. This is a yes/no question such as "Place the order?"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Delegate</code> - The next action is determined by Amazon Lex V2.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ElicitIntent</code> - The next action is to elicit an intent from the user.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ElicitSlot</code> - The next action is to elicit a slot value from the user.
     *        </p>
     *        </li>
     * @see DialogActionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The next action that the bot should take in its interaction with the user. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Close</code> - Indicates that there will not be a response from the user. For example, the statement
     * "Your order has been placed" does not require a response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - The next action is asking the user if the intent is complete and ready to be
     * fulfilled. This is a yes/no question such as "Place the order?"
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Delegate</code> - The next action is determined by Amazon Lex V2.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - The next action is to elicit an intent from the user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - The next action is to elicit a slot value from the user.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The next action that the bot should take in its interaction with the user. The possible values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Close</code> - Indicates that there will not be a response from the user. For example, the
     *         statement "Your order has been placed" does not require a response.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ConfirmIntent</code> - The next action is asking the user if the intent is complete and ready to be
     *         fulfilled. This is a yes/no question such as "Place the order?"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Delegate</code> - The next action is determined by Amazon Lex V2.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ElicitIntent</code> - The next action is to elicit an intent from the user.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ElicitSlot</code> - The next action is to elicit a slot value from the user.
     *         </p>
     *         </li>
     * @see DialogActionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The next action that the bot should take in its interaction with the user. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Close</code> - Indicates that there will not be a response from the user. For example, the statement
     * "Your order has been placed" does not require a response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - The next action is asking the user if the intent is complete and ready to be
     * fulfilled. This is a yes/no question such as "Place the order?"
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Delegate</code> - The next action is determined by Amazon Lex V2.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - The next action is to elicit an intent from the user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - The next action is to elicit a slot value from the user.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The next action that the bot should take in its interaction with the user. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Close</code> - Indicates that there will not be a response from the user. For example, the statement
     *        "Your order has been placed" does not require a response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConfirmIntent</code> - The next action is asking the user if the intent is complete and ready to be
     *        fulfilled. This is a yes/no question such as "Place the order?"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Delegate</code> - The next action is determined by Amazon Lex V2.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ElicitIntent</code> - The next action is to elicit an intent from the user.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ElicitSlot</code> - The next action is to elicit a slot value from the user.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DialogActionType
     */

    public DialogAction withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The next action that the bot should take in its interaction with the user. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Close</code> - Indicates that there will not be a response from the user. For example, the statement
     * "Your order has been placed" does not require a response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConfirmIntent</code> - The next action is asking the user if the intent is complete and ready to be
     * fulfilled. This is a yes/no question such as "Place the order?"
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Delegate</code> - The next action is determined by Amazon Lex V2.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitIntent</code> - The next action is to elicit an intent from the user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ElicitSlot</code> - The next action is to elicit a slot value from the user.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The next action that the bot should take in its interaction with the user. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Close</code> - Indicates that there will not be a response from the user. For example, the statement
     *        "Your order has been placed" does not require a response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConfirmIntent</code> - The next action is asking the user if the intent is complete and ready to be
     *        fulfilled. This is a yes/no question such as "Place the order?"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Delegate</code> - The next action is determined by Amazon Lex V2.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ElicitIntent</code> - The next action is to elicit an intent from the user.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ElicitSlot</code> - The next action is to elicit a slot value from the user.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DialogActionType
     */

    public DialogAction withType(DialogActionType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the slot that should be elicited from the user.
     * </p>
     * 
     * @param slotToElicit
     *        The name of the slot that should be elicited from the user.
     */

    public void setSlotToElicit(String slotToElicit) {
        this.slotToElicit = slotToElicit;
    }

    /**
     * <p>
     * The name of the slot that should be elicited from the user.
     * </p>
     * 
     * @return The name of the slot that should be elicited from the user.
     */

    public String getSlotToElicit() {
        return this.slotToElicit;
    }

    /**
     * <p>
     * The name of the slot that should be elicited from the user.
     * </p>
     * 
     * @param slotToElicit
     *        The name of the slot that should be elicited from the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DialogAction withSlotToElicit(String slotToElicit) {
        setSlotToElicit(slotToElicit);
        return this;
    }

    /**
     * <p>
     * Configures the slot to use spell-by-letter or spell-by-word style. When you use a style on a slot, users can
     * spell out their input to make it clear to your bot.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Spell by letter - "b" "o" "b"
     * </p>
     * </li>
     * <li>
     * <p>
     * Spell by word - "b as in boy" "o as in oscar" "b as in boy"
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/using-spelling.html"> Using
     * spelling to enter slot values </a>.
     * </p>
     * 
     * @param slotElicitationStyle
     *        Configures the slot to use spell-by-letter or spell-by-word style. When you use a style on a slot, users
     *        can spell out their input to make it clear to your bot.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Spell by letter - "b" "o" "b"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Spell by word - "b as in boy" "o as in oscar" "b as in boy"
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/using-spelling.html"> Using
     *        spelling to enter slot values </a>.
     * @see StyleType
     */

    public void setSlotElicitationStyle(String slotElicitationStyle) {
        this.slotElicitationStyle = slotElicitationStyle;
    }

    /**
     * <p>
     * Configures the slot to use spell-by-letter or spell-by-word style. When you use a style on a slot, users can
     * spell out their input to make it clear to your bot.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Spell by letter - "b" "o" "b"
     * </p>
     * </li>
     * <li>
     * <p>
     * Spell by word - "b as in boy" "o as in oscar" "b as in boy"
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/using-spelling.html"> Using
     * spelling to enter slot values </a>.
     * </p>
     * 
     * @return Configures the slot to use spell-by-letter or spell-by-word style. When you use a style on a slot, users
     *         can spell out their input to make it clear to your bot.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Spell by letter - "b" "o" "b"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Spell by word - "b as in boy" "o as in oscar" "b as in boy"
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/using-spelling.html">
     *         Using spelling to enter slot values </a>.
     * @see StyleType
     */

    public String getSlotElicitationStyle() {
        return this.slotElicitationStyle;
    }

    /**
     * <p>
     * Configures the slot to use spell-by-letter or spell-by-word style. When you use a style on a slot, users can
     * spell out their input to make it clear to your bot.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Spell by letter - "b" "o" "b"
     * </p>
     * </li>
     * <li>
     * <p>
     * Spell by word - "b as in boy" "o as in oscar" "b as in boy"
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/using-spelling.html"> Using
     * spelling to enter slot values </a>.
     * </p>
     * 
     * @param slotElicitationStyle
     *        Configures the slot to use spell-by-letter or spell-by-word style. When you use a style on a slot, users
     *        can spell out their input to make it clear to your bot.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Spell by letter - "b" "o" "b"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Spell by word - "b as in boy" "o as in oscar" "b as in boy"
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/using-spelling.html"> Using
     *        spelling to enter slot values </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StyleType
     */

    public DialogAction withSlotElicitationStyle(String slotElicitationStyle) {
        setSlotElicitationStyle(slotElicitationStyle);
        return this;
    }

    /**
     * <p>
     * Configures the slot to use spell-by-letter or spell-by-word style. When you use a style on a slot, users can
     * spell out their input to make it clear to your bot.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Spell by letter - "b" "o" "b"
     * </p>
     * </li>
     * <li>
     * <p>
     * Spell by word - "b as in boy" "o as in oscar" "b as in boy"
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/using-spelling.html"> Using
     * spelling to enter slot values </a>.
     * </p>
     * 
     * @param slotElicitationStyle
     *        Configures the slot to use spell-by-letter or spell-by-word style. When you use a style on a slot, users
     *        can spell out their input to make it clear to your bot.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Spell by letter - "b" "o" "b"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Spell by word - "b as in boy" "o as in oscar" "b as in boy"
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/using-spelling.html"> Using
     *        spelling to enter slot values </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StyleType
     */

    public DialogAction withSlotElicitationStyle(StyleType slotElicitationStyle) {
        this.slotElicitationStyle = slotElicitationStyle.toString();
        return this;
    }

    /**
     * <p>
     * The name of the constituent sub slot of the composite slot specified in slotToElicit that should be elicited from
     * the user.
     * </p>
     * 
     * @param subSlotToElicit
     *        The name of the constituent sub slot of the composite slot specified in slotToElicit that should be
     *        elicited from the user.
     */

    public void setSubSlotToElicit(ElicitSubSlot subSlotToElicit) {
        this.subSlotToElicit = subSlotToElicit;
    }

    /**
     * <p>
     * The name of the constituent sub slot of the composite slot specified in slotToElicit that should be elicited from
     * the user.
     * </p>
     * 
     * @return The name of the constituent sub slot of the composite slot specified in slotToElicit that should be
     *         elicited from the user.
     */

    public ElicitSubSlot getSubSlotToElicit() {
        return this.subSlotToElicit;
    }

    /**
     * <p>
     * The name of the constituent sub slot of the composite slot specified in slotToElicit that should be elicited from
     * the user.
     * </p>
     * 
     * @param subSlotToElicit
     *        The name of the constituent sub slot of the composite slot specified in slotToElicit that should be
     *        elicited from the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DialogAction withSubSlotToElicit(ElicitSubSlot subSlotToElicit) {
        setSubSlotToElicit(subSlotToElicit);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getSlotToElicit() != null)
            sb.append("SlotToElicit: ").append(getSlotToElicit()).append(",");
        if (getSlotElicitationStyle() != null)
            sb.append("SlotElicitationStyle: ").append(getSlotElicitationStyle()).append(",");
        if (getSubSlotToElicit() != null)
            sb.append("SubSlotToElicit: ").append(getSubSlotToElicit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DialogAction == false)
            return false;
        DialogAction other = (DialogAction) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getSlotToElicit() == null ^ this.getSlotToElicit() == null)
            return false;
        if (other.getSlotToElicit() != null && other.getSlotToElicit().equals(this.getSlotToElicit()) == false)
            return false;
        if (other.getSlotElicitationStyle() == null ^ this.getSlotElicitationStyle() == null)
            return false;
        if (other.getSlotElicitationStyle() != null && other.getSlotElicitationStyle().equals(this.getSlotElicitationStyle()) == false)
            return false;
        if (other.getSubSlotToElicit() == null ^ this.getSubSlotToElicit() == null)
            return false;
        if (other.getSubSlotToElicit() != null && other.getSubSlotToElicit().equals(this.getSubSlotToElicit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getSlotToElicit() == null) ? 0 : getSlotToElicit().hashCode());
        hashCode = prime * hashCode + ((getSlotElicitationStyle() == null) ? 0 : getSlotElicitationStyle().hashCode());
        hashCode = prime * hashCode + ((getSubSlotToElicit() == null) ? 0 : getSubSlotToElicit().hashCode());
        return hashCode;
    }

    @Override
    public DialogAction clone() {
        try {
            return (DialogAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexruntimev2.model.transform.DialogActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
