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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/StartDocumentTextDetection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartDocumentTextDetectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the document text-detection job. Use <code>JobId</code> to identify the job in a subsequent
     * call to <code>GetDocumentTextDetection</code>.
     * </p>
     */
    private String jobId;

    /**
     * <p>
     * The identifier for the document text-detection job. Use <code>JobId</code> to identify the job in a subsequent
     * call to <code>GetDocumentTextDetection</code>.
     * </p>
     * 
     * @param jobId
     *        The identifier for the document text-detection job. Use <code>JobId</code> to identify the job in a
     *        subsequent call to <code>GetDocumentTextDetection</code>.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The identifier for the document text-detection job. Use <code>JobId</code> to identify the job in a subsequent
     * call to <code>GetDocumentTextDetection</code>.
     * </p>
     * 
     * @return The identifier for the document text-detection job. Use <code>JobId</code> to identify the job in a
     *         subsequent call to <code>GetDocumentTextDetection</code>.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The identifier for the document text-detection job. Use <code>JobId</code> to identify the job in a subsequent
     * call to <code>GetDocumentTextDetection</code>.
     * </p>
     * 
     * @param jobId
     *        The identifier for the document text-detection job. Use <code>JobId</code> to identify the job in a
     *        subsequent call to <code>GetDocumentTextDetection</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDocumentTextDetectionResult withJobId(String jobId) {
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

        if (obj instanceof StartDocumentTextDetectionResult == false)
            return false;
        StartDocumentTextDetectionResult other = (StartDocumentTextDetectionResult) obj;
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
    public StartDocumentTextDetectionResult clone() {
        try {
            return (StartDocumentTextDetectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
