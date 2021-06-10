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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The output of Records that have been retrieved in a batch.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-featurestore-runtime-2020-07-01/BatchGetRecordResultDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetRecordResultDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>FeatureGroupName</code> containing Records you retrieved in a batch.
     * </p>
     */
    private String featureGroupName;
    /**
     * <p>
     * The value of the record identifer in string format.
     * </p>
     */
    private String recordIdentifierValueAsString;
    /**
     * <p>
     * The <code>Record</code> retrieved.
     * </p>
     */
    private java.util.List<FeatureValue> record;

    /**
     * <p>
     * The <code>FeatureGroupName</code> containing Records you retrieved in a batch.
     * </p>
     * 
     * @param featureGroupName
     *        The <code>FeatureGroupName</code> containing Records you retrieved in a batch.
     */

    public void setFeatureGroupName(String featureGroupName) {
        this.featureGroupName = featureGroupName;
    }

    /**
     * <p>
     * The <code>FeatureGroupName</code> containing Records you retrieved in a batch.
     * </p>
     * 
     * @return The <code>FeatureGroupName</code> containing Records you retrieved in a batch.
     */

    public String getFeatureGroupName() {
        return this.featureGroupName;
    }

    /**
     * <p>
     * The <code>FeatureGroupName</code> containing Records you retrieved in a batch.
     * </p>
     * 
     * @param featureGroupName
     *        The <code>FeatureGroupName</code> containing Records you retrieved in a batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRecordResultDetail withFeatureGroupName(String featureGroupName) {
        setFeatureGroupName(featureGroupName);
        return this;
    }

    /**
     * <p>
     * The value of the record identifer in string format.
     * </p>
     * 
     * @param recordIdentifierValueAsString
     *        The value of the record identifer in string format.
     */

    public void setRecordIdentifierValueAsString(String recordIdentifierValueAsString) {
        this.recordIdentifierValueAsString = recordIdentifierValueAsString;
    }

    /**
     * <p>
     * The value of the record identifer in string format.
     * </p>
     * 
     * @return The value of the record identifer in string format.
     */

    public String getRecordIdentifierValueAsString() {
        return this.recordIdentifierValueAsString;
    }

    /**
     * <p>
     * The value of the record identifer in string format.
     * </p>
     * 
     * @param recordIdentifierValueAsString
     *        The value of the record identifer in string format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRecordResultDetail withRecordIdentifierValueAsString(String recordIdentifierValueAsString) {
        setRecordIdentifierValueAsString(recordIdentifierValueAsString);
        return this;
    }

    /**
     * <p>
     * The <code>Record</code> retrieved.
     * </p>
     * 
     * @return The <code>Record</code> retrieved.
     */

    public java.util.List<FeatureValue> getRecord() {
        return record;
    }

    /**
     * <p>
     * The <code>Record</code> retrieved.
     * </p>
     * 
     * @param record
     *        The <code>Record</code> retrieved.
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
     * The <code>Record</code> retrieved.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecord(java.util.Collection)} or {@link #withRecord(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param record
     *        The <code>Record</code> retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRecordResultDetail withRecord(FeatureValue... record) {
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
     * The <code>Record</code> retrieved.
     * </p>
     * 
     * @param record
     *        The <code>Record</code> retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetRecordResultDetail withRecord(java.util.Collection<FeatureValue> record) {
        setRecord(record);
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
        if (getFeatureGroupName() != null)
            sb.append("FeatureGroupName: ").append(getFeatureGroupName()).append(",");
        if (getRecordIdentifierValueAsString() != null)
            sb.append("RecordIdentifierValueAsString: ").append(getRecordIdentifierValueAsString()).append(",");
        if (getRecord() != null)
            sb.append("Record: ").append(getRecord());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetRecordResultDetail == false)
            return false;
        BatchGetRecordResultDetail other = (BatchGetRecordResultDetail) obj;
        if (other.getFeatureGroupName() == null ^ this.getFeatureGroupName() == null)
            return false;
        if (other.getFeatureGroupName() != null && other.getFeatureGroupName().equals(this.getFeatureGroupName()) == false)
            return false;
        if (other.getRecordIdentifierValueAsString() == null ^ this.getRecordIdentifierValueAsString() == null)
            return false;
        if (other.getRecordIdentifierValueAsString() != null
                && other.getRecordIdentifierValueAsString().equals(this.getRecordIdentifierValueAsString()) == false)
            return false;
        if (other.getRecord() == null ^ this.getRecord() == null)
            return false;
        if (other.getRecord() != null && other.getRecord().equals(this.getRecord()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeatureGroupName() == null) ? 0 : getFeatureGroupName().hashCode());
        hashCode = prime * hashCode + ((getRecordIdentifierValueAsString() == null) ? 0 : getRecordIdentifierValueAsString().hashCode());
        hashCode = prime * hashCode + ((getRecord() == null) ? 0 : getRecord().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetRecordResultDetail clone() {
        try {
            return (BatchGetRecordResultDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakerfeaturestoreruntime.model.transform.BatchGetRecordResultDetailMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
