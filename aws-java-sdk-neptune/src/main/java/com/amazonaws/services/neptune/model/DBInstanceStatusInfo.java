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
package com.amazonaws.services.neptune.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Provides a list of status information for a DB instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DBInstanceStatusInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBInstanceStatusInfo implements Serializable, Cloneable {

    /**
     * <p>
     * This value is currently "read replication."
     * </p>
     */
    private String statusType;
    /**
     * <p>
     * Boolean value that is true if the instance is operating normally, or false if the instance is in an error state.
     * </p>
     */
    private Boolean normal;
    /**
     * <p>
     * Status of the DB instance. For a StatusType of read replica, the values can be replicating, error, stopped, or
     * terminated.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Details of the error if there is an error for the instance. If the instance is not in an error state, this value
     * is blank.
     * </p>
     */
    private String message;

    /**
     * <p>
     * This value is currently "read replication."
     * </p>
     * 
     * @param statusType
     *        This value is currently "read replication."
     */

    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    /**
     * <p>
     * This value is currently "read replication."
     * </p>
     * 
     * @return This value is currently "read replication."
     */

    public String getStatusType() {
        return this.statusType;
    }

    /**
     * <p>
     * This value is currently "read replication."
     * </p>
     * 
     * @param statusType
     *        This value is currently "read replication."
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstanceStatusInfo withStatusType(String statusType) {
        setStatusType(statusType);
        return this;
    }

    /**
     * <p>
     * Boolean value that is true if the instance is operating normally, or false if the instance is in an error state.
     * </p>
     * 
     * @param normal
     *        Boolean value that is true if the instance is operating normally, or false if the instance is in an error
     *        state.
     */

    public void setNormal(Boolean normal) {
        this.normal = normal;
    }

    /**
     * <p>
     * Boolean value that is true if the instance is operating normally, or false if the instance is in an error state.
     * </p>
     * 
     * @return Boolean value that is true if the instance is operating normally, or false if the instance is in an error
     *         state.
     */

    public Boolean getNormal() {
        return this.normal;
    }

    /**
     * <p>
     * Boolean value that is true if the instance is operating normally, or false if the instance is in an error state.
     * </p>
     * 
     * @param normal
     *        Boolean value that is true if the instance is operating normally, or false if the instance is in an error
     *        state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstanceStatusInfo withNormal(Boolean normal) {
        setNormal(normal);
        return this;
    }

    /**
     * <p>
     * Boolean value that is true if the instance is operating normally, or false if the instance is in an error state.
     * </p>
     * 
     * @return Boolean value that is true if the instance is operating normally, or false if the instance is in an error
     *         state.
     */

    public Boolean isNormal() {
        return this.normal;
    }

    /**
     * <p>
     * Status of the DB instance. For a StatusType of read replica, the values can be replicating, error, stopped, or
     * terminated.
     * </p>
     * 
     * @param status
     *        Status of the DB instance. For a StatusType of read replica, the values can be replicating, error,
     *        stopped, or terminated.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the DB instance. For a StatusType of read replica, the values can be replicating, error, stopped, or
     * terminated.
     * </p>
     * 
     * @return Status of the DB instance. For a StatusType of read replica, the values can be replicating, error,
     *         stopped, or terminated.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the DB instance. For a StatusType of read replica, the values can be replicating, error, stopped, or
     * terminated.
     * </p>
     * 
     * @param status
     *        Status of the DB instance. For a StatusType of read replica, the values can be replicating, error,
     *        stopped, or terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstanceStatusInfo withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Details of the error if there is an error for the instance. If the instance is not in an error state, this value
     * is blank.
     * </p>
     * 
     * @param message
     *        Details of the error if there is an error for the instance. If the instance is not in an error state, this
     *        value is blank.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Details of the error if there is an error for the instance. If the instance is not in an error state, this value
     * is blank.
     * </p>
     * 
     * @return Details of the error if there is an error for the instance. If the instance is not in an error state,
     *         this value is blank.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Details of the error if there is an error for the instance. If the instance is not in an error state, this value
     * is blank.
     * </p>
     * 
     * @param message
     *        Details of the error if there is an error for the instance. If the instance is not in an error state, this
     *        value is blank.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstanceStatusInfo withMessage(String message) {
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

        if (obj instanceof DBInstanceStatusInfo == false)
            return false;
        DBInstanceStatusInfo other = (DBInstanceStatusInfo) obj;
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
    public DBInstanceStatusInfo clone() {
        try {
            return (DBInstanceStatusInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
