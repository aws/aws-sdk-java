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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DeleteConnection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteConnectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A description of the App Runner connection that this request just deleted.
     * </p>
     */
    private Connection connection;

    /**
     * <p>
     * A description of the App Runner connection that this request just deleted.
     * </p>
     * 
     * @param connection
     *        A description of the App Runner connection that this request just deleted.
     */

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    /**
     * <p>
     * A description of the App Runner connection that this request just deleted.
     * </p>
     * 
     * @return A description of the App Runner connection that this request just deleted.
     */

    public Connection getConnection() {
        return this.connection;
    }

    /**
     * <p>
     * A description of the App Runner connection that this request just deleted.
     * </p>
     * 
     * @param connection
     *        A description of the App Runner connection that this request just deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConnectionResult withConnection(Connection connection) {
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

        if (obj instanceof DeleteConnectionResult == false)
            return false;
        DeleteConnectionResult other = (DeleteConnectionResult) obj;
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
    public DeleteConnectionResult clone() {
        try {
            return (DeleteConnectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
