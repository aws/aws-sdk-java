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
package com.amazonaws.services.billingconductor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/UpdateBillingGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBillingGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the billing group being updated.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the billing group. The names must be unique to each billing group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the billing group. Only one of the valid values can be used.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The preferences and settings that will be used to compute the Amazon Web Services charges for a billing group.
     * </p>
     */
    private ComputationPreference computationPreference;
    /**
     * <p>
     * A description of the billing group.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the billing group being updated.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the billing group being updated.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the billing group being updated.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the billing group being updated.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the billing group being updated.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the billing group being updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBillingGroupRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the billing group. The names must be unique to each billing group.
     * </p>
     * 
     * @param name
     *        The name of the billing group. The names must be unique to each billing group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the billing group. The names must be unique to each billing group.
     * </p>
     * 
     * @return The name of the billing group. The names must be unique to each billing group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the billing group. The names must be unique to each billing group.
     * </p>
     * 
     * @param name
     *        The name of the billing group. The names must be unique to each billing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBillingGroupRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the billing group. Only one of the valid values can be used.
     * </p>
     * 
     * @param status
     *        The status of the billing group. Only one of the valid values can be used.
     * @see BillingGroupStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the billing group. Only one of the valid values can be used.
     * </p>
     * 
     * @return The status of the billing group. Only one of the valid values can be used.
     * @see BillingGroupStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the billing group. Only one of the valid values can be used.
     * </p>
     * 
     * @param status
     *        The status of the billing group. Only one of the valid values can be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingGroupStatus
     */

    public UpdateBillingGroupRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the billing group. Only one of the valid values can be used.
     * </p>
     * 
     * @param status
     *        The status of the billing group. Only one of the valid values can be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingGroupStatus
     */

    public UpdateBillingGroupRequest withStatus(BillingGroupStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The preferences and settings that will be used to compute the Amazon Web Services charges for a billing group.
     * </p>
     * 
     * @param computationPreference
     *        The preferences and settings that will be used to compute the Amazon Web Services charges for a billing
     *        group.
     */

    public void setComputationPreference(ComputationPreference computationPreference) {
        this.computationPreference = computationPreference;
    }

    /**
     * <p>
     * The preferences and settings that will be used to compute the Amazon Web Services charges for a billing group.
     * </p>
     * 
     * @return The preferences and settings that will be used to compute the Amazon Web Services charges for a billing
     *         group.
     */

    public ComputationPreference getComputationPreference() {
        return this.computationPreference;
    }

    /**
     * <p>
     * The preferences and settings that will be used to compute the Amazon Web Services charges for a billing group.
     * </p>
     * 
     * @param computationPreference
     *        The preferences and settings that will be used to compute the Amazon Web Services charges for a billing
     *        group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBillingGroupRequest withComputationPreference(ComputationPreference computationPreference) {
        setComputationPreference(computationPreference);
        return this;
    }

    /**
     * <p>
     * A description of the billing group.
     * </p>
     * 
     * @param description
     *        A description of the billing group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the billing group.
     * </p>
     * 
     * @return A description of the billing group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the billing group.
     * </p>
     * 
     * @param description
     *        A description of the billing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBillingGroupRequest withDescription(String description) {
        setDescription(description);
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
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getComputationPreference() != null)
            sb.append("ComputationPreference: ").append(getComputationPreference()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBillingGroupRequest == false)
            return false;
        UpdateBillingGroupRequest other = (UpdateBillingGroupRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getComputationPreference() == null ^ this.getComputationPreference() == null)
            return false;
        if (other.getComputationPreference() != null && other.getComputationPreference().equals(this.getComputationPreference()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getComputationPreference() == null) ? 0 : getComputationPreference().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBillingGroupRequest clone() {
        return (UpdateBillingGroupRequest) super.clone();
    }

}
