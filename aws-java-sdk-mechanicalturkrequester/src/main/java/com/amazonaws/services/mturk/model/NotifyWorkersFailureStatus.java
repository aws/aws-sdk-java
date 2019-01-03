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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * When MTurk encounters an issue with notifying the Workers you specified, it returns back this object with failure
 * details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/NotifyWorkersFailureStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotifyWorkersFailureStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Encoded value for the failure type.
     * </p>
     */
    private String notifyWorkersFailureCode;
    /**
     * <p>
     * A message detailing the reason the Worker could not be notified.
     * </p>
     */
    private String notifyWorkersFailureMessage;
    /**
     * <p>
     * The ID of the Worker.
     * </p>
     */
    private String workerId;

    /**
     * <p>
     * Encoded value for the failure type.
     * </p>
     * 
     * @param notifyWorkersFailureCode
     *        Encoded value for the failure type.
     * @see NotifyWorkersFailureCode
     */

    public void setNotifyWorkersFailureCode(String notifyWorkersFailureCode) {
        this.notifyWorkersFailureCode = notifyWorkersFailureCode;
    }

    /**
     * <p>
     * Encoded value for the failure type.
     * </p>
     * 
     * @return Encoded value for the failure type.
     * @see NotifyWorkersFailureCode
     */

    public String getNotifyWorkersFailureCode() {
        return this.notifyWorkersFailureCode;
    }

    /**
     * <p>
     * Encoded value for the failure type.
     * </p>
     * 
     * @param notifyWorkersFailureCode
     *        Encoded value for the failure type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotifyWorkersFailureCode
     */

    public NotifyWorkersFailureStatus withNotifyWorkersFailureCode(String notifyWorkersFailureCode) {
        setNotifyWorkersFailureCode(notifyWorkersFailureCode);
        return this;
    }

    /**
     * <p>
     * Encoded value for the failure type.
     * </p>
     * 
     * @param notifyWorkersFailureCode
     *        Encoded value for the failure type.
     * @see NotifyWorkersFailureCode
     */

    public void setNotifyWorkersFailureCode(NotifyWorkersFailureCode notifyWorkersFailureCode) {
        withNotifyWorkersFailureCode(notifyWorkersFailureCode);
    }

    /**
     * <p>
     * Encoded value for the failure type.
     * </p>
     * 
     * @param notifyWorkersFailureCode
     *        Encoded value for the failure type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotifyWorkersFailureCode
     */

    public NotifyWorkersFailureStatus withNotifyWorkersFailureCode(NotifyWorkersFailureCode notifyWorkersFailureCode) {
        this.notifyWorkersFailureCode = notifyWorkersFailureCode.toString();
        return this;
    }

    /**
     * <p>
     * A message detailing the reason the Worker could not be notified.
     * </p>
     * 
     * @param notifyWorkersFailureMessage
     *        A message detailing the reason the Worker could not be notified.
     */

    public void setNotifyWorkersFailureMessage(String notifyWorkersFailureMessage) {
        this.notifyWorkersFailureMessage = notifyWorkersFailureMessage;
    }

    /**
     * <p>
     * A message detailing the reason the Worker could not be notified.
     * </p>
     * 
     * @return A message detailing the reason the Worker could not be notified.
     */

    public String getNotifyWorkersFailureMessage() {
        return this.notifyWorkersFailureMessage;
    }

    /**
     * <p>
     * A message detailing the reason the Worker could not be notified.
     * </p>
     * 
     * @param notifyWorkersFailureMessage
     *        A message detailing the reason the Worker could not be notified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyWorkersFailureStatus withNotifyWorkersFailureMessage(String notifyWorkersFailureMessage) {
        setNotifyWorkersFailureMessage(notifyWorkersFailureMessage);
        return this;
    }

    /**
     * <p>
     * The ID of the Worker.
     * </p>
     * 
     * @param workerId
     *        The ID of the Worker.
     */

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    /**
     * <p>
     * The ID of the Worker.
     * </p>
     * 
     * @return The ID of the Worker.
     */

    public String getWorkerId() {
        return this.workerId;
    }

    /**
     * <p>
     * The ID of the Worker.
     * </p>
     * 
     * @param workerId
     *        The ID of the Worker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyWorkersFailureStatus withWorkerId(String workerId) {
        setWorkerId(workerId);
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
        if (getNotifyWorkersFailureCode() != null)
            sb.append("NotifyWorkersFailureCode: ").append(getNotifyWorkersFailureCode()).append(",");
        if (getNotifyWorkersFailureMessage() != null)
            sb.append("NotifyWorkersFailureMessage: ").append(getNotifyWorkersFailureMessage()).append(",");
        if (getWorkerId() != null)
            sb.append("WorkerId: ").append(getWorkerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotifyWorkersFailureStatus == false)
            return false;
        NotifyWorkersFailureStatus other = (NotifyWorkersFailureStatus) obj;
        if (other.getNotifyWorkersFailureCode() == null ^ this.getNotifyWorkersFailureCode() == null)
            return false;
        if (other.getNotifyWorkersFailureCode() != null && other.getNotifyWorkersFailureCode().equals(this.getNotifyWorkersFailureCode()) == false)
            return false;
        if (other.getNotifyWorkersFailureMessage() == null ^ this.getNotifyWorkersFailureMessage() == null)
            return false;
        if (other.getNotifyWorkersFailureMessage() != null && other.getNotifyWorkersFailureMessage().equals(this.getNotifyWorkersFailureMessage()) == false)
            return false;
        if (other.getWorkerId() == null ^ this.getWorkerId() == null)
            return false;
        if (other.getWorkerId() != null && other.getWorkerId().equals(this.getWorkerId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotifyWorkersFailureCode() == null) ? 0 : getNotifyWorkersFailureCode().hashCode());
        hashCode = prime * hashCode + ((getNotifyWorkersFailureMessage() == null) ? 0 : getNotifyWorkersFailureMessage().hashCode());
        hashCode = prime * hashCode + ((getWorkerId() == null) ? 0 : getWorkerId().hashCode());
        return hashCode;
    }

    @Override
    public NotifyWorkersFailureStatus clone() {
        try {
            return (NotifyWorkersFailureStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mturk.model.transform.NotifyWorkersFailureStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
