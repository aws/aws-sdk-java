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
public class CreateBatchPredictionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>BatchPrediction</code>.
     * </p>
     */
    private String batchPredictionId;
    /**
     * <p>
     * A user-supplied name or description of the <code>BatchPrediction</code>. <code>BatchPredictionName</code> can
     * only use the UTF-8 character set.
     * </p>
     */
    private String batchPredictionName;
    /**
     * <p>
     * The ID of the <code>MLModel</code> that will generate predictions for the group of observations.
     * </p>
     */
    private String mLModelId;
    /**
     * <p>
     * The ID of the <code>DataSource</code> that points to the group of observations to predict.
     * </p>
     */
    private String batchPredictionDataSourceId;
    /**
     * <p>
     * The location of an Amazon Simple Storage Service (Amazon S3) bucket or directory to store the batch prediction
     * results. The following substrings are not allowed in the <code>s3 key</code> portion of the
     * <code>outputURI</code> field: ':', '//', '/./', '/../'.
     * </p>
     * <p>
     * Amazon ML needs permissions to store and retrieve the logs on your behalf. For information about how to set
     * permissions, see the <a href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon Machine Learning
     * Developer Guide</a>.
     * </p>
     */
    private String outputUri;

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>BatchPrediction</code>.
     * </p>
     * 
     * @param batchPredictionId
     *        A user-supplied ID that uniquely identifies the <code>BatchPrediction</code>.
     */

    public void setBatchPredictionId(String batchPredictionId) {
        this.batchPredictionId = batchPredictionId;
    }

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>BatchPrediction</code>.
     * </p>
     * 
     * @return A user-supplied ID that uniquely identifies the <code>BatchPrediction</code>.
     */

    public String getBatchPredictionId() {
        return this.batchPredictionId;
    }

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>BatchPrediction</code>.
     * </p>
     * 
     * @param batchPredictionId
     *        A user-supplied ID that uniquely identifies the <code>BatchPrediction</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchPredictionRequest withBatchPredictionId(String batchPredictionId) {
        setBatchPredictionId(batchPredictionId);
        return this;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>BatchPrediction</code>. <code>BatchPredictionName</code> can
     * only use the UTF-8 character set.
     * </p>
     * 
     * @param batchPredictionName
     *        A user-supplied name or description of the <code>BatchPrediction</code>. <code>BatchPredictionName</code>
     *        can only use the UTF-8 character set.
     */

    public void setBatchPredictionName(String batchPredictionName) {
        this.batchPredictionName = batchPredictionName;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>BatchPrediction</code>. <code>BatchPredictionName</code> can
     * only use the UTF-8 character set.
     * </p>
     * 
     * @return A user-supplied name or description of the <code>BatchPrediction</code>. <code>BatchPredictionName</code>
     *         can only use the UTF-8 character set.
     */

    public String getBatchPredictionName() {
        return this.batchPredictionName;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>BatchPrediction</code>. <code>BatchPredictionName</code> can
     * only use the UTF-8 character set.
     * </p>
     * 
     * @param batchPredictionName
     *        A user-supplied name or description of the <code>BatchPrediction</code>. <code>BatchPredictionName</code>
     *        can only use the UTF-8 character set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchPredictionRequest withBatchPredictionName(String batchPredictionName) {
        setBatchPredictionName(batchPredictionName);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>MLModel</code> that will generate predictions for the group of observations.
     * </p>
     * 
     * @param mLModelId
     *        The ID of the <code>MLModel</code> that will generate predictions for the group of observations.
     */

    public void setMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
    }

    /**
     * <p>
     * The ID of the <code>MLModel</code> that will generate predictions for the group of observations.
     * </p>
     * 
     * @return The ID of the <code>MLModel</code> that will generate predictions for the group of observations.
     */

    public String getMLModelId() {
        return this.mLModelId;
    }

    /**
     * <p>
     * The ID of the <code>MLModel</code> that will generate predictions for the group of observations.
     * </p>
     * 
     * @param mLModelId
     *        The ID of the <code>MLModel</code> that will generate predictions for the group of observations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchPredictionRequest withMLModelId(String mLModelId) {
        setMLModelId(mLModelId);
        return this;
    }

    /**
     * <p>
     * The ID of the <code>DataSource</code> that points to the group of observations to predict.
     * </p>
     * 
     * @param batchPredictionDataSourceId
     *        The ID of the <code>DataSource</code> that points to the group of observations to predict.
     */

    public void setBatchPredictionDataSourceId(String batchPredictionDataSourceId) {
        this.batchPredictionDataSourceId = batchPredictionDataSourceId;
    }

    /**
     * <p>
     * The ID of the <code>DataSource</code> that points to the group of observations to predict.
     * </p>
     * 
     * @return The ID of the <code>DataSource</code> that points to the group of observations to predict.
     */

    public String getBatchPredictionDataSourceId() {
        return this.batchPredictionDataSourceId;
    }

    /**
     * <p>
     * The ID of the <code>DataSource</code> that points to the group of observations to predict.
     * </p>
     * 
     * @param batchPredictionDataSourceId
     *        The ID of the <code>DataSource</code> that points to the group of observations to predict.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchPredictionRequest withBatchPredictionDataSourceId(String batchPredictionDataSourceId) {
        setBatchPredictionDataSourceId(batchPredictionDataSourceId);
        return this;
    }

    /**
     * <p>
     * The location of an Amazon Simple Storage Service (Amazon S3) bucket or directory to store the batch prediction
     * results. The following substrings are not allowed in the <code>s3 key</code> portion of the
     * <code>outputURI</code> field: ':', '//', '/./', '/../'.
     * </p>
     * <p>
     * Amazon ML needs permissions to store and retrieve the logs on your behalf. For information about how to set
     * permissions, see the <a href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon Machine Learning
     * Developer Guide</a>.
     * </p>
     * 
     * @param outputUri
     *        The location of an Amazon Simple Storage Service (Amazon S3) bucket or directory to store the batch
     *        prediction results. The following substrings are not allowed in the <code>s3 key</code> portion of the
     *        <code>outputURI</code> field: ':', '//', '/./', '/../'.</p>
     *        <p>
     *        Amazon ML needs permissions to store and retrieve the logs on your behalf. For information about how to
     *        set permissions, see the <a href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon Machine
     *        Learning Developer Guide</a>.
     */

    public void setOutputUri(String outputUri) {
        this.outputUri = outputUri;
    }

    /**
     * <p>
     * The location of an Amazon Simple Storage Service (Amazon S3) bucket or directory to store the batch prediction
     * results. The following substrings are not allowed in the <code>s3 key</code> portion of the
     * <code>outputURI</code> field: ':', '//', '/./', '/../'.
     * </p>
     * <p>
     * Amazon ML needs permissions to store and retrieve the logs on your behalf. For information about how to set
     * permissions, see the <a href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon Machine Learning
     * Developer Guide</a>.
     * </p>
     * 
     * @return The location of an Amazon Simple Storage Service (Amazon S3) bucket or directory to store the batch
     *         prediction results. The following substrings are not allowed in the <code>s3 key</code> portion of the
     *         <code>outputURI</code> field: ':', '//', '/./', '/../'.</p>
     *         <p>
     *         Amazon ML needs permissions to store and retrieve the logs on your behalf. For information about how to
     *         set permissions, see the <a href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon Machine
     *         Learning Developer Guide</a>.
     */

    public String getOutputUri() {
        return this.outputUri;
    }

    /**
     * <p>
     * The location of an Amazon Simple Storage Service (Amazon S3) bucket or directory to store the batch prediction
     * results. The following substrings are not allowed in the <code>s3 key</code> portion of the
     * <code>outputURI</code> field: ':', '//', '/./', '/../'.
     * </p>
     * <p>
     * Amazon ML needs permissions to store and retrieve the logs on your behalf. For information about how to set
     * permissions, see the <a href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon Machine Learning
     * Developer Guide</a>.
     * </p>
     * 
     * @param outputUri
     *        The location of an Amazon Simple Storage Service (Amazon S3) bucket or directory to store the batch
     *        prediction results. The following substrings are not allowed in the <code>s3 key</code> portion of the
     *        <code>outputURI</code> field: ':', '//', '/./', '/../'.</p>
     *        <p>
     *        Amazon ML needs permissions to store and retrieve the logs on your behalf. For information about how to
     *        set permissions, see the <a href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon Machine
     *        Learning Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBatchPredictionRequest withOutputUri(String outputUri) {
        setOutputUri(outputUri);
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
        if (getBatchPredictionId() != null)
            sb.append("BatchPredictionId: ").append(getBatchPredictionId()).append(",");
        if (getBatchPredictionName() != null)
            sb.append("BatchPredictionName: ").append(getBatchPredictionName()).append(",");
        if (getMLModelId() != null)
            sb.append("MLModelId: ").append(getMLModelId()).append(",");
        if (getBatchPredictionDataSourceId() != null)
            sb.append("BatchPredictionDataSourceId: ").append(getBatchPredictionDataSourceId()).append(",");
        if (getOutputUri() != null)
            sb.append("OutputUri: ").append(getOutputUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBatchPredictionRequest == false)
            return false;
        CreateBatchPredictionRequest other = (CreateBatchPredictionRequest) obj;
        if (other.getBatchPredictionId() == null ^ this.getBatchPredictionId() == null)
            return false;
        if (other.getBatchPredictionId() != null && other.getBatchPredictionId().equals(this.getBatchPredictionId()) == false)
            return false;
        if (other.getBatchPredictionName() == null ^ this.getBatchPredictionName() == null)
            return false;
        if (other.getBatchPredictionName() != null && other.getBatchPredictionName().equals(this.getBatchPredictionName()) == false)
            return false;
        if (other.getMLModelId() == null ^ this.getMLModelId() == null)
            return false;
        if (other.getMLModelId() != null && other.getMLModelId().equals(this.getMLModelId()) == false)
            return false;
        if (other.getBatchPredictionDataSourceId() == null ^ this.getBatchPredictionDataSourceId() == null)
            return false;
        if (other.getBatchPredictionDataSourceId() != null && other.getBatchPredictionDataSourceId().equals(this.getBatchPredictionDataSourceId()) == false)
            return false;
        if (other.getOutputUri() == null ^ this.getOutputUri() == null)
            return false;
        if (other.getOutputUri() != null && other.getOutputUri().equals(this.getOutputUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBatchPredictionId() == null) ? 0 : getBatchPredictionId().hashCode());
        hashCode = prime * hashCode + ((getBatchPredictionName() == null) ? 0 : getBatchPredictionName().hashCode());
        hashCode = prime * hashCode + ((getMLModelId() == null) ? 0 : getMLModelId().hashCode());
        hashCode = prime * hashCode + ((getBatchPredictionDataSourceId() == null) ? 0 : getBatchPredictionDataSourceId().hashCode());
        hashCode = prime * hashCode + ((getOutputUri() == null) ? 0 : getOutputUri().hashCode());
        return hashCode;
    }

    @Override
    public CreateBatchPredictionRequest clone() {
        return (CreateBatchPredictionRequest) super.clone();
    }

}
