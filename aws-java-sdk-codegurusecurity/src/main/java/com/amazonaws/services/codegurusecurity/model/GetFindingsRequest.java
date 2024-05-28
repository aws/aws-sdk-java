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
package com.amazonaws.services.codegurusecurity.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/GetFindings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFindingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of results to return in the response. Use this parameter when paginating results. If
     * additional results exist beyond the number you specify, the <code>nextToken</code> element is returned in the
     * response. Use <code>nextToken</code> in a subsequent request to retrieve additional results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request. For subsequent calls, use the <code>nextToken</code> value returned from the previous
     * request to continue listing results after the first page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The name of the scan you want to retrieve findings from.
     * </p>
     */
    private String scanName;
    /**
     * <p>
     * The status of the findings you want to get. Pass either <code>Open</code>, <code>Closed</code>, or
     * <code>All</code>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The maximum number of results to return in the response. Use this parameter when paginating results. If
     * additional results exist beyond the number you specify, the <code>nextToken</code> element is returned in the
     * response. Use <code>nextToken</code> in a subsequent request to retrieve additional results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response. Use this parameter when paginating results. If
     *        additional results exist beyond the number you specify, the <code>nextToken</code> element is returned in
     *        the response. Use <code>nextToken</code> in a subsequent request to retrieve additional results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response. Use this parameter when paginating results. If
     * additional results exist beyond the number you specify, the <code>nextToken</code> element is returned in the
     * response. Use <code>nextToken</code> in a subsequent request to retrieve additional results.
     * </p>
     * 
     * @return The maximum number of results to return in the response. Use this parameter when paginating results. If
     *         additional results exist beyond the number you specify, the <code>nextToken</code> element is returned in
     *         the response. Use <code>nextToken</code> in a subsequent request to retrieve additional results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response. Use this parameter when paginating results. If
     * additional results exist beyond the number you specify, the <code>nextToken</code> element is returned in the
     * response. Use <code>nextToken</code> in a subsequent request to retrieve additional results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response. Use this parameter when paginating results. If
     *        additional results exist beyond the number you specify, the <code>nextToken</code> element is returned in
     *        the response. Use <code>nextToken</code> in a subsequent request to retrieve additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request. For subsequent calls, use the <code>nextToken</code> value returned from the previous
     * request to continue listing results after the first page.
     * </p>
     * 
     * @param nextToken
     *        A token to use for paginating results that are returned in the response. Set the value of this parameter
     *        to null for the first request. For subsequent calls, use the <code>nextToken</code> value returned from
     *        the previous request to continue listing results after the first page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request. For subsequent calls, use the <code>nextToken</code> value returned from the previous
     * request to continue listing results after the first page.
     * </p>
     * 
     * @return A token to use for paginating results that are returned in the response. Set the value of this parameter
     *         to null for the first request. For subsequent calls, use the <code>nextToken</code> value returned from
     *         the previous request to continue listing results after the first page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to use for paginating results that are returned in the response. Set the value of this parameter to null
     * for the first request. For subsequent calls, use the <code>nextToken</code> value returned from the previous
     * request to continue listing results after the first page.
     * </p>
     * 
     * @param nextToken
     *        A token to use for paginating results that are returned in the response. Set the value of this parameter
     *        to null for the first request. For subsequent calls, use the <code>nextToken</code> value returned from
     *        the previous request to continue listing results after the first page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The name of the scan you want to retrieve findings from.
     * </p>
     * 
     * @param scanName
     *        The name of the scan you want to retrieve findings from.
     */

    public void setScanName(String scanName) {
        this.scanName = scanName;
    }

    /**
     * <p>
     * The name of the scan you want to retrieve findings from.
     * </p>
     * 
     * @return The name of the scan you want to retrieve findings from.
     */

    public String getScanName() {
        return this.scanName;
    }

    /**
     * <p>
     * The name of the scan you want to retrieve findings from.
     * </p>
     * 
     * @param scanName
     *        The name of the scan you want to retrieve findings from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingsRequest withScanName(String scanName) {
        setScanName(scanName);
        return this;
    }

    /**
     * <p>
     * The status of the findings you want to get. Pass either <code>Open</code>, <code>Closed</code>, or
     * <code>All</code>.
     * </p>
     * 
     * @param status
     *        The status of the findings you want to get. Pass either <code>Open</code>, <code>Closed</code>, or
     *        <code>All</code>.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the findings you want to get. Pass either <code>Open</code>, <code>Closed</code>, or
     * <code>All</code>.
     * </p>
     * 
     * @return The status of the findings you want to get. Pass either <code>Open</code>, <code>Closed</code>, or
     *         <code>All</code>.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the findings you want to get. Pass either <code>Open</code>, <code>Closed</code>, or
     * <code>All</code>.
     * </p>
     * 
     * @param status
     *        The status of the findings you want to get. Pass either <code>Open</code>, <code>Closed</code>, or
     *        <code>All</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public GetFindingsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the findings you want to get. Pass either <code>Open</code>, <code>Closed</code>, or
     * <code>All</code>.
     * </p>
     * 
     * @param status
     *        The status of the findings you want to get. Pass either <code>Open</code>, <code>Closed</code>, or
     *        <code>All</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public GetFindingsRequest withStatus(Status status) {
        this.status = status.toString();
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getScanName() != null)
            sb.append("ScanName: ").append(getScanName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFindingsRequest == false)
            return false;
        GetFindingsRequest other = (GetFindingsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getScanName() == null ^ this.getScanName() == null)
            return false;
        if (other.getScanName() != null && other.getScanName().equals(this.getScanName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getScanName() == null) ? 0 : getScanName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetFindingsRequest clone() {
        return (GetFindingsRequest) super.clone();
    }

}
