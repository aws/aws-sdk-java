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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetOrganizationConformancePackDetailedStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOrganizationConformancePackDetailedStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>OrganizationConformancePackDetailedStatus</code> objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OrganizationConformancePackDetailedStatus> organizationConformancePackDetailedStatuses;
    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>OrganizationConformancePackDetailedStatus</code> objects.
     * </p>
     * 
     * @return A list of <code>OrganizationConformancePackDetailedStatus</code> objects.
     */

    public java.util.List<OrganizationConformancePackDetailedStatus> getOrganizationConformancePackDetailedStatuses() {
        if (organizationConformancePackDetailedStatuses == null) {
            organizationConformancePackDetailedStatuses = new com.amazonaws.internal.SdkInternalList<OrganizationConformancePackDetailedStatus>();
        }
        return organizationConformancePackDetailedStatuses;
    }

    /**
     * <p>
     * A list of <code>OrganizationConformancePackDetailedStatus</code> objects.
     * </p>
     * 
     * @param organizationConformancePackDetailedStatuses
     *        A list of <code>OrganizationConformancePackDetailedStatus</code> objects.
     */

    public void setOrganizationConformancePackDetailedStatuses(
            java.util.Collection<OrganizationConformancePackDetailedStatus> organizationConformancePackDetailedStatuses) {
        if (organizationConformancePackDetailedStatuses == null) {
            this.organizationConformancePackDetailedStatuses = null;
            return;
        }

        this.organizationConformancePackDetailedStatuses = new com.amazonaws.internal.SdkInternalList<OrganizationConformancePackDetailedStatus>(
                organizationConformancePackDetailedStatuses);
    }

    /**
     * <p>
     * A list of <code>OrganizationConformancePackDetailedStatus</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrganizationConformancePackDetailedStatuses(java.util.Collection)} or
     * {@link #withOrganizationConformancePackDetailedStatuses(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param organizationConformancePackDetailedStatuses
     *        A list of <code>OrganizationConformancePackDetailedStatus</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOrganizationConformancePackDetailedStatusResult withOrganizationConformancePackDetailedStatuses(
            OrganizationConformancePackDetailedStatus... organizationConformancePackDetailedStatuses) {
        if (this.organizationConformancePackDetailedStatuses == null) {
            setOrganizationConformancePackDetailedStatuses(new com.amazonaws.internal.SdkInternalList<OrganizationConformancePackDetailedStatus>(
                    organizationConformancePackDetailedStatuses.length));
        }
        for (OrganizationConformancePackDetailedStatus ele : organizationConformancePackDetailedStatuses) {
            this.organizationConformancePackDetailedStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>OrganizationConformancePackDetailedStatus</code> objects.
     * </p>
     * 
     * @param organizationConformancePackDetailedStatuses
     *        A list of <code>OrganizationConformancePackDetailedStatus</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOrganizationConformancePackDetailedStatusResult withOrganizationConformancePackDetailedStatuses(
            java.util.Collection<OrganizationConformancePackDetailedStatus> organizationConformancePackDetailedStatuses) {
        setOrganizationConformancePackDetailedStatuses(organizationConformancePackDetailedStatuses);
        return this;
    }

    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     * 
     * @param nextToken
     *        The nextToken string returned on a previous page that you use to get the next page of results in a
     *        paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     * 
     * @return The nextToken string returned on a previous page that you use to get the next page of results in a
     *         paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     * 
     * @param nextToken
     *        The nextToken string returned on a previous page that you use to get the next page of results in a
     *        paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOrganizationConformancePackDetailedStatusResult withNextToken(String nextToken) {
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
        if (getOrganizationConformancePackDetailedStatuses() != null)
            sb.append("OrganizationConformancePackDetailedStatuses: ").append(getOrganizationConformancePackDetailedStatuses()).append(",");
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

        if (obj instanceof GetOrganizationConformancePackDetailedStatusResult == false)
            return false;
        GetOrganizationConformancePackDetailedStatusResult other = (GetOrganizationConformancePackDetailedStatusResult) obj;
        if (other.getOrganizationConformancePackDetailedStatuses() == null ^ this.getOrganizationConformancePackDetailedStatuses() == null)
            return false;
        if (other.getOrganizationConformancePackDetailedStatuses() != null
                && other.getOrganizationConformancePackDetailedStatuses().equals(this.getOrganizationConformancePackDetailedStatuses()) == false)
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

        hashCode = prime * hashCode
                + ((getOrganizationConformancePackDetailedStatuses() == null) ? 0 : getOrganizationConformancePackDetailedStatuses().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetOrganizationConformancePackDetailedStatusResult clone() {
        try {
            return (GetOrganizationConformancePackDetailedStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
