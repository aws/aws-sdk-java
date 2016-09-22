/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;

/**
 * <p/>
 */
public class AddPermissionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The permission statement you specified in the request. The response returns the same as a string using a
     * backslash ("\") as an escape character in the JSON.
     * </p>
     */
    private String statement;

    /**
     * <p>
     * The permission statement you specified in the request. The response returns the same as a string using a
     * backslash ("\") as an escape character in the JSON.
     * </p>
     * 
     * @param statement
     *        The permission statement you specified in the request. The response returns the same as a string using a
     *        backslash ("\") as an escape character in the JSON.
     */

    public void setStatement(String statement) {
        this.statement = statement;
    }

    /**
     * <p>
     * The permission statement you specified in the request. The response returns the same as a string using a
     * backslash ("\") as an escape character in the JSON.
     * </p>
     * 
     * @return The permission statement you specified in the request. The response returns the same as a string using a
     *         backslash ("\") as an escape character in the JSON.
     */

    public String getStatement() {
        return this.statement;
    }

    /**
     * <p>
     * The permission statement you specified in the request. The response returns the same as a string using a
     * backslash ("\") as an escape character in the JSON.
     * </p>
     * 
     * @param statement
     *        The permission statement you specified in the request. The response returns the same as a string using a
     *        backslash ("\") as an escape character in the JSON.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddPermissionResult withStatement(String statement) {
        setStatement(statement);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStatement() != null)
            sb.append("Statement: " + getStatement());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddPermissionResult == false)
            return false;
        AddPermissionResult other = (AddPermissionResult) obj;
        if (other.getStatement() == null ^ this.getStatement() == null)
            return false;
        if (other.getStatement() != null && other.getStatement().equals(this.getStatement()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatement() == null) ? 0 : getStatement().hashCode());
        return hashCode;
    }

    @Override
    public AddPermissionResult clone() {
        try {
            return (AddPermissionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
