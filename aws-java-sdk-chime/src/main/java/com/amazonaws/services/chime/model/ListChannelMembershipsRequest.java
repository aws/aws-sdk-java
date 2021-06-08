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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListChannelMemberships" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListChannelMembershipsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of channel memberships that you want returned.
     * </p>
     */
    private String channelArn;
    /**
     * <p>
     * The membership type of a user, <code>DEFAULT</code> or <code>HIDDEN</code>. Default members are always returned
     * as part of <code>ListChannelMemberships</code>. Hidden members are only returned if the type filter in
     * <code>ListChannelMemberships</code> equals <code>HIDDEN</code>. Otherwise hidden members are not returned.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The maximum number of channel memberships that you want returned.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token passed by previous API calls until all requested channel memberships are returned.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * </p>
     */
    private String chimeBearer;

    /**
     * <p>
     * The maximum number of channel memberships that you want returned.
     * </p>
     * 
     * @param channelArn
     *        The maximum number of channel memberships that you want returned.
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The maximum number of channel memberships that you want returned.
     * </p>
     * 
     * @return The maximum number of channel memberships that you want returned.
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * The maximum number of channel memberships that you want returned.
     * </p>
     * 
     * @param channelArn
     *        The maximum number of channel memberships that you want returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelMembershipsRequest withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * <p>
     * The membership type of a user, <code>DEFAULT</code> or <code>HIDDEN</code>. Default members are always returned
     * as part of <code>ListChannelMemberships</code>. Hidden members are only returned if the type filter in
     * <code>ListChannelMemberships</code> equals <code>HIDDEN</code>. Otherwise hidden members are not returned.
     * </p>
     * 
     * @param type
     *        The membership type of a user, <code>DEFAULT</code> or <code>HIDDEN</code>. Default members are always
     *        returned as part of <code>ListChannelMemberships</code>. Hidden members are only returned if the type
     *        filter in <code>ListChannelMemberships</code> equals <code>HIDDEN</code>. Otherwise hidden members are not
     *        returned.
     * @see ChannelMembershipType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The membership type of a user, <code>DEFAULT</code> or <code>HIDDEN</code>. Default members are always returned
     * as part of <code>ListChannelMemberships</code>. Hidden members are only returned if the type filter in
     * <code>ListChannelMemberships</code> equals <code>HIDDEN</code>. Otherwise hidden members are not returned.
     * </p>
     * 
     * @return The membership type of a user, <code>DEFAULT</code> or <code>HIDDEN</code>. Default members are always
     *         returned as part of <code>ListChannelMemberships</code>. Hidden members are only returned if the type
     *         filter in <code>ListChannelMemberships</code> equals <code>HIDDEN</code>. Otherwise hidden members are
     *         not returned.
     * @see ChannelMembershipType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The membership type of a user, <code>DEFAULT</code> or <code>HIDDEN</code>. Default members are always returned
     * as part of <code>ListChannelMemberships</code>. Hidden members are only returned if the type filter in
     * <code>ListChannelMemberships</code> equals <code>HIDDEN</code>. Otherwise hidden members are not returned.
     * </p>
     * 
     * @param type
     *        The membership type of a user, <code>DEFAULT</code> or <code>HIDDEN</code>. Default members are always
     *        returned as part of <code>ListChannelMemberships</code>. Hidden members are only returned if the type
     *        filter in <code>ListChannelMemberships</code> equals <code>HIDDEN</code>. Otherwise hidden members are not
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelMembershipType
     */

    public ListChannelMembershipsRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The membership type of a user, <code>DEFAULT</code> or <code>HIDDEN</code>. Default members are always returned
     * as part of <code>ListChannelMemberships</code>. Hidden members are only returned if the type filter in
     * <code>ListChannelMemberships</code> equals <code>HIDDEN</code>. Otherwise hidden members are not returned.
     * </p>
     * 
     * @param type
     *        The membership type of a user, <code>DEFAULT</code> or <code>HIDDEN</code>. Default members are always
     *        returned as part of <code>ListChannelMemberships</code>. Hidden members are only returned if the type
     *        filter in <code>ListChannelMemberships</code> equals <code>HIDDEN</code>. Otherwise hidden members are not
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChannelMembershipType
     */

    public ListChannelMembershipsRequest withType(ChannelMembershipType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of channel memberships that you want returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of channel memberships that you want returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of channel memberships that you want returned.
     * </p>
     * 
     * @return The maximum number of channel memberships that you want returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of channel memberships that you want returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of channel memberships that you want returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelMembershipsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested channel memberships are returned.
     * </p>
     * 
     * @param nextToken
     *        The token passed by previous API calls until all requested channel memberships are returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested channel memberships are returned.
     * </p>
     * 
     * @return The token passed by previous API calls until all requested channel memberships are returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token passed by previous API calls until all requested channel memberships are returned.
     * </p>
     * 
     * @param nextToken
     *        The token passed by previous API calls until all requested channel memberships are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelMembershipsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * </p>
     * 
     * @param chimeBearer
     *        The <code>AppInstanceUserArn</code> of the user that makes the API call.
     */

    public void setChimeBearer(String chimeBearer) {
        this.chimeBearer = chimeBearer;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * </p>
     * 
     * @return The <code>AppInstanceUserArn</code> of the user that makes the API call.
     */

    public String getChimeBearer() {
        return this.chimeBearer;
    }

    /**
     * <p>
     * The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * </p>
     * 
     * @param chimeBearer
     *        The <code>AppInstanceUserArn</code> of the user that makes the API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChannelMembershipsRequest withChimeBearer(String chimeBearer) {
        setChimeBearer(chimeBearer);
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
        if (getChannelArn() != null)
            sb.append("ChannelArn: ").append(getChannelArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getChimeBearer() != null)
            sb.append("ChimeBearer: ").append(getChimeBearer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListChannelMembershipsRequest == false)
            return false;
        ListChannelMembershipsRequest other = (ListChannelMembershipsRequest) obj;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getChimeBearer() == null ^ this.getChimeBearer() == null)
            return false;
        if (other.getChimeBearer() != null && other.getChimeBearer().equals(this.getChimeBearer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getChimeBearer() == null) ? 0 : getChimeBearer().hashCode());
        return hashCode;
    }

    @Override
    public ListChannelMembershipsRequest clone() {
        return (ListChannelMembershipsRequest) super.clone();
    }

}
