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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/GetSampleData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSampleDataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of header labels for the records.
     * </p>
     */
    private java.util.List<String> headerValues;
    /**
     * <p>
     * A list of records.
     * </p>
     */
    private java.util.List<java.util.List<String>> sampleRows;

    /**
     * <p>
     * A list of header labels for the records.
     * </p>
     * 
     * @return A list of header labels for the records.
     */

    public java.util.List<String> getHeaderValues() {
        return headerValues;
    }

    /**
     * <p>
     * A list of header labels for the records.
     * </p>
     * 
     * @param headerValues
     *        A list of header labels for the records.
     */

    public void setHeaderValues(java.util.Collection<String> headerValues) {
        if (headerValues == null) {
            this.headerValues = null;
            return;
        }

        this.headerValues = new java.util.ArrayList<String>(headerValues);
    }

    /**
     * <p>
     * A list of header labels for the records.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHeaderValues(java.util.Collection)} or {@link #withHeaderValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param headerValues
     *        A list of header labels for the records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSampleDataResult withHeaderValues(String... headerValues) {
        if (this.headerValues == null) {
            setHeaderValues(new java.util.ArrayList<String>(headerValues.length));
        }
        for (String ele : headerValues) {
            this.headerValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of header labels for the records.
     * </p>
     * 
     * @param headerValues
     *        A list of header labels for the records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSampleDataResult withHeaderValues(java.util.Collection<String> headerValues) {
        setHeaderValues(headerValues);
        return this;
    }

    /**
     * <p>
     * A list of records.
     * </p>
     * 
     * @return A list of records.
     */

    public java.util.List<java.util.List<String>> getSampleRows() {
        return sampleRows;
    }

    /**
     * <p>
     * A list of records.
     * </p>
     * 
     * @param sampleRows
     *        A list of records.
     */

    public void setSampleRows(java.util.Collection<java.util.List<String>> sampleRows) {
        if (sampleRows == null) {
            this.sampleRows = null;
            return;
        }

        this.sampleRows = new java.util.ArrayList<java.util.List<String>>(sampleRows);
    }

    /**
     * <p>
     * A list of records.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSampleRows(java.util.Collection)} or {@link #withSampleRows(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sampleRows
     *        A list of records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSampleDataResult withSampleRows(java.util.List<String>... sampleRows) {
        if (this.sampleRows == null) {
            setSampleRows(new java.util.ArrayList<java.util.List<String>>(sampleRows.length));
        }
        for (java.util.List<String> ele : sampleRows) {
            this.sampleRows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of records.
     * </p>
     * 
     * @param sampleRows
     *        A list of records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSampleDataResult withSampleRows(java.util.Collection<java.util.List<String>> sampleRows) {
        setSampleRows(sampleRows);
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
        if (getHeaderValues() != null)
            sb.append("HeaderValues: ").append(getHeaderValues()).append(",");
        if (getSampleRows() != null)
            sb.append("SampleRows: ").append(getSampleRows());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSampleDataResult == false)
            return false;
        GetSampleDataResult other = (GetSampleDataResult) obj;
        if (other.getHeaderValues() == null ^ this.getHeaderValues() == null)
            return false;
        if (other.getHeaderValues() != null && other.getHeaderValues().equals(this.getHeaderValues()) == false)
            return false;
        if (other.getSampleRows() == null ^ this.getSampleRows() == null)
            return false;
        if (other.getSampleRows() != null && other.getSampleRows().equals(this.getSampleRows()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeaderValues() == null) ? 0 : getHeaderValues().hashCode());
        hashCode = prime * hashCode + ((getSampleRows() == null) ? 0 : getSampleRows().hashCode());
        return hashCode;
    }

    @Override
    public GetSampleDataResult clone() {
        try {
            return (GetSampleDataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
