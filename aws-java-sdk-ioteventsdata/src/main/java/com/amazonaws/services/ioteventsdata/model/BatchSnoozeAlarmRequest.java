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
package com.amazonaws.services.ioteventsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchSnoozeAlarm" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchSnoozeAlarmRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of snooze action requests. You can specify up to 10 requests per operation.
     * </p>
     */
    private java.util.List<SnoozeAlarmActionRequest> snoozeActionRequests;

    /**
     * <p>
     * The list of snooze action requests. You can specify up to 10 requests per operation.
     * </p>
     * 
     * @return The list of snooze action requests. You can specify up to 10 requests per operation.
     */

    public java.util.List<SnoozeAlarmActionRequest> getSnoozeActionRequests() {
        return snoozeActionRequests;
    }

    /**
     * <p>
     * The list of snooze action requests. You can specify up to 10 requests per operation.
     * </p>
     * 
     * @param snoozeActionRequests
     *        The list of snooze action requests. You can specify up to 10 requests per operation.
     */

    public void setSnoozeActionRequests(java.util.Collection<SnoozeAlarmActionRequest> snoozeActionRequests) {
        if (snoozeActionRequests == null) {
            this.snoozeActionRequests = null;
            return;
        }

        this.snoozeActionRequests = new java.util.ArrayList<SnoozeAlarmActionRequest>(snoozeActionRequests);
    }

    /**
     * <p>
     * The list of snooze action requests. You can specify up to 10 requests per operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSnoozeActionRequests(java.util.Collection)} or {@link #withSnoozeActionRequests(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param snoozeActionRequests
     *        The list of snooze action requests. You can specify up to 10 requests per operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchSnoozeAlarmRequest withSnoozeActionRequests(SnoozeAlarmActionRequest... snoozeActionRequests) {
        if (this.snoozeActionRequests == null) {
            setSnoozeActionRequests(new java.util.ArrayList<SnoozeAlarmActionRequest>(snoozeActionRequests.length));
        }
        for (SnoozeAlarmActionRequest ele : snoozeActionRequests) {
            this.snoozeActionRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of snooze action requests. You can specify up to 10 requests per operation.
     * </p>
     * 
     * @param snoozeActionRequests
     *        The list of snooze action requests. You can specify up to 10 requests per operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchSnoozeAlarmRequest withSnoozeActionRequests(java.util.Collection<SnoozeAlarmActionRequest> snoozeActionRequests) {
        setSnoozeActionRequests(snoozeActionRequests);
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
        if (getSnoozeActionRequests() != null)
            sb.append("SnoozeActionRequests: ").append(getSnoozeActionRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchSnoozeAlarmRequest == false)
            return false;
        BatchSnoozeAlarmRequest other = (BatchSnoozeAlarmRequest) obj;
        if (other.getSnoozeActionRequests() == null ^ this.getSnoozeActionRequests() == null)
            return false;
        if (other.getSnoozeActionRequests() != null && other.getSnoozeActionRequests().equals(this.getSnoozeActionRequests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnoozeActionRequests() == null) ? 0 : getSnoozeActionRequests().hashCode());
        return hashCode;
    }

    @Override
    public BatchSnoozeAlarmRequest clone() {
        return (BatchSnoozeAlarmRequest) super.clone();
    }

}
