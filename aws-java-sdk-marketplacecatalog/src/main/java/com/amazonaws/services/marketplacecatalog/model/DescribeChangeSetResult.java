/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.marketplacecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/DescribeChangeSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeChangeSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Required. The unique identifier for the change set referenced in this request.
     * </p>
     */
    private String changeSetId;
    /**
     * <p>
     * The ARN associated with the unique identifier for the change set referenced in this request.
     * </p>
     */
    private String changeSetArn;
    /**
     * <p>
     * The optional name provided in the <code>StartChangeSet</code> request. If you do not provide a name, one is set
     * by default.
     * </p>
     */
    private String changeSetName;
    /**
     * <p>
     * The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request started.
     * </p>
     */
    private String startTime;
    /**
     * <p>
     * The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request transitioned to a terminal state. The
     * change cannot transition to a different state. Null if the request is not in a terminal state.
     * </p>
     */
    private String endTime;
    /**
     * <p>
     * The status of the change request.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Returned if there is a failure on the change set, but that failure is not related to any of the changes in the
     * request.
     * </p>
     */
    private String failureDescription;
    /**
     * <p>
     * An array of <code>ChangeSummary</code> objects.
     * </p>
     */
    private java.util.List<ChangeSummary> changeSet;

    /**
     * <p>
     * Required. The unique identifier for the change set referenced in this request.
     * </p>
     * 
     * @param changeSetId
     *        Required. The unique identifier for the change set referenced in this request.
     */

    public void setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
    }

    /**
     * <p>
     * Required. The unique identifier for the change set referenced in this request.
     * </p>
     * 
     * @return Required. The unique identifier for the change set referenced in this request.
     */

    public String getChangeSetId() {
        return this.changeSetId;
    }

    /**
     * <p>
     * Required. The unique identifier for the change set referenced in this request.
     * </p>
     * 
     * @param changeSetId
     *        Required. The unique identifier for the change set referenced in this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChangeSetResult withChangeSetId(String changeSetId) {
        setChangeSetId(changeSetId);
        return this;
    }

    /**
     * <p>
     * The ARN associated with the unique identifier for the change set referenced in this request.
     * </p>
     * 
     * @param changeSetArn
     *        The ARN associated with the unique identifier for the change set referenced in this request.
     */

    public void setChangeSetArn(String changeSetArn) {
        this.changeSetArn = changeSetArn;
    }

    /**
     * <p>
     * The ARN associated with the unique identifier for the change set referenced in this request.
     * </p>
     * 
     * @return The ARN associated with the unique identifier for the change set referenced in this request.
     */

    public String getChangeSetArn() {
        return this.changeSetArn;
    }

    /**
     * <p>
     * The ARN associated with the unique identifier for the change set referenced in this request.
     * </p>
     * 
     * @param changeSetArn
     *        The ARN associated with the unique identifier for the change set referenced in this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChangeSetResult withChangeSetArn(String changeSetArn) {
        setChangeSetArn(changeSetArn);
        return this;
    }

    /**
     * <p>
     * The optional name provided in the <code>StartChangeSet</code> request. If you do not provide a name, one is set
     * by default.
     * </p>
     * 
     * @param changeSetName
     *        The optional name provided in the <code>StartChangeSet</code> request. If you do not provide a name, one
     *        is set by default.
     */

    public void setChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
    }

    /**
     * <p>
     * The optional name provided in the <code>StartChangeSet</code> request. If you do not provide a name, one is set
     * by default.
     * </p>
     * 
     * @return The optional name provided in the <code>StartChangeSet</code> request. If you do not provide a name, one
     *         is set by default.
     */

    public String getChangeSetName() {
        return this.changeSetName;
    }

    /**
     * <p>
     * The optional name provided in the <code>StartChangeSet</code> request. If you do not provide a name, one is set
     * by default.
     * </p>
     * 
     * @param changeSetName
     *        The optional name provided in the <code>StartChangeSet</code> request. If you do not provide a name, one
     *        is set by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChangeSetResult withChangeSetName(String changeSetName) {
        setChangeSetName(changeSetName);
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request started.
     * </p>
     * 
     * @param startTime
     *        The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request started.
     */

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request started.
     * </p>
     * 
     * @return The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request started.
     */

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request started.
     * </p>
     * 
     * @param startTime
     *        The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChangeSetResult withStartTime(String startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request transitioned to a terminal state. The
     * change cannot transition to a different state. Null if the request is not in a terminal state.
     * </p>
     * 
     * @param endTime
     *        The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request transitioned to a terminal
     *        state. The change cannot transition to a different state. Null if the request is not in a terminal state.
     */

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request transitioned to a terminal state. The
     * change cannot transition to a different state. Null if the request is not in a terminal state.
     * </p>
     * 
     * @return The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request transitioned to a terminal
     *         state. The change cannot transition to a different state. Null if the request is not in a terminal state.
     */

    public String getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request transitioned to a terminal state. The
     * change cannot transition to a different state. Null if the request is not in a terminal state.
     * </p>
     * 
     * @param endTime
     *        The date and time, in ISO 8601 format (2018-02-27T13:45:22Z), the request transitioned to a terminal
     *        state. The change cannot transition to a different state. Null if the request is not in a terminal state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChangeSetResult withEndTime(String endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The status of the change request.
     * </p>
     * 
     * @param status
     *        The status of the change request.
     * @see ChangeStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the change request.
     * </p>
     * 
     * @return The status of the change request.
     * @see ChangeStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the change request.
     * </p>
     * 
     * @param status
     *        The status of the change request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeStatus
     */

    public DescribeChangeSetResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the change request.
     * </p>
     * 
     * @param status
     *        The status of the change request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeStatus
     */

    public DescribeChangeSetResult withStatus(ChangeStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Returned if there is a failure on the change set, but that failure is not related to any of the changes in the
     * request.
     * </p>
     * 
     * @param failureDescription
     *        Returned if there is a failure on the change set, but that failure is not related to any of the changes in
     *        the request.
     */

    public void setFailureDescription(String failureDescription) {
        this.failureDescription = failureDescription;
    }

    /**
     * <p>
     * Returned if there is a failure on the change set, but that failure is not related to any of the changes in the
     * request.
     * </p>
     * 
     * @return Returned if there is a failure on the change set, but that failure is not related to any of the changes
     *         in the request.
     */

    public String getFailureDescription() {
        return this.failureDescription;
    }

    /**
     * <p>
     * Returned if there is a failure on the change set, but that failure is not related to any of the changes in the
     * request.
     * </p>
     * 
     * @param failureDescription
     *        Returned if there is a failure on the change set, but that failure is not related to any of the changes in
     *        the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChangeSetResult withFailureDescription(String failureDescription) {
        setFailureDescription(failureDescription);
        return this;
    }

    /**
     * <p>
     * An array of <code>ChangeSummary</code> objects.
     * </p>
     * 
     * @return An array of <code>ChangeSummary</code> objects.
     */

    public java.util.List<ChangeSummary> getChangeSet() {
        return changeSet;
    }

    /**
     * <p>
     * An array of <code>ChangeSummary</code> objects.
     * </p>
     * 
     * @param changeSet
     *        An array of <code>ChangeSummary</code> objects.
     */

    public void setChangeSet(java.util.Collection<ChangeSummary> changeSet) {
        if (changeSet == null) {
            this.changeSet = null;
            return;
        }

        this.changeSet = new java.util.ArrayList<ChangeSummary>(changeSet);
    }

    /**
     * <p>
     * An array of <code>ChangeSummary</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChangeSet(java.util.Collection)} or {@link #withChangeSet(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param changeSet
     *        An array of <code>ChangeSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChangeSetResult withChangeSet(ChangeSummary... changeSet) {
        if (this.changeSet == null) {
            setChangeSet(new java.util.ArrayList<ChangeSummary>(changeSet.length));
        }
        for (ChangeSummary ele : changeSet) {
            this.changeSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ChangeSummary</code> objects.
     * </p>
     * 
     * @param changeSet
     *        An array of <code>ChangeSummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChangeSetResult withChangeSet(java.util.Collection<ChangeSummary> changeSet) {
        setChangeSet(changeSet);
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
        if (getChangeSetId() != null)
            sb.append("ChangeSetId: ").append(getChangeSetId()).append(",");
        if (getChangeSetArn() != null)
            sb.append("ChangeSetArn: ").append(getChangeSetArn()).append(",");
        if (getChangeSetName() != null)
            sb.append("ChangeSetName: ").append(getChangeSetName()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFailureDescription() != null)
            sb.append("FailureDescription: ").append(getFailureDescription()).append(",");
        if (getChangeSet() != null)
            sb.append("ChangeSet: ").append(getChangeSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeChangeSetResult == false)
            return false;
        DescribeChangeSetResult other = (DescribeChangeSetResult) obj;
        if (other.getChangeSetId() == null ^ this.getChangeSetId() == null)
            return false;
        if (other.getChangeSetId() != null && other.getChangeSetId().equals(this.getChangeSetId()) == false)
            return false;
        if (other.getChangeSetArn() == null ^ this.getChangeSetArn() == null)
            return false;
        if (other.getChangeSetArn() != null && other.getChangeSetArn().equals(this.getChangeSetArn()) == false)
            return false;
        if (other.getChangeSetName() == null ^ this.getChangeSetName() == null)
            return false;
        if (other.getChangeSetName() != null && other.getChangeSetName().equals(this.getChangeSetName()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureDescription() == null ^ this.getFailureDescription() == null)
            return false;
        if (other.getFailureDescription() != null && other.getFailureDescription().equals(this.getFailureDescription()) == false)
            return false;
        if (other.getChangeSet() == null ^ this.getChangeSet() == null)
            return false;
        if (other.getChangeSet() != null && other.getChangeSet().equals(this.getChangeSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChangeSetId() == null) ? 0 : getChangeSetId().hashCode());
        hashCode = prime * hashCode + ((getChangeSetArn() == null) ? 0 : getChangeSetArn().hashCode());
        hashCode = prime * hashCode + ((getChangeSetName() == null) ? 0 : getChangeSetName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureDescription() == null) ? 0 : getFailureDescription().hashCode());
        hashCode = prime * hashCode + ((getChangeSet() == null) ? 0 : getChangeSet().hashCode());
        return hashCode;
    }

    @Override
    public DescribeChangeSetResult clone() {
        try {
            return (DescribeChangeSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
