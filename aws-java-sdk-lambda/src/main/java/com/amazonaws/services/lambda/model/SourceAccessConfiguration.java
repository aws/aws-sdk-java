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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * You can specify the authentication protocol, or the VPC components to secure access to your event source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/SourceAccessConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceAccessConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of authentication protocol or the VPC components for your event source. For example:
     * <code>"Type":"SASL_SCRAM_512_AUTH"</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BASIC_AUTH</code> - (MQ) The Secrets Manager secret that stores your broker credentials.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VPC_SUBNET</code> - The subnets associated with your VPC. Lambda connects to these subnets to fetch data
     * from your Kafka cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VPC_SECURITY_GROUP</code> - The VPC security group used to manage access to your Kafka brokers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SASL_SCRAM_256_AUTH</code> - The ARN of your secret key used for SASL SCRAM-256 authentication of your
     * Kafka brokers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SASL_SCRAM_512_AUTH</code> - The ARN of your secret key used for SASL SCRAM-512 authentication of your
     * Kafka brokers.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * The value for your chosen configuration in <code>Type</code>. For example:
     * <code>"URI": "arn:aws:secretsmanager:us-east-1:01234567890:secret:MyBrokerSecretName"</code>.
     * </p>
     */
    private String uRI;

    /**
     * <p>
     * The type of authentication protocol or the VPC components for your event source. For example:
     * <code>"Type":"SASL_SCRAM_512_AUTH"</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BASIC_AUTH</code> - (MQ) The Secrets Manager secret that stores your broker credentials.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VPC_SUBNET</code> - The subnets associated with your VPC. Lambda connects to these subnets to fetch data
     * from your Kafka cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VPC_SECURITY_GROUP</code> - The VPC security group used to manage access to your Kafka brokers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SASL_SCRAM_256_AUTH</code> - The ARN of your secret key used for SASL SCRAM-256 authentication of your
     * Kafka brokers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SASL_SCRAM_512_AUTH</code> - The ARN of your secret key used for SASL SCRAM-512 authentication of your
     * Kafka brokers.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of authentication protocol or the VPC components for your event source. For example:
     *        <code>"Type":"SASL_SCRAM_512_AUTH"</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BASIC_AUTH</code> - (MQ) The Secrets Manager secret that stores your broker credentials.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VPC_SUBNET</code> - The subnets associated with your VPC. Lambda connects to these subnets to fetch
     *        data from your Kafka cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VPC_SECURITY_GROUP</code> - The VPC security group used to manage access to your Kafka brokers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SASL_SCRAM_256_AUTH</code> - The ARN of your secret key used for SASL SCRAM-256 authentication of
     *        your Kafka brokers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SASL_SCRAM_512_AUTH</code> - The ARN of your secret key used for SASL SCRAM-512 authentication of
     *        your Kafka brokers.
     *        </p>
     *        </li>
     * @see SourceAccessType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of authentication protocol or the VPC components for your event source. For example:
     * <code>"Type":"SASL_SCRAM_512_AUTH"</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BASIC_AUTH</code> - (MQ) The Secrets Manager secret that stores your broker credentials.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VPC_SUBNET</code> - The subnets associated with your VPC. Lambda connects to these subnets to fetch data
     * from your Kafka cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VPC_SECURITY_GROUP</code> - The VPC security group used to manage access to your Kafka brokers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SASL_SCRAM_256_AUTH</code> - The ARN of your secret key used for SASL SCRAM-256 authentication of your
     * Kafka brokers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SASL_SCRAM_512_AUTH</code> - The ARN of your secret key used for SASL SCRAM-512 authentication of your
     * Kafka brokers.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of authentication protocol or the VPC components for your event source. For example:
     *         <code>"Type":"SASL_SCRAM_512_AUTH"</code>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BASIC_AUTH</code> - (MQ) The Secrets Manager secret that stores your broker credentials.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VPC_SUBNET</code> - The subnets associated with your VPC. Lambda connects to these subnets to fetch
     *         data from your Kafka cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VPC_SECURITY_GROUP</code> - The VPC security group used to manage access to your Kafka brokers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SASL_SCRAM_256_AUTH</code> - The ARN of your secret key used for SASL SCRAM-256 authentication of
     *         your Kafka brokers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SASL_SCRAM_512_AUTH</code> - The ARN of your secret key used for SASL SCRAM-512 authentication of
     *         your Kafka brokers.
     *         </p>
     *         </li>
     * @see SourceAccessType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of authentication protocol or the VPC components for your event source. For example:
     * <code>"Type":"SASL_SCRAM_512_AUTH"</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BASIC_AUTH</code> - (MQ) The Secrets Manager secret that stores your broker credentials.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VPC_SUBNET</code> - The subnets associated with your VPC. Lambda connects to these subnets to fetch data
     * from your Kafka cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VPC_SECURITY_GROUP</code> - The VPC security group used to manage access to your Kafka brokers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SASL_SCRAM_256_AUTH</code> - The ARN of your secret key used for SASL SCRAM-256 authentication of your
     * Kafka brokers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SASL_SCRAM_512_AUTH</code> - The ARN of your secret key used for SASL SCRAM-512 authentication of your
     * Kafka brokers.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of authentication protocol or the VPC components for your event source. For example:
     *        <code>"Type":"SASL_SCRAM_512_AUTH"</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BASIC_AUTH</code> - (MQ) The Secrets Manager secret that stores your broker credentials.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VPC_SUBNET</code> - The subnets associated with your VPC. Lambda connects to these subnets to fetch
     *        data from your Kafka cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VPC_SECURITY_GROUP</code> - The VPC security group used to manage access to your Kafka brokers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SASL_SCRAM_256_AUTH</code> - The ARN of your secret key used for SASL SCRAM-256 authentication of
     *        your Kafka brokers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SASL_SCRAM_512_AUTH</code> - The ARN of your secret key used for SASL SCRAM-512 authentication of
     *        your Kafka brokers.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceAccessType
     */

    public SourceAccessConfiguration withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of authentication protocol or the VPC components for your event source. For example:
     * <code>"Type":"SASL_SCRAM_512_AUTH"</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BASIC_AUTH</code> - (MQ) The Secrets Manager secret that stores your broker credentials.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VPC_SUBNET</code> - The subnets associated with your VPC. Lambda connects to these subnets to fetch data
     * from your Kafka cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VPC_SECURITY_GROUP</code> - The VPC security group used to manage access to your Kafka brokers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SASL_SCRAM_256_AUTH</code> - The ARN of your secret key used for SASL SCRAM-256 authentication of your
     * Kafka brokers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SASL_SCRAM_512_AUTH</code> - The ARN of your secret key used for SASL SCRAM-512 authentication of your
     * Kafka brokers.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of authentication protocol or the VPC components for your event source. For example:
     *        <code>"Type":"SASL_SCRAM_512_AUTH"</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BASIC_AUTH</code> - (MQ) The Secrets Manager secret that stores your broker credentials.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VPC_SUBNET</code> - The subnets associated with your VPC. Lambda connects to these subnets to fetch
     *        data from your Kafka cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VPC_SECURITY_GROUP</code> - The VPC security group used to manage access to your Kafka brokers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SASL_SCRAM_256_AUTH</code> - The ARN of your secret key used for SASL SCRAM-256 authentication of
     *        your Kafka brokers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SASL_SCRAM_512_AUTH</code> - The ARN of your secret key used for SASL SCRAM-512 authentication of
     *        your Kafka brokers.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceAccessType
     */

    public SourceAccessConfiguration withType(SourceAccessType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The value for your chosen configuration in <code>Type</code>. For example:
     * <code>"URI": "arn:aws:secretsmanager:us-east-1:01234567890:secret:MyBrokerSecretName"</code>.
     * </p>
     * 
     * @param uRI
     *        The value for your chosen configuration in <code>Type</code>. For example:
     *        <code>"URI": "arn:aws:secretsmanager:us-east-1:01234567890:secret:MyBrokerSecretName"</code>.
     */

    public void setURI(String uRI) {
        this.uRI = uRI;
    }

    /**
     * <p>
     * The value for your chosen configuration in <code>Type</code>. For example:
     * <code>"URI": "arn:aws:secretsmanager:us-east-1:01234567890:secret:MyBrokerSecretName"</code>.
     * </p>
     * 
     * @return The value for your chosen configuration in <code>Type</code>. For example:
     *         <code>"URI": "arn:aws:secretsmanager:us-east-1:01234567890:secret:MyBrokerSecretName"</code>.
     */

    public String getURI() {
        return this.uRI;
    }

    /**
     * <p>
     * The value for your chosen configuration in <code>Type</code>. For example:
     * <code>"URI": "arn:aws:secretsmanager:us-east-1:01234567890:secret:MyBrokerSecretName"</code>.
     * </p>
     * 
     * @param uRI
     *        The value for your chosen configuration in <code>Type</code>. For example:
     *        <code>"URI": "arn:aws:secretsmanager:us-east-1:01234567890:secret:MyBrokerSecretName"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceAccessConfiguration withURI(String uRI) {
        setURI(uRI);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getURI() != null)
            sb.append("URI: ").append(getURI());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceAccessConfiguration == false)
            return false;
        SourceAccessConfiguration other = (SourceAccessConfiguration) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getURI() == null ^ this.getURI() == null)
            return false;
        if (other.getURI() != null && other.getURI().equals(this.getURI()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getURI() == null) ? 0 : getURI().hashCode());
        return hashCode;
    }

    @Override
    public SourceAccessConfiguration clone() {
        try {
            return (SourceAccessConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.SourceAccessConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
