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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdatePullRequestTitle" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePullRequestTitleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.
     * </p>
     */
    private String pullRequestId;
    /**
     * <p>
     * The updated title of the pull request. This will replace the existing title.
     * </p>
     */
    private String title;

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

    public UpdatePullRequestTitleRequest withPullRequestId(String pullRequestId) {
        setPullRequestId(pullRequestId);
        return this;
    }

    /**
     * <p>
     * The updated title of the pull request. This will replace the existing title.
     * </p>
     * 
     * @param title
     *        The updated title of the pull request. This will replace the existing title.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The updated title of the pull request. This will replace the existing title.
     * </p>
     * 
     * @return The updated title of the pull request. This will replace the existing title.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The updated title of the pull request. This will replace the existing title.
     * </p>
     * 
     * @param title
     *        The updated title of the pull request. This will replace the existing title.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePullRequestTitleRequest withTitle(String title) {
        setTitle(title);
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
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePullRequestTitleRequest == false)
            return false;
        UpdatePullRequestTitleRequest other = (UpdatePullRequestTitleRequest) obj;
        if (other.getPullRequestId() == null ^ this.getPullRequestId() == null)
            return false;
        if (other.getPullRequestId() != null && other.getPullRequestId().equals(this.getPullRequestId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPullRequestId() == null) ? 0 : getPullRequestId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePullRequestTitleRequest clone() {
        return (UpdatePullRequestTitleRequest) super.clone();
    }

}
