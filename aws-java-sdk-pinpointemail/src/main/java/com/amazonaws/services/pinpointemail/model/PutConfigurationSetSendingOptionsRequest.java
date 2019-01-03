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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to enable or disable the ability of Amazon Pinpoint to send emails that use a specific configuration set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutConfigurationSetSendingOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutConfigurationSetSendingOptionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the configuration set that you want to enable or disable email sending for.
     * </p>
     */
    private String configurationSetName;
    /**
     * <p>
     * If <code>true</code>, email sending is enabled for the configuration set. If <code>false</code>, email sending is
     * disabled for the configuration set.
     * </p>
     */
    private Boolean sendingEnabled;

    /**
     * <p>
     * The name of the configuration set that you want to enable or disable email sending for.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set that you want to enable or disable email sending for.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set that you want to enable or disable email sending for.
     * </p>
     * 
     * @return The name of the configuration set that you want to enable or disable email sending for.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set that you want to enable or disable email sending for.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set that you want to enable or disable email sending for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConfigurationSetSendingOptionsRequest withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, email sending is enabled for the configuration set. If <code>false</code>, email sending is
     * disabled for the configuration set.
     * </p>
     * 
     * @param sendingEnabled
     *        If <code>true</code>, email sending is enabled for the configuration set. If <code>false</code>, email
     *        sending is disabled for the configuration set.
     */

    public void setSendingEnabled(Boolean sendingEnabled) {
        this.sendingEnabled = sendingEnabled;
    }

    /**
     * <p>
     * If <code>true</code>, email sending is enabled for the configuration set. If <code>false</code>, email sending is
     * disabled for the configuration set.
     * </p>
     * 
     * @return If <code>true</code>, email sending is enabled for the configuration set. If <code>false</code>, email
     *         sending is disabled for the configuration set.
     */

    public Boolean getSendingEnabled() {
        return this.sendingEnabled;
    }

    /**
     * <p>
     * If <code>true</code>, email sending is enabled for the configuration set. If <code>false</code>, email sending is
     * disabled for the configuration set.
     * </p>
     * 
     * @param sendingEnabled
     *        If <code>true</code>, email sending is enabled for the configuration set. If <code>false</code>, email
     *        sending is disabled for the configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConfigurationSetSendingOptionsRequest withSendingEnabled(Boolean sendingEnabled) {
        setSendingEnabled(sendingEnabled);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, email sending is enabled for the configuration set. If <code>false</code>, email sending is
     * disabled for the configuration set.
     * </p>
     * 
     * @return If <code>true</code>, email sending is enabled for the configuration set. If <code>false</code>, email
     *         sending is disabled for the configuration set.
     */

    public Boolean isSendingEnabled() {
        return this.sendingEnabled;
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
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: ").append(getConfigurationSetName()).append(",");
        if (getSendingEnabled() != null)
            sb.append("SendingEnabled: ").append(getSendingEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutConfigurationSetSendingOptionsRequest == false)
            return false;
        PutConfigurationSetSendingOptionsRequest other = (PutConfigurationSetSendingOptionsRequest) obj;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getSendingEnabled() == null ^ this.getSendingEnabled() == null)
            return false;
        if (other.getSendingEnabled() != null && other.getSendingEnabled().equals(this.getSendingEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode + ((getSendingEnabled() == null) ? 0 : getSendingEnabled().hashCode());
        return hashCode;
    }

    @Override
    public PutConfigurationSetSendingOptionsRequest clone() {
        return (PutConfigurationSetSendingOptionsRequest) super.clone();
    }

}
