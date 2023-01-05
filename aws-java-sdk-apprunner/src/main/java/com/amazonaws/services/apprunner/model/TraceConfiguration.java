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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the configuration of the tracing feature within an App Runner observability configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/TraceConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TraceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The implementation provider chosen for tracing App Runner services.
     * </p>
     */
    private String vendor;

    /**
     * <p>
     * The implementation provider chosen for tracing App Runner services.
     * </p>
     * 
     * @param vendor
     *        The implementation provider chosen for tracing App Runner services.
     * @see TracingVendor
     */

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    /**
     * <p>
     * The implementation provider chosen for tracing App Runner services.
     * </p>
     * 
     * @return The implementation provider chosen for tracing App Runner services.
     * @see TracingVendor
     */

    public String getVendor() {
        return this.vendor;
    }

    /**
     * <p>
     * The implementation provider chosen for tracing App Runner services.
     * </p>
     * 
     * @param vendor
     *        The implementation provider chosen for tracing App Runner services.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TracingVendor
     */

    public TraceConfiguration withVendor(String vendor) {
        setVendor(vendor);
        return this;
    }

    /**
     * <p>
     * The implementation provider chosen for tracing App Runner services.
     * </p>
     * 
     * @param vendor
     *        The implementation provider chosen for tracing App Runner services.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TracingVendor
     */

    public TraceConfiguration withVendor(TracingVendor vendor) {
        this.vendor = vendor.toString();
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
        if (getVendor() != null)
            sb.append("Vendor: ").append(getVendor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TraceConfiguration == false)
            return false;
        TraceConfiguration other = (TraceConfiguration) obj;
        if (other.getVendor() == null ^ this.getVendor() == null)
            return false;
        if (other.getVendor() != null && other.getVendor().equals(this.getVendor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVendor() == null) ? 0 : getVendor().hashCode());
        return hashCode;
    }

    @Override
    public TraceConfiguration clone() {
        try {
            return (TraceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apprunner.model.transform.TraceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
