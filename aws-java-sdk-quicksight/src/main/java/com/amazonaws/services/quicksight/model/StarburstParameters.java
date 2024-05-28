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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters that are required to connect to a Starburst data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/StarburstParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StarburstParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The host name of the Starburst data source.
     * </p>
     */
    private String host;
    /**
     * <p>
     * The port for the Starburst data source.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The catalog name for the Starburst data source.
     * </p>
     */
    private String catalog;
    /**
     * <p>
     * The product type for the Starburst data source.
     * </p>
     */
    private String productType;

    /**
     * <p>
     * The host name of the Starburst data source.
     * </p>
     * 
     * @param host
     *        The host name of the Starburst data source.
     */

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * <p>
     * The host name of the Starburst data source.
     * </p>
     * 
     * @return The host name of the Starburst data source.
     */

    public String getHost() {
        return this.host;
    }

    /**
     * <p>
     * The host name of the Starburst data source.
     * </p>
     * 
     * @param host
     *        The host name of the Starburst data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StarburstParameters withHost(String host) {
        setHost(host);
        return this;
    }

    /**
     * <p>
     * The port for the Starburst data source.
     * </p>
     * 
     * @param port
     *        The port for the Starburst data source.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port for the Starburst data source.
     * </p>
     * 
     * @return The port for the Starburst data source.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port for the Starburst data source.
     * </p>
     * 
     * @param port
     *        The port for the Starburst data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StarburstParameters withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The catalog name for the Starburst data source.
     * </p>
     * 
     * @param catalog
     *        The catalog name for the Starburst data source.
     */

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    /**
     * <p>
     * The catalog name for the Starburst data source.
     * </p>
     * 
     * @return The catalog name for the Starburst data source.
     */

    public String getCatalog() {
        return this.catalog;
    }

    /**
     * <p>
     * The catalog name for the Starburst data source.
     * </p>
     * 
     * @param catalog
     *        The catalog name for the Starburst data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StarburstParameters withCatalog(String catalog) {
        setCatalog(catalog);
        return this;
    }

    /**
     * <p>
     * The product type for the Starburst data source.
     * </p>
     * 
     * @param productType
     *        The product type for the Starburst data source.
     * @see StarburstProductType
     */

    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * <p>
     * The product type for the Starburst data source.
     * </p>
     * 
     * @return The product type for the Starburst data source.
     * @see StarburstProductType
     */

    public String getProductType() {
        return this.productType;
    }

    /**
     * <p>
     * The product type for the Starburst data source.
     * </p>
     * 
     * @param productType
     *        The product type for the Starburst data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StarburstProductType
     */

    public StarburstParameters withProductType(String productType) {
        setProductType(productType);
        return this;
    }

    /**
     * <p>
     * The product type for the Starburst data source.
     * </p>
     * 
     * @param productType
     *        The product type for the Starburst data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StarburstProductType
     */

    public StarburstParameters withProductType(StarburstProductType productType) {
        this.productType = productType.toString();
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
        if (getHost() != null)
            sb.append("Host: ").append(getHost()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getCatalog() != null)
            sb.append("Catalog: ").append(getCatalog()).append(",");
        if (getProductType() != null)
            sb.append("ProductType: ").append(getProductType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StarburstParameters == false)
            return false;
        StarburstParameters other = (StarburstParameters) obj;
        if (other.getHost() == null ^ this.getHost() == null)
            return false;
        if (other.getHost() != null && other.getHost().equals(this.getHost()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getCatalog() == null ^ this.getCatalog() == null)
            return false;
        if (other.getCatalog() != null && other.getCatalog().equals(this.getCatalog()) == false)
            return false;
        if (other.getProductType() == null ^ this.getProductType() == null)
            return false;
        if (other.getProductType() != null && other.getProductType().equals(this.getProductType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHost() == null) ? 0 : getHost().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getCatalog() == null) ? 0 : getCatalog().hashCode());
        hashCode = prime * hashCode + ((getProductType() == null) ? 0 : getProductType().hashCode());
        return hashCode;
    }

    @Override
    public StarburstParameters clone() {
        try {
            return (StarburstParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.StarburstParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
