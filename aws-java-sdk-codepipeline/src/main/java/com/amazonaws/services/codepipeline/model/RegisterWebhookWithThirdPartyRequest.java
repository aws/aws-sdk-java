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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/RegisterWebhookWithThirdParty"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterWebhookWithThirdPartyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of an existing webhook created with PutWebhook to register with a supported third party.
     * </p>
     */
    private String webhookName;

    /**
     * <p>
     * The name of an existing webhook created with PutWebhook to register with a supported third party.
     * </p>
     * 
     * @param webhookName
     *        The name of an existing webhook created with PutWebhook to register with a supported third party.
     */

    public void setWebhookName(String webhookName) {
        this.webhookName = webhookName;
    }

    /**
     * <p>
     * The name of an existing webhook created with PutWebhook to register with a supported third party.
     * </p>
     * 
     * @return The name of an existing webhook created with PutWebhook to register with a supported third party.
     */

    public String getWebhookName() {
        return this.webhookName;
    }

    /**
     * <p>
     * The name of an existing webhook created with PutWebhook to register with a supported third party.
     * </p>
     * 
     * @param webhookName
     *        The name of an existing webhook created with PutWebhook to register with a supported third party.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterWebhookWithThirdPartyRequest withWebhookName(String webhookName) {
        setWebhookName(webhookName);
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
        if (getWebhookName() != null)
            sb.append("WebhookName: ").append(getWebhookName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterWebhookWithThirdPartyRequest == false)
            return false;
        RegisterWebhookWithThirdPartyRequest other = (RegisterWebhookWithThirdPartyRequest) obj;
        if (other.getWebhookName() == null ^ this.getWebhookName() == null)
            return false;
        if (other.getWebhookName() != null && other.getWebhookName().equals(this.getWebhookName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebhookName() == null) ? 0 : getWebhookName().hashCode());
        return hashCode;
    }

    @Override
    public RegisterWebhookWithThirdPartyRequest clone() {
        return (RegisterWebhookWithThirdPartyRequest) super.clone();
    }

}
