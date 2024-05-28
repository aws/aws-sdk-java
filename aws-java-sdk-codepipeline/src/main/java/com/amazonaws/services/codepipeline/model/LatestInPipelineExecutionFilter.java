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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The field that specifies to filter on the latest execution in the pipeline.
 * </p>
 * <note>
 * <p>
 * Filtering on the latest execution is available for executions run on or after February 08, 2024.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/LatestInPipelineExecutionFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LatestInPipelineExecutionFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The execution ID for the latest execution in the pipeline.
     * </p>
     */
    private String pipelineExecutionId;
    /**
     * <p>
     * The start time to filter on for the latest execution in the pipeline. Valid options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * All
     * </p>
     * </li>
     * <li>
     * <p>
     * Latest
     * </p>
     * </li>
     * </ul>
     */
    private String startTimeRange;

    /**
     * <p>
     * The execution ID for the latest execution in the pipeline.
     * </p>
     * 
     * @param pipelineExecutionId
     *        The execution ID for the latest execution in the pipeline.
     */

    public void setPipelineExecutionId(String pipelineExecutionId) {
        this.pipelineExecutionId = pipelineExecutionId;
    }

    /**
     * <p>
     * The execution ID for the latest execution in the pipeline.
     * </p>
     * 
     * @return The execution ID for the latest execution in the pipeline.
     */

    public String getPipelineExecutionId() {
        return this.pipelineExecutionId;
    }

    /**
     * <p>
     * The execution ID for the latest execution in the pipeline.
     * </p>
     * 
     * @param pipelineExecutionId
     *        The execution ID for the latest execution in the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LatestInPipelineExecutionFilter withPipelineExecutionId(String pipelineExecutionId) {
        setPipelineExecutionId(pipelineExecutionId);
        return this;
    }

    /**
     * <p>
     * The start time to filter on for the latest execution in the pipeline. Valid options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * All
     * </p>
     * </li>
     * <li>
     * <p>
     * Latest
     * </p>
     * </li>
     * </ul>
     * 
     * @param startTimeRange
     *        The start time to filter on for the latest execution in the pipeline. Valid options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        All
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Latest
     *        </p>
     *        </li>
     * @see StartTimeRange
     */

    public void setStartTimeRange(String startTimeRange) {
        this.startTimeRange = startTimeRange;
    }

    /**
     * <p>
     * The start time to filter on for the latest execution in the pipeline. Valid options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * All
     * </p>
     * </li>
     * <li>
     * <p>
     * Latest
     * </p>
     * </li>
     * </ul>
     * 
     * @return The start time to filter on for the latest execution in the pipeline. Valid options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         All
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Latest
     *         </p>
     *         </li>
     * @see StartTimeRange
     */

    public String getStartTimeRange() {
        return this.startTimeRange;
    }

    /**
     * <p>
     * The start time to filter on for the latest execution in the pipeline. Valid options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * All
     * </p>
     * </li>
     * <li>
     * <p>
     * Latest
     * </p>
     * </li>
     * </ul>
     * 
     * @param startTimeRange
     *        The start time to filter on for the latest execution in the pipeline. Valid options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        All
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Latest
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StartTimeRange
     */

    public LatestInPipelineExecutionFilter withStartTimeRange(String startTimeRange) {
        setStartTimeRange(startTimeRange);
        return this;
    }

    /**
     * <p>
     * The start time to filter on for the latest execution in the pipeline. Valid options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * All
     * </p>
     * </li>
     * <li>
     * <p>
     * Latest
     * </p>
     * </li>
     * </ul>
     * 
     * @param startTimeRange
     *        The start time to filter on for the latest execution in the pipeline. Valid options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        All
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Latest
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StartTimeRange
     */

    public LatestInPipelineExecutionFilter withStartTimeRange(StartTimeRange startTimeRange) {
        this.startTimeRange = startTimeRange.toString();
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
        if (getPipelineExecutionId() != null)
            sb.append("PipelineExecutionId: ").append(getPipelineExecutionId()).append(",");
        if (getStartTimeRange() != null)
            sb.append("StartTimeRange: ").append(getStartTimeRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LatestInPipelineExecutionFilter == false)
            return false;
        LatestInPipelineExecutionFilter other = (LatestInPipelineExecutionFilter) obj;
        if (other.getPipelineExecutionId() == null ^ this.getPipelineExecutionId() == null)
            return false;
        if (other.getPipelineExecutionId() != null && other.getPipelineExecutionId().equals(this.getPipelineExecutionId()) == false)
            return false;
        if (other.getStartTimeRange() == null ^ this.getStartTimeRange() == null)
            return false;
        if (other.getStartTimeRange() != null && other.getStartTimeRange().equals(this.getStartTimeRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineExecutionId() == null) ? 0 : getPipelineExecutionId().hashCode());
        hashCode = prime * hashCode + ((getStartTimeRange() == null) ? 0 : getStartTimeRange().hashCode());
        return hashCode;
    }

    @Override
    public LatestInPipelineExecutionFilter clone() {
        try {
            return (LatestInPipelineExecutionFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.LatestInPipelineExecutionFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
