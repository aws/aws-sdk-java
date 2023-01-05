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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/GetConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies how the ECR automated re-scan duration is currently configured for your environment.
     * </p>
     */
    private EcrConfigurationState ecrConfiguration;

    /**
     * <p>
     * Specifies how the ECR automated re-scan duration is currently configured for your environment.
     * </p>
     * 
     * @param ecrConfiguration
     *        Specifies how the ECR automated re-scan duration is currently configured for your environment.
     */

    public void setEcrConfiguration(EcrConfigurationState ecrConfiguration) {
        this.ecrConfiguration = ecrConfiguration;
    }

    /**
     * <p>
     * Specifies how the ECR automated re-scan duration is currently configured for your environment.
     * </p>
     * 
     * @return Specifies how the ECR automated re-scan duration is currently configured for your environment.
     */

    public EcrConfigurationState getEcrConfiguration() {
        return this.ecrConfiguration;
    }

    /**
     * <p>
     * Specifies how the ECR automated re-scan duration is currently configured for your environment.
     * </p>
     * 
     * @param ecrConfiguration
     *        Specifies how the ECR automated re-scan duration is currently configured for your environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationResult withEcrConfiguration(EcrConfigurationState ecrConfiguration) {
        setEcrConfiguration(ecrConfiguration);
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
        if (getEcrConfiguration() != null)
            sb.append("EcrConfiguration: ").append(getEcrConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConfigurationResult == false)
            return false;
        GetConfigurationResult other = (GetConfigurationResult) obj;
        if (other.getEcrConfiguration() == null ^ this.getEcrConfiguration() == null)
            return false;
        if (other.getEcrConfiguration() != null && other.getEcrConfiguration().equals(this.getEcrConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEcrConfiguration() == null) ? 0 : getEcrConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public GetConfigurationResult clone() {
        try {
            return (GetConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
