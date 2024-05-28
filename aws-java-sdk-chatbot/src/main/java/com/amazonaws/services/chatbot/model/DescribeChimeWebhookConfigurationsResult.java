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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DescribeChimeWebhookConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeChimeWebhookConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * An optional token returned from a prior request. Use this token for pagination of results from this action. If
     * this parameter is specified, the response includes only results beyond the token, up to the value specified by
     * MaxResults.
     */
    private String nextToken;
    /** A list of Chime webhooks associated with the account. */
    private java.util.List<ChimeWebhookConfiguration> webhookConfigurations;

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

    public DescribeChimeWebhookConfigurationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * A list of Chime webhooks associated with the account.
     * 
     * @return A list of Chime webhooks associated with the account.
     */

    public java.util.List<ChimeWebhookConfiguration> getWebhookConfigurations() {
        return webhookConfigurations;
    }

    /**
     * A list of Chime webhooks associated with the account.
     * 
     * @param webhookConfigurations
     *        A list of Chime webhooks associated with the account.
     */

    public void setWebhookConfigurations(java.util.Collection<ChimeWebhookConfiguration> webhookConfigurations) {
        if (webhookConfigurations == null) {
            this.webhookConfigurations = null;
            return;
        }

        this.webhookConfigurations = new java.util.ArrayList<ChimeWebhookConfiguration>(webhookConfigurations);
    }

    /**
     * A list of Chime webhooks associated with the account.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWebhookConfigurations(java.util.Collection)} or
     * {@link #withWebhookConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param webhookConfigurations
     *        A list of Chime webhooks associated with the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChimeWebhookConfigurationsResult withWebhookConfigurations(ChimeWebhookConfiguration... webhookConfigurations) {
        if (this.webhookConfigurations == null) {
            setWebhookConfigurations(new java.util.ArrayList<ChimeWebhookConfiguration>(webhookConfigurations.length));
        }
        for (ChimeWebhookConfiguration ele : webhookConfigurations) {
            this.webhookConfigurations.add(ele);
        }
        return this;
    }

    /**
     * A list of Chime webhooks associated with the account.
     * 
     * @param webhookConfigurations
     *        A list of Chime webhooks associated with the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChimeWebhookConfigurationsResult withWebhookConfigurations(java.util.Collection<ChimeWebhookConfiguration> webhookConfigurations) {
        setWebhookConfigurations(webhookConfigurations);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getWebhookConfigurations() != null)
            sb.append("WebhookConfigurations: ").append(getWebhookConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeChimeWebhookConfigurationsResult == false)
            return false;
        DescribeChimeWebhookConfigurationsResult other = (DescribeChimeWebhookConfigurationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getWebhookConfigurations() == null ^ this.getWebhookConfigurations() == null)
            return false;
        if (other.getWebhookConfigurations() != null && other.getWebhookConfigurations().equals(this.getWebhookConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getWebhookConfigurations() == null) ? 0 : getWebhookConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public DescribeChimeWebhookConfigurationsResult clone() {
        try {
            return (DescribeChimeWebhookConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
