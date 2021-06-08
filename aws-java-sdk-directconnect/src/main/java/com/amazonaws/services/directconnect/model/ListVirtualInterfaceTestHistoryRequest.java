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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/ListVirtualInterfaceTestHistory"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVirtualInterfaceTestHistoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the virtual interface failover test.
     * </p>
     */
    private String testId;
    /**
     * <p>
     * The ID of the virtual interface that was tested.
     * </p>
     */
    private String virtualInterfaceId;
    /**
     * <p>
     * The BGP peers that were placed in the DOWN state during the virtual interface failover test.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> bgpPeers;
    /**
     * <p>
     * The status of the virtual interface failover test.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * <p>
     * If <code>MaxResults</code> is given a value larger than 100, only 100 results are returned.
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
     * The ID of the virtual interface failover test.
     * </p>
     * 
     * @param testId
     *        The ID of the virtual interface failover test.
     */

    public void setTestId(String testId) {
        this.testId = testId;
    }

    /**
     * <p>
     * The ID of the virtual interface failover test.
     * </p>
     * 
     * @return The ID of the virtual interface failover test.
     */

    public String getTestId() {
        return this.testId;
    }

    /**
     * <p>
     * The ID of the virtual interface failover test.
     * </p>
     * 
     * @param testId
     *        The ID of the virtual interface failover test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualInterfaceTestHistoryRequest withTestId(String testId) {
        setTestId(testId);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual interface that was tested.
     * </p>
     * 
     * @param virtualInterfaceId
     *        The ID of the virtual interface that was tested.
     */

    public void setVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual interface that was tested.
     * </p>
     * 
     * @return The ID of the virtual interface that was tested.
     */

    public String getVirtualInterfaceId() {
        return this.virtualInterfaceId;
    }

    /**
     * <p>
     * The ID of the virtual interface that was tested.
     * </p>
     * 
     * @param virtualInterfaceId
     *        The ID of the virtual interface that was tested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualInterfaceTestHistoryRequest withVirtualInterfaceId(String virtualInterfaceId) {
        setVirtualInterfaceId(virtualInterfaceId);
        return this;
    }

    /**
     * <p>
     * The BGP peers that were placed in the DOWN state during the virtual interface failover test.
     * </p>
     * 
     * @return The BGP peers that were placed in the DOWN state during the virtual interface failover test.
     */

    public java.util.List<String> getBgpPeers() {
        if (bgpPeers == null) {
            bgpPeers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return bgpPeers;
    }

    /**
     * <p>
     * The BGP peers that were placed in the DOWN state during the virtual interface failover test.
     * </p>
     * 
     * @param bgpPeers
     *        The BGP peers that were placed in the DOWN state during the virtual interface failover test.
     */

    public void setBgpPeers(java.util.Collection<String> bgpPeers) {
        if (bgpPeers == null) {
            this.bgpPeers = null;
            return;
        }

        this.bgpPeers = new com.amazonaws.internal.SdkInternalList<String>(bgpPeers);
    }

    /**
     * <p>
     * The BGP peers that were placed in the DOWN state during the virtual interface failover test.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBgpPeers(java.util.Collection)} or {@link #withBgpPeers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param bgpPeers
     *        The BGP peers that were placed in the DOWN state during the virtual interface failover test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualInterfaceTestHistoryRequest withBgpPeers(String... bgpPeers) {
        if (this.bgpPeers == null) {
            setBgpPeers(new com.amazonaws.internal.SdkInternalList<String>(bgpPeers.length));
        }
        for (String ele : bgpPeers) {
            this.bgpPeers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The BGP peers that were placed in the DOWN state during the virtual interface failover test.
     * </p>
     * 
     * @param bgpPeers
     *        The BGP peers that were placed in the DOWN state during the virtual interface failover test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualInterfaceTestHistoryRequest withBgpPeers(java.util.Collection<String> bgpPeers) {
        setBgpPeers(bgpPeers);
        return this;
    }

    /**
     * <p>
     * The status of the virtual interface failover test.
     * </p>
     * 
     * @param status
     *        The status of the virtual interface failover test.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the virtual interface failover test.
     * </p>
     * 
     * @return The status of the virtual interface failover test.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the virtual interface failover test.
     * </p>
     * 
     * @param status
     *        The status of the virtual interface failover test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualInterfaceTestHistoryRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * <p>
     * If <code>MaxResults</code> is given a value larger than 100, only 100 results are returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.</p>
     *        <p>
     *        If <code>MaxResults</code> is given a value larger than 100, only 100 results are returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * <p>
     * If <code>MaxResults</code> is given a value larger than 100, only 100 results are returned.
     * </p>
     * 
     * @return The maximum number of results to return with a single call. To retrieve the remaining results, make
     *         another call with the returned <code>nextToken</code> value.</p>
     *         <p>
     *         If <code>MaxResults</code> is given a value larger than 100, only 100 results are returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * <p>
     * If <code>MaxResults</code> is given a value larger than 100, only 100 results are returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.</p>
     *        <p>
     *        If <code>MaxResults</code> is given a value larger than 100, only 100 results are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualInterfaceTestHistoryRequest withMaxResults(Integer maxResults) {
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

    public ListVirtualInterfaceTestHistoryRequest withNextToken(String nextToken) {
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
        if (getTestId() != null)
            sb.append("TestId: ").append(getTestId()).append(",");
        if (getVirtualInterfaceId() != null)
            sb.append("VirtualInterfaceId: ").append(getVirtualInterfaceId()).append(",");
        if (getBgpPeers() != null)
            sb.append("BgpPeers: ").append(getBgpPeers()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof ListVirtualInterfaceTestHistoryRequest == false)
            return false;
        ListVirtualInterfaceTestHistoryRequest other = (ListVirtualInterfaceTestHistoryRequest) obj;
        if (other.getTestId() == null ^ this.getTestId() == null)
            return false;
        if (other.getTestId() != null && other.getTestId().equals(this.getTestId()) == false)
            return false;
        if (other.getVirtualInterfaceId() == null ^ this.getVirtualInterfaceId() == null)
            return false;
        if (other.getVirtualInterfaceId() != null && other.getVirtualInterfaceId().equals(this.getVirtualInterfaceId()) == false)
            return false;
        if (other.getBgpPeers() == null ^ this.getBgpPeers() == null)
            return false;
        if (other.getBgpPeers() != null && other.getBgpPeers().equals(this.getBgpPeers()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getTestId() == null) ? 0 : getTestId().hashCode());
        hashCode = prime * hashCode + ((getVirtualInterfaceId() == null) ? 0 : getVirtualInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getBgpPeers() == null) ? 0 : getBgpPeers().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListVirtualInterfaceTestHistoryRequest clone() {
        return (ListVirtualInterfaceTestHistoryRequest) super.clone();
    }

}
