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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the details of the flow run, including the timestamp, status, and message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ExecutionDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecutionDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the details of the most recent flow run.
     * </p>
     */
    private String mostRecentExecutionMessage;
    /**
     * <p>
     * Specifies the time of the most recent flow run.
     * </p>
     */
    private java.util.Date mostRecentExecutionTime;
    /**
     * <p>
     * Specifies the status of the most recent flow run.
     * </p>
     */
    private String mostRecentExecutionStatus;

    /**
     * <p>
     * Describes the details of the most recent flow run.
     * </p>
     * 
     * @param mostRecentExecutionMessage
     *        Describes the details of the most recent flow run.
     */

    public void setMostRecentExecutionMessage(String mostRecentExecutionMessage) {
        this.mostRecentExecutionMessage = mostRecentExecutionMessage;
    }

    /**
     * <p>
     * Describes the details of the most recent flow run.
     * </p>
     * 
     * @return Describes the details of the most recent flow run.
     */

    public String getMostRecentExecutionMessage() {
        return this.mostRecentExecutionMessage;
    }

    /**
     * <p>
     * Describes the details of the most recent flow run.
     * </p>
     * 
     * @param mostRecentExecutionMessage
     *        Describes the details of the most recent flow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionDetails withMostRecentExecutionMessage(String mostRecentExecutionMessage) {
        setMostRecentExecutionMessage(mostRecentExecutionMessage);
        return this;
    }

    /**
     * <p>
     * Specifies the time of the most recent flow run.
     * </p>
     * 
     * @param mostRecentExecutionTime
     *        Specifies the time of the most recent flow run.
     */

    public void setMostRecentExecutionTime(java.util.Date mostRecentExecutionTime) {
        this.mostRecentExecutionTime = mostRecentExecutionTime;
    }

    /**
     * <p>
     * Specifies the time of the most recent flow run.
     * </p>
     * 
     * @return Specifies the time of the most recent flow run.
     */

    public java.util.Date getMostRecentExecutionTime() {
        return this.mostRecentExecutionTime;
    }

    /**
     * <p>
     * Specifies the time of the most recent flow run.
     * </p>
     * 
     * @param mostRecentExecutionTime
     *        Specifies the time of the most recent flow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionDetails withMostRecentExecutionTime(java.util.Date mostRecentExecutionTime) {
        setMostRecentExecutionTime(mostRecentExecutionTime);
        return this;
    }

    /**
     * <p>
     * Specifies the status of the most recent flow run.
     * </p>
     * 
     * @param mostRecentExecutionStatus
     *        Specifies the status of the most recent flow run.
     * @see ExecutionStatus
     */

    public void setMostRecentExecutionStatus(String mostRecentExecutionStatus) {
        this.mostRecentExecutionStatus = mostRecentExecutionStatus;
    }

    /**
     * <p>
     * Specifies the status of the most recent flow run.
     * </p>
     * 
     * @return Specifies the status of the most recent flow run.
     * @see ExecutionStatus
     */

    public String getMostRecentExecutionStatus() {
        return this.mostRecentExecutionStatus;
    }

    /**
     * <p>
     * Specifies the status of the most recent flow run.
     * </p>
     * 
     * @param mostRecentExecutionStatus
     *        Specifies the status of the most recent flow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public ExecutionDetails withMostRecentExecutionStatus(String mostRecentExecutionStatus) {
        setMostRecentExecutionStatus(mostRecentExecutionStatus);
        return this;
    }

    /**
     * <p>
     * Specifies the status of the most recent flow run.
     * </p>
     * 
     * @param mostRecentExecutionStatus
     *        Specifies the status of the most recent flow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public ExecutionDetails withMostRecentExecutionStatus(ExecutionStatus mostRecentExecutionStatus) {
        this.mostRecentExecutionStatus = mostRecentExecutionStatus.toString();
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
        if (getMostRecentExecutionMessage() != null)
            sb.append("MostRecentExecutionMessage: ").append(getMostRecentExecutionMessage()).append(",");
        if (getMostRecentExecutionTime() != null)
            sb.append("MostRecentExecutionTime: ").append(getMostRecentExecutionTime()).append(",");
        if (getMostRecentExecutionStatus() != null)
            sb.append("MostRecentExecutionStatus: ").append(getMostRecentExecutionStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecutionDetails == false)
            return false;
        ExecutionDetails other = (ExecutionDetails) obj;
        if (other.getMostRecentExecutionMessage() == null ^ this.getMostRecentExecutionMessage() == null)
            return false;
        if (other.getMostRecentExecutionMessage() != null && other.getMostRecentExecutionMessage().equals(this.getMostRecentExecutionMessage()) == false)
            return false;
        if (other.getMostRecentExecutionTime() == null ^ this.getMostRecentExecutionTime() == null)
            return false;
        if (other.getMostRecentExecutionTime() != null && other.getMostRecentExecutionTime().equals(this.getMostRecentExecutionTime()) == false)
            return false;
        if (other.getMostRecentExecutionStatus() == null ^ this.getMostRecentExecutionStatus() == null)
            return false;
        if (other.getMostRecentExecutionStatus() != null && other.getMostRecentExecutionStatus().equals(this.getMostRecentExecutionStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMostRecentExecutionMessage() == null) ? 0 : getMostRecentExecutionMessage().hashCode());
        hashCode = prime * hashCode + ((getMostRecentExecutionTime() == null) ? 0 : getMostRecentExecutionTime().hashCode());
        hashCode = prime * hashCode + ((getMostRecentExecutionStatus() == null) ? 0 : getMostRecentExecutionStatus().hashCode());
        return hashCode;
    }

    @Override
    public ExecutionDetails clone() {
        try {
            return (ExecutionDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.ExecutionDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
