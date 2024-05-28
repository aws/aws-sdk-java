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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This API is in preview release for Amazon Connect and is subject to change.
 * </p>
 * <p>
 * Information about associations that are successfully created: <code>DataSetId</code>, <code>TargetAccountId</code>,
 * <code>ResourceShareId</code>, <code>ResourceShareArn</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AnalyticsDataAssociationResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalyticsDataAssociationResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the dataset.
     * </p>
     */
    private String dataSetId;
    /**
     * <p>
     * The identifier of the target account.
     * </p>
     */
    private String targetAccountId;
    /**
     * <p>
     * The Resource Access Manager share ID.
     * </p>
     */
    private String resourceShareId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Resource Access Manager share.
     * </p>
     */
    private String resourceShareArn;

    /**
     * <p>
     * The identifier of the dataset.
     * </p>
     * 
     * @param dataSetId
     *        The identifier of the dataset.
     */

    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    /**
     * <p>
     * The identifier of the dataset.
     * </p>
     * 
     * @return The identifier of the dataset.
     */

    public String getDataSetId() {
        return this.dataSetId;
    }

    /**
     * <p>
     * The identifier of the dataset.
     * </p>
     * 
     * @param dataSetId
     *        The identifier of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyticsDataAssociationResult withDataSetId(String dataSetId) {
        setDataSetId(dataSetId);
        return this;
    }

    /**
     * <p>
     * The identifier of the target account.
     * </p>
     * 
     * @param targetAccountId
     *        The identifier of the target account.
     */

    public void setTargetAccountId(String targetAccountId) {
        this.targetAccountId = targetAccountId;
    }

    /**
     * <p>
     * The identifier of the target account.
     * </p>
     * 
     * @return The identifier of the target account.
     */

    public String getTargetAccountId() {
        return this.targetAccountId;
    }

    /**
     * <p>
     * The identifier of the target account.
     * </p>
     * 
     * @param targetAccountId
     *        The identifier of the target account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyticsDataAssociationResult withTargetAccountId(String targetAccountId) {
        setTargetAccountId(targetAccountId);
        return this;
    }

    /**
     * <p>
     * The Resource Access Manager share ID.
     * </p>
     * 
     * @param resourceShareId
     *        The Resource Access Manager share ID.
     */

    public void setResourceShareId(String resourceShareId) {
        this.resourceShareId = resourceShareId;
    }

    /**
     * <p>
     * The Resource Access Manager share ID.
     * </p>
     * 
     * @return The Resource Access Manager share ID.
     */

    public String getResourceShareId() {
        return this.resourceShareId;
    }

    /**
     * <p>
     * The Resource Access Manager share ID.
     * </p>
     * 
     * @param resourceShareId
     *        The Resource Access Manager share ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyticsDataAssociationResult withResourceShareId(String resourceShareId) {
        setResourceShareId(resourceShareId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Resource Access Manager share.
     * </p>
     * 
     * @param resourceShareArn
     *        The Amazon Resource Name (ARN) of the Resource Access Manager share.
     */

    public void setResourceShareArn(String resourceShareArn) {
        this.resourceShareArn = resourceShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Resource Access Manager share.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Resource Access Manager share.
     */

    public String getResourceShareArn() {
        return this.resourceShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Resource Access Manager share.
     * </p>
     * 
     * @param resourceShareArn
     *        The Amazon Resource Name (ARN) of the Resource Access Manager share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyticsDataAssociationResult withResourceShareArn(String resourceShareArn) {
        setResourceShareArn(resourceShareArn);
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
        if (getDataSetId() != null)
            sb.append("DataSetId: ").append(getDataSetId()).append(",");
        if (getTargetAccountId() != null)
            sb.append("TargetAccountId: ").append(getTargetAccountId()).append(",");
        if (getResourceShareId() != null)
            sb.append("ResourceShareId: ").append(getResourceShareId()).append(",");
        if (getResourceShareArn() != null)
            sb.append("ResourceShareArn: ").append(getResourceShareArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalyticsDataAssociationResult == false)
            return false;
        AnalyticsDataAssociationResult other = (AnalyticsDataAssociationResult) obj;
        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null && other.getDataSetId().equals(this.getDataSetId()) == false)
            return false;
        if (other.getTargetAccountId() == null ^ this.getTargetAccountId() == null)
            return false;
        if (other.getTargetAccountId() != null && other.getTargetAccountId().equals(this.getTargetAccountId()) == false)
            return false;
        if (other.getResourceShareId() == null ^ this.getResourceShareId() == null)
            return false;
        if (other.getResourceShareId() != null && other.getResourceShareId().equals(this.getResourceShareId()) == false)
            return false;
        if (other.getResourceShareArn() == null ^ this.getResourceShareArn() == null)
            return false;
        if (other.getResourceShareArn() != null && other.getResourceShareArn().equals(this.getResourceShareArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getTargetAccountId() == null) ? 0 : getTargetAccountId().hashCode());
        hashCode = prime * hashCode + ((getResourceShareId() == null) ? 0 : getResourceShareId().hashCode());
        hashCode = prime * hashCode + ((getResourceShareArn() == null) ? 0 : getResourceShareArn().hashCode());
        return hashCode;
    }

    @Override
    public AnalyticsDataAssociationResult clone() {
        try {
            return (AnalyticsDataAssociationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.AnalyticsDataAssociationResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
