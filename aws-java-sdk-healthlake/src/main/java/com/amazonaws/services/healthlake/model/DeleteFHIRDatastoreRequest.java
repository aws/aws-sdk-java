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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/DeleteFHIRDatastore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFHIRDatastoreRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS-generated ID for the Data Store to be deleted.
     * </p>
     */
    private String datastoreId;

    /**
     * <p>
     * The AWS-generated ID for the Data Store to be deleted.
     * </p>
     * 
     * @param datastoreId
     *        The AWS-generated ID for the Data Store to be deleted.
     */

    public void setDatastoreId(String datastoreId) {
        this.datastoreId = datastoreId;
    }

    /**
     * <p>
     * The AWS-generated ID for the Data Store to be deleted.
     * </p>
     * 
     * @return The AWS-generated ID for the Data Store to be deleted.
     */

    public String getDatastoreId() {
        return this.datastoreId;
    }

    /**
     * <p>
     * The AWS-generated ID for the Data Store to be deleted.
     * </p>
     * 
     * @param datastoreId
     *        The AWS-generated ID for the Data Store to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFHIRDatastoreRequest withDatastoreId(String datastoreId) {
        setDatastoreId(datastoreId);
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
        if (getDatastoreId() != null)
            sb.append("DatastoreId: ").append(getDatastoreId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFHIRDatastoreRequest == false)
            return false;
        DeleteFHIRDatastoreRequest other = (DeleteFHIRDatastoreRequest) obj;
        if (other.getDatastoreId() == null ^ this.getDatastoreId() == null)
            return false;
        if (other.getDatastoreId() != null && other.getDatastoreId().equals(this.getDatastoreId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatastoreId() == null) ? 0 : getDatastoreId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFHIRDatastoreRequest clone() {
        return (DeleteFHIRDatastoreRequest) super.clone();
    }

}
