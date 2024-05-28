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
 * Specifies an Amazon Redshift source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/AmazonRedshiftSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonRedshiftSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Amazon Redshift source.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the data of the Amazon Reshift source node.
     * </p>
     */
    private AmazonRedshiftNodeData data;

    /**
     * <p>
     * The name of the Amazon Redshift source.
     * </p>
     * 
     * @param name
     *        The name of the Amazon Redshift source.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Amazon Redshift source.
     * </p>
     * 
     * @return The name of the Amazon Redshift source.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Amazon Redshift source.
     * </p>
     * 
     * @param name
     *        The name of the Amazon Redshift source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftSource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the data of the Amazon Reshift source node.
     * </p>
     * 
     * @param data
     *        Specifies the data of the Amazon Reshift source node.
     */

    public void setData(AmazonRedshiftNodeData data) {
        this.data = data;
    }

    /**
     * <p>
     * Specifies the data of the Amazon Reshift source node.
     * </p>
     * 
     * @return Specifies the data of the Amazon Reshift source node.
     */

    public AmazonRedshiftNodeData getData() {
        return this.data;
    }

    /**
     * <p>
     * Specifies the data of the Amazon Reshift source node.
     * </p>
     * 
     * @param data
     *        Specifies the data of the Amazon Reshift source node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftSource withData(AmazonRedshiftNodeData data) {
        setData(data);
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
            sb.append("Data: ").append(getData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AmazonRedshiftSource == false)
            return false;
        AmazonRedshiftSource other = (AmazonRedshiftSource) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        return hashCode;
    }

    @Override
    public AmazonRedshiftSource clone() {
        try {
            return (AmazonRedshiftSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.AmazonRedshiftSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
