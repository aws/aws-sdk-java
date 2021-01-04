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
package com.amazonaws.services.healthlake.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/DescribeFHIRDatastore" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFHIRDatastoreResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * All properties associated with a Data Store, including the Data Store ID, Data Store ARN, Data Store name, Data
     * Store status, created at, Data Store type version, and Data Store endpoint.
     * </p>
     */
    private DatastoreProperties datastoreProperties;

    /**
     * <p>
     * All properties associated with a Data Store, including the Data Store ID, Data Store ARN, Data Store name, Data
     * Store status, created at, Data Store type version, and Data Store endpoint.
     * </p>
     * 
     * @param datastoreProperties
     *        All properties associated with a Data Store, including the Data Store ID, Data Store ARN, Data Store name,
     *        Data Store status, created at, Data Store type version, and Data Store endpoint.
     */

    public void setDatastoreProperties(DatastoreProperties datastoreProperties) {
        this.datastoreProperties = datastoreProperties;
    }

    /**
     * <p>
     * All properties associated with a Data Store, including the Data Store ID, Data Store ARN, Data Store name, Data
     * Store status, created at, Data Store type version, and Data Store endpoint.
     * </p>
     * 
     * @return All properties associated with a Data Store, including the Data Store ID, Data Store ARN, Data Store
     *         name, Data Store status, created at, Data Store type version, and Data Store endpoint.
     */

    public DatastoreProperties getDatastoreProperties() {
        return this.datastoreProperties;
    }

    /**
     * <p>
     * All properties associated with a Data Store, including the Data Store ID, Data Store ARN, Data Store name, Data
     * Store status, created at, Data Store type version, and Data Store endpoint.
     * </p>
     * 
     * @param datastoreProperties
     *        All properties associated with a Data Store, including the Data Store ID, Data Store ARN, Data Store name,
     *        Data Store status, created at, Data Store type version, and Data Store endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFHIRDatastoreResult withDatastoreProperties(DatastoreProperties datastoreProperties) {
        setDatastoreProperties(datastoreProperties);
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
        if (getDatastoreProperties() != null)
            sb.append("DatastoreProperties: ").append(getDatastoreProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFHIRDatastoreResult == false)
            return false;
        DescribeFHIRDatastoreResult other = (DescribeFHIRDatastoreResult) obj;
        if (other.getDatastoreProperties() == null ^ this.getDatastoreProperties() == null)
            return false;
        if (other.getDatastoreProperties() != null && other.getDatastoreProperties().equals(this.getDatastoreProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatastoreProperties() == null) ? 0 : getDatastoreProperties().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFHIRDatastoreResult clone() {
        try {
            return (DescribeFHIRDatastoreResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
