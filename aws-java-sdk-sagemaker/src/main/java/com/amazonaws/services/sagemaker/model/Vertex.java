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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A lineage entity connected to the starting entity(ies).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/Vertex" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Vertex implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lineage entity resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The type of the lineage entity resource. For example: <code>DataSet</code>, <code>Model</code>,
     * <code>Endpoint</code>, etc...
     * </p>
     */
    private String type;
    /**
     * <p>
     * The type of resource of the lineage entity.
     * </p>
     */
    private String lineageType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lineage entity resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the lineage entity resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lineage entity resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the lineage entity resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lineage entity resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the lineage entity resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Vertex withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The type of the lineage entity resource. For example: <code>DataSet</code>, <code>Model</code>,
     * <code>Endpoint</code>, etc...
     * </p>
     * 
     * @param type
     *        The type of the lineage entity resource. For example: <code>DataSet</code>, <code>Model</code>,
     *        <code>Endpoint</code>, etc...
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the lineage entity resource. For example: <code>DataSet</code>, <code>Model</code>,
     * <code>Endpoint</code>, etc...
     * </p>
     * 
     * @return The type of the lineage entity resource. For example: <code>DataSet</code>, <code>Model</code>,
     *         <code>Endpoint</code>, etc...
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the lineage entity resource. For example: <code>DataSet</code>, <code>Model</code>,
     * <code>Endpoint</code>, etc...
     * </p>
     * 
     * @param type
     *        The type of the lineage entity resource. For example: <code>DataSet</code>, <code>Model</code>,
     *        <code>Endpoint</code>, etc...
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Vertex withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of resource of the lineage entity.
     * </p>
     * 
     * @param lineageType
     *        The type of resource of the lineage entity.
     * @see LineageType
     */

    public void setLineageType(String lineageType) {
        this.lineageType = lineageType;
    }

    /**
     * <p>
     * The type of resource of the lineage entity.
     * </p>
     * 
     * @return The type of resource of the lineage entity.
     * @see LineageType
     */

    public String getLineageType() {
        return this.lineageType;
    }

    /**
     * <p>
     * The type of resource of the lineage entity.
     * </p>
     * 
     * @param lineageType
     *        The type of resource of the lineage entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LineageType
     */

    public Vertex withLineageType(String lineageType) {
        setLineageType(lineageType);
        return this;
    }

    /**
     * <p>
     * The type of resource of the lineage entity.
     * </p>
     * 
     * @param lineageType
     *        The type of resource of the lineage entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LineageType
     */

    public Vertex withLineageType(LineageType lineageType) {
        this.lineageType = lineageType.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getLineageType() != null)
            sb.append("LineageType: ").append(getLineageType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Vertex == false)
            return false;
        Vertex other = (Vertex) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getLineageType() == null ^ this.getLineageType() == null)
            return false;
        if (other.getLineageType() != null && other.getLineageType().equals(this.getLineageType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getLineageType() == null) ? 0 : getLineageType().hashCode());
        return hashCode;
    }

    @Override
    public Vertex clone() {
        try {
            return (Vertex) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.VertexMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
