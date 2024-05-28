/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The current state of an impacted resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ResourceState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Shows the current lifecycle policy action that was applied to an impacted resource.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Shows the current lifecycle policy action that was applied to an impacted resource.
     * </p>
     * 
     * @param status
     *        Shows the current lifecycle policy action that was applied to an impacted resource.
     * @see ResourceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Shows the current lifecycle policy action that was applied to an impacted resource.
     * </p>
     * 
     * @return Shows the current lifecycle policy action that was applied to an impacted resource.
     * @see ResourceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Shows the current lifecycle policy action that was applied to an impacted resource.
     * </p>
     * 
     * @param status
     *        Shows the current lifecycle policy action that was applied to an impacted resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public ResourceState withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Shows the current lifecycle policy action that was applied to an impacted resource.
     * </p>
     * 
     * @param status
     *        Shows the current lifecycle policy action that was applied to an impacted resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public ResourceState withStatus(ResourceStatus status) {
        this.status = status.toString();
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceState == false)
            return false;
        ResourceState other = (ResourceState) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ResourceState clone() {
        try {
            return (ResourceState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.ResourceStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
