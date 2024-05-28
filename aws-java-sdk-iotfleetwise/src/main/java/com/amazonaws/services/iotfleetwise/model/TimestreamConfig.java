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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon Timestream table where the Amazon Web Services IoT FleetWise campaign sends data. Timestream stores and
 * organizes data to optimize query processing time and to reduce storage costs. For more information, see <a
 * href="https://docs.aws.amazon.com/timestream/latest/developerguide/data-modeling.html">Data modeling</a> in the
 * <i>Amazon Timestream Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/TimestreamConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimestreamConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Timestream table.
     * </p>
     */
    private String timestreamTableArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution role that grants Amazon Web Services IoT FleetWise
     * permission to deliver data to the Amazon Timestream table.
     * </p>
     */
    private String executionRoleArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Timestream table.
     * </p>
     * 
     * @param timestreamTableArn
     *        The Amazon Resource Name (ARN) of the Amazon Timestream table.
     */

    public void setTimestreamTableArn(String timestreamTableArn) {
        this.timestreamTableArn = timestreamTableArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Timestream table.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Timestream table.
     */

    public String getTimestreamTableArn() {
        return this.timestreamTableArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Timestream table.
     * </p>
     * 
     * @param timestreamTableArn
     *        The Amazon Resource Name (ARN) of the Amazon Timestream table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamConfig withTimestreamTableArn(String timestreamTableArn) {
        setTimestreamTableArn(timestreamTableArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution role that grants Amazon Web Services IoT FleetWise
     * permission to deliver data to the Amazon Timestream table.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the task execution role that grants Amazon Web Services IoT FleetWise
     *        permission to deliver data to the Amazon Timestream table.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution role that grants Amazon Web Services IoT FleetWise
     * permission to deliver data to the Amazon Timestream table.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the task execution role that grants Amazon Web Services IoT FleetWise
     *         permission to deliver data to the Amazon Timestream table.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the task execution role that grants Amazon Web Services IoT FleetWise
     * permission to deliver data to the Amazon Timestream table.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the task execution role that grants Amazon Web Services IoT FleetWise
     *        permission to deliver data to the Amazon Timestream table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestreamConfig withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
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
        if (getTimestreamTableArn() != null)
            sb.append("TimestreamTableArn: ").append(getTimestreamTableArn()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimestreamConfig == false)
            return false;
        TimestreamConfig other = (TimestreamConfig) obj;
        if (other.getTimestreamTableArn() == null ^ this.getTimestreamTableArn() == null)
            return false;
        if (other.getTimestreamTableArn() != null && other.getTimestreamTableArn().equals(this.getTimestreamTableArn()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestreamTableArn() == null) ? 0 : getTimestreamTableArn().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public TimestreamConfig clone() {
        try {
            return (TimestreamConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.TimestreamConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
