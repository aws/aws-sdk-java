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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The sync resource filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/SyncResourceFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SyncResourceFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The sync resource filter's state.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The sync resource filter resoucre type
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The sync resource filter resource Id.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The external Id.
     * </p>
     */
    private String externalId;

    /**
     * <p>
     * The sync resource filter's state.
     * </p>
     * 
     * @param state
     *        The sync resource filter's state.
     * @see SyncResourceState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The sync resource filter's state.
     * </p>
     * 
     * @return The sync resource filter's state.
     * @see SyncResourceState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The sync resource filter's state.
     * </p>
     * 
     * @param state
     *        The sync resource filter's state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SyncResourceState
     */

    public SyncResourceFilter withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The sync resource filter's state.
     * </p>
     * 
     * @param state
     *        The sync resource filter's state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SyncResourceState
     */

    public SyncResourceFilter withState(SyncResourceState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The sync resource filter resoucre type
     * </p>
     * 
     * @param resourceType
     *        The sync resource filter resoucre type
     * @see SyncResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The sync resource filter resoucre type
     * </p>
     * 
     * @return The sync resource filter resoucre type
     * @see SyncResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The sync resource filter resoucre type
     * </p>
     * 
     * @param resourceType
     *        The sync resource filter resoucre type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SyncResourceType
     */

    public SyncResourceFilter withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The sync resource filter resoucre type
     * </p>
     * 
     * @param resourceType
     *        The sync resource filter resoucre type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SyncResourceType
     */

    public SyncResourceFilter withResourceType(SyncResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The sync resource filter resource Id.
     * </p>
     * 
     * @param resourceId
     *        The sync resource filter resource Id.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The sync resource filter resource Id.
     * </p>
     * 
     * @return The sync resource filter resource Id.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The sync resource filter resource Id.
     * </p>
     * 
     * @param resourceId
     *        The sync resource filter resource Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncResourceFilter withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The external Id.
     * </p>
     * 
     * @param externalId
     *        The external Id.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * The external Id.
     * </p>
     * 
     * @return The external Id.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * The external Id.
     * </p>
     * 
     * @param externalId
     *        The external Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncResourceFilter withExternalId(String externalId) {
        setExternalId(externalId);
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
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SyncResourceFilter == false)
            return false;
        SyncResourceFilter other = (SyncResourceFilter) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        return hashCode;
    }

    @Override
    public SyncResourceFilter clone() {
        try {
            return (SyncResourceFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.SyncResourceFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
