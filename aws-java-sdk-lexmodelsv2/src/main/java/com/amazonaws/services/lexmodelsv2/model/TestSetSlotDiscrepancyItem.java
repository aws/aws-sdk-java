/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains information about discrepancy in a slot information between the test set and the bot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/TestSetSlotDiscrepancyItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestSetSlotDiscrepancyItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the intent associated with the slot in the discrepancy report.
     * </p>
     */
    private String intentName;
    /**
     * <p>
     * The name of the slot in the discrepancy report.
     * </p>
     */
    private String slotName;
    /**
     * <p>
     * The error message for a discrepancy for an intent between the test set and the bot.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The name of the intent associated with the slot in the discrepancy report.
     * </p>
     * 
     * @param intentName
     *        The name of the intent associated with the slot in the discrepancy report.
     */

    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }

    /**
     * <p>
     * The name of the intent associated with the slot in the discrepancy report.
     * </p>
     * 
     * @return The name of the intent associated with the slot in the discrepancy report.
     */

    public String getIntentName() {
        return this.intentName;
    }

    /**
     * <p>
     * The name of the intent associated with the slot in the discrepancy report.
     * </p>
     * 
     * @param intentName
     *        The name of the intent associated with the slot in the discrepancy report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSetSlotDiscrepancyItem withIntentName(String intentName) {
        setIntentName(intentName);
        return this;
    }

    /**
     * <p>
     * The name of the slot in the discrepancy report.
     * </p>
     * 
     * @param slotName
     *        The name of the slot in the discrepancy report.
     */

    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }

    /**
     * <p>
     * The name of the slot in the discrepancy report.
     * </p>
     * 
     * @return The name of the slot in the discrepancy report.
     */

    public String getSlotName() {
        return this.slotName;
    }

    /**
     * <p>
     * The name of the slot in the discrepancy report.
     * </p>
     * 
     * @param slotName
     *        The name of the slot in the discrepancy report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSetSlotDiscrepancyItem withSlotName(String slotName) {
        setSlotName(slotName);
        return this;
    }

    /**
     * <p>
     * The error message for a discrepancy for an intent between the test set and the bot.
     * </p>
     * 
     * @param errorMessage
     *        The error message for a discrepancy for an intent between the test set and the bot.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message for a discrepancy for an intent between the test set and the bot.
     * </p>
     * 
     * @return The error message for a discrepancy for an intent between the test set and the bot.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message for a discrepancy for an intent between the test set and the bot.
     * </p>
     * 
     * @param errorMessage
     *        The error message for a discrepancy for an intent between the test set and the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSetSlotDiscrepancyItem withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getIntentName() != null)
            sb.append("IntentName: ").append(getIntentName()).append(",");
        if (getSlotName() != null)
            sb.append("SlotName: ").append(getSlotName()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestSetSlotDiscrepancyItem == false)
            return false;
        TestSetSlotDiscrepancyItem other = (TestSetSlotDiscrepancyItem) obj;
        if (other.getIntentName() == null ^ this.getIntentName() == null)
            return false;
        if (other.getIntentName() != null && other.getIntentName().equals(this.getIntentName()) == false)
            return false;
        if (other.getSlotName() == null ^ this.getSlotName() == null)
            return false;
        if (other.getSlotName() != null && other.getSlotName().equals(this.getSlotName()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntentName() == null) ? 0 : getIntentName().hashCode());
        hashCode = prime * hashCode + ((getSlotName() == null) ? 0 : getSlotName().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public TestSetSlotDiscrepancyItem clone() {
        try {
            return (TestSetSlotDiscrepancyItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.TestSetSlotDiscrepancyItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
