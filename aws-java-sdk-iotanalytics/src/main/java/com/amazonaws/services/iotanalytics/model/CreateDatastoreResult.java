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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CreateDatastore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDatastoreResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the data store.
     * </p>
     */
    private String datastoreName;
    /**
     * <p>
     * The ARN of the data store.
     * </p>
     */
    private String datastoreArn;
    /**
     * <p>
     * How long, in days, message data is kept for the data store.
     * </p>
     */
    private RetentionPeriod retentionPeriod;

    /**
     * <p>
     * The name of the data store.
     * </p>
     * 
     * @param datastoreName
     *        The name of the data store.
     */

    public void setDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
    }

    /**
     * <p>
     * The name of the data store.
     * </p>
     * 
     * @return The name of the data store.
     */

    public String getDatastoreName() {
        return this.datastoreName;
    }

    /**
     * <p>
     * The name of the data store.
     * </p>
     * 
     * @param datastoreName
     *        The name of the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatastoreResult withDatastoreName(String datastoreName) {
        setDatastoreName(datastoreName);
        return this;
    }

    /**
     * <p>
     * The ARN of the data store.
     * </p>
     * 
     * @param datastoreArn
     *        The ARN of the data store.
     */

    public void setDatastoreArn(String datastoreArn) {
        this.datastoreArn = datastoreArn;
    }

    /**
     * <p>
     * The ARN of the data store.
     * </p>
     * 
     * @return The ARN of the data store.
     */

    public String getDatastoreArn() {
        return this.datastoreArn;
    }

    /**
     * <p>
     * The ARN of the data store.
     * </p>
     * 
     * @param datastoreArn
     *        The ARN of the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatastoreResult withDatastoreArn(String datastoreArn) {
        setDatastoreArn(datastoreArn);
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

    public CreateDatastoreResult withRetentionPeriod(RetentionPeriod retentionPeriod) {
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
        if (getDatastoreArn() != null)
            sb.append("DatastoreArn: ").append(getDatastoreArn()).append(",");
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

        if (obj instanceof CreateDatastoreResult == false)
            return false;
        CreateDatastoreResult other = (CreateDatastoreResult) obj;
        if (other.getDatastoreName() == null ^ this.getDatastoreName() == null)
            return false;
        if (other.getDatastoreName() != null && other.getDatastoreName().equals(this.getDatastoreName()) == false)
            return false;
        if (other.getDatastoreArn() == null ^ this.getDatastoreArn() == null)
            return false;
        if (other.getDatastoreArn() != null && other.getDatastoreArn().equals(this.getDatastoreArn()) == false)
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
        hashCode = prime * hashCode + ((getDatastoreArn() == null) ? 0 : getDatastoreArn().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode());
        return hashCode;
    }

    @Override
    public CreateDatastoreResult clone() {
        try {
            return (CreateDatastoreResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
