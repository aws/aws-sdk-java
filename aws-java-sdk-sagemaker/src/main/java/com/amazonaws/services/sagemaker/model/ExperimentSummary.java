/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of the properties of an experiment. To get the complete set of properties, call the
 * <a>DescribeExperiment</a> API and provide the <code>ExperimentName</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ExperimentSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExperimentSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the experiment.
     * </p>
     */
    private String experimentArn;
    /**
     * <p>
     * The name of the experiment.
     * </p>
     */
    private String experimentName;
    /**
     * <p>
     * The name of the experiment as displayed. If <code>DisplayName</code> isn't specified, <code>ExperimentName</code>
     * is displayed.
     * </p>
     */
    private String displayName;

    private ExperimentSource experimentSource;
    /**
     * <p>
     * When the experiment was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * When the experiment was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the experiment.
     * </p>
     * 
     * @param experimentArn
     *        The Amazon Resource Name (ARN) of the experiment.
     */

    public void setExperimentArn(String experimentArn) {
        this.experimentArn = experimentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the experiment.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the experiment.
     */

    public String getExperimentArn() {
        return this.experimentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the experiment.
     * </p>
     * 
     * @param experimentArn
     *        The Amazon Resource Name (ARN) of the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentSummary withExperimentArn(String experimentArn) {
        setExperimentArn(experimentArn);
        return this;
    }

    /**
     * <p>
     * The name of the experiment.
     * </p>
     * 
     * @param experimentName
     *        The name of the experiment.
     */

    public void setExperimentName(String experimentName) {
        this.experimentName = experimentName;
    }

    /**
     * <p>
     * The name of the experiment.
     * </p>
     * 
     * @return The name of the experiment.
     */

    public String getExperimentName() {
        return this.experimentName;
    }

    /**
     * <p>
     * The name of the experiment.
     * </p>
     * 
     * @param experimentName
     *        The name of the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentSummary withExperimentName(String experimentName) {
        setExperimentName(experimentName);
        return this;
    }

    /**
     * <p>
     * The name of the experiment as displayed. If <code>DisplayName</code> isn't specified, <code>ExperimentName</code>
     * is displayed.
     * </p>
     * 
     * @param displayName
     *        The name of the experiment as displayed. If <code>DisplayName</code> isn't specified,
     *        <code>ExperimentName</code> is displayed.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the experiment as displayed. If <code>DisplayName</code> isn't specified, <code>ExperimentName</code>
     * is displayed.
     * </p>
     * 
     * @return The name of the experiment as displayed. If <code>DisplayName</code> isn't specified,
     *         <code>ExperimentName</code> is displayed.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the experiment as displayed. If <code>DisplayName</code> isn't specified, <code>ExperimentName</code>
     * is displayed.
     * </p>
     * 
     * @param displayName
     *        The name of the experiment as displayed. If <code>DisplayName</code> isn't specified,
     *        <code>ExperimentName</code> is displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentSummary withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * @param experimentSource
     */

    public void setExperimentSource(ExperimentSource experimentSource) {
        this.experimentSource = experimentSource;
    }

    /**
     * @return
     */

    public ExperimentSource getExperimentSource() {
        return this.experimentSource;
    }

    /**
     * @param experimentSource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentSummary withExperimentSource(ExperimentSource experimentSource) {
        setExperimentSource(experimentSource);
        return this;
    }

    /**
     * <p>
     * When the experiment was created.
     * </p>
     * 
     * @param creationTime
     *        When the experiment was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the experiment was created.
     * </p>
     * 
     * @return When the experiment was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the experiment was created.
     * </p>
     * 
     * @param creationTime
     *        When the experiment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * When the experiment was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the experiment was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * When the experiment was last modified.
     * </p>
     * 
     * @return When the experiment was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * When the experiment was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the experiment was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getExperimentArn() != null)
            sb.append("ExperimentArn: ").append(getExperimentArn()).append(",");
        if (getExperimentName() != null)
            sb.append("ExperimentName: ").append(getExperimentName()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getExperimentSource() != null)
            sb.append("ExperimentSource: ").append(getExperimentSource()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExperimentSummary == false)
            return false;
        ExperimentSummary other = (ExperimentSummary) obj;
        if (other.getExperimentArn() == null ^ this.getExperimentArn() == null)
            return false;
        if (other.getExperimentArn() != null && other.getExperimentArn().equals(this.getExperimentArn()) == false)
            return false;
        if (other.getExperimentName() == null ^ this.getExperimentName() == null)
            return false;
        if (other.getExperimentName() != null && other.getExperimentName().equals(this.getExperimentName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getExperimentSource() == null ^ this.getExperimentSource() == null)
            return false;
        if (other.getExperimentSource() != null && other.getExperimentSource().equals(this.getExperimentSource()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExperimentArn() == null) ? 0 : getExperimentArn().hashCode());
        hashCode = prime * hashCode + ((getExperimentName() == null) ? 0 : getExperimentName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getExperimentSource() == null) ? 0 : getExperimentSource().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public ExperimentSummary clone() {
        try {
            return (ExperimentSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ExperimentSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
