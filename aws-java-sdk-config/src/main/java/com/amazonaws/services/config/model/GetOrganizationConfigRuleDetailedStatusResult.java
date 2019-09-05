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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetOrganizationConfigRuleDetailedStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOrganizationConfigRuleDetailedStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>MemberAccountStatus</code> objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MemberAccountStatus> organizationConfigRuleDetailedStatus;
    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>MemberAccountStatus</code> objects.
     * </p>
     * 
     * @return A list of <code>MemberAccountStatus</code> objects.
     */

    public java.util.List<MemberAccountStatus> getOrganizationConfigRuleDetailedStatus() {
        if (organizationConfigRuleDetailedStatus == null) {
            organizationConfigRuleDetailedStatus = new com.amazonaws.internal.SdkInternalList<MemberAccountStatus>();
        }
        return organizationConfigRuleDetailedStatus;
    }

    /**
     * <p>
     * A list of <code>MemberAccountStatus</code> objects.
     * </p>
     * 
     * @param organizationConfigRuleDetailedStatus
     *        A list of <code>MemberAccountStatus</code> objects.
     */

    public void setOrganizationConfigRuleDetailedStatus(java.util.Collection<MemberAccountStatus> organizationConfigRuleDetailedStatus) {
        if (organizationConfigRuleDetailedStatus == null) {
            this.organizationConfigRuleDetailedStatus = null;
            return;
        }

        this.organizationConfigRuleDetailedStatus = new com.amazonaws.internal.SdkInternalList<MemberAccountStatus>(organizationConfigRuleDetailedStatus);
    }

    /**
     * <p>
     * A list of <code>MemberAccountStatus</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrganizationConfigRuleDetailedStatus(java.util.Collection)} or
     * {@link #withOrganizationConfigRuleDetailedStatus(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param organizationConfigRuleDetailedStatus
     *        A list of <code>MemberAccountStatus</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOrganizationConfigRuleDetailedStatusResult withOrganizationConfigRuleDetailedStatus(MemberAccountStatus... organizationConfigRuleDetailedStatus) {
        if (this.organizationConfigRuleDetailedStatus == null) {
            setOrganizationConfigRuleDetailedStatus(new com.amazonaws.internal.SdkInternalList<MemberAccountStatus>(organizationConfigRuleDetailedStatus.length));
        }
        for (MemberAccountStatus ele : organizationConfigRuleDetailedStatus) {
            this.organizationConfigRuleDetailedStatus.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>MemberAccountStatus</code> objects.
     * </p>
     * 
     * @param organizationConfigRuleDetailedStatus
     *        A list of <code>MemberAccountStatus</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOrganizationConfigRuleDetailedStatusResult withOrganizationConfigRuleDetailedStatus(
            java.util.Collection<MemberAccountStatus> organizationConfigRuleDetailedStatus) {
        setOrganizationConfigRuleDetailedStatus(organizationConfigRuleDetailedStatus);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that you use to get the next page of results
     *        in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @return The <code>nextToken</code> string returned on a previous page that you use to get the next page of
     *         results in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that you use to get the next page of results
     *        in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOrganizationConfigRuleDetailedStatusResult withNextToken(String nextToken) {
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
        if (getOrganizationConfigRuleDetailedStatus() != null)
            sb.append("OrganizationConfigRuleDetailedStatus: ").append(getOrganizationConfigRuleDetailedStatus()).append(",");
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

        if (obj instanceof GetOrganizationConfigRuleDetailedStatusResult == false)
            return false;
        GetOrganizationConfigRuleDetailedStatusResult other = (GetOrganizationConfigRuleDetailedStatusResult) obj;
        if (other.getOrganizationConfigRuleDetailedStatus() == null ^ this.getOrganizationConfigRuleDetailedStatus() == null)
            return false;
        if (other.getOrganizationConfigRuleDetailedStatus() != null
                && other.getOrganizationConfigRuleDetailedStatus().equals(this.getOrganizationConfigRuleDetailedStatus()) == false)
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

        hashCode = prime * hashCode + ((getOrganizationConfigRuleDetailedStatus() == null) ? 0 : getOrganizationConfigRuleDetailedStatus().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetOrganizationConfigRuleDetailedStatusResult clone() {
        try {
            return (GetOrganizationConfigRuleDetailedStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
