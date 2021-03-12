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
 * The optional configuration for a server that serves segments. Use this if you want the segment delivery server to be
 * different from the source location server. For example, you can configure your source location server to be an
 * origination server, such as MediaPackage, and the segment delivery server to be a content delivery network (CDN),
 * such as CloudFront. If you don't specify a segment delivery server, then the source location server is used.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/DefaultSegmentDeliveryConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultSegmentDeliveryConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The hostname of the server that will be used to serve segments. This string must include the protocol, such as
     * <b>https://</b>.
     * </p>
     */
    private String baseUrl;

    /**
     * <p>
     * The hostname of the server that will be used to serve segments. This string must include the protocol, such as
     * <b>https://</b>.
     * </p>
     * 
     * @param baseUrl
     *        The hostname of the server that will be used to serve segments. This string must include the protocol,
     *        such as <b>https://</b>.
     */

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    /**
     * <p>
     * The hostname of the server that will be used to serve segments. This string must include the protocol, such as
     * <b>https://</b>.
     * </p>
     * 
     * @return The hostname of the server that will be used to serve segments. This string must include the protocol,
     *         such as <b>https://</b>.
     */

    public String getBaseUrl() {
        return this.baseUrl;
    }

    /**
     * <p>
     * The hostname of the server that will be used to serve segments. This string must include the protocol, such as
     * <b>https://</b>.
     * </p>
     * 
     * @param baseUrl
     *        The hostname of the server that will be used to serve segments. This string must include the protocol,
     *        such as <b>https://</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultSegmentDeliveryConfiguration withBaseUrl(String baseUrl) {
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

        if (obj instanceof DefaultSegmentDeliveryConfiguration == false)
            return false;
        DefaultSegmentDeliveryConfiguration other = (DefaultSegmentDeliveryConfiguration) obj;
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
    public DefaultSegmentDeliveryConfiguration clone() {
        try {
            return (DefaultSegmentDeliveryConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.DefaultSegmentDeliveryConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
