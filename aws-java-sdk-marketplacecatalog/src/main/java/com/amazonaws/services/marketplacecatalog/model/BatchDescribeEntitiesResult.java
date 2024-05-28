/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.marketplacecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/BatchDescribeEntities"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDescribeEntitiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details about each entity.
     * </p>
     */
    private java.util.Map<String, EntityDetail> entityDetails;
    /**
     * <p>
     * A map of errors returned, with <code>EntityId</code> as the key and <code>errorDetail</code> as the value.
     * </p>
     */
    private java.util.Map<String, BatchDescribeErrorDetail> errors;

    /**
     * <p>
     * Details about each entity.
     * </p>
     * 
     * @return Details about each entity.
     */

    public java.util.Map<String, EntityDetail> getEntityDetails() {
        return entityDetails;
    }

    /**
     * <p>
     * Details about each entity.
     * </p>
     * 
     * @param entityDetails
     *        Details about each entity.
     */

    public void setEntityDetails(java.util.Map<String, EntityDetail> entityDetails) {
        this.entityDetails = entityDetails;
    }

    /**
     * <p>
     * Details about each entity.
     * </p>
     * 
     * @param entityDetails
     *        Details about each entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeEntitiesResult withEntityDetails(java.util.Map<String, EntityDetail> entityDetails) {
        setEntityDetails(entityDetails);
        return this;
    }

    /**
     * Add a single EntityDetails entry
     *
     * @see BatchDescribeEntitiesResult#withEntityDetails
     * @returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeEntitiesResult addEntityDetailsEntry(String key, EntityDetail value) {
        if (null == this.entityDetails) {
            this.entityDetails = new java.util.HashMap<String, EntityDetail>();
        }
        if (this.entityDetails.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.entityDetails.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EntityDetails.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeEntitiesResult clearEntityDetailsEntries() {
        this.entityDetails = null;
        return this;
    }

    /**
     * <p>
     * A map of errors returned, with <code>EntityId</code> as the key and <code>errorDetail</code> as the value.
     * </p>
     * 
     * @return A map of errors returned, with <code>EntityId</code> as the key and <code>errorDetail</code> as the
     *         value.
     */

    public java.util.Map<String, BatchDescribeErrorDetail> getErrors() {
        return errors;
    }

    /**
     * <p>
     * A map of errors returned, with <code>EntityId</code> as the key and <code>errorDetail</code> as the value.
     * </p>
     * 
     * @param errors
     *        A map of errors returned, with <code>EntityId</code> as the key and <code>errorDetail</code> as the value.
     */

    public void setErrors(java.util.Map<String, BatchDescribeErrorDetail> errors) {
        this.errors = errors;
    }

    /**
     * <p>
     * A map of errors returned, with <code>EntityId</code> as the key and <code>errorDetail</code> as the value.
     * </p>
     * 
     * @param errors
     *        A map of errors returned, with <code>EntityId</code> as the key and <code>errorDetail</code> as the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeEntitiesResult withErrors(java.util.Map<String, BatchDescribeErrorDetail> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * Add a single Errors entry
     *
     * @see BatchDescribeEntitiesResult#withErrors
     * @returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeEntitiesResult addErrorsEntry(String key, BatchDescribeErrorDetail value) {
        if (null == this.errors) {
            this.errors = new java.util.HashMap<String, BatchDescribeErrorDetail>();
        }
        if (this.errors.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.errors.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Errors.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeEntitiesResult clearErrorsEntries() {
        this.errors = null;
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
        if (getEntityDetails() != null)
            sb.append("EntityDetails: ").append(getEntityDetails()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDescribeEntitiesResult == false)
            return false;
        BatchDescribeEntitiesResult other = (BatchDescribeEntitiesResult) obj;
        if (other.getEntityDetails() == null ^ this.getEntityDetails() == null)
            return false;
        if (other.getEntityDetails() != null && other.getEntityDetails().equals(this.getEntityDetails()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityDetails() == null) ? 0 : getEntityDetails().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchDescribeEntitiesResult clone() {
        try {
            return (BatchDescribeEntitiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
