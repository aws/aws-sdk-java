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
 * Amazon Redshift parameters. The <code>ClusterId</code> field can be blank if <code>Host</code> and <code>Port</code>
 * are both set. The <code>Host</code> and <code>Port</code> fields can be blank if the <code>ClusterId</code> field is
 * set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RedshiftParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedshiftParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Host. This field can be blank if <code>ClusterId</code> is provided.
     * </p>
     */
    private String host;
    /**
     * <p>
     * Port. This field can be blank if the <code>ClusterId</code> is provided.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * Database.
     * </p>
     */
    private String database;
    /**
     * <p>
     * Cluster ID. This field can be blank if the <code>Host</code> and <code>Port</code> are provided.
     * </p>
     */
    private String clusterId;

    /**
     * <p>
     * Host. This field can be blank if <code>ClusterId</code> is provided.
     * </p>
     * 
     * @param host
     *        Host. This field can be blank if <code>ClusterId</code> is provided.
     */

    public void setHost(String host) {
        this.host = host;
    }

    /**
     * <p>
     * Host. This field can be blank if <code>ClusterId</code> is provided.
     * </p>
     * 
     * @return Host. This field can be blank if <code>ClusterId</code> is provided.
     */

    public String getHost() {
        return this.host;
    }

    /**
     * <p>
     * Host. This field can be blank if <code>ClusterId</code> is provided.
     * </p>
     * 
     * @param host
     *        Host. This field can be blank if <code>ClusterId</code> is provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftParameters withHost(String host) {
        setHost(host);
        return this;
    }

    /**
     * <p>
     * Port. This field can be blank if the <code>ClusterId</code> is provided.
     * </p>
     * 
     * @param port
     *        Port. This field can be blank if the <code>ClusterId</code> is provided.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * Port. This field can be blank if the <code>ClusterId</code> is provided.
     * </p>
     * 
     * @return Port. This field can be blank if the <code>ClusterId</code> is provided.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * Port. This field can be blank if the <code>ClusterId</code> is provided.
     * </p>
     * 
     * @param port
     *        Port. This field can be blank if the <code>ClusterId</code> is provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftParameters withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * Database.
     * </p>
     * 
     * @param database
     *        Database.
     */

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * <p>
     * Database.
     * </p>
     * 
     * @return Database.
     */

    public String getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * Database.
     * </p>
     * 
     * @param database
     *        Database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftParameters withDatabase(String database) {
        setDatabase(database);
        return this;
    }

    /**
     * <p>
     * Cluster ID. This field can be blank if the <code>Host</code> and <code>Port</code> are provided.
     * </p>
     * 
     * @param clusterId
     *        Cluster ID. This field can be blank if the <code>Host</code> and <code>Port</code> are provided.
     */

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * Cluster ID. This field can be blank if the <code>Host</code> and <code>Port</code> are provided.
     * </p>
     * 
     * @return Cluster ID. This field can be blank if the <code>Host</code> and <code>Port</code> are provided.
     */

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * <p>
     * Cluster ID. This field can be blank if the <code>Host</code> and <code>Port</code> are provided.
     * </p>
     * 
     * @param clusterId
     *        Cluster ID. This field can be blank if the <code>Host</code> and <code>Port</code> are provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftParameters withClusterId(String clusterId) {
        setClusterId(clusterId);
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
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase()).append(",");
        if (getClusterId() != null)
            sb.append("ClusterId: ").append(getClusterId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedshiftParameters == false)
            return false;
        RedshiftParameters other = (RedshiftParameters) obj;
        if (other.getHost() == null ^ this.getHost() == null)
            return false;
        if (other.getHost() != null && other.getHost().equals(this.getHost()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHost() == null) ? 0 : getHost().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        return hashCode;
    }

    @Override
    public RedshiftParameters clone() {
        try {
            return (RedshiftParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.RedshiftParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
