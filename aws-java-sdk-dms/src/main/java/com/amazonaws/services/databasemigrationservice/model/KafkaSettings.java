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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information that describes an Apache Kafka endpoint. This information includes the output format of records
 * applied to the endpoint and details of transaction and control table data information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/KafkaSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KafkaSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The broker location and port of the Kafka broker that hosts your Kafka instance. Specify the broker in the form
     * <code> <i>broker-hostname-or-ip</i>:<i>port</i> </code>. For example,
     * <code>"ec2-12-345-678-901.compute-1.amazonaws.com:2345"</code>.
     * </p>
     */
    private String broker;
    /**
     * <p>
     * The topic to which you migrate the data. If you don't specify a topic, AWS DMS specifies
     * <code>"kafka-default-topic"</code> as the migration topic.
     * </p>
     */
    private String topic;

    /**
     * <p>
     * The broker location and port of the Kafka broker that hosts your Kafka instance. Specify the broker in the form
     * <code> <i>broker-hostname-or-ip</i>:<i>port</i> </code>. For example,
     * <code>"ec2-12-345-678-901.compute-1.amazonaws.com:2345"</code>.
     * </p>
     * 
     * @param broker
     *        The broker location and port of the Kafka broker that hosts your Kafka instance. Specify the broker in the
     *        form <code> <i>broker-hostname-or-ip</i>:<i>port</i> </code>. For example,
     *        <code>"ec2-12-345-678-901.compute-1.amazonaws.com:2345"</code>.
     */

    public void setBroker(String broker) {
        this.broker = broker;
    }

    /**
     * <p>
     * The broker location and port of the Kafka broker that hosts your Kafka instance. Specify the broker in the form
     * <code> <i>broker-hostname-or-ip</i>:<i>port</i> </code>. For example,
     * <code>"ec2-12-345-678-901.compute-1.amazonaws.com:2345"</code>.
     * </p>
     * 
     * @return The broker location and port of the Kafka broker that hosts your Kafka instance. Specify the broker in
     *         the form <code> <i>broker-hostname-or-ip</i>:<i>port</i> </code>. For example,
     *         <code>"ec2-12-345-678-901.compute-1.amazonaws.com:2345"</code>.
     */

    public String getBroker() {
        return this.broker;
    }

    /**
     * <p>
     * The broker location and port of the Kafka broker that hosts your Kafka instance. Specify the broker in the form
     * <code> <i>broker-hostname-or-ip</i>:<i>port</i> </code>. For example,
     * <code>"ec2-12-345-678-901.compute-1.amazonaws.com:2345"</code>.
     * </p>
     * 
     * @param broker
     *        The broker location and port of the Kafka broker that hosts your Kafka instance. Specify the broker in the
     *        form <code> <i>broker-hostname-or-ip</i>:<i>port</i> </code>. For example,
     *        <code>"ec2-12-345-678-901.compute-1.amazonaws.com:2345"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaSettings withBroker(String broker) {
        setBroker(broker);
        return this;
    }

    /**
     * <p>
     * The topic to which you migrate the data. If you don't specify a topic, AWS DMS specifies
     * <code>"kafka-default-topic"</code> as the migration topic.
     * </p>
     * 
     * @param topic
     *        The topic to which you migrate the data. If you don't specify a topic, AWS DMS specifies
     *        <code>"kafka-default-topic"</code> as the migration topic.
     */

    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * <p>
     * The topic to which you migrate the data. If you don't specify a topic, AWS DMS specifies
     * <code>"kafka-default-topic"</code> as the migration topic.
     * </p>
     * 
     * @return The topic to which you migrate the data. If you don't specify a topic, AWS DMS specifies
     *         <code>"kafka-default-topic"</code> as the migration topic.
     */

    public String getTopic() {
        return this.topic;
    }

    /**
     * <p>
     * The topic to which you migrate the data. If you don't specify a topic, AWS DMS specifies
     * <code>"kafka-default-topic"</code> as the migration topic.
     * </p>
     * 
     * @param topic
     *        The topic to which you migrate the data. If you don't specify a topic, AWS DMS specifies
     *        <code>"kafka-default-topic"</code> as the migration topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KafkaSettings withTopic(String topic) {
        setTopic(topic);
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
        if (getBroker() != null)
            sb.append("Broker: ").append(getBroker()).append(",");
        if (getTopic() != null)
            sb.append("Topic: ").append(getTopic());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KafkaSettings == false)
            return false;
        KafkaSettings other = (KafkaSettings) obj;
        if (other.getBroker() == null ^ this.getBroker() == null)
            return false;
        if (other.getBroker() != null && other.getBroker().equals(this.getBroker()) == false)
            return false;
        if (other.getTopic() == null ^ this.getTopic() == null)
            return false;
        if (other.getTopic() != null && other.getTopic().equals(this.getTopic()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBroker() == null) ? 0 : getBroker().hashCode());
        hashCode = prime * hashCode + ((getTopic() == null) ? 0 : getTopic().hashCode());
        return hashCode;
    }

    @Override
    public KafkaSettings clone() {
        try {
            return (KafkaSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.KafkaSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
