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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListDetectors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDetectorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private java.util.List<String> detectorIds;

    private String nextToken;

    /**
     * @return
     */

    public java.util.List<String> getDetectorIds() {
        return detectorIds;
    }

    /**
     * @param detectorIds
     */

    public void setDetectorIds(java.util.Collection<String> detectorIds) {
        if (detectorIds == null) {
            this.detectorIds = null;
            return;
        }

        this.detectorIds = new java.util.ArrayList<String>(detectorIds);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDetectorIds(java.util.Collection)} or {@link #withDetectorIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param detectorIds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDetectorsResult withDetectorIds(String... detectorIds) {
        if (this.detectorIds == null) {
            setDetectorIds(new java.util.ArrayList<String>(detectorIds.length));
        }
        for (String ele : detectorIds) {
            this.detectorIds.add(ele);
        }
        return this;
    }

    /**
     * @param detectorIds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDetectorsResult withDetectorIds(java.util.Collection<String> detectorIds) {
        setDetectorIds(detectorIds);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
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
        if (getDetectorIds() != null)
            sb.append("DetectorIds: ").append(getDetectorIds()).append(",");
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
        if (other.getDetectorIds() == null ^ this.getDetectorIds() == null)
            return false;
        if (other.getDetectorIds() != null && other.getDetectorIds().equals(this.getDetectorIds()) == false)
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

        hashCode = prime * hashCode + ((getDetectorIds() == null) ? 0 : getDetectorIds().hashCode());
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
