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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ListWebhooks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWebhooksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The JSON detail returned for each webhook in the list output for the ListWebhooks call.
     * </p>
     */
    private java.util.List<ListWebhookItem> webhooks;
    /**
     * <p>
     * If the amount of returned information is significantly large, an identifier is also returned and can be used in a
     * subsequent ListWebhooks call to return the next set of webhooks in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The JSON detail returned for each webhook in the list output for the ListWebhooks call.
     * </p>
     * 
     * @return The JSON detail returned for each webhook in the list output for the ListWebhooks call.
     */

    public java.util.List<ListWebhookItem> getWebhooks() {
        return webhooks;
    }

    /**
     * <p>
     * The JSON detail returned for each webhook in the list output for the ListWebhooks call.
     * </p>
     * 
     * @param webhooks
     *        The JSON detail returned for each webhook in the list output for the ListWebhooks call.
     */

    public void setWebhooks(java.util.Collection<ListWebhookItem> webhooks) {
        if (webhooks == null) {
            this.webhooks = null;
            return;
        }

        this.webhooks = new java.util.ArrayList<ListWebhookItem>(webhooks);
    }

    /**
     * <p>
     * The JSON detail returned for each webhook in the list output for the ListWebhooks call.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWebhooks(java.util.Collection)} or {@link #withWebhooks(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param webhooks
     *        The JSON detail returned for each webhook in the list output for the ListWebhooks call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWebhooksResult withWebhooks(ListWebhookItem... webhooks) {
        if (this.webhooks == null) {
            setWebhooks(new java.util.ArrayList<ListWebhookItem>(webhooks.length));
        }
        for (ListWebhookItem ele : webhooks) {
            this.webhooks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The JSON detail returned for each webhook in the list output for the ListWebhooks call.
     * </p>
     * 
     * @param webhooks
     *        The JSON detail returned for each webhook in the list output for the ListWebhooks call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWebhooksResult withWebhooks(java.util.Collection<ListWebhookItem> webhooks) {
        setWebhooks(webhooks);
        return this;
    }

    /**
     * <p>
     * If the amount of returned information is significantly large, an identifier is also returned and can be used in a
     * subsequent ListWebhooks call to return the next set of webhooks in the list.
     * </p>
     * 
     * @param nextToken
     *        If the amount of returned information is significantly large, an identifier is also returned and can be
     *        used in a subsequent ListWebhooks call to return the next set of webhooks in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the amount of returned information is significantly large, an identifier is also returned and can be used in a
     * subsequent ListWebhooks call to return the next set of webhooks in the list.
     * </p>
     * 
     * @return If the amount of returned information is significantly large, an identifier is also returned and can be
     *         used in a subsequent ListWebhooks call to return the next set of webhooks in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the amount of returned information is significantly large, an identifier is also returned and can be used in a
     * subsequent ListWebhooks call to return the next set of webhooks in the list.
     * </p>
     * 
     * @param nextToken
     *        If the amount of returned information is significantly large, an identifier is also returned and can be
     *        used in a subsequent ListWebhooks call to return the next set of webhooks in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWebhooksResult withNextToken(String nextToken) {
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
        if (getWebhooks() != null)
            sb.append("Webhooks: ").append(getWebhooks()).append(",");
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

        if (obj instanceof ListWebhooksResult == false)
            return false;
        ListWebhooksResult other = (ListWebhooksResult) obj;
        if (other.getWebhooks() == null ^ this.getWebhooks() == null)
            return false;
        if (other.getWebhooks() != null && other.getWebhooks().equals(this.getWebhooks()) == false)
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

        hashCode = prime * hashCode + ((getWebhooks() == null) ? 0 : getWebhooks().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListWebhooksResult clone() {
        try {
            return (ListWebhooksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
