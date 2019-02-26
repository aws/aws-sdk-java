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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListSubscribedWorkteams" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSubscribedWorkteamsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A string in the work team name. This filter returns only work teams whose name contains the specified string.
     * </p>
     */
    private String nameContains;
    /**
     * <p>
     * If the result of the previous <code>ListSubscribedWorkteams</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of labeling jobs, use the token in the next request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of work teams to return in each page of the response.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * A string in the work team name. This filter returns only work teams whose name contains the specified string.
     * </p>
     * 
     * @param nameContains
     *        A string in the work team name. This filter returns only work teams whose name contains the specified
     *        string.
     */

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * A string in the work team name. This filter returns only work teams whose name contains the specified string.
     * </p>
     * 
     * @return A string in the work team name. This filter returns only work teams whose name contains the specified
     *         string.
     */

    public String getNameContains() {
        return this.nameContains;
    }

    /**
     * <p>
     * A string in the work team name. This filter returns only work teams whose name contains the specified string.
     * </p>
     * 
     * @param nameContains
     *        A string in the work team name. This filter returns only work teams whose name contains the specified
     *        string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscribedWorkteamsRequest withNameContains(String nameContains) {
        setNameContains(nameContains);
        return this;
    }

    /**
     * <p>
     * If the result of the previous <code>ListSubscribedWorkteams</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of labeling jobs, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous <code>ListSubscribedWorkteams</code> request was truncated, the response
     *        includes a <code>NextToken</code>. To retrieve the next set of labeling jobs, use the token in the next
     *        request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of the previous <code>ListSubscribedWorkteams</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of labeling jobs, use the token in the next request.
     * </p>
     * 
     * @return If the result of the previous <code>ListSubscribedWorkteams</code> request was truncated, the response
     *         includes a <code>NextToken</code>. To retrieve the next set of labeling jobs, use the token in the next
     *         request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the result of the previous <code>ListSubscribedWorkteams</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of labeling jobs, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous <code>ListSubscribedWorkteams</code> request was truncated, the response
     *        includes a <code>NextToken</code>. To retrieve the next set of labeling jobs, use the token in the next
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscribedWorkteamsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of work teams to return in each page of the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of work teams to return in each page of the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of work teams to return in each page of the response.
     * </p>
     * 
     * @return The maximum number of work teams to return in each page of the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of work teams to return in each page of the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of work teams to return in each page of the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSubscribedWorkteamsRequest withMaxResults(Integer maxResults) {
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
        if (getNameContains() != null)
            sb.append("NameContains: ").append(getNameContains()).append(",");
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

        if (obj instanceof ListSubscribedWorkteamsRequest == false)
            return false;
        ListSubscribedWorkteamsRequest other = (ListSubscribedWorkteamsRequest) obj;
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null && other.getNameContains().equals(this.getNameContains()) == false)
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

        hashCode = prime * hashCode + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListSubscribedWorkteamsRequest clone() {
        return (ListSubscribedWorkteamsRequest) super.clone();
    }

}
