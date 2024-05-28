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
package com.amazonaws.services.fis.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/DeleteTargetAccountConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTargetAccountConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the target account configuration.
     * </p>
     */
    private TargetAccountConfiguration targetAccountConfiguration;

    /**
     * <p>
     * Information about the target account configuration.
     * </p>
     * 
     * @param targetAccountConfiguration
     *        Information about the target account configuration.
     */

    public void setTargetAccountConfiguration(TargetAccountConfiguration targetAccountConfiguration) {
        this.targetAccountConfiguration = targetAccountConfiguration;
    }

    /**
     * <p>
     * Information about the target account configuration.
     * </p>
     * 
     * @return Information about the target account configuration.
     */

    public TargetAccountConfiguration getTargetAccountConfiguration() {
        return this.targetAccountConfiguration;
    }

    /**
     * <p>
     * Information about the target account configuration.
     * </p>
     * 
     * @param targetAccountConfiguration
     *        Information about the target account configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTargetAccountConfigurationResult withTargetAccountConfiguration(TargetAccountConfiguration targetAccountConfiguration) {
        setTargetAccountConfiguration(targetAccountConfiguration);
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
        if (getTargetAccountConfiguration() != null)
            sb.append("TargetAccountConfiguration: ").append(getTargetAccountConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTargetAccountConfigurationResult == false)
            return false;
        DeleteTargetAccountConfigurationResult other = (DeleteTargetAccountConfigurationResult) obj;
        if (other.getTargetAccountConfiguration() == null ^ this.getTargetAccountConfiguration() == null)
            return false;
        if (other.getTargetAccountConfiguration() != null && other.getTargetAccountConfiguration().equals(this.getTargetAccountConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetAccountConfiguration() == null) ? 0 : getTargetAccountConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTargetAccountConfigurationResult clone() {
        try {
            return (DeleteTargetAccountConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
