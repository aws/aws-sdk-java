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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines when your alarm is invoked.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/AlarmRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlarmRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A rule that compares an input property value to a threshold value with a comparison operator.
     * </p>
     */
    private SimpleRule simpleRule;

    /**
     * <p>
     * A rule that compares an input property value to a threshold value with a comparison operator.
     * </p>
     * 
     * @param simpleRule
     *        A rule that compares an input property value to a threshold value with a comparison operator.
     */

    public void setSimpleRule(SimpleRule simpleRule) {
        this.simpleRule = simpleRule;
    }

    /**
     * <p>
     * A rule that compares an input property value to a threshold value with a comparison operator.
     * </p>
     * 
     * @return A rule that compares an input property value to a threshold value with a comparison operator.
     */

    public SimpleRule getSimpleRule() {
        return this.simpleRule;
    }

    /**
     * <p>
     * A rule that compares an input property value to a threshold value with a comparison operator.
     * </p>
     * 
     * @param simpleRule
     *        A rule that compares an input property value to a threshold value with a comparison operator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmRule withSimpleRule(SimpleRule simpleRule) {
        setSimpleRule(simpleRule);
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
        if (getSimpleRule() != null)
            sb.append("SimpleRule: ").append(getSimpleRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlarmRule == false)
            return false;
        AlarmRule other = (AlarmRule) obj;
        if (other.getSimpleRule() == null ^ this.getSimpleRule() == null)
            return false;
        if (other.getSimpleRule() != null && other.getSimpleRule().equals(this.getSimpleRule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSimpleRule() == null) ? 0 : getSimpleRule().hashCode());
        return hashCode;
    }

    @Override
    public AlarmRule clone() {
        try {
            return (AlarmRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.AlarmRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
