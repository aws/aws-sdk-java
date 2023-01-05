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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetResourcePosition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourcePositionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The position information of the resource, displayed as a JSON payload. The payload uses the GeoJSON format, which
     * a format that's used to encode geographic data structures. For more information, see <a
     * href="https://geojson.org/">GeoJSON</a>.
     * </p>
     */
    private java.nio.ByteBuffer geoJsonPayload;

    /**
     * <p>
     * The position information of the resource, displayed as a JSON payload. The payload uses the GeoJSON format, which
     * a format that's used to encode geographic data structures. For more information, see <a
     * href="https://geojson.org/">GeoJSON</a>.
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
     * @param geoJsonPayload
     *        The position information of the resource, displayed as a JSON payload. The payload uses the GeoJSON
     *        format, which a format that's used to encode geographic data structures. For more information, see <a
     *        href="https://geojson.org/">GeoJSON</a>.
     */

    public void setGeoJsonPayload(java.nio.ByteBuffer geoJsonPayload) {
        this.geoJsonPayload = geoJsonPayload;
    }

    /**
     * <p>
     * The position information of the resource, displayed as a JSON payload. The payload uses the GeoJSON format, which
     * a format that's used to encode geographic data structures. For more information, see <a
     * href="https://geojson.org/">GeoJSON</a>.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The position information of the resource, displayed as a JSON payload. The payload uses the GeoJSON
     *         format, which a format that's used to encode geographic data structures. For more information, see <a
     *         href="https://geojson.org/">GeoJSON</a>.
     */

    public java.nio.ByteBuffer getGeoJsonPayload() {
        return this.geoJsonPayload;
    }

    /**
     * <p>
     * The position information of the resource, displayed as a JSON payload. The payload uses the GeoJSON format, which
     * a format that's used to encode geographic data structures. For more information, see <a
     * href="https://geojson.org/">GeoJSON</a>.
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
     * @param geoJsonPayload
     *        The position information of the resource, displayed as a JSON payload. The payload uses the GeoJSON
     *        format, which a format that's used to encode geographic data structures. For more information, see <a
     *        href="https://geojson.org/">GeoJSON</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcePositionResult withGeoJsonPayload(java.nio.ByteBuffer geoJsonPayload) {
        setGeoJsonPayload(geoJsonPayload);
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
        if (getGeoJsonPayload() != null)
            sb.append("GeoJsonPayload: ").append(getGeoJsonPayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourcePositionResult == false)
            return false;
        GetResourcePositionResult other = (GetResourcePositionResult) obj;
        if (other.getGeoJsonPayload() == null ^ this.getGeoJsonPayload() == null)
            return false;
        if (other.getGeoJsonPayload() != null && other.getGeoJsonPayload().equals(this.getGeoJsonPayload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGeoJsonPayload() == null) ? 0 : getGeoJsonPayload().hashCode());
        return hashCode;
    }

    @Override
    public GetResourcePositionResult clone() {
        try {
            return (GetResourcePositionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
