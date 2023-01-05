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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Retention settings for the destination Amazon S3 buckets in Amazon Security Lake.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/RetentionSetting" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetentionSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The retention period specifies a fixed period of time during which the Security Lake object remains locked. You
     * can specify the retention period in days for one or more sources.
     * </p>
     */
    private Integer retentionPeriod;
    /**
     * <p>
     * The range of storage classes that you can choose from based on the data access, resiliency, and cost requirements
     * of your workloads.
     * </p>
     */
    private String storageClass;

    /**
     * <p>
     * The retention period specifies a fixed period of time during which the Security Lake object remains locked. You
     * can specify the retention period in days for one or more sources.
     * </p>
     * 
     * @param retentionPeriod
     *        The retention period specifies a fixed period of time during which the Security Lake object remains
     *        locked. You can specify the retention period in days for one or more sources.
     */

    public void setRetentionPeriod(Integer retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * <p>
     * The retention period specifies a fixed period of time during which the Security Lake object remains locked. You
     * can specify the retention period in days for one or more sources.
     * </p>
     * 
     * @return The retention period specifies a fixed period of time during which the Security Lake object remains
     *         locked. You can specify the retention period in days for one or more sources.
     */

    public Integer getRetentionPeriod() {
        return this.retentionPeriod;
    }

    /**
     * <p>
     * The retention period specifies a fixed period of time during which the Security Lake object remains locked. You
     * can specify the retention period in days for one or more sources.
     * </p>
     * 
     * @param retentionPeriod
     *        The retention period specifies a fixed period of time during which the Security Lake object remains
     *        locked. You can specify the retention period in days for one or more sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetentionSetting withRetentionPeriod(Integer retentionPeriod) {
        setRetentionPeriod(retentionPeriod);
        return this;
    }

    /**
     * <p>
     * The range of storage classes that you can choose from based on the data access, resiliency, and cost requirements
     * of your workloads.
     * </p>
     * 
     * @param storageClass
     *        The range of storage classes that you can choose from based on the data access, resiliency, and cost
     *        requirements of your workloads.
     * @see StorageClass
     */

    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * <p>
     * The range of storage classes that you can choose from based on the data access, resiliency, and cost requirements
     * of your workloads.
     * </p>
     * 
     * @return The range of storage classes that you can choose from based on the data access, resiliency, and cost
     *         requirements of your workloads.
     * @see StorageClass
     */

    public String getStorageClass() {
        return this.storageClass;
    }

    /**
     * <p>
     * The range of storage classes that you can choose from based on the data access, resiliency, and cost requirements
     * of your workloads.
     * </p>
     * 
     * @param storageClass
     *        The range of storage classes that you can choose from based on the data access, resiliency, and cost
     *        requirements of your workloads.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageClass
     */

    public RetentionSetting withStorageClass(String storageClass) {
        setStorageClass(storageClass);
        return this;
    }

    /**
     * <p>
     * The range of storage classes that you can choose from based on the data access, resiliency, and cost requirements
     * of your workloads.
     * </p>
     * 
     * @param storageClass
     *        The range of storage classes that you can choose from based on the data access, resiliency, and cost
     *        requirements of your workloads.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageClass
     */

    public RetentionSetting withStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass.toString();
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
        if (getRetentionPeriod() != null)
            sb.append("RetentionPeriod: ").append(getRetentionPeriod()).append(",");
        if (getStorageClass() != null)
            sb.append("StorageClass: ").append(getStorageClass());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetentionSetting == false)
            return false;
        RetentionSetting other = (RetentionSetting) obj;
        if (other.getRetentionPeriod() == null ^ this.getRetentionPeriod() == null)
            return false;
        if (other.getRetentionPeriod() != null && other.getRetentionPeriod().equals(this.getRetentionPeriod()) == false)
            return false;
        if (other.getStorageClass() == null ^ this.getStorageClass() == null)
            return false;
        if (other.getStorageClass() != null && other.getStorageClass().equals(this.getStorageClass()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getStorageClass() == null) ? 0 : getStorageClass().hashCode());
        return hashCode;
    }

    @Override
    public RetentionSetting clone() {
        try {
            return (RetentionSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securitylake.model.transform.RetentionSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
