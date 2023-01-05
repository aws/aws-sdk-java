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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Update action that has yet to be processed for the corresponding apply/stop request
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/PendingModifiedServiceUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PendingModifiedServiceUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     */
    private String serviceUpdateName;
    /**
     * <p>
     * The status of the service update
     * </p>
     */
    private String status;

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     * 
     * @param serviceUpdateName
     *        The unique ID of the service update
     */

    public void setServiceUpdateName(String serviceUpdateName) {
        this.serviceUpdateName = serviceUpdateName;
    }

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     * 
     * @return The unique ID of the service update
     */

    public String getServiceUpdateName() {
        return this.serviceUpdateName;
    }

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     * 
     * @param serviceUpdateName
     *        The unique ID of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedServiceUpdate withServiceUpdateName(String serviceUpdateName) {
        setServiceUpdateName(serviceUpdateName);
        return this;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * 
     * @param status
     *        The status of the service update
     * @see ServiceUpdateStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * 
     * @return The status of the service update
     * @see ServiceUpdateStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * 
     * @param status
     *        The status of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceUpdateStatus
     */

    public PendingModifiedServiceUpdate withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * 
     * @param status
     *        The status of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceUpdateStatus
     */

    public PendingModifiedServiceUpdate withStatus(ServiceUpdateStatus status) {
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
        if (getServiceUpdateName() != null)
            sb.append("ServiceUpdateName: ").append(getServiceUpdateName()).append(",");
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

        if (obj instanceof PendingModifiedServiceUpdate == false)
            return false;
        PendingModifiedServiceUpdate other = (PendingModifiedServiceUpdate) obj;
        if (other.getServiceUpdateName() == null ^ this.getServiceUpdateName() == null)
            return false;
        if (other.getServiceUpdateName() != null && other.getServiceUpdateName().equals(this.getServiceUpdateName()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getServiceUpdateName() == null) ? 0 : getServiceUpdateName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public PendingModifiedServiceUpdate clone() {
        try {
            return (PendingModifiedServiceUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.memorydb.model.transform.PendingModifiedServiceUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
