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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the deserializer you want to use to convert the format of the input data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/InputFormatConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputFormatConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies which deserializer to use. You can choose either the Apache Hive JSON SerDe or the OpenX JSON SerDe. If
     * both are non-null, the server rejects the request.
     * </p>
     */
    private Deserializer deserializer;

    /**
     * <p>
     * Specifies which deserializer to use. You can choose either the Apache Hive JSON SerDe or the OpenX JSON SerDe. If
     * both are non-null, the server rejects the request.
     * </p>
     * 
     * @param deserializer
     *        Specifies which deserializer to use. You can choose either the Apache Hive JSON SerDe or the OpenX JSON
     *        SerDe. If both are non-null, the server rejects the request.
     */

    public void setDeserializer(Deserializer deserializer) {
        this.deserializer = deserializer;
    }

    /**
     * <p>
     * Specifies which deserializer to use. You can choose either the Apache Hive JSON SerDe or the OpenX JSON SerDe. If
     * both are non-null, the server rejects the request.
     * </p>
     * 
     * @return Specifies which deserializer to use. You can choose either the Apache Hive JSON SerDe or the OpenX JSON
     *         SerDe. If both are non-null, the server rejects the request.
     */

    public Deserializer getDeserializer() {
        return this.deserializer;
    }

    /**
     * <p>
     * Specifies which deserializer to use. You can choose either the Apache Hive JSON SerDe or the OpenX JSON SerDe. If
     * both are non-null, the server rejects the request.
     * </p>
     * 
     * @param deserializer
     *        Specifies which deserializer to use. You can choose either the Apache Hive JSON SerDe or the OpenX JSON
     *        SerDe. If both are non-null, the server rejects the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputFormatConfiguration withDeserializer(Deserializer deserializer) {
        setDeserializer(deserializer);
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
        if (getDeserializer() != null)
            sb.append("Deserializer: ").append(getDeserializer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputFormatConfiguration == false)
            return false;
        InputFormatConfiguration other = (InputFormatConfiguration) obj;
        if (other.getDeserializer() == null ^ this.getDeserializer() == null)
            return false;
        if (other.getDeserializer() != null && other.getDeserializer().equals(this.getDeserializer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeserializer() == null) ? 0 : getDeserializer().hashCode());
        return hashCode;
    }

    @Override
    public InputFormatConfiguration clone() {
        try {
            return (InputFormatConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.InputFormatConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
