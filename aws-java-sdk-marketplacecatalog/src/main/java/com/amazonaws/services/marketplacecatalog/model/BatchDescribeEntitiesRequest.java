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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/BatchDescribeEntities"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDescribeEntitiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * List of entity IDs and the catalogs the entities are present in.
     * </p>
     */
    private java.util.List<EntityRequest> entityRequestList;

    /**
     * <p>
     * List of entity IDs and the catalogs the entities are present in.
     * </p>
     * 
     * @return List of entity IDs and the catalogs the entities are present in.
     */

    public java.util.List<EntityRequest> getEntityRequestList() {
        return entityRequestList;
    }

    /**
     * <p>
     * List of entity IDs and the catalogs the entities are present in.
     * </p>
     * 
     * @param entityRequestList
     *        List of entity IDs and the catalogs the entities are present in.
     */

    public void setEntityRequestList(java.util.Collection<EntityRequest> entityRequestList) {
        if (entityRequestList == null) {
            this.entityRequestList = null;
            return;
        }

        this.entityRequestList = new java.util.ArrayList<EntityRequest>(entityRequestList);
    }

    /**
     * <p>
     * List of entity IDs and the catalogs the entities are present in.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntityRequestList(java.util.Collection)} or {@link #withEntityRequestList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param entityRequestList
     *        List of entity IDs and the catalogs the entities are present in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeEntitiesRequest withEntityRequestList(EntityRequest... entityRequestList) {
        if (this.entityRequestList == null) {
            setEntityRequestList(new java.util.ArrayList<EntityRequest>(entityRequestList.length));
        }
        for (EntityRequest ele : entityRequestList) {
            this.entityRequestList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of entity IDs and the catalogs the entities are present in.
     * </p>
     * 
     * @param entityRequestList
     *        List of entity IDs and the catalogs the entities are present in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDescribeEntitiesRequest withEntityRequestList(java.util.Collection<EntityRequest> entityRequestList) {
        setEntityRequestList(entityRequestList);
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
        if (getEntityRequestList() != null)
            sb.append("EntityRequestList: ").append(getEntityRequestList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDescribeEntitiesRequest == false)
            return false;
        BatchDescribeEntitiesRequest other = (BatchDescribeEntitiesRequest) obj;
        if (other.getEntityRequestList() == null ^ this.getEntityRequestList() == null)
            return false;
        if (other.getEntityRequestList() != null && other.getEntityRequestList().equals(this.getEntityRequestList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityRequestList() == null) ? 0 : getEntityRequestList().hashCode());
        return hashCode;
    }

    @Override
    public BatchDescribeEntitiesRequest clone() {
        return (BatchDescribeEntitiesRequest) super.clone();
    }

}
