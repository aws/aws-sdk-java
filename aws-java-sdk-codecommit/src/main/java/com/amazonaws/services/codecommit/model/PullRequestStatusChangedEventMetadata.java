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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a change to the status of a pull request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PullRequestStatusChangedEventMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PullRequestStatusChangedEventMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The changed status of the pull request.
     * </p>
     */
    private String pullRequestStatus;

    /**
     * <p>
     * The changed status of the pull request.
     * </p>
     * 
     * @param pullRequestStatus
     *        The changed status of the pull request.
     * @see PullRequestStatusEnum
     */

    public void setPullRequestStatus(String pullRequestStatus) {
        this.pullRequestStatus = pullRequestStatus;
    }

    /**
     * <p>
     * The changed status of the pull request.
     * </p>
     * 
     * @return The changed status of the pull request.
     * @see PullRequestStatusEnum
     */

    public String getPullRequestStatus() {
        return this.pullRequestStatus;
    }

    /**
     * <p>
     * The changed status of the pull request.
     * </p>
     * 
     * @param pullRequestStatus
     *        The changed status of the pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PullRequestStatusEnum
     */

    public PullRequestStatusChangedEventMetadata withPullRequestStatus(String pullRequestStatus) {
        setPullRequestStatus(pullRequestStatus);
        return this;
    }

    /**
     * <p>
     * The changed status of the pull request.
     * </p>
     * 
     * @param pullRequestStatus
     *        The changed status of the pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PullRequestStatusEnum
     */

    public PullRequestStatusChangedEventMetadata withPullRequestStatus(PullRequestStatusEnum pullRequestStatus) {
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

        if (obj instanceof PullRequestStatusChangedEventMetadata == false)
            return false;
        PullRequestStatusChangedEventMetadata other = (PullRequestStatusChangedEventMetadata) obj;
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

        hashCode = prime * hashCode + ((getPullRequestStatus() == null) ? 0 : getPullRequestStatus().hashCode());
        return hashCode;
    }

    @Override
    public PullRequestStatusChangedEventMetadata clone() {
        try {
            return (PullRequestStatusChangedEventMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.PullRequestStatusChangedEventMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
