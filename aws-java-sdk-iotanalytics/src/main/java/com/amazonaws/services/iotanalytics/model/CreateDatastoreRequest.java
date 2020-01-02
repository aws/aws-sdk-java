/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CreateDatastore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDatastoreRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the data store.
     * </p>
     */
    private String datastoreName;
    /**
     * <p>
     * Where data store data is stored. You may choose one of "serviceManagedS3" or "customerManagedS3" storage. If not
     * specified, the default is "serviceManagedS3". This cannot be changed after the data store is created.
     * </p>
     */
    private DatastoreStorage datastoreStorage;
    /**
     * <p>
     * How long, in days, message data is kept for the data store. When "customerManagedS3" storage is selected, this
     * parameter is ignored.
     * </p>
     */
    private RetentionPeriod retentionPeriod;
    /**
     * <p>
     * Metadata which can be used to manage the data store.
     * </p>
     */
    private java.util.List<Tag> tags;

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

    public CreateDatastoreRequest withDatastoreName(String datastoreName) {
        setDatastoreName(datastoreName);
        return this;
    }

    /**
     * <p>
     * Where data store data is stored. You may choose one of "serviceManagedS3" or "customerManagedS3" storage. If not
     * specified, the default is "serviceManagedS3". This cannot be changed after the data store is created.
     * </p>
     * 
     * @param datastoreStorage
     *        Where data store data is stored. You may choose one of "serviceManagedS3" or "customerManagedS3" storage.
     *        If not specified, the default is "serviceManagedS3". This cannot be changed after the data store is
     *        created.
     */

    public void setDatastoreStorage(DatastoreStorage datastoreStorage) {
        this.datastoreStorage = datastoreStorage;
    }

    /**
     * <p>
     * Where data store data is stored. You may choose one of "serviceManagedS3" or "customerManagedS3" storage. If not
     * specified, the default is "serviceManagedS3". This cannot be changed after the data store is created.
     * </p>
     * 
     * @return Where data store data is stored. You may choose one of "serviceManagedS3" or "customerManagedS3" storage.
     *         If not specified, the default is "serviceManagedS3". This cannot be changed after the data store is
     *         created.
     */

    public DatastoreStorage getDatastoreStorage() {
        return this.datastoreStorage;
    }

    /**
     * <p>
     * Where data store data is stored. You may choose one of "serviceManagedS3" or "customerManagedS3" storage. If not
     * specified, the default is "serviceManagedS3". This cannot be changed after the data store is created.
     * </p>
     * 
     * @param datastoreStorage
     *        Where data store data is stored. You may choose one of "serviceManagedS3" or "customerManagedS3" storage.
     *        If not specified, the default is "serviceManagedS3". This cannot be changed after the data store is
     *        created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatastoreRequest withDatastoreStorage(DatastoreStorage datastoreStorage) {
        setDatastoreStorage(datastoreStorage);
        return this;
    }

    /**
     * <p>
     * How long, in days, message data is kept for the data store. When "customerManagedS3" storage is selected, this
     * parameter is ignored.
     * </p>
     * 
     * @param retentionPeriod
     *        How long, in days, message data is kept for the data store. When "customerManagedS3" storage is selected,
     *        this parameter is ignored.
     */

    public void setRetentionPeriod(RetentionPeriod retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * <p>
     * How long, in days, message data is kept for the data store. When "customerManagedS3" storage is selected, this
     * parameter is ignored.
     * </p>
     * 
     * @return How long, in days, message data is kept for the data store. When "customerManagedS3" storage is selected,
     *         this parameter is ignored.
     */

    public RetentionPeriod getRetentionPeriod() {
        return this.retentionPeriod;
    }

    /**
     * <p>
     * How long, in days, message data is kept for the data store. When "customerManagedS3" storage is selected, this
     * parameter is ignored.
     * </p>
     * 
     * @param retentionPeriod
     *        How long, in days, message data is kept for the data store. When "customerManagedS3" storage is selected,
     *        this parameter is ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatastoreRequest withRetentionPeriod(RetentionPeriod retentionPeriod) {
        setRetentionPeriod(retentionPeriod);
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the data store.
     * </p>
     * 
     * @return Metadata which can be used to manage the data store.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata which can be used to manage the data store.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the data store.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata which can be used to manage the data store.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatastoreRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the data store.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatastoreRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getDatastoreStorage() != null)
            sb.append("DatastoreStorage: ").append(getDatastoreStorage()).append(",");
        if (getRetentionPeriod() != null)
            sb.append("RetentionPeriod: ").append(getRetentionPeriod()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDatastoreRequest == false)
            return false;
        CreateDatastoreRequest other = (CreateDatastoreRequest) obj;
        if (other.getDatastoreName() == null ^ this.getDatastoreName() == null)
            return false;
        if (other.getDatastoreName() != null && other.getDatastoreName().equals(this.getDatastoreName()) == false)
            return false;
        if (other.getDatastoreStorage() == null ^ this.getDatastoreStorage() == null)
            return false;
        if (other.getDatastoreStorage() != null && other.getDatastoreStorage().equals(this.getDatastoreStorage()) == false)
            return false;
        if (other.getRetentionPeriod() == null ^ this.getRetentionPeriod() == null)
            return false;
        if (other.getRetentionPeriod() != null && other.getRetentionPeriod().equals(this.getRetentionPeriod()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatastoreName() == null) ? 0 : getDatastoreName().hashCode());
        hashCode = prime * hashCode + ((getDatastoreStorage() == null) ? 0 : getDatastoreStorage().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDatastoreRequest clone() {
        return (CreateDatastoreRequest) super.clone();
    }

}
