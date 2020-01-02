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
package com.amazonaws.services.marketplacecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/DescribeEntity" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEntityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Required. The catalog related to the request. Fixed value: <code>AWSMarketplace</code>
     * </p>
     */
    private String catalog;
    /**
     * <p>
     * Required. The unique ID of the entity to describe.
     * </p>
     */
    private String entityId;

    /**
     * <p>
     * Required. The catalog related to the request. Fixed value: <code>AWSMarketplace</code>
     * </p>
     * 
     * @param catalog
     *        Required. The catalog related to the request. Fixed value: <code>AWSMarketplace</code>
     */

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    /**
     * <p>
     * Required. The catalog related to the request. Fixed value: <code>AWSMarketplace</code>
     * </p>
     * 
     * @return Required. The catalog related to the request. Fixed value: <code>AWSMarketplace</code>
     */

    public String getCatalog() {
        return this.catalog;
    }

    /**
     * <p>
     * Required. The catalog related to the request. Fixed value: <code>AWSMarketplace</code>
     * </p>
     * 
     * @param catalog
     *        Required. The catalog related to the request. Fixed value: <code>AWSMarketplace</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEntityRequest withCatalog(String catalog) {
        setCatalog(catalog);
        return this;
    }

    /**
     * <p>
     * Required. The unique ID of the entity to describe.
     * </p>
     * 
     * @param entityId
     *        Required. The unique ID of the entity to describe.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * Required. The unique ID of the entity to describe.
     * </p>
     * 
     * @return Required. The unique ID of the entity to describe.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * Required. The unique ID of the entity to describe.
     * </p>
     * 
     * @param entityId
     *        Required. The unique ID of the entity to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEntityRequest withEntityId(String entityId) {
        setEntityId(entityId);
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
        if (getCatalog() != null)
            sb.append("Catalog: ").append(getCatalog()).append(",");
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEntityRequest == false)
            return false;
        DescribeEntityRequest other = (DescribeEntityRequest) obj;
        if (other.getCatalog() == null ^ this.getCatalog() == null)
            return false;
        if (other.getCatalog() != null && other.getCatalog().equals(this.getCatalog()) == false)
            return false;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalog() == null) ? 0 : getCatalog().hashCode());
        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEntityRequest clone() {
        return (DescribeEntityRequest) super.clone();
    }

}
