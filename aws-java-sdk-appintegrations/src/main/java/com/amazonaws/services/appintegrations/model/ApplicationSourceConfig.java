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
package com.amazonaws.services.appintegrations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for where the application should be loaded from.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/ApplicationSourceConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationSourceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The external URL source for the application.
     * </p>
     */
    private ExternalUrlConfig externalUrlConfig;

    /**
     * <p>
     * The external URL source for the application.
     * </p>
     * 
     * @param externalUrlConfig
     *        The external URL source for the application.
     */

    public void setExternalUrlConfig(ExternalUrlConfig externalUrlConfig) {
        this.externalUrlConfig = externalUrlConfig;
    }

    /**
     * <p>
     * The external URL source for the application.
     * </p>
     * 
     * @return The external URL source for the application.
     */

    public ExternalUrlConfig getExternalUrlConfig() {
        return this.externalUrlConfig;
    }

    /**
     * <p>
     * The external URL source for the application.
     * </p>
     * 
     * @param externalUrlConfig
     *        The external URL source for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSourceConfig withExternalUrlConfig(ExternalUrlConfig externalUrlConfig) {
        setExternalUrlConfig(externalUrlConfig);
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
        if (getExternalUrlConfig() != null)
            sb.append("ExternalUrlConfig: ").append(getExternalUrlConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationSourceConfig == false)
            return false;
        ApplicationSourceConfig other = (ApplicationSourceConfig) obj;
        if (other.getExternalUrlConfig() == null ^ this.getExternalUrlConfig() == null)
            return false;
        if (other.getExternalUrlConfig() != null && other.getExternalUrlConfig().equals(this.getExternalUrlConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExternalUrlConfig() == null) ? 0 : getExternalUrlConfig().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationSourceConfig clone() {
        try {
            return (ApplicationSourceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appintegrations.model.transform.ApplicationSourceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
