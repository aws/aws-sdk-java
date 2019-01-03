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
 * Contains details about the successful completion of a task state.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/TaskSucceededEventDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskSucceededEventDetails implements Serializable, Cloneable, StructuredPojo {

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
     * The full JSON response from a resource when a task has succeeded. This response becomes the output of the related
     * task.
     * </p>
     */
    private String output;

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

    public TaskSucceededEventDetails withResourceType(String resourceType) {
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

    public TaskSucceededEventDetails withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The full JSON response from a resource when a task has succeeded. This response becomes the output of the related
     * task.
     * </p>
     * 
     * @param output
     *        The full JSON response from a resource when a task has succeeded. This response becomes the output of the
     *        related task.
     */

    public void setOutput(String output) {
        this.output = output;
    }

    /**
     * <p>
     * The full JSON response from a resource when a task has succeeded. This response becomes the output of the related
     * task.
     * </p>
     * 
     * @return The full JSON response from a resource when a task has succeeded. This response becomes the output of the
     *         related task.
     */

    public String getOutput() {
        return this.output;
    }

    /**
     * <p>
     * The full JSON response from a resource when a task has succeeded. This response becomes the output of the related
     * task.
     * </p>
     * 
     * @param output
     *        The full JSON response from a resource when a task has succeeded. This response becomes the output of the
     *        related task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskSucceededEventDetails withOutput(String output) {
        setOutput(output);
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
        if (getOutput() != null)
            sb.append("Output: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskSucceededEventDetails == false)
            return false;
        TaskSucceededEventDetails other = (TaskSucceededEventDetails) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        return hashCode;
    }

    @Override
    public TaskSucceededEventDetails clone() {
        try {
            return (TaskSucceededEventDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.stepfunctions.model.transform.TaskSucceededEventDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
