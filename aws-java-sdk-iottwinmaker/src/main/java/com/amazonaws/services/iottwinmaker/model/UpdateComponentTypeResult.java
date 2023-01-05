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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/UpdateComponentType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateComponentTypeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the workspace that contains the component type.
     * </p>
     */
    private String workspaceId;
    /**
     * <p>
     * The ARN of the component type.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ID of the component type.
     * </p>
     */
    private String componentTypeId;
    /**
     * <p>
     * The current state of the component type.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The ID of the workspace that contains the component type.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace that contains the component type.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace that contains the component type.
     * </p>
     * 
     * @return The ID of the workspace that contains the component type.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace that contains the component type.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace that contains the component type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateComponentTypeResult withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
        return this;
    }

    /**
     * <p>
     * The ARN of the component type.
     * </p>
     * 
     * @param arn
     *        The ARN of the component type.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the component type.
     * </p>
     * 
     * @return The ARN of the component type.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the component type.
     * </p>
     * 
     * @param arn
     *        The ARN of the component type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateComponentTypeResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ID of the component type.
     * </p>
     * 
     * @param componentTypeId
     *        The ID of the component type.
     */

    public void setComponentTypeId(String componentTypeId) {
        this.componentTypeId = componentTypeId;
    }

    /**
     * <p>
     * The ID of the component type.
     * </p>
     * 
     * @return The ID of the component type.
     */

    public String getComponentTypeId() {
        return this.componentTypeId;
    }

    /**
     * <p>
     * The ID of the component type.
     * </p>
     * 
     * @param componentTypeId
     *        The ID of the component type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateComponentTypeResult withComponentTypeId(String componentTypeId) {
        setComponentTypeId(componentTypeId);
        return this;
    }

    /**
     * <p>
     * The current state of the component type.
     * </p>
     * 
     * @param state
     *        The current state of the component type.
     * @see State
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the component type.
     * </p>
     * 
     * @return The current state of the component type.
     * @see State
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the component type.
     * </p>
     * 
     * @param state
     *        The current state of the component type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public UpdateComponentTypeResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the component type.
     * </p>
     * 
     * @param state
     *        The current state of the component type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see State
     */

    public UpdateComponentTypeResult withState(State state) {
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
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getComponentTypeId() != null)
            sb.append("ComponentTypeId: ").append(getComponentTypeId()).append(",");
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

        if (obj instanceof UpdateComponentTypeResult == false)
            return false;
        UpdateComponentTypeResult other = (UpdateComponentTypeResult) obj;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getComponentTypeId() == null ^ this.getComponentTypeId() == null)
            return false;
        if (other.getComponentTypeId() != null && other.getComponentTypeId().equals(this.getComponentTypeId()) == false)
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

        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getComponentTypeId() == null) ? 0 : getComponentTypeId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public UpdateComponentTypeResult clone() {
        try {
            return (UpdateComponentTypeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
