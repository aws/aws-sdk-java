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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure for a data location object where permissions are granted or revoked.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DataLocationResource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataLocationResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the Data Catalog where the location is registered with AWS Lake Formation. By default, it is
     * the account ID of the caller.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the data location resource.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The identifier for the Data Catalog where the location is registered with AWS Lake Formation. By default, it is
     * the account ID of the caller.
     * </p>
     * 
     * @param catalogId
     *        The identifier for the Data Catalog where the location is registered with AWS Lake Formation. By default,
     *        it is the account ID of the caller.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The identifier for the Data Catalog where the location is registered with AWS Lake Formation. By default, it is
     * the account ID of the caller.
     * </p>
     * 
     * @return The identifier for the Data Catalog where the location is registered with AWS Lake Formation. By default,
     *         it is the account ID of the caller.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The identifier for the Data Catalog where the location is registered with AWS Lake Formation. By default, it is
     * the account ID of the caller.
     * </p>
     * 
     * @param catalogId
     *        The identifier for the Data Catalog where the location is registered with AWS Lake Formation. By default,
     *        it is the account ID of the caller.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLocationResource withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the data location resource.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) that uniquely identifies the data location resource.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the data location resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that uniquely identifies the data location resource.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the data location resource.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) that uniquely identifies the data location resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataLocationResource withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataLocationResource == false)
            return false;
        DataLocationResource other = (DataLocationResource) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public DataLocationResource clone() {
        try {
            return (DataLocationResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lakeformation.model.transform.DataLocationResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
