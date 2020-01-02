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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListThreatIntelSets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListThreatIntelSetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The IDs of the ThreatIntelSet resources.
     * </p>
     */
    private java.util.List<String> threatIntelSetIds;
    /**
     * <p>
     * Pagination parameter to be used on the next list operation to retrieve more items.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The IDs of the ThreatIntelSet resources.
     * </p>
     * 
     * @return The IDs of the ThreatIntelSet resources.
     */

    public java.util.List<String> getThreatIntelSetIds() {
        return threatIntelSetIds;
    }

    /**
     * <p>
     * The IDs of the ThreatIntelSet resources.
     * </p>
     * 
     * @param threatIntelSetIds
     *        The IDs of the ThreatIntelSet resources.
     */

    public void setThreatIntelSetIds(java.util.Collection<String> threatIntelSetIds) {
        if (threatIntelSetIds == null) {
            this.threatIntelSetIds = null;
            return;
        }

        this.threatIntelSetIds = new java.util.ArrayList<String>(threatIntelSetIds);
    }

    /**
     * <p>
     * The IDs of the ThreatIntelSet resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setThreatIntelSetIds(java.util.Collection)} or {@link #withThreatIntelSetIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param threatIntelSetIds
     *        The IDs of the ThreatIntelSet resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThreatIntelSetsResult withThreatIntelSetIds(String... threatIntelSetIds) {
        if (this.threatIntelSetIds == null) {
            setThreatIntelSetIds(new java.util.ArrayList<String>(threatIntelSetIds.length));
        }
        for (String ele : threatIntelSetIds) {
            this.threatIntelSetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the ThreatIntelSet resources.
     * </p>
     * 
     * @param threatIntelSetIds
     *        The IDs of the ThreatIntelSet resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThreatIntelSetsResult withThreatIntelSetIds(java.util.Collection<String> threatIntelSetIds) {
        setThreatIntelSetIds(threatIntelSetIds);
        return this;
    }

    /**
     * <p>
     * Pagination parameter to be used on the next list operation to retrieve more items.
     * </p>
     * 
     * @param nextToken
     *        Pagination parameter to be used on the next list operation to retrieve more items.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination parameter to be used on the next list operation to retrieve more items.
     * </p>
     * 
     * @return Pagination parameter to be used on the next list operation to retrieve more items.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination parameter to be used on the next list operation to retrieve more items.
     * </p>
     * 
     * @param nextToken
     *        Pagination parameter to be used on the next list operation to retrieve more items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListThreatIntelSetsResult withNextToken(String nextToken) {
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
        if (getThreatIntelSetIds() != null)
            sb.append("ThreatIntelSetIds: ").append(getThreatIntelSetIds()).append(",");
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

        if (obj instanceof ListThreatIntelSetsResult == false)
            return false;
        ListThreatIntelSetsResult other = (ListThreatIntelSetsResult) obj;
        if (other.getThreatIntelSetIds() == null ^ this.getThreatIntelSetIds() == null)
            return false;
        if (other.getThreatIntelSetIds() != null && other.getThreatIntelSetIds().equals(this.getThreatIntelSetIds()) == false)
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

        hashCode = prime * hashCode + ((getThreatIntelSetIds() == null) ? 0 : getThreatIntelSetIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListThreatIntelSetsResult clone() {
        try {
            return (ListThreatIntelSetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
