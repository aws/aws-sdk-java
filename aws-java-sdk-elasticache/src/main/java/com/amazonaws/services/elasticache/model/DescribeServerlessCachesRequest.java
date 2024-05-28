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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeServerlessCaches"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeServerlessCachesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the serverless cache. If this parameter is specified, only information about that specific
     * serverless cache is returned. Default: NULL
     * </p>
     */
    private String serverlessCacheName;
    /**
     * <p>
     * The maximum number of records in the response. If more records exist than the specified max-records value, the
     * next token is included in the response so that remaining results can be retrieved. The default is 50.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * An optional marker returned from a prior request to support pagination of results from this operation. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * MaxResults.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identifier for the serverless cache. If this parameter is specified, only information about that specific
     * serverless cache is returned. Default: NULL
     * </p>
     * 
     * @param serverlessCacheName
     *        The identifier for the serverless cache. If this parameter is specified, only information about that
     *        specific serverless cache is returned. Default: NULL
     */

    public void setServerlessCacheName(String serverlessCacheName) {
        this.serverlessCacheName = serverlessCacheName;
    }

    /**
     * <p>
     * The identifier for the serverless cache. If this parameter is specified, only information about that specific
     * serverless cache is returned. Default: NULL
     * </p>
     * 
     * @return The identifier for the serverless cache. If this parameter is specified, only information about that
     *         specific serverless cache is returned. Default: NULL
     */

    public String getServerlessCacheName() {
        return this.serverlessCacheName;
    }

    /**
     * <p>
     * The identifier for the serverless cache. If this parameter is specified, only information about that specific
     * serverless cache is returned. Default: NULL
     * </p>
     * 
     * @param serverlessCacheName
     *        The identifier for the serverless cache. If this parameter is specified, only information about that
     *        specific serverless cache is returned. Default: NULL
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServerlessCachesRequest withServerlessCacheName(String serverlessCacheName) {
        setServerlessCacheName(serverlessCacheName);
        return this;
    }

    /**
     * <p>
     * The maximum number of records in the response. If more records exist than the specified max-records value, the
     * next token is included in the response so that remaining results can be retrieved. The default is 50.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of records in the response. If more records exist than the specified max-records value,
     *        the next token is included in the response so that remaining results can be retrieved. The default is 50.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of records in the response. If more records exist than the specified max-records value, the
     * next token is included in the response so that remaining results can be retrieved. The default is 50.
     * </p>
     * 
     * @return The maximum number of records in the response. If more records exist than the specified max-records
     *         value, the next token is included in the response so that remaining results can be retrieved. The default
     *         is 50.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of records in the response. If more records exist than the specified max-records value, the
     * next token is included in the response so that remaining results can be retrieved. The default is 50.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of records in the response. If more records exist than the specified max-records value,
     *        the next token is included in the response so that remaining results can be retrieved. The default is 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServerlessCachesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * An optional marker returned from a prior request to support pagination of results from this operation. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * MaxResults.
     * </p>
     * 
     * @param nextToken
     *        An optional marker returned from a prior request to support pagination of results from this operation. If
     *        this parameter is specified, the response includes only records beyond the marker, up to the value
     *        specified by MaxResults.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An optional marker returned from a prior request to support pagination of results from this operation. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * MaxResults.
     * </p>
     * 
     * @return An optional marker returned from a prior request to support pagination of results from this operation. If
     *         this parameter is specified, the response includes only records beyond the marker, up to the value
     *         specified by MaxResults.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An optional marker returned from a prior request to support pagination of results from this operation. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * MaxResults.
     * </p>
     * 
     * @param nextToken
     *        An optional marker returned from a prior request to support pagination of results from this operation. If
     *        this parameter is specified, the response includes only records beyond the marker, up to the value
     *        specified by MaxResults.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServerlessCachesRequest withNextToken(String nextToken) {
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
        if (getServerlessCacheName() != null)
            sb.append("ServerlessCacheName: ").append(getServerlessCacheName()).append(",");
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

        if (obj instanceof DescribeServerlessCachesRequest == false)
            return false;
        DescribeServerlessCachesRequest other = (DescribeServerlessCachesRequest) obj;
        if (other.getServerlessCacheName() == null ^ this.getServerlessCacheName() == null)
            return false;
        if (other.getServerlessCacheName() != null && other.getServerlessCacheName().equals(this.getServerlessCacheName()) == false)
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

        hashCode = prime * hashCode + ((getServerlessCacheName() == null) ? 0 : getServerlessCacheName().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeServerlessCachesRequest clone() {
        return (DescribeServerlessCachesRequest) super.clone();
    }

}
