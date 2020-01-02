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
package com.amazonaws.services.ioteventsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/ListDetectors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDetectorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of summary information about the detectors (instances).
     * </p>
     */
    private java.util.List<DetectorSummary> detectorSummaries;
    /**
     * <p>
     * A token to retrieve the next set of results, or <code>null</code> if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of summary information about the detectors (instances).
     * </p>
     * 
     * @return A list of summary information about the detectors (instances).
     */

    public java.util.List<DetectorSummary> getDetectorSummaries() {
        return detectorSummaries;
    }

    /**
     * <p>
     * A list of summary information about the detectors (instances).
     * </p>
     * 
     * @param detectorSummaries
     *        A list of summary information about the detectors (instances).
     */

    public void setDetectorSummaries(java.util.Collection<DetectorSummary> detectorSummaries) {
        if (detectorSummaries == null) {
            this.detectorSummaries = null;
            return;
        }

        this.detectorSummaries = new java.util.ArrayList<DetectorSummary>(detectorSummaries);
    }

    /**
     * <p>
     * A list of summary information about the detectors (instances).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDetectorSummaries(java.util.Collection)} or {@link #withDetectorSummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param detectorSummaries
     *        A list of summary information about the detectors (instances).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDetectorsResult withDetectorSummaries(DetectorSummary... detectorSummaries) {
        if (this.detectorSummaries == null) {
            setDetectorSummaries(new java.util.ArrayList<DetectorSummary>(detectorSummaries.length));
        }
        for (DetectorSummary ele : detectorSummaries) {
            this.detectorSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of summary information about the detectors (instances).
     * </p>
     * 
     * @param detectorSummaries
     *        A list of summary information about the detectors (instances).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDetectorsResult withDetectorSummaries(java.util.Collection<DetectorSummary> detectorSummaries) {
        setDetectorSummaries(detectorSummaries);
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

    public ListDetectorsResult withNextToken(String nextToken) {
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
        if (getDetectorSummaries() != null)
            sb.append("DetectorSummaries: ").append(getDetectorSummaries()).append(",");
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

        if (obj instanceof ListDetectorsResult == false)
            return false;
        ListDetectorsResult other = (ListDetectorsResult) obj;
        if (other.getDetectorSummaries() == null ^ this.getDetectorSummaries() == null)
            return false;
        if (other.getDetectorSummaries() != null && other.getDetectorSummaries().equals(this.getDetectorSummaries()) == false)
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

        hashCode = prime * hashCode + ((getDetectorSummaries() == null) ? 0 : getDetectorSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDetectorsResult clone() {
        try {
            return (ListDetectorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
