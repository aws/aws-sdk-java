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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchResetAlarm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchResetAlarmRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of reset action requests. You can specify up to 10 requests per operation.
     * </p>
     */
    private java.util.List<ResetAlarmActionRequest> resetActionRequests;

    /**
     * <p>
     * The list of reset action requests. You can specify up to 10 requests per operation.
     * </p>
     * 
     * @return The list of reset action requests. You can specify up to 10 requests per operation.
     */

    public java.util.List<ResetAlarmActionRequest> getResetActionRequests() {
        return resetActionRequests;
    }

    /**
     * <p>
     * The list of reset action requests. You can specify up to 10 requests per operation.
     * </p>
     * 
     * @param resetActionRequests
     *        The list of reset action requests. You can specify up to 10 requests per operation.
     */

    public void setResetActionRequests(java.util.Collection<ResetAlarmActionRequest> resetActionRequests) {
        if (resetActionRequests == null) {
            this.resetActionRequests = null;
            return;
        }

        this.resetActionRequests = new java.util.ArrayList<ResetAlarmActionRequest>(resetActionRequests);
    }

    /**
     * <p>
     * The list of reset action requests. You can specify up to 10 requests per operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResetActionRequests(java.util.Collection)} or {@link #withResetActionRequests(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param resetActionRequests
     *        The list of reset action requests. You can specify up to 10 requests per operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchResetAlarmRequest withResetActionRequests(ResetAlarmActionRequest... resetActionRequests) {
        if (this.resetActionRequests == null) {
            setResetActionRequests(new java.util.ArrayList<ResetAlarmActionRequest>(resetActionRequests.length));
        }
        for (ResetAlarmActionRequest ele : resetActionRequests) {
            this.resetActionRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of reset action requests. You can specify up to 10 requests per operation.
     * </p>
     * 
     * @param resetActionRequests
     *        The list of reset action requests. You can specify up to 10 requests per operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchResetAlarmRequest withResetActionRequests(java.util.Collection<ResetAlarmActionRequest> resetActionRequests) {
        setResetActionRequests(resetActionRequests);
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
        if (getResetActionRequests() != null)
            sb.append("ResetActionRequests: ").append(getResetActionRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchResetAlarmRequest == false)
            return false;
        BatchResetAlarmRequest other = (BatchResetAlarmRequest) obj;
        if (other.getResetActionRequests() == null ^ this.getResetActionRequests() == null)
            return false;
        if (other.getResetActionRequests() != null && other.getResetActionRequests().equals(this.getResetActionRequests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResetActionRequests() == null) ? 0 : getResetActionRequests().hashCode());
        return hashCode;
    }

    @Override
    public BatchResetAlarmRequest clone() {
        return (BatchResetAlarmRequest) super.clone();
    }

}
