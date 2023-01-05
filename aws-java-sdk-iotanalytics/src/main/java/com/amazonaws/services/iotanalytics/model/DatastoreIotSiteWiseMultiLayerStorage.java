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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Used to store data used by IoT SiteWise in an Amazon S3 bucket that you manage. You can't change the choice of Amazon
 * S3 storage after your data store is created.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DatastoreIotSiteWiseMultiLayerStorage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatastoreIotSiteWiseMultiLayerStorage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Used to store data used by IoT SiteWise in an Amazon S3 bucket that you manage.
     * </p>
     */
    private IotSiteWiseCustomerManagedDatastoreS3Storage customerManagedS3Storage;

    /**
     * <p>
     * Used to store data used by IoT SiteWise in an Amazon S3 bucket that you manage.
     * </p>
     * 
     * @param customerManagedS3Storage
     *        Used to store data used by IoT SiteWise in an Amazon S3 bucket that you manage.
     */

    public void setCustomerManagedS3Storage(IotSiteWiseCustomerManagedDatastoreS3Storage customerManagedS3Storage) {
        this.customerManagedS3Storage = customerManagedS3Storage;
    }

    /**
     * <p>
     * Used to store data used by IoT SiteWise in an Amazon S3 bucket that you manage.
     * </p>
     * 
     * @return Used to store data used by IoT SiteWise in an Amazon S3 bucket that you manage.
     */

    public IotSiteWiseCustomerManagedDatastoreS3Storage getCustomerManagedS3Storage() {
        return this.customerManagedS3Storage;
    }

    /**
     * <p>
     * Used to store data used by IoT SiteWise in an Amazon S3 bucket that you manage.
     * </p>
     * 
     * @param customerManagedS3Storage
     *        Used to store data used by IoT SiteWise in an Amazon S3 bucket that you manage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatastoreIotSiteWiseMultiLayerStorage withCustomerManagedS3Storage(IotSiteWiseCustomerManagedDatastoreS3Storage customerManagedS3Storage) {
        setCustomerManagedS3Storage(customerManagedS3Storage);
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
        if (getCustomerManagedS3Storage() != null)
            sb.append("CustomerManagedS3Storage: ").append(getCustomerManagedS3Storage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatastoreIotSiteWiseMultiLayerStorage == false)
            return false;
        DatastoreIotSiteWiseMultiLayerStorage other = (DatastoreIotSiteWiseMultiLayerStorage) obj;
        if (other.getCustomerManagedS3Storage() == null ^ this.getCustomerManagedS3Storage() == null)
            return false;
        if (other.getCustomerManagedS3Storage() != null && other.getCustomerManagedS3Storage().equals(this.getCustomerManagedS3Storage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomerManagedS3Storage() == null) ? 0 : getCustomerManagedS3Storage().hashCode());
        return hashCode;
    }

    @Override
    public DatastoreIotSiteWiseMultiLayerStorage clone() {
        try {
            return (DatastoreIotSiteWiseMultiLayerStorage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.DatastoreIotSiteWiseMultiLayerStorageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
