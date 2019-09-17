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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * List of actions to create and list of actions to delete.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/BatchUpdateSchedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateScheduleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** Id of the channel whose schedule is being updated. */
    private String channelId;
    /** Schedule actions to create in the schedule. */
    private BatchScheduleActionCreateRequest creates;
    /** Schedule actions to delete from the schedule. */
    private BatchScheduleActionDeleteRequest deletes;

    /**
     * Id of the channel whose schedule is being updated.
     * 
     * @param channelId
     *        Id of the channel whose schedule is being updated.
     */

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * Id of the channel whose schedule is being updated.
     * 
     * @return Id of the channel whose schedule is being updated.
     */

    public String getChannelId() {
        return this.channelId;
    }

    /**
     * Id of the channel whose schedule is being updated.
     * 
     * @param channelId
     *        Id of the channel whose schedule is being updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateScheduleRequest withChannelId(String channelId) {
        setChannelId(channelId);
        return this;
    }

    /**
     * Schedule actions to create in the schedule.
     * 
     * @param creates
     *        Schedule actions to create in the schedule.
     */

    public void setCreates(BatchScheduleActionCreateRequest creates) {
        this.creates = creates;
    }

    /**
     * Schedule actions to create in the schedule.
     * 
     * @return Schedule actions to create in the schedule.
     */

    public BatchScheduleActionCreateRequest getCreates() {
        return this.creates;
    }

    /**
     * Schedule actions to create in the schedule.
     * 
     * @param creates
     *        Schedule actions to create in the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateScheduleRequest withCreates(BatchScheduleActionCreateRequest creates) {
        setCreates(creates);
        return this;
    }

    /**
     * Schedule actions to delete from the schedule.
     * 
     * @param deletes
     *        Schedule actions to delete from the schedule.
     */

    public void setDeletes(BatchScheduleActionDeleteRequest deletes) {
        this.deletes = deletes;
    }

    /**
     * Schedule actions to delete from the schedule.
     * 
     * @return Schedule actions to delete from the schedule.
     */

    public BatchScheduleActionDeleteRequest getDeletes() {
        return this.deletes;
    }

    /**
     * Schedule actions to delete from the schedule.
     * 
     * @param deletes
     *        Schedule actions to delete from the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateScheduleRequest withDeletes(BatchScheduleActionDeleteRequest deletes) {
        setDeletes(deletes);
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
        if (getChannelId() != null)
            sb.append("ChannelId: ").append(getChannelId()).append(",");
        if (getCreates() != null)
            sb.append("Creates: ").append(getCreates()).append(",");
        if (getDeletes() != null)
            sb.append("Deletes: ").append(getDeletes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateScheduleRequest == false)
            return false;
        BatchUpdateScheduleRequest other = (BatchUpdateScheduleRequest) obj;
        if (other.getChannelId() == null ^ this.getChannelId() == null)
            return false;
        if (other.getChannelId() != null && other.getChannelId().equals(this.getChannelId()) == false)
            return false;
        if (other.getCreates() == null ^ this.getCreates() == null)
            return false;
        if (other.getCreates() != null && other.getCreates().equals(this.getCreates()) == false)
            return false;
        if (other.getDeletes() == null ^ this.getDeletes() == null)
            return false;
        if (other.getDeletes() != null && other.getDeletes().equals(this.getDeletes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        hashCode = prime * hashCode + ((getCreates() == null) ? 0 : getCreates().hashCode());
        hashCode = prime * hashCode + ((getDeletes() == null) ? 0 : getDeletes().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdateScheduleRequest clone() {
        return (BatchUpdateScheduleRequest) super.clone();
    }

}
