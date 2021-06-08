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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-featurestore-runtime-2020-07-01/PutRecord"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRecordRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the feature group that you want to insert the record into.
     * </p>
     */
    private String featureGroupName;
    /**
     * <p>
     * List of FeatureValues to be inserted. This will be a full over-write. If you only want to update few of the
     * feature values, do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code>GetRecord</code> to retrieve the latest record.
     * </p>
     * </li>
     * <li>
     * <p>
     * Update the record returned from <code>GetRecord</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>PutRecord</code> to update feature values.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<FeatureValue> record;

    /**
     * <p>
     * The name of the feature group that you want to insert the record into.
     * </p>
     * 
     * @param featureGroupName
     *        The name of the feature group that you want to insert the record into.
     */

    public void setFeatureGroupName(String featureGroupName) {
        this.featureGroupName = featureGroupName;
    }

    /**
     * <p>
     * The name of the feature group that you want to insert the record into.
     * </p>
     * 
     * @return The name of the feature group that you want to insert the record into.
     */

    public String getFeatureGroupName() {
        return this.featureGroupName;
    }

    /**
     * <p>
     * The name of the feature group that you want to insert the record into.
     * </p>
     * 
     * @param featureGroupName
     *        The name of the feature group that you want to insert the record into.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecordRequest withFeatureGroupName(String featureGroupName) {
        setFeatureGroupName(featureGroupName);
        return this;
    }

    /**
     * <p>
     * List of FeatureValues to be inserted. This will be a full over-write. If you only want to update few of the
     * feature values, do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code>GetRecord</code> to retrieve the latest record.
     * </p>
     * </li>
     * <li>
     * <p>
     * Update the record returned from <code>GetRecord</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>PutRecord</code> to update feature values.
     * </p>
     * </li>
     * </ul>
     * 
     * @return List of FeatureValues to be inserted. This will be a full over-write. If you only want to update few of
     *         the feature values, do the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Use <code>GetRecord</code> to retrieve the latest record.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Update the record returned from <code>GetRecord</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Use <code>PutRecord</code> to update feature values.
     *         </p>
     *         </li>
     */

    public java.util.List<FeatureValue> getRecord() {
        return record;
    }

    /**
     * <p>
     * List of FeatureValues to be inserted. This will be a full over-write. If you only want to update few of the
     * feature values, do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code>GetRecord</code> to retrieve the latest record.
     * </p>
     * </li>
     * <li>
     * <p>
     * Update the record returned from <code>GetRecord</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>PutRecord</code> to update feature values.
     * </p>
     * </li>
     * </ul>
     * 
     * @param record
     *        List of FeatureValues to be inserted. This will be a full over-write. If you only want to update few of
     *        the feature values, do the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Use <code>GetRecord</code> to retrieve the latest record.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Update the record returned from <code>GetRecord</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use <code>PutRecord</code> to update feature values.
     *        </p>
     *        </li>
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
     * List of FeatureValues to be inserted. This will be a full over-write. If you only want to update few of the
     * feature values, do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code>GetRecord</code> to retrieve the latest record.
     * </p>
     * </li>
     * <li>
     * <p>
     * Update the record returned from <code>GetRecord</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>PutRecord</code> to update feature values.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecord(java.util.Collection)} or {@link #withRecord(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param record
     *        List of FeatureValues to be inserted. This will be a full over-write. If you only want to update few of
     *        the feature values, do the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Use <code>GetRecord</code> to retrieve the latest record.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Update the record returned from <code>GetRecord</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use <code>PutRecord</code> to update feature values.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecordRequest withRecord(FeatureValue... record) {
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
     * List of FeatureValues to be inserted. This will be a full over-write. If you only want to update few of the
     * feature values, do the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use <code>GetRecord</code> to retrieve the latest record.
     * </p>
     * </li>
     * <li>
     * <p>
     * Update the record returned from <code>GetRecord</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>PutRecord</code> to update feature values.
     * </p>
     * </li>
     * </ul>
     * 
     * @param record
     *        List of FeatureValues to be inserted. This will be a full over-write. If you only want to update few of
     *        the feature values, do the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Use <code>GetRecord</code> to retrieve the latest record.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Update the record returned from <code>GetRecord</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use <code>PutRecord</code> to update feature values.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecordRequest withRecord(java.util.Collection<FeatureValue> record) {
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

        if (obj instanceof PutRecordRequest == false)
            return false;
        PutRecordRequest other = (PutRecordRequest) obj;
        if (other.getFeatureGroupName() == null ^ this.getFeatureGroupName() == null)
            return false;
        if (other.getFeatureGroupName() != null && other.getFeatureGroupName().equals(this.getFeatureGroupName()) == false)
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
        hashCode = prime * hashCode + ((getRecord() == null) ? 0 : getRecord().hashCode());
        return hashCode;
    }

    @Override
    public PutRecordRequest clone() {
        return (PutRecordRequest) super.clone();
    }

}
