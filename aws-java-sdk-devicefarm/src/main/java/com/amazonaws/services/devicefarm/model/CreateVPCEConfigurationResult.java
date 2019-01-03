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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateVPCEConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVPCEConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object containing information about your VPC endpoint configuration.
     * </p>
     */
    private VPCEConfiguration vpceConfiguration;

    /**
     * <p>
     * An object containing information about your VPC endpoint configuration.
     * </p>
     * 
     * @param vpceConfiguration
     *        An object containing information about your VPC endpoint configuration.
     */

    public void setVpceConfiguration(VPCEConfiguration vpceConfiguration) {
        this.vpceConfiguration = vpceConfiguration;
    }

    /**
     * <p>
     * An object containing information about your VPC endpoint configuration.
     * </p>
     * 
     * @return An object containing information about your VPC endpoint configuration.
     */

    public VPCEConfiguration getVpceConfiguration() {
        return this.vpceConfiguration;
    }

    /**
     * <p>
     * An object containing information about your VPC endpoint configuration.
     * </p>
     * 
     * @param vpceConfiguration
     *        An object containing information about your VPC endpoint configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVPCEConfigurationResult withVpceConfiguration(VPCEConfiguration vpceConfiguration) {
        setVpceConfiguration(vpceConfiguration);
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
        if (getVpceConfiguration() != null)
            sb.append("VpceConfiguration: ").append(getVpceConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVPCEConfigurationResult == false)
            return false;
        CreateVPCEConfigurationResult other = (CreateVPCEConfigurationResult) obj;
        if (other.getVpceConfiguration() == null ^ this.getVpceConfiguration() == null)
            return false;
        if (other.getVpceConfiguration() != null && other.getVpceConfiguration().equals(this.getVpceConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpceConfiguration() == null) ? 0 : getVpceConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateVPCEConfigurationResult clone() {
        try {
            return (CreateVPCEConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
