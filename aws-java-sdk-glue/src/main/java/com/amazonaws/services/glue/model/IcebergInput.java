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
 * A structure that defines an Apache Iceberg metadata table to create in the catalog.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/IcebergInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IcebergInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A required metadata operation. Can only be set to <code>CREATE</code>.
     * </p>
     */
    private String metadataOperation;
    /**
     * <p>
     * The table version for the Iceberg table. Defaults to 2.
     * </p>
     */
    private String version;

    /**
     * <p>
     * A required metadata operation. Can only be set to <code>CREATE</code>.
     * </p>
     * 
     * @param metadataOperation
     *        A required metadata operation. Can only be set to <code>CREATE</code>.
     * @see MetadataOperation
     */

    public void setMetadataOperation(String metadataOperation) {
        this.metadataOperation = metadataOperation;
    }

    /**
     * <p>
     * A required metadata operation. Can only be set to <code>CREATE</code>.
     * </p>
     * 
     * @return A required metadata operation. Can only be set to <code>CREATE</code>.
     * @see MetadataOperation
     */

    public String getMetadataOperation() {
        return this.metadataOperation;
    }

    /**
     * <p>
     * A required metadata operation. Can only be set to <code>CREATE</code>.
     * </p>
     * 
     * @param metadataOperation
     *        A required metadata operation. Can only be set to <code>CREATE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetadataOperation
     */

    public IcebergInput withMetadataOperation(String metadataOperation) {
        setMetadataOperation(metadataOperation);
        return this;
    }

    /**
     * <p>
     * A required metadata operation. Can only be set to <code>CREATE</code>.
     * </p>
     * 
     * @param metadataOperation
     *        A required metadata operation. Can only be set to <code>CREATE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetadataOperation
     */

    public IcebergInput withMetadataOperation(MetadataOperation metadataOperation) {
        this.metadataOperation = metadataOperation.toString();
        return this;
    }

    /**
     * <p>
     * The table version for the Iceberg table. Defaults to 2.
     * </p>
     * 
     * @param version
     *        The table version for the Iceberg table. Defaults to 2.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The table version for the Iceberg table. Defaults to 2.
     * </p>
     * 
     * @return The table version for the Iceberg table. Defaults to 2.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The table version for the Iceberg table. Defaults to 2.
     * </p>
     * 
     * @param version
     *        The table version for the Iceberg table. Defaults to 2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IcebergInput withVersion(String version) {
        setVersion(version);
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
        if (getMetadataOperation() != null)
            sb.append("MetadataOperation: ").append(getMetadataOperation()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IcebergInput == false)
            return false;
        IcebergInput other = (IcebergInput) obj;
        if (other.getMetadataOperation() == null ^ this.getMetadataOperation() == null)
            return false;
        if (other.getMetadataOperation() != null && other.getMetadataOperation().equals(this.getMetadataOperation()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetadataOperation() == null) ? 0 : getMetadataOperation().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public IcebergInput clone() {
        try {
            return (IcebergInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.IcebergInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
