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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Thing group indexing configuration.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThingGroupIndexingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Thing group indexing mode.
     * </p>
     */
    private String thingGroupIndexingMode;

    /**
     * <p>
     * Thing group indexing mode.
     * </p>
     * 
     * @param thingGroupIndexingMode
     *        Thing group indexing mode.
     * @see ThingGroupIndexingMode
     */

    public void setThingGroupIndexingMode(String thingGroupIndexingMode) {
        this.thingGroupIndexingMode = thingGroupIndexingMode;
    }

    /**
     * <p>
     * Thing group indexing mode.
     * </p>
     * 
     * @return Thing group indexing mode.
     * @see ThingGroupIndexingMode
     */

    public String getThingGroupIndexingMode() {
        return this.thingGroupIndexingMode;
    }

    /**
     * <p>
     * Thing group indexing mode.
     * </p>
     * 
     * @param thingGroupIndexingMode
     *        Thing group indexing mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThingGroupIndexingMode
     */

    public ThingGroupIndexingConfiguration withThingGroupIndexingMode(String thingGroupIndexingMode) {
        setThingGroupIndexingMode(thingGroupIndexingMode);
        return this;
    }

    /**
     * <p>
     * Thing group indexing mode.
     * </p>
     * 
     * @param thingGroupIndexingMode
     *        Thing group indexing mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThingGroupIndexingMode
     */

    public ThingGroupIndexingConfiguration withThingGroupIndexingMode(ThingGroupIndexingMode thingGroupIndexingMode) {
        this.thingGroupIndexingMode = thingGroupIndexingMode.toString();
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
        if (getThingGroupIndexingMode() != null)
            sb.append("ThingGroupIndexingMode: ").append(getThingGroupIndexingMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThingGroupIndexingConfiguration == false)
            return false;
        ThingGroupIndexingConfiguration other = (ThingGroupIndexingConfiguration) obj;
        if (other.getThingGroupIndexingMode() == null ^ this.getThingGroupIndexingMode() == null)
            return false;
        if (other.getThingGroupIndexingMode() != null && other.getThingGroupIndexingMode().equals(this.getThingGroupIndexingMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingGroupIndexingMode() == null) ? 0 : getThingGroupIndexingMode().hashCode());
        return hashCode;
    }

    @Override
    public ThingGroupIndexingConfiguration clone() {
        try {
            return (ThingGroupIndexingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.ThingGroupIndexingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
