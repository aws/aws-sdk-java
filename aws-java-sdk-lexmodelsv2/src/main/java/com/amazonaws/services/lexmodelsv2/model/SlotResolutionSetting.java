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
 * Contains information about whether assisted slot resolution is turned on for the slot or not.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/SlotResolutionSetting"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlotResolutionSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether assisted slot resolution is turned on for the slot or not. If the value is
     * <code>EnhancedFallback</code>, assisted slot resolution is activated when Amazon Lex defaults to the
     * <code>AMAZON.FallbackIntent</code>. If the value is <code>Default</code>, assisted slot resolution is turned off.
     * </p>
     */
    private String slotResolutionStrategy;

    /**
     * <p>
     * Specifies whether assisted slot resolution is turned on for the slot or not. If the value is
     * <code>EnhancedFallback</code>, assisted slot resolution is activated when Amazon Lex defaults to the
     * <code>AMAZON.FallbackIntent</code>. If the value is <code>Default</code>, assisted slot resolution is turned off.
     * </p>
     * 
     * @param slotResolutionStrategy
     *        Specifies whether assisted slot resolution is turned on for the slot or not. If the value is
     *        <code>EnhancedFallback</code>, assisted slot resolution is activated when Amazon Lex defaults to the
     *        <code>AMAZON.FallbackIntent</code>. If the value is <code>Default</code>, assisted slot resolution is
     *        turned off.
     * @see SlotResolutionStrategy
     */

    public void setSlotResolutionStrategy(String slotResolutionStrategy) {
        this.slotResolutionStrategy = slotResolutionStrategy;
    }

    /**
     * <p>
     * Specifies whether assisted slot resolution is turned on for the slot or not. If the value is
     * <code>EnhancedFallback</code>, assisted slot resolution is activated when Amazon Lex defaults to the
     * <code>AMAZON.FallbackIntent</code>. If the value is <code>Default</code>, assisted slot resolution is turned off.
     * </p>
     * 
     * @return Specifies whether assisted slot resolution is turned on for the slot or not. If the value is
     *         <code>EnhancedFallback</code>, assisted slot resolution is activated when Amazon Lex defaults to the
     *         <code>AMAZON.FallbackIntent</code>. If the value is <code>Default</code>, assisted slot resolution is
     *         turned off.
     * @see SlotResolutionStrategy
     */

    public String getSlotResolutionStrategy() {
        return this.slotResolutionStrategy;
    }

    /**
     * <p>
     * Specifies whether assisted slot resolution is turned on for the slot or not. If the value is
     * <code>EnhancedFallback</code>, assisted slot resolution is activated when Amazon Lex defaults to the
     * <code>AMAZON.FallbackIntent</code>. If the value is <code>Default</code>, assisted slot resolution is turned off.
     * </p>
     * 
     * @param slotResolutionStrategy
     *        Specifies whether assisted slot resolution is turned on for the slot or not. If the value is
     *        <code>EnhancedFallback</code>, assisted slot resolution is activated when Amazon Lex defaults to the
     *        <code>AMAZON.FallbackIntent</code>. If the value is <code>Default</code>, assisted slot resolution is
     *        turned off.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SlotResolutionStrategy
     */

    public SlotResolutionSetting withSlotResolutionStrategy(String slotResolutionStrategy) {
        setSlotResolutionStrategy(slotResolutionStrategy);
        return this;
    }

    /**
     * <p>
     * Specifies whether assisted slot resolution is turned on for the slot or not. If the value is
     * <code>EnhancedFallback</code>, assisted slot resolution is activated when Amazon Lex defaults to the
     * <code>AMAZON.FallbackIntent</code>. If the value is <code>Default</code>, assisted slot resolution is turned off.
     * </p>
     * 
     * @param slotResolutionStrategy
     *        Specifies whether assisted slot resolution is turned on for the slot or not. If the value is
     *        <code>EnhancedFallback</code>, assisted slot resolution is activated when Amazon Lex defaults to the
     *        <code>AMAZON.FallbackIntent</code>. If the value is <code>Default</code>, assisted slot resolution is
     *        turned off.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SlotResolutionStrategy
     */

    public SlotResolutionSetting withSlotResolutionStrategy(SlotResolutionStrategy slotResolutionStrategy) {
        this.slotResolutionStrategy = slotResolutionStrategy.toString();
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
        if (getSlotResolutionStrategy() != null)
            sb.append("SlotResolutionStrategy: ").append(getSlotResolutionStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SlotResolutionSetting == false)
            return false;
        SlotResolutionSetting other = (SlotResolutionSetting) obj;
        if (other.getSlotResolutionStrategy() == null ^ this.getSlotResolutionStrategy() == null)
            return false;
        if (other.getSlotResolutionStrategy() != null && other.getSlotResolutionStrategy().equals(this.getSlotResolutionStrategy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSlotResolutionStrategy() == null) ? 0 : getSlotResolutionStrategy().hashCode());
        return hashCode;
    }

    @Override
    public SlotResolutionSetting clone() {
        try {
            return (SlotResolutionSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.SlotResolutionSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
