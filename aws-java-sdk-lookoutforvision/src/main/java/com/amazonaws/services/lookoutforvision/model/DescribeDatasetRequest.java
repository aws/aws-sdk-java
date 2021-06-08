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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DescribeDataset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDatasetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the project that contains the dataset that you want to describe.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * The type of the dataset to describe. Specify <code>train</code> to describe the training dataset. Specify
     * <code>test</code> to describe the test dataset. If you have a single dataset project, specify <code>train</code>
     * </p>
     */
    private String datasetType;

    /**
     * <p>
     * The name of the project that contains the dataset that you want to describe.
     * </p>
     * 
     * @param projectName
     *        The name of the project that contains the dataset that you want to describe.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the project that contains the dataset that you want to describe.
     * </p>
     * 
     * @return The name of the project that contains the dataset that you want to describe.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the project that contains the dataset that you want to describe.
     * </p>
     * 
     * @param projectName
     *        The name of the project that contains the dataset that you want to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetRequest withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * The type of the dataset to describe. Specify <code>train</code> to describe the training dataset. Specify
     * <code>test</code> to describe the test dataset. If you have a single dataset project, specify <code>train</code>
     * </p>
     * 
     * @param datasetType
     *        The type of the dataset to describe. Specify <code>train</code> to describe the training dataset. Specify
     *        <code>test</code> to describe the test dataset. If you have a single dataset project, specify
     *        <code>train</code>
     */

    public void setDatasetType(String datasetType) {
        this.datasetType = datasetType;
    }

    /**
     * <p>
     * The type of the dataset to describe. Specify <code>train</code> to describe the training dataset. Specify
     * <code>test</code> to describe the test dataset. If you have a single dataset project, specify <code>train</code>
     * </p>
     * 
     * @return The type of the dataset to describe. Specify <code>train</code> to describe the training dataset. Specify
     *         <code>test</code> to describe the test dataset. If you have a single dataset project, specify
     *         <code>train</code>
     */

    public String getDatasetType() {
        return this.datasetType;
    }

    /**
     * <p>
     * The type of the dataset to describe. Specify <code>train</code> to describe the training dataset. Specify
     * <code>test</code> to describe the test dataset. If you have a single dataset project, specify <code>train</code>
     * </p>
     * 
     * @param datasetType
     *        The type of the dataset to describe. Specify <code>train</code> to describe the training dataset. Specify
     *        <code>test</code> to describe the test dataset. If you have a single dataset project, specify
     *        <code>train</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetRequest withDatasetType(String datasetType) {
        setDatasetType(datasetType);
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
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getDatasetType() != null)
            sb.append("DatasetType: ").append(getDatasetType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDatasetRequest == false)
            return false;
        DescribeDatasetRequest other = (DescribeDatasetRequest) obj;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getDatasetType() == null ^ this.getDatasetType() == null)
            return false;
        if (other.getDatasetType() != null && other.getDatasetType().equals(this.getDatasetType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getDatasetType() == null) ? 0 : getDatasetType().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDatasetRequest clone() {
        return (DescribeDatasetRequest) super.clone();
    }

}
