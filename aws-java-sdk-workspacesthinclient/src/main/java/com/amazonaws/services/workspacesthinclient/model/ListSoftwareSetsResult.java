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
package com.amazonaws.services.workspacesthinclient.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/ListSoftwareSets"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSoftwareSetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Describes software sets.
     * </p>
     */
    private java.util.List<SoftwareSetSummary> softwareSets;
    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken error</i>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Describes software sets.
     * </p>
     * 
     * @return Describes software sets.
     */

    public java.util.List<SoftwareSetSummary> getSoftwareSets() {
        return softwareSets;
    }

    /**
     * <p>
     * Describes software sets.
     * </p>
     * 
     * @param softwareSets
     *        Describes software sets.
     */

    public void setSoftwareSets(java.util.Collection<SoftwareSetSummary> softwareSets) {
        if (softwareSets == null) {
            this.softwareSets = null;
            return;
        }

        this.softwareSets = new java.util.ArrayList<SoftwareSetSummary>(softwareSets);
    }

    /**
     * <p>
     * Describes software sets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSoftwareSets(java.util.Collection)} or {@link #withSoftwareSets(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param softwareSets
     *        Describes software sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSoftwareSetsResult withSoftwareSets(SoftwareSetSummary... softwareSets) {
        if (this.softwareSets == null) {
            setSoftwareSets(new java.util.ArrayList<SoftwareSetSummary>(softwareSets.length));
        }
        for (SoftwareSetSummary ele : softwareSets) {
            this.softwareSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes software sets.
     * </p>
     * 
     * @param softwareSets
     *        Describes software sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSoftwareSetsResult withSoftwareSets(java.util.Collection<SoftwareSetSummary> softwareSets) {
        setSoftwareSets(softwareSets);
        return this;
    }

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken error</i>.
     * </p>
     * 
     * @param nextToken
     *        If <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *        24 hours. Using an expired pagination token will return an <i>HTTP 400 InvalidToken error</i>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken error</i>.
     * </p>
     * 
     * @return If <code>nextToken</code> is returned, there are more results available. The value of
     *         <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *         token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *         24 hours. Using an expired pagination token will return an <i>HTTP 400 InvalidToken error</i>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If <code>nextToken</code> is returned, there are more results available. The value of <code>nextToken</code> is a
     * unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours. Using an expired pagination
     * token will return an <i>HTTP 400 InvalidToken error</i>.
     * </p>
     * 
     * @param nextToken
     *        If <code>nextToken</code> is returned, there are more results available. The value of
     *        <code>nextToken</code> is a unique pagination token for each page. Make the call again using the returned
     *        token to retrieve the next page. Keep all other arguments unchanged. Each pagination token expires after
     *        24 hours. Using an expired pagination token will return an <i>HTTP 400 InvalidToken error</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSoftwareSetsResult withNextToken(String nextToken) {
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
        if (getSoftwareSets() != null)
            sb.append("SoftwareSets: ").append(getSoftwareSets()).append(",");
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

        if (obj instanceof ListSoftwareSetsResult == false)
            return false;
        ListSoftwareSetsResult other = (ListSoftwareSetsResult) obj;
        if (other.getSoftwareSets() == null ^ this.getSoftwareSets() == null)
            return false;
        if (other.getSoftwareSets() != null && other.getSoftwareSets().equals(this.getSoftwareSets()) == false)
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

        hashCode = prime * hashCode + ((getSoftwareSets() == null) ? 0 : getSoftwareSets().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSoftwareSetsResult clone() {
        try {
            return (ListSoftwareSetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
