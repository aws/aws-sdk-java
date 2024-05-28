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
package com.amazonaws.services.sagemakerfeaturestoreruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-featurestore-runtime-2020-07-01/GetRecord"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRecordResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The record you requested. A list of <code>FeatureValues</code>.
     * </p>
     */
    private java.util.List<FeatureValue> record;
    /**
     * <p>
     * The <code>ExpiresAt</code> ISO string of the requested record.
     * </p>
     */
    private String expiresAt;

    /**
     * <p>
     * The record you requested. A list of <code>FeatureValues</code>.
     * </p>
     * 
     * @return The record you requested. A list of <code>FeatureValues</code>.
     */

    public java.util.List<FeatureValue> getRecord() {
        return record;
    }

    /**
     * <p>
     * The record you requested. A list of <code>FeatureValues</code>.
     * </p>
     * 
     * @param record
     *        The record you requested. A list of <code>FeatureValues</code>.
     */

    public void setRecord(java.util.Collection<FeatureValue> record) {
        if (record == null) {
            this.record = null;
            return;
        }

        this.record = new java.util.ArrayList<FeatureValue>(record);
    }

    /**
     * <p>
     * The record you requested. A list of <code>FeatureValues</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecord(java.util.Collection)} or {@link #withRecord(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param record
     *        The record you requested. A list of <code>FeatureValues</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecordResult withRecord(FeatureValue... record) {
        if (this.record == null) {
            setRecord(new java.util.ArrayList<FeatureValue>(record.length));
        }
        for (FeatureValue ele : record) {
            this.record.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The record you requested. A list of <code>FeatureValues</code>.
     * </p>
     * 
     * @param record
     *        The record you requested. A list of <code>FeatureValues</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecordResult withRecord(java.util.Collection<FeatureValue> record) {
        setRecord(record);
        return this;
    }

    /**
     * <p>
     * The <code>ExpiresAt</code> ISO string of the requested record.
     * </p>
     * 
     * @param expiresAt
     *        The <code>ExpiresAt</code> ISO string of the requested record.
     */

    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * <p>
     * The <code>ExpiresAt</code> ISO string of the requested record.
     * </p>
     * 
     * @return The <code>ExpiresAt</code> ISO string of the requested record.
     */

    public String getExpiresAt() {
        return this.expiresAt;
    }

    /**
     * <p>
     * The <code>ExpiresAt</code> ISO string of the requested record.
     * </p>
     * 
     * @param expiresAt
     *        The <code>ExpiresAt</code> ISO string of the requested record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecordResult withExpiresAt(String expiresAt) {
        setExpiresAt(expiresAt);
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
        if (getRecord() != null)
            sb.append("Record: ").append(getRecord()).append(",");
        if (getExpiresAt() != null)
            sb.append("ExpiresAt: ").append(getExpiresAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRecordResult == false)
            return false;
        GetRecordResult other = (GetRecordResult) obj;
        if (other.getRecord() == null ^ this.getRecord() == null)
            return false;
        if (other.getRecord() != null && other.getRecord().equals(this.getRecord()) == false)
            return false;
        if (other.getExpiresAt() == null ^ this.getExpiresAt() == null)
            return false;
        if (other.getExpiresAt() != null && other.getExpiresAt().equals(this.getExpiresAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecord() == null) ? 0 : getRecord().hashCode());
        hashCode = prime * hashCode + ((getExpiresAt() == null) ? 0 : getExpiresAt().hashCode());
        return hashCode;
    }

    @Override
    public GetRecordResult clone() {
        try {
            return (GetRecordResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
