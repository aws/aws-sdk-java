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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListAgreements" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAgreementsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of agreements to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * When you can get additional results from the <code>ListAgreements</code> call, a <code>NextToken</code> parameter
     * is returned in the output. You can then pass in a subsequent command to the <code>NextToken</code> parameter to
     * continue listing additional agreements.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The identifier of the server for which you want a list of agreements.
     * </p>
     */
    private String serverId;

    /**
     * <p>
     * The maximum number of agreements to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of agreements to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of agreements to return.
     * </p>
     * 
     * @return The maximum number of agreements to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of agreements to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of agreements to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAgreementsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * When you can get additional results from the <code>ListAgreements</code> call, a <code>NextToken</code> parameter
     * is returned in the output. You can then pass in a subsequent command to the <code>NextToken</code> parameter to
     * continue listing additional agreements.
     * </p>
     * 
     * @param nextToken
     *        When you can get additional results from the <code>ListAgreements</code> call, a <code>NextToken</code>
     *        parameter is returned in the output. You can then pass in a subsequent command to the
     *        <code>NextToken</code> parameter to continue listing additional agreements.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When you can get additional results from the <code>ListAgreements</code> call, a <code>NextToken</code> parameter
     * is returned in the output. You can then pass in a subsequent command to the <code>NextToken</code> parameter to
     * continue listing additional agreements.
     * </p>
     * 
     * @return When you can get additional results from the <code>ListAgreements</code> call, a <code>NextToken</code>
     *         parameter is returned in the output. You can then pass in a subsequent command to the
     *         <code>NextToken</code> parameter to continue listing additional agreements.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When you can get additional results from the <code>ListAgreements</code> call, a <code>NextToken</code> parameter
     * is returned in the output. You can then pass in a subsequent command to the <code>NextToken</code> parameter to
     * continue listing additional agreements.
     * </p>
     * 
     * @param nextToken
     *        When you can get additional results from the <code>ListAgreements</code> call, a <code>NextToken</code>
     *        parameter is returned in the output. You can then pass in a subsequent command to the
     *        <code>NextToken</code> parameter to continue listing additional agreements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAgreementsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The identifier of the server for which you want a list of agreements.
     * </p>
     * 
     * @param serverId
     *        The identifier of the server for which you want a list of agreements.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * The identifier of the server for which you want a list of agreements.
     * </p>
     * 
     * @return The identifier of the server for which you want a list of agreements.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * The identifier of the server for which you want a list of agreements.
     * </p>
     * 
     * @param serverId
     *        The identifier of the server for which you want a list of agreements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAgreementsRequest withServerId(String serverId) {
        setServerId(serverId);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getServerId() != null)
            sb.append("ServerId: ").append(getServerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAgreementsRequest == false)
            return false;
        ListAgreementsRequest other = (ListAgreementsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        return hashCode;
    }

    @Override
    public ListAgreementsRequest clone() {
        return (ListAgreementsRequest) super.clone();
    }

}
