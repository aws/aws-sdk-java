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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/CreateSecurityConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSecurityConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the security configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The security configuration details in JSON format. For JSON parameters and examples, see <a
     * href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-security-configurations.html">Use Security
     * Configurations to Set Up Cluster Security</a> in the <i>Amazon EMR Management Guide</i>.
     * </p>
     */
    private String securityConfiguration;

    /**
     * <p>
     * The name of the security configuration.
     * </p>
     * 
     * @param name
     *        The name of the security configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the security configuration.
     * </p>
     * 
     * @return The name of the security configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the security configuration.
     * </p>
     * 
     * @param name
     *        The name of the security configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityConfigurationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The security configuration details in JSON format. For JSON parameters and examples, see <a
     * href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-security-configurations.html">Use Security
     * Configurations to Set Up Cluster Security</a> in the <i>Amazon EMR Management Guide</i>.
     * </p>
     * 
     * @param securityConfiguration
     *        The security configuration details in JSON format. For JSON parameters and examples, see <a
     *        href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-security-configurations.html">Use
     *        Security Configurations to Set Up Cluster Security</a> in the <i>Amazon EMR Management Guide</i>.
     */

    public void setSecurityConfiguration(String securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    /**
     * <p>
     * The security configuration details in JSON format. For JSON parameters and examples, see <a
     * href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-security-configurations.html">Use Security
     * Configurations to Set Up Cluster Security</a> in the <i>Amazon EMR Management Guide</i>.
     * </p>
     * 
     * @return The security configuration details in JSON format. For JSON parameters and examples, see <a
     *         href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-security-configurations.html">Use
     *         Security Configurations to Set Up Cluster Security</a> in the <i>Amazon EMR Management Guide</i>.
     */

    public String getSecurityConfiguration() {
        return this.securityConfiguration;
    }

    /**
     * <p>
     * The security configuration details in JSON format. For JSON parameters and examples, see <a
     * href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-security-configurations.html">Use Security
     * Configurations to Set Up Cluster Security</a> in the <i>Amazon EMR Management Guide</i>.
     * </p>
     * 
     * @param securityConfiguration
     *        The security configuration details in JSON format. For JSON parameters and examples, see <a
     *        href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-security-configurations.html">Use
     *        Security Configurations to Set Up Cluster Security</a> in the <i>Amazon EMR Management Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityConfigurationRequest withSecurityConfiguration(String securityConfiguration) {
        setSecurityConfiguration(securityConfiguration);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSecurityConfiguration() != null)
            sb.append("SecurityConfiguration: ").append(getSecurityConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSecurityConfigurationRequest == false)
            return false;
        CreateSecurityConfigurationRequest other = (CreateSecurityConfigurationRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSecurityConfiguration() == null ^ this.getSecurityConfiguration() == null)
            return false;
        if (other.getSecurityConfiguration() != null && other.getSecurityConfiguration().equals(this.getSecurityConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSecurityConfiguration() == null) ? 0 : getSecurityConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateSecurityConfigurationRequest clone() {
        return (CreateSecurityConfigurationRequest) super.clone();
    }

}
