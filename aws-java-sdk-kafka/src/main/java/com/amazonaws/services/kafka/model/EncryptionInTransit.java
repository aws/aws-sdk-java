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
 * The settings for encrypting data in transit.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/EncryptionInTransit" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncryptionInTransit implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates the encryption setting for data in transit between clients and brokers. The following are the possible
     * values.
     * </p>
     * <p>
     * TLS means that client-broker communication is enabled with TLS only.
     * </p>
     * <p>
     * TLS_PLAINTEXT means that client-broker communication is enabled for both TLS-encrypted, as well as plaintext
     * data.
     * </p>
     * <p>
     * PLAINTEXT means that client-broker communication is enabled in plaintext only.
     * </p>
     * <p>
     * The default value is TLS_PLAINTEXT.
     * </p>
     */
    private String clientBroker;
    /**
     * <p>
     * When set to true, it indicates that data communication among the broker nodes of the cluster is encrypted. When
     * set to false, the communication happens in plaintext.
     * </p>
     * <p>
     * The default value is true.
     * </p>
     */
    private Boolean inCluster;

    /**
     * <p>
     * Indicates the encryption setting for data in transit between clients and brokers. The following are the possible
     * values.
     * </p>
     * <p>
     * TLS means that client-broker communication is enabled with TLS only.
     * </p>
     * <p>
     * TLS_PLAINTEXT means that client-broker communication is enabled for both TLS-encrypted, as well as plaintext
     * data.
     * </p>
     * <p>
     * PLAINTEXT means that client-broker communication is enabled in plaintext only.
     * </p>
     * <p>
     * The default value is TLS_PLAINTEXT.
     * </p>
     * 
     * @param clientBroker
     *        <p>
     *        Indicates the encryption setting for data in transit between clients and brokers. The following are the
     *        possible values.
     *        </p>
     *        <p>
     *        TLS means that client-broker communication is enabled with TLS only.
     *        </p>
     *        <p>
     *        TLS_PLAINTEXT means that client-broker communication is enabled for both TLS-encrypted, as well as
     *        plaintext data.
     *        </p>
     *        <p>
     *        PLAINTEXT means that client-broker communication is enabled in plaintext only.
     *        </p>
     *        <p>
     *        The default value is TLS_PLAINTEXT.
     *        </p>
     * @see ClientBroker
     */

    public void setClientBroker(String clientBroker) {
        this.clientBroker = clientBroker;
    }

    /**
     * <p>
     * Indicates the encryption setting for data in transit between clients and brokers. The following are the possible
     * values.
     * </p>
     * <p>
     * TLS means that client-broker communication is enabled with TLS only.
     * </p>
     * <p>
     * TLS_PLAINTEXT means that client-broker communication is enabled for both TLS-encrypted, as well as plaintext
     * data.
     * </p>
     * <p>
     * PLAINTEXT means that client-broker communication is enabled in plaintext only.
     * </p>
     * <p>
     * The default value is TLS_PLAINTEXT.
     * </p>
     * 
     * @return <p>
     *         Indicates the encryption setting for data in transit between clients and brokers. The following are the
     *         possible values.
     *         </p>
     *         <p>
     *         TLS means that client-broker communication is enabled with TLS only.
     *         </p>
     *         <p>
     *         TLS_PLAINTEXT means that client-broker communication is enabled for both TLS-encrypted, as well as
     *         plaintext data.
     *         </p>
     *         <p>
     *         PLAINTEXT means that client-broker communication is enabled in plaintext only.
     *         </p>
     *         <p>
     *         The default value is TLS_PLAINTEXT.
     *         </p>
     * @see ClientBroker
     */

    public String getClientBroker() {
        return this.clientBroker;
    }

    /**
     * <p>
     * Indicates the encryption setting for data in transit between clients and brokers. The following are the possible
     * values.
     * </p>
     * <p>
     * TLS means that client-broker communication is enabled with TLS only.
     * </p>
     * <p>
     * TLS_PLAINTEXT means that client-broker communication is enabled for both TLS-encrypted, as well as plaintext
     * data.
     * </p>
     * <p>
     * PLAINTEXT means that client-broker communication is enabled in plaintext only.
     * </p>
     * <p>
     * The default value is TLS_PLAINTEXT.
     * </p>
     * 
     * @param clientBroker
     *        <p>
     *        Indicates the encryption setting for data in transit between clients and brokers. The following are the
     *        possible values.
     *        </p>
     *        <p>
     *        TLS means that client-broker communication is enabled with TLS only.
     *        </p>
     *        <p>
     *        TLS_PLAINTEXT means that client-broker communication is enabled for both TLS-encrypted, as well as
     *        plaintext data.
     *        </p>
     *        <p>
     *        PLAINTEXT means that client-broker communication is enabled in plaintext only.
     *        </p>
     *        <p>
     *        The default value is TLS_PLAINTEXT.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClientBroker
     */

    public EncryptionInTransit withClientBroker(String clientBroker) {
        setClientBroker(clientBroker);
        return this;
    }

    /**
     * <p>
     * Indicates the encryption setting for data in transit between clients and brokers. The following are the possible
     * values.
     * </p>
     * <p>
     * TLS means that client-broker communication is enabled with TLS only.
     * </p>
     * <p>
     * TLS_PLAINTEXT means that client-broker communication is enabled for both TLS-encrypted, as well as plaintext
     * data.
     * </p>
     * <p>
     * PLAINTEXT means that client-broker communication is enabled in plaintext only.
     * </p>
     * <p>
     * The default value is TLS_PLAINTEXT.
     * </p>
     * 
     * @param clientBroker
     *        <p>
     *        Indicates the encryption setting for data in transit between clients and brokers. The following are the
     *        possible values.
     *        </p>
     *        <p>
     *        TLS means that client-broker communication is enabled with TLS only.
     *        </p>
     *        <p>
     *        TLS_PLAINTEXT means that client-broker communication is enabled for both TLS-encrypted, as well as
     *        plaintext data.
     *        </p>
     *        <p>
     *        PLAINTEXT means that client-broker communication is enabled in plaintext only.
     *        </p>
     *        <p>
     *        The default value is TLS_PLAINTEXT.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClientBroker
     */

    public EncryptionInTransit withClientBroker(ClientBroker clientBroker) {
        this.clientBroker = clientBroker.toString();
        return this;
    }

    /**
     * <p>
     * When set to true, it indicates that data communication among the broker nodes of the cluster is encrypted. When
     * set to false, the communication happens in plaintext.
     * </p>
     * <p>
     * The default value is true.
     * </p>
     * 
     * @param inCluster
     *        <p>
     *        When set to true, it indicates that data communication among the broker nodes of the cluster is encrypted.
     *        When set to false, the communication happens in plaintext.
     *        </p>
     *        <p>
     *        The default value is true.
     *        </p>
     */

    public void setInCluster(Boolean inCluster) {
        this.inCluster = inCluster;
    }

    /**
     * <p>
     * When set to true, it indicates that data communication among the broker nodes of the cluster is encrypted. When
     * set to false, the communication happens in plaintext.
     * </p>
     * <p>
     * The default value is true.
     * </p>
     * 
     * @return <p>
     *         When set to true, it indicates that data communication among the broker nodes of the cluster is
     *         encrypted. When set to false, the communication happens in plaintext.
     *         </p>
     *         <p>
     *         The default value is true.
     *         </p>
     */

    public Boolean getInCluster() {
        return this.inCluster;
    }

    /**
     * <p>
     * When set to true, it indicates that data communication among the broker nodes of the cluster is encrypted. When
     * set to false, the communication happens in plaintext.
     * </p>
     * <p>
     * The default value is true.
     * </p>
     * 
     * @param inCluster
     *        <p>
     *        When set to true, it indicates that data communication among the broker nodes of the cluster is encrypted.
     *        When set to false, the communication happens in plaintext.
     *        </p>
     *        <p>
     *        The default value is true.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionInTransit withInCluster(Boolean inCluster) {
        setInCluster(inCluster);
        return this;
    }

    /**
     * <p>
     * When set to true, it indicates that data communication among the broker nodes of the cluster is encrypted. When
     * set to false, the communication happens in plaintext.
     * </p>
     * <p>
     * The default value is true.
     * </p>
     * 
     * @return <p>
     *         When set to true, it indicates that data communication among the broker nodes of the cluster is
     *         encrypted. When set to false, the communication happens in plaintext.
     *         </p>
     *         <p>
     *         The default value is true.
     *         </p>
     */

    public Boolean isInCluster() {
        return this.inCluster;
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
        if (getClientBroker() != null)
            sb.append("ClientBroker: ").append(getClientBroker()).append(",");
        if (getInCluster() != null)
            sb.append("InCluster: ").append(getInCluster());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptionInTransit == false)
            return false;
        EncryptionInTransit other = (EncryptionInTransit) obj;
        if (other.getClientBroker() == null ^ this.getClientBroker() == null)
            return false;
        if (other.getClientBroker() != null && other.getClientBroker().equals(this.getClientBroker()) == false)
            return false;
        if (other.getInCluster() == null ^ this.getInCluster() == null)
            return false;
        if (other.getInCluster() != null && other.getInCluster().equals(this.getInCluster()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientBroker() == null) ? 0 : getClientBroker().hashCode());
        hashCode = prime * hashCode + ((getInCluster() == null) ? 0 : getInCluster().hashCode());
        return hashCode;
    }

    @Override
    public EncryptionInTransit clone() {
        try {
            return (EncryptionInTransit) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.EncryptionInTransitMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
