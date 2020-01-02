/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 <p>
 * JMX and Node monitoring for the MSK cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/OpenMonitoring" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpenMonitoring implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Prometheus settings.
     * </p>
     */
    private Prometheus prometheus;

    /**
     * <p>
     * Prometheus settings.
     * </p>
     * 
     * @param prometheus
     *        <p>
     *        Prometheus settings.
     *        </p>
     */

    public void setPrometheus(Prometheus prometheus) {
        this.prometheus = prometheus;
    }

    /**
     * <p>
     * Prometheus settings.
     * </p>
     * 
     * @return <p>
     *         Prometheus settings.
     *         </p>
     */

    public Prometheus getPrometheus() {
        return this.prometheus;
    }

    /**
     * <p>
     * Prometheus settings.
     * </p>
     * 
     * @param prometheus
     *        <p>
     *        Prometheus settings.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenMonitoring withPrometheus(Prometheus prometheus) {
        setPrometheus(prometheus);
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
        if (getPrometheus() != null)
            sb.append("Prometheus: ").append(getPrometheus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpenMonitoring == false)
            return false;
        OpenMonitoring other = (OpenMonitoring) obj;
        if (other.getPrometheus() == null ^ this.getPrometheus() == null)
            return false;
        if (other.getPrometheus() != null && other.getPrometheus().equals(this.getPrometheus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrometheus() == null) ? 0 : getPrometheus().hashCode());
        return hashCode;
    }

    @Override
    public OpenMonitoring clone() {
        try {
            return (OpenMonitoring) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.OpenMonitoringMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
