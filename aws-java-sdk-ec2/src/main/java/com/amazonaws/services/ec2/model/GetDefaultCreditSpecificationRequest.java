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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.GetDefaultCreditSpecificationRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDefaultCreditSpecificationRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<GetDefaultCreditSpecificationRequest> {

    /**
     * <p>
     * The instance family.
     * </p>
     */
    private String instanceFamily;

    /**
     * <p>
     * The instance family.
     * </p>
     * 
     * @param instanceFamily
     *        The instance family.
     * @see UnlimitedSupportedInstanceFamily
     */

    public void setInstanceFamily(String instanceFamily) {
        this.instanceFamily = instanceFamily;
    }

    /**
     * <p>
     * The instance family.
     * </p>
     * 
     * @return The instance family.
     * @see UnlimitedSupportedInstanceFamily
     */

    public String getInstanceFamily() {
        return this.instanceFamily;
    }

    /**
     * <p>
     * The instance family.
     * </p>
     * 
     * @param instanceFamily
     *        The instance family.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UnlimitedSupportedInstanceFamily
     */

    public GetDefaultCreditSpecificationRequest withInstanceFamily(String instanceFamily) {
        setInstanceFamily(instanceFamily);
        return this;
    }

    /**
     * <p>
     * The instance family.
     * </p>
     * 
     * @param instanceFamily
     *        The instance family.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UnlimitedSupportedInstanceFamily
     */

    public GetDefaultCreditSpecificationRequest withInstanceFamily(UnlimitedSupportedInstanceFamily instanceFamily) {
        this.instanceFamily = instanceFamily.toString();
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<GetDefaultCreditSpecificationRequest> getDryRunRequest() {
        Request<GetDefaultCreditSpecificationRequest> request = new GetDefaultCreditSpecificationRequestMarshaller().marshall(this);
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
        if (getInstanceFamily() != null)
            sb.append("InstanceFamily: ").append(getInstanceFamily());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDefaultCreditSpecificationRequest == false)
            return false;
        GetDefaultCreditSpecificationRequest other = (GetDefaultCreditSpecificationRequest) obj;
        if (other.getInstanceFamily() == null ^ this.getInstanceFamily() == null)
            return false;
        if (other.getInstanceFamily() != null && other.getInstanceFamily().equals(this.getInstanceFamily()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceFamily() == null) ? 0 : getInstanceFamily().hashCode());
        return hashCode;
    }

    @Override
    public GetDefaultCreditSpecificationRequest clone() {
        return (GetDefaultCreditSpecificationRequest) super.clone();
    }
}
