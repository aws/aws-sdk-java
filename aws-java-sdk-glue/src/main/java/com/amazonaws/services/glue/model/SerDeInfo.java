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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a serialization/deserialization program (SerDe) which serves as an extractor and loader.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/SerDeInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SerDeInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the SerDe.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Usually the class that implements the SerDe. An example is:
     * <code>org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe</code>.
     * </p>
     */
    private String serializationLibrary;
    /**
     * <p>
     * These key-value pairs define initialization parameters for the SerDe.
     * </p>
     */
    private java.util.Map<String, String> parameters;

    /**
     * <p>
     * Name of the SerDe.
     * </p>
     * 
     * @param name
     *        Name of the SerDe.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the SerDe.
     * </p>
     * 
     * @return Name of the SerDe.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the SerDe.
     * </p>
     * 
     * @param name
     *        Name of the SerDe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SerDeInfo withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Usually the class that implements the SerDe. An example is:
     * <code>org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe</code>.
     * </p>
     * 
     * @param serializationLibrary
     *        Usually the class that implements the SerDe. An example is:
     *        <code>org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe</code>.
     */

    public void setSerializationLibrary(String serializationLibrary) {
        this.serializationLibrary = serializationLibrary;
    }

    /**
     * <p>
     * Usually the class that implements the SerDe. An example is:
     * <code>org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe</code>.
     * </p>
     * 
     * @return Usually the class that implements the SerDe. An example is:
     *         <code>org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe</code>.
     */

    public String getSerializationLibrary() {
        return this.serializationLibrary;
    }

    /**
     * <p>
     * Usually the class that implements the SerDe. An example is:
     * <code>org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe</code>.
     * </p>
     * 
     * @param serializationLibrary
     *        Usually the class that implements the SerDe. An example is:
     *        <code>org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SerDeInfo withSerializationLibrary(String serializationLibrary) {
        setSerializationLibrary(serializationLibrary);
        return this;
    }

    /**
     * <p>
     * These key-value pairs define initialization parameters for the SerDe.
     * </p>
     * 
     * @return These key-value pairs define initialization parameters for the SerDe.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * These key-value pairs define initialization parameters for the SerDe.
     * </p>
     * 
     * @param parameters
     *        These key-value pairs define initialization parameters for the SerDe.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * These key-value pairs define initialization parameters for the SerDe.
     * </p>
     * 
     * @param parameters
     *        These key-value pairs define initialization parameters for the SerDe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SerDeInfo withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    public SerDeInfo addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SerDeInfo clearParametersEntries() {
        this.parameters = null;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSerializationLibrary() != null)
            sb.append("SerializationLibrary: ").append(getSerializationLibrary()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SerDeInfo == false)
            return false;
        SerDeInfo other = (SerDeInfo) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSerializationLibrary() == null ^ this.getSerializationLibrary() == null)
            return false;
        if (other.getSerializationLibrary() != null && other.getSerializationLibrary().equals(this.getSerializationLibrary()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSerializationLibrary() == null) ? 0 : getSerializationLibrary().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public SerDeInfo clone() {
        try {
            return (SerDeInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.SerDeInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
