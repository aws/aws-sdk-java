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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.EnableImageDeprecationRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableImageDeprecationRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<EnableImageDeprecationRequest> {

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The date and time to deprecate the AMI, in UTC, in the following format:
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z. If you specify a value for seconds, Amazon EC2
     * rounds the seconds to the nearest minute.
     * </p>
     * <p>
     * You can’t specify a date in the past. The upper limit for <code>DeprecateAt</code> is 10 years from now.
     * </p>
     */
    private java.util.Date deprecateAt;

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     * 
     * @return The ID of the AMI.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableImageDeprecationRequest withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The date and time to deprecate the AMI, in UTC, in the following format:
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z. If you specify a value for seconds, Amazon EC2
     * rounds the seconds to the nearest minute.
     * </p>
     * <p>
     * You can’t specify a date in the past. The upper limit for <code>DeprecateAt</code> is 10 years from now.
     * </p>
     * 
     * @param deprecateAt
     *        The date and time to deprecate the AMI, in UTC, in the following format:
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z. If you specify a value for seconds, Amazon
     *        EC2 rounds the seconds to the nearest minute.</p>
     *        <p>
     *        You can’t specify a date in the past. The upper limit for <code>DeprecateAt</code> is 10 years from now.
     */

    public void setDeprecateAt(java.util.Date deprecateAt) {
        this.deprecateAt = deprecateAt;
    }

    /**
     * <p>
     * The date and time to deprecate the AMI, in UTC, in the following format:
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z. If you specify a value for seconds, Amazon EC2
     * rounds the seconds to the nearest minute.
     * </p>
     * <p>
     * You can’t specify a date in the past. The upper limit for <code>DeprecateAt</code> is 10 years from now.
     * </p>
     * 
     * @return The date and time to deprecate the AMI, in UTC, in the following format:
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z. If you specify a value for seconds,
     *         Amazon EC2 rounds the seconds to the nearest minute.</p>
     *         <p>
     *         You can’t specify a date in the past. The upper limit for <code>DeprecateAt</code> is 10 years from now.
     */

    public java.util.Date getDeprecateAt() {
        return this.deprecateAt;
    }

    /**
     * <p>
     * The date and time to deprecate the AMI, in UTC, in the following format:
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z. If you specify a value for seconds, Amazon EC2
     * rounds the seconds to the nearest minute.
     * </p>
     * <p>
     * You can’t specify a date in the past. The upper limit for <code>DeprecateAt</code> is 10 years from now.
     * </p>
     * 
     * @param deprecateAt
     *        The date and time to deprecate the AMI, in UTC, in the following format:
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z. If you specify a value for seconds, Amazon
     *        EC2 rounds the seconds to the nearest minute.</p>
     *        <p>
     *        You can’t specify a date in the past. The upper limit for <code>DeprecateAt</code> is 10 years from now.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableImageDeprecationRequest withDeprecateAt(java.util.Date deprecateAt) {
        setDeprecateAt(deprecateAt);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<EnableImageDeprecationRequest> getDryRunRequest() {
        Request<EnableImageDeprecationRequest> request = new EnableImageDeprecationRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getDeprecateAt() != null)
            sb.append("DeprecateAt: ").append(getDeprecateAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableImageDeprecationRequest == false)
            return false;
        EnableImageDeprecationRequest other = (EnableImageDeprecationRequest) obj;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getDeprecateAt() == null ^ this.getDeprecateAt() == null)
            return false;
        if (other.getDeprecateAt() != null && other.getDeprecateAt().equals(this.getDeprecateAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getDeprecateAt() == null) ? 0 : getDeprecateAt().hashCode());
        return hashCode;
    }

    @Override
    public EnableImageDeprecationRequest clone() {
        return (EnableImageDeprecationRequest) super.clone();
    }
}
