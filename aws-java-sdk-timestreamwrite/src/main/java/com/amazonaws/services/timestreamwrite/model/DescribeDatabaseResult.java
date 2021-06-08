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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DescribeDatabase" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDatabaseResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Timestream table.
     * </p>
     */
    private Database database;

    /**
     * <p>
     * The name of the Timestream table.
     * </p>
     * 
     * @param database
     *        The name of the Timestream table.
     */

    public void setDatabase(Database database) {
        this.database = database;
    }

    /**
     * <p>
     * The name of the Timestream table.
     * </p>
     * 
     * @return The name of the Timestream table.
     */

    public Database getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * The name of the Timestream table.
     * </p>
     * 
     * @param database
     *        The name of the Timestream table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatabaseResult withDatabase(Database database) {
        setDatabase(database);
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
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDatabaseResult == false)
            return false;
        DescribeDatabaseResult other = (DescribeDatabaseResult) obj;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDatabaseResult clone() {
        try {
            return (DescribeDatabaseResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
