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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/DescribeClusters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClustersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The names of the DAX clusters being described.
     * </p>
     */
    private java.util.List<String> clusterNames;
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
     * The names of the DAX clusters being described.
     * </p>
     * 
     * @return The names of the DAX clusters being described.
     */

    public java.util.List<String> getClusterNames() {
        return clusterNames;
    }

    /**
     * <p>
     * The names of the DAX clusters being described.
     * </p>
     * 
     * @param clusterNames
     *        The names of the DAX clusters being described.
     */

    public void setClusterNames(java.util.Collection<String> clusterNames) {
        if (clusterNames == null) {
            this.clusterNames = null;
            return;
        }

        this.clusterNames = new java.util.ArrayList<String>(clusterNames);
    }

    /**
     * <p>
     * The names of the DAX clusters being described.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusterNames(java.util.Collection)} or {@link #withClusterNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param clusterNames
     *        The names of the DAX clusters being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClustersRequest withClusterNames(String... clusterNames) {
        if (this.clusterNames == null) {
            setClusterNames(new java.util.ArrayList<String>(clusterNames.length));
        }
        for (String ele : clusterNames) {
            this.clusterNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the DAX clusters being described.
     * </p>
     * 
     * @param clusterNames
     *        The names of the DAX clusters being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeClustersRequest withClusterNames(java.util.Collection<String> clusterNames) {
        setClusterNames(clusterNames);
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

    public DescribeClustersRequest withMaxResults(Integer maxResults) {
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

    public DescribeClustersRequest withNextToken(String nextToken) {
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
        if (getClusterNames() != null)
            sb.append("ClusterNames: ").append(getClusterNames()).append(",");
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

        if (obj instanceof DescribeClustersRequest == false)
            return false;
        DescribeClustersRequest other = (DescribeClustersRequest) obj;
        if (other.getClusterNames() == null ^ this.getClusterNames() == null)
            return false;
        if (other.getClusterNames() != null && other.getClusterNames().equals(this.getClusterNames()) == false)
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

        hashCode = prime * hashCode + ((getClusterNames() == null) ? 0 : getClusterNames().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeClustersRequest clone() {
        return (DescribeClustersRequest) super.clone();
    }

}
