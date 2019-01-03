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
public class UpdateMLModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID assigned to the <code>MLModel</code> during creation.
     * </p>
     */
    private String mLModelId;
    /**
     * <p>
     * A user-supplied name or description of the <code>MLModel</code>.
     * </p>
     */
    private String mLModelName;
    /**
     * <p>
     * The <code>ScoreThreshold</code> used in binary classification <code>MLModel</code> that marks the boundary
     * between a positive prediction and a negative prediction.
     * </p>
     * <p>
     * Output values greater than or equal to the <code>ScoreThreshold</code> receive a positive result from the
     * <code>MLModel</code>, such as <code>true</code>. Output values less than the <code>ScoreThreshold</code> receive
     * a negative response from the <code>MLModel</code>, such as <code>false</code>.
     * </p>
     */
    private Float scoreThreshold;

    /**
     * <p>
     * The ID assigned to the <code>MLModel</code> during creation.
     * </p>
     * 
     * @param mLModelId
     *        The ID assigned to the <code>MLModel</code> during creation.
     */

    public void setMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
    }

    /**
     * <p>
     * The ID assigned to the <code>MLModel</code> during creation.
     * </p>
     * 
     * @return The ID assigned to the <code>MLModel</code> during creation.
     */

    public String getMLModelId() {
        return this.mLModelId;
    }

    /**
     * <p>
     * The ID assigned to the <code>MLModel</code> during creation.
     * </p>
     * 
     * @param mLModelId
     *        The ID assigned to the <code>MLModel</code> during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMLModelRequest withMLModelId(String mLModelId) {
        setMLModelId(mLModelId);
        return this;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>MLModel</code>.
     * </p>
     * 
     * @param mLModelName
     *        A user-supplied name or description of the <code>MLModel</code>.
     */

    public void setMLModelName(String mLModelName) {
        this.mLModelName = mLModelName;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>MLModel</code>.
     * </p>
     * 
     * @return A user-supplied name or description of the <code>MLModel</code>.
     */

    public String getMLModelName() {
        return this.mLModelName;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>MLModel</code>.
     * </p>
     * 
     * @param mLModelName
     *        A user-supplied name or description of the <code>MLModel</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMLModelRequest withMLModelName(String mLModelName) {
        setMLModelName(mLModelName);
        return this;
    }

    /**
     * <p>
     * The <code>ScoreThreshold</code> used in binary classification <code>MLModel</code> that marks the boundary
     * between a positive prediction and a negative prediction.
     * </p>
     * <p>
     * Output values greater than or equal to the <code>ScoreThreshold</code> receive a positive result from the
     * <code>MLModel</code>, such as <code>true</code>. Output values less than the <code>ScoreThreshold</code> receive
     * a negative response from the <code>MLModel</code>, such as <code>false</code>.
     * </p>
     * 
     * @param scoreThreshold
     *        The <code>ScoreThreshold</code> used in binary classification <code>MLModel</code> that marks the boundary
     *        between a positive prediction and a negative prediction.</p>
     *        <p>
     *        Output values greater than or equal to the <code>ScoreThreshold</code> receive a positive result from the
     *        <code>MLModel</code>, such as <code>true</code>. Output values less than the <code>ScoreThreshold</code>
     *        receive a negative response from the <code>MLModel</code>, such as <code>false</code>.
     */

    public void setScoreThreshold(Float scoreThreshold) {
        this.scoreThreshold = scoreThreshold;
    }

    /**
     * <p>
     * The <code>ScoreThreshold</code> used in binary classification <code>MLModel</code> that marks the boundary
     * between a positive prediction and a negative prediction.
     * </p>
     * <p>
     * Output values greater than or equal to the <code>ScoreThreshold</code> receive a positive result from the
     * <code>MLModel</code>, such as <code>true</code>. Output values less than the <code>ScoreThreshold</code> receive
     * a negative response from the <code>MLModel</code>, such as <code>false</code>.
     * </p>
     * 
     * @return The <code>ScoreThreshold</code> used in binary classification <code>MLModel</code> that marks the
     *         boundary between a positive prediction and a negative prediction.</p>
     *         <p>
     *         Output values greater than or equal to the <code>ScoreThreshold</code> receive a positive result from the
     *         <code>MLModel</code>, such as <code>true</code>. Output values less than the <code>ScoreThreshold</code>
     *         receive a negative response from the <code>MLModel</code>, such as <code>false</code>.
     */

    public Float getScoreThreshold() {
        return this.scoreThreshold;
    }

    /**
     * <p>
     * The <code>ScoreThreshold</code> used in binary classification <code>MLModel</code> that marks the boundary
     * between a positive prediction and a negative prediction.
     * </p>
     * <p>
     * Output values greater than or equal to the <code>ScoreThreshold</code> receive a positive result from the
     * <code>MLModel</code>, such as <code>true</code>. Output values less than the <code>ScoreThreshold</code> receive
     * a negative response from the <code>MLModel</code>, such as <code>false</code>.
     * </p>
     * 
     * @param scoreThreshold
     *        The <code>ScoreThreshold</code> used in binary classification <code>MLModel</code> that marks the boundary
     *        between a positive prediction and a negative prediction.</p>
     *        <p>
     *        Output values greater than or equal to the <code>ScoreThreshold</code> receive a positive result from the
     *        <code>MLModel</code>, such as <code>true</code>. Output values less than the <code>ScoreThreshold</code>
     *        receive a negative response from the <code>MLModel</code>, such as <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMLModelRequest withScoreThreshold(Float scoreThreshold) {
        setScoreThreshold(scoreThreshold);
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
        if (getMLModelName() != null)
            sb.append("MLModelName: ").append(getMLModelName()).append(",");
        if (getScoreThreshold() != null)
            sb.append("ScoreThreshold: ").append(getScoreThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMLModelRequest == false)
            return false;
        UpdateMLModelRequest other = (UpdateMLModelRequest) obj;
        if (other.getMLModelId() == null ^ this.getMLModelId() == null)
            return false;
        if (other.getMLModelId() != null && other.getMLModelId().equals(this.getMLModelId()) == false)
            return false;
        if (other.getMLModelName() == null ^ this.getMLModelName() == null)
            return false;
        if (other.getMLModelName() != null && other.getMLModelName().equals(this.getMLModelName()) == false)
            return false;
        if (other.getScoreThreshold() == null ^ this.getScoreThreshold() == null)
            return false;
        if (other.getScoreThreshold() != null && other.getScoreThreshold().equals(this.getScoreThreshold()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMLModelId() == null) ? 0 : getMLModelId().hashCode());
        hashCode = prime * hashCode + ((getMLModelName() == null) ? 0 : getMLModelName().hashCode());
        hashCode = prime * hashCode + ((getScoreThreshold() == null) ? 0 : getScoreThreshold().hashCode());
        return hashCode;
    }

    @Override
    public UpdateMLModelRequest clone() {
        return (UpdateMLModelRequest) super.clone();
    }

}
