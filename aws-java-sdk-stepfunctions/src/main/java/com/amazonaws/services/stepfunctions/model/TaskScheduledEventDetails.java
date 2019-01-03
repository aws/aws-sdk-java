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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about a task scheduled during an execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/TaskScheduledEventDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskScheduledEventDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action of the resource called by a task state.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The service name of the resource in a task state.
     * </p>
     */
    private String resource;
    /**
     * <p>
     * The region of the scheduled task
     * </p>
     */
    private String region;
    /**
     * <p>
     * The JSON data passed to the resource referenced in a task state.
     * </p>
     */
    private String parameters;
    /**
     * <p>
     * The maximum allowed duration of the task.
     * </p>
     */
    private Long timeoutInSeconds;

    /**
     * <p>
     * The action of the resource called by a task state.
     * </p>
     * 
     * @param resourceType
     *        The action of the resource called by a task state.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The action of the resource called by a task state.
     * </p>
     * 
     * @return The action of the resource called by a task state.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The action of the resource called by a task state.
     * </p>
     * 
     * @param resourceType
     *        The action of the resource called by a task state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskScheduledEventDetails withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The service name of the resource in a task state.
     * </p>
     * 
     * @param resource
     *        The service name of the resource in a task state.
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The service name of the resource in a task state.
     * </p>
     * 
     * @return The service name of the resource in a task state.
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The service name of the resource in a task state.
     * </p>
     * 
     * @param resource
     *        The service name of the resource in a task state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskScheduledEventDetails withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The region of the scheduled task
     * </p>
     * 
     * @param region
     *        The region of the scheduled task
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The region of the scheduled task
     * </p>
     * 
     * @return The region of the scheduled task
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The region of the scheduled task
     * </p>
     * 
     * @param region
     *        The region of the scheduled task
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskScheduledEventDetails withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The JSON data passed to the resource referenced in a task state.
     * </p>
     * 
     * @param parameters
     *        The JSON data passed to the resource referenced in a task state.
     */

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The JSON data passed to the resource referenced in a task state.
     * </p>
     * 
     * @return The JSON data passed to the resource referenced in a task state.
     */

    public String getParameters() {
        return this.parameters;
    }

    /**
     * <p>
     * The JSON data passed to the resource referenced in a task state.
     * </p>
     * 
     * @param parameters
     *        The JSON data passed to the resource referenced in a task state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskScheduledEventDetails withParameters(String parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * The maximum allowed duration of the task.
     * </p>
     * 
     * @param timeoutInSeconds
     *        The maximum allowed duration of the task.
     */

    public void setTimeoutInSeconds(Long timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
    }

    /**
     * <p>
     * The maximum allowed duration of the task.
     * </p>
     * 
     * @return The maximum allowed duration of the task.
     */

    public Long getTimeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    /**
     * <p>
     * The maximum allowed duration of the task.
     * </p>
     * 
     * @param timeoutInSeconds
     *        The maximum allowed duration of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskScheduledEventDetails withTimeoutInSeconds(Long timeoutInSeconds) {
        setTimeoutInSeconds(timeoutInSeconds);
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append("***Sensitive Data Redacted***").append(",");
        if (getTimeoutInSeconds() != null)
            sb.append("TimeoutInSeconds: ").append(getTimeoutInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskScheduledEventDetails == false)
            return false;
        TaskScheduledEventDetails other = (TaskScheduledEventDetails) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getTimeoutInSeconds() == null ^ this.getTimeoutInSeconds() == null)
            return false;
        if (other.getTimeoutInSeconds() != null && other.getTimeoutInSeconds().equals(this.getTimeoutInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getTimeoutInSeconds() == null) ? 0 : getTimeoutInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public TaskScheduledEventDetails clone() {
        try {
            return (TaskScheduledEventDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.stepfunctions.model.transform.TaskScheduledEventDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
