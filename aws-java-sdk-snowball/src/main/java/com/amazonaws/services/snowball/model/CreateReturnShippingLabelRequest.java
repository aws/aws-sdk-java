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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/CreateReturnShippingLabel" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateReturnShippingLabelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for a job that you want to create the return shipping label for; for example,
     * <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The shipping speed for a particular job. This speed doesn't dictate how soon the device is returned to AWS. This
     * speed represents how quickly it moves to its destination while in transit. Regional shipping speeds are as
     * follows:
     * </p>
     */
    private String shippingOption;

    /**
     * <p>
     * The ID for a job that you want to create the return shipping label for; for example,
     * <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @param jobId
     *        The ID for a job that you want to create the return shipping label for; for example,
     *        <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID for a job that you want to create the return shipping label for; for example,
     * <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @return The ID for a job that you want to create the return shipping label for; for example,
     *         <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The ID for a job that you want to create the return shipping label for; for example,
     * <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @param jobId
     *        The ID for a job that you want to create the return shipping label for; for example,
     *        <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReturnShippingLabelRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The shipping speed for a particular job. This speed doesn't dictate how soon the device is returned to AWS. This
     * speed represents how quickly it moves to its destination while in transit. Regional shipping speeds are as
     * follows:
     * </p>
     * 
     * @param shippingOption
     *        The shipping speed for a particular job. This speed doesn't dictate how soon the device is returned to
     *        AWS. This speed represents how quickly it moves to its destination while in transit. Regional shipping
     *        speeds are as follows:
     * @see ShippingOption
     */

    public void setShippingOption(String shippingOption) {
        this.shippingOption = shippingOption;
    }

    /**
     * <p>
     * The shipping speed for a particular job. This speed doesn't dictate how soon the device is returned to AWS. This
     * speed represents how quickly it moves to its destination while in transit. Regional shipping speeds are as
     * follows:
     * </p>
     * 
     * @return The shipping speed for a particular job. This speed doesn't dictate how soon the device is returned to
     *         AWS. This speed represents how quickly it moves to its destination while in transit. Regional shipping
     *         speeds are as follows:
     * @see ShippingOption
     */

    public String getShippingOption() {
        return this.shippingOption;
    }

    /**
     * <p>
     * The shipping speed for a particular job. This speed doesn't dictate how soon the device is returned to AWS. This
     * speed represents how quickly it moves to its destination while in transit. Regional shipping speeds are as
     * follows:
     * </p>
     * 
     * @param shippingOption
     *        The shipping speed for a particular job. This speed doesn't dictate how soon the device is returned to
     *        AWS. This speed represents how quickly it moves to its destination while in transit. Regional shipping
     *        speeds are as follows:
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShippingOption
     */

    public CreateReturnShippingLabelRequest withShippingOption(String shippingOption) {
        setShippingOption(shippingOption);
        return this;
    }

    /**
     * <p>
     * The shipping speed for a particular job. This speed doesn't dictate how soon the device is returned to AWS. This
     * speed represents how quickly it moves to its destination while in transit. Regional shipping speeds are as
     * follows:
     * </p>
     * 
     * @param shippingOption
     *        The shipping speed for a particular job. This speed doesn't dictate how soon the device is returned to
     *        AWS. This speed represents how quickly it moves to its destination while in transit. Regional shipping
     *        speeds are as follows:
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShippingOption
     */

    public CreateReturnShippingLabelRequest withShippingOption(ShippingOption shippingOption) {
        this.shippingOption = shippingOption.toString();
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getShippingOption() != null)
            sb.append("ShippingOption: ").append(getShippingOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateReturnShippingLabelRequest == false)
            return false;
        CreateReturnShippingLabelRequest other = (CreateReturnShippingLabelRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getShippingOption() == null ^ this.getShippingOption() == null)
            return false;
        if (other.getShippingOption() != null && other.getShippingOption().equals(this.getShippingOption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getShippingOption() == null) ? 0 : getShippingOption().hashCode());
        return hashCode;
    }

    @Override
    public CreateReturnShippingLabelRequest clone() {
        return (CreateReturnShippingLabelRequest) super.clone();
    }

}
