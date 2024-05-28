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
package com.amazonaws.services.emrserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration to use to enable the different types of interactive use cases in an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/InteractiveConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InteractiveConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Enables you to connect an application to Amazon EMR Studio to run interactive workloads in a notebook.
     * </p>
     */
    private Boolean studioEnabled;
    /**
     * <p>
     * Enables an Apache Livy endpoint that you can connect to and run interactive jobs.
     * </p>
     */
    private Boolean livyEndpointEnabled;

    /**
     * <p>
     * Enables you to connect an application to Amazon EMR Studio to run interactive workloads in a notebook.
     * </p>
     * 
     * @param studioEnabled
     *        Enables you to connect an application to Amazon EMR Studio to run interactive workloads in a notebook.
     */

    public void setStudioEnabled(Boolean studioEnabled) {
        this.studioEnabled = studioEnabled;
    }

    /**
     * <p>
     * Enables you to connect an application to Amazon EMR Studio to run interactive workloads in a notebook.
     * </p>
     * 
     * @return Enables you to connect an application to Amazon EMR Studio to run interactive workloads in a notebook.
     */

    public Boolean getStudioEnabled() {
        return this.studioEnabled;
    }

    /**
     * <p>
     * Enables you to connect an application to Amazon EMR Studio to run interactive workloads in a notebook.
     * </p>
     * 
     * @param studioEnabled
     *        Enables you to connect an application to Amazon EMR Studio to run interactive workloads in a notebook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InteractiveConfiguration withStudioEnabled(Boolean studioEnabled) {
        setStudioEnabled(studioEnabled);
        return this;
    }

    /**
     * <p>
     * Enables you to connect an application to Amazon EMR Studio to run interactive workloads in a notebook.
     * </p>
     * 
     * @return Enables you to connect an application to Amazon EMR Studio to run interactive workloads in a notebook.
     */

    public Boolean isStudioEnabled() {
        return this.studioEnabled;
    }

    /**
     * <p>
     * Enables an Apache Livy endpoint that you can connect to and run interactive jobs.
     * </p>
     * 
     * @param livyEndpointEnabled
     *        Enables an Apache Livy endpoint that you can connect to and run interactive jobs.
     */

    public void setLivyEndpointEnabled(Boolean livyEndpointEnabled) {
        this.livyEndpointEnabled = livyEndpointEnabled;
    }

    /**
     * <p>
     * Enables an Apache Livy endpoint that you can connect to and run interactive jobs.
     * </p>
     * 
     * @return Enables an Apache Livy endpoint that you can connect to and run interactive jobs.
     */

    public Boolean getLivyEndpointEnabled() {
        return this.livyEndpointEnabled;
    }

    /**
     * <p>
     * Enables an Apache Livy endpoint that you can connect to and run interactive jobs.
     * </p>
     * 
     * @param livyEndpointEnabled
     *        Enables an Apache Livy endpoint that you can connect to and run interactive jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InteractiveConfiguration withLivyEndpointEnabled(Boolean livyEndpointEnabled) {
        setLivyEndpointEnabled(livyEndpointEnabled);
        return this;
    }

    /**
     * <p>
     * Enables an Apache Livy endpoint that you can connect to and run interactive jobs.
     * </p>
     * 
     * @return Enables an Apache Livy endpoint that you can connect to and run interactive jobs.
     */

    public Boolean isLivyEndpointEnabled() {
        return this.livyEndpointEnabled;
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
        if (getStudioEnabled() != null)
            sb.append("StudioEnabled: ").append(getStudioEnabled()).append(",");
        if (getLivyEndpointEnabled() != null)
            sb.append("LivyEndpointEnabled: ").append(getLivyEndpointEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InteractiveConfiguration == false)
            return false;
        InteractiveConfiguration other = (InteractiveConfiguration) obj;
        if (other.getStudioEnabled() == null ^ this.getStudioEnabled() == null)
            return false;
        if (other.getStudioEnabled() != null && other.getStudioEnabled().equals(this.getStudioEnabled()) == false)
            return false;
        if (other.getLivyEndpointEnabled() == null ^ this.getLivyEndpointEnabled() == null)
            return false;
        if (other.getLivyEndpointEnabled() != null && other.getLivyEndpointEnabled().equals(this.getLivyEndpointEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStudioEnabled() == null) ? 0 : getStudioEnabled().hashCode());
        hashCode = prime * hashCode + ((getLivyEndpointEnabled() == null) ? 0 : getLivyEndpointEnabled().hashCode());
        return hashCode;
    }

    @Override
    public InteractiveConfiguration clone() {
        try {
            return (InteractiveConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrserverless.model.transform.InteractiveConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
