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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeDatasetGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDatasetGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the dataset group.
     * </p>
     */
    private String datasetGroupName;
    /**
     * <p>
     * The ARN of the dataset group.
     * </p>
     */
    private String datasetGroupArn;
    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) of the datasets contained in the dataset group.
     * </p>
     */
    private java.util.List<String> datasetArns;
    /**
     * <p>
     * The domain associated with the dataset group. The <code>Domain</code> and <code>DatasetType</code> that you
     * choose determine the fields that must be present in the training data that you import to the dataset. For
     * example, if you choose the <code>RETAIL</code> domain and <code>TARGET_TIME_SERIES</code> as the
     * <code>DatasetType</code>, Amazon Forecast requires <code>item_id</code>, <code>timestamp</code>, and
     * <code>demand</code> fields to be present in your data. For more information, see
     * <a>howitworks-datasets-groups</a>.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The status of the dataset group. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_PENDING</code>, <code>UPDATE_IN_PROGRESS</code>, <code>UPDATE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <code>UPDATE</code> states apply when the <a>UpdateDatasetGroup</a> operation is called.
     * </p>
     * <note>
     * <p>
     * The <code>Status</code> of the dataset group must be <code>ACTIVE</code> before creating a predictor using the
     * dataset group.
     * </p>
     * </note>
     */
    private String status;
    /**
     * <p>
     * When the dataset group was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * When the dataset group was created or last updated from a call to the <a>UpdateDatasetGroup</a> operation. While
     * the dataset group is being updated, <code>LastModificationTime</code> is the current query time.
     * </p>
     */
    private java.util.Date lastModificationTime;

    /**
     * <p>
     * The name of the dataset group.
     * </p>
     * 
     * @param datasetGroupName
     *        The name of the dataset group.
     */

    public void setDatasetGroupName(String datasetGroupName) {
        this.datasetGroupName = datasetGroupName;
    }

    /**
     * <p>
     * The name of the dataset group.
     * </p>
     * 
     * @return The name of the dataset group.
     */

    public String getDatasetGroupName() {
        return this.datasetGroupName;
    }

    /**
     * <p>
     * The name of the dataset group.
     * </p>
     * 
     * @param datasetGroupName
     *        The name of the dataset group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetGroupResult withDatasetGroupName(String datasetGroupName) {
        setDatasetGroupName(datasetGroupName);
        return this;
    }

    /**
     * <p>
     * The ARN of the dataset group.
     * </p>
     * 
     * @param datasetGroupArn
     *        The ARN of the dataset group.
     */

    public void setDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
    }

    /**
     * <p>
     * The ARN of the dataset group.
     * </p>
     * 
     * @return The ARN of the dataset group.
     */

    public String getDatasetGroupArn() {
        return this.datasetGroupArn;
    }

    /**
     * <p>
     * The ARN of the dataset group.
     * </p>
     * 
     * @param datasetGroupArn
     *        The ARN of the dataset group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetGroupResult withDatasetGroupArn(String datasetGroupArn) {
        setDatasetGroupArn(datasetGroupArn);
        return this;
    }

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) of the datasets contained in the dataset group.
     * </p>
     * 
     * @return An array of Amazon Resource Names (ARNs) of the datasets contained in the dataset group.
     */

    public java.util.List<String> getDatasetArns() {
        return datasetArns;
    }

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) of the datasets contained in the dataset group.
     * </p>
     * 
     * @param datasetArns
     *        An array of Amazon Resource Names (ARNs) of the datasets contained in the dataset group.
     */

    public void setDatasetArns(java.util.Collection<String> datasetArns) {
        if (datasetArns == null) {
            this.datasetArns = null;
            return;
        }

        this.datasetArns = new java.util.ArrayList<String>(datasetArns);
    }

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) of the datasets contained in the dataset group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatasetArns(java.util.Collection)} or {@link #withDatasetArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param datasetArns
     *        An array of Amazon Resource Names (ARNs) of the datasets contained in the dataset group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetGroupResult withDatasetArns(String... datasetArns) {
        if (this.datasetArns == null) {
            setDatasetArns(new java.util.ArrayList<String>(datasetArns.length));
        }
        for (String ele : datasetArns) {
            this.datasetArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of Amazon Resource Names (ARNs) of the datasets contained in the dataset group.
     * </p>
     * 
     * @param datasetArns
     *        An array of Amazon Resource Names (ARNs) of the datasets contained in the dataset group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetGroupResult withDatasetArns(java.util.Collection<String> datasetArns) {
        setDatasetArns(datasetArns);
        return this;
    }

    /**
     * <p>
     * The domain associated with the dataset group. The <code>Domain</code> and <code>DatasetType</code> that you
     * choose determine the fields that must be present in the training data that you import to the dataset. For
     * example, if you choose the <code>RETAIL</code> domain and <code>TARGET_TIME_SERIES</code> as the
     * <code>DatasetType</code>, Amazon Forecast requires <code>item_id</code>, <code>timestamp</code>, and
     * <code>demand</code> fields to be present in your data. For more information, see
     * <a>howitworks-datasets-groups</a>.
     * </p>
     * 
     * @param domain
     *        The domain associated with the dataset group. The <code>Domain</code> and <code>DatasetType</code> that
     *        you choose determine the fields that must be present in the training data that you import to the dataset.
     *        For example, if you choose the <code>RETAIL</code> domain and <code>TARGET_TIME_SERIES</code> as the
     *        <code>DatasetType</code>, Amazon Forecast requires <code>item_id</code>, <code>timestamp</code>, and
     *        <code>demand</code> fields to be present in your data. For more information, see
     *        <a>howitworks-datasets-groups</a>.
     * @see Domain
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The domain associated with the dataset group. The <code>Domain</code> and <code>DatasetType</code> that you
     * choose determine the fields that must be present in the training data that you import to the dataset. For
     * example, if you choose the <code>RETAIL</code> domain and <code>TARGET_TIME_SERIES</code> as the
     * <code>DatasetType</code>, Amazon Forecast requires <code>item_id</code>, <code>timestamp</code>, and
     * <code>demand</code> fields to be present in your data. For more information, see
     * <a>howitworks-datasets-groups</a>.
     * </p>
     * 
     * @return The domain associated with the dataset group. The <code>Domain</code> and <code>DatasetType</code> that
     *         you choose determine the fields that must be present in the training data that you import to the dataset.
     *         For example, if you choose the <code>RETAIL</code> domain and <code>TARGET_TIME_SERIES</code> as the
     *         <code>DatasetType</code>, Amazon Forecast requires <code>item_id</code>, <code>timestamp</code>, and
     *         <code>demand</code> fields to be present in your data. For more information, see
     *         <a>howitworks-datasets-groups</a>.
     * @see Domain
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The domain associated with the dataset group. The <code>Domain</code> and <code>DatasetType</code> that you
     * choose determine the fields that must be present in the training data that you import to the dataset. For
     * example, if you choose the <code>RETAIL</code> domain and <code>TARGET_TIME_SERIES</code> as the
     * <code>DatasetType</code>, Amazon Forecast requires <code>item_id</code>, <code>timestamp</code>, and
     * <code>demand</code> fields to be present in your data. For more information, see
     * <a>howitworks-datasets-groups</a>.
     * </p>
     * 
     * @param domain
     *        The domain associated with the dataset group. The <code>Domain</code> and <code>DatasetType</code> that
     *        you choose determine the fields that must be present in the training data that you import to the dataset.
     *        For example, if you choose the <code>RETAIL</code> domain and <code>TARGET_TIME_SERIES</code> as the
     *        <code>DatasetType</code>, Amazon Forecast requires <code>item_id</code>, <code>timestamp</code>, and
     *        <code>demand</code> fields to be present in your data. For more information, see
     *        <a>howitworks-datasets-groups</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Domain
     */

    public DescribeDatasetGroupResult withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The domain associated with the dataset group. The <code>Domain</code> and <code>DatasetType</code> that you
     * choose determine the fields that must be present in the training data that you import to the dataset. For
     * example, if you choose the <code>RETAIL</code> domain and <code>TARGET_TIME_SERIES</code> as the
     * <code>DatasetType</code>, Amazon Forecast requires <code>item_id</code>, <code>timestamp</code>, and
     * <code>demand</code> fields to be present in your data. For more information, see
     * <a>howitworks-datasets-groups</a>.
     * </p>
     * 
     * @param domain
     *        The domain associated with the dataset group. The <code>Domain</code> and <code>DatasetType</code> that
     *        you choose determine the fields that must be present in the training data that you import to the dataset.
     *        For example, if you choose the <code>RETAIL</code> domain and <code>TARGET_TIME_SERIES</code> as the
     *        <code>DatasetType</code>, Amazon Forecast requires <code>item_id</code>, <code>timestamp</code>, and
     *        <code>demand</code> fields to be present in your data. For more information, see
     *        <a>howitworks-datasets-groups</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Domain
     */

    public DescribeDatasetGroupResult withDomain(Domain domain) {
        this.domain = domain.toString();
        return this;
    }

    /**
     * <p>
     * The status of the dataset group. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_PENDING</code>, <code>UPDATE_IN_PROGRESS</code>, <code>UPDATE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <code>UPDATE</code> states apply when the <a>UpdateDatasetGroup</a> operation is called.
     * </p>
     * <note>
     * <p>
     * The <code>Status</code> of the dataset group must be <code>ACTIVE</code> before creating a predictor using the
     * dataset group.
     * </p>
     * </note>
     * 
     * @param status
     *        The status of the dataset group. States include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_PENDING</code>, <code>UPDATE_IN_PROGRESS</code>, <code>UPDATE_FAILED</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The <code>UPDATE</code> states apply when the <a>UpdateDatasetGroup</a> operation is called.
     *        </p>
     *        <note>
     *        <p>
     *        The <code>Status</code> of the dataset group must be <code>ACTIVE</code> before creating a predictor using
     *        the dataset group.
     *        </p>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the dataset group. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_PENDING</code>, <code>UPDATE_IN_PROGRESS</code>, <code>UPDATE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <code>UPDATE</code> states apply when the <a>UpdateDatasetGroup</a> operation is called.
     * </p>
     * <note>
     * <p>
     * The <code>Status</code> of the dataset group must be <code>ACTIVE</code> before creating a predictor using the
     * dataset group.
     * </p>
     * </note>
     * 
     * @return The status of the dataset group. States include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE_PENDING</code>, <code>UPDATE_IN_PROGRESS</code>, <code>UPDATE_FAILED</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The <code>UPDATE</code> states apply when the <a>UpdateDatasetGroup</a> operation is called.
     *         </p>
     *         <note>
     *         <p>
     *         The <code>Status</code> of the dataset group must be <code>ACTIVE</code> before creating a predictor
     *         using the dataset group.
     *         </p>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the dataset group. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_PENDING</code>, <code>UPDATE_IN_PROGRESS</code>, <code>UPDATE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The <code>UPDATE</code> states apply when the <a>UpdateDatasetGroup</a> operation is called.
     * </p>
     * <note>
     * <p>
     * The <code>Status</code> of the dataset group must be <code>ACTIVE</code> before creating a predictor using the
     * dataset group.
     * </p>
     * </note>
     * 
     * @param status
     *        The status of the dataset group. States include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_PENDING</code>, <code>UPDATE_IN_PROGRESS</code>, <code>UPDATE_FAILED</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The <code>UPDATE</code> states apply when the <a>UpdateDatasetGroup</a> operation is called.
     *        </p>
     *        <note>
     *        <p>
     *        The <code>Status</code> of the dataset group must be <code>ACTIVE</code> before creating a predictor using
     *        the dataset group.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetGroupResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * When the dataset group was created.
     * </p>
     * 
     * @param creationTime
     *        When the dataset group was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the dataset group was created.
     * </p>
     * 
     * @return When the dataset group was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the dataset group was created.
     * </p>
     * 
     * @param creationTime
     *        When the dataset group was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetGroupResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * When the dataset group was created or last updated from a call to the <a>UpdateDatasetGroup</a> operation. While
     * the dataset group is being updated, <code>LastModificationTime</code> is the current query time.
     * </p>
     * 
     * @param lastModificationTime
     *        When the dataset group was created or last updated from a call to the <a>UpdateDatasetGroup</a> operation.
     *        While the dataset group is being updated, <code>LastModificationTime</code> is the current query time.
     */

    public void setLastModificationTime(java.util.Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    /**
     * <p>
     * When the dataset group was created or last updated from a call to the <a>UpdateDatasetGroup</a> operation. While
     * the dataset group is being updated, <code>LastModificationTime</code> is the current query time.
     * </p>
     * 
     * @return When the dataset group was created or last updated from a call to the <a>UpdateDatasetGroup</a>
     *         operation. While the dataset group is being updated, <code>LastModificationTime</code> is the current
     *         query time.
     */

    public java.util.Date getLastModificationTime() {
        return this.lastModificationTime;
    }

    /**
     * <p>
     * When the dataset group was created or last updated from a call to the <a>UpdateDatasetGroup</a> operation. While
     * the dataset group is being updated, <code>LastModificationTime</code> is the current query time.
     * </p>
     * 
     * @param lastModificationTime
     *        When the dataset group was created or last updated from a call to the <a>UpdateDatasetGroup</a> operation.
     *        While the dataset group is being updated, <code>LastModificationTime</code> is the current query time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetGroupResult withLastModificationTime(java.util.Date lastModificationTime) {
        setLastModificationTime(lastModificationTime);
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
        if (getDatasetGroupName() != null)
            sb.append("DatasetGroupName: ").append(getDatasetGroupName()).append(",");
        if (getDatasetGroupArn() != null)
            sb.append("DatasetGroupArn: ").append(getDatasetGroupArn()).append(",");
        if (getDatasetArns() != null)
            sb.append("DatasetArns: ").append(getDatasetArns()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModificationTime() != null)
            sb.append("LastModificationTime: ").append(getLastModificationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDatasetGroupResult == false)
            return false;
        DescribeDatasetGroupResult other = (DescribeDatasetGroupResult) obj;
        if (other.getDatasetGroupName() == null ^ this.getDatasetGroupName() == null)
            return false;
        if (other.getDatasetGroupName() != null && other.getDatasetGroupName().equals(this.getDatasetGroupName()) == false)
            return false;
        if (other.getDatasetGroupArn() == null ^ this.getDatasetGroupArn() == null)
            return false;
        if (other.getDatasetGroupArn() != null && other.getDatasetGroupArn().equals(this.getDatasetGroupArn()) == false)
            return false;
        if (other.getDatasetArns() == null ^ this.getDatasetArns() == null)
            return false;
        if (other.getDatasetArns() != null && other.getDatasetArns().equals(this.getDatasetArns()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModificationTime() == null ^ this.getLastModificationTime() == null)
            return false;
        if (other.getLastModificationTime() != null && other.getLastModificationTime().equals(this.getLastModificationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetGroupName() == null) ? 0 : getDatasetGroupName().hashCode());
        hashCode = prime * hashCode + ((getDatasetGroupArn() == null) ? 0 : getDatasetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getDatasetArns() == null) ? 0 : getDatasetArns().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDatasetGroupResult clone() {
        try {
            return (DescribeDatasetGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
