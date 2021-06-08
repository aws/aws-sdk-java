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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListPortals" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPortalsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list that summarizes each portal.
     * </p>
     */
    private java.util.List<PortalSummary> portalSummaries;
    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list that summarizes each portal.
     * </p>
     * 
     * @return A list that summarizes each portal.
     */

    public java.util.List<PortalSummary> getPortalSummaries() {
        return portalSummaries;
    }

    /**
     * <p>
     * A list that summarizes each portal.
     * </p>
     * 
     * @param portalSummaries
     *        A list that summarizes each portal.
     */

    public void setPortalSummaries(java.util.Collection<PortalSummary> portalSummaries) {
        if (portalSummaries == null) {
            this.portalSummaries = null;
            return;
        }

        this.portalSummaries = new java.util.ArrayList<PortalSummary>(portalSummaries);
    }

    /**
     * <p>
     * A list that summarizes each portal.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPortalSummaries(java.util.Collection)} or {@link #withPortalSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param portalSummaries
     *        A list that summarizes each portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPortalsResult withPortalSummaries(PortalSummary... portalSummaries) {
        if (this.portalSummaries == null) {
            setPortalSummaries(new java.util.ArrayList<PortalSummary>(portalSummaries.length));
        }
        for (PortalSummary ele : portalSummaries) {
            this.portalSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that summarizes each portal.
     * </p>
     * 
     * @param portalSummaries
     *        A list that summarizes each portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPortalsResult withPortalSummaries(java.util.Collection<PortalSummary> portalSummaries) {
        setPortalSummaries(portalSummaries);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPortalsResult withNextToken(String nextToken) {
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
        if (getPortalSummaries() != null)
            sb.append("PortalSummaries: ").append(getPortalSummaries()).append(",");
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

        if (obj instanceof ListPortalsResult == false)
            return false;
        ListPortalsResult other = (ListPortalsResult) obj;
        if (other.getPortalSummaries() == null ^ this.getPortalSummaries() == null)
            return false;
        if (other.getPortalSummaries() != null && other.getPortalSummaries().equals(this.getPortalSummaries()) == false)
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

        hashCode = prime * hashCode + ((getPortalSummaries() == null) ? 0 : getPortalSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPortalsResult clone() {
        try {
            return (ListPortalsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
