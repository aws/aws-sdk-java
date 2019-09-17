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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIndexingConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Thing indexing configuration.
     * </p>
     */
    private ThingIndexingConfiguration thingIndexingConfiguration;
    /**
     * <p>
     * The index configuration.
     * </p>
     */
    private ThingGroupIndexingConfiguration thingGroupIndexingConfiguration;

    /**
     * <p>
     * Thing indexing configuration.
     * </p>
     * 
     * @param thingIndexingConfiguration
     *        Thing indexing configuration.
     */

    public void setThingIndexingConfiguration(ThingIndexingConfiguration thingIndexingConfiguration) {
        this.thingIndexingConfiguration = thingIndexingConfiguration;
    }

    /**
     * <p>
     * Thing indexing configuration.
     * </p>
     * 
     * @return Thing indexing configuration.
     */

    public ThingIndexingConfiguration getThingIndexingConfiguration() {
        return this.thingIndexingConfiguration;
    }

    /**
     * <p>
     * Thing indexing configuration.
     * </p>
     * 
     * @param thingIndexingConfiguration
     *        Thing indexing configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIndexingConfigurationResult withThingIndexingConfiguration(ThingIndexingConfiguration thingIndexingConfiguration) {
        setThingIndexingConfiguration(thingIndexingConfiguration);
        return this;
    }

    /**
     * <p>
     * The index configuration.
     * </p>
     * 
     * @param thingGroupIndexingConfiguration
     *        The index configuration.
     */

    public void setThingGroupIndexingConfiguration(ThingGroupIndexingConfiguration thingGroupIndexingConfiguration) {
        this.thingGroupIndexingConfiguration = thingGroupIndexingConfiguration;
    }

    /**
     * <p>
     * The index configuration.
     * </p>
     * 
     * @return The index configuration.
     */

    public ThingGroupIndexingConfiguration getThingGroupIndexingConfiguration() {
        return this.thingGroupIndexingConfiguration;
    }

    /**
     * <p>
     * The index configuration.
     * </p>
     * 
     * @param thingGroupIndexingConfiguration
     *        The index configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIndexingConfigurationResult withThingGroupIndexingConfiguration(ThingGroupIndexingConfiguration thingGroupIndexingConfiguration) {
        setThingGroupIndexingConfiguration(thingGroupIndexingConfiguration);
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
        if (getThingIndexingConfiguration() != null)
            sb.append("ThingIndexingConfiguration: ").append(getThingIndexingConfiguration()).append(",");
        if (getThingGroupIndexingConfiguration() != null)
            sb.append("ThingGroupIndexingConfiguration: ").append(getThingGroupIndexingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIndexingConfigurationResult == false)
            return false;
        GetIndexingConfigurationResult other = (GetIndexingConfigurationResult) obj;
        if (other.getThingIndexingConfiguration() == null ^ this.getThingIndexingConfiguration() == null)
            return false;
        if (other.getThingIndexingConfiguration() != null && other.getThingIndexingConfiguration().equals(this.getThingIndexingConfiguration()) == false)
            return false;
        if (other.getThingGroupIndexingConfiguration() == null ^ this.getThingGroupIndexingConfiguration() == null)
            return false;
        if (other.getThingGroupIndexingConfiguration() != null
                && other.getThingGroupIndexingConfiguration().equals(this.getThingGroupIndexingConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingIndexingConfiguration() == null) ? 0 : getThingIndexingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getThingGroupIndexingConfiguration() == null) ? 0 : getThingGroupIndexingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public GetIndexingConfigurationResult clone() {
        try {
            return (GetIndexingConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
