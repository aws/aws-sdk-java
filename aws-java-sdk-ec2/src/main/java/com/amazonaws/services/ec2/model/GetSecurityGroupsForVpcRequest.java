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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.GetSecurityGroupsForVpcRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSecurityGroupsForVpcRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<GetSecurityGroupsForVpcRequest> {

    /**
     * <p>
     * The VPC ID where the security group can be used.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The token returned from a previous paginated request. Pagination continues from the end of the items returned by
     * the previous request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to return for this request. To get the next page of items, make another request with
     * the token returned in the output. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination">Pagination</a>.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The filters. If using multiple filters, the results include security groups which match all filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>group-id</code>: The security group ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code>: The security group's description.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-name</code>: The security group name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code>: The security group owner ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>primary-vpc-id</code>: The VPC ID in which the security group was created.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;

    /**
     * <p>
     * The VPC ID where the security group can be used.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID where the security group can be used.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The VPC ID where the security group can be used.
     * </p>
     * 
     * @return The VPC ID where the security group can be used.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The VPC ID where the security group can be used.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID where the security group can be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSecurityGroupsForVpcRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The token returned from a previous paginated request. Pagination continues from the end of the items returned by
     * the previous request.
     * </p>
     * 
     * @param nextToken
     *        The token returned from a previous paginated request. Pagination continues from the end of the items
     *        returned by the previous request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned from a previous paginated request. Pagination continues from the end of the items returned by
     * the previous request.
     * </p>
     * 
     * @return The token returned from a previous paginated request. Pagination continues from the end of the items
     *         returned by the previous request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token returned from a previous paginated request. Pagination continues from the end of the items returned by
     * the previous request.
     * </p>
     * 
     * @param nextToken
     *        The token returned from a previous paginated request. Pagination continues from the end of the items
     *        returned by the previous request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSecurityGroupsForVpcRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. To get the next page of items, make another request with
     * the token returned in the output. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination">Pagination</a>.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this request. To get the next page of items, make another
     *        request with the token returned in the output. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination"
     *        >Pagination</a>.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. To get the next page of items, make another request with
     * the token returned in the output. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination">Pagination</a>.
     * </p>
     * 
     * @return The maximum number of items to return for this request. To get the next page of items, make another
     *         request with the token returned in the output. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination"
     *         >Pagination</a>.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. To get the next page of items, make another request with
     * the token returned in the output. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination">Pagination</a>.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this request. To get the next page of items, make another
     *        request with the token returned in the output. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination"
     *        >Pagination</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSecurityGroupsForVpcRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The filters. If using multiple filters, the results include security groups which match all filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>group-id</code>: The security group ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code>: The security group's description.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-name</code>: The security group name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code>: The security group owner ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>primary-vpc-id</code>: The VPC ID in which the security group was created.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The filters. If using multiple filters, the results include security groups which match all filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>group-id</code>: The security group ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>description</code>: The security group's description.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>group-name</code>: The security group name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>owner-id</code>: The security group owner ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>primary-vpc-id</code>: The VPC ID in which the security group was created.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * The filters. If using multiple filters, the results include security groups which match all filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>group-id</code>: The security group ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code>: The security group's description.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-name</code>: The security group name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code>: The security group owner ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>primary-vpc-id</code>: The VPC ID in which the security group was created.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters. If using multiple filters, the results include security groups which match all filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>group-id</code>: The security group ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>description</code>: The security group's description.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>group-name</code>: The security group name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code>: The security group owner ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>primary-vpc-id</code>: The VPC ID in which the security group was created.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * The filters. If using multiple filters, the results include security groups which match all filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>group-id</code>: The security group ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code>: The security group's description.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-name</code>: The security group name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code>: The security group owner ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>primary-vpc-id</code>: The VPC ID in which the security group was created.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The filters. If using multiple filters, the results include security groups which match all filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>group-id</code>: The security group ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>description</code>: The security group's description.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>group-name</code>: The security group name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code>: The security group owner ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>primary-vpc-id</code>: The VPC ID in which the security group was created.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSecurityGroupsForVpcRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filters. If using multiple filters, the results include security groups which match all filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>group-id</code>: The security group ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code>: The security group's description.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-name</code>: The security group name.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code>: The security group owner ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>primary-vpc-id</code>: The VPC ID in which the security group was created.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters. If using multiple filters, the results include security groups which match all filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>group-id</code>: The security group ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>description</code>: The security group's description.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>group-name</code>: The security group name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code>: The security group owner ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>primary-vpc-id</code>: The VPC ID in which the security group was created.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSecurityGroupsForVpcRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<GetSecurityGroupsForVpcRequest> getDryRunRequest() {
        Request<GetSecurityGroupsForVpcRequest> request = new GetSecurityGroupsForVpcRequestMarshaller().marshall(this);
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
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSecurityGroupsForVpcRequest == false)
            return false;
        GetSecurityGroupsForVpcRequest other = (GetSecurityGroupsForVpcRequest) obj;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public GetSecurityGroupsForVpcRequest clone() {
        return (GetSecurityGroupsForVpcRequest) super.clone();
    }
}
