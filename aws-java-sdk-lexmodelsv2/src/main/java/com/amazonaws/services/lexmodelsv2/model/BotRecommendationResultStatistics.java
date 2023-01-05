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
 * A statistical summary of the bot recommendation results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BotRecommendationResultStatistics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotRecommendationResultStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Statistical information about about the intents associated with the bot recommendation results.
     * </p>
     */
    private IntentStatistics intents;
    /**
     * <p>
     * Statistical information about the slot types associated with the bot recommendation results.
     * </p>
     */
    private SlotTypeStatistics slotTypes;

    /**
     * <p>
     * Statistical information about about the intents associated with the bot recommendation results.
     * </p>
     * 
     * @param intents
     *        Statistical information about about the intents associated with the bot recommendation results.
     */

    public void setIntents(IntentStatistics intents) {
        this.intents = intents;
    }

    /**
     * <p>
     * Statistical information about about the intents associated with the bot recommendation results.
     * </p>
     * 
     * @return Statistical information about about the intents associated with the bot recommendation results.
     */

    public IntentStatistics getIntents() {
        return this.intents;
    }

    /**
     * <p>
     * Statistical information about about the intents associated with the bot recommendation results.
     * </p>
     * 
     * @param intents
     *        Statistical information about about the intents associated with the bot recommendation results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotRecommendationResultStatistics withIntents(IntentStatistics intents) {
        setIntents(intents);
        return this;
    }

    /**
     * <p>
     * Statistical information about the slot types associated with the bot recommendation results.
     * </p>
     * 
     * @param slotTypes
     *        Statistical information about the slot types associated with the bot recommendation results.
     */

    public void setSlotTypes(SlotTypeStatistics slotTypes) {
        this.slotTypes = slotTypes;
    }

    /**
     * <p>
     * Statistical information about the slot types associated with the bot recommendation results.
     * </p>
     * 
     * @return Statistical information about the slot types associated with the bot recommendation results.
     */

    public SlotTypeStatistics getSlotTypes() {
        return this.slotTypes;
    }

    /**
     * <p>
     * Statistical information about the slot types associated with the bot recommendation results.
     * </p>
     * 
     * @param slotTypes
     *        Statistical information about the slot types associated with the bot recommendation results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotRecommendationResultStatistics withSlotTypes(SlotTypeStatistics slotTypes) {
        setSlotTypes(slotTypes);
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
        if (getIntents() != null)
            sb.append("Intents: ").append(getIntents()).append(",");
        if (getSlotTypes() != null)
            sb.append("SlotTypes: ").append(getSlotTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BotRecommendationResultStatistics == false)
            return false;
        BotRecommendationResultStatistics other = (BotRecommendationResultStatistics) obj;
        if (other.getIntents() == null ^ this.getIntents() == null)
            return false;
        if (other.getIntents() != null && other.getIntents().equals(this.getIntents()) == false)
            return false;
        if (other.getSlotTypes() == null ^ this.getSlotTypes() == null)
            return false;
        if (other.getSlotTypes() != null && other.getSlotTypes().equals(this.getSlotTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntents() == null) ? 0 : getIntents().hashCode());
        hashCode = prime * hashCode + ((getSlotTypes() == null) ? 0 : getSlotTypes().hashCode());
        return hashCode;
    }

    @Override
    public BotRecommendationResultStatistics clone() {
        try {
            return (BotRecommendationResultStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.BotRecommendationResultStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
