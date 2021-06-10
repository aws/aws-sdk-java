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
package com.amazonaws.services.sagemakerfeaturestoreruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-featurestore-runtime-2020-07-01/BatchGetRecord"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetRecordResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of Records you requested to be retrieved in batch.
     * </p>
     */
    private java.util.List<BatchGetRecordResultDetail> records;
    /**
     * <p>
     * A list of errors that have occured when retrieving a batch of Records.
     * </p>
     */
    private java.util.List<BatchGetRecordError> errors;
    /**
     * <p>
     * A unprocessed list of <code>FeatureGroup</code> names, with their corresponding <code>RecordIdentifier</code>
     * value, and Feature name.
     * </p>
     */
    private java.util.List<BatchGetRecordIdentifier> unprocessedIdentifiers;

    /**
     * <p>
     * A list of Records you requested to be retrieved in batch.
     * </p>
     * 
     * @return A list of Records you requested to be retrieved in batch.
     */

    public java.util.List<BatchGetRecordResultDetail> getRecords() {
        return records;
    }

    /**
     * <p>
     * A list of Records you requested to be retrieved in batch.
     * </p>
     * 
     * @param records
     *        A list of Records you requested to be retrieved in batch.
     */

    public void setRecords(java.util.Collection<BatchGetRecordResultDetail> records) {
        if (records == null) {
            this.records = null;
            return;
        }

        this.records = new java.util.ArrayList<BatchGetRecordResultDetail>(records);
    }

    /**
     * <p>
     * A list of Records you requested to be retrieved in batch.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecords(java.util.Collection)} or {@link #withRecords(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param records
     *        A list of Records you requested to be retrieved in batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRecordResult withRecords(BatchGetRecordResultDetail... records) {
        if (this.records == null) {
            setRecords(new java.util.ArrayList<BatchGetRecordResultDetail>(records.length));
        }
        for (BatchGetRecordResultDetail ele : records) {
            this.records.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Records you requested to be retrieved in batch.
     * </p>
     * 
     * @param records
     *        A list of Records you requested to be retrieved in batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRecordResult withRecords(java.util.Collection<BatchGetRecordResultDetail> records) {
        setRecords(records);
        return this;
    }

    /**
     * <p>
     * A list of errors that have occured when retrieving a batch of Records.
     * </p>
     * 
     * @return A list of errors that have occured when retrieving a batch of Records.
     */

    public java.util.List<BatchGetRecordError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * A list of errors that have occured when retrieving a batch of Records.
     * </p>
     * 
     * @param errors
     *        A list of errors that have occured when retrieving a batch of Records.
     */

    public void setErrors(java.util.Collection<BatchGetRecordError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchGetRecordError>(errors);
    }

    /**
     * <p>
     * A list of errors that have occured when retrieving a batch of Records.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        A list of errors that have occured when retrieving a batch of Records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRecordResult withErrors(BatchGetRecordError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<BatchGetRecordError>(errors.length));
        }
        for (BatchGetRecordError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of errors that have occured when retrieving a batch of Records.
     * </p>
     * 
     * @param errors
     *        A list of errors that have occured when retrieving a batch of Records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRecordResult withErrors(java.util.Collection<BatchGetRecordError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * A unprocessed list of <code>FeatureGroup</code> names, with their corresponding <code>RecordIdentifier</code>
     * value, and Feature name.
     * </p>
     * 
     * @return A unprocessed list of <code>FeatureGroup</code> names, with their corresponding
     *         <code>RecordIdentifier</code> value, and Feature name.
     */

    public java.util.List<BatchGetRecordIdentifier> getUnprocessedIdentifiers() {
        return unprocessedIdentifiers;
    }

    /**
     * <p>
     * A unprocessed list of <code>FeatureGroup</code> names, with their corresponding <code>RecordIdentifier</code>
     * value, and Feature name.
     * </p>
     * 
     * @param unprocessedIdentifiers
     *        A unprocessed list of <code>FeatureGroup</code> names, with their corresponding
     *        <code>RecordIdentifier</code> value, and Feature name.
     */

    public void setUnprocessedIdentifiers(java.util.Collection<BatchGetRecordIdentifier> unprocessedIdentifiers) {
        if (unprocessedIdentifiers == null) {
            this.unprocessedIdentifiers = null;
            return;
        }

        this.unprocessedIdentifiers = new java.util.ArrayList<BatchGetRecordIdentifier>(unprocessedIdentifiers);
    }

    /**
     * <p>
     * A unprocessed list of <code>FeatureGroup</code> names, with their corresponding <code>RecordIdentifier</code>
     * value, and Feature name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedIdentifiers(java.util.Collection)} or
     * {@link #withUnprocessedIdentifiers(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param unprocessedIdentifiers
     *        A unprocessed list of <code>FeatureGroup</code> names, with their corresponding
     *        <code>RecordIdentifier</code> value, and Feature name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRecordResult withUnprocessedIdentifiers(BatchGetRecordIdentifier... unprocessedIdentifiers) {
        if (this.unprocessedIdentifiers == null) {
            setUnprocessedIdentifiers(new java.util.ArrayList<BatchGetRecordIdentifier>(unprocessedIdentifiers.length));
        }
        for (BatchGetRecordIdentifier ele : unprocessedIdentifiers) {
            this.unprocessedIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A unprocessed list of <code>FeatureGroup</code> names, with their corresponding <code>RecordIdentifier</code>
     * value, and Feature name.
     * </p>
     * 
     * @param unprocessedIdentifiers
     *        A unprocessed list of <code>FeatureGroup</code> names, with their corresponding
     *        <code>RecordIdentifier</code> value, and Feature name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRecordResult withUnprocessedIdentifiers(java.util.Collection<BatchGetRecordIdentifier> unprocessedIdentifiers) {
        setUnprocessedIdentifiers(unprocessedIdentifiers);
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
        if (getRecords() != null)
            sb.append("Records: ").append(getRecords()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors()).append(",");
        if (getUnprocessedIdentifiers() != null)
            sb.append("UnprocessedIdentifiers: ").append(getUnprocessedIdentifiers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetRecordResult == false)
            return false;
        BatchGetRecordResult other = (BatchGetRecordResult) obj;
        if (other.getRecords() == null ^ this.getRecords() == null)
            return false;
        if (other.getRecords() != null && other.getRecords().equals(this.getRecords()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getUnprocessedIdentifiers() == null ^ this.getUnprocessedIdentifiers() == null)
            return false;
        if (other.getUnprocessedIdentifiers() != null && other.getUnprocessedIdentifiers().equals(this.getUnprocessedIdentifiers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecords() == null) ? 0 : getRecords().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedIdentifiers() == null) ? 0 : getUnprocessedIdentifiers().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetRecordResult clone() {
        try {
            return (BatchGetRecordResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
