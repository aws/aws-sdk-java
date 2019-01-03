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
 * Information about a scheduled execution for a Maintenance Window.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ScheduledWindowExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledWindowExecution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Maintenance Window to be run.
     * </p>
     */
    private String windowId;
    /**
     * <p>
     * The name of the Maintenance Window to be run.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The time, in ISO-8601 Extended format, that the Maintenance Window is scheduled to be run.
     * </p>
     */
    private String executionTime;

    /**
     * <p>
     * The ID of the Maintenance Window to be run.
     * </p>
     * 
     * @param windowId
     *        The ID of the Maintenance Window to be run.
     */

    public void setWindowId(String windowId) {
        this.windowId = windowId;
    }

    /**
     * <p>
     * The ID of the Maintenance Window to be run.
     * </p>
     * 
     * @return The ID of the Maintenance Window to be run.
     */

    public String getWindowId() {
        return this.windowId;
    }

    /**
     * <p>
     * The ID of the Maintenance Window to be run.
     * </p>
     * 
     * @param windowId
     *        The ID of the Maintenance Window to be run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledWindowExecution withWindowId(String windowId) {
        setWindowId(windowId);
        return this;
    }

    /**
     * <p>
     * The name of the Maintenance Window to be run.
     * </p>
     * 
     * @param name
     *        The name of the Maintenance Window to be run.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Maintenance Window to be run.
     * </p>
     * 
     * @return The name of the Maintenance Window to be run.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Maintenance Window to be run.
     * </p>
     * 
     * @param name
     *        The name of the Maintenance Window to be run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledWindowExecution withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The time, in ISO-8601 Extended format, that the Maintenance Window is scheduled to be run.
     * </p>
     * 
     * @param executionTime
     *        The time, in ISO-8601 Extended format, that the Maintenance Window is scheduled to be run.
     */

    public void setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
    }

    /**
     * <p>
     * The time, in ISO-8601 Extended format, that the Maintenance Window is scheduled to be run.
     * </p>
     * 
     * @return The time, in ISO-8601 Extended format, that the Maintenance Window is scheduled to be run.
     */

    public String getExecutionTime() {
        return this.executionTime;
    }

    /**
     * <p>
     * The time, in ISO-8601 Extended format, that the Maintenance Window is scheduled to be run.
     * </p>
     * 
     * @param executionTime
     *        The time, in ISO-8601 Extended format, that the Maintenance Window is scheduled to be run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledWindowExecution withExecutionTime(String executionTime) {
        setExecutionTime(executionTime);
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
        if (getWindowId() != null)
            sb.append("WindowId: ").append(getWindowId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getExecutionTime() != null)
            sb.append("ExecutionTime: ").append(getExecutionTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduledWindowExecution == false)
            return false;
        ScheduledWindowExecution other = (ScheduledWindowExecution) obj;
        if (other.getWindowId() == null ^ this.getWindowId() == null)
            return false;
        if (other.getWindowId() != null && other.getWindowId().equals(this.getWindowId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getExecutionTime() == null ^ this.getExecutionTime() == null)
            return false;
        if (other.getExecutionTime() != null && other.getExecutionTime().equals(this.getExecutionTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowId() == null) ? 0 : getWindowId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getExecutionTime() == null) ? 0 : getExecutionTime().hashCode());
        return hashCode;
    }

    @Override
    public ScheduledWindowExecution clone() {
        try {
            return (ScheduledWindowExecution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.ScheduledWindowExecutionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
