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
 * Specifies a source generated with standard connection options.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ConnectorDataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorDataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of this source node.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The <code>connectionType</code>, as provided to the underlying Glue library. This node type supports the
     * following connection types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>opensearch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>azuresql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>azurecosmos</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bigquery</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>saphana</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>teradata</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vertica</code>
     * </p>
     * </li>
     * </ul>
     */
    private String connectionType;
    /**
     * <p>
     * A map specifying connection options for the node. You can find standard connection options for the corresponding
     * connection type in the <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-connect.html"> Connection
     * parameters</a> section of the Glue documentation.
     * </p>
     */
    private java.util.Map<String, String> data;
    /**
     * <p>
     * Specifies the data schema for this source.
     * </p>
     */
    private java.util.List<GlueSchema> outputSchemas;

    /**
     * <p>
     * The name of this source node.
     * </p>
     * 
     * @param name
     *        The name of this source node.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of this source node.
     * </p>
     * 
     * @return The name of this source node.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of this source node.
     * </p>
     * 
     * @param name
     *        The name of this source node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorDataSource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The <code>connectionType</code>, as provided to the underlying Glue library. This node type supports the
     * following connection types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>opensearch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>azuresql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>azurecosmos</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bigquery</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>saphana</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>teradata</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vertica</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param connectionType
     *        The <code>connectionType</code>, as provided to the underlying Glue library. This node type supports the
     *        following connection types: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>opensearch</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>azuresql</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>azurecosmos</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>bigquery</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>saphana</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>teradata</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vertica</code>
     *        </p>
     *        </li>
     */

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    /**
     * <p>
     * The <code>connectionType</code>, as provided to the underlying Glue library. This node type supports the
     * following connection types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>opensearch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>azuresql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>azurecosmos</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bigquery</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>saphana</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>teradata</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vertica</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The <code>connectionType</code>, as provided to the underlying Glue library. This node type supports the
     *         following connection types: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>opensearch</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>azuresql</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>azurecosmos</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>bigquery</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>saphana</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>teradata</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vertica</code>
     *         </p>
     *         </li>
     */

    public String getConnectionType() {
        return this.connectionType;
    }

    /**
     * <p>
     * The <code>connectionType</code>, as provided to the underlying Glue library. This node type supports the
     * following connection types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>opensearch</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>azuresql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>azurecosmos</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bigquery</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>saphana</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>teradata</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vertica</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param connectionType
     *        The <code>connectionType</code>, as provided to the underlying Glue library. This node type supports the
     *        following connection types: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>opensearch</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>azuresql</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>azurecosmos</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>bigquery</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>saphana</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>teradata</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vertica</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorDataSource withConnectionType(String connectionType) {
        setConnectionType(connectionType);
        return this;
    }

    /**
     * <p>
     * A map specifying connection options for the node. You can find standard connection options for the corresponding
     * connection type in the <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-connect.html"> Connection
     * parameters</a> section of the Glue documentation.
     * </p>
     * 
     * @return A map specifying connection options for the node. You can find standard connection options for the
     *         corresponding connection type in the <a
     *         href="https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-connect.html"> Connection
     *         parameters</a> section of the Glue documentation.
     */

    public java.util.Map<String, String> getData() {
        return data;
    }

    /**
     * <p>
     * A map specifying connection options for the node. You can find standard connection options for the corresponding
     * connection type in the <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-connect.html"> Connection
     * parameters</a> section of the Glue documentation.
     * </p>
     * 
     * @param data
     *        A map specifying connection options for the node. You can find standard connection options for the
     *        corresponding connection type in the <a
     *        href="https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-connect.html"> Connection
     *        parameters</a> section of the Glue documentation.
     */

    public void setData(java.util.Map<String, String> data) {
        this.data = data;
    }

    /**
     * <p>
     * A map specifying connection options for the node. You can find standard connection options for the corresponding
     * connection type in the <a
     * href="https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-connect.html"> Connection
     * parameters</a> section of the Glue documentation.
     * </p>
     * 
     * @param data
     *        A map specifying connection options for the node. You can find standard connection options for the
     *        corresponding connection type in the <a
     *        href="https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-connect.html"> Connection
     *        parameters</a> section of the Glue documentation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorDataSource withData(java.util.Map<String, String> data) {
        setData(data);
        return this;
    }

    /**
     * Add a single Data entry
     *
     * @see ConnectorDataSource#withData
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorDataSource addDataEntry(String key, String value) {
        if (null == this.data) {
            this.data = new java.util.HashMap<String, String>();
        }
        if (this.data.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.data.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Data.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorDataSource clearDataEntries() {
        this.data = null;
        return this;
    }

    /**
     * <p>
     * Specifies the data schema for this source.
     * </p>
     * 
     * @return Specifies the data schema for this source.
     */

    public java.util.List<GlueSchema> getOutputSchemas() {
        return outputSchemas;
    }

    /**
     * <p>
     * Specifies the data schema for this source.
     * </p>
     * 
     * @param outputSchemas
     *        Specifies the data schema for this source.
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
     * Specifies the data schema for this source.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputSchemas(java.util.Collection)} or {@link #withOutputSchemas(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param outputSchemas
     *        Specifies the data schema for this source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorDataSource withOutputSchemas(GlueSchema... outputSchemas) {
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
     * Specifies the data schema for this source.
     * </p>
     * 
     * @param outputSchemas
     *        Specifies the data schema for this source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorDataSource withOutputSchemas(java.util.Collection<GlueSchema> outputSchemas) {
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
        if (getConnectionType() != null)
            sb.append("ConnectionType: ").append(getConnectionType()).append(",");
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

        if (obj instanceof ConnectorDataSource == false)
            return false;
        ConnectorDataSource other = (ConnectorDataSource) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getConnectionType() == null ^ this.getConnectionType() == null)
            return false;
        if (other.getConnectionType() != null && other.getConnectionType().equals(this.getConnectionType()) == false)
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
        hashCode = prime * hashCode + ((getConnectionType() == null) ? 0 : getConnectionType().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getOutputSchemas() == null) ? 0 : getOutputSchemas().hashCode());
        return hashCode;
    }

    @Override
    public ConnectorDataSource clone() {
        try {
            return (ConnectorDataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.ConnectorDataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
