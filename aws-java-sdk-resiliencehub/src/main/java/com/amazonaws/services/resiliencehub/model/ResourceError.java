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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines application resource errors.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/ResourceError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This is the identifier of the resource.
     * </p>
     */
    private String logicalResourceId;
    /**
     * <p>
     * This is the identifier of the physical resource.
     * </p>
     */
    private String physicalResourceId;
    /**
     * <p>
     * This is the error message.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * This is the identifier of the resource.
     * </p>
     * 
     * @param logicalResourceId
     *        This is the identifier of the resource.
     */

    public void setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
    }

    /**
     * <p>
     * This is the identifier of the resource.
     * </p>
     * 
     * @return This is the identifier of the resource.
     */

    public String getLogicalResourceId() {
        return this.logicalResourceId;
    }

    /**
     * <p>
     * This is the identifier of the resource.
     * </p>
     * 
     * @param logicalResourceId
     *        This is the identifier of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceError withLogicalResourceId(String logicalResourceId) {
        setLogicalResourceId(logicalResourceId);
        return this;
    }

    /**
     * <p>
     * This is the identifier of the physical resource.
     * </p>
     * 
     * @param physicalResourceId
     *        This is the identifier of the physical resource.
     */

    public void setPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
    }

    /**
     * <p>
     * This is the identifier of the physical resource.
     * </p>
     * 
     * @return This is the identifier of the physical resource.
     */

    public String getPhysicalResourceId() {
        return this.physicalResourceId;
    }

    /**
     * <p>
     * This is the identifier of the physical resource.
     * </p>
     * 
     * @param physicalResourceId
     *        This is the identifier of the physical resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceError withPhysicalResourceId(String physicalResourceId) {
        setPhysicalResourceId(physicalResourceId);
        return this;
    }

    /**
     * <p>
     * This is the error message.
     * </p>
     * 
     * @param reason
     *        This is the error message.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * This is the error message.
     * </p>
     * 
     * @return This is the error message.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * This is the error message.
     * </p>
     * 
     * @param reason
     *        This is the error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceError withReason(String reason) {
        setReason(reason);
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
        if (getLogicalResourceId() != null)
            sb.append("LogicalResourceId: ").append(getLogicalResourceId()).append(",");
        if (getPhysicalResourceId() != null)
            sb.append("PhysicalResourceId: ").append(getPhysicalResourceId()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceError == false)
            return false;
        ResourceError other = (ResourceError) obj;
        if (other.getLogicalResourceId() == null ^ this.getLogicalResourceId() == null)
            return false;
        if (other.getLogicalResourceId() != null && other.getLogicalResourceId().equals(this.getLogicalResourceId()) == false)
            return false;
        if (other.getPhysicalResourceId() == null ^ this.getPhysicalResourceId() == null)
            return false;
        if (other.getPhysicalResourceId() != null && other.getPhysicalResourceId().equals(this.getPhysicalResourceId()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogicalResourceId() == null) ? 0 : getLogicalResourceId().hashCode());
        hashCode = prime * hashCode + ((getPhysicalResourceId() == null) ? 0 : getPhysicalResourceId().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public ResourceError clone() {
        try {
            return (ResourceError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.ResourceErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
