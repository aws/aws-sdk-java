/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describe an Amazon Lookout for Vision project. For more information, see <a>DescribeProject</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/ProjectDescription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project.
     * </p>
     */
    private String projectArn;
    /**
     * <p>
     * The name of the project.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * The unix timestamp for the date and time that the project was created.
     * </p>
     */
    private java.util.Date creationTimestamp;
    /**
     * <p>
     * A list of datasets in the project.
     * </p>
     */
    private java.util.List<DatasetMetadata> datasets;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project.
     * </p>
     * 
     * @param projectArn
     *        The Amazon Resource Name (ARN) of the project.
     */

    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the project.
     */

    public String getProjectArn() {
        return this.projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project.
     * </p>
     * 
     * @param projectArn
     *        The Amazon Resource Name (ARN) of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectDescription withProjectArn(String projectArn) {
        setProjectArn(projectArn);
        return this;
    }

    /**
     * <p>
     * The name of the project.
     * </p>
     * 
     * @param projectName
     *        The name of the project.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the project.
     * </p>
     * 
     * @return The name of the project.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the project.
     * </p>
     * 
     * @param projectName
     *        The name of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectDescription withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * The unix timestamp for the date and time that the project was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The unix timestamp for the date and time that the project was created.
     */

    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The unix timestamp for the date and time that the project was created.
     * </p>
     * 
     * @return The unix timestamp for the date and time that the project was created.
     */

    public java.util.Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * The unix timestamp for the date and time that the project was created.
     * </p>
     * 
     * @param creationTimestamp
     *        The unix timestamp for the date and time that the project was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectDescription withCreationTimestamp(java.util.Date creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * <p>
     * A list of datasets in the project.
     * </p>
     * 
     * @return A list of datasets in the project.
     */

    public java.util.List<DatasetMetadata> getDatasets() {
        return datasets;
    }

    /**
     * <p>
     * A list of datasets in the project.
     * </p>
     * 
     * @param datasets
     *        A list of datasets in the project.
     */

    public void setDatasets(java.util.Collection<DatasetMetadata> datasets) {
        if (datasets == null) {
            this.datasets = null;
            return;
        }

        this.datasets = new java.util.ArrayList<DatasetMetadata>(datasets);
    }

    /**
     * <p>
     * A list of datasets in the project.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatasets(java.util.Collection)} or {@link #withDatasets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param datasets
     *        A list of datasets in the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectDescription withDatasets(DatasetMetadata... datasets) {
        if (this.datasets == null) {
            setDatasets(new java.util.ArrayList<DatasetMetadata>(datasets.length));
        }
        for (DatasetMetadata ele : datasets) {
            this.datasets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of datasets in the project.
     * </p>
     * 
     * @param datasets
     *        A list of datasets in the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectDescription withDatasets(java.util.Collection<DatasetMetadata> datasets) {
        setDatasets(datasets);
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
        if (getProjectArn() != null)
            sb.append("ProjectArn: ").append(getProjectArn()).append(",");
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp()).append(",");
        if (getDatasets() != null)
            sb.append("Datasets: ").append(getDatasets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectDescription == false)
            return false;
        ProjectDescription other = (ProjectDescription) obj;
        if (other.getProjectArn() == null ^ this.getProjectArn() == null)
            return false;
        if (other.getProjectArn() != null && other.getProjectArn().equals(this.getProjectArn()) == false)
            return false;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getDatasets() == null ^ this.getDatasets() == null)
            return false;
        if (other.getDatasets() != null && other.getDatasets().equals(this.getDatasets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getDatasets() == null) ? 0 : getDatasets().hashCode());
        return hashCode;
    }

    @Override
    public ProjectDescription clone() {
        try {
            return (ProjectDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutforvision.model.transform.ProjectDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
