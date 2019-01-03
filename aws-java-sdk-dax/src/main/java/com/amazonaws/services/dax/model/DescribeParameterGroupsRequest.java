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
package com.amazonaws.services.dax.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DescribeParameterGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeParameterGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The names of the parameter groups.
     * </p>
     */
    private java.util.List<String> parameterGroupNames;
    /**
     * <p>
     * The maximum number of results to include in the response. If more results exist than the specified
     * <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * <p>
     * The value for <code>MaxResults</code> must be between 20 and 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response includes only results beyond the token, up to the value specified by
     * <code>MaxResults</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The names of the parameter groups.
     * </p>
     * 
     * @return The names of the parameter groups.
     */

    public java.util.List<String> getParameterGroupNames() {
        return parameterGroupNames;
    }

    /**
     * <p>
     * The names of the parameter groups.
     * </p>
     * 
     * @param parameterGroupNames
     *        The names of the parameter groups.
     */

    public void setParameterGroupNames(java.util.Collection<String> parameterGroupNames) {
        if (parameterGroupNames == null) {
            this.parameterGroupNames = null;
            return;
        }

        this.parameterGroupNames = new java.util.ArrayList<String>(parameterGroupNames);
    }

    /**
     * <p>
     * The names of the parameter groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameterGroupNames(java.util.Collection)} or {@link #withParameterGroupNames(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param parameterGroupNames
     *        The names of the parameter groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeParameterGroupsRequest withParameterGroupNames(String... parameterGroupNames) {
        if (this.parameterGroupNames == null) {
            setParameterGroupNames(new java.util.ArrayList<String>(parameterGroupNames.length));
        }
        for (String ele : parameterGroupNames) {
            this.parameterGroupNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the parameter groups.
     * </p>
     * 
     * @param parameterGroupNames
     *        The names of the parameter groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeParameterGroupsRequest withParameterGroupNames(java.util.Collection<String> parameterGroupNames) {
        setParameterGroupNames(parameterGroupNames);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. If more results exist than the specified
     * <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * <p>
     * The value for <code>MaxResults</code> must be between 20 and 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to include in the response. If more results exist than the specified
     *        <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     *        retrieved.</p>
     *        <p>
     *        The value for <code>MaxResults</code> must be between 20 and 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. If more results exist than the specified
     * <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * <p>
     * The value for <code>MaxResults</code> must be between 20 and 100.
     * </p>
     * 
     * @return The maximum number of results to include in the response. If more results exist than the specified
     *         <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     *         retrieved.</p>
     *         <p>
     *         The value for <code>MaxResults</code> must be between 20 and 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. If more results exist than the specified
     * <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * <p>
     * The value for <code>MaxResults</code> must be between 20 and 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to include in the response. If more results exist than the specified
     *        <code>MaxResults</code> value, a token is included in the response so that the remaining results can be
     *        retrieved.</p>
     *        <p>
     *        The value for <code>MaxResults</code> must be between 20 and 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeParameterGroupsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response includes only results beyond the token, up to the value specified by
     * <code>MaxResults</code>.
     * </p>
     * 
     * @param nextToken
     *        An optional token returned from a prior request. Use this token for pagination of results from this
     *        action. If this parameter is specified, the response includes only results beyond the token, up to the
     *        value specified by <code>MaxResults</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response includes only results beyond the token, up to the value specified by
     * <code>MaxResults</code>.
     * </p>
     * 
     * @return An optional token returned from a prior request. Use this token for pagination of results from this
     *         action. If this parameter is specified, the response includes only results beyond the token, up to the
     *         value specified by <code>MaxResults</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response includes only results beyond the token, up to the value specified by
     * <code>MaxResults</code>.
     * </p>
     * 
     * @param nextToken
     *        An optional token returned from a prior request. Use this token for pagination of results from this
     *        action. If this parameter is specified, the response includes only results beyond the token, up to the
     *        value specified by <code>MaxResults</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeParameterGroupsRequest withNextToken(String nextToken) {
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
        if (getParameterGroupNames() != null)
            sb.append("ParameterGroupNames: ").append(getParameterGroupNames()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof DescribeParameterGroupsRequest == false)
            return false;
        DescribeParameterGroupsRequest other = (DescribeParameterGroupsRequest) obj;
        if (other.getParameterGroupNames() == null ^ this.getParameterGroupNames() == null)
            return false;
        if (other.getParameterGroupNames() != null && other.getParameterGroupNames().equals(this.getParameterGroupNames()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getParameterGroupNames() == null) ? 0 : getParameterGroupNames().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeParameterGroupsRequest clone() {
        return (DescribeParameterGroupsRequest) super.clone();
    }

}
