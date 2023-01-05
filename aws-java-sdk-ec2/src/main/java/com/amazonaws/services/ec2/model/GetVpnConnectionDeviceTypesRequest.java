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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.GetVpnConnectionDeviceTypesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetVpnConnectionDeviceTypesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<GetVpnConnectionDeviceTypesRequest> {

    /**
     * <p>
     * The maximum number of results returned by <code>GetVpnConnectionDeviceTypes</code> in paginated output. When this
     * parameter is used, <code>GetVpnConnectionDeviceTypes</code> only returns <code>MaxResults</code> results in a
     * single page along with a <code>NextToken</code> response element. The remaining results of the initial request
     * can be seen by sending another <code>GetVpnConnectionDeviceTypes</code> request with the returned
     * <code>NextToken</code> value. This value can be between 200 and 1000. If this parameter is not used, then
     * <code>GetVpnConnectionDeviceTypes</code> returns all results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated <code>GetVpnConnectionDeviceTypes</code>
     * request where <code>MaxResults</code> was used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the <code>NextToken</code> value. This value is null
     * when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results returned by <code>GetVpnConnectionDeviceTypes</code> in paginated output. When this
     * parameter is used, <code>GetVpnConnectionDeviceTypes</code> only returns <code>MaxResults</code> results in a
     * single page along with a <code>NextToken</code> response element. The remaining results of the initial request
     * can be seen by sending another <code>GetVpnConnectionDeviceTypes</code> request with the returned
     * <code>NextToken</code> value. This value can be between 200 and 1000. If this parameter is not used, then
     * <code>GetVpnConnectionDeviceTypes</code> returns all results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results returned by <code>GetVpnConnectionDeviceTypes</code> in paginated output.
     *        When this parameter is used, <code>GetVpnConnectionDeviceTypes</code> only returns <code>MaxResults</code>
     *        results in a single page along with a <code>NextToken</code> response element. The remaining results of
     *        the initial request can be seen by sending another <code>GetVpnConnectionDeviceTypes</code> request with
     *        the returned <code>NextToken</code> value. This value can be between 200 and 1000. If this parameter is
     *        not used, then <code>GetVpnConnectionDeviceTypes</code> returns all results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned by <code>GetVpnConnectionDeviceTypes</code> in paginated output. When this
     * parameter is used, <code>GetVpnConnectionDeviceTypes</code> only returns <code>MaxResults</code> results in a
     * single page along with a <code>NextToken</code> response element. The remaining results of the initial request
     * can be seen by sending another <code>GetVpnConnectionDeviceTypes</code> request with the returned
     * <code>NextToken</code> value. This value can be between 200 and 1000. If this parameter is not used, then
     * <code>GetVpnConnectionDeviceTypes</code> returns all results.
     * </p>
     * 
     * @return The maximum number of results returned by <code>GetVpnConnectionDeviceTypes</code> in paginated output.
     *         When this parameter is used, <code>GetVpnConnectionDeviceTypes</code> only returns
     *         <code>MaxResults</code> results in a single page along with a <code>NextToken</code> response element.
     *         The remaining results of the initial request can be seen by sending another
     *         <code>GetVpnConnectionDeviceTypes</code> request with the returned <code>NextToken</code> value. This
     *         value can be between 200 and 1000. If this parameter is not used, then
     *         <code>GetVpnConnectionDeviceTypes</code> returns all results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned by <code>GetVpnConnectionDeviceTypes</code> in paginated output. When this
     * parameter is used, <code>GetVpnConnectionDeviceTypes</code> only returns <code>MaxResults</code> results in a
     * single page along with a <code>NextToken</code> response element. The remaining results of the initial request
     * can be seen by sending another <code>GetVpnConnectionDeviceTypes</code> request with the returned
     * <code>NextToken</code> value. This value can be between 200 and 1000. If this parameter is not used, then
     * <code>GetVpnConnectionDeviceTypes</code> returns all results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results returned by <code>GetVpnConnectionDeviceTypes</code> in paginated output.
     *        When this parameter is used, <code>GetVpnConnectionDeviceTypes</code> only returns <code>MaxResults</code>
     *        results in a single page along with a <code>NextToken</code> response element. The remaining results of
     *        the initial request can be seen by sending another <code>GetVpnConnectionDeviceTypes</code> request with
     *        the returned <code>NextToken</code> value. This value can be between 200 and 1000. If this parameter is
     *        not used, then <code>GetVpnConnectionDeviceTypes</code> returns all results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVpnConnectionDeviceTypesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated <code>GetVpnConnectionDeviceTypes</code>
     * request where <code>MaxResults</code> was used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the <code>NextToken</code> value. This value is null
     * when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value returned from a previous paginated
     *        <code>GetVpnConnectionDeviceTypes</code> request where <code>MaxResults</code> was used and the results
     *        exceeded the value of that parameter. Pagination continues from the end of the previous results that
     *        returned the <code>NextToken</code> value. This value is null when there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated <code>GetVpnConnectionDeviceTypes</code>
     * request where <code>MaxResults</code> was used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the <code>NextToken</code> value. This value is null
     * when there are no more results to return.
     * </p>
     * 
     * @return The <code>NextToken</code> value returned from a previous paginated
     *         <code>GetVpnConnectionDeviceTypes</code> request where <code>MaxResults</code> was used and the results
     *         exceeded the value of that parameter. Pagination continues from the end of the previous results that
     *         returned the <code>NextToken</code> value. This value is null when there are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated <code>GetVpnConnectionDeviceTypes</code>
     * request where <code>MaxResults</code> was used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the <code>NextToken</code> value. This value is null
     * when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value returned from a previous paginated
     *        <code>GetVpnConnectionDeviceTypes</code> request where <code>MaxResults</code> was used and the results
     *        exceeded the value of that parameter. Pagination continues from the end of the previous results that
     *        returned the <code>NextToken</code> value. This value is null when there are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVpnConnectionDeviceTypesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<GetVpnConnectionDeviceTypesRequest> getDryRunRequest() {
        Request<GetVpnConnectionDeviceTypesRequest> request = new GetVpnConnectionDeviceTypesRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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

        if (obj instanceof GetVpnConnectionDeviceTypesRequest == false)
            return false;
        GetVpnConnectionDeviceTypesRequest other = (GetVpnConnectionDeviceTypesRequest) obj;
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

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetVpnConnectionDeviceTypesRequest clone() {
        return (GetVpnConnectionDeviceTypesRequest) super.clone();
    }
}
