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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the related WorkSpace. The related WorkSpace could be a Standby WorkSpace or Primary WorkSpace related to
 * the specified WorkSpace.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RelatedWorkspaceProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelatedWorkspaceProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the related WorkSpace.
     * </p>
     */
    private String workspaceId;
    /**
     * <p>
     * The Region of the related WorkSpace.
     * </p>
     */
    private String region;
    /**
     * <p>
     * Indicates the state of the WorkSpace.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Indicates the type of WorkSpace.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The identifier of the related WorkSpace.
     * </p>
     * 
     * @param workspaceId
     *        The identifier of the related WorkSpace.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The identifier of the related WorkSpace.
     * </p>
     * 
     * @return The identifier of the related WorkSpace.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The identifier of the related WorkSpace.
     * </p>
     * 
     * @param workspaceId
     *        The identifier of the related WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelatedWorkspaceProperties withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
        return this;
    }

    /**
     * <p>
     * The Region of the related WorkSpace.
     * </p>
     * 
     * @param region
     *        The Region of the related WorkSpace.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Region of the related WorkSpace.
     * </p>
     * 
     * @return The Region of the related WorkSpace.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Region of the related WorkSpace.
     * </p>
     * 
     * @param region
     *        The Region of the related WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelatedWorkspaceProperties withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * Indicates the state of the WorkSpace.
     * </p>
     * 
     * @param state
     *        Indicates the state of the WorkSpace.
     * @see WorkspaceState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Indicates the state of the WorkSpace.
     * </p>
     * 
     * @return Indicates the state of the WorkSpace.
     * @see WorkspaceState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Indicates the state of the WorkSpace.
     * </p>
     * 
     * @param state
     *        Indicates the state of the WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkspaceState
     */

    public RelatedWorkspaceProperties withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Indicates the state of the WorkSpace.
     * </p>
     * 
     * @param state
     *        Indicates the state of the WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkspaceState
     */

    public RelatedWorkspaceProperties withState(WorkspaceState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the type of WorkSpace.
     * </p>
     * 
     * @param type
     *        Indicates the type of WorkSpace.
     * @see StandbyWorkspaceRelationshipType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Indicates the type of WorkSpace.
     * </p>
     * 
     * @return Indicates the type of WorkSpace.
     * @see StandbyWorkspaceRelationshipType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Indicates the type of WorkSpace.
     * </p>
     * 
     * @param type
     *        Indicates the type of WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StandbyWorkspaceRelationshipType
     */

    public RelatedWorkspaceProperties withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Indicates the type of WorkSpace.
     * </p>
     * 
     * @param type
     *        Indicates the type of WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StandbyWorkspaceRelationshipType
     */

    public RelatedWorkspaceProperties withType(StandbyWorkspaceRelationshipType type) {
        this.type = type.toString();
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
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelatedWorkspaceProperties == false)
            return false;
        RelatedWorkspaceProperties other = (RelatedWorkspaceProperties) obj;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public RelatedWorkspaceProperties clone() {
        try {
            return (RelatedWorkspaceProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.RelatedWorkspacePropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
