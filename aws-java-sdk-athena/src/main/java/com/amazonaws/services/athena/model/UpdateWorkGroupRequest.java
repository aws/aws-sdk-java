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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/UpdateWorkGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWorkGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The specified workgroup that will be updated.
     * </p>
     */
    private String workGroup;
    /**
     * <p>
     * The workgroup description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The workgroup configuration that will be updated for the given workgroup.
     * </p>
     */
    private WorkGroupConfigurationUpdates configurationUpdates;
    /**
     * <p>
     * The workgroup state that will be updated for the given workgroup.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The specified workgroup that will be updated.
     * </p>
     * 
     * @param workGroup
     *        The specified workgroup that will be updated.
     */

    public void setWorkGroup(String workGroup) {
        this.workGroup = workGroup;
    }

    /**
     * <p>
     * The specified workgroup that will be updated.
     * </p>
     * 
     * @return The specified workgroup that will be updated.
     */

    public String getWorkGroup() {
        return this.workGroup;
    }

    /**
     * <p>
     * The specified workgroup that will be updated.
     * </p>
     * 
     * @param workGroup
     *        The specified workgroup that will be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkGroupRequest withWorkGroup(String workGroup) {
        setWorkGroup(workGroup);
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

    public UpdateWorkGroupRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The workgroup configuration that will be updated for the given workgroup.
     * </p>
     * 
     * @param configurationUpdates
     *        The workgroup configuration that will be updated for the given workgroup.
     */

    public void setConfigurationUpdates(WorkGroupConfigurationUpdates configurationUpdates) {
        this.configurationUpdates = configurationUpdates;
    }

    /**
     * <p>
     * The workgroup configuration that will be updated for the given workgroup.
     * </p>
     * 
     * @return The workgroup configuration that will be updated for the given workgroup.
     */

    public WorkGroupConfigurationUpdates getConfigurationUpdates() {
        return this.configurationUpdates;
    }

    /**
     * <p>
     * The workgroup configuration that will be updated for the given workgroup.
     * </p>
     * 
     * @param configurationUpdates
     *        The workgroup configuration that will be updated for the given workgroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkGroupRequest withConfigurationUpdates(WorkGroupConfigurationUpdates configurationUpdates) {
        setConfigurationUpdates(configurationUpdates);
        return this;
    }

    /**
     * <p>
     * The workgroup state that will be updated for the given workgroup.
     * </p>
     * 
     * @param state
     *        The workgroup state that will be updated for the given workgroup.
     * @see WorkGroupState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The workgroup state that will be updated for the given workgroup.
     * </p>
     * 
     * @return The workgroup state that will be updated for the given workgroup.
     * @see WorkGroupState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The workgroup state that will be updated for the given workgroup.
     * </p>
     * 
     * @param state
     *        The workgroup state that will be updated for the given workgroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkGroupState
     */

    public UpdateWorkGroupRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The workgroup state that will be updated for the given workgroup.
     * </p>
     * 
     * @param state
     *        The workgroup state that will be updated for the given workgroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkGroupState
     */

    public UpdateWorkGroupRequest withState(WorkGroupState state) {
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
        if (getWorkGroup() != null)
            sb.append("WorkGroup: ").append(getWorkGroup()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getConfigurationUpdates() != null)
            sb.append("ConfigurationUpdates: ").append(getConfigurationUpdates()).append(",");
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

        if (obj instanceof UpdateWorkGroupRequest == false)
            return false;
        UpdateWorkGroupRequest other = (UpdateWorkGroupRequest) obj;
        if (other.getWorkGroup() == null ^ this.getWorkGroup() == null)
            return false;
        if (other.getWorkGroup() != null && other.getWorkGroup().equals(this.getWorkGroup()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getConfigurationUpdates() == null ^ this.getConfigurationUpdates() == null)
            return false;
        if (other.getConfigurationUpdates() != null && other.getConfigurationUpdates().equals(this.getConfigurationUpdates()) == false)
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

        hashCode = prime * hashCode + ((getWorkGroup() == null) ? 0 : getWorkGroup().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getConfigurationUpdates() == null) ? 0 : getConfigurationUpdates().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWorkGroupRequest clone() {
        return (UpdateWorkGroupRequest) super.clone();
    }

}
