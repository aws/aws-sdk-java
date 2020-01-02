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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes address usage for a customer-owned address pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CoipAddressUsage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoipAddressUsage implements Serializable, Cloneable {

    /**
     * <p>
     * The allocation ID of the address.
     * </p>
     */
    private String allocationId;
    /**
     * <p>
     * The AWS account ID.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The AWS service.
     * </p>
     */
    private String awsService;
    /**
     * <p>
     * The customer-owned IP address.
     * </p>
     */
    private String coIp;

    /**
     * <p>
     * The allocation ID of the address.
     * </p>
     * 
     * @param allocationId
     *        The allocation ID of the address.
     */

    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    /**
     * <p>
     * The allocation ID of the address.
     * </p>
     * 
     * @return The allocation ID of the address.
     */

    public String getAllocationId() {
        return this.allocationId;
    }

    /**
     * <p>
     * The allocation ID of the address.
     * </p>
     * 
     * @param allocationId
     *        The allocation ID of the address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoipAddressUsage withAllocationId(String allocationId) {
        setAllocationId(allocationId);
        return this;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @param awsAccountId
     *        The AWS account ID.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @return The AWS account ID.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The AWS account ID.
     * </p>
     * 
     * @param awsAccountId
     *        The AWS account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoipAddressUsage withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The AWS service.
     * </p>
     * 
     * @param awsService
     *        The AWS service.
     */

    public void setAwsService(String awsService) {
        this.awsService = awsService;
    }

    /**
     * <p>
     * The AWS service.
     * </p>
     * 
     * @return The AWS service.
     */

    public String getAwsService() {
        return this.awsService;
    }

    /**
     * <p>
     * The AWS service.
     * </p>
     * 
     * @param awsService
     *        The AWS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoipAddressUsage withAwsService(String awsService) {
        setAwsService(awsService);
        return this;
    }

    /**
     * <p>
     * The customer-owned IP address.
     * </p>
     * 
     * @param coIp
     *        The customer-owned IP address.
     */

    public void setCoIp(String coIp) {
        this.coIp = coIp;
    }

    /**
     * <p>
     * The customer-owned IP address.
     * </p>
     * 
     * @return The customer-owned IP address.
     */

    public String getCoIp() {
        return this.coIp;
    }

    /**
     * <p>
     * The customer-owned IP address.
     * </p>
     * 
     * @param coIp
     *        The customer-owned IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoipAddressUsage withCoIp(String coIp) {
        setCoIp(coIp);
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
        if (getAllocationId() != null)
            sb.append("AllocationId: ").append(getAllocationId()).append(",");
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getAwsService() != null)
            sb.append("AwsService: ").append(getAwsService()).append(",");
        if (getCoIp() != null)
            sb.append("CoIp: ").append(getCoIp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoipAddressUsage == false)
            return false;
        CoipAddressUsage other = (CoipAddressUsage) obj;
        if (other.getAllocationId() == null ^ this.getAllocationId() == null)
            return false;
        if (other.getAllocationId() != null && other.getAllocationId().equals(this.getAllocationId()) == false)
            return false;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAwsService() == null ^ this.getAwsService() == null)
            return false;
        if (other.getAwsService() != null && other.getAwsService().equals(this.getAwsService()) == false)
            return false;
        if (other.getCoIp() == null ^ this.getCoIp() == null)
            return false;
        if (other.getCoIp() != null && other.getCoIp().equals(this.getCoIp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllocationId() == null) ? 0 : getAllocationId().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getAwsService() == null) ? 0 : getAwsService().hashCode());
        hashCode = prime * hashCode + ((getCoIp() == null) ? 0 : getCoIp().hashCode());
        return hashCode;
    }

    @Override
    public CoipAddressUsage clone() {
        try {
            return (CoipAddressUsage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
