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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ListExports" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListExportsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the exported table.
     * </p>
     */
    private String tableArn;
    /**
     * <p>
     * Maximum number of results to return per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * An optional string that, if supplied, must be copied from the output of a previous call to
     * <code>ListExports</code>. When provided in this manner, the API fetches the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the exported table.
     * </p>
     * 
     * @param tableArn
     *        The Amazon Resource Name (ARN) associated with the exported table.
     */

    public void setTableArn(String tableArn) {
        this.tableArn = tableArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the exported table.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) associated with the exported table.
     */

    public String getTableArn() {
        return this.tableArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the exported table.
     * </p>
     * 
     * @param tableArn
     *        The Amazon Resource Name (ARN) associated with the exported table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExportsRequest withTableArn(String tableArn) {
        setTableArn(tableArn);
        return this;
    }

    /**
     * <p>
     * Maximum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to return per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of results to return per page.
     * </p>
     * 
     * @return Maximum number of results to return per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of results to return per page.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to return per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExportsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * An optional string that, if supplied, must be copied from the output of a previous call to
     * <code>ListExports</code>. When provided in this manner, the API fetches the next page of results.
     * </p>
     * 
     * @param nextToken
     *        An optional string that, if supplied, must be copied from the output of a previous call to
     *        <code>ListExports</code>. When provided in this manner, the API fetches the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An optional string that, if supplied, must be copied from the output of a previous call to
     * <code>ListExports</code>. When provided in this manner, the API fetches the next page of results.
     * </p>
     * 
     * @return An optional string that, if supplied, must be copied from the output of a previous call to
     *         <code>ListExports</code>. When provided in this manner, the API fetches the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An optional string that, if supplied, must be copied from the output of a previous call to
     * <code>ListExports</code>. When provided in this manner, the API fetches the next page of results.
     * </p>
     * 
     * @param nextToken
     *        An optional string that, if supplied, must be copied from the output of a previous call to
     *        <code>ListExports</code>. When provided in this manner, the API fetches the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListExportsRequest withNextToken(String nextToken) {
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
        if (getTableArn() != null)
            sb.append("TableArn: ").append(getTableArn()).append(",");
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

        if (obj instanceof ListExportsRequest == false)
            return false;
        ListExportsRequest other = (ListExportsRequest) obj;
        if (other.getTableArn() == null ^ this.getTableArn() == null)
            return false;
        if (other.getTableArn() != null && other.getTableArn().equals(this.getTableArn()) == false)
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

        hashCode = prime * hashCode + ((getTableArn() == null) ? 0 : getTableArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListExportsRequest clone() {
        return (ListExportsRequest) super.clone();
    }

}
