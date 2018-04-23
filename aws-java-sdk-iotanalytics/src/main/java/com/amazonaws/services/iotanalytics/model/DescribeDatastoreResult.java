/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DescribeDatastore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDatastoreResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the data store.
     * </p>
     */
    private Datastore datastore;

    /**
     * <p>
     * Information about the data store.
     * </p>
     * 
     * @param datastore
     *        Information about the data store.
     */

    public void setDatastore(Datastore datastore) {
        this.datastore = datastore;
    }

    /**
     * <p>
     * Information about the data store.
     * </p>
     * 
     * @return Information about the data store.
     */

    public Datastore getDatastore() {
        return this.datastore;
    }

    /**
     * <p>
     * Information about the data store.
     * </p>
     * 
     * @param datastore
     *        Information about the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatastoreResult withDatastore(Datastore datastore) {
        setDatastore(datastore);
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
        if (getDatastore() != null)
            sb.append("Datastore: ").append(getDatastore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDatastoreResult == false)
            return false;
        DescribeDatastoreResult other = (DescribeDatastoreResult) obj;
        if (other.getDatastore() == null ^ this.getDatastore() == null)
            return false;
        if (other.getDatastore() != null && other.getDatastore().equals(this.getDatastore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatastore() == null) ? 0 : getDatastore().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDatastoreResult clone() {
        try {
            return (DescribeDatastoreResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
