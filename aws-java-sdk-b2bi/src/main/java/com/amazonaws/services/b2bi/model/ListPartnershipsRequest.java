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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/ListPartnerships" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPartnershipsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the unique, system-generated identifier for the profile connected to this partnership.
     * </p>
     */
    private String profileId;
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
     * Specifies the maximum number of capabilities to return.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Specifies the unique, system-generated identifier for the profile connected to this partnership.
     * </p>
     * 
     * @param profileId
     *        Specifies the unique, system-generated identifier for the profile connected to this partnership.
     */

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    /**
     * <p>
     * Specifies the unique, system-generated identifier for the profile connected to this partnership.
     * </p>
     * 
     * @return Specifies the unique, system-generated identifier for the profile connected to this partnership.
     */

    public String getProfileId() {
        return this.profileId;
    }

    /**
     * <p>
     * Specifies the unique, system-generated identifier for the profile connected to this partnership.
     * </p>
     * 
     * @param profileId
     *        Specifies the unique, system-generated identifier for the profile connected to this partnership.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPartnershipsRequest withProfileId(String profileId) {
        setProfileId(profileId);
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

    public ListPartnershipsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum number of capabilities to return.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of capabilities to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of capabilities to return.
     * </p>
     * 
     * @return Specifies the maximum number of capabilities to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of capabilities to return.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of capabilities to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPartnershipsRequest withMaxResults(Integer maxResults) {
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
        if (getProfileId() != null)
            sb.append("ProfileId: ").append(getProfileId()).append(",");
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

        if (obj instanceof ListPartnershipsRequest == false)
            return false;
        ListPartnershipsRequest other = (ListPartnershipsRequest) obj;
        if (other.getProfileId() == null ^ this.getProfileId() == null)
            return false;
        if (other.getProfileId() != null && other.getProfileId().equals(this.getProfileId()) == false)
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

        hashCode = prime * hashCode + ((getProfileId() == null) ? 0 : getProfileId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListPartnershipsRequest clone() {
        return (ListPartnershipsRequest) super.clone();
    }

}
