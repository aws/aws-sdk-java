/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The segment delivery configuration settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/SegmentDeliveryConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SegmentDeliveryConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The base URL of the host or path of the segment delivery server that you're using to serve segments. This is
     * typically a content delivery network (CDN). The URL can be absolute or relative. To use an absolute URL include
     * the protocol, such as <code>https://example.com/some/path</code>. To use a relative URL specify the relative
     * path, such as <code>/some/path*</code>.
     * </p>
     */
    private String baseUrl;
    /**
     * <p>
     * A unique identifier used to distinguish between multiple segment delivery configurations in a source location.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The base URL of the host or path of the segment delivery server that you're using to serve segments. This is
     * typically a content delivery network (CDN). The URL can be absolute or relative. To use an absolute URL include
     * the protocol, such as <code>https://example.com/some/path</code>. To use a relative URL specify the relative
     * path, such as <code>/some/path*</code>.
     * </p>
     * 
     * @param baseUrl
     *        The base URL of the host or path of the segment delivery server that you're using to serve segments. This
     *        is typically a content delivery network (CDN). The URL can be absolute or relative. To use an absolute URL
     *        include the protocol, such as <code>https://example.com/some/path</code>. To use a relative URL specify
     *        the relative path, such as <code>/some/path*</code>.
     */

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    /**
     * <p>
     * The base URL of the host or path of the segment delivery server that you're using to serve segments. This is
     * typically a content delivery network (CDN). The URL can be absolute or relative. To use an absolute URL include
     * the protocol, such as <code>https://example.com/some/path</code>. To use a relative URL specify the relative
     * path, such as <code>/some/path*</code>.
     * </p>
     * 
     * @return The base URL of the host or path of the segment delivery server that you're using to serve segments. This
     *         is typically a content delivery network (CDN). The URL can be absolute or relative. To use an absolute
     *         URL include the protocol, such as <code>https://example.com/some/path</code>. To use a relative URL
     *         specify the relative path, such as <code>/some/path*</code>.
     */

    public String getBaseUrl() {
        return this.baseUrl;
    }

    /**
     * <p>
     * The base URL of the host or path of the segment delivery server that you're using to serve segments. This is
     * typically a content delivery network (CDN). The URL can be absolute or relative. To use an absolute URL include
     * the protocol, such as <code>https://example.com/some/path</code>. To use a relative URL specify the relative
     * path, such as <code>/some/path*</code>.
     * </p>
     * 
     * @param baseUrl
     *        The base URL of the host or path of the segment delivery server that you're using to serve segments. This
     *        is typically a content delivery network (CDN). The URL can be absolute or relative. To use an absolute URL
     *        include the protocol, such as <code>https://example.com/some/path</code>. To use a relative URL specify
     *        the relative path, such as <code>/some/path*</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentDeliveryConfiguration withBaseUrl(String baseUrl) {
        setBaseUrl(baseUrl);
        return this;
    }

    /**
     * <p>
     * A unique identifier used to distinguish between multiple segment delivery configurations in a source location.
     * </p>
     * 
     * @param name
     *        A unique identifier used to distinguish between multiple segment delivery configurations in a source
     *        location.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A unique identifier used to distinguish between multiple segment delivery configurations in a source location.
     * </p>
     * 
     * @return A unique identifier used to distinguish between multiple segment delivery configurations in a source
     *         location.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A unique identifier used to distinguish between multiple segment delivery configurations in a source location.
     * </p>
     * 
     * @param name
     *        A unique identifier used to distinguish between multiple segment delivery configurations in a source
     *        location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentDeliveryConfiguration withName(String name) {
        setName(name);
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
            sb.append("BaseUrl: ").append(getBaseUrl()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SegmentDeliveryConfiguration == false)
            return false;
        SegmentDeliveryConfiguration other = (SegmentDeliveryConfiguration) obj;
        if (other.getBaseUrl() == null ^ this.getBaseUrl() == null)
            return false;
        if (other.getBaseUrl() != null && other.getBaseUrl().equals(this.getBaseUrl()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaseUrl() == null) ? 0 : getBaseUrl().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public SegmentDeliveryConfiguration clone() {
        try {
            return (SegmentDeliveryConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.SegmentDeliveryConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
