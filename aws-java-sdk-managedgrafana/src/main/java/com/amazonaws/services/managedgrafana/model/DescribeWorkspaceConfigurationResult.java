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
package com.amazonaws.services.managedgrafana.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/DescribeWorkspaceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeWorkspaceConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The configuration string for the workspace that you requested. For more information about the format and
     * configuration options available, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-configure-workspace.html">Working in your Grafana
     * workspace</a>.
     * </p>
     */
    private String configuration;

    /**
     * <p>
     * The configuration string for the workspace that you requested. For more information about the format and
     * configuration options available, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-configure-workspace.html">Working in your Grafana
     * workspace</a>.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param configuration
     *        The configuration string for the workspace that you requested. For more information about the format and
     *        configuration options available, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-configure-workspace.html">Working in your
     *        Grafana workspace</a>.
     */

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration string for the workspace that you requested. For more information about the format and
     * configuration options available, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-configure-workspace.html">Working in your Grafana
     * workspace</a>.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return The configuration string for the workspace that you requested. For more information about the format and
     *         configuration options available, see <a
     *         href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-configure-workspace.html">Working in your
     *         Grafana workspace</a>.
     */

    public String getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The configuration string for the workspace that you requested. For more information about the format and
     * configuration options available, see <a
     * href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-configure-workspace.html">Working in your Grafana
     * workspace</a>.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param configuration
     *        The configuration string for the workspace that you requested. For more information about the format and
     *        configuration options available, see <a
     *        href="https://docs.aws.amazon.com/grafana/latest/userguide/AMG-configure-workspace.html">Working in your
     *        Grafana workspace</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceConfigurationResult withConfiguration(String configuration) {
        setConfiguration(configuration);
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
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeWorkspaceConfigurationResult == false)
            return false;
        DescribeWorkspaceConfigurationResult other = (DescribeWorkspaceConfigurationResult) obj;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DescribeWorkspaceConfigurationResult clone() {
        try {
            return (DescribeWorkspaceConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
