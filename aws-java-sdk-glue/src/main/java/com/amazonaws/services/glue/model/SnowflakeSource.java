/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specifies a Snowflake data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/SnowflakeSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnowflakeSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Snowflake data source.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Configuration for the Snowflake data source.
     * </p>
     */
    private SnowflakeNodeData data;
    /**
     * <p>
     * Specifies user-defined schemas for your output data.
     * </p>
     */
    private java.util.List<GlueSchema> outputSchemas;

    /**
     * <p>
     * The name of the Snowflake data source.
     * </p>
     * 
     * @param name
     *        The name of the Snowflake data source.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Snowflake data source.
     * </p>
     * 
     * @return The name of the Snowflake data source.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Snowflake data source.
     * </p>
     * 
     * @param name
     *        The name of the Snowflake data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeSource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Configuration for the Snowflake data source.
     * </p>
     * 
     * @param data
     *        Configuration for the Snowflake data source.
     */

    public void setData(SnowflakeNodeData data) {
        this.data = data;
    }

    /**
     * <p>
     * Configuration for the Snowflake data source.
     * </p>
     * 
     * @return Configuration for the Snowflake data source.
     */

    public SnowflakeNodeData getData() {
        return this.data;
    }

    /**
     * <p>
     * Configuration for the Snowflake data source.
     * </p>
     * 
     * @param data
     *        Configuration for the Snowflake data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeSource withData(SnowflakeNodeData data) {
        setData(data);
        return this;
    }

    /**
     * <p>
     * Specifies user-defined schemas for your output data.
     * </p>
     * 
     * @return Specifies user-defined schemas for your output data.
     */

    public java.util.List<GlueSchema> getOutputSchemas() {
        return outputSchemas;
    }

    /**
     * <p>
     * Specifies user-defined schemas for your output data.
     * </p>
     * 
     * @param outputSchemas
     *        Specifies user-defined schemas for your output data.
     */

    public void setOutputSchemas(java.util.Collection<GlueSchema> outputSchemas) {
        if (outputSchemas == null) {
            this.outputSchemas = null;
            return;
        }

        this.outputSchemas = new java.util.ArrayList<GlueSchema>(outputSchemas);
    }

    /**
     * <p>
     * Specifies user-defined schemas for your output data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputSchemas(java.util.Collection)} or {@link #withOutputSchemas(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param outputSchemas
     *        Specifies user-defined schemas for your output data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeSource withOutputSchemas(GlueSchema... outputSchemas) {
        if (this.outputSchemas == null) {
            setOutputSchemas(new java.util.ArrayList<GlueSchema>(outputSchemas.length));
        }
        for (GlueSchema ele : outputSchemas) {
            this.outputSchemas.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies user-defined schemas for your output data.
     * </p>
     * 
     * @param outputSchemas
     *        Specifies user-defined schemas for your output data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeSource withOutputSchemas(java.util.Collection<GlueSchema> outputSchemas) {
        setOutputSchemas(outputSchemas);
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
        if (getData() != null)
            sb.append("Data: ").append(getData()).append(",");
        if (getOutputSchemas() != null)
            sb.append("OutputSchemas: ").append(getOutputSchemas());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnowflakeSource == false)
            return false;
        SnowflakeSource other = (SnowflakeSource) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getOutputSchemas() == null ^ this.getOutputSchemas() == null)
            return false;
        if (other.getOutputSchemas() != null && other.getOutputSchemas().equals(this.getOutputSchemas()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getOutputSchemas() == null) ? 0 : getOutputSchemas().hashCode());
        return hashCode;
    }

    @Override
    public SnowflakeSource clone() {
        try {
            return (SnowflakeSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.SnowflakeSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
