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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/GetMatchId" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMatchIdRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Normalizes the attributes defined in the schema in the input data. For example, if an attribute has an
     * <code>AttributeType</code> of <code>PHONE_NUMBER</code>, and the data in the input table is in a format of
     * 1234567890, Entity Resolution will normalize this field in the output to (123)-456-7890.
     * </p>
     */
    private Boolean applyNormalization;
    /**
     * <p>
     * The record to fetch the Match ID for.
     * </p>
     */
    private java.util.Map<String, String> record;
    /**
     * <p>
     * The name of the workflow.
     * </p>
     */
    private String workflowName;

    /**
     * <p>
     * Normalizes the attributes defined in the schema in the input data. For example, if an attribute has an
     * <code>AttributeType</code> of <code>PHONE_NUMBER</code>, and the data in the input table is in a format of
     * 1234567890, Entity Resolution will normalize this field in the output to (123)-456-7890.
     * </p>
     * 
     * @param applyNormalization
     *        Normalizes the attributes defined in the schema in the input data. For example, if an attribute has an
     *        <code>AttributeType</code> of <code>PHONE_NUMBER</code>, and the data in the input table is in a format of
     *        1234567890, Entity Resolution will normalize this field in the output to (123)-456-7890.
     */

    public void setApplyNormalization(Boolean applyNormalization) {
        this.applyNormalization = applyNormalization;
    }

    /**
     * <p>
     * Normalizes the attributes defined in the schema in the input data. For example, if an attribute has an
     * <code>AttributeType</code> of <code>PHONE_NUMBER</code>, and the data in the input table is in a format of
     * 1234567890, Entity Resolution will normalize this field in the output to (123)-456-7890.
     * </p>
     * 
     * @return Normalizes the attributes defined in the schema in the input data. For example, if an attribute has an
     *         <code>AttributeType</code> of <code>PHONE_NUMBER</code>, and the data in the input table is in a format
     *         of 1234567890, Entity Resolution will normalize this field in the output to (123)-456-7890.
     */

    public Boolean getApplyNormalization() {
        return this.applyNormalization;
    }

    /**
     * <p>
     * Normalizes the attributes defined in the schema in the input data. For example, if an attribute has an
     * <code>AttributeType</code> of <code>PHONE_NUMBER</code>, and the data in the input table is in a format of
     * 1234567890, Entity Resolution will normalize this field in the output to (123)-456-7890.
     * </p>
     * 
     * @param applyNormalization
     *        Normalizes the attributes defined in the schema in the input data. For example, if an attribute has an
     *        <code>AttributeType</code> of <code>PHONE_NUMBER</code>, and the data in the input table is in a format of
     *        1234567890, Entity Resolution will normalize this field in the output to (123)-456-7890.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchIdRequest withApplyNormalization(Boolean applyNormalization) {
        setApplyNormalization(applyNormalization);
        return this;
    }

    /**
     * <p>
     * Normalizes the attributes defined in the schema in the input data. For example, if an attribute has an
     * <code>AttributeType</code> of <code>PHONE_NUMBER</code>, and the data in the input table is in a format of
     * 1234567890, Entity Resolution will normalize this field in the output to (123)-456-7890.
     * </p>
     * 
     * @return Normalizes the attributes defined in the schema in the input data. For example, if an attribute has an
     *         <code>AttributeType</code> of <code>PHONE_NUMBER</code>, and the data in the input table is in a format
     *         of 1234567890, Entity Resolution will normalize this field in the output to (123)-456-7890.
     */

    public Boolean isApplyNormalization() {
        return this.applyNormalization;
    }

    /**
     * <p>
     * The record to fetch the Match ID for.
     * </p>
     * 
     * @return The record to fetch the Match ID for.
     */

    public java.util.Map<String, String> getRecord() {
        return record;
    }

    /**
     * <p>
     * The record to fetch the Match ID for.
     * </p>
     * 
     * @param record
     *        The record to fetch the Match ID for.
     */

    public void setRecord(java.util.Map<String, String> record) {
        this.record = record;
    }

    /**
     * <p>
     * The record to fetch the Match ID for.
     * </p>
     * 
     * @param record
     *        The record to fetch the Match ID for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchIdRequest withRecord(java.util.Map<String, String> record) {
        setRecord(record);
        return this;
    }

    /**
     * Add a single Record entry
     *
     * @see GetMatchIdRequest#withRecord
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchIdRequest addRecordEntry(String key, String value) {
        if (null == this.record) {
            this.record = new java.util.HashMap<String, String>();
        }
        if (this.record.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.record.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Record.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchIdRequest clearRecordEntries() {
        this.record = null;
        return this;
    }

    /**
     * <p>
     * The name of the workflow.
     * </p>
     * 
     * @param workflowName
     *        The name of the workflow.
     */

    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    /**
     * <p>
     * The name of the workflow.
     * </p>
     * 
     * @return The name of the workflow.
     */

    public String getWorkflowName() {
        return this.workflowName;
    }

    /**
     * <p>
     * The name of the workflow.
     * </p>
     * 
     * @param workflowName
     *        The name of the workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMatchIdRequest withWorkflowName(String workflowName) {
        setWorkflowName(workflowName);
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
        if (getApplyNormalization() != null)
            sb.append("ApplyNormalization: ").append(getApplyNormalization()).append(",");
        if (getRecord() != null)
            sb.append("Record: ").append("***Sensitive Data Redacted***").append(",");
        if (getWorkflowName() != null)
            sb.append("WorkflowName: ").append(getWorkflowName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMatchIdRequest == false)
            return false;
        GetMatchIdRequest other = (GetMatchIdRequest) obj;
        if (other.getApplyNormalization() == null ^ this.getApplyNormalization() == null)
            return false;
        if (other.getApplyNormalization() != null && other.getApplyNormalization().equals(this.getApplyNormalization()) == false)
            return false;
        if (other.getRecord() == null ^ this.getRecord() == null)
            return false;
        if (other.getRecord() != null && other.getRecord().equals(this.getRecord()) == false)
            return false;
        if (other.getWorkflowName() == null ^ this.getWorkflowName() == null)
            return false;
        if (other.getWorkflowName() != null && other.getWorkflowName().equals(this.getWorkflowName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplyNormalization() == null) ? 0 : getApplyNormalization().hashCode());
        hashCode = prime * hashCode + ((getRecord() == null) ? 0 : getRecord().hashCode());
        hashCode = prime * hashCode + ((getWorkflowName() == null) ? 0 : getWorkflowName().hashCode());
        return hashCode;
    }

    @Override
    public GetMatchIdRequest clone() {
        return (GetMatchIdRequest) super.clone();
    }

}
