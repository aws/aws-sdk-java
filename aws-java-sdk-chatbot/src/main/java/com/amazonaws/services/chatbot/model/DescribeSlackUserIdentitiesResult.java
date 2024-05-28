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
package com.amazonaws.services.chatbot.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DescribeSlackUserIdentities"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSlackUserIdentitiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** A list of Slack User Identities. */
    private java.util.List<SlackUserIdentity> slackUserIdentities;
    /**
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response includes only results beyond the token, up to the value specified by
     * MaxResults.
     */
    private String nextToken;

    /**
     * A list of Slack User Identities.
     * 
     * @return A list of Slack User Identities.
     */

    public java.util.List<SlackUserIdentity> getSlackUserIdentities() {
        return slackUserIdentities;
    }

    /**
     * A list of Slack User Identities.
     * 
     * @param slackUserIdentities
     *        A list of Slack User Identities.
     */

    public void setSlackUserIdentities(java.util.Collection<SlackUserIdentity> slackUserIdentities) {
        if (slackUserIdentities == null) {
            this.slackUserIdentities = null;
            return;
        }

        this.slackUserIdentities = new java.util.ArrayList<SlackUserIdentity>(slackUserIdentities);
    }

    /**
     * A list of Slack User Identities.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSlackUserIdentities(java.util.Collection)} or {@link #withSlackUserIdentities(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param slackUserIdentities
     *        A list of Slack User Identities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSlackUserIdentitiesResult withSlackUserIdentities(SlackUserIdentity... slackUserIdentities) {
        if (this.slackUserIdentities == null) {
            setSlackUserIdentities(new java.util.ArrayList<SlackUserIdentity>(slackUserIdentities.length));
        }
        for (SlackUserIdentity ele : slackUserIdentities) {
            this.slackUserIdentities.add(ele);
        }
        return this;
    }

    /**
     * A list of Slack User Identities.
     * 
     * @param slackUserIdentities
     *        A list of Slack User Identities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSlackUserIdentitiesResult withSlackUserIdentities(java.util.Collection<SlackUserIdentity> slackUserIdentities) {
        setSlackUserIdentities(slackUserIdentities);
        return this;
    }

    /**
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response includes only results beyond the token, up to the value specified by
     * MaxResults.
     * 
     * @param nextToken
     *        An optional token returned from a prior request. Use this token for pagination of results from this
     *        action. If this parameter is specified, the response includes only results beyond the token, up to the
     *        value specified by MaxResults.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response includes only results beyond the token, up to the value specified by
     * MaxResults.
     * 
     * @return An optional token returned from a prior request. Use this token for pagination of results from this
     *         action. If this parameter is specified, the response includes only results beyond the token, up to the
     *         value specified by MaxResults.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response includes only results beyond the token, up to the value specified by
     * MaxResults.
     * 
     * @param nextToken
     *        An optional token returned from a prior request. Use this token for pagination of results from this
     *        action. If this parameter is specified, the response includes only results beyond the token, up to the
     *        value specified by MaxResults.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSlackUserIdentitiesResult withNextToken(String nextToken) {
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
        if (getSlackUserIdentities() != null)
            sb.append("SlackUserIdentities: ").append(getSlackUserIdentities()).append(",");
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

        if (obj instanceof DescribeSlackUserIdentitiesResult == false)
            return false;
        DescribeSlackUserIdentitiesResult other = (DescribeSlackUserIdentitiesResult) obj;
        if (other.getSlackUserIdentities() == null ^ this.getSlackUserIdentities() == null)
            return false;
        if (other.getSlackUserIdentities() != null && other.getSlackUserIdentities().equals(this.getSlackUserIdentities()) == false)
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

        hashCode = prime * hashCode + ((getSlackUserIdentities() == null) ? 0 : getSlackUserIdentities().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSlackUserIdentitiesResult clone() {
        try {
            return (DescribeSlackUserIdentitiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
