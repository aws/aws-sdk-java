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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request structure for the delete webhook request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/DeleteWebhook" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteWebhookRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique Id for a webhook.
     * </p>
     */
    private String webhookId;

    /**
     * <p>
     * Unique Id for a webhook.
     * </p>
     * 
     * @param webhookId
     *        Unique Id for a webhook.
     */

    public void setWebhookId(String webhookId) {
        this.webhookId = webhookId;
    }

    /**
     * <p>
     * Unique Id for a webhook.
     * </p>
     * 
     * @return Unique Id for a webhook.
     */

    public String getWebhookId() {
        return this.webhookId;
    }

    /**
     * <p>
     * Unique Id for a webhook.
     * </p>
     * 
     * @param webhookId
     *        Unique Id for a webhook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteWebhookRequest withWebhookId(String webhookId) {
        setWebhookId(webhookId);
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
        if (getWebhookId() != null)
            sb.append("WebhookId: ").append(getWebhookId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteWebhookRequest == false)
            return false;
        DeleteWebhookRequest other = (DeleteWebhookRequest) obj;
        if (other.getWebhookId() == null ^ this.getWebhookId() == null)
            return false;
        if (other.getWebhookId() != null && other.getWebhookId().equals(this.getWebhookId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebhookId() == null) ? 0 : getWebhookId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteWebhookRequest clone() {
        return (DeleteWebhookRequest) super.clone();
    }

}
