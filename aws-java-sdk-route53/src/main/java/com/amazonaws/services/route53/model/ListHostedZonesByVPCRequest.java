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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists all the private hosted zones that a specified VPC is associated with, regardless of which AWS account created
 * the hosted zones.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListHostedZonesByVPC" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHostedZonesByVPCRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon VPC that you want to list hosted zones for.
     * </p>
     */
    private String vPCId;
    /**
     * <p>
     * For the Amazon VPC that you specified for <code>VPCId</code>, the AWS Region that you created the VPC in.
     * </p>
     */
    private String vPCRegion;
    /**
     * <p>
     * (Optional) The maximum number of hosted zones that you want Amazon Route 53 to return. If the specified VPC is
     * associated with more than <code>MaxItems</code> hosted zones, the response includes a <code>NextToken</code>
     * element. <code>NextToken</code> contains an encrypted token that identifies the first hosted zone that Route 53
     * will return if you submit another request.
     * </p>
     */
    private String maxItems;
    /**
     * <p>
     * If the previous response included a <code>NextToken</code> element, the specified VPC is associated with more
     * hosted zones. To get more hosted zones, submit another <code>ListHostedZonesByVPC</code> request.
     * </p>
     * <p>
     * For the value of <code>NextToken</code>, specify the value of <code>NextToken</code> from the previous response.
     * </p>
     * <p>
     * If the previous response didn't include a <code>NextToken</code> element, there are no more hosted zones to get.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the Amazon VPC that you want to list hosted zones for.
     * </p>
     * 
     * @param vPCId
     *        The ID of the Amazon VPC that you want to list hosted zones for.
     */

    public void setVPCId(String vPCId) {
        this.vPCId = vPCId;
    }

    /**
     * <p>
     * The ID of the Amazon VPC that you want to list hosted zones for.
     * </p>
     * 
     * @return The ID of the Amazon VPC that you want to list hosted zones for.
     */

    public String getVPCId() {
        return this.vPCId;
    }

    /**
     * <p>
     * The ID of the Amazon VPC that you want to list hosted zones for.
     * </p>
     * 
     * @param vPCId
     *        The ID of the Amazon VPC that you want to list hosted zones for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostedZonesByVPCRequest withVPCId(String vPCId) {
        setVPCId(vPCId);
        return this;
    }

    /**
     * <p>
     * For the Amazon VPC that you specified for <code>VPCId</code>, the AWS Region that you created the VPC in.
     * </p>
     * 
     * @param vPCRegion
     *        For the Amazon VPC that you specified for <code>VPCId</code>, the AWS Region that you created the VPC in.
     * @see VPCRegion
     */

    public void setVPCRegion(String vPCRegion) {
        this.vPCRegion = vPCRegion;
    }

    /**
     * <p>
     * For the Amazon VPC that you specified for <code>VPCId</code>, the AWS Region that you created the VPC in.
     * </p>
     * 
     * @return For the Amazon VPC that you specified for <code>VPCId</code>, the AWS Region that you created the VPC in.
     * @see VPCRegion
     */

    public String getVPCRegion() {
        return this.vPCRegion;
    }

    /**
     * <p>
     * For the Amazon VPC that you specified for <code>VPCId</code>, the AWS Region that you created the VPC in.
     * </p>
     * 
     * @param vPCRegion
     *        For the Amazon VPC that you specified for <code>VPCId</code>, the AWS Region that you created the VPC in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VPCRegion
     */

    public ListHostedZonesByVPCRequest withVPCRegion(String vPCRegion) {
        setVPCRegion(vPCRegion);
        return this;
    }

    /**
     * <p>
     * For the Amazon VPC that you specified for <code>VPCId</code>, the AWS Region that you created the VPC in.
     * </p>
     * 
     * @param vPCRegion
     *        For the Amazon VPC that you specified for <code>VPCId</code>, the AWS Region that you created the VPC in.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VPCRegion
     */

    public ListHostedZonesByVPCRequest withVPCRegion(VPCRegion vPCRegion) {
        this.vPCRegion = vPCRegion.toString();
        return this;
    }

    /**
     * <p>
     * (Optional) The maximum number of hosted zones that you want Amazon Route 53 to return. If the specified VPC is
     * associated with more than <code>MaxItems</code> hosted zones, the response includes a <code>NextToken</code>
     * element. <code>NextToken</code> contains an encrypted token that identifies the first hosted zone that Route 53
     * will return if you submit another request.
     * </p>
     * 
     * @param maxItems
     *        (Optional) The maximum number of hosted zones that you want Amazon Route 53 to return. If the specified
     *        VPC is associated with more than <code>MaxItems</code> hosted zones, the response includes a
     *        <code>NextToken</code> element. <code>NextToken</code> contains an encrypted token that identifies the
     *        first hosted zone that Route 53 will return if you submit another request.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * (Optional) The maximum number of hosted zones that you want Amazon Route 53 to return. If the specified VPC is
     * associated with more than <code>MaxItems</code> hosted zones, the response includes a <code>NextToken</code>
     * element. <code>NextToken</code> contains an encrypted token that identifies the first hosted zone that Route 53
     * will return if you submit another request.
     * </p>
     * 
     * @return (Optional) The maximum number of hosted zones that you want Amazon Route 53 to return. If the specified
     *         VPC is associated with more than <code>MaxItems</code> hosted zones, the response includes a
     *         <code>NextToken</code> element. <code>NextToken</code> contains an encrypted token that identifies the
     *         first hosted zone that Route 53 will return if you submit another request.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * (Optional) The maximum number of hosted zones that you want Amazon Route 53 to return. If the specified VPC is
     * associated with more than <code>MaxItems</code> hosted zones, the response includes a <code>NextToken</code>
     * element. <code>NextToken</code> contains an encrypted token that identifies the first hosted zone that Route 53
     * will return if you submit another request.
     * </p>
     * 
     * @param maxItems
     *        (Optional) The maximum number of hosted zones that you want Amazon Route 53 to return. If the specified
     *        VPC is associated with more than <code>MaxItems</code> hosted zones, the response includes a
     *        <code>NextToken</code> element. <code>NextToken</code> contains an encrypted token that identifies the
     *        first hosted zone that Route 53 will return if you submit another request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostedZonesByVPCRequest withMaxItems(String maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * If the previous response included a <code>NextToken</code> element, the specified VPC is associated with more
     * hosted zones. To get more hosted zones, submit another <code>ListHostedZonesByVPC</code> request.
     * </p>
     * <p>
     * For the value of <code>NextToken</code>, specify the value of <code>NextToken</code> from the previous response.
     * </p>
     * <p>
     * If the previous response didn't include a <code>NextToken</code> element, there are no more hosted zones to get.
     * </p>
     * 
     * @param nextToken
     *        If the previous response included a <code>NextToken</code> element, the specified VPC is associated with
     *        more hosted zones. To get more hosted zones, submit another <code>ListHostedZonesByVPC</code> request.
     *        </p>
     *        <p>
     *        For the value of <code>NextToken</code>, specify the value of <code>NextToken</code> from the previous
     *        response.
     *        </p>
     *        <p>
     *        If the previous response didn't include a <code>NextToken</code> element, there are no more hosted zones
     *        to get.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response included a <code>NextToken</code> element, the specified VPC is associated with more
     * hosted zones. To get more hosted zones, submit another <code>ListHostedZonesByVPC</code> request.
     * </p>
     * <p>
     * For the value of <code>NextToken</code>, specify the value of <code>NextToken</code> from the previous response.
     * </p>
     * <p>
     * If the previous response didn't include a <code>NextToken</code> element, there are no more hosted zones to get.
     * </p>
     * 
     * @return If the previous response included a <code>NextToken</code> element, the specified VPC is associated with
     *         more hosted zones. To get more hosted zones, submit another <code>ListHostedZonesByVPC</code> request.
     *         </p>
     *         <p>
     *         For the value of <code>NextToken</code>, specify the value of <code>NextToken</code> from the previous
     *         response.
     *         </p>
     *         <p>
     *         If the previous response didn't include a <code>NextToken</code> element, there are no more hosted zones
     *         to get.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous response included a <code>NextToken</code> element, the specified VPC is associated with more
     * hosted zones. To get more hosted zones, submit another <code>ListHostedZonesByVPC</code> request.
     * </p>
     * <p>
     * For the value of <code>NextToken</code>, specify the value of <code>NextToken</code> from the previous response.
     * </p>
     * <p>
     * If the previous response didn't include a <code>NextToken</code> element, there are no more hosted zones to get.
     * </p>
     * 
     * @param nextToken
     *        If the previous response included a <code>NextToken</code> element, the specified VPC is associated with
     *        more hosted zones. To get more hosted zones, submit another <code>ListHostedZonesByVPC</code> request.
     *        </p>
     *        <p>
     *        For the value of <code>NextToken</code>, specify the value of <code>NextToken</code> from the previous
     *        response.
     *        </p>
     *        <p>
     *        If the previous response didn't include a <code>NextToken</code> element, there are no more hosted zones
     *        to get.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostedZonesByVPCRequest withNextToken(String nextToken) {
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
        if (getVPCId() != null)
            sb.append("VPCId: ").append(getVPCId()).append(",");
        if (getVPCRegion() != null)
            sb.append("VPCRegion: ").append(getVPCRegion()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems()).append(",");
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

        if (obj instanceof ListHostedZonesByVPCRequest == false)
            return false;
        ListHostedZonesByVPCRequest other = (ListHostedZonesByVPCRequest) obj;
        if (other.getVPCId() == null ^ this.getVPCId() == null)
            return false;
        if (other.getVPCId() != null && other.getVPCId().equals(this.getVPCId()) == false)
            return false;
        if (other.getVPCRegion() == null ^ this.getVPCRegion() == null)
            return false;
        if (other.getVPCRegion() != null && other.getVPCRegion().equals(this.getVPCRegion()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
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

        hashCode = prime * hashCode + ((getVPCId() == null) ? 0 : getVPCId().hashCode());
        hashCode = prime * hashCode + ((getVPCRegion() == null) ? 0 : getVPCRegion().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListHostedZonesByVPCRequest clone() {
        return (ListHostedZonesByVPCRequest) super.clone();
    }

}
