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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetAggregateResourceConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAggregateResourceConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a <code>ConfigurationItem</code> object.
     * </p>
     */
    private ConfigurationItem configurationItem;

    /**
     * <p>
     * Returns a <code>ConfigurationItem</code> object.
     * </p>
     * 
     * @param configurationItem
     *        Returns a <code>ConfigurationItem</code> object.
     */

    public void setConfigurationItem(ConfigurationItem configurationItem) {
        this.configurationItem = configurationItem;
    }

    /**
     * <p>
     * Returns a <code>ConfigurationItem</code> object.
     * </p>
     * 
     * @return Returns a <code>ConfigurationItem</code> object.
     */

    public ConfigurationItem getConfigurationItem() {
        return this.configurationItem;
    }

    /**
     * <p>
     * Returns a <code>ConfigurationItem</code> object.
     * </p>
     * 
     * @param configurationItem
     *        Returns a <code>ConfigurationItem</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAggregateResourceConfigResult withConfigurationItem(ConfigurationItem configurationItem) {
        setConfigurationItem(configurationItem);
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
        if (getConfigurationItem() != null)
            sb.append("ConfigurationItem: ").append(getConfigurationItem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAggregateResourceConfigResult == false)
            return false;
        GetAggregateResourceConfigResult other = (GetAggregateResourceConfigResult) obj;
        if (other.getConfigurationItem() == null ^ this.getConfigurationItem() == null)
            return false;
        if (other.getConfigurationItem() != null && other.getConfigurationItem().equals(this.getConfigurationItem()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationItem() == null) ? 0 : getConfigurationItem().hashCode());
        return hashCode;
    }

    @Override
    public GetAggregateResourceConfigResult clone() {
        try {
            return (GetAggregateResourceConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
