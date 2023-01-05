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
 * The client authentication information used in order to authenticate with the Apache Kafka cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/KafkaClusterClientAuthentication"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KafkaClusterClientAuthentication implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of client authentication used to connect to the Apache Kafka cluster. Value NONE means that no client
     * authentication is used.
     * </p>
     */
    private String authenticationType;

    /**
     * <p>
     * The type of client authentication used to connect to the Apache Kafka cluster. Value NONE means that no client
     * authentication is used.
     * </p>
     * 
     * @param authenticationType
     *        The type of client authentication used to connect to the Apache Kafka cluster. Value NONE means that no
     *        client authentication is used.
     * @see KafkaClusterClientAuthenticationType
     */

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    /**
     * <p>
     * The type of client authentication used to connect to the Apache Kafka cluster. Value NONE means that no client
     * authentication is used.
     * </p>
     * 
     * @return The type of client authentication used to connect to the Apache Kafka cluster. Value NONE means that no
     *         client authentication is used.
     * @see KafkaClusterClientAuthenticationType
     */

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * <p>
     * The type of client authentication used to connect to the Apache Kafka cluster. Value NONE means that no client
     * authentication is used.
     * </p>
     * 
     * @param authenticationType
     *        The type of client authentication used to connect to the Apache Kafka cluster. Value NONE means that no
     *        client authentication is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KafkaClusterClientAuthenticationType
     */

    public KafkaClusterClientAuthentication withAuthenticationType(String authenticationType) {
        setAuthenticationType(authenticationType);
        return this;
    }

    /**
     * <p>
     * The type of client authentication used to connect to the Apache Kafka cluster. Value NONE means that no client
     * authentication is used.
     * </p>
     * 
     * @param authenticationType
     *        The type of client authentication used to connect to the Apache Kafka cluster. Value NONE means that no
     *        client authentication is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KafkaClusterClientAuthenticationType
     */

    public KafkaClusterClientAuthentication withAuthenticationType(KafkaClusterClientAuthenticationType authenticationType) {
        this.authenticationType = authenticationType.toString();
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
        if (getAuthenticationType() != null)
            sb.append("AuthenticationType: ").append(getAuthenticationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KafkaClusterClientAuthentication == false)
            return false;
        KafkaClusterClientAuthentication other = (KafkaClusterClientAuthentication) obj;
        if (other.getAuthenticationType() == null ^ this.getAuthenticationType() == null)
            return false;
        if (other.getAuthenticationType() != null && other.getAuthenticationType().equals(this.getAuthenticationType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationType() == null) ? 0 : getAuthenticationType().hashCode());
        return hashCode;
    }

    @Override
    public KafkaClusterClientAuthentication clone() {
        try {
            return (KafkaClusterClientAuthentication) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafkaconnect.model.transform.KafkaClusterClientAuthenticationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
