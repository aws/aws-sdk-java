/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the result of a data quality rule recommendation run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DataQualityRuleRecommendationRunDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataQualityRuleRecommendationRunDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique run identifier associated with this run.
     * </p>
     */
    private String runId;
    /**
     * <p>
     * The status for this run.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date and time when this run started.
     * </p>
     */
    private java.util.Date startedOn;
    /**
     * <p>
     * The data source (Glue table) associated with the recommendation run.
     * </p>
     */
    private DataSource dataSource;

    /**
     * <p>
     * The unique run identifier associated with this run.
     * </p>
     * 
     * @param runId
     *        The unique run identifier associated with this run.
     */

    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * The unique run identifier associated with this run.
     * </p>
     * 
     * @return The unique run identifier associated with this run.
     */

    public String getRunId() {
        return this.runId;
    }

    /**
     * <p>
     * The unique run identifier associated with this run.
     * </p>
     * 
     * @param runId
     *        The unique run identifier associated with this run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityRuleRecommendationRunDescription withRunId(String runId) {
        setRunId(runId);
        return this;
    }

    /**
     * <p>
     * The status for this run.
     * </p>
     * 
     * @param status
     *        The status for this run.
     * @see TaskStatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status for this run.
     * </p>
     * 
     * @return The status for this run.
     * @see TaskStatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status for this run.
     * </p>
     * 
     * @param status
     *        The status for this run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStatusType
     */

    public DataQualityRuleRecommendationRunDescription withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status for this run.
     * </p>
     * 
     * @param status
     *        The status for this run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStatusType
     */

    public DataQualityRuleRecommendationRunDescription withStatus(TaskStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when this run started.
     * </p>
     * 
     * @param startedOn
     *        The date and time when this run started.
     */

    public void setStartedOn(java.util.Date startedOn) {
        this.startedOn = startedOn;
    }

    /**
     * <p>
     * The date and time when this run started.
     * </p>
     * 
     * @return The date and time when this run started.
     */

    public java.util.Date getStartedOn() {
        return this.startedOn;
    }

    /**
     * <p>
     * The date and time when this run started.
     * </p>
     * 
     * @param startedOn
     *        The date and time when this run started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityRuleRecommendationRunDescription withStartedOn(java.util.Date startedOn) {
        setStartedOn(startedOn);
        return this;
    }

    /**
     * <p>
     * The data source (Glue table) associated with the recommendation run.
     * </p>
     * 
     * @param dataSource
     *        The data source (Glue table) associated with the recommendation run.
     */

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The data source (Glue table) associated with the recommendation run.
     * </p>
     * 
     * @return The data source (Glue table) associated with the recommendation run.
     */

    public DataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * The data source (Glue table) associated with the recommendation run.
     * </p>
     * 
     * @param dataSource
     *        The data source (Glue table) associated with the recommendation run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityRuleRecommendationRunDescription withDataSource(DataSource dataSource) {
        setDataSource(dataSource);
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
        if (getRunId() != null)
            sb.append("RunId: ").append(getRunId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStartedOn() != null)
            sb.append("StartedOn: ").append(getStartedOn()).append(",");
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataQualityRuleRecommendationRunDescription == false)
            return false;
        DataQualityRuleRecommendationRunDescription other = (DataQualityRuleRecommendationRunDescription) obj;
        if (other.getRunId() == null ^ this.getRunId() == null)
            return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStartedOn() == null ^ this.getStartedOn() == null)
            return false;
        if (other.getStartedOn() != null && other.getStartedOn().equals(this.getStartedOn()) == false)
            return false;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRunId() == null) ? 0 : getRunId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStartedOn() == null) ? 0 : getStartedOn().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        return hashCode;
    }

    @Override
    public DataQualityRuleRecommendationRunDescription clone() {
        try {
            return (DataQualityRuleRecommendationRunDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.DataQualityRuleRecommendationRunDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
