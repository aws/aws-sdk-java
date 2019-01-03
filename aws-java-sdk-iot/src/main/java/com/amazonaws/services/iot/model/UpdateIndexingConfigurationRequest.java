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

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateIndexingConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Thing indexing configuration.
     * </p>
     */
    private ThingIndexingConfiguration thingIndexingConfiguration;
    /**
     * <p>
     * Thing group indexing configuration.
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

    public UpdateIndexingConfigurationRequest withThingIndexingConfiguration(ThingIndexingConfiguration thingIndexingConfiguration) {
        setThingIndexingConfiguration(thingIndexingConfiguration);
        return this;
    }

    /**
     * <p>
     * Thing group indexing configuration.
     * </p>
     * 
     * @param thingGroupIndexingConfiguration
     *        Thing group indexing configuration.
     */

    public void setThingGroupIndexingConfiguration(ThingGroupIndexingConfiguration thingGroupIndexingConfiguration) {
        this.thingGroupIndexingConfiguration = thingGroupIndexingConfiguration;
    }

    /**
     * <p>
     * Thing group indexing configuration.
     * </p>
     * 
     * @return Thing group indexing configuration.
     */

    public ThingGroupIndexingConfiguration getThingGroupIndexingConfiguration() {
        return this.thingGroupIndexingConfiguration;
    }

    /**
     * <p>
     * Thing group indexing configuration.
     * </p>
     * 
     * @param thingGroupIndexingConfiguration
     *        Thing group indexing configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIndexingConfigurationRequest withThingGroupIndexingConfiguration(ThingGroupIndexingConfiguration thingGroupIndexingConfiguration) {
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

        if (obj instanceof UpdateIndexingConfigurationRequest == false)
            return false;
        UpdateIndexingConfigurationRequest other = (UpdateIndexingConfigurationRequest) obj;
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
    public UpdateIndexingConfigurationRequest clone() {
        return (UpdateIndexingConfigurationRequest) super.clone();
    }

}
