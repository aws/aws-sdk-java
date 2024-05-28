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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of the refresh schedule details for a dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TopicRefreshScheduleSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicRefreshScheduleSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the dataset.
     * </p>
     */
    private String datasetId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     */
    private String datasetArn;
    /**
     * <p>
     * The name of the dataset.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * The definition of a refresh schedule.
     * </p>
     */
    private TopicRefreshSchedule refreshSchedule;

    /**
     * <p>
     * The ID of the dataset.
     * </p>
     * 
     * @param datasetId
     *        The ID of the dataset.
     */

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    /**
     * <p>
     * The ID of the dataset.
     * </p>
     * 
     * @return The ID of the dataset.
     */

    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * <p>
     * The ID of the dataset.
     * </p>
     * 
     * @param datasetId
     *        The ID of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRefreshScheduleSummary withDatasetId(String datasetId) {
        setDatasetId(datasetId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRefreshScheduleSummary withDatasetArn(String datasetArn) {
        setDatasetArn(datasetArn);
        return this;
    }

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * 
     * @return The name of the dataset.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRefreshScheduleSummary withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * The definition of a refresh schedule.
     * </p>
     * 
     * @param refreshSchedule
     *        The definition of a refresh schedule.
     */

    public void setRefreshSchedule(TopicRefreshSchedule refreshSchedule) {
        this.refreshSchedule = refreshSchedule;
    }

    /**
     * <p>
     * The definition of a refresh schedule.
     * </p>
     * 
     * @return The definition of a refresh schedule.
     */

    public TopicRefreshSchedule getRefreshSchedule() {
        return this.refreshSchedule;
    }

    /**
     * <p>
     * The definition of a refresh schedule.
     * </p>
     * 
     * @param refreshSchedule
     *        The definition of a refresh schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRefreshScheduleSummary withRefreshSchedule(TopicRefreshSchedule refreshSchedule) {
        setRefreshSchedule(refreshSchedule);
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
        if (getDatasetId() != null)
            sb.append("DatasetId: ").append(getDatasetId()).append(",");
        if (getDatasetArn() != null)
            sb.append("DatasetArn: ").append(getDatasetArn()).append(",");
        if (getDatasetName() != null)
            sb.append("DatasetName: ").append(getDatasetName()).append(",");
        if (getRefreshSchedule() != null)
            sb.append("RefreshSchedule: ").append(getRefreshSchedule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TopicRefreshScheduleSummary == false)
            return false;
        TopicRefreshScheduleSummary other = (TopicRefreshScheduleSummary) obj;
        if (other.getDatasetId() == null ^ this.getDatasetId() == null)
            return false;
        if (other.getDatasetId() != null && other.getDatasetId().equals(this.getDatasetId()) == false)
            return false;
        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null && other.getDatasetArn().equals(this.getDatasetArn()) == false)
            return false;
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getRefreshSchedule() == null ^ this.getRefreshSchedule() == null)
            return false;
        if (other.getRefreshSchedule() != null && other.getRefreshSchedule().equals(this.getRefreshSchedule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetId() == null) ? 0 : getDatasetId().hashCode());
        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getRefreshSchedule() == null) ? 0 : getRefreshSchedule().hashCode());
        return hashCode;
    }

    @Override
    public TopicRefreshScheduleSummary clone() {
        try {
            return (TopicRefreshScheduleSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TopicRefreshScheduleSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
