/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the storage destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/MultiLayerStorage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MultiLayerStorage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains information about a customer managed Amazon S3 bucket.
     * </p>
     */
    private CustomerManagedS3Storage customerManagedS3Storage;

    /**
     * <p>
     * Contains information about a customer managed Amazon S3 bucket.
     * </p>
     * 
     * @param customerManagedS3Storage
     *        Contains information about a customer managed Amazon S3 bucket.
     */

    public void setCustomerManagedS3Storage(CustomerManagedS3Storage customerManagedS3Storage) {
        this.customerManagedS3Storage = customerManagedS3Storage;
    }

    /**
     * <p>
     * Contains information about a customer managed Amazon S3 bucket.
     * </p>
     * 
     * @return Contains information about a customer managed Amazon S3 bucket.
     */

    public CustomerManagedS3Storage getCustomerManagedS3Storage() {
        return this.customerManagedS3Storage;
    }

    /**
     * <p>
     * Contains information about a customer managed Amazon S3 bucket.
     * </p>
     * 
     * @param customerManagedS3Storage
     *        Contains information about a customer managed Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiLayerStorage withCustomerManagedS3Storage(CustomerManagedS3Storage customerManagedS3Storage) {
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

        if (obj instanceof MultiLayerStorage == false)
            return false;
        MultiLayerStorage other = (MultiLayerStorage) obj;
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
    public MultiLayerStorage clone() {
        try {
            return (MultiLayerStorage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.MultiLayerStorageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
