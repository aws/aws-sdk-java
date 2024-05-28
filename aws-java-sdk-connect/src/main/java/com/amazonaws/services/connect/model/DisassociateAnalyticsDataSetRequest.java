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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateAnalyticsDataSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateAnalyticsDataSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The identifier of the dataset to remove.
     * </p>
     */
    private String dataSetId;
    /**
     * <p>
     * The identifier of the target account. Use to associate a dataset to a different account than the one containing
     * the Amazon Connect instance. If not specified, by default this value is the Amazon Web Services account that has
     * the Amazon Connect instance.
     * </p>
     */
    private String targetAccountId;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *        ID</a> in the Amazon Resource Name (ARN) of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *         ID</a> in the Amazon Resource Name (ARN) of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *        ID</a> in the Amazon Resource Name (ARN) of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateAnalyticsDataSetRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The identifier of the dataset to remove.
     * </p>
     * 
     * @param dataSetId
     *        The identifier of the dataset to remove.
     */

    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    /**
     * <p>
     * The identifier of the dataset to remove.
     * </p>
     * 
     * @return The identifier of the dataset to remove.
     */

    public String getDataSetId() {
        return this.dataSetId;
    }

    /**
     * <p>
     * The identifier of the dataset to remove.
     * </p>
     * 
     * @param dataSetId
     *        The identifier of the dataset to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateAnalyticsDataSetRequest withDataSetId(String dataSetId) {
        setDataSetId(dataSetId);
        return this;
    }

    /**
     * <p>
     * The identifier of the target account. Use to associate a dataset to a different account than the one containing
     * the Amazon Connect instance. If not specified, by default this value is the Amazon Web Services account that has
     * the Amazon Connect instance.
     * </p>
     * 
     * @param targetAccountId
     *        The identifier of the target account. Use to associate a dataset to a different account than the one
     *        containing the Amazon Connect instance. If not specified, by default this value is the Amazon Web Services
     *        account that has the Amazon Connect instance.
     */

    public void setTargetAccountId(String targetAccountId) {
        this.targetAccountId = targetAccountId;
    }

    /**
     * <p>
     * The identifier of the target account. Use to associate a dataset to a different account than the one containing
     * the Amazon Connect instance. If not specified, by default this value is the Amazon Web Services account that has
     * the Amazon Connect instance.
     * </p>
     * 
     * @return The identifier of the target account. Use to associate a dataset to a different account than the one
     *         containing the Amazon Connect instance. If not specified, by default this value is the Amazon Web
     *         Services account that has the Amazon Connect instance.
     */

    public String getTargetAccountId() {
        return this.targetAccountId;
    }

    /**
     * <p>
     * The identifier of the target account. Use to associate a dataset to a different account than the one containing
     * the Amazon Connect instance. If not specified, by default this value is the Amazon Web Services account that has
     * the Amazon Connect instance.
     * </p>
     * 
     * @param targetAccountId
     *        The identifier of the target account. Use to associate a dataset to a different account than the one
     *        containing the Amazon Connect instance. If not specified, by default this value is the Amazon Web Services
     *        account that has the Amazon Connect instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateAnalyticsDataSetRequest withTargetAccountId(String targetAccountId) {
        setTargetAccountId(targetAccountId);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getDataSetId() != null)
            sb.append("DataSetId: ").append(getDataSetId()).append(",");
        if (getTargetAccountId() != null)
            sb.append("TargetAccountId: ").append(getTargetAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateAnalyticsDataSetRequest == false)
            return false;
        DisassociateAnalyticsDataSetRequest other = (DisassociateAnalyticsDataSetRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null && other.getDataSetId().equals(this.getDataSetId()) == false)
            return false;
        if (other.getTargetAccountId() == null ^ this.getTargetAccountId() == null)
            return false;
        if (other.getTargetAccountId() != null && other.getTargetAccountId().equals(this.getTargetAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getTargetAccountId() == null) ? 0 : getTargetAccountId().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateAnalyticsDataSetRequest clone() {
        return (DisassociateAnalyticsDataSetRequest) super.clone();
    }

}
