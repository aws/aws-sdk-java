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
package com.amazonaws.services.appfabric.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an app bundle.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/AppBundle" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppBundle implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the app bundle.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Key Management Service (KMS) key used to encrypt the application data.
     * </p>
     */
    private String customerManagedKeyArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the app bundle.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the app bundle.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the app bundle.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the app bundle.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the app bundle.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the app bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppBundle withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Key Management Service (KMS) key used to encrypt the application data.
     * </p>
     * 
     * @param customerManagedKeyArn
     *        The Amazon Resource Name (ARN) of the Key Management Service (KMS) key used to encrypt the application
     *        data.
     */

    public void setCustomerManagedKeyArn(String customerManagedKeyArn) {
        this.customerManagedKeyArn = customerManagedKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Key Management Service (KMS) key used to encrypt the application data.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Key Management Service (KMS) key used to encrypt the application
     *         data.
     */

    public String getCustomerManagedKeyArn() {
        return this.customerManagedKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Key Management Service (KMS) key used to encrypt the application data.
     * </p>
     * 
     * @param customerManagedKeyArn
     *        The Amazon Resource Name (ARN) of the Key Management Service (KMS) key used to encrypt the application
     *        data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppBundle withCustomerManagedKeyArn(String customerManagedKeyArn) {
        setCustomerManagedKeyArn(customerManagedKeyArn);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCustomerManagedKeyArn() != null)
            sb.append("CustomerManagedKeyArn: ").append(getCustomerManagedKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppBundle == false)
            return false;
        AppBundle other = (AppBundle) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCustomerManagedKeyArn() == null ^ this.getCustomerManagedKeyArn() == null)
            return false;
        if (other.getCustomerManagedKeyArn() != null && other.getCustomerManagedKeyArn().equals(this.getCustomerManagedKeyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCustomerManagedKeyArn() == null) ? 0 : getCustomerManagedKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public AppBundle clone() {
        try {
            return (AppBundle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appfabric.model.transform.AppBundleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
