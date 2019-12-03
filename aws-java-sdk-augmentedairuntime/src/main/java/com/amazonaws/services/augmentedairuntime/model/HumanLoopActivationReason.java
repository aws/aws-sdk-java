/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.augmentedairuntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about why a human loop was triggered. If at least one activation reason is evaluated to be true,
 * the human loop is activated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/HumanLoopActivationReason"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HumanLoopActivationReason implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * True if the specified conditions were matched to trigger the human loop.
     * </p>
     */
    private Boolean conditionsMatched;

    /**
     * <p>
     * True if the specified conditions were matched to trigger the human loop.
     * </p>
     * 
     * @param conditionsMatched
     *        True if the specified conditions were matched to trigger the human loop.
     */

    public void setConditionsMatched(Boolean conditionsMatched) {
        this.conditionsMatched = conditionsMatched;
    }

    /**
     * <p>
     * True if the specified conditions were matched to trigger the human loop.
     * </p>
     * 
     * @return True if the specified conditions were matched to trigger the human loop.
     */

    public Boolean getConditionsMatched() {
        return this.conditionsMatched;
    }

    /**
     * <p>
     * True if the specified conditions were matched to trigger the human loop.
     * </p>
     * 
     * @param conditionsMatched
     *        True if the specified conditions were matched to trigger the human loop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanLoopActivationReason withConditionsMatched(Boolean conditionsMatched) {
        setConditionsMatched(conditionsMatched);
        return this;
    }

    /**
     * <p>
     * True if the specified conditions were matched to trigger the human loop.
     * </p>
     * 
     * @return True if the specified conditions were matched to trigger the human loop.
     */

    public Boolean isConditionsMatched() {
        return this.conditionsMatched;
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
        if (getConditionsMatched() != null)
            sb.append("ConditionsMatched: ").append(getConditionsMatched());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HumanLoopActivationReason == false)
            return false;
        HumanLoopActivationReason other = (HumanLoopActivationReason) obj;
        if (other.getConditionsMatched() == null ^ this.getConditionsMatched() == null)
            return false;
        if (other.getConditionsMatched() != null && other.getConditionsMatched().equals(this.getConditionsMatched()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConditionsMatched() == null) ? 0 : getConditionsMatched().hashCode());
        return hashCode;
    }

    @Override
    public HumanLoopActivationReason clone() {
        try {
            return (HumanLoopActivationReason) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.augmentedairuntime.model.transform.HumanLoopActivationReasonMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
