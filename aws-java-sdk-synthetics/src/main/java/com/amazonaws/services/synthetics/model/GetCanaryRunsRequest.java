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
package com.amazonaws.services.synthetics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/GetCanaryRuns" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCanaryRunsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the canary that you want to see runs for.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>GetCanaryRuns</code> operation to retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specify this parameter to limit how many runs are returned each time you use the <code>GetCanaryRuns</code>
     * operation. If you omit this parameter, the default of 100 is used.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The name of the canary that you want to see runs for.
     * </p>
     * 
     * @param name
     *        The name of the canary that you want to see runs for.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the canary that you want to see runs for.
     * </p>
     * 
     * @return The name of the canary that you want to see runs for.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the canary that you want to see runs for.
     * </p>
     * 
     * @param name
     *        The name of the canary that you want to see runs for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCanaryRunsRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>GetCanaryRuns</code> operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates that there is more data available. You can use this token in a subsequent
     *        <code>GetCanaryRuns</code> operation to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>GetCanaryRuns</code> operation to retrieve the next set of results.
     * </p>
     * 
     * @return A token that indicates that there is more data available. You can use this token in a subsequent
     *         <code>GetCanaryRuns</code> operation to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates that there is more data available. You can use this token in a subsequent
     * <code>GetCanaryRuns</code> operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates that there is more data available. You can use this token in a subsequent
     *        <code>GetCanaryRuns</code> operation to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCanaryRunsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specify this parameter to limit how many runs are returned each time you use the <code>GetCanaryRuns</code>
     * operation. If you omit this parameter, the default of 100 is used.
     * </p>
     * 
     * @param maxResults
     *        Specify this parameter to limit how many runs are returned each time you use the
     *        <code>GetCanaryRuns</code> operation. If you omit this parameter, the default of 100 is used.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specify this parameter to limit how many runs are returned each time you use the <code>GetCanaryRuns</code>
     * operation. If you omit this parameter, the default of 100 is used.
     * </p>
     * 
     * @return Specify this parameter to limit how many runs are returned each time you use the
     *         <code>GetCanaryRuns</code> operation. If you omit this parameter, the default of 100 is used.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specify this parameter to limit how many runs are returned each time you use the <code>GetCanaryRuns</code>
     * operation. If you omit this parameter, the default of 100 is used.
     * </p>
     * 
     * @param maxResults
     *        Specify this parameter to limit how many runs are returned each time you use the
     *        <code>GetCanaryRuns</code> operation. If you omit this parameter, the default of 100 is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCanaryRunsRequest withMaxResults(Integer maxResults) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof GetCanaryRunsRequest == false)
            return false;
        GetCanaryRunsRequest other = (GetCanaryRunsRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetCanaryRunsRequest clone() {
        return (GetCanaryRunsRequest) super.clone();
    }

}
