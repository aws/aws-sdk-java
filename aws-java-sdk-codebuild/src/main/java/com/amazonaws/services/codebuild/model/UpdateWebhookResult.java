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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/UpdateWebhook" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWebhookResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about a repository's webhook that is associated with a project in AWS CodeBuild.
     * </p>
     */
    private Webhook webhook;

    /**
     * <p>
     * Information about a repository's webhook that is associated with a project in AWS CodeBuild.
     * </p>
     * 
     * @param webhook
     *        Information about a repository's webhook that is associated with a project in AWS CodeBuild.
     */

    public void setWebhook(Webhook webhook) {
        this.webhook = webhook;
    }

    /**
     * <p>
     * Information about a repository's webhook that is associated with a project in AWS CodeBuild.
     * </p>
     * 
     * @return Information about a repository's webhook that is associated with a project in AWS CodeBuild.
     */

    public Webhook getWebhook() {
        return this.webhook;
    }

    /**
     * <p>
     * Information about a repository's webhook that is associated with a project in AWS CodeBuild.
     * </p>
     * 
     * @param webhook
     *        Information about a repository's webhook that is associated with a project in AWS CodeBuild.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWebhookResult withWebhook(Webhook webhook) {
        setWebhook(webhook);
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
            sb.append("Webhook: ").append(getWebhook());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWebhookResult == false)
            return false;
        UpdateWebhookResult other = (UpdateWebhookResult) obj;
        if (other.getWebhook() == null ^ this.getWebhook() == null)
            return false;
        if (other.getWebhook() != null && other.getWebhook().equals(this.getWebhook()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebhook() == null) ? 0 : getWebhook().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWebhookResult clone() {
        try {
            return (UpdateWebhookResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
