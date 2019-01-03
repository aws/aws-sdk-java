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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an AWS OpsWorks Stacks service error.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/ServiceError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The error ID.
     * </p>
     */
    private String serviceErrorId;
    /**
     * <p>
     * The stack ID.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The instance ID.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The error type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A message that describes the error.
     * </p>
     */
    private String message;
    /**
     * <p>
     * When the error occurred.
     * </p>
     */
    private String createdAt;

    /**
     * <p>
     * The error ID.
     * </p>
     * 
     * @param serviceErrorId
     *        The error ID.
     */

    public void setServiceErrorId(String serviceErrorId) {
        this.serviceErrorId = serviceErrorId;
    }

    /**
     * <p>
     * The error ID.
     * </p>
     * 
     * @return The error ID.
     */

    public String getServiceErrorId() {
        return this.serviceErrorId;
    }

    /**
     * <p>
     * The error ID.
     * </p>
     * 
     * @param serviceErrorId
     *        The error ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceError withServiceErrorId(String serviceErrorId) {
        setServiceErrorId(serviceErrorId);
        return this;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @param stackId
     *        The stack ID.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @return The stack ID.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @param stackId
     *        The stack ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceError withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @return The instance ID.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceError withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The error type.
     * </p>
     * 
     * @param type
     *        The error type.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The error type.
     * </p>
     * 
     * @return The error type.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The error type.
     * </p>
     * 
     * @param type
     *        The error type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceError withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * A message that describes the error.
     * </p>
     * 
     * @param message
     *        A message that describes the error.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message that describes the error.
     * </p>
     * 
     * @return A message that describes the error.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message that describes the error.
     * </p>
     * 
     * @param message
     *        A message that describes the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceError withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * When the error occurred.
     * </p>
     * 
     * @param createdAt
     *        When the error occurred.
     */

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * When the error occurred.
     * </p>
     * 
     * @return When the error occurred.
     */

    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * When the error occurred.
     * </p>
     * 
     * @param createdAt
     *        When the error occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceError withCreatedAt(String createdAt) {
        setCreatedAt(createdAt);
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
        if (getServiceErrorId() != null)
            sb.append("ServiceErrorId: ").append(getServiceErrorId()).append(",");
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceError == false)
            return false;
        ServiceError other = (ServiceError) obj;
        if (other.getServiceErrorId() == null ^ this.getServiceErrorId() == null)
            return false;
        if (other.getServiceErrorId() != null && other.getServiceErrorId().equals(this.getServiceErrorId()) == false)
            return false;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceErrorId() == null) ? 0 : getServiceErrorId().hashCode());
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return hashCode;
    }

    @Override
    public ServiceError clone() {
        try {
            return (ServiceError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.ServiceErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
