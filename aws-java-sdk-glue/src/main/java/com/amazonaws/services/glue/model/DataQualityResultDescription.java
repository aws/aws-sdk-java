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
 * Describes a data quality result.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DataQualityResultDescription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataQualityResultDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique result ID for this data quality result.
     * </p>
     */
    private String resultId;
    /**
     * <p>
     * The table name associated with the data quality result.
     * </p>
     */
    private DataSource dataSource;
    /**
     * <p>
     * The job name associated with the data quality result.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The job run ID associated with the data quality result.
     * </p>
     */
    private String jobRunId;
    /**
     * <p>
     * The time that the run started for this data quality result.
     * </p>
     */
    private java.util.Date startedOn;

    /**
     * <p>
     * The unique result ID for this data quality result.
     * </p>
     * 
     * @param resultId
     *        The unique result ID for this data quality result.
     */

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    /**
     * <p>
     * The unique result ID for this data quality result.
     * </p>
     * 
     * @return The unique result ID for this data quality result.
     */

    public String getResultId() {
        return this.resultId;
    }

    /**
     * <p>
     * The unique result ID for this data quality result.
     * </p>
     * 
     * @param resultId
     *        The unique result ID for this data quality result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityResultDescription withResultId(String resultId) {
        setResultId(resultId);
        return this;
    }

    /**
     * <p>
     * The table name associated with the data quality result.
     * </p>
     * 
     * @param dataSource
     *        The table name associated with the data quality result.
     */

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The table name associated with the data quality result.
     * </p>
     * 
     * @return The table name associated with the data quality result.
     */

    public DataSource getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * The table name associated with the data quality result.
     * </p>
     * 
     * @param dataSource
     *        The table name associated with the data quality result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityResultDescription withDataSource(DataSource dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * The job name associated with the data quality result.
     * </p>
     * 
     * @param jobName
     *        The job name associated with the data quality result.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The job name associated with the data quality result.
     * </p>
     * 
     * @return The job name associated with the data quality result.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The job name associated with the data quality result.
     * </p>
     * 
     * @param jobName
     *        The job name associated with the data quality result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityResultDescription withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The job run ID associated with the data quality result.
     * </p>
     * 
     * @param jobRunId
     *        The job run ID associated with the data quality result.
     */

    public void setJobRunId(String jobRunId) {
        this.jobRunId = jobRunId;
    }

    /**
     * <p>
     * The job run ID associated with the data quality result.
     * </p>
     * 
     * @return The job run ID associated with the data quality result.
     */

    public String getJobRunId() {
        return this.jobRunId;
    }

    /**
     * <p>
     * The job run ID associated with the data quality result.
     * </p>
     * 
     * @param jobRunId
     *        The job run ID associated with the data quality result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityResultDescription withJobRunId(String jobRunId) {
        setJobRunId(jobRunId);
        return this;
    }

    /**
     * <p>
     * The time that the run started for this data quality result.
     * </p>
     * 
     * @param startedOn
     *        The time that the run started for this data quality result.
     */

    public void setStartedOn(java.util.Date startedOn) {
        this.startedOn = startedOn;
    }

    /**
     * <p>
     * The time that the run started for this data quality result.
     * </p>
     * 
     * @return The time that the run started for this data quality result.
     */

    public java.util.Date getStartedOn() {
        return this.startedOn;
    }

    /**
     * <p>
     * The time that the run started for this data quality result.
     * </p>
     * 
     * @param startedOn
     *        The time that the run started for this data quality result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityResultDescription withStartedOn(java.util.Date startedOn) {
        setStartedOn(startedOn);
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
        if (getResultId() != null)
            sb.append("ResultId: ").append(getResultId()).append(",");
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getJobRunId() != null)
            sb.append("JobRunId: ").append(getJobRunId()).append(",");
        if (getStartedOn() != null)
            sb.append("StartedOn: ").append(getStartedOn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataQualityResultDescription == false)
            return false;
        DataQualityResultDescription other = (DataQualityResultDescription) obj;
        if (other.getResultId() == null ^ this.getResultId() == null)
            return false;
        if (other.getResultId() != null && other.getResultId().equals(this.getResultId()) == false)
            return false;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobRunId() == null ^ this.getJobRunId() == null)
            return false;
        if (other.getJobRunId() != null && other.getJobRunId().equals(this.getJobRunId()) == false)
            return false;
        if (other.getStartedOn() == null ^ this.getStartedOn() == null)
            return false;
        if (other.getStartedOn() != null && other.getStartedOn().equals(this.getStartedOn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResultId() == null) ? 0 : getResultId().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobRunId() == null) ? 0 : getJobRunId().hashCode());
        hashCode = prime * hashCode + ((getStartedOn() == null) ? 0 : getStartedOn().hashCode());
        return hashCode;
    }

    @Override
    public DataQualityResultDescription clone() {
        try {
            return (DataQualityResultDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.DataQualityResultDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
