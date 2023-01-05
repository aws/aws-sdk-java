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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTransitGatewayRouteTableAnnouncementsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Describes the transit gateway route table announcement.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TransitGatewayRouteTableAnnouncement> transitGatewayRouteTableAnnouncements;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Describes the transit gateway route table announcement.
     * </p>
     * 
     * @return Describes the transit gateway route table announcement.
     */

    public java.util.List<TransitGatewayRouteTableAnnouncement> getTransitGatewayRouteTableAnnouncements() {
        if (transitGatewayRouteTableAnnouncements == null) {
            transitGatewayRouteTableAnnouncements = new com.amazonaws.internal.SdkInternalList<TransitGatewayRouteTableAnnouncement>();
        }
        return transitGatewayRouteTableAnnouncements;
    }

    /**
     * <p>
     * Describes the transit gateway route table announcement.
     * </p>
     * 
     * @param transitGatewayRouteTableAnnouncements
     *        Describes the transit gateway route table announcement.
     */

    public void setTransitGatewayRouteTableAnnouncements(java.util.Collection<TransitGatewayRouteTableAnnouncement> transitGatewayRouteTableAnnouncements) {
        if (transitGatewayRouteTableAnnouncements == null) {
            this.transitGatewayRouteTableAnnouncements = null;
            return;
        }

        this.transitGatewayRouteTableAnnouncements = new com.amazonaws.internal.SdkInternalList<TransitGatewayRouteTableAnnouncement>(
                transitGatewayRouteTableAnnouncements);
    }

    /**
     * <p>
     * Describes the transit gateway route table announcement.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTransitGatewayRouteTableAnnouncements(java.util.Collection)} or
     * {@link #withTransitGatewayRouteTableAnnouncements(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param transitGatewayRouteTableAnnouncements
     *        Describes the transit gateway route table announcement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransitGatewayRouteTableAnnouncementsResult withTransitGatewayRouteTableAnnouncements(
            TransitGatewayRouteTableAnnouncement... transitGatewayRouteTableAnnouncements) {
        if (this.transitGatewayRouteTableAnnouncements == null) {
            setTransitGatewayRouteTableAnnouncements(new com.amazonaws.internal.SdkInternalList<TransitGatewayRouteTableAnnouncement>(
                    transitGatewayRouteTableAnnouncements.length));
        }
        for (TransitGatewayRouteTableAnnouncement ele : transitGatewayRouteTableAnnouncements) {
            this.transitGatewayRouteTableAnnouncements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the transit gateway route table announcement.
     * </p>
     * 
     * @param transitGatewayRouteTableAnnouncements
     *        Describes the transit gateway route table announcement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransitGatewayRouteTableAnnouncementsResult withTransitGatewayRouteTableAnnouncements(
            java.util.Collection<TransitGatewayRouteTableAnnouncement> transitGatewayRouteTableAnnouncements) {
        setTransitGatewayRouteTableAnnouncements(transitGatewayRouteTableAnnouncements);
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

    public DescribeTransitGatewayRouteTableAnnouncementsResult withNextToken(String nextToken) {
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
        if (getTransitGatewayRouteTableAnnouncements() != null)
            sb.append("TransitGatewayRouteTableAnnouncements: ").append(getTransitGatewayRouteTableAnnouncements()).append(",");
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

        if (obj instanceof DescribeTransitGatewayRouteTableAnnouncementsResult == false)
            return false;
        DescribeTransitGatewayRouteTableAnnouncementsResult other = (DescribeTransitGatewayRouteTableAnnouncementsResult) obj;
        if (other.getTransitGatewayRouteTableAnnouncements() == null ^ this.getTransitGatewayRouteTableAnnouncements() == null)
            return false;
        if (other.getTransitGatewayRouteTableAnnouncements() != null
                && other.getTransitGatewayRouteTableAnnouncements().equals(this.getTransitGatewayRouteTableAnnouncements()) == false)
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

        hashCode = prime * hashCode + ((getTransitGatewayRouteTableAnnouncements() == null) ? 0 : getTransitGatewayRouteTableAnnouncements().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTransitGatewayRouteTableAnnouncementsResult clone() {
        try {
            return (DescribeTransitGatewayRouteTableAnnouncementsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
