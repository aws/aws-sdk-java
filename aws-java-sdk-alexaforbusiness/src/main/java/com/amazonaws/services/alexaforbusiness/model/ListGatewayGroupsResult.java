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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListGatewayGroups" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGatewayGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The gateway groups in the list.
     * </p>
     */
    private java.util.List<GatewayGroupSummary> gatewayGroups;
    /**
     * <p>
     * The token used to paginate though multiple pages of gateway group summaries.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The gateway groups in the list.
     * </p>
     * 
     * @return The gateway groups in the list.
     */

    public java.util.List<GatewayGroupSummary> getGatewayGroups() {
        return gatewayGroups;
    }

    /**
     * <p>
     * The gateway groups in the list.
     * </p>
     * 
     * @param gatewayGroups
     *        The gateway groups in the list.
     */

    public void setGatewayGroups(java.util.Collection<GatewayGroupSummary> gatewayGroups) {
        if (gatewayGroups == null) {
            this.gatewayGroups = null;
            return;
        }

        this.gatewayGroups = new java.util.ArrayList<GatewayGroupSummary>(gatewayGroups);
    }

    /**
     * <p>
     * The gateway groups in the list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGatewayGroups(java.util.Collection)} or {@link #withGatewayGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param gatewayGroups
     *        The gateway groups in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGatewayGroupsResult withGatewayGroups(GatewayGroupSummary... gatewayGroups) {
        if (this.gatewayGroups == null) {
            setGatewayGroups(new java.util.ArrayList<GatewayGroupSummary>(gatewayGroups.length));
        }
        for (GatewayGroupSummary ele : gatewayGroups) {
            this.gatewayGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The gateway groups in the list.
     * </p>
     * 
     * @param gatewayGroups
     *        The gateway groups in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGatewayGroupsResult withGatewayGroups(java.util.Collection<GatewayGroupSummary> gatewayGroups) {
        setGatewayGroups(gatewayGroups);
        return this;
    }

    /**
     * <p>
     * The token used to paginate though multiple pages of gateway group summaries.
     * </p>
     * 
     * @param nextToken
     *        The token used to paginate though multiple pages of gateway group summaries.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used to paginate though multiple pages of gateway group summaries.
     * </p>
     * 
     * @return The token used to paginate though multiple pages of gateway group summaries.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token used to paginate though multiple pages of gateway group summaries.
     * </p>
     * 
     * @param nextToken
     *        The token used to paginate though multiple pages of gateway group summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGatewayGroupsResult withNextToken(String nextToken) {
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
        if (getGatewayGroups() != null)
            sb.append("GatewayGroups: ").append(getGatewayGroups()).append(",");
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

        if (obj instanceof ListGatewayGroupsResult == false)
            return false;
        ListGatewayGroupsResult other = (ListGatewayGroupsResult) obj;
        if (other.getGatewayGroups() == null ^ this.getGatewayGroups() == null)
            return false;
        if (other.getGatewayGroups() != null && other.getGatewayGroups().equals(this.getGatewayGroups()) == false)
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

        hashCode = prime * hashCode + ((getGatewayGroups() == null) ? 0 : getGatewayGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListGatewayGroupsResult clone() {
        try {
            return (ListGatewayGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
