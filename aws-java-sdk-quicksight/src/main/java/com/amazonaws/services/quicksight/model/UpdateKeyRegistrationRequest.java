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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateKeyRegistration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateKeyRegistrationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the customer managed key registration that you want to
     * update.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * A list of <code>RegisteredCustomerManagedKey</code> objects to be updated to the Amazon QuickSight account.
     * </p>
     */
    private java.util.List<RegisteredCustomerManagedKey> keyRegistration;

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the customer managed key registration that you want to
     * update.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that contains the customer managed key registration that you
     *        want to update.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the customer managed key registration that you want to
     * update.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that contains the customer managed key registration that you
     *         want to update.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the customer managed key registration that you want to
     * update.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that contains the customer managed key registration that you
     *        want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKeyRegistrationRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * A list of <code>RegisteredCustomerManagedKey</code> objects to be updated to the Amazon QuickSight account.
     * </p>
     * 
     * @return A list of <code>RegisteredCustomerManagedKey</code> objects to be updated to the Amazon QuickSight
     *         account.
     */

    public java.util.List<RegisteredCustomerManagedKey> getKeyRegistration() {
        return keyRegistration;
    }

    /**
     * <p>
     * A list of <code>RegisteredCustomerManagedKey</code> objects to be updated to the Amazon QuickSight account.
     * </p>
     * 
     * @param keyRegistration
     *        A list of <code>RegisteredCustomerManagedKey</code> objects to be updated to the Amazon QuickSight
     *        account.
     */

    public void setKeyRegistration(java.util.Collection<RegisteredCustomerManagedKey> keyRegistration) {
        if (keyRegistration == null) {
            this.keyRegistration = null;
            return;
        }

        this.keyRegistration = new java.util.ArrayList<RegisteredCustomerManagedKey>(keyRegistration);
    }

    /**
     * <p>
     * A list of <code>RegisteredCustomerManagedKey</code> objects to be updated to the Amazon QuickSight account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeyRegistration(java.util.Collection)} or {@link #withKeyRegistration(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param keyRegistration
     *        A list of <code>RegisteredCustomerManagedKey</code> objects to be updated to the Amazon QuickSight
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKeyRegistrationRequest withKeyRegistration(RegisteredCustomerManagedKey... keyRegistration) {
        if (this.keyRegistration == null) {
            setKeyRegistration(new java.util.ArrayList<RegisteredCustomerManagedKey>(keyRegistration.length));
        }
        for (RegisteredCustomerManagedKey ele : keyRegistration) {
            this.keyRegistration.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>RegisteredCustomerManagedKey</code> objects to be updated to the Amazon QuickSight account.
     * </p>
     * 
     * @param keyRegistration
     *        A list of <code>RegisteredCustomerManagedKey</code> objects to be updated to the Amazon QuickSight
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKeyRegistrationRequest withKeyRegistration(java.util.Collection<RegisteredCustomerManagedKey> keyRegistration) {
        setKeyRegistration(keyRegistration);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getKeyRegistration() != null)
            sb.append("KeyRegistration: ").append(getKeyRegistration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateKeyRegistrationRequest == false)
            return false;
        UpdateKeyRegistrationRequest other = (UpdateKeyRegistrationRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getKeyRegistration() == null ^ this.getKeyRegistration() == null)
            return false;
        if (other.getKeyRegistration() != null && other.getKeyRegistration().equals(this.getKeyRegistration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getKeyRegistration() == null) ? 0 : getKeyRegistration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateKeyRegistrationRequest clone() {
        return (UpdateKeyRegistrationRequest) super.clone();
    }

}
