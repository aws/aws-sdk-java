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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of the actions taken and results produced on an artifact as it passes through stages in the pipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ExecutionDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecutionDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The summary of the current status of the actions.
     * </p>
     */
    private String summary;
    /**
     * <p>
     * The system-generated unique ID of this action used to identify this job worker in any external systems, such as
     * AWS CodeDeploy.
     * </p>
     */
    private String externalExecutionId;
    /**
     * <p>
     * The percentage of work completed on the action, represented on a scale of zero to one hundred percent.
     * </p>
     */
    private Integer percentComplete;

    /**
     * <p>
     * The summary of the current status of the actions.
     * </p>
     * 
     * @param summary
     *        The summary of the current status of the actions.
     */

    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * The summary of the current status of the actions.
     * </p>
     * 
     * @return The summary of the current status of the actions.
     */

    public String getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * The summary of the current status of the actions.
     * </p>
     * 
     * @param summary
     *        The summary of the current status of the actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionDetails withSummary(String summary) {
        setSummary(summary);
        return this;
    }

    /**
     * <p>
     * The system-generated unique ID of this action used to identify this job worker in any external systems, such as
     * AWS CodeDeploy.
     * </p>
     * 
     * @param externalExecutionId
     *        The system-generated unique ID of this action used to identify this job worker in any external systems,
     *        such as AWS CodeDeploy.
     */

    public void setExternalExecutionId(String externalExecutionId) {
        this.externalExecutionId = externalExecutionId;
    }

    /**
     * <p>
     * The system-generated unique ID of this action used to identify this job worker in any external systems, such as
     * AWS CodeDeploy.
     * </p>
     * 
     * @return The system-generated unique ID of this action used to identify this job worker in any external systems,
     *         such as AWS CodeDeploy.
     */

    public String getExternalExecutionId() {
        return this.externalExecutionId;
    }

    /**
     * <p>
     * The system-generated unique ID of this action used to identify this job worker in any external systems, such as
     * AWS CodeDeploy.
     * </p>
     * 
     * @param externalExecutionId
     *        The system-generated unique ID of this action used to identify this job worker in any external systems,
     *        such as AWS CodeDeploy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionDetails withExternalExecutionId(String externalExecutionId) {
        setExternalExecutionId(externalExecutionId);
        return this;
    }

    /**
     * <p>
     * The percentage of work completed on the action, represented on a scale of zero to one hundred percent.
     * </p>
     * 
     * @param percentComplete
     *        The percentage of work completed on the action, represented on a scale of zero to one hundred percent.
     */

    public void setPercentComplete(Integer percentComplete) {
        this.percentComplete = percentComplete;
    }

    /**
     * <p>
     * The percentage of work completed on the action, represented on a scale of zero to one hundred percent.
     * </p>
     * 
     * @return The percentage of work completed on the action, represented on a scale of zero to one hundred percent.
     */

    public Integer getPercentComplete() {
        return this.percentComplete;
    }

    /**
     * <p>
     * The percentage of work completed on the action, represented on a scale of zero to one hundred percent.
     * </p>
     * 
     * @param percentComplete
     *        The percentage of work completed on the action, represented on a scale of zero to one hundred percent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionDetails withPercentComplete(Integer percentComplete) {
        setPercentComplete(percentComplete);
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
        if (getSummary() != null)
            sb.append("Summary: ").append(getSummary()).append(",");
        if (getExternalExecutionId() != null)
            sb.append("ExternalExecutionId: ").append(getExternalExecutionId()).append(",");
        if (getPercentComplete() != null)
            sb.append("PercentComplete: ").append(getPercentComplete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecutionDetails == false)
            return false;
        ExecutionDetails other = (ExecutionDetails) obj;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
            return false;
        if (other.getExternalExecutionId() == null ^ this.getExternalExecutionId() == null)
            return false;
        if (other.getExternalExecutionId() != null && other.getExternalExecutionId().equals(this.getExternalExecutionId()) == false)
            return false;
        if (other.getPercentComplete() == null ^ this.getPercentComplete() == null)
            return false;
        if (other.getPercentComplete() != null && other.getPercentComplete().equals(this.getPercentComplete()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        hashCode = prime * hashCode + ((getExternalExecutionId() == null) ? 0 : getExternalExecutionId().hashCode());
        hashCode = prime * hashCode + ((getPercentComplete() == null) ? 0 : getPercentComplete().hashCode());
        return hashCode;
    }

    @Override
    public ExecutionDetails clone() {
        try {
            return (ExecutionDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ExecutionDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
