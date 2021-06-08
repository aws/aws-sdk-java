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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/CreateDataset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDatasetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the project in which you want to create a dataset.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * The type of the dataset. Specify <code>train</code> for a training dataset. Specify <code>test</code> for a test
     * dataset.
     * </p>
     */
    private String datasetType;
    /**
     * <p>
     * The location of the manifest file that Amazon Lookout for Vision uses to create the dataset.
     * </p>
     * <p>
     * If you don't specify <code>DatasetSource</code>, an empty dataset is created and the operation synchronously
     * returns. Later, you can add JSON Lines by calling <a>UpdateDatasetEntries</a>.
     * </p>
     * <p>
     * If you specify a value for <code>DataSource</code>, the manifest at the S3 location is validated and used to
     * create the dataset. The call to <code>CreateDataset</code> is asynchronous and might take a while to complete. To
     * find out the current status, Check the value of <code>Status</code> returned in a call to <a>DescribeDataset</a>.
     * </p>
     */
    private DatasetSource datasetSource;
    /**
     * <p>
     * ClientToken is an idempotency token that ensures a call to <code>CreateDataset</code> completes only once. You
     * choose the value to pass. For example, An issue, such as an network outage, might prevent you from getting a
     * response from <code>CreateDataset</code>. In this case, safely retry your call to <code>CreateDataset</code> by
     * using the same <code>ClientToken</code> parameter value. An error occurs if the other input parameters are not
     * the same as in the first request. Using a different value for <code>ClientToken</code> is considered a new call
     * to <code>CreateDataset</code>. An idempotency token is active for 8 hours.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The name of the project in which you want to create a dataset.
     * </p>
     * 
     * @param projectName
     *        The name of the project in which you want to create a dataset.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the project in which you want to create a dataset.
     * </p>
     * 
     * @return The name of the project in which you want to create a dataset.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the project in which you want to create a dataset.
     * </p>
     * 
     * @param projectName
     *        The name of the project in which you want to create a dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * The type of the dataset. Specify <code>train</code> for a training dataset. Specify <code>test</code> for a test
     * dataset.
     * </p>
     * 
     * @param datasetType
     *        The type of the dataset. Specify <code>train</code> for a training dataset. Specify <code>test</code> for
     *        a test dataset.
     */

    public void setDatasetType(String datasetType) {
        this.datasetType = datasetType;
    }

    /**
     * <p>
     * The type of the dataset. Specify <code>train</code> for a training dataset. Specify <code>test</code> for a test
     * dataset.
     * </p>
     * 
     * @return The type of the dataset. Specify <code>train</code> for a training dataset. Specify <code>test</code> for
     *         a test dataset.
     */

    public String getDatasetType() {
        return this.datasetType;
    }

    /**
     * <p>
     * The type of the dataset. Specify <code>train</code> for a training dataset. Specify <code>test</code> for a test
     * dataset.
     * </p>
     * 
     * @param datasetType
     *        The type of the dataset. Specify <code>train</code> for a training dataset. Specify <code>test</code> for
     *        a test dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withDatasetType(String datasetType) {
        setDatasetType(datasetType);
        return this;
    }

    /**
     * <p>
     * The location of the manifest file that Amazon Lookout for Vision uses to create the dataset.
     * </p>
     * <p>
     * If you don't specify <code>DatasetSource</code>, an empty dataset is created and the operation synchronously
     * returns. Later, you can add JSON Lines by calling <a>UpdateDatasetEntries</a>.
     * </p>
     * <p>
     * If you specify a value for <code>DataSource</code>, the manifest at the S3 location is validated and used to
     * create the dataset. The call to <code>CreateDataset</code> is asynchronous and might take a while to complete. To
     * find out the current status, Check the value of <code>Status</code> returned in a call to <a>DescribeDataset</a>.
     * </p>
     * 
     * @param datasetSource
     *        The location of the manifest file that Amazon Lookout for Vision uses to create the dataset.</p>
     *        <p>
     *        If you don't specify <code>DatasetSource</code>, an empty dataset is created and the operation
     *        synchronously returns. Later, you can add JSON Lines by calling <a>UpdateDatasetEntries</a>.
     *        </p>
     *        <p>
     *        If you specify a value for <code>DataSource</code>, the manifest at the S3 location is validated and used
     *        to create the dataset. The call to <code>CreateDataset</code> is asynchronous and might take a while to
     *        complete. To find out the current status, Check the value of <code>Status</code> returned in a call to
     *        <a>DescribeDataset</a>.
     */

    public void setDatasetSource(DatasetSource datasetSource) {
        this.datasetSource = datasetSource;
    }

    /**
     * <p>
     * The location of the manifest file that Amazon Lookout for Vision uses to create the dataset.
     * </p>
     * <p>
     * If you don't specify <code>DatasetSource</code>, an empty dataset is created and the operation synchronously
     * returns. Later, you can add JSON Lines by calling <a>UpdateDatasetEntries</a>.
     * </p>
     * <p>
     * If you specify a value for <code>DataSource</code>, the manifest at the S3 location is validated and used to
     * create the dataset. The call to <code>CreateDataset</code> is asynchronous and might take a while to complete. To
     * find out the current status, Check the value of <code>Status</code> returned in a call to <a>DescribeDataset</a>.
     * </p>
     * 
     * @return The location of the manifest file that Amazon Lookout for Vision uses to create the dataset.</p>
     *         <p>
     *         If you don't specify <code>DatasetSource</code>, an empty dataset is created and the operation
     *         synchronously returns. Later, you can add JSON Lines by calling <a>UpdateDatasetEntries</a>.
     *         </p>
     *         <p>
     *         If you specify a value for <code>DataSource</code>, the manifest at the S3 location is validated and used
     *         to create the dataset. The call to <code>CreateDataset</code> is asynchronous and might take a while to
     *         complete. To find out the current status, Check the value of <code>Status</code> returned in a call to
     *         <a>DescribeDataset</a>.
     */

    public DatasetSource getDatasetSource() {
        return this.datasetSource;
    }

    /**
     * <p>
     * The location of the manifest file that Amazon Lookout for Vision uses to create the dataset.
     * </p>
     * <p>
     * If you don't specify <code>DatasetSource</code>, an empty dataset is created and the operation synchronously
     * returns. Later, you can add JSON Lines by calling <a>UpdateDatasetEntries</a>.
     * </p>
     * <p>
     * If you specify a value for <code>DataSource</code>, the manifest at the S3 location is validated and used to
     * create the dataset. The call to <code>CreateDataset</code> is asynchronous and might take a while to complete. To
     * find out the current status, Check the value of <code>Status</code> returned in a call to <a>DescribeDataset</a>.
     * </p>
     * 
     * @param datasetSource
     *        The location of the manifest file that Amazon Lookout for Vision uses to create the dataset.</p>
     *        <p>
     *        If you don't specify <code>DatasetSource</code>, an empty dataset is created and the operation
     *        synchronously returns. Later, you can add JSON Lines by calling <a>UpdateDatasetEntries</a>.
     *        </p>
     *        <p>
     *        If you specify a value for <code>DataSource</code>, the manifest at the S3 location is validated and used
     *        to create the dataset. The call to <code>CreateDataset</code> is asynchronous and might take a while to
     *        complete. To find out the current status, Check the value of <code>Status</code> returned in a call to
     *        <a>DescribeDataset</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withDatasetSource(DatasetSource datasetSource) {
        setDatasetSource(datasetSource);
        return this;
    }

    /**
     * <p>
     * ClientToken is an idempotency token that ensures a call to <code>CreateDataset</code> completes only once. You
     * choose the value to pass. For example, An issue, such as an network outage, might prevent you from getting a
     * response from <code>CreateDataset</code>. In this case, safely retry your call to <code>CreateDataset</code> by
     * using the same <code>ClientToken</code> parameter value. An error occurs if the other input parameters are not
     * the same as in the first request. Using a different value for <code>ClientToken</code> is considered a new call
     * to <code>CreateDataset</code>. An idempotency token is active for 8 hours.
     * </p>
     * 
     * @param clientToken
     *        ClientToken is an idempotency token that ensures a call to <code>CreateDataset</code> completes only once.
     *        You choose the value to pass. For example, An issue, such as an network outage, might prevent you from
     *        getting a response from <code>CreateDataset</code>. In this case, safely retry your call to
     *        <code>CreateDataset</code> by using the same <code>ClientToken</code> parameter value. An error occurs if
     *        the other input parameters are not the same as in the first request. Using a different value for
     *        <code>ClientToken</code> is considered a new call to <code>CreateDataset</code>. An idempotency token is
     *        active for 8 hours.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * ClientToken is an idempotency token that ensures a call to <code>CreateDataset</code> completes only once. You
     * choose the value to pass. For example, An issue, such as an network outage, might prevent you from getting a
     * response from <code>CreateDataset</code>. In this case, safely retry your call to <code>CreateDataset</code> by
     * using the same <code>ClientToken</code> parameter value. An error occurs if the other input parameters are not
     * the same as in the first request. Using a different value for <code>ClientToken</code> is considered a new call
     * to <code>CreateDataset</code>. An idempotency token is active for 8 hours.
     * </p>
     * 
     * @return ClientToken is an idempotency token that ensures a call to <code>CreateDataset</code> completes only
     *         once. You choose the value to pass. For example, An issue, such as an network outage, might prevent you
     *         from getting a response from <code>CreateDataset</code>. In this case, safely retry your call to
     *         <code>CreateDataset</code> by using the same <code>ClientToken</code> parameter value. An error occurs if
     *         the other input parameters are not the same as in the first request. Using a different value for
     *         <code>ClientToken</code> is considered a new call to <code>CreateDataset</code>. An idempotency token is
     *         active for 8 hours.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * ClientToken is an idempotency token that ensures a call to <code>CreateDataset</code> completes only once. You
     * choose the value to pass. For example, An issue, such as an network outage, might prevent you from getting a
     * response from <code>CreateDataset</code>. In this case, safely retry your call to <code>CreateDataset</code> by
     * using the same <code>ClientToken</code> parameter value. An error occurs if the other input parameters are not
     * the same as in the first request. Using a different value for <code>ClientToken</code> is considered a new call
     * to <code>CreateDataset</code>. An idempotency token is active for 8 hours.
     * </p>
     * 
     * @param clientToken
     *        ClientToken is an idempotency token that ensures a call to <code>CreateDataset</code> completes only once.
     *        You choose the value to pass. For example, An issue, such as an network outage, might prevent you from
     *        getting a response from <code>CreateDataset</code>. In this case, safely retry your call to
     *        <code>CreateDataset</code> by using the same <code>ClientToken</code> parameter value. An error occurs if
     *        the other input parameters are not the same as in the first request. Using a different value for
     *        <code>ClientToken</code> is considered a new call to <code>CreateDataset</code>. An idempotency token is
     *        active for 8 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatasetRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
            sb.append("DatasetType: ").append(getDatasetType()).append(",");
        if (getDatasetSource() != null)
            sb.append("DatasetSource: ").append(getDatasetSource()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
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
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getDatasetType() == null ^ this.getDatasetType() == null)
            return false;
        if (other.getDatasetType() != null && other.getDatasetType().equals(this.getDatasetType()) == false)
            return false;
        if (other.getDatasetSource() == null ^ this.getDatasetSource() == null)
            return false;
        if (other.getDatasetSource() != null && other.getDatasetSource().equals(this.getDatasetSource()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getDatasetType() == null) ? 0 : getDatasetType().hashCode());
        hashCode = prime * hashCode + ((getDatasetSource() == null) ? 0 : getDatasetSource().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateDatasetRequest clone() {
        return (CreateDatasetRequest) super.clone();
    }

}
