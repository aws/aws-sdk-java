/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a webhook in GitHub that connects repository events to a build project in AWS CodeBuild.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/Webhook" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Webhook implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL to the webhook.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The URL to the webhook.
     * </p>
     * 
     * @param url
     *        The URL to the webhook.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL to the webhook.
     * </p>
     * 
     * @return The URL to the webhook.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL to the webhook.
     * </p>
     * 
     * @param url
     *        The URL to the webhook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Webhook withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Webhook == false)
            return false;
        Webhook other = (Webhook) obj;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public Webhook clone() {
        try {
            return (Webhook) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.WebhookMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
