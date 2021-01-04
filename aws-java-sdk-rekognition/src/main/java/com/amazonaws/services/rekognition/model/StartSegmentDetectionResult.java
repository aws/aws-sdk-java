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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSegmentDetectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for the segment detection job. The <code>JobId</code> is returned from
     * <code>StartSegmentDetection</code>.
     * </p>
     */
    private String jobId;

    /**
     * <p>
     * Unique identifier for the segment detection job. The <code>JobId</code> is returned from
     * <code>StartSegmentDetection</code>.
     * </p>
     * 
     * @param jobId
     *        Unique identifier for the segment detection job. The <code>JobId</code> is returned from
     *        <code>StartSegmentDetection</code>.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * Unique identifier for the segment detection job. The <code>JobId</code> is returned from
     * <code>StartSegmentDetection</code>.
     * </p>
     * 
     * @return Unique identifier for the segment detection job. The <code>JobId</code> is returned from
     *         <code>StartSegmentDetection</code>.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * Unique identifier for the segment detection job. The <code>JobId</code> is returned from
     * <code>StartSegmentDetection</code>.
     * </p>
     * 
     * @param jobId
     *        Unique identifier for the segment detection job. The <code>JobId</code> is returned from
     *        <code>StartSegmentDetection</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSegmentDetectionResult withJobId(String jobId) {
        setJobId(jobId);
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSegmentDetectionResult == false)
            return false;
        StartSegmentDetectionResult other = (StartSegmentDetectionResult) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        return hashCode;
    }

    @Override
    public StartSegmentDetectionResult clone() {
        try {
            return (StartSegmentDetectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
