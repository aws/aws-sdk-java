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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeKeyRegistration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeKeyRegistrationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the customer managed key registration that you want to
     * describe.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * Determines whether the request returns the default key only.
     * </p>
     */
    private Boolean defaultKeyOnly;

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the customer managed key registration that you want to
     * describe.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that contains the customer managed key registration that you
     *        want to describe.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the customer managed key registration that you want to
     * describe.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that contains the customer managed key registration that you
     *         want to describe.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the customer managed key registration that you want to
     * describe.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that contains the customer managed key registration that you
     *        want to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyRegistrationRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * Determines whether the request returns the default key only.
     * </p>
     * 
     * @param defaultKeyOnly
     *        Determines whether the request returns the default key only.
     */

    public void setDefaultKeyOnly(Boolean defaultKeyOnly) {
        this.defaultKeyOnly = defaultKeyOnly;
    }

    /**
     * <p>
     * Determines whether the request returns the default key only.
     * </p>
     * 
     * @return Determines whether the request returns the default key only.
     */

    public Boolean getDefaultKeyOnly() {
        return this.defaultKeyOnly;
    }

    /**
     * <p>
     * Determines whether the request returns the default key only.
     * </p>
     * 
     * @param defaultKeyOnly
     *        Determines whether the request returns the default key only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyRegistrationRequest withDefaultKeyOnly(Boolean defaultKeyOnly) {
        setDefaultKeyOnly(defaultKeyOnly);
        return this;
    }

    /**
     * <p>
     * Determines whether the request returns the default key only.
     * </p>
     * 
     * @return Determines whether the request returns the default key only.
     */

    public Boolean isDefaultKeyOnly() {
        return this.defaultKeyOnly;
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
        if (getDefaultKeyOnly() != null)
            sb.append("DefaultKeyOnly: ").append(getDefaultKeyOnly());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeKeyRegistrationRequest == false)
            return false;
        DescribeKeyRegistrationRequest other = (DescribeKeyRegistrationRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getDefaultKeyOnly() == null ^ this.getDefaultKeyOnly() == null)
            return false;
        if (other.getDefaultKeyOnly() != null && other.getDefaultKeyOnly().equals(this.getDefaultKeyOnly()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getDefaultKeyOnly() == null) ? 0 : getDefaultKeyOnly().hashCode());
        return hashCode;
    }

    @Override
    public DescribeKeyRegistrationRequest clone() {
        return (DescribeKeyRegistrationRequest) super.clone();
    }

}
