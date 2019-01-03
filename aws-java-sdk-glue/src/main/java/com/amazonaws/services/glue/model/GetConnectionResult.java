/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetConnection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConnectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The requested connection definition.
     * </p>
     */
    private Connection connection;

    /**
     * <p>
     * The requested connection definition.
     * </p>
     * 
     * @param connection
     *        The requested connection definition.
     */

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    /**
     * <p>
     * The requested connection definition.
     * </p>
     * 
     * @return The requested connection definition.
     */

    public Connection getConnection() {
        return this.connection;
    }

    /**
     * <p>
     * The requested connection definition.
     * </p>
     * 
     * @param connection
     *        The requested connection definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConnectionResult withConnection(Connection connection) {
        setConnection(connection);
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
        if (getConnection() != null)
            sb.append("Connection: ").append(getConnection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConnectionResult == false)
            return false;
        GetConnectionResult other = (GetConnectionResult) obj;
        if (other.getConnection() == null ^ this.getConnection() == null)
            return false;
        if (other.getConnection() != null && other.getConnection().equals(this.getConnection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnection() == null) ? 0 : getConnection().hashCode());
        return hashCode;
    }

    @Override
    public GetConnectionResult clone() {
        try {
            return (GetConnectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
