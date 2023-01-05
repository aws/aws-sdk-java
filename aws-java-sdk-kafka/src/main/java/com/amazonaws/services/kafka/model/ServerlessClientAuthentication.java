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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 <p>
 * Includes all client authentication information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ServerlessClientAuthentication"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerlessClientAuthentication implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details for ClientAuthentication using SASL.
     * </p>
     */
    private ServerlessSasl sasl;

    /**
     * <p>
     * Details for ClientAuthentication using SASL.
     * </p>
     * 
     * @param sasl
     *        <p>
     *        Details for ClientAuthentication using SASL.
     *        </p>
     */

    public void setSasl(ServerlessSasl sasl) {
        this.sasl = sasl;
    }

    /**
     * <p>
     * Details for ClientAuthentication using SASL.
     * </p>
     * 
     * @return <p>
     *         Details for ClientAuthentication using SASL.
     *         </p>
     */

    public ServerlessSasl getSasl() {
        return this.sasl;
    }

    /**
     * <p>
     * Details for ClientAuthentication using SASL.
     * </p>
     * 
     * @param sasl
     *        <p>
     *        Details for ClientAuthentication using SASL.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerlessClientAuthentication withSasl(ServerlessSasl sasl) {
        setSasl(sasl);
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
        if (getSasl() != null)
            sb.append("Sasl: ").append(getSasl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerlessClientAuthentication == false)
            return false;
        ServerlessClientAuthentication other = (ServerlessClientAuthentication) obj;
        if (other.getSasl() == null ^ this.getSasl() == null)
            return false;
        if (other.getSasl() != null && other.getSasl().equals(this.getSasl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSasl() == null) ? 0 : getSasl().hashCode());
        return hashCode;
    }

    @Override
    public ServerlessClientAuthentication clone() {
        try {
            return (ServerlessClientAuthentication) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.ServerlessClientAuthenticationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
