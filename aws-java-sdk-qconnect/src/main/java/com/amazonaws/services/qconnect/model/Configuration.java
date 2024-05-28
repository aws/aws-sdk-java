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
package com.amazonaws.services.qconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration information of the external data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/Configuration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Configuration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration information of the Amazon Connect data source.
     * </p>
     */
    private ConnectConfiguration connectConfiguration;

    /**
     * <p>
     * The configuration information of the Amazon Connect data source.
     * </p>
     * 
     * @param connectConfiguration
     *        The configuration information of the Amazon Connect data source.
     */

    public void setConnectConfiguration(ConnectConfiguration connectConfiguration) {
        this.connectConfiguration = connectConfiguration;
    }

    /**
     * <p>
     * The configuration information of the Amazon Connect data source.
     * </p>
     * 
     * @return The configuration information of the Amazon Connect data source.
     */

    public ConnectConfiguration getConnectConfiguration() {
        return this.connectConfiguration;
    }

    /**
     * <p>
     * The configuration information of the Amazon Connect data source.
     * </p>
     * 
     * @param connectConfiguration
     *        The configuration information of the Amazon Connect data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withConnectConfiguration(ConnectConfiguration connectConfiguration) {
        setConnectConfiguration(connectConfiguration);
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
        if (getConnectConfiguration() != null)
            sb.append("ConnectConfiguration: ").append(getConnectConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Configuration == false)
            return false;
        Configuration other = (Configuration) obj;
        if (other.getConnectConfiguration() == null ^ this.getConnectConfiguration() == null)
            return false;
        if (other.getConnectConfiguration() != null && other.getConnectConfiguration().equals(this.getConnectConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectConfiguration() == null) ? 0 : getConnectConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public Configuration clone() {
        try {
            return (Configuration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qconnect.model.transform.ConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
