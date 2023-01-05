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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information about the external data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/SourceConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configuration information for Amazon AppIntegrations to automatically ingest content.
     * </p>
     */
    private AppIntegrationsConfiguration appIntegrations;

    /**
     * <p>
     * Configuration information for Amazon AppIntegrations to automatically ingest content.
     * </p>
     * 
     * @param appIntegrations
     *        Configuration information for Amazon AppIntegrations to automatically ingest content.
     */

    public void setAppIntegrations(AppIntegrationsConfiguration appIntegrations) {
        this.appIntegrations = appIntegrations;
    }

    /**
     * <p>
     * Configuration information for Amazon AppIntegrations to automatically ingest content.
     * </p>
     * 
     * @return Configuration information for Amazon AppIntegrations to automatically ingest content.
     */

    public AppIntegrationsConfiguration getAppIntegrations() {
        return this.appIntegrations;
    }

    /**
     * <p>
     * Configuration information for Amazon AppIntegrations to automatically ingest content.
     * </p>
     * 
     * @param appIntegrations
     *        Configuration information for Amazon AppIntegrations to automatically ingest content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConfiguration withAppIntegrations(AppIntegrationsConfiguration appIntegrations) {
        setAppIntegrations(appIntegrations);
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
        if (getAppIntegrations() != null)
            sb.append("AppIntegrations: ").append(getAppIntegrations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceConfiguration == false)
            return false;
        SourceConfiguration other = (SourceConfiguration) obj;
        if (other.getAppIntegrations() == null ^ this.getAppIntegrations() == null)
            return false;
        if (other.getAppIntegrations() != null && other.getAppIntegrations().equals(this.getAppIntegrations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppIntegrations() == null) ? 0 : getAppIntegrations().hashCode());
        return hashCode;
    }

    @Override
    public SourceConfiguration clone() {
        try {
            return (SourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectwisdom.model.transform.SourceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
