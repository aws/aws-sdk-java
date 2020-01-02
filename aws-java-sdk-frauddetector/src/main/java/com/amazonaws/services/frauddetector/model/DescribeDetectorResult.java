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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/DescribeDetector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDetectorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The detector ID.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * The status and description for each detector version.
     * </p>
     */
    private java.util.List<DetectorVersionSummary> detectorVersionSummaries;
    /**
     * <p>
     * The next token to be used for subsequent requests.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The detector ID.
     * </p>
     * 
     * @param detectorId
     *        The detector ID.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The detector ID.
     * </p>
     * 
     * @return The detector ID.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The detector ID.
     * </p>
     * 
     * @param detectorId
     *        The detector ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDetectorResult withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * The status and description for each detector version.
     * </p>
     * 
     * @return The status and description for each detector version.
     */

    public java.util.List<DetectorVersionSummary> getDetectorVersionSummaries() {
        return detectorVersionSummaries;
    }

    /**
     * <p>
     * The status and description for each detector version.
     * </p>
     * 
     * @param detectorVersionSummaries
     *        The status and description for each detector version.
     */

    public void setDetectorVersionSummaries(java.util.Collection<DetectorVersionSummary> detectorVersionSummaries) {
        if (detectorVersionSummaries == null) {
            this.detectorVersionSummaries = null;
            return;
        }

        this.detectorVersionSummaries = new java.util.ArrayList<DetectorVersionSummary>(detectorVersionSummaries);
    }

    /**
     * <p>
     * The status and description for each detector version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDetectorVersionSummaries(java.util.Collection)} or
     * {@link #withDetectorVersionSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param detectorVersionSummaries
     *        The status and description for each detector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDetectorResult withDetectorVersionSummaries(DetectorVersionSummary... detectorVersionSummaries) {
        if (this.detectorVersionSummaries == null) {
            setDetectorVersionSummaries(new java.util.ArrayList<DetectorVersionSummary>(detectorVersionSummaries.length));
        }
        for (DetectorVersionSummary ele : detectorVersionSummaries) {
            this.detectorVersionSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The status and description for each detector version.
     * </p>
     * 
     * @param detectorVersionSummaries
     *        The status and description for each detector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDetectorResult withDetectorVersionSummaries(java.util.Collection<DetectorVersionSummary> detectorVersionSummaries) {
        setDetectorVersionSummaries(detectorVersionSummaries);
        return this;
    }

    /**
     * <p>
     * The next token to be used for subsequent requests.
     * </p>
     * 
     * @param nextToken
     *        The next token to be used for subsequent requests.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token to be used for subsequent requests.
     * </p>
     * 
     * @return The next token to be used for subsequent requests.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next token to be used for subsequent requests.
     * </p>
     * 
     * @param nextToken
     *        The next token to be used for subsequent requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDetectorResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getDetectorVersionSummaries() != null)
            sb.append("DetectorVersionSummaries: ").append(getDetectorVersionSummaries()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDetectorResult == false)
            return false;
        DescribeDetectorResult other = (DescribeDetectorResult) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getDetectorVersionSummaries() == null ^ this.getDetectorVersionSummaries() == null)
            return false;
        if (other.getDetectorVersionSummaries() != null && other.getDetectorVersionSummaries().equals(this.getDetectorVersionSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getDetectorVersionSummaries() == null) ? 0 : getDetectorVersionSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDetectorResult clone() {
        try {
            return (DescribeDetectorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
