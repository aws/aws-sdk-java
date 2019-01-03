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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An optional filter that lets you search for jobs that have the specified status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified
     * as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is
     * detected in a target. For example, a job will run on a thing when the thing is added to a target group, even
     * after the job was completed by all things originally in the group.
     * </p>
     */
    private String targetSelection;
    /**
     * <p>
     * The maximum number of results to return per request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A filter that limits the returned jobs to those for the specified group.
     * </p>
     */
    private String thingGroupName;
    /**
     * <p>
     * A filter that limits the returned jobs to those for the specified group.
     * </p>
     */
    private String thingGroupId;

    /**
     * <p>
     * An optional filter that lets you search for jobs that have the specified status.
     * </p>
     * 
     * @param status
     *        An optional filter that lets you search for jobs that have the specified status.
     * @see JobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * An optional filter that lets you search for jobs that have the specified status.
     * </p>
     * 
     * @return An optional filter that lets you search for jobs that have the specified status.
     * @see JobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * An optional filter that lets you search for jobs that have the specified status.
     * </p>
     * 
     * @param status
     *        An optional filter that lets you search for jobs that have the specified status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ListJobsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * An optional filter that lets you search for jobs that have the specified status.
     * </p>
     * 
     * @param status
     *        An optional filter that lets you search for jobs that have the specified status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ListJobsRequest withStatus(JobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified
     * as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is
     * detected in a target. For example, a job will run on a thing when the thing is added to a target group, even
     * after the job was completed by all things originally in the group.
     * </p>
     * 
     * @param targetSelection
     *        Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things
     *        specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing
     *        when a change is detected in a target. For example, a job will run on a thing when the thing is added to a
     *        target group, even after the job was completed by all things originally in the group.
     * @see TargetSelection
     */

    public void setTargetSelection(String targetSelection) {
        this.targetSelection = targetSelection;
    }

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified
     * as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is
     * detected in a target. For example, a job will run on a thing when the thing is added to a target group, even
     * after the job was completed by all things originally in the group.
     * </p>
     * 
     * @return Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things
     *         specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing
     *         when a change is detected in a target. For example, a job will run on a thing when the thing is added to
     *         a target group, even after the job was completed by all things originally in the group.
     * @see TargetSelection
     */

    public String getTargetSelection() {
        return this.targetSelection;
    }

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified
     * as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is
     * detected in a target. For example, a job will run on a thing when the thing is added to a target group, even
     * after the job was completed by all things originally in the group.
     * </p>
     * 
     * @param targetSelection
     *        Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things
     *        specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing
     *        when a change is detected in a target. For example, a job will run on a thing when the thing is added to a
     *        target group, even after the job was completed by all things originally in the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetSelection
     */

    public ListJobsRequest withTargetSelection(String targetSelection) {
        setTargetSelection(targetSelection);
        return this;
    }

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified
     * as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is
     * detected in a target. For example, a job will run on a thing when the thing is added to a target group, even
     * after the job was completed by all things originally in the group.
     * </p>
     * 
     * @param targetSelection
     *        Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things
     *        specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing
     *        when a change is detected in a target. For example, a job will run on a thing when the thing is added to a
     *        target group, even after the job was completed by all things originally in the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetSelection
     */

    public ListJobsRequest withTargetSelection(TargetSelection targetSelection) {
        this.targetSelection = targetSelection.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return per request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per request.
     * </p>
     * 
     * @return The maximum number of results to return per request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return per request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return per request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @return The token to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A filter that limits the returned jobs to those for the specified group.
     * </p>
     * 
     * @param thingGroupName
     *        A filter that limits the returned jobs to those for the specified group.
     */

    public void setThingGroupName(String thingGroupName) {
        this.thingGroupName = thingGroupName;
    }

    /**
     * <p>
     * A filter that limits the returned jobs to those for the specified group.
     * </p>
     * 
     * @return A filter that limits the returned jobs to those for the specified group.
     */

    public String getThingGroupName() {
        return this.thingGroupName;
    }

    /**
     * <p>
     * A filter that limits the returned jobs to those for the specified group.
     * </p>
     * 
     * @param thingGroupName
     *        A filter that limits the returned jobs to those for the specified group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsRequest withThingGroupName(String thingGroupName) {
        setThingGroupName(thingGroupName);
        return this;
    }

    /**
     * <p>
     * A filter that limits the returned jobs to those for the specified group.
     * </p>
     * 
     * @param thingGroupId
     *        A filter that limits the returned jobs to those for the specified group.
     */

    public void setThingGroupId(String thingGroupId) {
        this.thingGroupId = thingGroupId;
    }

    /**
     * <p>
     * A filter that limits the returned jobs to those for the specified group.
     * </p>
     * 
     * @return A filter that limits the returned jobs to those for the specified group.
     */

    public String getThingGroupId() {
        return this.thingGroupId;
    }

    /**
     * <p>
     * A filter that limits the returned jobs to those for the specified group.
     * </p>
     * 
     * @param thingGroupId
     *        A filter that limits the returned jobs to those for the specified group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListJobsRequest withThingGroupId(String thingGroupId) {
        setThingGroupId(thingGroupId);
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
        if (getTargetSelection() != null)
            sb.append("TargetSelection: ").append(getTargetSelection()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getThingGroupName() != null)
            sb.append("ThingGroupName: ").append(getThingGroupName()).append(",");
        if (getThingGroupId() != null)
            sb.append("ThingGroupId: ").append(getThingGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListJobsRequest == false)
            return false;
        ListJobsRequest other = (ListJobsRequest) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTargetSelection() == null ^ this.getTargetSelection() == null)
            return false;
        if (other.getTargetSelection() != null && other.getTargetSelection().equals(this.getTargetSelection()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getThingGroupName() == null ^ this.getThingGroupName() == null)
            return false;
        if (other.getThingGroupName() != null && other.getThingGroupName().equals(this.getThingGroupName()) == false)
            return false;
        if (other.getThingGroupId() == null ^ this.getThingGroupId() == null)
            return false;
        if (other.getThingGroupId() != null && other.getThingGroupId().equals(this.getThingGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTargetSelection() == null) ? 0 : getTargetSelection().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getThingGroupName() == null) ? 0 : getThingGroupName().hashCode());
        hashCode = prime * hashCode + ((getThingGroupId() == null) ? 0 : getThingGroupId().hashCode());
        return hashCode;
    }

    @Override
    public ListJobsRequest clone() {
        return (ListJobsRequest) super.clone();
    }

}
