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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ResetJobBookmark" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResetJobBookmarkResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The reset bookmark entry.
     * </p>
     */
    private JobBookmarkEntry jobBookmarkEntry;

    /**
     * <p>
     * The reset bookmark entry.
     * </p>
     * 
     * @param jobBookmarkEntry
     *        The reset bookmark entry.
     */

    public void setJobBookmarkEntry(JobBookmarkEntry jobBookmarkEntry) {
        this.jobBookmarkEntry = jobBookmarkEntry;
    }

    /**
     * <p>
     * The reset bookmark entry.
     * </p>
     * 
     * @return The reset bookmark entry.
     */

    public JobBookmarkEntry getJobBookmarkEntry() {
        return this.jobBookmarkEntry;
    }

    /**
     * <p>
     * The reset bookmark entry.
     * </p>
     * 
     * @param jobBookmarkEntry
     *        The reset bookmark entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetJobBookmarkResult withJobBookmarkEntry(JobBookmarkEntry jobBookmarkEntry) {
        setJobBookmarkEntry(jobBookmarkEntry);
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
        if (getJobBookmarkEntry() != null)
            sb.append("JobBookmarkEntry: ").append(getJobBookmarkEntry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResetJobBookmarkResult == false)
            return false;
        ResetJobBookmarkResult other = (ResetJobBookmarkResult) obj;
        if (other.getJobBookmarkEntry() == null ^ this.getJobBookmarkEntry() == null)
            return false;
        if (other.getJobBookmarkEntry() != null && other.getJobBookmarkEntry().equals(this.getJobBookmarkEntry()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobBookmarkEntry() == null) ? 0 : getJobBookmarkEntry().hashCode());
        return hashCode;
    }

    @Override
    public ResetJobBookmarkResult clone() {
        try {
            return (ResetJobBookmarkResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
