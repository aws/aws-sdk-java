/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The service within the service graph that has anomalously high fault rates.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/AnomalousService" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnomalousService implements Serializable, Cloneable, StructuredPojo {

    private ServiceId serviceId;

    /**
     * @param serviceId
     */

    public void setServiceId(ServiceId serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * @return
     */

    public ServiceId getServiceId() {
        return this.serviceId;
    }

    /**
     * @param serviceId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalousService withServiceId(ServiceId serviceId) {
        setServiceId(serviceId);
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
        if (getServiceId() != null)
            sb.append("ServiceId: ").append(getServiceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnomalousService == false)
            return false;
        AnomalousService other = (AnomalousService) obj;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        return hashCode;
    }

    @Override
    public AnomalousService clone() {
        try {
            return (AnomalousService) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.AnomalousServiceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
