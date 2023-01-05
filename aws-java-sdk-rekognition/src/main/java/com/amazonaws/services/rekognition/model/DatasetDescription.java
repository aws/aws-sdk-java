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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A description for a dataset. For more information, see <a>DescribeDataset</a>.
 * </p>
 * <p>
 * The status fields <code>Status</code>, <code>StatusMessage</code>, and <code>StatusMessageCode</code> reflect the
 * last operation on the dataset.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Unix timestamp for the time and date that the dataset was created.
     * </p>
     */
    private java.util.Date creationTimestamp;
    /**
     * <p>
     * The Unix timestamp for the date and time that the dataset was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimestamp;
    /**
     * <p>
     * The status of the dataset.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status message for the dataset.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The status message code for the dataset operation. If a service error occurs, try the API call again later. If a
     * client error occurs, check the input parameters to the dataset API call that failed.
     * </p>
     */
    private String statusMessageCode;
    /**
     * <p>
     * The status message code for the dataset.
     * </p>
     */
    private DatasetStats datasetStats;

    /**
     * <p>
     * The Unix timestamp for the time and date that the dataset was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The Unix timestamp for the time and date that the dataset was created.
     */

    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp for the time and date that the dataset was created.
     * </p>
     * 
     * @return The Unix timestamp for the time and date that the dataset was created.
     */

    public java.util.Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp for the time and date that the dataset was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The Unix timestamp for the time and date that the dataset was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetDescription withCreationTimestamp(java.util.Date creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for the date and time that the dataset was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The Unix timestamp for the date and time that the dataset was last updated.
     */

    public void setLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp for the date and time that the dataset was last updated.
     * </p>
     * 
     * @return The Unix timestamp for the date and time that the dataset was last updated.
     */

    public java.util.Date getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The Unix timestamp for the date and time that the dataset was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The Unix timestamp for the date and time that the dataset was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetDescription withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        setLastUpdatedTimestamp(lastUpdatedTimestamp);
        return this;
    }

    /**
     * <p>
     * The status of the dataset.
     * </p>
     * 
     * @param status
     *        The status of the dataset.
     * @see DatasetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the dataset.
     * </p>
     * 
     * @return The status of the dataset.
     * @see DatasetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the dataset.
     * </p>
     * 
     * @param status
     *        The status of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetStatus
     */

    public DatasetDescription withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the dataset.
     * </p>
     * 
     * @param status
     *        The status of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetStatus
     */

    public DatasetDescription withStatus(DatasetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status message for the dataset.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the dataset.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message for the dataset.
     * </p>
     * 
     * @return The status message for the dataset.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message for the dataset.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetDescription withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The status message code for the dataset operation. If a service error occurs, try the API call again later. If a
     * client error occurs, check the input parameters to the dataset API call that failed.
     * </p>
     * 
     * @param statusMessageCode
     *        The status message code for the dataset operation. If a service error occurs, try the API call again
     *        later. If a client error occurs, check the input parameters to the dataset API call that failed.
     * @see DatasetStatusMessageCode
     */

    public void setStatusMessageCode(String statusMessageCode) {
        this.statusMessageCode = statusMessageCode;
    }

    /**
     * <p>
     * The status message code for the dataset operation. If a service error occurs, try the API call again later. If a
     * client error occurs, check the input parameters to the dataset API call that failed.
     * </p>
     * 
     * @return The status message code for the dataset operation. If a service error occurs, try the API call again
     *         later. If a client error occurs, check the input parameters to the dataset API call that failed.
     * @see DatasetStatusMessageCode
     */

    public String getStatusMessageCode() {
        return this.statusMessageCode;
    }

    /**
     * <p>
     * The status message code for the dataset operation. If a service error occurs, try the API call again later. If a
     * client error occurs, check the input parameters to the dataset API call that failed.
     * </p>
     * 
     * @param statusMessageCode
     *        The status message code for the dataset operation. If a service error occurs, try the API call again
     *        later. If a client error occurs, check the input parameters to the dataset API call that failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetStatusMessageCode
     */

    public DatasetDescription withStatusMessageCode(String statusMessageCode) {
        setStatusMessageCode(statusMessageCode);
        return this;
    }

    /**
     * <p>
     * The status message code for the dataset operation. If a service error occurs, try the API call again later. If a
     * client error occurs, check the input parameters to the dataset API call that failed.
     * </p>
     * 
     * @param statusMessageCode
     *        The status message code for the dataset operation. If a service error occurs, try the API call again
     *        later. If a client error occurs, check the input parameters to the dataset API call that failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetStatusMessageCode
     */

    public DatasetDescription withStatusMessageCode(DatasetStatusMessageCode statusMessageCode) {
        this.statusMessageCode = statusMessageCode.toString();
        return this;
    }

    /**
     * <p>
     * The status message code for the dataset.
     * </p>
     * 
     * @param datasetStats
     *        The status message code for the dataset.
     */

    public void setDatasetStats(DatasetStats datasetStats) {
        this.datasetStats = datasetStats;
    }

    /**
     * <p>
     * The status message code for the dataset.
     * </p>
     * 
     * @return The status message code for the dataset.
     */

    public DatasetStats getDatasetStats() {
        return this.datasetStats;
    }

    /**
     * <p>
     * The status message code for the dataset.
     * </p>
     * 
     * @param datasetStats
     *        The status message code for the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetDescription withDatasetStats(DatasetStats datasetStats) {
        setDatasetStats(datasetStats);
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
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp()).append(",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: ").append(getLastUpdatedTimestamp()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getStatusMessageCode() != null)
            sb.append("StatusMessageCode: ").append(getStatusMessageCode()).append(",");
        if (getDatasetStats() != null)
            sb.append("DatasetStats: ").append(getDatasetStats());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetDescription == false)
            return false;
        DatasetDescription other = (DatasetDescription) obj;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getStatusMessageCode() == null ^ this.getStatusMessageCode() == null)
            return false;
        if (other.getStatusMessageCode() != null && other.getStatusMessageCode().equals(this.getStatusMessageCode()) == false)
            return false;
        if (other.getDatasetStats() == null ^ this.getDatasetStats() == null)
            return false;
        if (other.getDatasetStats() != null && other.getDatasetStats().equals(this.getDatasetStats()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getStatusMessageCode() == null) ? 0 : getStatusMessageCode().hashCode());
        hashCode = prime * hashCode + ((getDatasetStats() == null) ? 0 : getDatasetStats().hashCode());
        return hashCode;
    }

    @Override
    public DatasetDescription clone() {
        try {
            return (DatasetDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.DatasetDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
