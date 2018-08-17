/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a secondary status the job has transitioned into. It includes a start timestamp and later an end timestamp.
 * The end timestamp is added either after the job transitions to a different secondary status or after the job has
 * ended.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/SecondaryStatusTransition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecondaryStatusTransition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides granular information about the system state. For more information, see <code>SecondaryStatus</code>
     * under the <a>DescribeTrainingJob</a> response elements.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A timestamp that shows when the training job has entered this secondary status.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * A timestamp that shows when the secondary status has ended and the job has transitioned into another secondary
     * status. The <code>EndTime</code> timestamp is also set after the training job has ended.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Shows a brief description and other information about the secondary status. For example, the
     * <code>LaunchingMLInstances</code> secondary status could show a status message of
     * "Insufficent capacity error while launching instances".
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * Provides granular information about the system state. For more information, see <code>SecondaryStatus</code>
     * under the <a>DescribeTrainingJob</a> response elements.
     * </p>
     * 
     * @param status
     *        Provides granular information about the system state. For more information, see
     *        <code>SecondaryStatus</code> under the <a>DescribeTrainingJob</a> response elements.
     * @see SecondaryStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Provides granular information about the system state. For more information, see <code>SecondaryStatus</code>
     * under the <a>DescribeTrainingJob</a> response elements.
     * </p>
     * 
     * @return Provides granular information about the system state. For more information, see
     *         <code>SecondaryStatus</code> under the <a>DescribeTrainingJob</a> response elements.
     * @see SecondaryStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Provides granular information about the system state. For more information, see <code>SecondaryStatus</code>
     * under the <a>DescribeTrainingJob</a> response elements.
     * </p>
     * 
     * @param status
     *        Provides granular information about the system state. For more information, see
     *        <code>SecondaryStatus</code> under the <a>DescribeTrainingJob</a> response elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecondaryStatus
     */

    public SecondaryStatusTransition withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Provides granular information about the system state. For more information, see <code>SecondaryStatus</code>
     * under the <a>DescribeTrainingJob</a> response elements.
     * </p>
     * 
     * @param status
     *        Provides granular information about the system state. For more information, see
     *        <code>SecondaryStatus</code> under the <a>DescribeTrainingJob</a> response elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecondaryStatus
     */

    public SecondaryStatusTransition withStatus(SecondaryStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the training job has entered this secondary status.
     * </p>
     * 
     * @param startTime
     *        A timestamp that shows when the training job has entered this secondary status.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * A timestamp that shows when the training job has entered this secondary status.
     * </p>
     * 
     * @return A timestamp that shows when the training job has entered this secondary status.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * A timestamp that shows when the training job has entered this secondary status.
     * </p>
     * 
     * @param startTime
     *        A timestamp that shows when the training job has entered this secondary status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecondaryStatusTransition withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the secondary status has ended and the job has transitioned into another secondary
     * status. The <code>EndTime</code> timestamp is also set after the training job has ended.
     * </p>
     * 
     * @param endTime
     *        A timestamp that shows when the secondary status has ended and the job has transitioned into another
     *        secondary status. The <code>EndTime</code> timestamp is also set after the training job has ended.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * A timestamp that shows when the secondary status has ended and the job has transitioned into another secondary
     * status. The <code>EndTime</code> timestamp is also set after the training job has ended.
     * </p>
     * 
     * @return A timestamp that shows when the secondary status has ended and the job has transitioned into another
     *         secondary status. The <code>EndTime</code> timestamp is also set after the training job has ended.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * A timestamp that shows when the secondary status has ended and the job has transitioned into another secondary
     * status. The <code>EndTime</code> timestamp is also set after the training job has ended.
     * </p>
     * 
     * @param endTime
     *        A timestamp that shows when the secondary status has ended and the job has transitioned into another
     *        secondary status. The <code>EndTime</code> timestamp is also set after the training job has ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecondaryStatusTransition withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Shows a brief description and other information about the secondary status. For example, the
     * <code>LaunchingMLInstances</code> secondary status could show a status message of
     * "Insufficent capacity error while launching instances".
     * </p>
     * 
     * @param statusMessage
     *        Shows a brief description and other information about the secondary status. For example, the
     *        <code>LaunchingMLInstances</code> secondary status could show a status message of
     *        "Insufficent capacity error while launching instances".
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Shows a brief description and other information about the secondary status. For example, the
     * <code>LaunchingMLInstances</code> secondary status could show a status message of
     * "Insufficent capacity error while launching instances".
     * </p>
     * 
     * @return Shows a brief description and other information about the secondary status. For example, the
     *         <code>LaunchingMLInstances</code> secondary status could show a status message of
     *         "Insufficent capacity error while launching instances".
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * Shows a brief description and other information about the secondary status. For example, the
     * <code>LaunchingMLInstances</code> secondary status could show a status message of
     * "Insufficent capacity error while launching instances".
     * </p>
     * 
     * @param statusMessage
     *        Shows a brief description and other information about the secondary status. For example, the
     *        <code>LaunchingMLInstances</code> secondary status could show a status message of
     *        "Insufficent capacity error while launching instances".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecondaryStatusTransition withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecondaryStatusTransition == false)
            return false;
        SecondaryStatusTransition other = (SecondaryStatusTransition) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public SecondaryStatusTransition clone() {
        try {
            return (SecondaryStatusTransition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.SecondaryStatusTransitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
