/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the request parameters to the <code>GetPackageVersionHistory</code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPackageVersionHistoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the package.
     * </p>
     */
    private String packageID;
    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If your initial <code>GetPackageVersionHistory</code> operation returns a <code>nextToken</code>, you can include
     * the returned <code>nextToken</code> in subsequent <code>GetPackageVersionHistory</code> operations, which returns
     * results in the next page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The unique identifier of the package.
     * </p>
     * 
     * @param packageID
     *        The unique identifier of the package.
     */

    public void setPackageID(String packageID) {
        this.packageID = packageID;
    }

    /**
     * <p>
     * The unique identifier of the package.
     * </p>
     * 
     * @return The unique identifier of the package.
     */

    public String getPackageID() {
        return this.packageID;
    }

    /**
     * <p>
     * The unique identifier of the package.
     * </p>
     * 
     * @param packageID
     *        The unique identifier of the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageVersionHistoryRequest withPackageID(String packageID) {
        setPackageID(packageID);
        return this;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results.
     * </p>
     * 
     * @param maxResults
     *        An optional parameter that specifies the maximum number of results to return. You can use
     *        <code>nextToken</code> to get the next page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results.
     * </p>
     * 
     * @return An optional parameter that specifies the maximum number of results to return. You can use
     *         <code>nextToken</code> to get the next page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results.
     * </p>
     * 
     * @param maxResults
     *        An optional parameter that specifies the maximum number of results to return. You can use
     *        <code>nextToken</code> to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageVersionHistoryRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If your initial <code>GetPackageVersionHistory</code> operation returns a <code>nextToken</code>, you can include
     * the returned <code>nextToken</code> in subsequent <code>GetPackageVersionHistory</code> operations, which returns
     * results in the next page.
     * </p>
     * 
     * @param nextToken
     *        If your initial <code>GetPackageVersionHistory</code> operation returns a <code>nextToken</code>, you can
     *        include the returned <code>nextToken</code> in subsequent <code>GetPackageVersionHistory</code>
     *        operations, which returns results in the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If your initial <code>GetPackageVersionHistory</code> operation returns a <code>nextToken</code>, you can include
     * the returned <code>nextToken</code> in subsequent <code>GetPackageVersionHistory</code> operations, which returns
     * results in the next page.
     * </p>
     * 
     * @return If your initial <code>GetPackageVersionHistory</code> operation returns a <code>nextToken</code>, you can
     *         include the returned <code>nextToken</code> in subsequent <code>GetPackageVersionHistory</code>
     *         operations, which returns results in the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If your initial <code>GetPackageVersionHistory</code> operation returns a <code>nextToken</code>, you can include
     * the returned <code>nextToken</code> in subsequent <code>GetPackageVersionHistory</code> operations, which returns
     * results in the next page.
     * </p>
     * 
     * @param nextToken
     *        If your initial <code>GetPackageVersionHistory</code> operation returns a <code>nextToken</code>, you can
     *        include the returned <code>nextToken</code> in subsequent <code>GetPackageVersionHistory</code>
     *        operations, which returns results in the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageVersionHistoryRequest withNextToken(String nextToken) {
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
        if (getPackageID() != null)
            sb.append("PackageID: ").append(getPackageID()).append(",");
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

        if (obj instanceof GetPackageVersionHistoryRequest == false)
            return false;
        GetPackageVersionHistoryRequest other = (GetPackageVersionHistoryRequest) obj;
        if (other.getPackageID() == null ^ this.getPackageID() == null)
            return false;
        if (other.getPackageID() != null && other.getPackageID().equals(this.getPackageID()) == false)
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

        hashCode = prime * hashCode + ((getPackageID() == null) ? 0 : getPackageID().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetPackageVersionHistoryRequest clone() {
        return (GetPackageVersionHistoryRequest) super.clone();
    }

}
