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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutRetentionConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRetentionConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a retention configuration object.
     * </p>
     */
    private RetentionConfiguration retentionConfiguration;

    /**
     * <p>
     * Returns a retention configuration object.
     * </p>
     * 
     * @param retentionConfiguration
     *        Returns a retention configuration object.
     */

    public void setRetentionConfiguration(RetentionConfiguration retentionConfiguration) {
        this.retentionConfiguration = retentionConfiguration;
    }

    /**
     * <p>
     * Returns a retention configuration object.
     * </p>
     * 
     * @return Returns a retention configuration object.
     */

    public RetentionConfiguration getRetentionConfiguration() {
        return this.retentionConfiguration;
    }

    /**
     * <p>
     * Returns a retention configuration object.
     * </p>
     * 
     * @param retentionConfiguration
     *        Returns a retention configuration object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRetentionConfigurationResult withRetentionConfiguration(RetentionConfiguration retentionConfiguration) {
        setRetentionConfiguration(retentionConfiguration);
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
        if (getRetentionConfiguration() != null)
            sb.append("RetentionConfiguration: ").append(getRetentionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRetentionConfigurationResult == false)
            return false;
        PutRetentionConfigurationResult other = (PutRetentionConfigurationResult) obj;
        if (other.getRetentionConfiguration() == null ^ this.getRetentionConfiguration() == null)
            return false;
        if (other.getRetentionConfiguration() != null && other.getRetentionConfiguration().equals(this.getRetentionConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRetentionConfiguration() == null) ? 0 : getRetentionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public PutRetentionConfigurationResult clone() {
        try {
            return (PutRetentionConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
