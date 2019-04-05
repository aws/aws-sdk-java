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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutConfigurationAggregator" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutConfigurationAggregatorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a ConfigurationAggregator object.
     * </p>
     */
    private ConfigurationAggregator configurationAggregator;

    /**
     * <p>
     * Returns a ConfigurationAggregator object.
     * </p>
     * 
     * @param configurationAggregator
     *        Returns a ConfigurationAggregator object.
     */

    public void setConfigurationAggregator(ConfigurationAggregator configurationAggregator) {
        this.configurationAggregator = configurationAggregator;
    }

    /**
     * <p>
     * Returns a ConfigurationAggregator object.
     * </p>
     * 
     * @return Returns a ConfigurationAggregator object.
     */

    public ConfigurationAggregator getConfigurationAggregator() {
        return this.configurationAggregator;
    }

    /**
     * <p>
     * Returns a ConfigurationAggregator object.
     * </p>
     * 
     * @param configurationAggregator
     *        Returns a ConfigurationAggregator object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConfigurationAggregatorResult withConfigurationAggregator(ConfigurationAggregator configurationAggregator) {
        setConfigurationAggregator(configurationAggregator);
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
        if (getConfigurationAggregator() != null)
            sb.append("ConfigurationAggregator: ").append(getConfigurationAggregator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutConfigurationAggregatorResult == false)
            return false;
        PutConfigurationAggregatorResult other = (PutConfigurationAggregatorResult) obj;
        if (other.getConfigurationAggregator() == null ^ this.getConfigurationAggregator() == null)
            return false;
        if (other.getConfigurationAggregator() != null && other.getConfigurationAggregator().equals(this.getConfigurationAggregator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationAggregator() == null) ? 0 : getConfigurationAggregator().hashCode());
        return hashCode;
    }

    @Override
    public PutConfigurationAggregatorResult clone() {
        try {
            return (PutConfigurationAggregatorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
