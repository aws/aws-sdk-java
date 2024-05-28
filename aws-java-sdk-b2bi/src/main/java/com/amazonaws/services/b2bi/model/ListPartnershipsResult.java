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
package com.amazonaws.services.b2bi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/ListPartnerships" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPartnershipsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies a list of your partnerships.
     * </p>
     */
    private java.util.List<PartnershipSummary> partnerships;
    /**
     * <p>
     * When additional results are obtained from the command, a <code>NextToken</code> parameter is returned in the
     * output. You can then pass the <code>NextToken</code> parameter in a subsequent command to continue listing
     * additional resources.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Specifies a list of your partnerships.
     * </p>
     * 
     * @return Specifies a list of your partnerships.
     */

    public java.util.List<PartnershipSummary> getPartnerships() {
        return partnerships;
    }

    /**
     * <p>
     * Specifies a list of your partnerships.
     * </p>
     * 
     * @param partnerships
     *        Specifies a list of your partnerships.
     */

    public void setPartnerships(java.util.Collection<PartnershipSummary> partnerships) {
        if (partnerships == null) {
            this.partnerships = null;
            return;
        }

        this.partnerships = new java.util.ArrayList<PartnershipSummary>(partnerships);
    }

    /**
     * <p>
     * Specifies a list of your partnerships.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartnerships(java.util.Collection)} or {@link #withPartnerships(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param partnerships
     *        Specifies a list of your partnerships.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPartnershipsResult withPartnerships(PartnershipSummary... partnerships) {
        if (this.partnerships == null) {
            setPartnerships(new java.util.ArrayList<PartnershipSummary>(partnerships.length));
        }
        for (PartnershipSummary ele : partnerships) {
            this.partnerships.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies a list of your partnerships.
     * </p>
     * 
     * @param partnerships
     *        Specifies a list of your partnerships.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPartnershipsResult withPartnerships(java.util.Collection<PartnershipSummary> partnerships) {
        setPartnerships(partnerships);
        return this;
    }

    /**
     * <p>
     * When additional results are obtained from the command, a <code>NextToken</code> parameter is returned in the
     * output. You can then pass the <code>NextToken</code> parameter in a subsequent command to continue listing
     * additional resources.
     * </p>
     * 
     * @param nextToken
     *        When additional results are obtained from the command, a <code>NextToken</code> parameter is returned in
     *        the output. You can then pass the <code>NextToken</code> parameter in a subsequent command to continue
     *        listing additional resources.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When additional results are obtained from the command, a <code>NextToken</code> parameter is returned in the
     * output. You can then pass the <code>NextToken</code> parameter in a subsequent command to continue listing
     * additional resources.
     * </p>
     * 
     * @return When additional results are obtained from the command, a <code>NextToken</code> parameter is returned in
     *         the output. You can then pass the <code>NextToken</code> parameter in a subsequent command to continue
     *         listing additional resources.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When additional results are obtained from the command, a <code>NextToken</code> parameter is returned in the
     * output. You can then pass the <code>NextToken</code> parameter in a subsequent command to continue listing
     * additional resources.
     * </p>
     * 
     * @param nextToken
     *        When additional results are obtained from the command, a <code>NextToken</code> parameter is returned in
     *        the output. You can then pass the <code>NextToken</code> parameter in a subsequent command to continue
     *        listing additional resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPartnershipsResult withNextToken(String nextToken) {
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
        if (getPartnerships() != null)
            sb.append("Partnerships: ").append(getPartnerships()).append(",");
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

        if (obj instanceof ListPartnershipsResult == false)
            return false;
        ListPartnershipsResult other = (ListPartnershipsResult) obj;
        if (other.getPartnerships() == null ^ this.getPartnerships() == null)
            return false;
        if (other.getPartnerships() != null && other.getPartnerships().equals(this.getPartnerships()) == false)
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

        hashCode = prime * hashCode + ((getPartnerships() == null) ? 0 : getPartnerships().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPartnershipsResult clone() {
        try {
            return (ListPartnershipsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
