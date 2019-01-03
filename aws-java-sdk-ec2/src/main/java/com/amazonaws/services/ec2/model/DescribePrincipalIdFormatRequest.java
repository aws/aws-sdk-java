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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribePrincipalIdFormatRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePrincipalIdFormatRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribePrincipalIdFormatRequest> {

    /**
     * <p>
     * The type of resource: <code>bundle</code> | <code>conversion-task</code> | <code>customer-gateway</code> |
     * <code>dhcp-options</code> | <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code> |
     * <code>export-task</code> | <code>flow-log</code> | <code>image</code> | <code>import-task</code> |
     * <code>instance</code> | <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-acl-association</code> | <code>network-interface</code> | <code>network-interface-attachment</code>
     * | <code>prefix-list</code> | <code>reservation</code> | <code>route-table</code> |
     * <code>route-table-association</code> | <code>security-group</code> | <code>snapshot</code> | <code>subnet</code>
     * | <code>subnet-cidr-block-association</code> | <code>volume</code> | <code>vpc</code> |
     * <code>vpc-cidr-block-association</code> | <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resources;
    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned NextToken value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The type of resource: <code>bundle</code> | <code>conversion-task</code> | <code>customer-gateway</code> |
     * <code>dhcp-options</code> | <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code> |
     * <code>export-task</code> | <code>flow-log</code> | <code>image</code> | <code>import-task</code> |
     * <code>instance</code> | <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-acl-association</code> | <code>network-interface</code> | <code>network-interface-attachment</code>
     * | <code>prefix-list</code> | <code>reservation</code> | <code>route-table</code> |
     * <code>route-table-association</code> | <code>security-group</code> | <code>snapshot</code> | <code>subnet</code>
     * | <code>subnet-cidr-block-association</code> | <code>volume</code> | <code>vpc</code> |
     * <code>vpc-cidr-block-association</code> | <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>
     * </p>
     * 
     * @return The type of resource: <code>bundle</code> | <code>conversion-task</code> | <code>customer-gateway</code>
     *         | <code>dhcp-options</code> | <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code> |
     *         <code>export-task</code> | <code>flow-log</code> | <code>image</code> | <code>import-task</code> |
     *         <code>instance</code> | <code>internet-gateway</code> | <code>network-acl</code> |
     *         <code>network-acl-association</code> | <code>network-interface</code> |
     *         <code>network-interface-attachment</code> | <code>prefix-list</code> | <code>reservation</code> |
     *         <code>route-table</code> | <code>route-table-association</code> | <code>security-group</code> |
     *         <code>snapshot</code> | <code>subnet</code> | <code>subnet-cidr-block-association</code> |
     *         <code>volume</code> | <code>vpc</code> | <code>vpc-cidr-block-association</code> |
     *         <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> | <code>vpn-connection</code> |
     *         <code>vpn-gateway</code>
     */

    public java.util.List<String> getResources() {
        if (resources == null) {
            resources = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resources;
    }

    /**
     * <p>
     * The type of resource: <code>bundle</code> | <code>conversion-task</code> | <code>customer-gateway</code> |
     * <code>dhcp-options</code> | <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code> |
     * <code>export-task</code> | <code>flow-log</code> | <code>image</code> | <code>import-task</code> |
     * <code>instance</code> | <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-acl-association</code> | <code>network-interface</code> | <code>network-interface-attachment</code>
     * | <code>prefix-list</code> | <code>reservation</code> | <code>route-table</code> |
     * <code>route-table-association</code> | <code>security-group</code> | <code>snapshot</code> | <code>subnet</code>
     * | <code>subnet-cidr-block-association</code> | <code>volume</code> | <code>vpc</code> |
     * <code>vpc-cidr-block-association</code> | <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>
     * </p>
     * 
     * @param resources
     *        The type of resource: <code>bundle</code> | <code>conversion-task</code> | <code>customer-gateway</code> |
     *        <code>dhcp-options</code> | <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code> |
     *        <code>export-task</code> | <code>flow-log</code> | <code>image</code> | <code>import-task</code> |
     *        <code>instance</code> | <code>internet-gateway</code> | <code>network-acl</code> |
     *        <code>network-acl-association</code> | <code>network-interface</code> |
     *        <code>network-interface-attachment</code> | <code>prefix-list</code> | <code>reservation</code> |
     *        <code>route-table</code> | <code>route-table-association</code> | <code>security-group</code> |
     *        <code>snapshot</code> | <code>subnet</code> | <code>subnet-cidr-block-association</code> |
     *        <code>volume</code> | <code>vpc</code> | <code>vpc-cidr-block-association</code> |
     *        <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> | <code>vpn-connection</code> |
     *        <code>vpn-gateway</code>
     */

    public void setResources(java.util.Collection<String> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new com.amazonaws.internal.SdkInternalList<String>(resources);
    }

    /**
     * <p>
     * The type of resource: <code>bundle</code> | <code>conversion-task</code> | <code>customer-gateway</code> |
     * <code>dhcp-options</code> | <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code> |
     * <code>export-task</code> | <code>flow-log</code> | <code>image</code> | <code>import-task</code> |
     * <code>instance</code> | <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-acl-association</code> | <code>network-interface</code> | <code>network-interface-attachment</code>
     * | <code>prefix-list</code> | <code>reservation</code> | <code>route-table</code> |
     * <code>route-table-association</code> | <code>security-group</code> | <code>snapshot</code> | <code>subnet</code>
     * | <code>subnet-cidr-block-association</code> | <code>volume</code> | <code>vpc</code> |
     * <code>vpc-cidr-block-association</code> | <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        The type of resource: <code>bundle</code> | <code>conversion-task</code> | <code>customer-gateway</code> |
     *        <code>dhcp-options</code> | <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code> |
     *        <code>export-task</code> | <code>flow-log</code> | <code>image</code> | <code>import-task</code> |
     *        <code>instance</code> | <code>internet-gateway</code> | <code>network-acl</code> |
     *        <code>network-acl-association</code> | <code>network-interface</code> |
     *        <code>network-interface-attachment</code> | <code>prefix-list</code> | <code>reservation</code> |
     *        <code>route-table</code> | <code>route-table-association</code> | <code>security-group</code> |
     *        <code>snapshot</code> | <code>subnet</code> | <code>subnet-cidr-block-association</code> |
     *        <code>volume</code> | <code>vpc</code> | <code>vpc-cidr-block-association</code> |
     *        <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> | <code>vpn-connection</code> |
     *        <code>vpn-gateway</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePrincipalIdFormatRequest withResources(String... resources) {
        if (this.resources == null) {
            setResources(new com.amazonaws.internal.SdkInternalList<String>(resources.length));
        }
        for (String ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type of resource: <code>bundle</code> | <code>conversion-task</code> | <code>customer-gateway</code> |
     * <code>dhcp-options</code> | <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code> |
     * <code>export-task</code> | <code>flow-log</code> | <code>image</code> | <code>import-task</code> |
     * <code>instance</code> | <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-acl-association</code> | <code>network-interface</code> | <code>network-interface-attachment</code>
     * | <code>prefix-list</code> | <code>reservation</code> | <code>route-table</code> |
     * <code>route-table-association</code> | <code>security-group</code> | <code>snapshot</code> | <code>subnet</code>
     * | <code>subnet-cidr-block-association</code> | <code>volume</code> | <code>vpc</code> |
     * <code>vpc-cidr-block-association</code> | <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>
     * </p>
     * 
     * @param resources
     *        The type of resource: <code>bundle</code> | <code>conversion-task</code> | <code>customer-gateway</code> |
     *        <code>dhcp-options</code> | <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code> |
     *        <code>export-task</code> | <code>flow-log</code> | <code>image</code> | <code>import-task</code> |
     *        <code>instance</code> | <code>internet-gateway</code> | <code>network-acl</code> |
     *        <code>network-acl-association</code> | <code>network-interface</code> |
     *        <code>network-interface-attachment</code> | <code>prefix-list</code> | <code>reservation</code> |
     *        <code>route-table</code> | <code>route-table-association</code> | <code>security-group</code> |
     *        <code>snapshot</code> | <code>subnet</code> | <code>subnet-cidr-block-association</code> |
     *        <code>volume</code> | <code>vpc</code> | <code>vpc-cidr-block-association</code> |
     *        <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> | <code>vpn-connection</code> |
     *        <code>vpn-gateway</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePrincipalIdFormatRequest withResources(java.util.Collection<String> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned NextToken value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *        call with the returned NextToken value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned NextToken value.
     * </p>
     * 
     * @return The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *         call with the returned NextToken value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned NextToken value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *        call with the returned NextToken value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePrincipalIdFormatRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @return The token to request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to request the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePrincipalIdFormatRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribePrincipalIdFormatRequest> getDryRunRequest() {
        Request<DescribePrincipalIdFormatRequest> request = new DescribePrincipalIdFormatRequestMarshaller().marshall(this);
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
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
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

        if (obj instanceof DescribePrincipalIdFormatRequest == false)
            return false;
        DescribePrincipalIdFormatRequest other = (DescribePrincipalIdFormatRequest) obj;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
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

        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribePrincipalIdFormatRequest clone() {
        return (DescribePrincipalIdFormatRequest) super.clone();
    }
}
