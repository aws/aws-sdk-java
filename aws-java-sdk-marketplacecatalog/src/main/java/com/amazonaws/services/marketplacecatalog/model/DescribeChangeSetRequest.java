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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/DescribeChangeSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeChangeSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Required. The catalog related to the request. Fixed value: <code>AWSMarketplace</code>
     * </p>
     */
    private String catalog;
    /**
     * <p>
     * Required. The unique identifier for the <code>StartChangeSet</code> request that you want to describe the details
     * for.
     * </p>
     */
    private String changeSetId;

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

    public DescribeChangeSetRequest withCatalog(String catalog) {
        setCatalog(catalog);
        return this;
    }

    /**
     * <p>
     * Required. The unique identifier for the <code>StartChangeSet</code> request that you want to describe the details
     * for.
     * </p>
     * 
     * @param changeSetId
     *        Required. The unique identifier for the <code>StartChangeSet</code> request that you want to describe the
     *        details for.
     */

    public void setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
    }

    /**
     * <p>
     * Required. The unique identifier for the <code>StartChangeSet</code> request that you want to describe the details
     * for.
     * </p>
     * 
     * @return Required. The unique identifier for the <code>StartChangeSet</code> request that you want to describe the
     *         details for.
     */

    public String getChangeSetId() {
        return this.changeSetId;
    }

    /**
     * <p>
     * Required. The unique identifier for the <code>StartChangeSet</code> request that you want to describe the details
     * for.
     * </p>
     * 
     * @param changeSetId
     *        Required. The unique identifier for the <code>StartChangeSet</code> request that you want to describe the
     *        details for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeChangeSetRequest withChangeSetId(String changeSetId) {
        setChangeSetId(changeSetId);
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
        if (getChangeSetId() != null)
            sb.append("ChangeSetId: ").append(getChangeSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeChangeSetRequest == false)
            return false;
        DescribeChangeSetRequest other = (DescribeChangeSetRequest) obj;
        if (other.getCatalog() == null ^ this.getCatalog() == null)
            return false;
        if (other.getCatalog() != null && other.getCatalog().equals(this.getCatalog()) == false)
            return false;
        if (other.getChangeSetId() == null ^ this.getChangeSetId() == null)
            return false;
        if (other.getChangeSetId() != null && other.getChangeSetId().equals(this.getChangeSetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalog() == null) ? 0 : getCatalog().hashCode());
        hashCode = prime * hashCode + ((getChangeSetId() == null) ? 0 : getChangeSetId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeChangeSetRequest clone() {
        return (DescribeChangeSetRequest) super.clone();
    }

}
