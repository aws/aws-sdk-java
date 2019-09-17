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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary information for the workgroup, which includes its name, state, description, and the date and time it was
 * created.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/WorkGroupSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkGroupSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the workgroup.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The state of the workgroup.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The workgroup description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The workgroup creation date and time.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The name of the workgroup.
     * </p>
     * 
     * @param name
     *        The name of the workgroup.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the workgroup.
     * </p>
     * 
     * @return The name of the workgroup.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the workgroup.
     * </p>
     * 
     * @param name
     *        The name of the workgroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkGroupSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The state of the workgroup.
     * </p>
     * 
     * @param state
     *        The state of the workgroup.
     * @see WorkGroupState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the workgroup.
     * </p>
     * 
     * @return The state of the workgroup.
     * @see WorkGroupState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the workgroup.
     * </p>
     * 
     * @param state
     *        The state of the workgroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkGroupState
     */

    public WorkGroupSummary withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the workgroup.
     * </p>
     * 
     * @param state
     *        The state of the workgroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkGroupState
     */

    public WorkGroupSummary withState(WorkGroupState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The workgroup description.
     * </p>
     * 
     * @param description
     *        The workgroup description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The workgroup description.
     * </p>
     * 
     * @return The workgroup description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The workgroup description.
     * </p>
     * 
     * @param description
     *        The workgroup description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkGroupSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The workgroup creation date and time.
     * </p>
     * 
     * @param creationTime
     *        The workgroup creation date and time.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The workgroup creation date and time.
     * </p>
     * 
     * @return The workgroup creation date and time.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The workgroup creation date and time.
     * </p>
     * 
     * @param creationTime
     *        The workgroup creation date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkGroupSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
            sb.append("State: ").append(getState()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkGroupSummary == false)
            return false;
        WorkGroupSummary other = (WorkGroupSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public WorkGroupSummary clone() {
        try {
            return (WorkGroupSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.WorkGroupSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
