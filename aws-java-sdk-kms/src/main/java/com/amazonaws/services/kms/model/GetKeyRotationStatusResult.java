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
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/GetKeyRotationStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetKeyRotationStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A Boolean value that specifies whether key rotation is enabled.
     * </p>
     */
    private Boolean keyRotationEnabled;
    /**
     * <p>
     * Identifies the specified symmetric encryption KMS key.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * The number of days between each automatic rotation. The default value is 365 days.
     * </p>
     */
    private Integer rotationPeriodInDays;
    /**
     * <p>
     * The next date that KMS will automatically rotate the key material.
     * </p>
     */
    private java.util.Date nextRotationDate;
    /**
     * <p>
     * Identifies the date and time that an in progress on-demand rotation was initiated.
     * </p>
     * <p>
     * The KMS API follows an <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-eventual-consistency.html">eventual
     * consistency</a> model due to the distributed nature of the system. As a result, there might be a slight delay
     * between initiating on-demand key rotation and the rotation's completion. Once the on-demand rotation is complete,
     * use <a>ListKeyRotations</a> to view the details of the on-demand rotation.
     * </p>
     */
    private java.util.Date onDemandRotationStartDate;

    /**
     * <p>
     * A Boolean value that specifies whether key rotation is enabled.
     * </p>
     * 
     * @param keyRotationEnabled
     *        A Boolean value that specifies whether key rotation is enabled.
     */

    public void setKeyRotationEnabled(Boolean keyRotationEnabled) {
        this.keyRotationEnabled = keyRotationEnabled;
    }

    /**
     * <p>
     * A Boolean value that specifies whether key rotation is enabled.
     * </p>
     * 
     * @return A Boolean value that specifies whether key rotation is enabled.
     */

    public Boolean getKeyRotationEnabled() {
        return this.keyRotationEnabled;
    }

    /**
     * <p>
     * A Boolean value that specifies whether key rotation is enabled.
     * </p>
     * 
     * @param keyRotationEnabled
     *        A Boolean value that specifies whether key rotation is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKeyRotationStatusResult withKeyRotationEnabled(Boolean keyRotationEnabled) {
        setKeyRotationEnabled(keyRotationEnabled);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether key rotation is enabled.
     * </p>
     * 
     * @return A Boolean value that specifies whether key rotation is enabled.
     */

    public Boolean isKeyRotationEnabled() {
        return this.keyRotationEnabled;
    }

    /**
     * <p>
     * Identifies the specified symmetric encryption KMS key.
     * </p>
     * 
     * @param keyId
     *        Identifies the specified symmetric encryption KMS key.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * Identifies the specified symmetric encryption KMS key.
     * </p>
     * 
     * @return Identifies the specified symmetric encryption KMS key.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * Identifies the specified symmetric encryption KMS key.
     * </p>
     * 
     * @param keyId
     *        Identifies the specified symmetric encryption KMS key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKeyRotationStatusResult withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The number of days between each automatic rotation. The default value is 365 days.
     * </p>
     * 
     * @param rotationPeriodInDays
     *        The number of days between each automatic rotation. The default value is 365 days.
     */

    public void setRotationPeriodInDays(Integer rotationPeriodInDays) {
        this.rotationPeriodInDays = rotationPeriodInDays;
    }

    /**
     * <p>
     * The number of days between each automatic rotation. The default value is 365 days.
     * </p>
     * 
     * @return The number of days between each automatic rotation. The default value is 365 days.
     */

    public Integer getRotationPeriodInDays() {
        return this.rotationPeriodInDays;
    }

    /**
     * <p>
     * The number of days between each automatic rotation. The default value is 365 days.
     * </p>
     * 
     * @param rotationPeriodInDays
     *        The number of days between each automatic rotation. The default value is 365 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKeyRotationStatusResult withRotationPeriodInDays(Integer rotationPeriodInDays) {
        setRotationPeriodInDays(rotationPeriodInDays);
        return this;
    }

    /**
     * <p>
     * The next date that KMS will automatically rotate the key material.
     * </p>
     * 
     * @param nextRotationDate
     *        The next date that KMS will automatically rotate the key material.
     */

    public void setNextRotationDate(java.util.Date nextRotationDate) {
        this.nextRotationDate = nextRotationDate;
    }

    /**
     * <p>
     * The next date that KMS will automatically rotate the key material.
     * </p>
     * 
     * @return The next date that KMS will automatically rotate the key material.
     */

    public java.util.Date getNextRotationDate() {
        return this.nextRotationDate;
    }

    /**
     * <p>
     * The next date that KMS will automatically rotate the key material.
     * </p>
     * 
     * @param nextRotationDate
     *        The next date that KMS will automatically rotate the key material.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKeyRotationStatusResult withNextRotationDate(java.util.Date nextRotationDate) {
        setNextRotationDate(nextRotationDate);
        return this;
    }

    /**
     * <p>
     * Identifies the date and time that an in progress on-demand rotation was initiated.
     * </p>
     * <p>
     * The KMS API follows an <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-eventual-consistency.html">eventual
     * consistency</a> model due to the distributed nature of the system. As a result, there might be a slight delay
     * between initiating on-demand key rotation and the rotation's completion. Once the on-demand rotation is complete,
     * use <a>ListKeyRotations</a> to view the details of the on-demand rotation.
     * </p>
     * 
     * @param onDemandRotationStartDate
     *        Identifies the date and time that an in progress on-demand rotation was initiated.</p>
     *        <p>
     *        The KMS API follows an <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-eventual-consistency.html"
     *        >eventual consistency</a> model due to the distributed nature of the system. As a result, there might be a
     *        slight delay between initiating on-demand key rotation and the rotation's completion. Once the on-demand
     *        rotation is complete, use <a>ListKeyRotations</a> to view the details of the on-demand rotation.
     */

    public void setOnDemandRotationStartDate(java.util.Date onDemandRotationStartDate) {
        this.onDemandRotationStartDate = onDemandRotationStartDate;
    }

    /**
     * <p>
     * Identifies the date and time that an in progress on-demand rotation was initiated.
     * </p>
     * <p>
     * The KMS API follows an <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-eventual-consistency.html">eventual
     * consistency</a> model due to the distributed nature of the system. As a result, there might be a slight delay
     * between initiating on-demand key rotation and the rotation's completion. Once the on-demand rotation is complete,
     * use <a>ListKeyRotations</a> to view the details of the on-demand rotation.
     * </p>
     * 
     * @return Identifies the date and time that an in progress on-demand rotation was initiated.</p>
     *         <p>
     *         The KMS API follows an <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-eventual-consistency.html"
     *         >eventual consistency</a> model due to the distributed nature of the system. As a result, there might be
     *         a slight delay between initiating on-demand key rotation and the rotation's completion. Once the
     *         on-demand rotation is complete, use <a>ListKeyRotations</a> to view the details of the on-demand
     *         rotation.
     */

    public java.util.Date getOnDemandRotationStartDate() {
        return this.onDemandRotationStartDate;
    }

    /**
     * <p>
     * Identifies the date and time that an in progress on-demand rotation was initiated.
     * </p>
     * <p>
     * The KMS API follows an <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-eventual-consistency.html">eventual
     * consistency</a> model due to the distributed nature of the system. As a result, there might be a slight delay
     * between initiating on-demand key rotation and the rotation's completion. Once the on-demand rotation is complete,
     * use <a>ListKeyRotations</a> to view the details of the on-demand rotation.
     * </p>
     * 
     * @param onDemandRotationStartDate
     *        Identifies the date and time that an in progress on-demand rotation was initiated.</p>
     *        <p>
     *        The KMS API follows an <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/programming-eventual-consistency.html"
     *        >eventual consistency</a> model due to the distributed nature of the system. As a result, there might be a
     *        slight delay between initiating on-demand key rotation and the rotation's completion. Once the on-demand
     *        rotation is complete, use <a>ListKeyRotations</a> to view the details of the on-demand rotation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKeyRotationStatusResult withOnDemandRotationStartDate(java.util.Date onDemandRotationStartDate) {
        setOnDemandRotationStartDate(onDemandRotationStartDate);
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
        if (getKeyRotationEnabled() != null)
            sb.append("KeyRotationEnabled: ").append(getKeyRotationEnabled()).append(",");
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId()).append(",");
        if (getRotationPeriodInDays() != null)
            sb.append("RotationPeriodInDays: ").append(getRotationPeriodInDays()).append(",");
        if (getNextRotationDate() != null)
            sb.append("NextRotationDate: ").append(getNextRotationDate()).append(",");
        if (getOnDemandRotationStartDate() != null)
            sb.append("OnDemandRotationStartDate: ").append(getOnDemandRotationStartDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetKeyRotationStatusResult == false)
            return false;
        GetKeyRotationStatusResult other = (GetKeyRotationStatusResult) obj;
        if (other.getKeyRotationEnabled() == null ^ this.getKeyRotationEnabled() == null)
            return false;
        if (other.getKeyRotationEnabled() != null && other.getKeyRotationEnabled().equals(this.getKeyRotationEnabled()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getRotationPeriodInDays() == null ^ this.getRotationPeriodInDays() == null)
            return false;
        if (other.getRotationPeriodInDays() != null && other.getRotationPeriodInDays().equals(this.getRotationPeriodInDays()) == false)
            return false;
        if (other.getNextRotationDate() == null ^ this.getNextRotationDate() == null)
            return false;
        if (other.getNextRotationDate() != null && other.getNextRotationDate().equals(this.getNextRotationDate()) == false)
            return false;
        if (other.getOnDemandRotationStartDate() == null ^ this.getOnDemandRotationStartDate() == null)
            return false;
        if (other.getOnDemandRotationStartDate() != null && other.getOnDemandRotationStartDate().equals(this.getOnDemandRotationStartDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyRotationEnabled() == null) ? 0 : getKeyRotationEnabled().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getRotationPeriodInDays() == null) ? 0 : getRotationPeriodInDays().hashCode());
        hashCode = prime * hashCode + ((getNextRotationDate() == null) ? 0 : getNextRotationDate().hashCode());
        hashCode = prime * hashCode + ((getOnDemandRotationStartDate() == null) ? 0 : getOnDemandRotationStartDate().hashCode());
        return hashCode;
    }

    @Override
    public GetKeyRotationStatusResult clone() {
        try {
            return (GetKeyRotationStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
