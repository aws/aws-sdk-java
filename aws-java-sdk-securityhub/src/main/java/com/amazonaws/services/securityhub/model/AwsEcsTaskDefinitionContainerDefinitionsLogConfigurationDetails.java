/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The log configuration specification for the container.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The log driver to use for the container.
     * </p>
     */
    private String logDriver;
    /**
     * <p>
     * The configuration options to send to the log driver. Requires version 1.19 of the Docker Remote API or greater on
     * your container instance.
     * </p>
     */
    private java.util.Map<String, String> options;
    /**
     * <p>
     * The secrets to pass to the log configuration.
     * </p>
     */
    private java.util.List<AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationSecretOptionsDetails> secretOptions;

    /**
     * <p>
     * The log driver to use for the container.
     * </p>
     * 
     * @param logDriver
     *        The log driver to use for the container.
     */

    public void setLogDriver(String logDriver) {
        this.logDriver = logDriver;
    }

    /**
     * <p>
     * The log driver to use for the container.
     * </p>
     * 
     * @return The log driver to use for the container.
     */

    public String getLogDriver() {
        return this.logDriver;
    }

    /**
     * <p>
     * The log driver to use for the container.
     * </p>
     * 
     * @param logDriver
     *        The log driver to use for the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails withLogDriver(String logDriver) {
        setLogDriver(logDriver);
        return this;
    }

    /**
     * <p>
     * The configuration options to send to the log driver. Requires version 1.19 of the Docker Remote API or greater on
     * your container instance.
     * </p>
     * 
     * @return The configuration options to send to the log driver. Requires version 1.19 of the Docker Remote API or
     *         greater on your container instance.
     */

    public java.util.Map<String, String> getOptions() {
        return options;
    }

    /**
     * <p>
     * The configuration options to send to the log driver. Requires version 1.19 of the Docker Remote API or greater on
     * your container instance.
     * </p>
     * 
     * @param options
     *        The configuration options to send to the log driver. Requires version 1.19 of the Docker Remote API or
     *        greater on your container instance.
     */

    public void setOptions(java.util.Map<String, String> options) {
        this.options = options;
    }

    /**
     * <p>
     * The configuration options to send to the log driver. Requires version 1.19 of the Docker Remote API or greater on
     * your container instance.
     * </p>
     * 
     * @param options
     *        The configuration options to send to the log driver. Requires version 1.19 of the Docker Remote API or
     *        greater on your container instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails withOptions(java.util.Map<String, String> options) {
        setOptions(options);
        return this;
    }

    /**
     * Add a single Options entry
     *
     * @see AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails#withOptions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails addOptionsEntry(String key, String value) {
        if (null == this.options) {
            this.options = new java.util.HashMap<String, String>();
        }
        if (this.options.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.options.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Options.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails clearOptionsEntries() {
        this.options = null;
        return this;
    }

    /**
     * <p>
     * The secrets to pass to the log configuration.
     * </p>
     * 
     * @return The secrets to pass to the log configuration.
     */

    public java.util.List<AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationSecretOptionsDetails> getSecretOptions() {
        return secretOptions;
    }

    /**
     * <p>
     * The secrets to pass to the log configuration.
     * </p>
     * 
     * @param secretOptions
     *        The secrets to pass to the log configuration.
     */

    public void setSecretOptions(java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationSecretOptionsDetails> secretOptions) {
        if (secretOptions == null) {
            this.secretOptions = null;
            return;
        }

        this.secretOptions = new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationSecretOptionsDetails>(secretOptions);
    }

    /**
     * <p>
     * The secrets to pass to the log configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecretOptions(java.util.Collection)} or {@link #withSecretOptions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param secretOptions
     *        The secrets to pass to the log configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails withSecretOptions(
            AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationSecretOptionsDetails... secretOptions) {
        if (this.secretOptions == null) {
            setSecretOptions(new java.util.ArrayList<AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationSecretOptionsDetails>(secretOptions.length));
        }
        for (AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationSecretOptionsDetails ele : secretOptions) {
            this.secretOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The secrets to pass to the log configuration.
     * </p>
     * 
     * @param secretOptions
     *        The secrets to pass to the log configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails withSecretOptions(
            java.util.Collection<AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationSecretOptionsDetails> secretOptions) {
        setSecretOptions(secretOptions);
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
        if (getLogDriver() != null)
            sb.append("LogDriver: ").append(getLogDriver()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
        if (getSecretOptions() != null)
            sb.append("SecretOptions: ").append(getSecretOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails == false)
            return false;
        AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails other = (AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails) obj;
        if (other.getLogDriver() == null ^ this.getLogDriver() == null)
            return false;
        if (other.getLogDriver() != null && other.getLogDriver().equals(this.getLogDriver()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getSecretOptions() == null ^ this.getSecretOptions() == null)
            return false;
        if (other.getSecretOptions() != null && other.getSecretOptions().equals(this.getSecretOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogDriver() == null) ? 0 : getLogDriver().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getSecretOptions() == null) ? 0 : getSecretOptions().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails clone() {
        try {
            return (AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetailsMarshaller.getInstance().marshall(
                this, protocolMarshaller);
    }
}
