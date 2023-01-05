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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/PutRegistryScanningConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRegistryScanningConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The scanning configuration for your registry.
     * </p>
     */
    private RegistryScanningConfiguration registryScanningConfiguration;

    /**
     * <p>
     * The scanning configuration for your registry.
     * </p>
     * 
     * @param registryScanningConfiguration
     *        The scanning configuration for your registry.
     */

    public void setRegistryScanningConfiguration(RegistryScanningConfiguration registryScanningConfiguration) {
        this.registryScanningConfiguration = registryScanningConfiguration;
    }

    /**
     * <p>
     * The scanning configuration for your registry.
     * </p>
     * 
     * @return The scanning configuration for your registry.
     */

    public RegistryScanningConfiguration getRegistryScanningConfiguration() {
        return this.registryScanningConfiguration;
    }

    /**
     * <p>
     * The scanning configuration for your registry.
     * </p>
     * 
     * @param registryScanningConfiguration
     *        The scanning configuration for your registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRegistryScanningConfigurationResult withRegistryScanningConfiguration(RegistryScanningConfiguration registryScanningConfiguration) {
        setRegistryScanningConfiguration(registryScanningConfiguration);
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
        if (getRegistryScanningConfiguration() != null)
            sb.append("RegistryScanningConfiguration: ").append(getRegistryScanningConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRegistryScanningConfigurationResult == false)
            return false;
        PutRegistryScanningConfigurationResult other = (PutRegistryScanningConfigurationResult) obj;
        if (other.getRegistryScanningConfiguration() == null ^ this.getRegistryScanningConfiguration() == null)
            return false;
        if (other.getRegistryScanningConfiguration() != null
                && other.getRegistryScanningConfiguration().equals(this.getRegistryScanningConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryScanningConfiguration() == null) ? 0 : getRegistryScanningConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public PutRegistryScanningConfigurationResult clone() {
        try {
            return (PutRegistryScanningConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
