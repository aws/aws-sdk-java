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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * HTTP URL destination configuration used by the topic rule's HTTP action.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpUrlDestinationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL AWS IoT uses to confirm ownership of or access to the topic rule destination URL.
     * </p>
     */
    private String confirmationUrl;

    /**
     * <p>
     * The URL AWS IoT uses to confirm ownership of or access to the topic rule destination URL.
     * </p>
     * 
     * @param confirmationUrl
     *        The URL AWS IoT uses to confirm ownership of or access to the topic rule destination URL.
     */

    public void setConfirmationUrl(String confirmationUrl) {
        this.confirmationUrl = confirmationUrl;
    }

    /**
     * <p>
     * The URL AWS IoT uses to confirm ownership of or access to the topic rule destination URL.
     * </p>
     * 
     * @return The URL AWS IoT uses to confirm ownership of or access to the topic rule destination URL.
     */

    public String getConfirmationUrl() {
        return this.confirmationUrl;
    }

    /**
     * <p>
     * The URL AWS IoT uses to confirm ownership of or access to the topic rule destination URL.
     * </p>
     * 
     * @param confirmationUrl
     *        The URL AWS IoT uses to confirm ownership of or access to the topic rule destination URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpUrlDestinationConfiguration withConfirmationUrl(String confirmationUrl) {
        setConfirmationUrl(confirmationUrl);
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
        if (getConfirmationUrl() != null)
            sb.append("ConfirmationUrl: ").append(getConfirmationUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpUrlDestinationConfiguration == false)
            return false;
        HttpUrlDestinationConfiguration other = (HttpUrlDestinationConfiguration) obj;
        if (other.getConfirmationUrl() == null ^ this.getConfirmationUrl() == null)
            return false;
        if (other.getConfirmationUrl() != null && other.getConfirmationUrl().equals(this.getConfirmationUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfirmationUrl() == null) ? 0 : getConfirmationUrl().hashCode());
        return hashCode;
    }

    @Override
    public HttpUrlDestinationConfiguration clone() {
        try {
            return (HttpUrlDestinationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.HttpUrlDestinationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
