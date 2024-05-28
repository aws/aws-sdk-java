/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The current status of the group.
     * </p>
     */
    private GroupStatusDetail status;
    /**
     * <p>
     * The status history of the group.
     * </p>
     */
    private java.util.List<GroupStatusDetail> statusHistory;

    /**
     * <p>
     * The current status of the group.
     * </p>
     * 
     * @param status
     *        The current status of the group.
     */

    public void setStatus(GroupStatusDetail status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the group.
     * </p>
     * 
     * @return The current status of the group.
     */

    public GroupStatusDetail getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the group.
     * </p>
     * 
     * @param status
     *        The current status of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupResult withStatus(GroupStatusDetail status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status history of the group.
     * </p>
     * 
     * @return The status history of the group.
     */

    public java.util.List<GroupStatusDetail> getStatusHistory() {
        return statusHistory;
    }

    /**
     * <p>
     * The status history of the group.
     * </p>
     * 
     * @param statusHistory
     *        The status history of the group.
     */

    public void setStatusHistory(java.util.Collection<GroupStatusDetail> statusHistory) {
        if (statusHistory == null) {
            this.statusHistory = null;
            return;
        }

        this.statusHistory = new java.util.ArrayList<GroupStatusDetail>(statusHistory);
    }

    /**
     * <p>
     * The status history of the group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatusHistory(java.util.Collection)} or {@link #withStatusHistory(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param statusHistory
     *        The status history of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupResult withStatusHistory(GroupStatusDetail... statusHistory) {
        if (this.statusHistory == null) {
            setStatusHistory(new java.util.ArrayList<GroupStatusDetail>(statusHistory.length));
        }
        for (GroupStatusDetail ele : statusHistory) {
            this.statusHistory.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The status history of the group.
     * </p>
     * 
     * @param statusHistory
     *        The status history of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupResult withStatusHistory(java.util.Collection<GroupStatusDetail> statusHistory) {
        setStatusHistory(statusHistory);
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
        if (getStatusHistory() != null)
            sb.append("StatusHistory: ").append(getStatusHistory());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGroupResult == false)
            return false;
        GetGroupResult other = (GetGroupResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusHistory() == null ^ this.getStatusHistory() == null)
            return false;
        if (other.getStatusHistory() != null && other.getStatusHistory().equals(this.getStatusHistory()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusHistory() == null) ? 0 : getStatusHistory().hashCode());
        return hashCode;
    }

    @Override
    public GetGroupResult clone() {
        try {
            return (GetGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
