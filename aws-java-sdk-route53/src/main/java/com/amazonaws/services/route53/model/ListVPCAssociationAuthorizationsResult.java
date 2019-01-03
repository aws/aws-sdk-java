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

/**
 * <p>
 * A complex type that contains the response information for the request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListVPCAssociationAuthorizations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVPCAssociationAuthorizationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the hosted zone that you can associate the listed VPCs with.
     * </p>
     */
    private String hostedZoneId;
    /**
     * <p>
     * When the response includes a <code>NextToken</code> element, there are more VPCs that can be associated with the
     * specified hosted zone. To get the next page of VPCs, submit another <code>ListVPCAssociationAuthorizations</code>
     * request, and include the value of the <code>NextToken</code> element from the response in the
     * <code>nexttoken</code> request parameter.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of VPCs that are authorized to be associated with the specified hosted zone.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VPC> vPCs;

    /**
     * <p>
     * The ID of the hosted zone that you can associate the listed VPCs with.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone that you can associate the listed VPCs with.
     */

    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that you can associate the listed VPCs with.
     * </p>
     * 
     * @return The ID of the hosted zone that you can associate the listed VPCs with.
     */

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that you can associate the listed VPCs with.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone that you can associate the listed VPCs with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVPCAssociationAuthorizationsResult withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * <p>
     * When the response includes a <code>NextToken</code> element, there are more VPCs that can be associated with the
     * specified hosted zone. To get the next page of VPCs, submit another <code>ListVPCAssociationAuthorizations</code>
     * request, and include the value of the <code>NextToken</code> element from the response in the
     * <code>nexttoken</code> request parameter.
     * </p>
     * 
     * @param nextToken
     *        When the response includes a <code>NextToken</code> element, there are more VPCs that can be associated
     *        with the specified hosted zone. To get the next page of VPCs, submit another
     *        <code>ListVPCAssociationAuthorizations</code> request, and include the value of the <code>NextToken</code>
     *        element from the response in the <code>nexttoken</code> request parameter.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When the response includes a <code>NextToken</code> element, there are more VPCs that can be associated with the
     * specified hosted zone. To get the next page of VPCs, submit another <code>ListVPCAssociationAuthorizations</code>
     * request, and include the value of the <code>NextToken</code> element from the response in the
     * <code>nexttoken</code> request parameter.
     * </p>
     * 
     * @return When the response includes a <code>NextToken</code> element, there are more VPCs that can be associated
     *         with the specified hosted zone. To get the next page of VPCs, submit another
     *         <code>ListVPCAssociationAuthorizations</code> request, and include the value of the
     *         <code>NextToken</code> element from the response in the <code>nexttoken</code> request parameter.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When the response includes a <code>NextToken</code> element, there are more VPCs that can be associated with the
     * specified hosted zone. To get the next page of VPCs, submit another <code>ListVPCAssociationAuthorizations</code>
     * request, and include the value of the <code>NextToken</code> element from the response in the
     * <code>nexttoken</code> request parameter.
     * </p>
     * 
     * @param nextToken
     *        When the response includes a <code>NextToken</code> element, there are more VPCs that can be associated
     *        with the specified hosted zone. To get the next page of VPCs, submit another
     *        <code>ListVPCAssociationAuthorizations</code> request, and include the value of the <code>NextToken</code>
     *        element from the response in the <code>nexttoken</code> request parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVPCAssociationAuthorizationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of VPCs that are authorized to be associated with the specified hosted zone.
     * </p>
     * 
     * @return The list of VPCs that are authorized to be associated with the specified hosted zone.
     */

    public java.util.List<VPC> getVPCs() {
        if (vPCs == null) {
            vPCs = new com.amazonaws.internal.SdkInternalList<VPC>();
        }
        return vPCs;
    }

    /**
     * <p>
     * The list of VPCs that are authorized to be associated with the specified hosted zone.
     * </p>
     * 
     * @param vPCs
     *        The list of VPCs that are authorized to be associated with the specified hosted zone.
     */

    public void setVPCs(java.util.Collection<VPC> vPCs) {
        if (vPCs == null) {
            this.vPCs = null;
            return;
        }

        this.vPCs = new com.amazonaws.internal.SdkInternalList<VPC>(vPCs);
    }

    /**
     * <p>
     * The list of VPCs that are authorized to be associated with the specified hosted zone.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVPCs(java.util.Collection)} or {@link #withVPCs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param vPCs
     *        The list of VPCs that are authorized to be associated with the specified hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVPCAssociationAuthorizationsResult withVPCs(VPC... vPCs) {
        if (this.vPCs == null) {
            setVPCs(new com.amazonaws.internal.SdkInternalList<VPC>(vPCs.length));
        }
        for (VPC ele : vPCs) {
            this.vPCs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of VPCs that are authorized to be associated with the specified hosted zone.
     * </p>
     * 
     * @param vPCs
     *        The list of VPCs that are authorized to be associated with the specified hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVPCAssociationAuthorizationsResult withVPCs(java.util.Collection<VPC> vPCs) {
        setVPCs(vPCs);
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
        if (getVPCs() != null)
            sb.append("VPCs: ").append(getVPCs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVPCAssociationAuthorizationsResult == false)
            return false;
        ListVPCAssociationAuthorizationsResult other = (ListVPCAssociationAuthorizationsResult) obj;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getVPCs() == null ^ this.getVPCs() == null)
            return false;
        if (other.getVPCs() != null && other.getVPCs().equals(this.getVPCs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getVPCs() == null) ? 0 : getVPCs().hashCode());
        return hashCode;
    }

    @Override
    public ListVPCAssociationAuthorizationsResult clone() {
        try {
            return (ListVPCAssociationAuthorizationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
