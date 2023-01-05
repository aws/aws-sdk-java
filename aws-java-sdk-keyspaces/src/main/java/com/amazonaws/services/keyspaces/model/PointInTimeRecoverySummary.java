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
package com.amazonaws.services.keyspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The point-in-time recovery status of the specified table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/PointInTimeRecoverySummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PointInTimeRecoverySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Shows if point-in-time recovery is enabled or disabled for the specified table.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Specifies the earliest possible restore point of the table in ISO 8601 format.
     * </p>
     */
    private java.util.Date earliestRestorableTimestamp;

    /**
     * <p>
     * Shows if point-in-time recovery is enabled or disabled for the specified table.
     * </p>
     * 
     * @param status
     *        Shows if point-in-time recovery is enabled or disabled for the specified table.
     * @see PointInTimeRecoveryStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Shows if point-in-time recovery is enabled or disabled for the specified table.
     * </p>
     * 
     * @return Shows if point-in-time recovery is enabled or disabled for the specified table.
     * @see PointInTimeRecoveryStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Shows if point-in-time recovery is enabled or disabled for the specified table.
     * </p>
     * 
     * @param status
     *        Shows if point-in-time recovery is enabled or disabled for the specified table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PointInTimeRecoveryStatus
     */

    public PointInTimeRecoverySummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Shows if point-in-time recovery is enabled or disabled for the specified table.
     * </p>
     * 
     * @param status
     *        Shows if point-in-time recovery is enabled or disabled for the specified table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PointInTimeRecoveryStatus
     */

    public PointInTimeRecoverySummary withStatus(PointInTimeRecoveryStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the earliest possible restore point of the table in ISO 8601 format.
     * </p>
     * 
     * @param earliestRestorableTimestamp
     *        Specifies the earliest possible restore point of the table in ISO 8601 format.
     */

    public void setEarliestRestorableTimestamp(java.util.Date earliestRestorableTimestamp) {
        this.earliestRestorableTimestamp = earliestRestorableTimestamp;
    }

    /**
     * <p>
     * Specifies the earliest possible restore point of the table in ISO 8601 format.
     * </p>
     * 
     * @return Specifies the earliest possible restore point of the table in ISO 8601 format.
     */

    public java.util.Date getEarliestRestorableTimestamp() {
        return this.earliestRestorableTimestamp;
    }

    /**
     * <p>
     * Specifies the earliest possible restore point of the table in ISO 8601 format.
     * </p>
     * 
     * @param earliestRestorableTimestamp
     *        Specifies the earliest possible restore point of the table in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PointInTimeRecoverySummary withEarliestRestorableTimestamp(java.util.Date earliestRestorableTimestamp) {
        setEarliestRestorableTimestamp(earliestRestorableTimestamp);
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
            sb.append("Status: ").append(getStatus()).append(",");
        if (getEarliestRestorableTimestamp() != null)
            sb.append("EarliestRestorableTimestamp: ").append(getEarliestRestorableTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PointInTimeRecoverySummary == false)
            return false;
        PointInTimeRecoverySummary other = (PointInTimeRecoverySummary) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEarliestRestorableTimestamp() == null ^ this.getEarliestRestorableTimestamp() == null)
            return false;
        if (other.getEarliestRestorableTimestamp() != null && other.getEarliestRestorableTimestamp().equals(this.getEarliestRestorableTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEarliestRestorableTimestamp() == null) ? 0 : getEarliestRestorableTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public PointInTimeRecoverySummary clone() {
        try {
            return (PointInTimeRecoverySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.keyspaces.model.transform.PointInTimeRecoverySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
