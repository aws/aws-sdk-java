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
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PredictRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier of the <code>MLModel</code>.
     * </p>
     */
    private String mLModelId;

    private com.amazonaws.internal.SdkInternalMap<String, String> record;

    private String predictEndpoint;

    /**
     * <p>
     * A unique identifier of the <code>MLModel</code>.
     * </p>
     * 
     * @param mLModelId
     *        A unique identifier of the <code>MLModel</code>.
     */

    public void setMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
    }

    /**
     * <p>
     * A unique identifier of the <code>MLModel</code>.
     * </p>
     * 
     * @return A unique identifier of the <code>MLModel</code>.
     */

    public String getMLModelId() {
        return this.mLModelId;
    }

    /**
     * <p>
     * A unique identifier of the <code>MLModel</code>.
     * </p>
     * 
     * @param mLModelId
     *        A unique identifier of the <code>MLModel</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictRequest withMLModelId(String mLModelId) {
        setMLModelId(mLModelId);
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, String> getRecord() {
        if (record == null) {
            record = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return record;
    }

    /**
     * @param record
     */

    public void setRecord(java.util.Map<String, String> record) {
        this.record = record == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(record);
    }

    /**
     * @param record
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictRequest withRecord(java.util.Map<String, String> record) {
        setRecord(record);
        return this;
    }

    public PredictRequest addRecordEntry(String key, String value) {
        if (null == this.record) {
            this.record = new com.amazonaws.internal.SdkInternalMap<String, String>();
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

    public PredictRequest clearRecordEntries() {
        this.record = null;
        return this;
    }

    /**
     * @param predictEndpoint
     */

    public void setPredictEndpoint(String predictEndpoint) {
        this.predictEndpoint = predictEndpoint;
    }

    /**
     * @return
     */

    public String getPredictEndpoint() {
        return this.predictEndpoint;
    }

    /**
     * @param predictEndpoint
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictRequest withPredictEndpoint(String predictEndpoint) {
        setPredictEndpoint(predictEndpoint);
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
        if (getMLModelId() != null)
            sb.append("MLModelId: ").append(getMLModelId()).append(",");
        if (getRecord() != null)
            sb.append("Record: ").append(getRecord()).append(",");
        if (getPredictEndpoint() != null)
            sb.append("PredictEndpoint: ").append(getPredictEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PredictRequest == false)
            return false;
        PredictRequest other = (PredictRequest) obj;
        if (other.getMLModelId() == null ^ this.getMLModelId() == null)
            return false;
        if (other.getMLModelId() != null && other.getMLModelId().equals(this.getMLModelId()) == false)
            return false;
        if (other.getRecord() == null ^ this.getRecord() == null)
            return false;
        if (other.getRecord() != null && other.getRecord().equals(this.getRecord()) == false)
            return false;
        if (other.getPredictEndpoint() == null ^ this.getPredictEndpoint() == null)
            return false;
        if (other.getPredictEndpoint() != null && other.getPredictEndpoint().equals(this.getPredictEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMLModelId() == null) ? 0 : getMLModelId().hashCode());
        hashCode = prime * hashCode + ((getRecord() == null) ? 0 : getRecord().hashCode());
        hashCode = prime * hashCode + ((getPredictEndpoint() == null) ? 0 : getPredictEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public PredictRequest clone() {
        return (PredictRequest) super.clone();
    }

}
