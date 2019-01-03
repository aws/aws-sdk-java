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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListMembers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMembersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies what member accounts the response includes based on their relationship status with the master account.
     * The default value is TRUE. If onlyAssociated is set to TRUE, the response includes member accounts whose
     * relationship status with the master is set to ENABLED or DISABLED. If onlyAssociated is set to FALSE, the
     * response includes all existing member accounts.
     * </p>
     */
    private Boolean onlyAssociated;
    /**
     * <p>
     * Indicates the maximum number of items that you want in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Paginates results. Set the value of this parameter to NULL on your first call to the ListMembers operation. For
     * subsequent calls to the operation, fill nextToken in the request with the value of NextToken from the previous
     * response to continue listing data.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Specifies what member accounts the response includes based on their relationship status with the master account.
     * The default value is TRUE. If onlyAssociated is set to TRUE, the response includes member accounts whose
     * relationship status with the master is set to ENABLED or DISABLED. If onlyAssociated is set to FALSE, the
     * response includes all existing member accounts.
     * </p>
     * 
     * @param onlyAssociated
     *        Specifies what member accounts the response includes based on their relationship status with the master
     *        account. The default value is TRUE. If onlyAssociated is set to TRUE, the response includes member
     *        accounts whose relationship status with the master is set to ENABLED or DISABLED. If onlyAssociated is set
     *        to FALSE, the response includes all existing member accounts.
     */

    public void setOnlyAssociated(Boolean onlyAssociated) {
        this.onlyAssociated = onlyAssociated;
    }

    /**
     * <p>
     * Specifies what member accounts the response includes based on their relationship status with the master account.
     * The default value is TRUE. If onlyAssociated is set to TRUE, the response includes member accounts whose
     * relationship status with the master is set to ENABLED or DISABLED. If onlyAssociated is set to FALSE, the
     * response includes all existing member accounts.
     * </p>
     * 
     * @return Specifies what member accounts the response includes based on their relationship status with the master
     *         account. The default value is TRUE. If onlyAssociated is set to TRUE, the response includes member
     *         accounts whose relationship status with the master is set to ENABLED or DISABLED. If onlyAssociated is
     *         set to FALSE, the response includes all existing member accounts.
     */

    public Boolean getOnlyAssociated() {
        return this.onlyAssociated;
    }

    /**
     * <p>
     * Specifies what member accounts the response includes based on their relationship status with the master account.
     * The default value is TRUE. If onlyAssociated is set to TRUE, the response includes member accounts whose
     * relationship status with the master is set to ENABLED or DISABLED. If onlyAssociated is set to FALSE, the
     * response includes all existing member accounts.
     * </p>
     * 
     * @param onlyAssociated
     *        Specifies what member accounts the response includes based on their relationship status with the master
     *        account. The default value is TRUE. If onlyAssociated is set to TRUE, the response includes member
     *        accounts whose relationship status with the master is set to ENABLED or DISABLED. If onlyAssociated is set
     *        to FALSE, the response includes all existing member accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMembersRequest withOnlyAssociated(Boolean onlyAssociated) {
        setOnlyAssociated(onlyAssociated);
        return this;
    }

    /**
     * <p>
     * Specifies what member accounts the response includes based on their relationship status with the master account.
     * The default value is TRUE. If onlyAssociated is set to TRUE, the response includes member accounts whose
     * relationship status with the master is set to ENABLED or DISABLED. If onlyAssociated is set to FALSE, the
     * response includes all existing member accounts.
     * </p>
     * 
     * @return Specifies what member accounts the response includes based on their relationship status with the master
     *         account. The default value is TRUE. If onlyAssociated is set to TRUE, the response includes member
     *         accounts whose relationship status with the master is set to ENABLED or DISABLED. If onlyAssociated is
     *         set to FALSE, the response includes all existing member accounts.
     */

    public Boolean isOnlyAssociated() {
        return this.onlyAssociated;
    }

    /**
     * <p>
     * Indicates the maximum number of items that you want in the response.
     * </p>
     * 
     * @param maxResults
     *        Indicates the maximum number of items that you want in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Indicates the maximum number of items that you want in the response.
     * </p>
     * 
     * @return Indicates the maximum number of items that you want in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Indicates the maximum number of items that you want in the response.
     * </p>
     * 
     * @param maxResults
     *        Indicates the maximum number of items that you want in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMembersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Paginates results. Set the value of this parameter to NULL on your first call to the ListMembers operation. For
     * subsequent calls to the operation, fill nextToken in the request with the value of NextToken from the previous
     * response to continue listing data.
     * </p>
     * 
     * @param nextToken
     *        Paginates results. Set the value of this parameter to NULL on your first call to the ListMembers
     *        operation. For subsequent calls to the operation, fill nextToken in the request with the value of
     *        NextToken from the previous response to continue listing data.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Paginates results. Set the value of this parameter to NULL on your first call to the ListMembers operation. For
     * subsequent calls to the operation, fill nextToken in the request with the value of NextToken from the previous
     * response to continue listing data.
     * </p>
     * 
     * @return Paginates results. Set the value of this parameter to NULL on your first call to the ListMembers
     *         operation. For subsequent calls to the operation, fill nextToken in the request with the value of
     *         NextToken from the previous response to continue listing data.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Paginates results. Set the value of this parameter to NULL on your first call to the ListMembers operation. For
     * subsequent calls to the operation, fill nextToken in the request with the value of NextToken from the previous
     * response to continue listing data.
     * </p>
     * 
     * @param nextToken
     *        Paginates results. Set the value of this parameter to NULL on your first call to the ListMembers
     *        operation. For subsequent calls to the operation, fill nextToken in the request with the value of
     *        NextToken from the previous response to continue listing data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMembersRequest withNextToken(String nextToken) {
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
        if (getOnlyAssociated() != null)
            sb.append("OnlyAssociated: ").append(getOnlyAssociated()).append(",");
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

        if (obj instanceof ListMembersRequest == false)
            return false;
        ListMembersRequest other = (ListMembersRequest) obj;
        if (other.getOnlyAssociated() == null ^ this.getOnlyAssociated() == null)
            return false;
        if (other.getOnlyAssociated() != null && other.getOnlyAssociated().equals(this.getOnlyAssociated()) == false)
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

        hashCode = prime * hashCode + ((getOnlyAssociated() == null) ? 0 : getOnlyAssociated().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMembersRequest clone() {
        return (ListMembersRequest) super.clone();
    }

}
