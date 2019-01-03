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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergePullRequestByFastForward"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MergePullRequestByFastForwardResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the specified pull request, including information about the merge.
     * </p>
     */
    private PullRequest pullRequest;

    /**
     * <p>
     * Information about the specified pull request, including information about the merge.
     * </p>
     * 
     * @param pullRequest
     *        Information about the specified pull request, including information about the merge.
     */

    public void setPullRequest(PullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

    /**
     * <p>
     * Information about the specified pull request, including information about the merge.
     * </p>
     * 
     * @return Information about the specified pull request, including information about the merge.
     */

    public PullRequest getPullRequest() {
        return this.pullRequest;
    }

    /**
     * <p>
     * Information about the specified pull request, including information about the merge.
     * </p>
     * 
     * @param pullRequest
     *        Information about the specified pull request, including information about the merge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergePullRequestByFastForwardResult withPullRequest(PullRequest pullRequest) {
        setPullRequest(pullRequest);
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
        if (getPullRequest() != null)
            sb.append("PullRequest: ").append(getPullRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MergePullRequestByFastForwardResult == false)
            return false;
        MergePullRequestByFastForwardResult other = (MergePullRequestByFastForwardResult) obj;
        if (other.getPullRequest() == null ^ this.getPullRequest() == null)
            return false;
        if (other.getPullRequest() != null && other.getPullRequest().equals(this.getPullRequest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPullRequest() == null) ? 0 : getPullRequest().hashCode());
        return hashCode;
    }

    @Override
    public MergePullRequestByFastForwardResult clone() {
        try {
            return (MergePullRequestByFastForwardResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
