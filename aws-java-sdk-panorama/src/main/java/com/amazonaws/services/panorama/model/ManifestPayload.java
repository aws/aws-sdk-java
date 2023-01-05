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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A application verion's manifest file. This is a JSON document that has a single key (<code>PayloadData</code>) where
 * the value is an escaped string representation of the application manifest (<code>graph.json</code>). This file is
 * located in the <code>graphs</code> folder in your application source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ManifestPayload" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManifestPayload implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The application manifest.
     * </p>
     */
    private String payloadData;

    /**
     * <p>
     * The application manifest.
     * </p>
     * 
     * @param payloadData
     *        The application manifest.
     */

    public void setPayloadData(String payloadData) {
        this.payloadData = payloadData;
    }

    /**
     * <p>
     * The application manifest.
     * </p>
     * 
     * @return The application manifest.
     */

    public String getPayloadData() {
        return this.payloadData;
    }

    /**
     * <p>
     * The application manifest.
     * </p>
     * 
     * @param payloadData
     *        The application manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManifestPayload withPayloadData(String payloadData) {
        setPayloadData(payloadData);
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
        if (getPayloadData() != null)
            sb.append("PayloadData: ").append(getPayloadData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManifestPayload == false)
            return false;
        ManifestPayload other = (ManifestPayload) obj;
        if (other.getPayloadData() == null ^ this.getPayloadData() == null)
            return false;
        if (other.getPayloadData() != null && other.getPayloadData().equals(this.getPayloadData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPayloadData() == null) ? 0 : getPayloadData().hashCode());
        return hashCode;
    }

    @Override
    public ManifestPayload clone() {
        try {
            return (ManifestPayload) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.panorama.model.transform.ManifestPayloadMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
