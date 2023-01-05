/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Statistics about the Identity Resolution Job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/JobStats" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobStats implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of profiles reviewed.
     * </p>
     */
    private Long numberOfProfilesReviewed;
    /**
     * <p>
     * The number of matches found.
     * </p>
     */
    private Long numberOfMatchesFound;
    /**
     * <p>
     * The number of merges completed.
     * </p>
     */
    private Long numberOfMergesDone;

    /**
     * <p>
     * The number of profiles reviewed.
     * </p>
     * 
     * @param numberOfProfilesReviewed
     *        The number of profiles reviewed.
     */

    public void setNumberOfProfilesReviewed(Long numberOfProfilesReviewed) {
        this.numberOfProfilesReviewed = numberOfProfilesReviewed;
    }

    /**
     * <p>
     * The number of profiles reviewed.
     * </p>
     * 
     * @return The number of profiles reviewed.
     */

    public Long getNumberOfProfilesReviewed() {
        return this.numberOfProfilesReviewed;
    }

    /**
     * <p>
     * The number of profiles reviewed.
     * </p>
     * 
     * @param numberOfProfilesReviewed
     *        The number of profiles reviewed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobStats withNumberOfProfilesReviewed(Long numberOfProfilesReviewed) {
        setNumberOfProfilesReviewed(numberOfProfilesReviewed);
        return this;
    }

    /**
     * <p>
     * The number of matches found.
     * </p>
     * 
     * @param numberOfMatchesFound
     *        The number of matches found.
     */

    public void setNumberOfMatchesFound(Long numberOfMatchesFound) {
        this.numberOfMatchesFound = numberOfMatchesFound;
    }

    /**
     * <p>
     * The number of matches found.
     * </p>
     * 
     * @return The number of matches found.
     */

    public Long getNumberOfMatchesFound() {
        return this.numberOfMatchesFound;
    }

    /**
     * <p>
     * The number of matches found.
     * </p>
     * 
     * @param numberOfMatchesFound
     *        The number of matches found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobStats withNumberOfMatchesFound(Long numberOfMatchesFound) {
        setNumberOfMatchesFound(numberOfMatchesFound);
        return this;
    }

    /**
     * <p>
     * The number of merges completed.
     * </p>
     * 
     * @param numberOfMergesDone
     *        The number of merges completed.
     */

    public void setNumberOfMergesDone(Long numberOfMergesDone) {
        this.numberOfMergesDone = numberOfMergesDone;
    }

    /**
     * <p>
     * The number of merges completed.
     * </p>
     * 
     * @return The number of merges completed.
     */

    public Long getNumberOfMergesDone() {
        return this.numberOfMergesDone;
    }

    /**
     * <p>
     * The number of merges completed.
     * </p>
     * 
     * @param numberOfMergesDone
     *        The number of merges completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobStats withNumberOfMergesDone(Long numberOfMergesDone) {
        setNumberOfMergesDone(numberOfMergesDone);
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
        if (getNumberOfProfilesReviewed() != null)
            sb.append("NumberOfProfilesReviewed: ").append(getNumberOfProfilesReviewed()).append(",");
        if (getNumberOfMatchesFound() != null)
            sb.append("NumberOfMatchesFound: ").append(getNumberOfMatchesFound()).append(",");
        if (getNumberOfMergesDone() != null)
            sb.append("NumberOfMergesDone: ").append(getNumberOfMergesDone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobStats == false)
            return false;
        JobStats other = (JobStats) obj;
        if (other.getNumberOfProfilesReviewed() == null ^ this.getNumberOfProfilesReviewed() == null)
            return false;
        if (other.getNumberOfProfilesReviewed() != null && other.getNumberOfProfilesReviewed().equals(this.getNumberOfProfilesReviewed()) == false)
            return false;
        if (other.getNumberOfMatchesFound() == null ^ this.getNumberOfMatchesFound() == null)
            return false;
        if (other.getNumberOfMatchesFound() != null && other.getNumberOfMatchesFound().equals(this.getNumberOfMatchesFound()) == false)
            return false;
        if (other.getNumberOfMergesDone() == null ^ this.getNumberOfMergesDone() == null)
            return false;
        if (other.getNumberOfMergesDone() != null && other.getNumberOfMergesDone().equals(this.getNumberOfMergesDone()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumberOfProfilesReviewed() == null) ? 0 : getNumberOfProfilesReviewed().hashCode());
        hashCode = prime * hashCode + ((getNumberOfMatchesFound() == null) ? 0 : getNumberOfMatchesFound().hashCode());
        hashCode = prime * hashCode + ((getNumberOfMergesDone() == null) ? 0 : getNumberOfMergesDone().hashCode());
        return hashCode;
    }

    @Override
    public JobStats clone() {
        try {
            return (JobStats) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.JobStatsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
