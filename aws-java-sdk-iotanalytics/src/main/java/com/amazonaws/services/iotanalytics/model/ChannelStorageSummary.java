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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Where channel data is stored.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/ChannelStorageSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelStorageSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Used to store channel data in an S3 bucket managed by the AWS IoT Analytics service.
     * </p>
     */
    private ServiceManagedChannelS3StorageSummary serviceManagedS3;
    /**
     * <p>
     * Used to store channel data in an S3 bucket that you manage.
     * </p>
     */
    private CustomerManagedChannelS3StorageSummary customerManagedS3;

    /**
     * <p>
     * Used to store channel data in an S3 bucket managed by the AWS IoT Analytics service.
     * </p>
     * 
     * @param serviceManagedS3
     *        Used to store channel data in an S3 bucket managed by the AWS IoT Analytics service.
     */

    public void setServiceManagedS3(ServiceManagedChannelS3StorageSummary serviceManagedS3) {
        this.serviceManagedS3 = serviceManagedS3;
    }

    /**
     * <p>
     * Used to store channel data in an S3 bucket managed by the AWS IoT Analytics service.
     * </p>
     * 
     * @return Used to store channel data in an S3 bucket managed by the AWS IoT Analytics service.
     */

    public ServiceManagedChannelS3StorageSummary getServiceManagedS3() {
        return this.serviceManagedS3;
    }

    /**
     * <p>
     * Used to store channel data in an S3 bucket managed by the AWS IoT Analytics service.
     * </p>
     * 
     * @param serviceManagedS3
     *        Used to store channel data in an S3 bucket managed by the AWS IoT Analytics service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelStorageSummary withServiceManagedS3(ServiceManagedChannelS3StorageSummary serviceManagedS3) {
        setServiceManagedS3(serviceManagedS3);
        return this;
    }

    /**
     * <p>
     * Used to store channel data in an S3 bucket that you manage.
     * </p>
     * 
     * @param customerManagedS3
     *        Used to store channel data in an S3 bucket that you manage.
     */

    public void setCustomerManagedS3(CustomerManagedChannelS3StorageSummary customerManagedS3) {
        this.customerManagedS3 = customerManagedS3;
    }

    /**
     * <p>
     * Used to store channel data in an S3 bucket that you manage.
     * </p>
     * 
     * @return Used to store channel data in an S3 bucket that you manage.
     */

    public CustomerManagedChannelS3StorageSummary getCustomerManagedS3() {
        return this.customerManagedS3;
    }

    /**
     * <p>
     * Used to store channel data in an S3 bucket that you manage.
     * </p>
     * 
     * @param customerManagedS3
     *        Used to store channel data in an S3 bucket that you manage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChannelStorageSummary withCustomerManagedS3(CustomerManagedChannelS3StorageSummary customerManagedS3) {
        setCustomerManagedS3(customerManagedS3);
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
        if (getServiceManagedS3() != null)
            sb.append("ServiceManagedS3: ").append(getServiceManagedS3()).append(",");
        if (getCustomerManagedS3() != null)
            sb.append("CustomerManagedS3: ").append(getCustomerManagedS3());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelStorageSummary == false)
            return false;
        ChannelStorageSummary other = (ChannelStorageSummary) obj;
        if (other.getServiceManagedS3() == null ^ this.getServiceManagedS3() == null)
            return false;
        if (other.getServiceManagedS3() != null && other.getServiceManagedS3().equals(this.getServiceManagedS3()) == false)
            return false;
        if (other.getCustomerManagedS3() == null ^ this.getCustomerManagedS3() == null)
            return false;
        if (other.getCustomerManagedS3() != null && other.getCustomerManagedS3().equals(this.getCustomerManagedS3()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceManagedS3() == null) ? 0 : getServiceManagedS3().hashCode());
        hashCode = prime * hashCode + ((getCustomerManagedS3() == null) ? 0 : getCustomerManagedS3().hashCode());
        return hashCode;
    }

    @Override
    public ChannelStorageSummary clone() {
        try {
            return (ChannelStorageSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.ChannelStorageSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
