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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A complex type that contains information about that can be associated with your hosted zone.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListVPCAssociationAuthorizations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVPCAssociationAuthorizationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the hosted zone for which you want a list of VPCs that can be associated with the hosted zone.
     * </p>
     */
    private String hostedZoneId;
    /**
     * <p>
     * <i>Optional</i>: If a response includes a <code>NextToken</code> element, there are more VPCs that can be
     * associated with the specified hosted zone. To get the next page of results, submit another request, and include
     * the value of <code>NextToken</code> from the response in the <code>nexttoken</code> parameter in another
     * <code>ListVPCAssociationAuthorizations</code> request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * <i>Optional</i>: An integer that specifies the maximum number of VPCs that you want Amazon Route 53 to return. If
     * you don't specify a value for <code>MaxResults</code>, Route 53 returns up to 50 VPCs per page.
     * </p>
     */
    private String maxResults;

    /**
     * <p>
     * The ID of the hosted zone for which you want a list of VPCs that can be associated with the hosted zone.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone for which you want a list of VPCs that can be associated with the hosted zone.
     */

    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone for which you want a list of VPCs that can be associated with the hosted zone.
     * </p>
     * 
     * @return The ID of the hosted zone for which you want a list of VPCs that can be associated with the hosted zone.
     */

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone for which you want a list of VPCs that can be associated with the hosted zone.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone for which you want a list of VPCs that can be associated with the hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVPCAssociationAuthorizationsRequest withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * <p>
     * <i>Optional</i>: If a response includes a <code>NextToken</code> element, there are more VPCs that can be
     * associated with the specified hosted zone. To get the next page of results, submit another request, and include
     * the value of <code>NextToken</code> from the response in the <code>nexttoken</code> parameter in another
     * <code>ListVPCAssociationAuthorizations</code> request.
     * </p>
     * 
     * @param nextToken
     *        <i>Optional</i>: If a response includes a <code>NextToken</code> element, there are more VPCs that can be
     *        associated with the specified hosted zone. To get the next page of results, submit another request, and
     *        include the value of <code>NextToken</code> from the response in the <code>nexttoken</code> parameter in
     *        another <code>ListVPCAssociationAuthorizations</code> request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * <i>Optional</i>: If a response includes a <code>NextToken</code> element, there are more VPCs that can be
     * associated with the specified hosted zone. To get the next page of results, submit another request, and include
     * the value of <code>NextToken</code> from the response in the <code>nexttoken</code> parameter in another
     * <code>ListVPCAssociationAuthorizations</code> request.
     * </p>
     * 
     * @return <i>Optional</i>: If a response includes a <code>NextToken</code> element, there are more VPCs that can be
     *         associated with the specified hosted zone. To get the next page of results, submit another request, and
     *         include the value of <code>NextToken</code> from the response in the <code>nexttoken</code> parameter in
     *         another <code>ListVPCAssociationAuthorizations</code> request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * <i>Optional</i>: If a response includes a <code>NextToken</code> element, there are more VPCs that can be
     * associated with the specified hosted zone. To get the next page of results, submit another request, and include
     * the value of <code>NextToken</code> from the response in the <code>nexttoken</code> parameter in another
     * <code>ListVPCAssociationAuthorizations</code> request.
     * </p>
     * 
     * @param nextToken
     *        <i>Optional</i>: If a response includes a <code>NextToken</code> element, there are more VPCs that can be
     *        associated with the specified hosted zone. To get the next page of results, submit another request, and
     *        include the value of <code>NextToken</code> from the response in the <code>nexttoken</code> parameter in
     *        another <code>ListVPCAssociationAuthorizations</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVPCAssociationAuthorizationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * <i>Optional</i>: An integer that specifies the maximum number of VPCs that you want Amazon Route 53 to return. If
     * you don't specify a value for <code>MaxResults</code>, Route 53 returns up to 50 VPCs per page.
     * </p>
     * 
     * @param maxResults
     *        <i>Optional</i>: An integer that specifies the maximum number of VPCs that you want Amazon Route 53 to
     *        return. If you don't specify a value for <code>MaxResults</code>, Route 53 returns up to 50 VPCs per page.
     */

    public void setMaxResults(String maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * <i>Optional</i>: An integer that specifies the maximum number of VPCs that you want Amazon Route 53 to return. If
     * you don't specify a value for <code>MaxResults</code>, Route 53 returns up to 50 VPCs per page.
     * </p>
     * 
     * @return <i>Optional</i>: An integer that specifies the maximum number of VPCs that you want Amazon Route 53 to
     *         return. If you don't specify a value for <code>MaxResults</code>, Route 53 returns up to 50 VPCs per
     *         page.
     */

    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * <i>Optional</i>: An integer that specifies the maximum number of VPCs that you want Amazon Route 53 to return. If
     * you don't specify a value for <code>MaxResults</code>, Route 53 returns up to 50 VPCs per page.
     * </p>
     * 
     * @param maxResults
     *        <i>Optional</i>: An integer that specifies the maximum number of VPCs that you want Amazon Route 53 to
     *        return. If you don't specify a value for <code>MaxResults</code>, Route 53 returns up to 50 VPCs per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVPCAssociationAuthorizationsRequest withMaxResults(String maxResults) {
        setMaxResults(maxResults);
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
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: ").append(getHostedZoneId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVPCAssociationAuthorizationsRequest == false)
            return false;
        ListVPCAssociationAuthorizationsRequest other = (ListVPCAssociationAuthorizationsRequest) obj;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListVPCAssociationAuthorizationsRequest clone() {
        return (ListVPCAssociationAuthorizationsRequest) super.clone();
    }

}
