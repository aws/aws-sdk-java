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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/GetTelemetryMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTelemetryMetadataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Telemetry details.
     * </p>
     */
    private java.util.List<TelemetryMetadata> telemetryMetadata;

    /**
     * <p>
     * Telemetry details.
     * </p>
     * 
     * @return Telemetry details.
     */

    public java.util.List<TelemetryMetadata> getTelemetryMetadata() {
        return telemetryMetadata;
    }

    /**
     * <p>
     * Telemetry details.
     * </p>
     * 
     * @param telemetryMetadata
     *        Telemetry details.
     */

    public void setTelemetryMetadata(java.util.Collection<TelemetryMetadata> telemetryMetadata) {
        if (telemetryMetadata == null) {
            this.telemetryMetadata = null;
            return;
        }

        this.telemetryMetadata = new java.util.ArrayList<TelemetryMetadata>(telemetryMetadata);
    }

    /**
     * <p>
     * Telemetry details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTelemetryMetadata(java.util.Collection)} or {@link #withTelemetryMetadata(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param telemetryMetadata
     *        Telemetry details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTelemetryMetadataResult withTelemetryMetadata(TelemetryMetadata... telemetryMetadata) {
        if (this.telemetryMetadata == null) {
            setTelemetryMetadata(new java.util.ArrayList<TelemetryMetadata>(telemetryMetadata.length));
        }
        for (TelemetryMetadata ele : telemetryMetadata) {
            this.telemetryMetadata.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Telemetry details.
     * </p>
     * 
     * @param telemetryMetadata
     *        Telemetry details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTelemetryMetadataResult withTelemetryMetadata(java.util.Collection<TelemetryMetadata> telemetryMetadata) {
        setTelemetryMetadata(telemetryMetadata);
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
        if (getTelemetryMetadata() != null)
            sb.append("TelemetryMetadata: ").append(getTelemetryMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTelemetryMetadataResult == false)
            return false;
        GetTelemetryMetadataResult other = (GetTelemetryMetadataResult) obj;
        if (other.getTelemetryMetadata() == null ^ this.getTelemetryMetadata() == null)
            return false;
        if (other.getTelemetryMetadata() != null && other.getTelemetryMetadata().equals(this.getTelemetryMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTelemetryMetadata() == null) ? 0 : getTelemetryMetadata().hashCode());
        return hashCode;
    }

    @Override
    public GetTelemetryMetadataResult clone() {
        try {
            return (GetTelemetryMetadataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
