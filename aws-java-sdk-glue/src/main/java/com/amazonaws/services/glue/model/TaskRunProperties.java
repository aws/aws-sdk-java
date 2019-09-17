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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration properties for the task run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/TaskRunProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskRunProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of task run.
     * </p>
     */
    private String taskType;
    /**
     * <p>
     * The configuration properties for an importing labels task run.
     * </p>
     */
    private ImportLabelsTaskRunProperties importLabelsTaskRunProperties;
    /**
     * <p>
     * The configuration properties for an exporting labels task run.
     * </p>
     */
    private ExportLabelsTaskRunProperties exportLabelsTaskRunProperties;
    /**
     * <p>
     * The configuration properties for a labeling set generation task run.
     * </p>
     */
    private LabelingSetGenerationTaskRunProperties labelingSetGenerationTaskRunProperties;
    /**
     * <p>
     * The configuration properties for a find matches task run.
     * </p>
     */
    private FindMatchesTaskRunProperties findMatchesTaskRunProperties;

    /**
     * <p>
     * The type of task run.
     * </p>
     * 
     * @param taskType
     *        The type of task run.
     * @see TaskType
     */

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    /**
     * <p>
     * The type of task run.
     * </p>
     * 
     * @return The type of task run.
     * @see TaskType
     */

    public String getTaskType() {
        return this.taskType;
    }

    /**
     * <p>
     * The type of task run.
     * </p>
     * 
     * @param taskType
     *        The type of task run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskType
     */

    public TaskRunProperties withTaskType(String taskType) {
        setTaskType(taskType);
        return this;
    }

    /**
     * <p>
     * The type of task run.
     * </p>
     * 
     * @param taskType
     *        The type of task run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskType
     */

    public TaskRunProperties withTaskType(TaskType taskType) {
        this.taskType = taskType.toString();
        return this;
    }

    /**
     * <p>
     * The configuration properties for an importing labels task run.
     * </p>
     * 
     * @param importLabelsTaskRunProperties
     *        The configuration properties for an importing labels task run.
     */

    public void setImportLabelsTaskRunProperties(ImportLabelsTaskRunProperties importLabelsTaskRunProperties) {
        this.importLabelsTaskRunProperties = importLabelsTaskRunProperties;
    }

    /**
     * <p>
     * The configuration properties for an importing labels task run.
     * </p>
     * 
     * @return The configuration properties for an importing labels task run.
     */

    public ImportLabelsTaskRunProperties getImportLabelsTaskRunProperties() {
        return this.importLabelsTaskRunProperties;
    }

    /**
     * <p>
     * The configuration properties for an importing labels task run.
     * </p>
     * 
     * @param importLabelsTaskRunProperties
     *        The configuration properties for an importing labels task run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskRunProperties withImportLabelsTaskRunProperties(ImportLabelsTaskRunProperties importLabelsTaskRunProperties) {
        setImportLabelsTaskRunProperties(importLabelsTaskRunProperties);
        return this;
    }

    /**
     * <p>
     * The configuration properties for an exporting labels task run.
     * </p>
     * 
     * @param exportLabelsTaskRunProperties
     *        The configuration properties for an exporting labels task run.
     */

    public void setExportLabelsTaskRunProperties(ExportLabelsTaskRunProperties exportLabelsTaskRunProperties) {
        this.exportLabelsTaskRunProperties = exportLabelsTaskRunProperties;
    }

    /**
     * <p>
     * The configuration properties for an exporting labels task run.
     * </p>
     * 
     * @return The configuration properties for an exporting labels task run.
     */

    public ExportLabelsTaskRunProperties getExportLabelsTaskRunProperties() {
        return this.exportLabelsTaskRunProperties;
    }

    /**
     * <p>
     * The configuration properties for an exporting labels task run.
     * </p>
     * 
     * @param exportLabelsTaskRunProperties
     *        The configuration properties for an exporting labels task run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskRunProperties withExportLabelsTaskRunProperties(ExportLabelsTaskRunProperties exportLabelsTaskRunProperties) {
        setExportLabelsTaskRunProperties(exportLabelsTaskRunProperties);
        return this;
    }

    /**
     * <p>
     * The configuration properties for a labeling set generation task run.
     * </p>
     * 
     * @param labelingSetGenerationTaskRunProperties
     *        The configuration properties for a labeling set generation task run.
     */

    public void setLabelingSetGenerationTaskRunProperties(LabelingSetGenerationTaskRunProperties labelingSetGenerationTaskRunProperties) {
        this.labelingSetGenerationTaskRunProperties = labelingSetGenerationTaskRunProperties;
    }

    /**
     * <p>
     * The configuration properties for a labeling set generation task run.
     * </p>
     * 
     * @return The configuration properties for a labeling set generation task run.
     */

    public LabelingSetGenerationTaskRunProperties getLabelingSetGenerationTaskRunProperties() {
        return this.labelingSetGenerationTaskRunProperties;
    }

    /**
     * <p>
     * The configuration properties for a labeling set generation task run.
     * </p>
     * 
     * @param labelingSetGenerationTaskRunProperties
     *        The configuration properties for a labeling set generation task run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskRunProperties withLabelingSetGenerationTaskRunProperties(LabelingSetGenerationTaskRunProperties labelingSetGenerationTaskRunProperties) {
        setLabelingSetGenerationTaskRunProperties(labelingSetGenerationTaskRunProperties);
        return this;
    }

    /**
     * <p>
     * The configuration properties for a find matches task run.
     * </p>
     * 
     * @param findMatchesTaskRunProperties
     *        The configuration properties for a find matches task run.
     */

    public void setFindMatchesTaskRunProperties(FindMatchesTaskRunProperties findMatchesTaskRunProperties) {
        this.findMatchesTaskRunProperties = findMatchesTaskRunProperties;
    }

    /**
     * <p>
     * The configuration properties for a find matches task run.
     * </p>
     * 
     * @return The configuration properties for a find matches task run.
     */

    public FindMatchesTaskRunProperties getFindMatchesTaskRunProperties() {
        return this.findMatchesTaskRunProperties;
    }

    /**
     * <p>
     * The configuration properties for a find matches task run.
     * </p>
     * 
     * @param findMatchesTaskRunProperties
     *        The configuration properties for a find matches task run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TaskRunProperties withFindMatchesTaskRunProperties(FindMatchesTaskRunProperties findMatchesTaskRunProperties) {
        setFindMatchesTaskRunProperties(findMatchesTaskRunProperties);
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
        if (getTaskType() != null)
            sb.append("TaskType: ").append(getTaskType()).append(",");
        if (getImportLabelsTaskRunProperties() != null)
            sb.append("ImportLabelsTaskRunProperties: ").append(getImportLabelsTaskRunProperties()).append(",");
        if (getExportLabelsTaskRunProperties() != null)
            sb.append("ExportLabelsTaskRunProperties: ").append(getExportLabelsTaskRunProperties()).append(",");
        if (getLabelingSetGenerationTaskRunProperties() != null)
            sb.append("LabelingSetGenerationTaskRunProperties: ").append(getLabelingSetGenerationTaskRunProperties()).append(",");
        if (getFindMatchesTaskRunProperties() != null)
            sb.append("FindMatchesTaskRunProperties: ").append(getFindMatchesTaskRunProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TaskRunProperties == false)
            return false;
        TaskRunProperties other = (TaskRunProperties) obj;
        if (other.getTaskType() == null ^ this.getTaskType() == null)
            return false;
        if (other.getTaskType() != null && other.getTaskType().equals(this.getTaskType()) == false)
            return false;
        if (other.getImportLabelsTaskRunProperties() == null ^ this.getImportLabelsTaskRunProperties() == null)
            return false;
        if (other.getImportLabelsTaskRunProperties() != null
                && other.getImportLabelsTaskRunProperties().equals(this.getImportLabelsTaskRunProperties()) == false)
            return false;
        if (other.getExportLabelsTaskRunProperties() == null ^ this.getExportLabelsTaskRunProperties() == null)
            return false;
        if (other.getExportLabelsTaskRunProperties() != null
                && other.getExportLabelsTaskRunProperties().equals(this.getExportLabelsTaskRunProperties()) == false)
            return false;
        if (other.getLabelingSetGenerationTaskRunProperties() == null ^ this.getLabelingSetGenerationTaskRunProperties() == null)
            return false;
        if (other.getLabelingSetGenerationTaskRunProperties() != null
                && other.getLabelingSetGenerationTaskRunProperties().equals(this.getLabelingSetGenerationTaskRunProperties()) == false)
            return false;
        if (other.getFindMatchesTaskRunProperties() == null ^ this.getFindMatchesTaskRunProperties() == null)
            return false;
        if (other.getFindMatchesTaskRunProperties() != null && other.getFindMatchesTaskRunProperties().equals(this.getFindMatchesTaskRunProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskType() == null) ? 0 : getTaskType().hashCode());
        hashCode = prime * hashCode + ((getImportLabelsTaskRunProperties() == null) ? 0 : getImportLabelsTaskRunProperties().hashCode());
        hashCode = prime * hashCode + ((getExportLabelsTaskRunProperties() == null) ? 0 : getExportLabelsTaskRunProperties().hashCode());
        hashCode = prime * hashCode + ((getLabelingSetGenerationTaskRunProperties() == null) ? 0 : getLabelingSetGenerationTaskRunProperties().hashCode());
        hashCode = prime * hashCode + ((getFindMatchesTaskRunProperties() == null) ? 0 : getFindMatchesTaskRunProperties().hashCode());
        return hashCode;
    }

    @Override
    public TaskRunProperties clone() {
        try {
            return (TaskRunProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.TaskRunPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
