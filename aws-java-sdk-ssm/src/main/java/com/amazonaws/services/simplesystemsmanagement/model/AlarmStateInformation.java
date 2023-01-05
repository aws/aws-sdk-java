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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details about the state of your CloudWatch alarm.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/AlarmStateInformation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlarmStateInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of your CloudWatch alarm.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The state of your CloudWatch alarm.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The name of your CloudWatch alarm.
     * </p>
     * 
     * @param name
     *        The name of your CloudWatch alarm.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of your CloudWatch alarm.
     * </p>
     * 
     * @return The name of your CloudWatch alarm.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of your CloudWatch alarm.
     * </p>
     * 
     * @param name
     *        The name of your CloudWatch alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlarmStateInformation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The state of your CloudWatch alarm.
     * </p>
     * 
     * @param state
     *        The state of your CloudWatch alarm.
     * @see ExternalAlarmState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of your CloudWatch alarm.
     * </p>
     * 
     * @return The state of your CloudWatch alarm.
     * @see ExternalAlarmState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of your CloudWatch alarm.
     * </p>
     * 
     * @param state
     *        The state of your CloudWatch alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExternalAlarmState
     */

    public AlarmStateInformation withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of your CloudWatch alarm.
     * </p>
     * 
     * @param state
     *        The state of your CloudWatch alarm.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExternalAlarmState
     */

    public AlarmStateInformation withState(ExternalAlarmState state) {
        this.state = state.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlarmStateInformation == false)
            return false;
        AlarmStateInformation other = (AlarmStateInformation) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public AlarmStateInformation clone() {
        try {
            return (AlarmStateInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.AlarmStateInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
