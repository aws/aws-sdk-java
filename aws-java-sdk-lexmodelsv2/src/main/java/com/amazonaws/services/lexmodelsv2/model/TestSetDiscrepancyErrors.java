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
 * Contains details about the errors in the test set discrepancy report
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/TestSetDiscrepancyErrors"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestSetDiscrepancyErrors implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains information about discrepancies found for intents between the test set and the bot.
     * </p>
     */
    private java.util.List<TestSetIntentDiscrepancyItem> intentDiscrepancies;
    /**
     * <p>
     * Contains information about discrepancies found for slots between the test set and the bot.
     * </p>
     */
    private java.util.List<TestSetSlotDiscrepancyItem> slotDiscrepancies;

    /**
     * <p>
     * Contains information about discrepancies found for intents between the test set and the bot.
     * </p>
     * 
     * @return Contains information about discrepancies found for intents between the test set and the bot.
     */

    public java.util.List<TestSetIntentDiscrepancyItem> getIntentDiscrepancies() {
        return intentDiscrepancies;
    }

    /**
     * <p>
     * Contains information about discrepancies found for intents between the test set and the bot.
     * </p>
     * 
     * @param intentDiscrepancies
     *        Contains information about discrepancies found for intents between the test set and the bot.
     */

    public void setIntentDiscrepancies(java.util.Collection<TestSetIntentDiscrepancyItem> intentDiscrepancies) {
        if (intentDiscrepancies == null) {
            this.intentDiscrepancies = null;
            return;
        }

        this.intentDiscrepancies = new java.util.ArrayList<TestSetIntentDiscrepancyItem>(intentDiscrepancies);
    }

    /**
     * <p>
     * Contains information about discrepancies found for intents between the test set and the bot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIntentDiscrepancies(java.util.Collection)} or {@link #withIntentDiscrepancies(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param intentDiscrepancies
     *        Contains information about discrepancies found for intents between the test set and the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSetDiscrepancyErrors withIntentDiscrepancies(TestSetIntentDiscrepancyItem... intentDiscrepancies) {
        if (this.intentDiscrepancies == null) {
            setIntentDiscrepancies(new java.util.ArrayList<TestSetIntentDiscrepancyItem>(intentDiscrepancies.length));
        }
        for (TestSetIntentDiscrepancyItem ele : intentDiscrepancies) {
            this.intentDiscrepancies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains information about discrepancies found for intents between the test set and the bot.
     * </p>
     * 
     * @param intentDiscrepancies
     *        Contains information about discrepancies found for intents between the test set and the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSetDiscrepancyErrors withIntentDiscrepancies(java.util.Collection<TestSetIntentDiscrepancyItem> intentDiscrepancies) {
        setIntentDiscrepancies(intentDiscrepancies);
        return this;
    }

    /**
     * <p>
     * Contains information about discrepancies found for slots between the test set and the bot.
     * </p>
     * 
     * @return Contains information about discrepancies found for slots between the test set and the bot.
     */

    public java.util.List<TestSetSlotDiscrepancyItem> getSlotDiscrepancies() {
        return slotDiscrepancies;
    }

    /**
     * <p>
     * Contains information about discrepancies found for slots between the test set and the bot.
     * </p>
     * 
     * @param slotDiscrepancies
     *        Contains information about discrepancies found for slots between the test set and the bot.
     */

    public void setSlotDiscrepancies(java.util.Collection<TestSetSlotDiscrepancyItem> slotDiscrepancies) {
        if (slotDiscrepancies == null) {
            this.slotDiscrepancies = null;
            return;
        }

        this.slotDiscrepancies = new java.util.ArrayList<TestSetSlotDiscrepancyItem>(slotDiscrepancies);
    }

    /**
     * <p>
     * Contains information about discrepancies found for slots between the test set and the bot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSlotDiscrepancies(java.util.Collection)} or {@link #withSlotDiscrepancies(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param slotDiscrepancies
     *        Contains information about discrepancies found for slots between the test set and the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSetDiscrepancyErrors withSlotDiscrepancies(TestSetSlotDiscrepancyItem... slotDiscrepancies) {
        if (this.slotDiscrepancies == null) {
            setSlotDiscrepancies(new java.util.ArrayList<TestSetSlotDiscrepancyItem>(slotDiscrepancies.length));
        }
        for (TestSetSlotDiscrepancyItem ele : slotDiscrepancies) {
            this.slotDiscrepancies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains information about discrepancies found for slots between the test set and the bot.
     * </p>
     * 
     * @param slotDiscrepancies
     *        Contains information about discrepancies found for slots between the test set and the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestSetDiscrepancyErrors withSlotDiscrepancies(java.util.Collection<TestSetSlotDiscrepancyItem> slotDiscrepancies) {
        setSlotDiscrepancies(slotDiscrepancies);
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
        if (getIntentDiscrepancies() != null)
            sb.append("IntentDiscrepancies: ").append(getIntentDiscrepancies()).append(",");
        if (getSlotDiscrepancies() != null)
            sb.append("SlotDiscrepancies: ").append(getSlotDiscrepancies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestSetDiscrepancyErrors == false)
            return false;
        TestSetDiscrepancyErrors other = (TestSetDiscrepancyErrors) obj;
        if (other.getIntentDiscrepancies() == null ^ this.getIntentDiscrepancies() == null)
            return false;
        if (other.getIntentDiscrepancies() != null && other.getIntentDiscrepancies().equals(this.getIntentDiscrepancies()) == false)
            return false;
        if (other.getSlotDiscrepancies() == null ^ this.getSlotDiscrepancies() == null)
            return false;
        if (other.getSlotDiscrepancies() != null && other.getSlotDiscrepancies().equals(this.getSlotDiscrepancies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntentDiscrepancies() == null) ? 0 : getIntentDiscrepancies().hashCode());
        hashCode = prime * hashCode + ((getSlotDiscrepancies() == null) ? 0 : getSlotDiscrepancies().hashCode());
        return hashCode;
    }

    @Override
    public TestSetDiscrepancyErrors clone() {
        try {
            return (TestSetDiscrepancyErrors) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.TestSetDiscrepancyErrorsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
