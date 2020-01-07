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
package com.amazonaws.services.migrationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ListApplicationStates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListApplicationStatesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The configurationIds from the Application Discovery Service that uniquely identifies your applications.
     * </p>
     */
    private java.util.List<String> applicationIds;
    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, there are more results available. To retrieve the
     * next page of results, make the call again using the returned token in <code>NextToken</code>.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Maximum number of results to be returned per page.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The configurationIds from the Application Discovery Service that uniquely identifies your applications.
     * </p>
     * 
     * @return The configurationIds from the Application Discovery Service that uniquely identifies your applications.
     */

    public java.util.List<String> getApplicationIds() {
        return applicationIds;
    }

    /**
     * <p>
     * The configurationIds from the Application Discovery Service that uniquely identifies your applications.
     * </p>
     * 
     * @param applicationIds
     *        The configurationIds from the Application Discovery Service that uniquely identifies your applications.
     */

    public void setApplicationIds(java.util.Collection<String> applicationIds) {
        if (applicationIds == null) {
            this.applicationIds = null;
            return;
        }

        this.applicationIds = new java.util.ArrayList<String>(applicationIds);
    }

    /**
     * <p>
     * The configurationIds from the Application Discovery Service that uniquely identifies your applications.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplicationIds(java.util.Collection)} or {@link #withApplicationIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param applicationIds
     *        The configurationIds from the Application Discovery Service that uniquely identifies your applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationStatesRequest withApplicationIds(String... applicationIds) {
        if (this.applicationIds == null) {
            setApplicationIds(new java.util.ArrayList<String>(applicationIds.length));
        }
        for (String ele : applicationIds) {
            this.applicationIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configurationIds from the Application Discovery Service that uniquely identifies your applications.
     * </p>
     * 
     * @param applicationIds
     *        The configurationIds from the Application Discovery Service that uniquely identifies your applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationStatesRequest withApplicationIds(java.util.Collection<String> applicationIds) {
        setApplicationIds(applicationIds);
        return this;
    }

    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, there are more results available. To retrieve the
     * next page of results, make the call again using the returned token in <code>NextToken</code>.
     * </p>
     * 
     * @param nextToken
     *        If a <code>NextToken</code> was returned by a previous call, there are more results available. To retrieve
     *        the next page of results, make the call again using the returned token in <code>NextToken</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, there are more results available. To retrieve the
     * next page of results, make the call again using the returned token in <code>NextToken</code>.
     * </p>
     * 
     * @return If a <code>NextToken</code> was returned by a previous call, there are more results available. To
     *         retrieve the next page of results, make the call again using the returned token in <code>NextToken</code>
     *         .
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, there are more results available. To retrieve the
     * next page of results, make the call again using the returned token in <code>NextToken</code>.
     * </p>
     * 
     * @param nextToken
     *        If a <code>NextToken</code> was returned by a previous call, there are more results available. To retrieve
     *        the next page of results, make the call again using the returned token in <code>NextToken</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationStatesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Maximum number of results to be returned per page.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to be returned per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of results to be returned per page.
     * </p>
     * 
     * @return Maximum number of results to be returned per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of results to be returned per page.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to be returned per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationStatesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getApplicationIds() != null)
            sb.append("ApplicationIds: ").append(getApplicationIds()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListApplicationStatesRequest == false)
            return false;
        ListApplicationStatesRequest other = (ListApplicationStatesRequest) obj;
        if (other.getApplicationIds() == null ^ this.getApplicationIds() == null)
            return false;
        if (other.getApplicationIds() != null && other.getApplicationIds().equals(this.getApplicationIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationIds() == null) ? 0 : getApplicationIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListApplicationStatesRequest clone() {
        return (ListApplicationStatesRequest) super.clone();
    }

}
