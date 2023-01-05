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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateContactSchedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateContactScheduleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The identifier of the contact.
     * </p>
     */
    private String contactId;
    /**
     * <p>
     * The timestamp, in Unix Epoch seconds format, at which to start running the inbound flow. The scheduled time
     * cannot be in the past. It must be within up to 6 days in future.
     * </p>
     */
    private java.util.Date scheduledTime;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactScheduleRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The identifier of the contact.
     * </p>
     * 
     * @param contactId
     *        The identifier of the contact.
     */

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    /**
     * <p>
     * The identifier of the contact.
     * </p>
     * 
     * @return The identifier of the contact.
     */

    public String getContactId() {
        return this.contactId;
    }

    /**
     * <p>
     * The identifier of the contact.
     * </p>
     * 
     * @param contactId
     *        The identifier of the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactScheduleRequest withContactId(String contactId) {
        setContactId(contactId);
        return this;
    }

    /**
     * <p>
     * The timestamp, in Unix Epoch seconds format, at which to start running the inbound flow. The scheduled time
     * cannot be in the past. It must be within up to 6 days in future.
     * </p>
     * 
     * @param scheduledTime
     *        The timestamp, in Unix Epoch seconds format, at which to start running the inbound flow. The scheduled
     *        time cannot be in the past. It must be within up to 6 days in future.
     */

    public void setScheduledTime(java.util.Date scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    /**
     * <p>
     * The timestamp, in Unix Epoch seconds format, at which to start running the inbound flow. The scheduled time
     * cannot be in the past. It must be within up to 6 days in future.
     * </p>
     * 
     * @return The timestamp, in Unix Epoch seconds format, at which to start running the inbound flow. The scheduled
     *         time cannot be in the past. It must be within up to 6 days in future.
     */

    public java.util.Date getScheduledTime() {
        return this.scheduledTime;
    }

    /**
     * <p>
     * The timestamp, in Unix Epoch seconds format, at which to start running the inbound flow. The scheduled time
     * cannot be in the past. It must be within up to 6 days in future.
     * </p>
     * 
     * @param scheduledTime
     *        The timestamp, in Unix Epoch seconds format, at which to start running the inbound flow. The scheduled
     *        time cannot be in the past. It must be within up to 6 days in future.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContactScheduleRequest withScheduledTime(java.util.Date scheduledTime) {
        setScheduledTime(scheduledTime);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getContactId() != null)
            sb.append("ContactId: ").append(getContactId()).append(",");
        if (getScheduledTime() != null)
            sb.append("ScheduledTime: ").append(getScheduledTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateContactScheduleRequest == false)
            return false;
        UpdateContactScheduleRequest other = (UpdateContactScheduleRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getContactId() == null ^ this.getContactId() == null)
            return false;
        if (other.getContactId() != null && other.getContactId().equals(this.getContactId()) == false)
            return false;
        if (other.getScheduledTime() == null ^ this.getScheduledTime() == null)
            return false;
        if (other.getScheduledTime() != null && other.getScheduledTime().equals(this.getScheduledTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getContactId() == null) ? 0 : getContactId().hashCode());
        hashCode = prime * hashCode + ((getScheduledTime() == null) ? 0 : getScheduledTime().hashCode());
        return hashCode;
    }

    @Override
    public UpdateContactScheduleRequest clone() {
        return (UpdateContactScheduleRequest) super.clone();
    }

}
