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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ExecuteProvisionedProductServiceAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecuteProvisionedProductServiceActionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An object containing detailed information about the result of provisioning the product.
     * </p>
     */
    private RecordDetail recordDetail;

    /**
     * <p>
     * An object containing detailed information about the result of provisioning the product.
     * </p>
     * 
     * @param recordDetail
     *        An object containing detailed information about the result of provisioning the product.
     */

    public void setRecordDetail(RecordDetail recordDetail) {
        this.recordDetail = recordDetail;
    }

    /**
     * <p>
     * An object containing detailed information about the result of provisioning the product.
     * </p>
     * 
     * @return An object containing detailed information about the result of provisioning the product.
     */

    public RecordDetail getRecordDetail() {
        return this.recordDetail;
    }

    /**
     * <p>
     * An object containing detailed information about the result of provisioning the product.
     * </p>
     * 
     * @param recordDetail
     *        An object containing detailed information about the result of provisioning the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteProvisionedProductServiceActionResult withRecordDetail(RecordDetail recordDetail) {
        setRecordDetail(recordDetail);
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
        if (getRecordDetail() != null)
            sb.append("RecordDetail: ").append(getRecordDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecuteProvisionedProductServiceActionResult == false)
            return false;
        ExecuteProvisionedProductServiceActionResult other = (ExecuteProvisionedProductServiceActionResult) obj;
        if (other.getRecordDetail() == null ^ this.getRecordDetail() == null)
            return false;
        if (other.getRecordDetail() != null && other.getRecordDetail().equals(this.getRecordDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecordDetail() == null) ? 0 : getRecordDetail().hashCode());
        return hashCode;
    }

    @Override
    public ExecuteProvisionedProductServiceActionResult clone() {
        try {
            return (ExecuteProvisionedProductServiceActionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
