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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateSecurityConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSecurityConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the new security configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The encryption configuration for the new security configuration.
     * </p>
     */
    private EncryptionConfiguration encryptionConfiguration;

    /**
     * <p>
     * The name for the new security configuration.
     * </p>
     * 
     * @param name
     *        The name for the new security configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the new security configuration.
     * </p>
     * 
     * @return The name for the new security configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the new security configuration.
     * </p>
     * 
     * @param name
     *        The name for the new security configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityConfigurationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The encryption configuration for the new security configuration.
     * </p>
     * 
     * @param encryptionConfiguration
     *        The encryption configuration for the new security configuration.
     */

    public void setEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * <p>
     * The encryption configuration for the new security configuration.
     * </p>
     * 
     * @return The encryption configuration for the new security configuration.
     */

    public EncryptionConfiguration getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    /**
     * <p>
     * The encryption configuration for the new security configuration.
     * </p>
     * 
     * @param encryptionConfiguration
     *        The encryption configuration for the new security configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityConfigurationRequest withEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        setEncryptionConfiguration(encryptionConfiguration);
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
        if (getEncryptionConfiguration() != null)
            sb.append("EncryptionConfiguration: ").append(getEncryptionConfiguration());
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
        if (other.getEncryptionConfiguration() == null ^ this.getEncryptionConfiguration() == null)
            return false;
        if (other.getEncryptionConfiguration() != null && other.getEncryptionConfiguration().equals(this.getEncryptionConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfiguration() == null) ? 0 : getEncryptionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateSecurityConfigurationRequest clone() {
        return (CreateSecurityConfigurationRequest) super.clone();
    }

}
