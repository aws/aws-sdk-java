/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DatasetContentDeliveryDestination"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetContentDeliveryDestination implements Serializable, Cloneable, StructuredPojo {

    private IotEventsDestinationConfiguration iotEventsDestinationConfiguration;

    /**
     * @param iotEventsDestinationConfiguration
     */

    public void setIotEventsDestinationConfiguration(IotEventsDestinationConfiguration iotEventsDestinationConfiguration) {
        this.iotEventsDestinationConfiguration = iotEventsDestinationConfiguration;
    }

    /**
     * @return
     */

    public IotEventsDestinationConfiguration getIotEventsDestinationConfiguration() {
        return this.iotEventsDestinationConfiguration;
    }

    /**
     * @param iotEventsDestinationConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetContentDeliveryDestination withIotEventsDestinationConfiguration(IotEventsDestinationConfiguration iotEventsDestinationConfiguration) {
        setIotEventsDestinationConfiguration(iotEventsDestinationConfiguration);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIotEventsDestinationConfiguration() != null)
            sb.append("IotEventsDestinationConfiguration: ").append(getIotEventsDestinationConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetContentDeliveryDestination == false)
            return false;
        DatasetContentDeliveryDestination other = (DatasetContentDeliveryDestination) obj;
        if (other.getIotEventsDestinationConfiguration() == null ^ this.getIotEventsDestinationConfiguration() == null)
            return false;
        if (other.getIotEventsDestinationConfiguration() != null
                && other.getIotEventsDestinationConfiguration().equals(this.getIotEventsDestinationConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIotEventsDestinationConfiguration() == null) ? 0 : getIotEventsDestinationConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DatasetContentDeliveryDestination clone() {
        try {
            return (DatasetContentDeliveryDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.DatasetContentDeliveryDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
