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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/BatchDisassociateAnalyticsDataSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDisassociateAnalyticsDataSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * An array of associated dataset identifiers to remove.
     * </p>
     */
    private java.util.List<String> dataSetIds;
    /**
     * <p>
     * The identifier of the target account. Use to disassociate a dataset from a different account than the one
     * containing the Amazon Connect instance. If not specified, by default this value is the Amazon Web Services
     * account that has the Amazon Connect instance.
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

    public BatchDisassociateAnalyticsDataSetRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * An array of associated dataset identifiers to remove.
     * </p>
     * 
     * @return An array of associated dataset identifiers to remove.
     */

    public java.util.List<String> getDataSetIds() {
        return dataSetIds;
    }

    /**
     * <p>
     * An array of associated dataset identifiers to remove.
     * </p>
     * 
     * @param dataSetIds
     *        An array of associated dataset identifiers to remove.
     */

    public void setDataSetIds(java.util.Collection<String> dataSetIds) {
        if (dataSetIds == null) {
            this.dataSetIds = null;
            return;
        }

        this.dataSetIds = new java.util.ArrayList<String>(dataSetIds);
    }

    /**
     * <p>
     * An array of associated dataset identifiers to remove.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSetIds(java.util.Collection)} or {@link #withDataSetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dataSetIds
     *        An array of associated dataset identifiers to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateAnalyticsDataSetRequest withDataSetIds(String... dataSetIds) {
        if (this.dataSetIds == null) {
            setDataSetIds(new java.util.ArrayList<String>(dataSetIds.length));
        }
        for (String ele : dataSetIds) {
            this.dataSetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of associated dataset identifiers to remove.
     * </p>
     * 
     * @param dataSetIds
     *        An array of associated dataset identifiers to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateAnalyticsDataSetRequest withDataSetIds(java.util.Collection<String> dataSetIds) {
        setDataSetIds(dataSetIds);
        return this;
    }

    /**
     * <p>
     * The identifier of the target account. Use to disassociate a dataset from a different account than the one
     * containing the Amazon Connect instance. If not specified, by default this value is the Amazon Web Services
     * account that has the Amazon Connect instance.
     * </p>
     * 
     * @param targetAccountId
     *        The identifier of the target account. Use to disassociate a dataset from a different account than the one
     *        containing the Amazon Connect instance. If not specified, by default this value is the Amazon Web Services
     *        account that has the Amazon Connect instance.
     */

    public void setTargetAccountId(String targetAccountId) {
        this.targetAccountId = targetAccountId;
    }

    /**
     * <p>
     * The identifier of the target account. Use to disassociate a dataset from a different account than the one
     * containing the Amazon Connect instance. If not specified, by default this value is the Amazon Web Services
     * account that has the Amazon Connect instance.
     * </p>
     * 
     * @return The identifier of the target account. Use to disassociate a dataset from a different account than the one
     *         containing the Amazon Connect instance. If not specified, by default this value is the Amazon Web
     *         Services account that has the Amazon Connect instance.
     */

    public String getTargetAccountId() {
        return this.targetAccountId;
    }

    /**
     * <p>
     * The identifier of the target account. Use to disassociate a dataset from a different account than the one
     * containing the Amazon Connect instance. If not specified, by default this value is the Amazon Web Services
     * account that has the Amazon Connect instance.
     * </p>
     * 
     * @param targetAccountId
     *        The identifier of the target account. Use to disassociate a dataset from a different account than the one
     *        containing the Amazon Connect instance. If not specified, by default this value is the Amazon Web Services
     *        account that has the Amazon Connect instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateAnalyticsDataSetRequest withTargetAccountId(String targetAccountId) {
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
        if (getDataSetIds() != null)
            sb.append("DataSetIds: ").append(getDataSetIds()).append(",");
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

        if (obj instanceof BatchDisassociateAnalyticsDataSetRequest == false)
            return false;
        BatchDisassociateAnalyticsDataSetRequest other = (BatchDisassociateAnalyticsDataSetRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getDataSetIds() == null ^ this.getDataSetIds() == null)
            return false;
        if (other.getDataSetIds() != null && other.getDataSetIds().equals(this.getDataSetIds()) == false)
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
        hashCode = prime * hashCode + ((getDataSetIds() == null) ? 0 : getDataSetIds().hashCode());
        hashCode = prime * hashCode + ((getTargetAccountId() == null) ? 0 : getTargetAccountId().hashCode());
        return hashCode;
    }

    @Override
    public BatchDisassociateAnalyticsDataSetRequest clone() {
        return (BatchDisassociateAnalyticsDataSetRequest) super.clone();
    }

}
