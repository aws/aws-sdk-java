/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the status of a read replica.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRdsDbStatusInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsDbStatusInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of status. For a read replica, the status type is read replication.
     * </p>
     */
    private String statusType;
    /**
     * <p>
     * Whether the read replica instance is operating normally.
     * </p>
     */
    private Boolean normal;
    /**
     * <p>
     * The status of the read replica instance.
     * </p>
     */
    private String status;
    /**
     * <p>
     * If the read replica is currently in an error state, provides the error details.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The type of status. For a read replica, the status type is read replication.
     * </p>
     * 
     * @param statusType
     *        The type of status. For a read replica, the status type is read replication.
     */

    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    /**
     * <p>
     * The type of status. For a read replica, the status type is read replication.
     * </p>
     * 
     * @return The type of status. For a read replica, the status type is read replication.
     */

    public String getStatusType() {
        return this.statusType;
    }

    /**
     * <p>
     * The type of status. For a read replica, the status type is read replication.
     * </p>
     * 
     * @param statusType
     *        The type of status. For a read replica, the status type is read replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbStatusInfo withStatusType(String statusType) {
        setStatusType(statusType);
        return this;
    }

    /**
     * <p>
     * Whether the read replica instance is operating normally.
     * </p>
     * 
     * @param normal
     *        Whether the read replica instance is operating normally.
     */

    public void setNormal(Boolean normal) {
        this.normal = normal;
    }

    /**
     * <p>
     * Whether the read replica instance is operating normally.
     * </p>
     * 
     * @return Whether the read replica instance is operating normally.
     */

    public Boolean getNormal() {
        return this.normal;
    }

    /**
     * <p>
     * Whether the read replica instance is operating normally.
     * </p>
     * 
     * @param normal
     *        Whether the read replica instance is operating normally.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbStatusInfo withNormal(Boolean normal) {
        setNormal(normal);
        return this;
    }

    /**
     * <p>
     * Whether the read replica instance is operating normally.
     * </p>
     * 
     * @return Whether the read replica instance is operating normally.
     */

    public Boolean isNormal() {
        return this.normal;
    }

    /**
     * <p>
     * The status of the read replica instance.
     * </p>
     * 
     * @param status
     *        The status of the read replica instance.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the read replica instance.
     * </p>
     * 
     * @return The status of the read replica instance.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the read replica instance.
     * </p>
     * 
     * @param status
     *        The status of the read replica instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbStatusInfo withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * If the read replica is currently in an error state, provides the error details.
     * </p>
     * 
     * @param message
     *        If the read replica is currently in an error state, provides the error details.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * If the read replica is currently in an error state, provides the error details.
     * </p>
     * 
     * @return If the read replica is currently in an error state, provides the error details.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * If the read replica is currently in an error state, provides the error details.
     * </p>
     * 
     * @param message
     *        If the read replica is currently in an error state, provides the error details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbStatusInfo withMessage(String message) {
        setMessage(message);
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
        if (getStatusType() != null)
            sb.append("StatusType: ").append(getStatusType()).append(",");
        if (getNormal() != null)
            sb.append("Normal: ").append(getNormal()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRdsDbStatusInfo == false)
            return false;
        AwsRdsDbStatusInfo other = (AwsRdsDbStatusInfo) obj;
        if (other.getStatusType() == null ^ this.getStatusType() == null)
            return false;
        if (other.getStatusType() != null && other.getStatusType().equals(this.getStatusType()) == false)
            return false;
        if (other.getNormal() == null ^ this.getNormal() == null)
            return false;
        if (other.getNormal() != null && other.getNormal().equals(this.getNormal()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatusType() == null) ? 0 : getStatusType().hashCode());
        hashCode = prime * hashCode + ((getNormal() == null) ? 0 : getNormal().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public AwsRdsDbStatusInfo clone() {
        try {
            return (AwsRdsDbStatusInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRdsDbStatusInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
