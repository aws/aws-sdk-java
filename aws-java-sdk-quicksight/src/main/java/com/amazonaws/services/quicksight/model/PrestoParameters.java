/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Presto parameters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/PrestoParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrestoParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Host.
     * </p>
     */
    private String host;
    /**
     * <p>
     * Port.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * Catalog.
     * </p>
     */
    private String catalog;

    /**
     * <p>
     * Host.
     * </p>
     * 
     * @param host
     *        Host.
     */

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * <p>
     * Host.
     * </p>
     * 
     * @return Host.
     */

    public String getHost() {
        return this.host;
    }

    /**
     * <p>
     * Host.
     * </p>
     * 
     * @param host
     *        Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrestoParameters withHost(String host) {
        setHost(host);
        return this;
    }

    /**
     * <p>
     * Port.
     * </p>
     * 
     * @param port
     *        Port.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * Port.
     * </p>
     * 
     * @return Port.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * Port.
     * </p>
     * 
     * @param port
     *        Port.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrestoParameters withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * Catalog.
     * </p>
     * 
     * @param catalog
     *        Catalog.
     */

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    /**
     * <p>
     * Catalog.
     * </p>
     * 
     * @return Catalog.
     */

    public String getCatalog() {
        return this.catalog;
    }

    /**
     * <p>
     * Catalog.
     * </p>
     * 
     * @param catalog
     *        Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrestoParameters withCatalog(String catalog) {
        setCatalog(catalog);
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
            sb.append("Catalog: ").append(getCatalog());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrestoParameters == false)
            return false;
        PrestoParameters other = (PrestoParameters) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHost() == null) ? 0 : getHost().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getCatalog() == null) ? 0 : getCatalog().hashCode());
        return hashCode;
    }

    @Override
    public PrestoParameters clone() {
        try {
            return (PrestoParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.PrestoParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
