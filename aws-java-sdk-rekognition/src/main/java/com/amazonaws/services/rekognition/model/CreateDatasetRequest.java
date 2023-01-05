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

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDatasetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The source files for the dataset. You can specify the ARN of an existing dataset or specify the Amazon S3 bucket
     * location of an Amazon Sagemaker format manifest file. If you don't specify <code>datasetSource</code>, an empty
     * dataset is created. To add labeled images to the dataset, You can use the console or call
     * <a>UpdateDatasetEntries</a>.
     * </p>
     */
    private DatasetSource datasetSource;
    /**
     * <p>
     * The type of the dataset. Specify <code>train</code> to create a training dataset. Specify <code>test</code> to
     * create a test dataset.
     * </p>
     */
    private String datasetType;
    /**
     * <p>
     * The ARN of the Amazon Rekognition Custom Labels project to which you want to asssign the dataset.
     * </p>
     */
    private String projectArn;

    /**
     * <p>
     * The source files for the dataset. You can specify the ARN of an existing dataset or specify the Amazon S3 bucket
     * location of an Amazon Sagemaker format manifest file. If you don't specify <code>datasetSource</code>, an empty
     * dataset is created. To add labeled images to the dataset, You can use the console or call
     * <a>UpdateDatasetEntries</a>.
     * </p>
     * 
     * @param datasetSource
     *        The source files for the dataset. You can specify the ARN of an existing dataset or specify the Amazon S3
     *        bucket location of an Amazon Sagemaker format manifest file. If you don't specify
     *        <code>datasetSource</code>, an empty dataset is created. To add labeled images to the dataset, You can use
     *        the console or call <a>UpdateDatasetEntries</a>.
     */

    public void setDatasetSource(DatasetSource datasetSource) {
        this.datasetSource = datasetSource;
    }

    /**
     * <p>
     * The source files for the dataset. You can specify the ARN of an existing dataset or specify the Amazon S3 bucket
     * location of an Amazon Sagemaker format manifest file. If you don't specify <code>datasetSource</code>, an empty
     * dataset is created. To add labeled images to the dataset, You can use the console or call
     * <a>UpdateDatasetEntries</a>.
     * </p>
     * 
     * @return The source files for the dataset. You can specify the ARN of an existing dataset or specify the Amazon S3
     *         bucket location of an Amazon Sagemaker format manifest file. If you don't specify
     *         <code>datasetSource</code>, an empty dataset is created. To add labeled images to the dataset, You can
     *         use the console or call <a>UpdateDatasetEntries</a>.
     */

    public DatasetSource getDatasetSource() {
        return this.datasetSource;
    }

    /**
     * <p>
     * The source files for the dataset. You can specify the ARN of an existing dataset or specify the Amazon S3 bucket
     * location of an Amazon Sagemaker format manifest file. If you don't specify <code>datasetSource</code>, an empty
     * dataset is created. To add labeled images to the dataset, You can use the console or call
     * <a>UpdateDatasetEntries</a>.
     * </p>
     * 
     * @param datasetSource
     *        The source files for the dataset. You can specify the ARN of an existing dataset or specify the Amazon S3
     *        bucket location of an Amazon Sagemaker format manifest file. If you don't specify
     *        <code>datasetSource</code>, an empty dataset is created. To add labeled images to the dataset, You can use
     *        the console or call <a>UpdateDatasetEntries</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withDatasetSource(DatasetSource datasetSource) {
        setDatasetSource(datasetSource);
        return this;
    }

    /**
     * <p>
     * The type of the dataset. Specify <code>train</code> to create a training dataset. Specify <code>test</code> to
     * create a test dataset.
     * </p>
     * 
     * @param datasetType
     *        The type of the dataset. Specify <code>train</code> to create a training dataset. Specify
     *        <code>test</code> to create a test dataset.
     * @see DatasetType
     */

    public void setDatasetType(String datasetType) {
        this.datasetType = datasetType;
    }

    /**
     * <p>
     * The type of the dataset. Specify <code>train</code> to create a training dataset. Specify <code>test</code> to
     * create a test dataset.
     * </p>
     * 
     * @return The type of the dataset. Specify <code>train</code> to create a training dataset. Specify
     *         <code>test</code> to create a test dataset.
     * @see DatasetType
     */

    public String getDatasetType() {
        return this.datasetType;
    }

    /**
     * <p>
     * The type of the dataset. Specify <code>train</code> to create a training dataset. Specify <code>test</code> to
     * create a test dataset.
     * </p>
     * 
     * @param datasetType
     *        The type of the dataset. Specify <code>train</code> to create a training dataset. Specify
     *        <code>test</code> to create a test dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetType
     */

    public CreateDatasetRequest withDatasetType(String datasetType) {
        setDatasetType(datasetType);
        return this;
    }

    /**
     * <p>
     * The type of the dataset. Specify <code>train</code> to create a training dataset. Specify <code>test</code> to
     * create a test dataset.
     * </p>
     * 
     * @param datasetType
     *        The type of the dataset. Specify <code>train</code> to create a training dataset. Specify
     *        <code>test</code> to create a test dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatasetType
     */

    public CreateDatasetRequest withDatasetType(DatasetType datasetType) {
        this.datasetType = datasetType.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon Rekognition Custom Labels project to which you want to asssign the dataset.
     * </p>
     * 
     * @param projectArn
     *        The ARN of the Amazon Rekognition Custom Labels project to which you want to asssign the dataset.
     */

    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Rekognition Custom Labels project to which you want to asssign the dataset.
     * </p>
     * 
     * @return The ARN of the Amazon Rekognition Custom Labels project to which you want to asssign the dataset.
     */

    public String getProjectArn() {
        return this.projectArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Rekognition Custom Labels project to which you want to asssign the dataset.
     * </p>
     * 
     * @param projectArn
     *        The ARN of the Amazon Rekognition Custom Labels project to which you want to asssign the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withProjectArn(String projectArn) {
        setProjectArn(projectArn);
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
        if (getDatasetSource() != null)
            sb.append("DatasetSource: ").append(getDatasetSource()).append(",");
        if (getDatasetType() != null)
            sb.append("DatasetType: ").append(getDatasetType()).append(",");
        if (getProjectArn() != null)
            sb.append("ProjectArn: ").append(getProjectArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDatasetRequest == false)
            return false;
        CreateDatasetRequest other = (CreateDatasetRequest) obj;
        if (other.getDatasetSource() == null ^ this.getDatasetSource() == null)
            return false;
        if (other.getDatasetSource() != null && other.getDatasetSource().equals(this.getDatasetSource()) == false)
            return false;
        if (other.getDatasetType() == null ^ this.getDatasetType() == null)
            return false;
        if (other.getDatasetType() != null && other.getDatasetType().equals(this.getDatasetType()) == false)
            return false;
        if (other.getProjectArn() == null ^ this.getProjectArn() == null)
            return false;
        if (other.getProjectArn() != null && other.getProjectArn().equals(this.getProjectArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetSource() == null) ? 0 : getDatasetSource().hashCode());
        hashCode = prime * hashCode + ((getDatasetType() == null) ? 0 : getDatasetType().hashCode());
        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateDatasetRequest clone() {
        return (CreateDatasetRequest) super.clone();
    }

}
