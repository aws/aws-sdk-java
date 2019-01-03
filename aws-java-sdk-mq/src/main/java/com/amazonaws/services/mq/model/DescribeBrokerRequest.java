/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeBroker" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBrokerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only
     * letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or
     * special characters.
     */
    private String brokerId;

    /**
     * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only
     * letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or
     * special characters.
     * 
     * @param brokerId
     *        The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain
     *        only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard
     *        characters, or special characters.
     */

    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    /**
     * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only
     * letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or
     * special characters.
     * 
     * @return The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain
     *         only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard
     *         characters, or special characters.
     */

    public String getBrokerId() {
        return this.brokerId;
    }

    /**
     * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only
     * letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or
     * special characters.
     * 
     * @param brokerId
     *        The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain
     *        only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard
     *        characters, or special characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBrokerRequest withBrokerId(String brokerId) {
        setBrokerId(brokerId);
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
        if (getBrokerId() != null)
            sb.append("BrokerId: ").append(getBrokerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBrokerRequest == false)
            return false;
        DescribeBrokerRequest other = (DescribeBrokerRequest) obj;
        if (other.getBrokerId() == null ^ this.getBrokerId() == null)
            return false;
        if (other.getBrokerId() != null && other.getBrokerId().equals(this.getBrokerId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBrokerId() == null) ? 0 : getBrokerId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBrokerRequest clone() {
        return (DescribeBrokerRequest) super.clone();
    }

}
