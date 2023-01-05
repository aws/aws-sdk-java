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
import com.amazonaws.services.ec2.model.transform.GetIpamAddressHistoryRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIpamAddressHistoryRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<GetIpamAddressHistoryRequest> {

    /**
     * <p>
     * The CIDR you want the history of. The CIDR can be an IPv4 or IPv6 IP address range. If you enter a /16 IPv4 CIDR,
     * you will get records that match it exactly. You will not get records for any subnets within the /16 CIDR.
     * </p>
     */
    private String cidr;
    /**
     * <p>
     * The ID of the IPAM scope that the CIDR is in.
     * </p>
     */
    private String ipamScopeId;
    /**
     * <p>
     * The ID of the VPC you want your history records filtered by.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The start of the time period for which you are looking for history. If you omit this option, it will default to
     * the value of EndTime.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end of the time period for which you are looking for history. If you omit this option, it will default to the
     * current time.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The maximum number of historical results you would like returned per page. Defaults to 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The CIDR you want the history of. The CIDR can be an IPv4 or IPv6 IP address range. If you enter a /16 IPv4 CIDR,
     * you will get records that match it exactly. You will not get records for any subnets within the /16 CIDR.
     * </p>
     * 
     * @param cidr
     *        The CIDR you want the history of. The CIDR can be an IPv4 or IPv6 IP address range. If you enter a /16
     *        IPv4 CIDR, you will get records that match it exactly. You will not get records for any subnets within the
     *        /16 CIDR.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * The CIDR you want the history of. The CIDR can be an IPv4 or IPv6 IP address range. If you enter a /16 IPv4 CIDR,
     * you will get records that match it exactly. You will not get records for any subnets within the /16 CIDR.
     * </p>
     * 
     * @return The CIDR you want the history of. The CIDR can be an IPv4 or IPv6 IP address range. If you enter a /16
     *         IPv4 CIDR, you will get records that match it exactly. You will not get records for any subnets within
     *         the /16 CIDR.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * <p>
     * The CIDR you want the history of. The CIDR can be an IPv4 or IPv6 IP address range. If you enter a /16 IPv4 CIDR,
     * you will get records that match it exactly. You will not get records for any subnets within the /16 CIDR.
     * </p>
     * 
     * @param cidr
     *        The CIDR you want the history of. The CIDR can be an IPv4 or IPv6 IP address range. If you enter a /16
     *        IPv4 CIDR, you will get records that match it exactly. You will not get records for any subnets within the
     *        /16 CIDR.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamAddressHistoryRequest withCidr(String cidr) {
        setCidr(cidr);
        return this;
    }

    /**
     * <p>
     * The ID of the IPAM scope that the CIDR is in.
     * </p>
     * 
     * @param ipamScopeId
     *        The ID of the IPAM scope that the CIDR is in.
     */

    public void setIpamScopeId(String ipamScopeId) {
        this.ipamScopeId = ipamScopeId;
    }

    /**
     * <p>
     * The ID of the IPAM scope that the CIDR is in.
     * </p>
     * 
     * @return The ID of the IPAM scope that the CIDR is in.
     */

    public String getIpamScopeId() {
        return this.ipamScopeId;
    }

    /**
     * <p>
     * The ID of the IPAM scope that the CIDR is in.
     * </p>
     * 
     * @param ipamScopeId
     *        The ID of the IPAM scope that the CIDR is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamAddressHistoryRequest withIpamScopeId(String ipamScopeId) {
        setIpamScopeId(ipamScopeId);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC you want your history records filtered by.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC you want your history records filtered by.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC you want your history records filtered by.
     * </p>
     * 
     * @return The ID of the VPC you want your history records filtered by.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC you want your history records filtered by.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC you want your history records filtered by.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamAddressHistoryRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The start of the time period for which you are looking for history. If you omit this option, it will default to
     * the value of EndTime.
     * </p>
     * 
     * @param startTime
     *        The start of the time period for which you are looking for history. If you omit this option, it will
     *        default to the value of EndTime.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start of the time period for which you are looking for history. If you omit this option, it will default to
     * the value of EndTime.
     * </p>
     * 
     * @return The start of the time period for which you are looking for history. If you omit this option, it will
     *         default to the value of EndTime.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start of the time period for which you are looking for history. If you omit this option, it will default to
     * the value of EndTime.
     * </p>
     * 
     * @param startTime
     *        The start of the time period for which you are looking for history. If you omit this option, it will
     *        default to the value of EndTime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamAddressHistoryRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end of the time period for which you are looking for history. If you omit this option, it will default to the
     * current time.
     * </p>
     * 
     * @param endTime
     *        The end of the time period for which you are looking for history. If you omit this option, it will default
     *        to the current time.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time period for which you are looking for history. If you omit this option, it will default to the
     * current time.
     * </p>
     * 
     * @return The end of the time period for which you are looking for history. If you omit this option, it will
     *         default to the current time.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end of the time period for which you are looking for history. If you omit this option, it will default to the
     * current time.
     * </p>
     * 
     * @param endTime
     *        The end of the time period for which you are looking for history. If you omit this option, it will default
     *        to the current time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamAddressHistoryRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The maximum number of historical results you would like returned per page. Defaults to 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of historical results you would like returned per page. Defaults to 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of historical results you would like returned per page. Defaults to 100.
     * </p>
     * 
     * @return The maximum number of historical results you would like returned per page. Defaults to 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of historical results you would like returned per page. Defaults to 100.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of historical results you would like returned per page. Defaults to 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamAddressHistoryRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamAddressHistoryRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<GetIpamAddressHistoryRequest> getDryRunRequest() {
        Request<GetIpamAddressHistoryRequest> request = new GetIpamAddressHistoryRequestMarshaller().marshall(this);
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
        if (getCidr() != null)
            sb.append("Cidr: ").append(getCidr()).append(",");
        if (getIpamScopeId() != null)
            sb.append("IpamScopeId: ").append(getIpamScopeId()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
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

        if (obj instanceof GetIpamAddressHistoryRequest == false)
            return false;
        GetIpamAddressHistoryRequest other = (GetIpamAddressHistoryRequest) obj;
        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        if (other.getIpamScopeId() == null ^ this.getIpamScopeId() == null)
            return false;
        if (other.getIpamScopeId() != null && other.getIpamScopeId().equals(this.getIpamScopeId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
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

        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        hashCode = prime * hashCode + ((getIpamScopeId() == null) ? 0 : getIpamScopeId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetIpamAddressHistoryRequest clone() {
        return (GetIpamAddressHistoryRequest) super.clone();
    }
}
