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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters for a STEP_FUNCTION task.
 * </p>
 * <p>
 * For information about specifying and updating task parameters, see <a>RegisterTaskWithMaintenanceWindow</a> and
 * <a>UpdateMaintenanceWindowTask</a>.
 * </p>
 * <note>
 * <p>
 * <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to contain logs, instead use the
 * <code>OutputS3BucketName</code> and <code>OutputS3KeyPrefix</code> options in the
 * <code>TaskInvocationParameters</code> structure. For information about how Systems Manager handles these options for
 * the supported Maintenance Window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
 * </p>
 * <p>
 * <code>TaskParameters</code> has been deprecated. To specify parameters to pass to a task when it runs, instead use
 * the <code>Parameters</code> option in the <code>TaskInvocationParameters</code> structure. For information about how
 * Systems Manager handles these options for the supported Maintenance Window task types, see
 * <a>MaintenanceWindowTaskInvocationParameters</a>.
 * </p>
 * <p>
 * For Step Functions tasks, Systems Manager ignores any values specified for <code>TaskParameters</code> and
 * <code>LoggingInfo</code>.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/MaintenanceWindowStepFunctionsParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaintenanceWindowStepFunctionsParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The inputs for the STEP_FUNCTION task.
     * </p>
     */
    private String input;
    /**
     * <p>
     * The name of the STEP_FUNCTION task.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The inputs for the STEP_FUNCTION task.
     * </p>
     * 
     * @param input
     *        The inputs for the STEP_FUNCTION task.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * The inputs for the STEP_FUNCTION task.
     * </p>
     * 
     * @return The inputs for the STEP_FUNCTION task.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * The inputs for the STEP_FUNCTION task.
     * </p>
     * 
     * @param input
     *        The inputs for the STEP_FUNCTION task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowStepFunctionsParameters withInput(String input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * The name of the STEP_FUNCTION task.
     * </p>
     * 
     * @param name
     *        The name of the STEP_FUNCTION task.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the STEP_FUNCTION task.
     * </p>
     * 
     * @return The name of the STEP_FUNCTION task.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the STEP_FUNCTION task.
     * </p>
     * 
     * @param name
     *        The name of the STEP_FUNCTION task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceWindowStepFunctionsParameters withName(String name) {
        setName(name);
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
        if (getInput() != null)
            sb.append("Input: ").append("***Sensitive Data Redacted***").append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaintenanceWindowStepFunctionsParameters == false)
            return false;
        MaintenanceWindowStepFunctionsParameters other = (MaintenanceWindowStepFunctionsParameters) obj;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public MaintenanceWindowStepFunctionsParameters clone() {
        try {
            return (MaintenanceWindowStepFunctionsParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.MaintenanceWindowStepFunctionsParametersMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
