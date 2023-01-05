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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Destination details to write data for a target data source. Current supported data source is Timestream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/TargetDestination" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Query result destination details for Timestream data source.
     * </p>
     */
    private TimestreamDestination timestreamDestination;

    /**
     * <p>
     * Query result destination details for Timestream data source.
     * </p>
     * 
     * @param timestreamDestination
     *        Query result destination details for Timestream data source.
     */

    public void setTimestreamDestination(TimestreamDestination timestreamDestination) {
        this.timestreamDestination = timestreamDestination;
    }

    /**
     * <p>
     * Query result destination details for Timestream data source.
     * </p>
     * 
     * @return Query result destination details for Timestream data source.
     */

    public TimestreamDestination getTimestreamDestination() {
        return this.timestreamDestination;
    }

    /**
     * <p>
     * Query result destination details for Timestream data source.
     * </p>
     * 
     * @param timestreamDestination
     *        Query result destination details for Timestream data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetDestination withTimestreamDestination(TimestreamDestination timestreamDestination) {
        setTimestreamDestination(timestreamDestination);
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
        if (getTimestreamDestination() != null)
            sb.append("TimestreamDestination: ").append(getTimestreamDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetDestination == false)
            return false;
        TargetDestination other = (TargetDestination) obj;
        if (other.getTimestreamDestination() == null ^ this.getTimestreamDestination() == null)
            return false;
        if (other.getTimestreamDestination() != null && other.getTimestreamDestination().equals(this.getTimestreamDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestreamDestination() == null) ? 0 : getTimestreamDestination().hashCode());
        return hashCode;
    }

    @Override
    public TargetDestination clone() {
        try {
            return (TargetDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamquery.model.transform.TargetDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
