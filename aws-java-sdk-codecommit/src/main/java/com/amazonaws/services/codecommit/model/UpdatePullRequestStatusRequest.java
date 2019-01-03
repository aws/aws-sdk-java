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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdatePullRequestStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePullRequestStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     * </p>
     */
    private String pullRequestId;
    /**
     * <p>
     * The status of the pull request. The only valid operations are to update the status from <code>OPEN</code> to
     * <code>OPEN</code>, <code>OPEN</code> to <code>CLOSED</code> or from from <code>CLOSED</code> to
     * <code>CLOSED</code>.
     * </p>
     */
    private String pullRequestStatus;

    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     * </p>
     * 
     * @param pullRequestId
     *        The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     */

    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     * </p>
     * 
     * @return The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     */

    public String getPullRequestId() {
        return this.pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     * </p>
     * 
     * @param pullRequestId
     *        The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePullRequestStatusRequest withPullRequestId(String pullRequestId) {
        setPullRequestId(pullRequestId);
        return this;
    }

    /**
     * <p>
     * The status of the pull request. The only valid operations are to update the status from <code>OPEN</code> to
     * <code>OPEN</code>, <code>OPEN</code> to <code>CLOSED</code> or from from <code>CLOSED</code> to
     * <code>CLOSED</code>.
     * </p>
     * 
     * @param pullRequestStatus
     *        The status of the pull request. The only valid operations are to update the status from <code>OPEN</code>
     *        to <code>OPEN</code>, <code>OPEN</code> to <code>CLOSED</code> or from from <code>CLOSED</code> to
     *        <code>CLOSED</code>.
     * @see PullRequestStatusEnum
     */

    public void setPullRequestStatus(String pullRequestStatus) {
        this.pullRequestStatus = pullRequestStatus;
    }

    /**
     * <p>
     * The status of the pull request. The only valid operations are to update the status from <code>OPEN</code> to
     * <code>OPEN</code>, <code>OPEN</code> to <code>CLOSED</code> or from from <code>CLOSED</code> to
     * <code>CLOSED</code>.
     * </p>
     * 
     * @return The status of the pull request. The only valid operations are to update the status from <code>OPEN</code>
     *         to <code>OPEN</code>, <code>OPEN</code> to <code>CLOSED</code> or from from <code>CLOSED</code> to
     *         <code>CLOSED</code>.
     * @see PullRequestStatusEnum
     */

    public String getPullRequestStatus() {
        return this.pullRequestStatus;
    }

    /**
     * <p>
     * The status of the pull request. The only valid operations are to update the status from <code>OPEN</code> to
     * <code>OPEN</code>, <code>OPEN</code> to <code>CLOSED</code> or from from <code>CLOSED</code> to
     * <code>CLOSED</code>.
     * </p>
     * 
     * @param pullRequestStatus
     *        The status of the pull request. The only valid operations are to update the status from <code>OPEN</code>
     *        to <code>OPEN</code>, <code>OPEN</code> to <code>CLOSED</code> or from from <code>CLOSED</code> to
     *        <code>CLOSED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PullRequestStatusEnum
     */

    public UpdatePullRequestStatusRequest withPullRequestStatus(String pullRequestStatus) {
        setPullRequestStatus(pullRequestStatus);
        return this;
    }

    /**
     * <p>
     * The status of the pull request. The only valid operations are to update the status from <code>OPEN</code> to
     * <code>OPEN</code>, <code>OPEN</code> to <code>CLOSED</code> or from from <code>CLOSED</code> to
     * <code>CLOSED</code>.
     * </p>
     * 
     * @param pullRequestStatus
     *        The status of the pull request. The only valid operations are to update the status from <code>OPEN</code>
     *        to <code>OPEN</code>, <code>OPEN</code> to <code>CLOSED</code> or from from <code>CLOSED</code> to
     *        <code>CLOSED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PullRequestStatusEnum
     */

    public UpdatePullRequestStatusRequest withPullRequestStatus(PullRequestStatusEnum pullRequestStatus) {
        this.pullRequestStatus = pullRequestStatus.toString();
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
        if (getPullRequestId() != null)
            sb.append("PullRequestId: ").append(getPullRequestId()).append(",");
        if (getPullRequestStatus() != null)
            sb.append("PullRequestStatus: ").append(getPullRequestStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePullRequestStatusRequest == false)
            return false;
        UpdatePullRequestStatusRequest other = (UpdatePullRequestStatusRequest) obj;
        if (other.getPullRequestId() == null ^ this.getPullRequestId() == null)
            return false;
        if (other.getPullRequestId() != null && other.getPullRequestId().equals(this.getPullRequestId()) == false)
            return false;
        if (other.getPullRequestStatus() == null ^ this.getPullRequestStatus() == null)
            return false;
        if (other.getPullRequestStatus() != null && other.getPullRequestStatus().equals(this.getPullRequestStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPullRequestId() == null) ? 0 : getPullRequestId().hashCode());
        hashCode = prime * hashCode + ((getPullRequestStatus() == null) ? 0 : getPullRequestStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePullRequestStatusRequest clone() {
        return (UpdatePullRequestStatusRequest) super.clone();
    }

}
