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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeKeyRegistration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeKeyRegistrationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the customer managed key registration specified in the
     * request.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * A list of <code>RegisteredCustomerManagedKey</code> objects in a Amazon QuickSight account.
     * </p>
     */
    private java.util.List<RegisteredCustomerManagedKey> keyRegistration;
    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private Integer status;

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the customer managed key registration specified in the
     * request.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that contains the customer managed key registration specified in
     *        the request.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the customer managed key registration specified in the
     * request.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that contains the customer managed key registration specified
     *         in the request.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the customer managed key registration specified in the
     * request.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that contains the customer managed key registration specified in
     *        the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyRegistrationResult withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * A list of <code>RegisteredCustomerManagedKey</code> objects in a Amazon QuickSight account.
     * </p>
     * 
     * @return A list of <code>RegisteredCustomerManagedKey</code> objects in a Amazon QuickSight account.
     */

    public java.util.List<RegisteredCustomerManagedKey> getKeyRegistration() {
        return keyRegistration;
    }

    /**
     * <p>
     * A list of <code>RegisteredCustomerManagedKey</code> objects in a Amazon QuickSight account.
     * </p>
     * 
     * @param keyRegistration
     *        A list of <code>RegisteredCustomerManagedKey</code> objects in a Amazon QuickSight account.
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
     * A list of <code>RegisteredCustomerManagedKey</code> objects in a Amazon QuickSight account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeyRegistration(java.util.Collection)} or {@link #withKeyRegistration(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param keyRegistration
     *        A list of <code>RegisteredCustomerManagedKey</code> objects in a Amazon QuickSight account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyRegistrationResult withKeyRegistration(RegisteredCustomerManagedKey... keyRegistration) {
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
     * A list of <code>RegisteredCustomerManagedKey</code> objects in a Amazon QuickSight account.
     * </p>
     * 
     * @param keyRegistration
     *        A list of <code>RegisteredCustomerManagedKey</code> objects in a Amazon QuickSight account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyRegistrationResult withKeyRegistration(java.util.Collection<RegisteredCustomerManagedKey> keyRegistration) {
        setKeyRegistration(keyRegistration);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The Amazon Web Services request ID for this operation.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @return The Amazon Web Services request ID for this operation.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The Amazon Web Services request ID for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyRegistrationResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @return The HTTP status of the request.
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyRegistrationResult withStatus(Integer status) {
        setStatus(status);
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
            sb.append("KeyRegistration: ").append(getKeyRegistration()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeKeyRegistrationResult == false)
            return false;
        DescribeKeyRegistrationResult other = (DescribeKeyRegistrationResult) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getKeyRegistration() == null ^ this.getKeyRegistration() == null)
            return false;
        if (other.getKeyRegistration() != null && other.getKeyRegistration().equals(this.getKeyRegistration()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getKeyRegistration() == null) ? 0 : getKeyRegistration().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DescribeKeyRegistrationResult clone() {
        try {
            return (DescribeKeyRegistrationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
