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
 * Where data store data is stored. You may choose one of "serviceManagedS3" or "customerManagedS3" storage. If not
 * specified, the default is "serviceManagedS3". This cannot be changed after the data store is created.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DatastoreStorage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatastoreStorage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Use this to store data store data in an S3 bucket managed by the AWS IoT Analytics service. The choice of
     * service-managed or customer-managed S3 storage cannot be changed after creation of the data store.
     * </p>
     */
    private ServiceManagedDatastoreS3Storage serviceManagedS3;
    /**
     * <p>
     * Use this to store data store data in an S3 bucket that you manage. When customer managed storage is selected, the
     * "retentionPeriod" parameter is ignored. The choice of service-managed or customer-managed S3 storage cannot be
     * changed after creation of the data store.
     * </p>
     */
    private CustomerManagedDatastoreS3Storage customerManagedS3;

    /**
     * <p>
     * Use this to store data store data in an S3 bucket managed by the AWS IoT Analytics service. The choice of
     * service-managed or customer-managed S3 storage cannot be changed after creation of the data store.
     * </p>
     * 
     * @param serviceManagedS3
     *        Use this to store data store data in an S3 bucket managed by the AWS IoT Analytics service. The choice of
     *        service-managed or customer-managed S3 storage cannot be changed after creation of the data store.
     */

    public void setServiceManagedS3(ServiceManagedDatastoreS3Storage serviceManagedS3) {
        this.serviceManagedS3 = serviceManagedS3;
    }

    /**
     * <p>
     * Use this to store data store data in an S3 bucket managed by the AWS IoT Analytics service. The choice of
     * service-managed or customer-managed S3 storage cannot be changed after creation of the data store.
     * </p>
     * 
     * @return Use this to store data store data in an S3 bucket managed by the AWS IoT Analytics service. The choice of
     *         service-managed or customer-managed S3 storage cannot be changed after creation of the data store.
     */

    public ServiceManagedDatastoreS3Storage getServiceManagedS3() {
        return this.serviceManagedS3;
    }

    /**
     * <p>
     * Use this to store data store data in an S3 bucket managed by the AWS IoT Analytics service. The choice of
     * service-managed or customer-managed S3 storage cannot be changed after creation of the data store.
     * </p>
     * 
     * @param serviceManagedS3
     *        Use this to store data store data in an S3 bucket managed by the AWS IoT Analytics service. The choice of
     *        service-managed or customer-managed S3 storage cannot be changed after creation of the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastoreStorage withServiceManagedS3(ServiceManagedDatastoreS3Storage serviceManagedS3) {
        setServiceManagedS3(serviceManagedS3);
        return this;
    }

    /**
     * <p>
     * Use this to store data store data in an S3 bucket that you manage. When customer managed storage is selected, the
     * "retentionPeriod" parameter is ignored. The choice of service-managed or customer-managed S3 storage cannot be
     * changed after creation of the data store.
     * </p>
     * 
     * @param customerManagedS3
     *        Use this to store data store data in an S3 bucket that you manage. When customer managed storage is
     *        selected, the "retentionPeriod" parameter is ignored. The choice of service-managed or customer-managed S3
     *        storage cannot be changed after creation of the data store.
     */

    public void setCustomerManagedS3(CustomerManagedDatastoreS3Storage customerManagedS3) {
        this.customerManagedS3 = customerManagedS3;
    }

    /**
     * <p>
     * Use this to store data store data in an S3 bucket that you manage. When customer managed storage is selected, the
     * "retentionPeriod" parameter is ignored. The choice of service-managed or customer-managed S3 storage cannot be
     * changed after creation of the data store.
     * </p>
     * 
     * @return Use this to store data store data in an S3 bucket that you manage. When customer managed storage is
     *         selected, the "retentionPeriod" parameter is ignored. The choice of service-managed or customer-managed
     *         S3 storage cannot be changed after creation of the data store.
     */

    public CustomerManagedDatastoreS3Storage getCustomerManagedS3() {
        return this.customerManagedS3;
    }

    /**
     * <p>
     * Use this to store data store data in an S3 bucket that you manage. When customer managed storage is selected, the
     * "retentionPeriod" parameter is ignored. The choice of service-managed or customer-managed S3 storage cannot be
     * changed after creation of the data store.
     * </p>
     * 
     * @param customerManagedS3
     *        Use this to store data store data in an S3 bucket that you manage. When customer managed storage is
     *        selected, the "retentionPeriod" parameter is ignored. The choice of service-managed or customer-managed S3
     *        storage cannot be changed after creation of the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastoreStorage withCustomerManagedS3(CustomerManagedDatastoreS3Storage customerManagedS3) {
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

        if (obj instanceof DatastoreStorage == false)
            return false;
        DatastoreStorage other = (DatastoreStorage) obj;
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
    public DatastoreStorage clone() {
        try {
            return (DatastoreStorage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.DatastoreStorageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
