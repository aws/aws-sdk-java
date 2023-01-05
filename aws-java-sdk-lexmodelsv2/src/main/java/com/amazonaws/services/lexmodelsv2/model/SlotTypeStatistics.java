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
 * The object that contains the statistical summary of the recommended slot type associated with the bot recommendation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/SlotTypeStatistics" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlotTypeStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of recommended slot types associated with the bot recommendation.
     * </p>
     */
    private Integer discoveredSlotTypeCount;

    /**
     * <p>
     * The number of recommended slot types associated with the bot recommendation.
     * </p>
     * 
     * @param discoveredSlotTypeCount
     *        The number of recommended slot types associated with the bot recommendation.
     */

    public void setDiscoveredSlotTypeCount(Integer discoveredSlotTypeCount) {
        this.discoveredSlotTypeCount = discoveredSlotTypeCount;
    }

    /**
     * <p>
     * The number of recommended slot types associated with the bot recommendation.
     * </p>
     * 
     * @return The number of recommended slot types associated with the bot recommendation.
     */

    public Integer getDiscoveredSlotTypeCount() {
        return this.discoveredSlotTypeCount;
    }

    /**
     * <p>
     * The number of recommended slot types associated with the bot recommendation.
     * </p>
     * 
     * @param discoveredSlotTypeCount
     *        The number of recommended slot types associated with the bot recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotTypeStatistics withDiscoveredSlotTypeCount(Integer discoveredSlotTypeCount) {
        setDiscoveredSlotTypeCount(discoveredSlotTypeCount);
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
        if (getDiscoveredSlotTypeCount() != null)
            sb.append("DiscoveredSlotTypeCount: ").append(getDiscoveredSlotTypeCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SlotTypeStatistics == false)
            return false;
        SlotTypeStatistics other = (SlotTypeStatistics) obj;
        if (other.getDiscoveredSlotTypeCount() == null ^ this.getDiscoveredSlotTypeCount() == null)
            return false;
        if (other.getDiscoveredSlotTypeCount() != null && other.getDiscoveredSlotTypeCount().equals(this.getDiscoveredSlotTypeCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDiscoveredSlotTypeCount() == null) ? 0 : getDiscoveredSlotTypeCount().hashCode());
        return hashCode;
    }

    @Override
    public SlotTypeStatistics clone() {
        try {
            return (SlotTypeStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.SlotTypeStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
