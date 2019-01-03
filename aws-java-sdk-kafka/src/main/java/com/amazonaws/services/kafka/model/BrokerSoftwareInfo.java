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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the current software installed on the cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/BrokerSoftwareInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BrokerSoftwareInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configuration used for the cluster.
     * </p>
     */
    private String configurationArn;
    /**
     * <p>
     * The revision of the configuration to use.
     * </p>
     */
    private String configurationRevision;
    /**
     * <p>
     * The version of Apache Kafka.
     * </p>
     */
    private String kafkaVersion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configuration used for the cluster.
     * </p>
     * 
     * @param configurationArn
     *        The Amazon Resource Name (ARN) of the configuration used for the cluster.
     */

    public void setConfigurationArn(String configurationArn) {
        this.configurationArn = configurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configuration used for the cluster.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the configuration used for the cluster.
     */

    public String getConfigurationArn() {
        return this.configurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configuration used for the cluster.
     * </p>
     * 
     * @param configurationArn
     *        The Amazon Resource Name (ARN) of the configuration used for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerSoftwareInfo withConfigurationArn(String configurationArn) {
        setConfigurationArn(configurationArn);
        return this;
    }

    /**
     * <p>
     * The revision of the configuration to use.
     * </p>
     * 
     * @param configurationRevision
     *        The revision of the configuration to use.
     */

    public void setConfigurationRevision(String configurationRevision) {
        this.configurationRevision = configurationRevision;
    }

    /**
     * <p>
     * The revision of the configuration to use.
     * </p>
     * 
     * @return The revision of the configuration to use.
     */

    public String getConfigurationRevision() {
        return this.configurationRevision;
    }

    /**
     * <p>
     * The revision of the configuration to use.
     * </p>
     * 
     * @param configurationRevision
     *        The revision of the configuration to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerSoftwareInfo withConfigurationRevision(String configurationRevision) {
        setConfigurationRevision(configurationRevision);
        return this;
    }

    /**
     * <p>
     * The version of Apache Kafka.
     * </p>
     * 
     * @param kafkaVersion
     *        The version of Apache Kafka.
     */

    public void setKafkaVersion(String kafkaVersion) {
        this.kafkaVersion = kafkaVersion;
    }

    /**
     * <p>
     * The version of Apache Kafka.
     * </p>
     * 
     * @return The version of Apache Kafka.
     */

    public String getKafkaVersion() {
        return this.kafkaVersion;
    }

    /**
     * <p>
     * The version of Apache Kafka.
     * </p>
     * 
     * @param kafkaVersion
     *        The version of Apache Kafka.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerSoftwareInfo withKafkaVersion(String kafkaVersion) {
        setKafkaVersion(kafkaVersion);
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
        if (getConfigurationArn() != null)
            sb.append("ConfigurationArn: ").append(getConfigurationArn()).append(",");
        if (getConfigurationRevision() != null)
            sb.append("ConfigurationRevision: ").append(getConfigurationRevision()).append(",");
        if (getKafkaVersion() != null)
            sb.append("KafkaVersion: ").append(getKafkaVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BrokerSoftwareInfo == false)
            return false;
        BrokerSoftwareInfo other = (BrokerSoftwareInfo) obj;
        if (other.getConfigurationArn() == null ^ this.getConfigurationArn() == null)
            return false;
        if (other.getConfigurationArn() != null && other.getConfigurationArn().equals(this.getConfigurationArn()) == false)
            return false;
        if (other.getConfigurationRevision() == null ^ this.getConfigurationRevision() == null)
            return false;
        if (other.getConfigurationRevision() != null && other.getConfigurationRevision().equals(this.getConfigurationRevision()) == false)
            return false;
        if (other.getKafkaVersion() == null ^ this.getKafkaVersion() == null)
            return false;
        if (other.getKafkaVersion() != null && other.getKafkaVersion().equals(this.getKafkaVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationArn() == null) ? 0 : getConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getConfigurationRevision() == null) ? 0 : getConfigurationRevision().hashCode());
        hashCode = prime * hashCode + ((getKafkaVersion() == null) ? 0 : getKafkaVersion().hashCode());
        return hashCode;
    }

    @Override
    public BrokerSoftwareInfo clone() {
        try {
            return (BrokerSoftwareInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.BrokerSoftwareInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
