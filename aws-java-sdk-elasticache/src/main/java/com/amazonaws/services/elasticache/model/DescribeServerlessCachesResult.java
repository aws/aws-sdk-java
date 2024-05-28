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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeServerlessCaches"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeServerlessCachesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * The serverless caches associated with a given description request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ServerlessCache> serverlessCaches;

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

    public DescribeServerlessCachesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The serverless caches associated with a given description request.
     * </p>
     * 
     * @return The serverless caches associated with a given description request.
     */

    public java.util.List<ServerlessCache> getServerlessCaches() {
        if (serverlessCaches == null) {
            serverlessCaches = new com.amazonaws.internal.SdkInternalList<ServerlessCache>();
        }
        return serverlessCaches;
    }

    /**
     * <p>
     * The serverless caches associated with a given description request.
     * </p>
     * 
     * @param serverlessCaches
     *        The serverless caches associated with a given description request.
     */

    public void setServerlessCaches(java.util.Collection<ServerlessCache> serverlessCaches) {
        if (serverlessCaches == null) {
            this.serverlessCaches = null;
            return;
        }

        this.serverlessCaches = new com.amazonaws.internal.SdkInternalList<ServerlessCache>(serverlessCaches);
    }

    /**
     * <p>
     * The serverless caches associated with a given description request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServerlessCaches(java.util.Collection)} or {@link #withServerlessCaches(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param serverlessCaches
     *        The serverless caches associated with a given description request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServerlessCachesResult withServerlessCaches(ServerlessCache... serverlessCaches) {
        if (this.serverlessCaches == null) {
            setServerlessCaches(new com.amazonaws.internal.SdkInternalList<ServerlessCache>(serverlessCaches.length));
        }
        for (ServerlessCache ele : serverlessCaches) {
            this.serverlessCaches.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The serverless caches associated with a given description request.
     * </p>
     * 
     * @param serverlessCaches
     *        The serverless caches associated with a given description request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServerlessCachesResult withServerlessCaches(java.util.Collection<ServerlessCache> serverlessCaches) {
        setServerlessCaches(serverlessCaches);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getServerlessCaches() != null)
            sb.append("ServerlessCaches: ").append(getServerlessCaches());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeServerlessCachesResult == false)
            return false;
        DescribeServerlessCachesResult other = (DescribeServerlessCachesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getServerlessCaches() == null ^ this.getServerlessCaches() == null)
            return false;
        if (other.getServerlessCaches() != null && other.getServerlessCaches().equals(this.getServerlessCaches()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getServerlessCaches() == null) ? 0 : getServerlessCaches().hashCode());
        return hashCode;
    }

    @Override
    public DescribeServerlessCachesResult clone() {
        try {
            return (DescribeServerlessCachesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
