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
 * Describes the observability configuration of an App Runner service. These are additional observability features, like
 * tracing, that you choose to enable. They're configured in a separate resource that you associate with your service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ServiceObservabilityConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceObservabilityConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * When <code>true</code>, an observability configuration resource is associated with the service, and an
     * <code>ObservabilityConfigurationArn</code> is specified.
     * </p>
     */
    private Boolean observabilityEnabled;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the observability configuration that is associated with the service. Specified
     * only when <code>ObservabilityEnabled</code> is <code>true</code>.
     * </p>
     * <p>
     * Specify an ARN with a name and a revision number to associate that revision. For example:
     * <code>arn:aws:apprunner:us-east-1:123456789012:observabilityconfiguration/xray-tracing/3</code>
     * </p>
     * <p>
     * Specify just the name to associate the latest revision. For example:
     * <code>arn:aws:apprunner:us-east-1:123456789012:observabilityconfiguration/xray-tracing</code>
     * </p>
     */
    private String observabilityConfigurationArn;

    /**
     * <p>
     * When <code>true</code>, an observability configuration resource is associated with the service, and an
     * <code>ObservabilityConfigurationArn</code> is specified.
     * </p>
     * 
     * @param observabilityEnabled
     *        When <code>true</code>, an observability configuration resource is associated with the service, and an
     *        <code>ObservabilityConfigurationArn</code> is specified.
     */

    public void setObservabilityEnabled(Boolean observabilityEnabled) {
        this.observabilityEnabled = observabilityEnabled;
    }

    /**
     * <p>
     * When <code>true</code>, an observability configuration resource is associated with the service, and an
     * <code>ObservabilityConfigurationArn</code> is specified.
     * </p>
     * 
     * @return When <code>true</code>, an observability configuration resource is associated with the service, and an
     *         <code>ObservabilityConfigurationArn</code> is specified.
     */

    public Boolean getObservabilityEnabled() {
        return this.observabilityEnabled;
    }

    /**
     * <p>
     * When <code>true</code>, an observability configuration resource is associated with the service, and an
     * <code>ObservabilityConfigurationArn</code> is specified.
     * </p>
     * 
     * @param observabilityEnabled
     *        When <code>true</code>, an observability configuration resource is associated with the service, and an
     *        <code>ObservabilityConfigurationArn</code> is specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceObservabilityConfiguration withObservabilityEnabled(Boolean observabilityEnabled) {
        setObservabilityEnabled(observabilityEnabled);
        return this;
    }

    /**
     * <p>
     * When <code>true</code>, an observability configuration resource is associated with the service, and an
     * <code>ObservabilityConfigurationArn</code> is specified.
     * </p>
     * 
     * @return When <code>true</code>, an observability configuration resource is associated with the service, and an
     *         <code>ObservabilityConfigurationArn</code> is specified.
     */

    public Boolean isObservabilityEnabled() {
        return this.observabilityEnabled;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the observability configuration that is associated with the service. Specified
     * only when <code>ObservabilityEnabled</code> is <code>true</code>.
     * </p>
     * <p>
     * Specify an ARN with a name and a revision number to associate that revision. For example:
     * <code>arn:aws:apprunner:us-east-1:123456789012:observabilityconfiguration/xray-tracing/3</code>
     * </p>
     * <p>
     * Specify just the name to associate the latest revision. For example:
     * <code>arn:aws:apprunner:us-east-1:123456789012:observabilityconfiguration/xray-tracing</code>
     * </p>
     * 
     * @param observabilityConfigurationArn
     *        The Amazon Resource Name (ARN) of the observability configuration that is associated with the service.
     *        Specified only when <code>ObservabilityEnabled</code> is <code>true</code>.</p>
     *        <p>
     *        Specify an ARN with a name and a revision number to associate that revision. For example:
     *        <code>arn:aws:apprunner:us-east-1:123456789012:observabilityconfiguration/xray-tracing/3</code>
     *        </p>
     *        <p>
     *        Specify just the name to associate the latest revision. For example:
     *        <code>arn:aws:apprunner:us-east-1:123456789012:observabilityconfiguration/xray-tracing</code>
     */

    public void setObservabilityConfigurationArn(String observabilityConfigurationArn) {
        this.observabilityConfigurationArn = observabilityConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the observability configuration that is associated with the service. Specified
     * only when <code>ObservabilityEnabled</code> is <code>true</code>.
     * </p>
     * <p>
     * Specify an ARN with a name and a revision number to associate that revision. For example:
     * <code>arn:aws:apprunner:us-east-1:123456789012:observabilityconfiguration/xray-tracing/3</code>
     * </p>
     * <p>
     * Specify just the name to associate the latest revision. For example:
     * <code>arn:aws:apprunner:us-east-1:123456789012:observabilityconfiguration/xray-tracing</code>
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the observability configuration that is associated with the service.
     *         Specified only when <code>ObservabilityEnabled</code> is <code>true</code>.</p>
     *         <p>
     *         Specify an ARN with a name and a revision number to associate that revision. For example:
     *         <code>arn:aws:apprunner:us-east-1:123456789012:observabilityconfiguration/xray-tracing/3</code>
     *         </p>
     *         <p>
     *         Specify just the name to associate the latest revision. For example:
     *         <code>arn:aws:apprunner:us-east-1:123456789012:observabilityconfiguration/xray-tracing</code>
     */

    public String getObservabilityConfigurationArn() {
        return this.observabilityConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the observability configuration that is associated with the service. Specified
     * only when <code>ObservabilityEnabled</code> is <code>true</code>.
     * </p>
     * <p>
     * Specify an ARN with a name and a revision number to associate that revision. For example:
     * <code>arn:aws:apprunner:us-east-1:123456789012:observabilityconfiguration/xray-tracing/3</code>
     * </p>
     * <p>
     * Specify just the name to associate the latest revision. For example:
     * <code>arn:aws:apprunner:us-east-1:123456789012:observabilityconfiguration/xray-tracing</code>
     * </p>
     * 
     * @param observabilityConfigurationArn
     *        The Amazon Resource Name (ARN) of the observability configuration that is associated with the service.
     *        Specified only when <code>ObservabilityEnabled</code> is <code>true</code>.</p>
     *        <p>
     *        Specify an ARN with a name and a revision number to associate that revision. For example:
     *        <code>arn:aws:apprunner:us-east-1:123456789012:observabilityconfiguration/xray-tracing/3</code>
     *        </p>
     *        <p>
     *        Specify just the name to associate the latest revision. For example:
     *        <code>arn:aws:apprunner:us-east-1:123456789012:observabilityconfiguration/xray-tracing</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceObservabilityConfiguration withObservabilityConfigurationArn(String observabilityConfigurationArn) {
        setObservabilityConfigurationArn(observabilityConfigurationArn);
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
        if (getObservabilityEnabled() != null)
            sb.append("ObservabilityEnabled: ").append(getObservabilityEnabled()).append(",");
        if (getObservabilityConfigurationArn() != null)
            sb.append("ObservabilityConfigurationArn: ").append(getObservabilityConfigurationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceObservabilityConfiguration == false)
            return false;
        ServiceObservabilityConfiguration other = (ServiceObservabilityConfiguration) obj;
        if (other.getObservabilityEnabled() == null ^ this.getObservabilityEnabled() == null)
            return false;
        if (other.getObservabilityEnabled() != null && other.getObservabilityEnabled().equals(this.getObservabilityEnabled()) == false)
            return false;
        if (other.getObservabilityConfigurationArn() == null ^ this.getObservabilityConfigurationArn() == null)
            return false;
        if (other.getObservabilityConfigurationArn() != null
                && other.getObservabilityConfigurationArn().equals(this.getObservabilityConfigurationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObservabilityEnabled() == null) ? 0 : getObservabilityEnabled().hashCode());
        hashCode = prime * hashCode + ((getObservabilityConfigurationArn() == null) ? 0 : getObservabilityConfigurationArn().hashCode());
        return hashCode;
    }

    @Override
    public ServiceObservabilityConfiguration clone() {
        try {
            return (ServiceObservabilityConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apprunner.model.transform.ServiceObservabilityConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
