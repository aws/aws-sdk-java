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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns details of a conformance pack. A conformance pack is a collection of AWS Config rules and remediation actions
 * that can be easily deployed in an account and a region.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ConformancePackDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConformancePackDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the conformance pack.
     * </p>
     */
    private String conformancePackName;
    /**
     * <p>
     * Amazon Resource Name (ARN) of the conformance pack.
     * </p>
     */
    private String conformancePackArn;
    /**
     * <p>
     * ID of the conformance pack.
     * </p>
     */
    private String conformancePackId;
    /**
     * <p>
     * Conformance pack template that is used to create a pack. The delivery bucket name should start with
     * awsconfigconforms. For example: "Resource": "arn:aws:s3:::your_bucket_name/*".
     * </p>
     */
    private String deliveryS3Bucket;
    /**
     * <p>
     * The prefix for the Amazon S3 bucket.
     * </p>
     */
    private String deliveryS3KeyPrefix;
    /**
     * <p>
     * A list of <code>ConformancePackInputParameter</code> objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConformancePackInputParameter> conformancePackInputParameters;
    /**
     * <p>
     * Last time when conformation pack update was requested.
     * </p>
     */
    private java.util.Date lastUpdateRequestedTime;
    /**
     * <p>
     * AWS service that created the conformance pack.
     * </p>
     */
    private String createdBy;

    /**
     * <p>
     * Name of the conformance pack.
     * </p>
     * 
     * @param conformancePackName
     *        Name of the conformance pack.
     */

    public void setConformancePackName(String conformancePackName) {
        this.conformancePackName = conformancePackName;
    }

    /**
     * <p>
     * Name of the conformance pack.
     * </p>
     * 
     * @return Name of the conformance pack.
     */

    public String getConformancePackName() {
        return this.conformancePackName;
    }

    /**
     * <p>
     * Name of the conformance pack.
     * </p>
     * 
     * @param conformancePackName
     *        Name of the conformance pack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackDetail withConformancePackName(String conformancePackName) {
        setConformancePackName(conformancePackName);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the conformance pack.
     * </p>
     * 
     * @param conformancePackArn
     *        Amazon Resource Name (ARN) of the conformance pack.
     */

    public void setConformancePackArn(String conformancePackArn) {
        this.conformancePackArn = conformancePackArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the conformance pack.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the conformance pack.
     */

    public String getConformancePackArn() {
        return this.conformancePackArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the conformance pack.
     * </p>
     * 
     * @param conformancePackArn
     *        Amazon Resource Name (ARN) of the conformance pack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackDetail withConformancePackArn(String conformancePackArn) {
        setConformancePackArn(conformancePackArn);
        return this;
    }

    /**
     * <p>
     * ID of the conformance pack.
     * </p>
     * 
     * @param conformancePackId
     *        ID of the conformance pack.
     */

    public void setConformancePackId(String conformancePackId) {
        this.conformancePackId = conformancePackId;
    }

    /**
     * <p>
     * ID of the conformance pack.
     * </p>
     * 
     * @return ID of the conformance pack.
     */

    public String getConformancePackId() {
        return this.conformancePackId;
    }

    /**
     * <p>
     * ID of the conformance pack.
     * </p>
     * 
     * @param conformancePackId
     *        ID of the conformance pack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackDetail withConformancePackId(String conformancePackId) {
        setConformancePackId(conformancePackId);
        return this;
    }

    /**
     * <p>
     * Conformance pack template that is used to create a pack. The delivery bucket name should start with
     * awsconfigconforms. For example: "Resource": "arn:aws:s3:::your_bucket_name/*".
     * </p>
     * 
     * @param deliveryS3Bucket
     *        Conformance pack template that is used to create a pack. The delivery bucket name should start with
     *        awsconfigconforms. For example: "Resource": "arn:aws:s3:::your_bucket_name/*".
     */

    public void setDeliveryS3Bucket(String deliveryS3Bucket) {
        this.deliveryS3Bucket = deliveryS3Bucket;
    }

    /**
     * <p>
     * Conformance pack template that is used to create a pack. The delivery bucket name should start with
     * awsconfigconforms. For example: "Resource": "arn:aws:s3:::your_bucket_name/*".
     * </p>
     * 
     * @return Conformance pack template that is used to create a pack. The delivery bucket name should start with
     *         awsconfigconforms. For example: "Resource": "arn:aws:s3:::your_bucket_name/*".
     */

    public String getDeliveryS3Bucket() {
        return this.deliveryS3Bucket;
    }

    /**
     * <p>
     * Conformance pack template that is used to create a pack. The delivery bucket name should start with
     * awsconfigconforms. For example: "Resource": "arn:aws:s3:::your_bucket_name/*".
     * </p>
     * 
     * @param deliveryS3Bucket
     *        Conformance pack template that is used to create a pack. The delivery bucket name should start with
     *        awsconfigconforms. For example: "Resource": "arn:aws:s3:::your_bucket_name/*".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackDetail withDeliveryS3Bucket(String deliveryS3Bucket) {
        setDeliveryS3Bucket(deliveryS3Bucket);
        return this;
    }

    /**
     * <p>
     * The prefix for the Amazon S3 bucket.
     * </p>
     * 
     * @param deliveryS3KeyPrefix
     *        The prefix for the Amazon S3 bucket.
     */

    public void setDeliveryS3KeyPrefix(String deliveryS3KeyPrefix) {
        this.deliveryS3KeyPrefix = deliveryS3KeyPrefix;
    }

    /**
     * <p>
     * The prefix for the Amazon S3 bucket.
     * </p>
     * 
     * @return The prefix for the Amazon S3 bucket.
     */

    public String getDeliveryS3KeyPrefix() {
        return this.deliveryS3KeyPrefix;
    }

    /**
     * <p>
     * The prefix for the Amazon S3 bucket.
     * </p>
     * 
     * @param deliveryS3KeyPrefix
     *        The prefix for the Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackDetail withDeliveryS3KeyPrefix(String deliveryS3KeyPrefix) {
        setDeliveryS3KeyPrefix(deliveryS3KeyPrefix);
        return this;
    }

    /**
     * <p>
     * A list of <code>ConformancePackInputParameter</code> objects.
     * </p>
     * 
     * @return A list of <code>ConformancePackInputParameter</code> objects.
     */

    public java.util.List<ConformancePackInputParameter> getConformancePackInputParameters() {
        if (conformancePackInputParameters == null) {
            conformancePackInputParameters = new com.amazonaws.internal.SdkInternalList<ConformancePackInputParameter>();
        }
        return conformancePackInputParameters;
    }

    /**
     * <p>
     * A list of <code>ConformancePackInputParameter</code> objects.
     * </p>
     * 
     * @param conformancePackInputParameters
     *        A list of <code>ConformancePackInputParameter</code> objects.
     */

    public void setConformancePackInputParameters(java.util.Collection<ConformancePackInputParameter> conformancePackInputParameters) {
        if (conformancePackInputParameters == null) {
            this.conformancePackInputParameters = null;
            return;
        }

        this.conformancePackInputParameters = new com.amazonaws.internal.SdkInternalList<ConformancePackInputParameter>(conformancePackInputParameters);
    }

    /**
     * <p>
     * A list of <code>ConformancePackInputParameter</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConformancePackInputParameters(java.util.Collection)} or
     * {@link #withConformancePackInputParameters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param conformancePackInputParameters
     *        A list of <code>ConformancePackInputParameter</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackDetail withConformancePackInputParameters(ConformancePackInputParameter... conformancePackInputParameters) {
        if (this.conformancePackInputParameters == null) {
            setConformancePackInputParameters(new com.amazonaws.internal.SdkInternalList<ConformancePackInputParameter>(conformancePackInputParameters.length));
        }
        for (ConformancePackInputParameter ele : conformancePackInputParameters) {
            this.conformancePackInputParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ConformancePackInputParameter</code> objects.
     * </p>
     * 
     * @param conformancePackInputParameters
     *        A list of <code>ConformancePackInputParameter</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackDetail withConformancePackInputParameters(java.util.Collection<ConformancePackInputParameter> conformancePackInputParameters) {
        setConformancePackInputParameters(conformancePackInputParameters);
        return this;
    }

    /**
     * <p>
     * Last time when conformation pack update was requested.
     * </p>
     * 
     * @param lastUpdateRequestedTime
     *        Last time when conformation pack update was requested.
     */

    public void setLastUpdateRequestedTime(java.util.Date lastUpdateRequestedTime) {
        this.lastUpdateRequestedTime = lastUpdateRequestedTime;
    }

    /**
     * <p>
     * Last time when conformation pack update was requested.
     * </p>
     * 
     * @return Last time when conformation pack update was requested.
     */

    public java.util.Date getLastUpdateRequestedTime() {
        return this.lastUpdateRequestedTime;
    }

    /**
     * <p>
     * Last time when conformation pack update was requested.
     * </p>
     * 
     * @param lastUpdateRequestedTime
     *        Last time when conformation pack update was requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackDetail withLastUpdateRequestedTime(java.util.Date lastUpdateRequestedTime) {
        setLastUpdateRequestedTime(lastUpdateRequestedTime);
        return this;
    }

    /**
     * <p>
     * AWS service that created the conformance pack.
     * </p>
     * 
     * @param createdBy
     *        AWS service that created the conformance pack.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * AWS service that created the conformance pack.
     * </p>
     * 
     * @return AWS service that created the conformance pack.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * AWS service that created the conformance pack.
     * </p>
     * 
     * @param createdBy
     *        AWS service that created the conformance pack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackDetail withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
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
        if (getConformancePackName() != null)
            sb.append("ConformancePackName: ").append(getConformancePackName()).append(",");
        if (getConformancePackArn() != null)
            sb.append("ConformancePackArn: ").append(getConformancePackArn()).append(",");
        if (getConformancePackId() != null)
            sb.append("ConformancePackId: ").append(getConformancePackId()).append(",");
        if (getDeliveryS3Bucket() != null)
            sb.append("DeliveryS3Bucket: ").append(getDeliveryS3Bucket()).append(",");
        if (getDeliveryS3KeyPrefix() != null)
            sb.append("DeliveryS3KeyPrefix: ").append(getDeliveryS3KeyPrefix()).append(",");
        if (getConformancePackInputParameters() != null)
            sb.append("ConformancePackInputParameters: ").append(getConformancePackInputParameters()).append(",");
        if (getLastUpdateRequestedTime() != null)
            sb.append("LastUpdateRequestedTime: ").append(getLastUpdateRequestedTime()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConformancePackDetail == false)
            return false;
        ConformancePackDetail other = (ConformancePackDetail) obj;
        if (other.getConformancePackName() == null ^ this.getConformancePackName() == null)
            return false;
        if (other.getConformancePackName() != null && other.getConformancePackName().equals(this.getConformancePackName()) == false)
            return false;
        if (other.getConformancePackArn() == null ^ this.getConformancePackArn() == null)
            return false;
        if (other.getConformancePackArn() != null && other.getConformancePackArn().equals(this.getConformancePackArn()) == false)
            return false;
        if (other.getConformancePackId() == null ^ this.getConformancePackId() == null)
            return false;
        if (other.getConformancePackId() != null && other.getConformancePackId().equals(this.getConformancePackId()) == false)
            return false;
        if (other.getDeliveryS3Bucket() == null ^ this.getDeliveryS3Bucket() == null)
            return false;
        if (other.getDeliveryS3Bucket() != null && other.getDeliveryS3Bucket().equals(this.getDeliveryS3Bucket()) == false)
            return false;
        if (other.getDeliveryS3KeyPrefix() == null ^ this.getDeliveryS3KeyPrefix() == null)
            return false;
        if (other.getDeliveryS3KeyPrefix() != null && other.getDeliveryS3KeyPrefix().equals(this.getDeliveryS3KeyPrefix()) == false)
            return false;
        if (other.getConformancePackInputParameters() == null ^ this.getConformancePackInputParameters() == null)
            return false;
        if (other.getConformancePackInputParameters() != null
                && other.getConformancePackInputParameters().equals(this.getConformancePackInputParameters()) == false)
            return false;
        if (other.getLastUpdateRequestedTime() == null ^ this.getLastUpdateRequestedTime() == null)
            return false;
        if (other.getLastUpdateRequestedTime() != null && other.getLastUpdateRequestedTime().equals(this.getLastUpdateRequestedTime()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConformancePackName() == null) ? 0 : getConformancePackName().hashCode());
        hashCode = prime * hashCode + ((getConformancePackArn() == null) ? 0 : getConformancePackArn().hashCode());
        hashCode = prime * hashCode + ((getConformancePackId() == null) ? 0 : getConformancePackId().hashCode());
        hashCode = prime * hashCode + ((getDeliveryS3Bucket() == null) ? 0 : getDeliveryS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getDeliveryS3KeyPrefix() == null) ? 0 : getDeliveryS3KeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getConformancePackInputParameters() == null) ? 0 : getConformancePackInputParameters().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateRequestedTime() == null) ? 0 : getLastUpdateRequestedTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        return hashCode;
    }

    @Override
    public ConformancePackDetail clone() {
        try {
            return (ConformancePackDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ConformancePackDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
