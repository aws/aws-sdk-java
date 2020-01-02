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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PutWebhook" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutWebhookRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The detail provided in an input file to create the webhook, such as the webhook name, the pipeline name, and the
     * action name. Give the webhook a unique name that helps you identify it. You might name the webhook after the
     * pipeline and action it targets so that you can easily recognize what it's used for later.
     * </p>
     */
    private WebhookDefinition webhook;
    /**
     * <p>
     * The tags for the webhook.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The detail provided in an input file to create the webhook, such as the webhook name, the pipeline name, and the
     * action name. Give the webhook a unique name that helps you identify it. You might name the webhook after the
     * pipeline and action it targets so that you can easily recognize what it's used for later.
     * </p>
     * 
     * @param webhook
     *        The detail provided in an input file to create the webhook, such as the webhook name, the pipeline name,
     *        and the action name. Give the webhook a unique name that helps you identify it. You might name the webhook
     *        after the pipeline and action it targets so that you can easily recognize what it's used for later.
     */

    public void setWebhook(WebhookDefinition webhook) {
        this.webhook = webhook;
    }

    /**
     * <p>
     * The detail provided in an input file to create the webhook, such as the webhook name, the pipeline name, and the
     * action name. Give the webhook a unique name that helps you identify it. You might name the webhook after the
     * pipeline and action it targets so that you can easily recognize what it's used for later.
     * </p>
     * 
     * @return The detail provided in an input file to create the webhook, such as the webhook name, the pipeline name,
     *         and the action name. Give the webhook a unique name that helps you identify it. You might name the
     *         webhook after the pipeline and action it targets so that you can easily recognize what it's used for
     *         later.
     */

    public WebhookDefinition getWebhook() {
        return this.webhook;
    }

    /**
     * <p>
     * The detail provided in an input file to create the webhook, such as the webhook name, the pipeline name, and the
     * action name. Give the webhook a unique name that helps you identify it. You might name the webhook after the
     * pipeline and action it targets so that you can easily recognize what it's used for later.
     * </p>
     * 
     * @param webhook
     *        The detail provided in an input file to create the webhook, such as the webhook name, the pipeline name,
     *        and the action name. Give the webhook a unique name that helps you identify it. You might name the webhook
     *        after the pipeline and action it targets so that you can easily recognize what it's used for later.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutWebhookRequest withWebhook(WebhookDefinition webhook) {
        setWebhook(webhook);
        return this;
    }

    /**
     * <p>
     * The tags for the webhook.
     * </p>
     * 
     * @return The tags for the webhook.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the webhook.
     * </p>
     * 
     * @param tags
     *        The tags for the webhook.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags for the webhook.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags for the webhook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutWebhookRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags for the webhook.
     * </p>
     * 
     * @param tags
     *        The tags for the webhook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutWebhookRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getWebhook() != null)
            sb.append("Webhook: ").append(getWebhook()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutWebhookRequest == false)
            return false;
        PutWebhookRequest other = (PutWebhookRequest) obj;
        if (other.getWebhook() == null ^ this.getWebhook() == null)
            return false;
        if (other.getWebhook() != null && other.getWebhook().equals(this.getWebhook()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebhook() == null) ? 0 : getWebhook().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PutWebhookRequest clone() {
        return (PutWebhookRequest) super.clone();
    }

}
