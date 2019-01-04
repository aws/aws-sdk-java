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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information for delivery of data set contents to AWS IoT Events.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/IotEventsDestinationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IotEventsDestinationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the AWS IoT Events input to which data set contents are delivered.
     * </p>
     */
    private String inputName;
    /**
     * <p>
     * The ARN of the role which grants AWS IoT Analytics permission to deliver data set contents to an AWS IoT Events
     * input.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The name of the AWS IoT Events input to which data set contents are delivered.
     * </p>
     * 
     * @param inputName
     *        The name of the AWS IoT Events input to which data set contents are delivered.
     */

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    /**
     * <p>
     * The name of the AWS IoT Events input to which data set contents are delivered.
     * </p>
     * 
     * @return The name of the AWS IoT Events input to which data set contents are delivered.
     */

    public String getInputName() {
        return this.inputName;
    }

    /**
     * <p>
     * The name of the AWS IoT Events input to which data set contents are delivered.
     * </p>
     * 
     * @param inputName
     *        The name of the AWS IoT Events input to which data set contents are delivered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotEventsDestinationConfiguration withInputName(String inputName) {
        setInputName(inputName);
        return this;
    }

    /**
     * <p>
     * The ARN of the role which grants AWS IoT Analytics permission to deliver data set contents to an AWS IoT Events
     * input.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role which grants AWS IoT Analytics permission to deliver data set contents to an AWS IoT
     *        Events input.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role which grants AWS IoT Analytics permission to deliver data set contents to an AWS IoT Events
     * input.
     * </p>
     * 
     * @return The ARN of the role which grants AWS IoT Analytics permission to deliver data set contents to an AWS IoT
     *         Events input.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the role which grants AWS IoT Analytics permission to deliver data set contents to an AWS IoT Events
     * input.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role which grants AWS IoT Analytics permission to deliver data set contents to an AWS IoT
     *        Events input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IotEventsDestinationConfiguration withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getInputName() != null)
            sb.append("InputName: ").append(getInputName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IotEventsDestinationConfiguration == false)
            return false;
        IotEventsDestinationConfiguration other = (IotEventsDestinationConfiguration) obj;
        if (other.getInputName() == null ^ this.getInputName() == null)
            return false;
        if (other.getInputName() != null && other.getInputName().equals(this.getInputName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputName() == null) ? 0 : getInputName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public IotEventsDestinationConfiguration clone() {
        try {
            return (IotEventsDestinationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.IotEventsDestinationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
