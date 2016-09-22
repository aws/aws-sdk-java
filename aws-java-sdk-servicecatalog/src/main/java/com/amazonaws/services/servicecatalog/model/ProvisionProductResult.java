/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 */
public class ProvisionProductResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The detailed result of the <a>ProvisionProduct</a> request, containing the inputs made to that request, the
     * current state of the request, a pointer to the ProvisionedProduct object of the request, and a list of any errors
     * that the request encountered.
     * </p>
     */
    private RecordDetail recordDetail;

    /**
     * <p>
     * The detailed result of the <a>ProvisionProduct</a> request, containing the inputs made to that request, the
     * current state of the request, a pointer to the ProvisionedProduct object of the request, and a list of any errors
     * that the request encountered.
     * </p>
     * 
     * @param recordDetail
     *        The detailed result of the <a>ProvisionProduct</a> request, containing the inputs made to that request,
     *        the current state of the request, a pointer to the ProvisionedProduct object of the request, and a list of
     *        any errors that the request encountered.
     */

    public void setRecordDetail(RecordDetail recordDetail) {
        this.recordDetail = recordDetail;
    }

    /**
     * <p>
     * The detailed result of the <a>ProvisionProduct</a> request, containing the inputs made to that request, the
     * current state of the request, a pointer to the ProvisionedProduct object of the request, and a list of any errors
     * that the request encountered.
     * </p>
     * 
     * @return The detailed result of the <a>ProvisionProduct</a> request, containing the inputs made to that request,
     *         the current state of the request, a pointer to the ProvisionedProduct object of the request, and a list
     *         of any errors that the request encountered.
     */

    public RecordDetail getRecordDetail() {
        return this.recordDetail;
    }

    /**
     * <p>
     * The detailed result of the <a>ProvisionProduct</a> request, containing the inputs made to that request, the
     * current state of the request, a pointer to the ProvisionedProduct object of the request, and a list of any errors
     * that the request encountered.
     * </p>
     * 
     * @param recordDetail
     *        The detailed result of the <a>ProvisionProduct</a> request, containing the inputs made to that request,
     *        the current state of the request, a pointer to the ProvisionedProduct object of the request, and a list of
     *        any errors that the request encountered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionProductResult withRecordDetail(RecordDetail recordDetail) {
        setRecordDetail(recordDetail);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("RecordDetail: " + getRecordDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionProductResult == false)
            return false;
        ProvisionProductResult other = (ProvisionProductResult) obj;
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
    public ProvisionProductResult clone() {
        try {
            return (ProvisionProductResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
