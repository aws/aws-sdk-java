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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactFlowModuleMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateContactFlowModuleMetadataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The identifier of the flow module.
     * </p>
     */
    private String contactFlowModuleId;
    /**
     * <p>
     * The name of the flow module.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the flow module.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The state of flow module.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactFlowModuleMetadataRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The identifier of the flow module.
     * </p>
     * 
     * @param contactFlowModuleId
     *        The identifier of the flow module.
     */

    public void setContactFlowModuleId(String contactFlowModuleId) {
        this.contactFlowModuleId = contactFlowModuleId;
    }

    /**
     * <p>
     * The identifier of the flow module.
     * </p>
     * 
     * @return The identifier of the flow module.
     */

    public String getContactFlowModuleId() {
        return this.contactFlowModuleId;
    }

    /**
     * <p>
     * The identifier of the flow module.
     * </p>
     * 
     * @param contactFlowModuleId
     *        The identifier of the flow module.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactFlowModuleMetadataRequest withContactFlowModuleId(String contactFlowModuleId) {
        setContactFlowModuleId(contactFlowModuleId);
        return this;
    }

    /**
     * <p>
     * The name of the flow module.
     * </p>
     * 
     * @param name
     *        The name of the flow module.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the flow module.
     * </p>
     * 
     * @return The name of the flow module.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the flow module.
     * </p>
     * 
     * @param name
     *        The name of the flow module.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactFlowModuleMetadataRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the flow module.
     * </p>
     * 
     * @param description
     *        The description of the flow module.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the flow module.
     * </p>
     * 
     * @return The description of the flow module.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the flow module.
     * </p>
     * 
     * @param description
     *        The description of the flow module.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactFlowModuleMetadataRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The state of flow module.
     * </p>
     * 
     * @param state
     *        The state of flow module.
     * @see ContactFlowModuleState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of flow module.
     * </p>
     * 
     * @return The state of flow module.
     * @see ContactFlowModuleState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of flow module.
     * </p>
     * 
     * @param state
     *        The state of flow module.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactFlowModuleState
     */

    public UpdateContactFlowModuleMetadataRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of flow module.
     * </p>
     * 
     * @param state
     *        The state of flow module.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactFlowModuleState
     */

    public UpdateContactFlowModuleMetadataRequest withState(ContactFlowModuleState state) {
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getContactFlowModuleId() != null)
            sb.append("ContactFlowModuleId: ").append(getContactFlowModuleId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof UpdateContactFlowModuleMetadataRequest == false)
            return false;
        UpdateContactFlowModuleMetadataRequest other = (UpdateContactFlowModuleMetadataRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getContactFlowModuleId() == null ^ this.getContactFlowModuleId() == null)
            return false;
        if (other.getContactFlowModuleId() != null && other.getContactFlowModuleId().equals(this.getContactFlowModuleId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getContactFlowModuleId() == null) ? 0 : getContactFlowModuleId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public UpdateContactFlowModuleMetadataRequest clone() {
        return (UpdateContactFlowModuleMetadataRequest) super.clone();
    }

}
