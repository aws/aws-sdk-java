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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/UpdateDatastore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDatastoreRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the data store to be updated.
     * </p>
     */
    private String datastoreName;
    /**
     * <p>
     * How long, in days, message data is kept for the data store.
     * </p>
     */
    private RetentionPeriod retentionPeriod;

    /**
     * <p>
     * The name of the data store to be updated.
     * </p>
     * 
     * @param datastoreName
     *        The name of the data store to be updated.
     */

    public void setDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
    }

    /**
     * <p>
     * The name of the data store to be updated.
     * </p>
     * 
     * @return The name of the data store to be updated.
     */

    public String getDatastoreName() {
        return this.datastoreName;
    }

    /**
     * <p>
     * The name of the data store to be updated.
     * </p>
     * 
     * @param datastoreName
     *        The name of the data store to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatastoreRequest withDatastoreName(String datastoreName) {
        setDatastoreName(datastoreName);
        return this;
    }

    /**
     * <p>
     * How long, in days, message data is kept for the data store.
     * </p>
     * 
     * @param retentionPeriod
     *        How long, in days, message data is kept for the data store.
     */

    public void setRetentionPeriod(RetentionPeriod retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * <p>
     * How long, in days, message data is kept for the data store.
     * </p>
     * 
     * @return How long, in days, message data is kept for the data store.
     */

    public RetentionPeriod getRetentionPeriod() {
        return this.retentionPeriod;
    }

    /**
     * <p>
     * How long, in days, message data is kept for the data store.
     * </p>
     * 
     * @param retentionPeriod
     *        How long, in days, message data is kept for the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatastoreRequest withRetentionPeriod(RetentionPeriod retentionPeriod) {
        setRetentionPeriod(retentionPeriod);
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
        if (getDatastoreName() != null)
            sb.append("DatastoreName: ").append(getDatastoreName()).append(",");
        if (getRetentionPeriod() != null)
            sb.append("RetentionPeriod: ").append(getRetentionPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDatastoreRequest == false)
            return false;
        UpdateDatastoreRequest other = (UpdateDatastoreRequest) obj;
        if (other.getDatastoreName() == null ^ this.getDatastoreName() == null)
            return false;
        if (other.getDatastoreName() != null && other.getDatastoreName().equals(this.getDatastoreName()) == false)
            return false;
        if (other.getRetentionPeriod() == null ^ this.getRetentionPeriod() == null)
            return false;
        if (other.getRetentionPeriod() != null && other.getRetentionPeriod().equals(this.getRetentionPeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatastoreName() == null) ? 0 : getDatastoreName().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDatastoreRequest clone() {
        return (UpdateDatastoreRequest) super.clone();
    }

}
