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
 * Specifies a target generated with standard connection options.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ConnectorDataTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorDataTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of this target node.
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
     * The nodes that are inputs to the data target.
     * </p>
     */
    private java.util.List<String> inputs;

    /**
     * <p>
     * The name of this target node.
     * </p>
     * 
     * @param name
     *        The name of this target node.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of this target node.
     * </p>
     * 
     * @return The name of this target node.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of this target node.
     * </p>
     * 
     * @param name
     *        The name of this target node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorDataTarget withName(String name) {
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

    public ConnectorDataTarget withConnectionType(String connectionType) {
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

    public ConnectorDataTarget withData(java.util.Map<String, String> data) {
        setData(data);
        return this;
    }

    /**
     * Add a single Data entry
     *
     * @see ConnectorDataTarget#withData
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorDataTarget addDataEntry(String key, String value) {
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

    public ConnectorDataTarget clearDataEntries() {
        this.data = null;
        return this;
    }

    /**
     * <p>
     * The nodes that are inputs to the data target.
     * </p>
     * 
     * @return The nodes that are inputs to the data target.
     */

    public java.util.List<String> getInputs() {
        return inputs;
    }

    /**
     * <p>
     * The nodes that are inputs to the data target.
     * </p>
     * 
     * @param inputs
     *        The nodes that are inputs to the data target.
     */

    public void setInputs(java.util.Collection<String> inputs) {
        if (inputs == null) {
            this.inputs = null;
            return;
        }

        this.inputs = new java.util.ArrayList<String>(inputs);
    }

    /**
     * <p>
     * The nodes that are inputs to the data target.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputs(java.util.Collection)} or {@link #withInputs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param inputs
     *        The nodes that are inputs to the data target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorDataTarget withInputs(String... inputs) {
        if (this.inputs == null) {
            setInputs(new java.util.ArrayList<String>(inputs.length));
        }
        for (String ele : inputs) {
            this.inputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The nodes that are inputs to the data target.
     * </p>
     * 
     * @param inputs
     *        The nodes that are inputs to the data target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorDataTarget withInputs(java.util.Collection<String> inputs) {
        setInputs(inputs);
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
        if (getInputs() != null)
            sb.append("Inputs: ").append(getInputs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectorDataTarget == false)
            return false;
        ConnectorDataTarget other = (ConnectorDataTarget) obj;
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
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
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
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        return hashCode;
    }

    @Override
    public ConnectorDataTarget clone() {
        try {
            return (ConnectorDataTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.ConnectorDataTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
