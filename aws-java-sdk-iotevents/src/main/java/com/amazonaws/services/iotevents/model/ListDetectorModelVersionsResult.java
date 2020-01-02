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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/ListDetectorModelVersions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDetectorModelVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Summary information about the detector model versions.
     * </p>
     */
    private java.util.List<DetectorModelVersionSummary> detectorModelVersionSummaries;
    /**
     * <p>
     * A token to retrieve the next set of results, or <code>null</code> if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summary information about the detector model versions.
     * </p>
     * 
     * @return Summary information about the detector model versions.
     */

    public java.util.List<DetectorModelVersionSummary> getDetectorModelVersionSummaries() {
        return detectorModelVersionSummaries;
    }

    /**
     * <p>
     * Summary information about the detector model versions.
     * </p>
     * 
     * @param detectorModelVersionSummaries
     *        Summary information about the detector model versions.
     */

    public void setDetectorModelVersionSummaries(java.util.Collection<DetectorModelVersionSummary> detectorModelVersionSummaries) {
        if (detectorModelVersionSummaries == null) {
            this.detectorModelVersionSummaries = null;
            return;
        }

        this.detectorModelVersionSummaries = new java.util.ArrayList<DetectorModelVersionSummary>(detectorModelVersionSummaries);
    }

    /**
     * <p>
     * Summary information about the detector model versions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDetectorModelVersionSummaries(java.util.Collection)} or
     * {@link #withDetectorModelVersionSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param detectorModelVersionSummaries
     *        Summary information about the detector model versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDetectorModelVersionsResult withDetectorModelVersionSummaries(DetectorModelVersionSummary... detectorModelVersionSummaries) {
        if (this.detectorModelVersionSummaries == null) {
            setDetectorModelVersionSummaries(new java.util.ArrayList<DetectorModelVersionSummary>(detectorModelVersionSummaries.length));
        }
        for (DetectorModelVersionSummary ele : detectorModelVersionSummaries) {
            this.detectorModelVersionSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information about the detector model versions.
     * </p>
     * 
     * @param detectorModelVersionSummaries
     *        Summary information about the detector model versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDetectorModelVersionsResult withDetectorModelVersionSummaries(java.util.Collection<DetectorModelVersionSummary> detectorModelVersionSummaries) {
        setDetectorModelVersionSummaries(detectorModelVersionSummaries);
        return this;
    }

    /**
     * <p>
     * A token to retrieve the next set of results, or <code>null</code> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        A token to retrieve the next set of results, or <code>null</code> if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to retrieve the next set of results, or <code>null</code> if there are no additional results.
     * </p>
     * 
     * @return A token to retrieve the next set of results, or <code>null</code> if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to retrieve the next set of results, or <code>null</code> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        A token to retrieve the next set of results, or <code>null</code> if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDetectorModelVersionsResult withNextToken(String nextToken) {
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
        if (getDetectorModelVersionSummaries() != null)
            sb.append("DetectorModelVersionSummaries: ").append(getDetectorModelVersionSummaries()).append(",");
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

        if (obj instanceof ListDetectorModelVersionsResult == false)
            return false;
        ListDetectorModelVersionsResult other = (ListDetectorModelVersionsResult) obj;
        if (other.getDetectorModelVersionSummaries() == null ^ this.getDetectorModelVersionSummaries() == null)
            return false;
        if (other.getDetectorModelVersionSummaries() != null
                && other.getDetectorModelVersionSummaries().equals(this.getDetectorModelVersionSummaries()) == false)
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

        hashCode = prime * hashCode + ((getDetectorModelVersionSummaries() == null) ? 0 : getDetectorModelVersionSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDetectorModelVersionsResult clone() {
        try {
            return (ListDetectorModelVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
