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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Cross-cluster search specific connection properties.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CrossClusterSearchConnectionProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of the <code>SkipUnavailable</code> setting for the outbound connection. This feature allows you to
     * specify some clusters as optional and ensure that your cross-cluster queries return partial results despite
     * failures on one or more remote clusters.
     * </p>
     */
    private String skipUnavailable;

    /**
     * <p>
     * The status of the <code>SkipUnavailable</code> setting for the outbound connection. This feature allows you to
     * specify some clusters as optional and ensure that your cross-cluster queries return partial results despite
     * failures on one or more remote clusters.
     * </p>
     * 
     * @param skipUnavailable
     *        The status of the <code>SkipUnavailable</code> setting for the outbound connection. This feature allows
     *        you to specify some clusters as optional and ensure that your cross-cluster queries return partial results
     *        despite failures on one or more remote clusters.
     * @see SkipUnavailableStatus
     */

    public void setSkipUnavailable(String skipUnavailable) {
        this.skipUnavailable = skipUnavailable;
    }

    /**
     * <p>
     * The status of the <code>SkipUnavailable</code> setting for the outbound connection. This feature allows you to
     * specify some clusters as optional and ensure that your cross-cluster queries return partial results despite
     * failures on one or more remote clusters.
     * </p>
     * 
     * @return The status of the <code>SkipUnavailable</code> setting for the outbound connection. This feature allows
     *         you to specify some clusters as optional and ensure that your cross-cluster queries return partial
     *         results despite failures on one or more remote clusters.
     * @see SkipUnavailableStatus
     */

    public String getSkipUnavailable() {
        return this.skipUnavailable;
    }

    /**
     * <p>
     * The status of the <code>SkipUnavailable</code> setting for the outbound connection. This feature allows you to
     * specify some clusters as optional and ensure that your cross-cluster queries return partial results despite
     * failures on one or more remote clusters.
     * </p>
     * 
     * @param skipUnavailable
     *        The status of the <code>SkipUnavailable</code> setting for the outbound connection. This feature allows
     *        you to specify some clusters as optional and ensure that your cross-cluster queries return partial results
     *        despite failures on one or more remote clusters.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SkipUnavailableStatus
     */

    public CrossClusterSearchConnectionProperties withSkipUnavailable(String skipUnavailable) {
        setSkipUnavailable(skipUnavailable);
        return this;
    }

    /**
     * <p>
     * The status of the <code>SkipUnavailable</code> setting for the outbound connection. This feature allows you to
     * specify some clusters as optional and ensure that your cross-cluster queries return partial results despite
     * failures on one or more remote clusters.
     * </p>
     * 
     * @param skipUnavailable
     *        The status of the <code>SkipUnavailable</code> setting for the outbound connection. This feature allows
     *        you to specify some clusters as optional and ensure that your cross-cluster queries return partial results
     *        despite failures on one or more remote clusters.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SkipUnavailableStatus
     */

    public CrossClusterSearchConnectionProperties withSkipUnavailable(SkipUnavailableStatus skipUnavailable) {
        this.skipUnavailable = skipUnavailable.toString();
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
        if (getSkipUnavailable() != null)
            sb.append("SkipUnavailable: ").append(getSkipUnavailable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CrossClusterSearchConnectionProperties == false)
            return false;
        CrossClusterSearchConnectionProperties other = (CrossClusterSearchConnectionProperties) obj;
        if (other.getSkipUnavailable() == null ^ this.getSkipUnavailable() == null)
            return false;
        if (other.getSkipUnavailable() != null && other.getSkipUnavailable().equals(this.getSkipUnavailable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSkipUnavailable() == null) ? 0 : getSkipUnavailable().hashCode());
        return hashCode;
    }

    @Override
    public CrossClusterSearchConnectionProperties clone() {
        try {
            return (CrossClusterSearchConnectionProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.CrossClusterSearchConnectionPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
