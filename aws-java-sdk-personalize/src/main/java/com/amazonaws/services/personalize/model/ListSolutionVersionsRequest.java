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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListSolutionVersions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSolutionVersionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution.
     * </p>
     */
    private String solutionArn;
    /**
     * <p>
     * A token returned from the previous call to <code>ListSolutionVersions</code> for getting the next set of solution
     * versions (if they exist).
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of solution versions to return.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution.
     * </p>
     * 
     * @param solutionArn
     *        The Amazon Resource Name (ARN) of the solution.
     */

    public void setSolutionArn(String solutionArn) {
        this.solutionArn = solutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the solution.
     */

    public String getSolutionArn() {
        return this.solutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution.
     * </p>
     * 
     * @param solutionArn
     *        The Amazon Resource Name (ARN) of the solution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolutionVersionsRequest withSolutionArn(String solutionArn) {
        setSolutionArn(solutionArn);
        return this;
    }

    /**
     * <p>
     * A token returned from the previous call to <code>ListSolutionVersions</code> for getting the next set of solution
     * versions (if they exist).
     * </p>
     * 
     * @param nextToken
     *        A token returned from the previous call to <code>ListSolutionVersions</code> for getting the next set of
     *        solution versions (if they exist).
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token returned from the previous call to <code>ListSolutionVersions</code> for getting the next set of solution
     * versions (if they exist).
     * </p>
     * 
     * @return A token returned from the previous call to <code>ListSolutionVersions</code> for getting the next set of
     *         solution versions (if they exist).
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token returned from the previous call to <code>ListSolutionVersions</code> for getting the next set of solution
     * versions (if they exist).
     * </p>
     * 
     * @param nextToken
     *        A token returned from the previous call to <code>ListSolutionVersions</code> for getting the next set of
     *        solution versions (if they exist).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolutionVersionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of solution versions to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of solution versions to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of solution versions to return.
     * </p>
     * 
     * @return The maximum number of solution versions to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of solution versions to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of solution versions to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolutionVersionsRequest withMaxResults(Integer maxResults) {
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
        if (getSolutionArn() != null)
            sb.append("SolutionArn: ").append(getSolutionArn()).append(",");
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

        if (obj instanceof ListSolutionVersionsRequest == false)
            return false;
        ListSolutionVersionsRequest other = (ListSolutionVersionsRequest) obj;
        if (other.getSolutionArn() == null ^ this.getSolutionArn() == null)
            return false;
        if (other.getSolutionArn() != null && other.getSolutionArn().equals(this.getSolutionArn()) == false)
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

        hashCode = prime * hashCode + ((getSolutionArn() == null) ? 0 : getSolutionArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListSolutionVersionsRequest clone() {
        return (ListSolutionVersionsRequest) super.clone();
    }

}
