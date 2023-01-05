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
package com.amazonaws.services.kafkaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the Apache Kafka cluster to which the connector is connected.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/KafkaCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KafkaCluster implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Apache Kafka cluster to which the connector is connected.
     * </p>
     */
    private ApacheKafkaCluster apacheKafkaCluster;

    /**
     * <p>
     * The Apache Kafka cluster to which the connector is connected.
     * </p>
     * 
     * @param apacheKafkaCluster
     *        The Apache Kafka cluster to which the connector is connected.
     */

    public void setApacheKafkaCluster(ApacheKafkaCluster apacheKafkaCluster) {
        this.apacheKafkaCluster = apacheKafkaCluster;
    }

    /**
     * <p>
     * The Apache Kafka cluster to which the connector is connected.
     * </p>
     * 
     * @return The Apache Kafka cluster to which the connector is connected.
     */

    public ApacheKafkaCluster getApacheKafkaCluster() {
        return this.apacheKafkaCluster;
    }

    /**
     * <p>
     * The Apache Kafka cluster to which the connector is connected.
     * </p>
     * 
     * @param apacheKafkaCluster
     *        The Apache Kafka cluster to which the connector is connected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaCluster withApacheKafkaCluster(ApacheKafkaCluster apacheKafkaCluster) {
        setApacheKafkaCluster(apacheKafkaCluster);
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
        if (getApacheKafkaCluster() != null)
            sb.append("ApacheKafkaCluster: ").append(getApacheKafkaCluster());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KafkaCluster == false)
            return false;
        KafkaCluster other = (KafkaCluster) obj;
        if (other.getApacheKafkaCluster() == null ^ this.getApacheKafkaCluster() == null)
            return false;
        if (other.getApacheKafkaCluster() != null && other.getApacheKafkaCluster().equals(this.getApacheKafkaCluster()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApacheKafkaCluster() == null) ? 0 : getApacheKafkaCluster().hashCode());
        return hashCode;
    }

    @Override
    public KafkaCluster clone() {
        try {
            return (KafkaCluster) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafkaconnect.model.transform.KafkaClusterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
