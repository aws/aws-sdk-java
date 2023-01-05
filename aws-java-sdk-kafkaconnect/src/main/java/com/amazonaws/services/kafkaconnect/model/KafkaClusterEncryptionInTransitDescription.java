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
 * The description of the encryption in transit to the Apache Kafka cluster.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/KafkaClusterEncryptionInTransitDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KafkaClusterEncryptionInTransitDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of encryption in transit to the Apache Kafka cluster.
     * </p>
     */
    private String encryptionType;

    /**
     * <p>
     * The type of encryption in transit to the Apache Kafka cluster.
     * </p>
     * 
     * @param encryptionType
     *        The type of encryption in transit to the Apache Kafka cluster.
     * @see KafkaClusterEncryptionInTransitType
     */

    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * <p>
     * The type of encryption in transit to the Apache Kafka cluster.
     * </p>
     * 
     * @return The type of encryption in transit to the Apache Kafka cluster.
     * @see KafkaClusterEncryptionInTransitType
     */

    public String getEncryptionType() {
        return this.encryptionType;
    }

    /**
     * <p>
     * The type of encryption in transit to the Apache Kafka cluster.
     * </p>
     * 
     * @param encryptionType
     *        The type of encryption in transit to the Apache Kafka cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KafkaClusterEncryptionInTransitType
     */

    public KafkaClusterEncryptionInTransitDescription withEncryptionType(String encryptionType) {
        setEncryptionType(encryptionType);
        return this;
    }

    /**
     * <p>
     * The type of encryption in transit to the Apache Kafka cluster.
     * </p>
     * 
     * @param encryptionType
     *        The type of encryption in transit to the Apache Kafka cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KafkaClusterEncryptionInTransitType
     */

    public KafkaClusterEncryptionInTransitDescription withEncryptionType(KafkaClusterEncryptionInTransitType encryptionType) {
        this.encryptionType = encryptionType.toString();
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
        if (getEncryptionType() != null)
            sb.append("EncryptionType: ").append(getEncryptionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KafkaClusterEncryptionInTransitDescription == false)
            return false;
        KafkaClusterEncryptionInTransitDescription other = (KafkaClusterEncryptionInTransitDescription) obj;
        if (other.getEncryptionType() == null ^ this.getEncryptionType() == null)
            return false;
        if (other.getEncryptionType() != null && other.getEncryptionType().equals(this.getEncryptionType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptionType() == null) ? 0 : getEncryptionType().hashCode());
        return hashCode;
    }

    @Override
    public KafkaClusterEncryptionInTransitDescription clone() {
        try {
            return (KafkaClusterEncryptionInTransitDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafkaconnect.model.transform.KafkaClusterEncryptionInTransitDescriptionMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
