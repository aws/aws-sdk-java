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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A single match condition for a <a>Filter</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/Condition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Condition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A single action condition.
     * </p>
     */
    private ActionCondition actionCondition;
    /**
     * <p>
     * A single label name condition.
     * </p>
     */
    private LabelNameCondition labelNameCondition;

    /**
     * <p>
     * A single action condition.
     * </p>
     * 
     * @param actionCondition
     *        A single action condition.
     */

    public void setActionCondition(ActionCondition actionCondition) {
        this.actionCondition = actionCondition;
    }

    /**
     * <p>
     * A single action condition.
     * </p>
     * 
     * @return A single action condition.
     */

    public ActionCondition getActionCondition() {
        return this.actionCondition;
    }

    /**
     * <p>
     * A single action condition.
     * </p>
     * 
     * @param actionCondition
     *        A single action condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withActionCondition(ActionCondition actionCondition) {
        setActionCondition(actionCondition);
        return this;
    }

    /**
     * <p>
     * A single label name condition.
     * </p>
     * 
     * @param labelNameCondition
     *        A single label name condition.
     */

    public void setLabelNameCondition(LabelNameCondition labelNameCondition) {
        this.labelNameCondition = labelNameCondition;
    }

    /**
     * <p>
     * A single label name condition.
     * </p>
     * 
     * @return A single label name condition.
     */

    public LabelNameCondition getLabelNameCondition() {
        return this.labelNameCondition;
    }

    /**
     * <p>
     * A single label name condition.
     * </p>
     * 
     * @param labelNameCondition
     *        A single label name condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withLabelNameCondition(LabelNameCondition labelNameCondition) {
        setLabelNameCondition(labelNameCondition);
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
        if (getActionCondition() != null)
            sb.append("ActionCondition: ").append(getActionCondition()).append(",");
        if (getLabelNameCondition() != null)
            sb.append("LabelNameCondition: ").append(getLabelNameCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Condition == false)
            return false;
        Condition other = (Condition) obj;
        if (other.getActionCondition() == null ^ this.getActionCondition() == null)
            return false;
        if (other.getActionCondition() != null && other.getActionCondition().equals(this.getActionCondition()) == false)
            return false;
        if (other.getLabelNameCondition() == null ^ this.getLabelNameCondition() == null)
            return false;
        if (other.getLabelNameCondition() != null && other.getLabelNameCondition().equals(this.getLabelNameCondition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionCondition() == null) ? 0 : getActionCondition().hashCode());
        hashCode = prime * hashCode + ((getLabelNameCondition() == null) ? 0 : getLabelNameCondition().hashCode());
        return hashCode;
    }

    @Override
    public Condition clone() {
        try {
            return (Condition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.ConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
