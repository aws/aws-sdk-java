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
 * Options for configuring service software updates for a domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SoftwareUpdateOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether automatic service software updates are enabled for the domain.
     * </p>
     */
    private Boolean autoSoftwareUpdateEnabled;

    /**
     * <p>
     * Whether automatic service software updates are enabled for the domain.
     * </p>
     * 
     * @param autoSoftwareUpdateEnabled
     *        Whether automatic service software updates are enabled for the domain.
     */

    public void setAutoSoftwareUpdateEnabled(Boolean autoSoftwareUpdateEnabled) {
        this.autoSoftwareUpdateEnabled = autoSoftwareUpdateEnabled;
    }

    /**
     * <p>
     * Whether automatic service software updates are enabled for the domain.
     * </p>
     * 
     * @return Whether automatic service software updates are enabled for the domain.
     */

    public Boolean getAutoSoftwareUpdateEnabled() {
        return this.autoSoftwareUpdateEnabled;
    }

    /**
     * <p>
     * Whether automatic service software updates are enabled for the domain.
     * </p>
     * 
     * @param autoSoftwareUpdateEnabled
     *        Whether automatic service software updates are enabled for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SoftwareUpdateOptions withAutoSoftwareUpdateEnabled(Boolean autoSoftwareUpdateEnabled) {
        setAutoSoftwareUpdateEnabled(autoSoftwareUpdateEnabled);
        return this;
    }

    /**
     * <p>
     * Whether automatic service software updates are enabled for the domain.
     * </p>
     * 
     * @return Whether automatic service software updates are enabled for the domain.
     */

    public Boolean isAutoSoftwareUpdateEnabled() {
        return this.autoSoftwareUpdateEnabled;
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
        if (getAutoSoftwareUpdateEnabled() != null)
            sb.append("AutoSoftwareUpdateEnabled: ").append(getAutoSoftwareUpdateEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SoftwareUpdateOptions == false)
            return false;
        SoftwareUpdateOptions other = (SoftwareUpdateOptions) obj;
        if (other.getAutoSoftwareUpdateEnabled() == null ^ this.getAutoSoftwareUpdateEnabled() == null)
            return false;
        if (other.getAutoSoftwareUpdateEnabled() != null && other.getAutoSoftwareUpdateEnabled().equals(this.getAutoSoftwareUpdateEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoSoftwareUpdateEnabled() == null) ? 0 : getAutoSoftwareUpdateEnabled().hashCode());
        return hashCode;
    }

    @Override
    public SoftwareUpdateOptions clone() {
        try {
            return (SoftwareUpdateOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.SoftwareUpdateOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
