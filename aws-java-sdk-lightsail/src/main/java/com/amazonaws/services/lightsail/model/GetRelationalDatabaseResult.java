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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRelationalDatabase" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRelationalDatabaseResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object describing the specified database.
     * </p>
     */
    private RelationalDatabase relationalDatabase;

    /**
     * <p>
     * An object describing the specified database.
     * </p>
     * 
     * @param relationalDatabase
     *        An object describing the specified database.
     */

    public void setRelationalDatabase(RelationalDatabase relationalDatabase) {
        this.relationalDatabase = relationalDatabase;
    }

    /**
     * <p>
     * An object describing the specified database.
     * </p>
     * 
     * @return An object describing the specified database.
     */

    public RelationalDatabase getRelationalDatabase() {
        return this.relationalDatabase;
    }

    /**
     * <p>
     * An object describing the specified database.
     * </p>
     * 
     * @param relationalDatabase
     *        An object describing the specified database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRelationalDatabaseResult withRelationalDatabase(RelationalDatabase relationalDatabase) {
        setRelationalDatabase(relationalDatabase);
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
        if (getRelationalDatabase() != null)
            sb.append("RelationalDatabase: ").append(getRelationalDatabase());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRelationalDatabaseResult == false)
            return false;
        GetRelationalDatabaseResult other = (GetRelationalDatabaseResult) obj;
        if (other.getRelationalDatabase() == null ^ this.getRelationalDatabase() == null)
            return false;
        if (other.getRelationalDatabase() != null && other.getRelationalDatabase().equals(this.getRelationalDatabase()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRelationalDatabase() == null) ? 0 : getRelationalDatabase().hashCode());
        return hashCode;
    }

    @Override
    public GetRelationalDatabaseResult clone() {
        try {
            return (GetRelationalDatabaseResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
