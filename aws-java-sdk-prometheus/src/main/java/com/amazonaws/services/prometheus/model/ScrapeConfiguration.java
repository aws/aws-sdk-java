/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.prometheus.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A scrape configuration for a scraper, base 64 encoded. For more information, see <a
 * href="prometheus/latest/userguide/AMP-collector-how-to.html#AMP-collector-configuration">Scraper configuration</a> in
 * the <i>Amazon Managed Service for Prometheus User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/ScrapeConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScrapeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The base 64 encoded scrape configuration file.
     * </p>
     */
    private java.nio.ByteBuffer configurationBlob;

    /**
     * <p>
     * The base 64 encoded scrape configuration file.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param configurationBlob
     *        The base 64 encoded scrape configuration file.
     */

    public void setConfigurationBlob(java.nio.ByteBuffer configurationBlob) {
        this.configurationBlob = configurationBlob;
    }

    /**
     * <p>
     * The base 64 encoded scrape configuration file.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The base 64 encoded scrape configuration file.
     */

    public java.nio.ByteBuffer getConfigurationBlob() {
        return this.configurationBlob;
    }

    /**
     * <p>
     * The base 64 encoded scrape configuration file.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param configurationBlob
     *        The base 64 encoded scrape configuration file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScrapeConfiguration withConfigurationBlob(java.nio.ByteBuffer configurationBlob) {
        setConfigurationBlob(configurationBlob);
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
        if (getConfigurationBlob() != null)
            sb.append("ConfigurationBlob: ").append(getConfigurationBlob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScrapeConfiguration == false)
            return false;
        ScrapeConfiguration other = (ScrapeConfiguration) obj;
        if (other.getConfigurationBlob() == null ^ this.getConfigurationBlob() == null)
            return false;
        if (other.getConfigurationBlob() != null && other.getConfigurationBlob().equals(this.getConfigurationBlob()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationBlob() == null) ? 0 : getConfigurationBlob().hashCode());
        return hashCode;
    }

    @Override
    public ScrapeConfiguration clone() {
        try {
            return (ScrapeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.prometheus.model.transform.ScrapeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
