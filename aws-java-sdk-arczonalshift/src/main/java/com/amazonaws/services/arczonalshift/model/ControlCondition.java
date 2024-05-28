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
package com.amazonaws.services.arczonalshift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A control condition is an alarm that you specify for a practice run. When you configure practice runs with zonal
 * autoshift for a resource, you specify Amazon CloudWatch alarms, which you create in CloudWatch to use with the
 * practice run. The alarms that you specify are an <i>outcome alarm</i>, to monitor application health during practice
 * runs and, optionally, a <i>blocking alarm</i>, to block practice runs from starting.
 * </p>
 * <p>
 * Control condition alarms do not apply for autoshifts.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/r53recovery/latest/dg/arc-zonal-autoshift.considerations.html"> Considerations when
 * you configure zonal autoshift</a> in the Amazon Route 53 Application Recovery Controller Developer Guide.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/arc-zonal-shift-2022-10-30/ControlCondition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ControlCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Amazon CloudWatch alarm that you specify as a control condition for a
     * practice run.
     * </p>
     */
    private String alarmIdentifier;
    /**
     * <p>
     * The type of alarm specified for a practice run. The only valid value is <code>CLOUDWATCH</code>.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Amazon CloudWatch alarm that you specify as a control condition for a
     * practice run.
     * </p>
     * 
     * @param alarmIdentifier
     *        The Amazon Resource Name (ARN) for the Amazon CloudWatch alarm that you specify as a control condition for
     *        a practice run.
     */

    public void setAlarmIdentifier(String alarmIdentifier) {
        this.alarmIdentifier = alarmIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Amazon CloudWatch alarm that you specify as a control condition for a
     * practice run.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the Amazon CloudWatch alarm that you specify as a control condition
     *         for a practice run.
     */

    public String getAlarmIdentifier() {
        return this.alarmIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Amazon CloudWatch alarm that you specify as a control condition for a
     * practice run.
     * </p>
     * 
     * @param alarmIdentifier
     *        The Amazon Resource Name (ARN) for the Amazon CloudWatch alarm that you specify as a control condition for
     *        a practice run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ControlCondition withAlarmIdentifier(String alarmIdentifier) {
        setAlarmIdentifier(alarmIdentifier);
        return this;
    }

    /**
     * <p>
     * The type of alarm specified for a practice run. The only valid value is <code>CLOUDWATCH</code>.
     * </p>
     * 
     * @param type
     *        The type of alarm specified for a practice run. The only valid value is <code>CLOUDWATCH</code>.
     * @see ControlConditionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of alarm specified for a practice run. The only valid value is <code>CLOUDWATCH</code>.
     * </p>
     * 
     * @return The type of alarm specified for a practice run. The only valid value is <code>CLOUDWATCH</code>.
     * @see ControlConditionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of alarm specified for a practice run. The only valid value is <code>CLOUDWATCH</code>.
     * </p>
     * 
     * @param type
     *        The type of alarm specified for a practice run. The only valid value is <code>CLOUDWATCH</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlConditionType
     */

    public ControlCondition withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of alarm specified for a practice run. The only valid value is <code>CLOUDWATCH</code>.
     * </p>
     * 
     * @param type
     *        The type of alarm specified for a practice run. The only valid value is <code>CLOUDWATCH</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlConditionType
     */

    public ControlCondition withType(ControlConditionType type) {
        this.type = type.toString();
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
        if (getAlarmIdentifier() != null)
            sb.append("AlarmIdentifier: ").append(getAlarmIdentifier()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ControlCondition == false)
            return false;
        ControlCondition other = (ControlCondition) obj;
        if (other.getAlarmIdentifier() == null ^ this.getAlarmIdentifier() == null)
            return false;
        if (other.getAlarmIdentifier() != null && other.getAlarmIdentifier().equals(this.getAlarmIdentifier()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlarmIdentifier() == null) ? 0 : getAlarmIdentifier().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ControlCondition clone() {
        try {
            return (ControlCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.arczonalshift.model.transform.ControlConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
