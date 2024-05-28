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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DeleteTLSInspectionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTLSInspectionConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The high-level properties of a TLS inspection configuration. This, along with the
     * <a>TLSInspectionConfiguration</a>, define the TLS inspection configuration. You can retrieve all objects for a
     * TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a>.
     * </p>
     */
    private TLSInspectionConfigurationResponse tLSInspectionConfigurationResponse;

    /**
     * <p>
     * The high-level properties of a TLS inspection configuration. This, along with the
     * <a>TLSInspectionConfiguration</a>, define the TLS inspection configuration. You can retrieve all objects for a
     * TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a>.
     * </p>
     * 
     * @param tLSInspectionConfigurationResponse
     *        The high-level properties of a TLS inspection configuration. This, along with the
     *        <a>TLSInspectionConfiguration</a>, define the TLS inspection configuration. You can retrieve all objects
     *        for a TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a>.
     */

    public void setTLSInspectionConfigurationResponse(TLSInspectionConfigurationResponse tLSInspectionConfigurationResponse) {
        this.tLSInspectionConfigurationResponse = tLSInspectionConfigurationResponse;
    }

    /**
     * <p>
     * The high-level properties of a TLS inspection configuration. This, along with the
     * <a>TLSInspectionConfiguration</a>, define the TLS inspection configuration. You can retrieve all objects for a
     * TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a>.
     * </p>
     * 
     * @return The high-level properties of a TLS inspection configuration. This, along with the
     *         <a>TLSInspectionConfiguration</a>, define the TLS inspection configuration. You can retrieve all objects
     *         for a TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a>.
     */

    public TLSInspectionConfigurationResponse getTLSInspectionConfigurationResponse() {
        return this.tLSInspectionConfigurationResponse;
    }

    /**
     * <p>
     * The high-level properties of a TLS inspection configuration. This, along with the
     * <a>TLSInspectionConfiguration</a>, define the TLS inspection configuration. You can retrieve all objects for a
     * TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a>.
     * </p>
     * 
     * @param tLSInspectionConfigurationResponse
     *        The high-level properties of a TLS inspection configuration. This, along with the
     *        <a>TLSInspectionConfiguration</a>, define the TLS inspection configuration. You can retrieve all objects
     *        for a TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTLSInspectionConfigurationResult withTLSInspectionConfigurationResponse(TLSInspectionConfigurationResponse tLSInspectionConfigurationResponse) {
        setTLSInspectionConfigurationResponse(tLSInspectionConfigurationResponse);
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
        if (getTLSInspectionConfigurationResponse() != null)
            sb.append("TLSInspectionConfigurationResponse: ").append(getTLSInspectionConfigurationResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTLSInspectionConfigurationResult == false)
            return false;
        DeleteTLSInspectionConfigurationResult other = (DeleteTLSInspectionConfigurationResult) obj;
        if (other.getTLSInspectionConfigurationResponse() == null ^ this.getTLSInspectionConfigurationResponse() == null)
            return false;
        if (other.getTLSInspectionConfigurationResponse() != null
                && other.getTLSInspectionConfigurationResponse().equals(this.getTLSInspectionConfigurationResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTLSInspectionConfigurationResponse() == null) ? 0 : getTLSInspectionConfigurationResponse().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTLSInspectionConfigurationResult clone() {
        try {
            return (DeleteTLSInspectionConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
