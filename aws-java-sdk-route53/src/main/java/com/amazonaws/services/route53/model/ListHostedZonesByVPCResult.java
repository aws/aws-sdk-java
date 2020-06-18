/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListHostedZonesByVPC" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHostedZonesByVPCResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list that contains one <code>HostedZoneSummary</code> element for each hosted zone that the specified Amazon
     * VPC is associated with. Each <code>HostedZoneSummary</code> element contains the hosted zone name and ID, and
     * information about who owns the hosted zone.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<HostedZoneSummary> hostedZoneSummaries;
    /**
     * <p>
     * The value that you specified for <code>MaxItems</code> in the most recent <code>ListHostedZonesByVPC</code>
     * request.
     * </p>
     */
    private String maxItems;
    /**
     * <p>
     * The value that you specified for <code>NextToken</code> in the most recent <code>ListHostedZonesByVPC</code>
     * request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list that contains one <code>HostedZoneSummary</code> element for each hosted zone that the specified Amazon
     * VPC is associated with. Each <code>HostedZoneSummary</code> element contains the hosted zone name and ID, and
     * information about who owns the hosted zone.
     * </p>
     * 
     * @return A list that contains one <code>HostedZoneSummary</code> element for each hosted zone that the specified
     *         Amazon VPC is associated with. Each <code>HostedZoneSummary</code> element contains the hosted zone name
     *         and ID, and information about who owns the hosted zone.
     */

    public java.util.List<HostedZoneSummary> getHostedZoneSummaries() {
        if (hostedZoneSummaries == null) {
            hostedZoneSummaries = new com.amazonaws.internal.SdkInternalList<HostedZoneSummary>();
        }
        return hostedZoneSummaries;
    }

    /**
     * <p>
     * A list that contains one <code>HostedZoneSummary</code> element for each hosted zone that the specified Amazon
     * VPC is associated with. Each <code>HostedZoneSummary</code> element contains the hosted zone name and ID, and
     * information about who owns the hosted zone.
     * </p>
     * 
     * @param hostedZoneSummaries
     *        A list that contains one <code>HostedZoneSummary</code> element for each hosted zone that the specified
     *        Amazon VPC is associated with. Each <code>HostedZoneSummary</code> element contains the hosted zone name
     *        and ID, and information about who owns the hosted zone.
     */

    public void setHostedZoneSummaries(java.util.Collection<HostedZoneSummary> hostedZoneSummaries) {
        if (hostedZoneSummaries == null) {
            this.hostedZoneSummaries = null;
            return;
        }

        this.hostedZoneSummaries = new com.amazonaws.internal.SdkInternalList<HostedZoneSummary>(hostedZoneSummaries);
    }

    /**
     * <p>
     * A list that contains one <code>HostedZoneSummary</code> element for each hosted zone that the specified Amazon
     * VPC is associated with. Each <code>HostedZoneSummary</code> element contains the hosted zone name and ID, and
     * information about who owns the hosted zone.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHostedZoneSummaries(java.util.Collection)} or {@link #withHostedZoneSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param hostedZoneSummaries
     *        A list that contains one <code>HostedZoneSummary</code> element for each hosted zone that the specified
     *        Amazon VPC is associated with. Each <code>HostedZoneSummary</code> element contains the hosted zone name
     *        and ID, and information about who owns the hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostedZonesByVPCResult withHostedZoneSummaries(HostedZoneSummary... hostedZoneSummaries) {
        if (this.hostedZoneSummaries == null) {
            setHostedZoneSummaries(new com.amazonaws.internal.SdkInternalList<HostedZoneSummary>(hostedZoneSummaries.length));
        }
        for (HostedZoneSummary ele : hostedZoneSummaries) {
            this.hostedZoneSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains one <code>HostedZoneSummary</code> element for each hosted zone that the specified Amazon
     * VPC is associated with. Each <code>HostedZoneSummary</code> element contains the hosted zone name and ID, and
     * information about who owns the hosted zone.
     * </p>
     * 
     * @param hostedZoneSummaries
     *        A list that contains one <code>HostedZoneSummary</code> element for each hosted zone that the specified
     *        Amazon VPC is associated with. Each <code>HostedZoneSummary</code> element contains the hosted zone name
     *        and ID, and information about who owns the hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostedZonesByVPCResult withHostedZoneSummaries(java.util.Collection<HostedZoneSummary> hostedZoneSummaries) {
        setHostedZoneSummaries(hostedZoneSummaries);
        return this;
    }

    /**
     * <p>
     * The value that you specified for <code>MaxItems</code> in the most recent <code>ListHostedZonesByVPC</code>
     * request.
     * </p>
     * 
     * @param maxItems
     *        The value that you specified for <code>MaxItems</code> in the most recent
     *        <code>ListHostedZonesByVPC</code> request.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The value that you specified for <code>MaxItems</code> in the most recent <code>ListHostedZonesByVPC</code>
     * request.
     * </p>
     * 
     * @return The value that you specified for <code>MaxItems</code> in the most recent
     *         <code>ListHostedZonesByVPC</code> request.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The value that you specified for <code>MaxItems</code> in the most recent <code>ListHostedZonesByVPC</code>
     * request.
     * </p>
     * 
     * @param maxItems
     *        The value that you specified for <code>MaxItems</code> in the most recent
     *        <code>ListHostedZonesByVPC</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostedZonesByVPCResult withMaxItems(String maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * The value that you specified for <code>NextToken</code> in the most recent <code>ListHostedZonesByVPC</code>
     * request.
     * </p>
     * 
     * @param nextToken
     *        The value that you specified for <code>NextToken</code> in the most recent
     *        <code>ListHostedZonesByVPC</code> request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The value that you specified for <code>NextToken</code> in the most recent <code>ListHostedZonesByVPC</code>
     * request.
     * </p>
     * 
     * @return The value that you specified for <code>NextToken</code> in the most recent
     *         <code>ListHostedZonesByVPC</code> request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The value that you specified for <code>NextToken</code> in the most recent <code>ListHostedZonesByVPC</code>
     * request.
     * </p>
     * 
     * @param nextToken
     *        The value that you specified for <code>NextToken</code> in the most recent
     *        <code>ListHostedZonesByVPC</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostedZonesByVPCResult withNextToken(String nextToken) {
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
        if (getHostedZoneSummaries() != null)
            sb.append("HostedZoneSummaries: ").append(getHostedZoneSummaries()).append(",");
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

        if (obj instanceof ListHostedZonesByVPCResult == false)
            return false;
        ListHostedZonesByVPCResult other = (ListHostedZonesByVPCResult) obj;
        if (other.getHostedZoneSummaries() == null ^ this.getHostedZoneSummaries() == null)
            return false;
        if (other.getHostedZoneSummaries() != null && other.getHostedZoneSummaries().equals(this.getHostedZoneSummaries()) == false)
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

        hashCode = prime * hashCode + ((getHostedZoneSummaries() == null) ? 0 : getHostedZoneSummaries().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListHostedZonesByVPCResult clone() {
        try {
            return (ListHostedZonesByVPCResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
