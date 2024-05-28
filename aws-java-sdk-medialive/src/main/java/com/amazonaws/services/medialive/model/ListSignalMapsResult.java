/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Placeholder documentation for ListSignalMapsResponse
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListSignalMaps" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSignalMapsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** A token used to retrieve the next set of results in paginated list responses. */
    private String nextToken;

    private java.util.List<SignalMapSummary> signalMaps;

    /**
     * A token used to retrieve the next set of results in paginated list responses.
     * 
     * @param nextToken
     *        A token used to retrieve the next set of results in paginated list responses.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * A token used to retrieve the next set of results in paginated list responses.
     * 
     * @return A token used to retrieve the next set of results in paginated list responses.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * A token used to retrieve the next set of results in paginated list responses.
     * 
     * @param nextToken
     *        A token used to retrieve the next set of results in paginated list responses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSignalMapsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<SignalMapSummary> getSignalMaps() {
        return signalMaps;
    }

    /**
     * @param signalMaps
     */

    public void setSignalMaps(java.util.Collection<SignalMapSummary> signalMaps) {
        if (signalMaps == null) {
            this.signalMaps = null;
            return;
        }

        this.signalMaps = new java.util.ArrayList<SignalMapSummary>(signalMaps);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSignalMaps(java.util.Collection)} or {@link #withSignalMaps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param signalMaps
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSignalMapsResult withSignalMaps(SignalMapSummary... signalMaps) {
        if (this.signalMaps == null) {
            setSignalMaps(new java.util.ArrayList<SignalMapSummary>(signalMaps.length));
        }
        for (SignalMapSummary ele : signalMaps) {
            this.signalMaps.add(ele);
        }
        return this;
    }

    /**
     * @param signalMaps
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSignalMapsResult withSignalMaps(java.util.Collection<SignalMapSummary> signalMaps) {
        setSignalMaps(signalMaps);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSignalMaps() != null)
            sb.append("SignalMaps: ").append(getSignalMaps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSignalMapsResult == false)
            return false;
        ListSignalMapsResult other = (ListSignalMapsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSignalMaps() == null ^ this.getSignalMaps() == null)
            return false;
        if (other.getSignalMaps() != null && other.getSignalMaps().equals(this.getSignalMaps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSignalMaps() == null) ? 0 : getSignalMaps().hashCode());
        return hashCode;
    }

    @Override
    public ListSignalMapsResult clone() {
        try {
            return (ListSignalMapsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
