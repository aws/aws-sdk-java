/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The HTTP configuration for the source location.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/HttpConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The base URL for the source location host server. This string must include the protocol, such as <b>https://</b>.
     * </p>
     */
    private String baseUrl;

    /**
     * <p>
     * The base URL for the source location host server. This string must include the protocol, such as <b>https://</b>.
     * </p>
     * 
     * @param baseUrl
     *        The base URL for the source location host server. This string must include the protocol, such as
     *        <b>https://</b>.
     */

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    /**
     * <p>
     * The base URL for the source location host server. This string must include the protocol, such as <b>https://</b>.
     * </p>
     * 
     * @return The base URL for the source location host server. This string must include the protocol, such as
     *         <b>https://</b>.
     */

    public String getBaseUrl() {
        return this.baseUrl;
    }

    /**
     * <p>
     * The base URL for the source location host server. This string must include the protocol, such as <b>https://</b>.
     * </p>
     * 
     * @param baseUrl
     *        The base URL for the source location host server. This string must include the protocol, such as
     *        <b>https://</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpConfiguration withBaseUrl(String baseUrl) {
        setBaseUrl(baseUrl);
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
        if (getBaseUrl() != null)
            sb.append("BaseUrl: ").append(getBaseUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpConfiguration == false)
            return false;
        HttpConfiguration other = (HttpConfiguration) obj;
        if (other.getBaseUrl() == null ^ this.getBaseUrl() == null)
            return false;
        if (other.getBaseUrl() != null && other.getBaseUrl().equals(this.getBaseUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaseUrl() == null) ? 0 : getBaseUrl().hashCode());
        return hashCode;
    }

    @Override
    public HttpConfiguration clone() {
        try {
            return (HttpConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.HttpConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
