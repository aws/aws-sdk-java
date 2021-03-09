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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBProxyEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDBProxyEndpointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>DBProxyEndpoint</code> object that is created by the API operation. The DB proxy endpoint that you
     * create might provide capabilities such as read/write or read-only operations, or using a different VPC than the
     * proxy's default VPC.
     * </p>
     */
    private DBProxyEndpoint dBProxyEndpoint;

    /**
     * <p>
     * The <code>DBProxyEndpoint</code> object that is created by the API operation. The DB proxy endpoint that you
     * create might provide capabilities such as read/write or read-only operations, or using a different VPC than the
     * proxy's default VPC.
     * </p>
     * 
     * @param dBProxyEndpoint
     *        The <code>DBProxyEndpoint</code> object that is created by the API operation. The DB proxy endpoint that
     *        you create might provide capabilities such as read/write or read-only operations, or using a different VPC
     *        than the proxy's default VPC.
     */

    public void setDBProxyEndpoint(DBProxyEndpoint dBProxyEndpoint) {
        this.dBProxyEndpoint = dBProxyEndpoint;
    }

    /**
     * <p>
     * The <code>DBProxyEndpoint</code> object that is created by the API operation. The DB proxy endpoint that you
     * create might provide capabilities such as read/write or read-only operations, or using a different VPC than the
     * proxy's default VPC.
     * </p>
     * 
     * @return The <code>DBProxyEndpoint</code> object that is created by the API operation. The DB proxy endpoint that
     *         you create might provide capabilities such as read/write or read-only operations, or using a different
     *         VPC than the proxy's default VPC.
     */

    public DBProxyEndpoint getDBProxyEndpoint() {
        return this.dBProxyEndpoint;
    }

    /**
     * <p>
     * The <code>DBProxyEndpoint</code> object that is created by the API operation. The DB proxy endpoint that you
     * create might provide capabilities such as read/write or read-only operations, or using a different VPC than the
     * proxy's default VPC.
     * </p>
     * 
     * @param dBProxyEndpoint
     *        The <code>DBProxyEndpoint</code> object that is created by the API operation. The DB proxy endpoint that
     *        you create might provide capabilities such as read/write or read-only operations, or using a different VPC
     *        than the proxy's default VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBProxyEndpointResult withDBProxyEndpoint(DBProxyEndpoint dBProxyEndpoint) {
        setDBProxyEndpoint(dBProxyEndpoint);
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
        if (getDBProxyEndpoint() != null)
            sb.append("DBProxyEndpoint: ").append(getDBProxyEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDBProxyEndpointResult == false)
            return false;
        CreateDBProxyEndpointResult other = (CreateDBProxyEndpointResult) obj;
        if (other.getDBProxyEndpoint() == null ^ this.getDBProxyEndpoint() == null)
            return false;
        if (other.getDBProxyEndpoint() != null && other.getDBProxyEndpoint().equals(this.getDBProxyEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBProxyEndpoint() == null) ? 0 : getDBProxyEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public CreateDBProxyEndpointResult clone() {
        try {
            return (CreateDBProxyEndpointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
