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
package com.amazonaws.services.budgets.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The trigger threshold of the action.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionThreshold implements Serializable, Cloneable, StructuredPojo {

    private Double actionThresholdValue;

    private String actionThresholdType;

    /**
     * @param actionThresholdValue
     */

    public void setActionThresholdValue(Double actionThresholdValue) {
        this.actionThresholdValue = actionThresholdValue;
    }

    /**
     * @return
     */

    public Double getActionThresholdValue() {
        return this.actionThresholdValue;
    }

    /**
     * @param actionThresholdValue
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionThreshold withActionThresholdValue(Double actionThresholdValue) {
        setActionThresholdValue(actionThresholdValue);
        return this;
    }

    /**
     * @param actionThresholdType
     * @see ThresholdType
     */

    public void setActionThresholdType(String actionThresholdType) {
        this.actionThresholdType = actionThresholdType;
    }

    /**
     * @return
     * @see ThresholdType
     */

    public String getActionThresholdType() {
        return this.actionThresholdType;
    }

    /**
     * @param actionThresholdType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThresholdType
     */

    public ActionThreshold withActionThresholdType(String actionThresholdType) {
        setActionThresholdType(actionThresholdType);
        return this;
    }

    /**
     * @param actionThresholdType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThresholdType
     */

    public ActionThreshold withActionThresholdType(ThresholdType actionThresholdType) {
        this.actionThresholdType = actionThresholdType.toString();
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
        if (getActionThresholdValue() != null)
            sb.append("ActionThresholdValue: ").append(getActionThresholdValue()).append(",");
        if (getActionThresholdType() != null)
            sb.append("ActionThresholdType: ").append(getActionThresholdType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionThreshold == false)
            return false;
        ActionThreshold other = (ActionThreshold) obj;
        if (other.getActionThresholdValue() == null ^ this.getActionThresholdValue() == null)
            return false;
        if (other.getActionThresholdValue() != null && other.getActionThresholdValue().equals(this.getActionThresholdValue()) == false)
            return false;
        if (other.getActionThresholdType() == null ^ this.getActionThresholdType() == null)
            return false;
        if (other.getActionThresholdType() != null && other.getActionThresholdType().equals(this.getActionThresholdType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionThresholdValue() == null) ? 0 : getActionThresholdValue().hashCode());
        hashCode = prime * hashCode + ((getActionThresholdType() == null) ? 0 : getActionThresholdType().hashCode());
        return hashCode;
    }

    @Override
    public ActionThreshold clone() {
        try {
            return (ActionThreshold) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.budgets.model.transform.ActionThresholdMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
