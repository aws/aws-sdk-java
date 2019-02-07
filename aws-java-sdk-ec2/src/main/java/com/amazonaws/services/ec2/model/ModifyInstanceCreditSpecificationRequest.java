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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyInstanceCreditSpecificationRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyInstanceCreditSpecificationRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyInstanceCreditSpecificationRequest> {

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Information about the credit option for CPU usage.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceCreditSpecificationRequest> instanceCreditSpecifications;

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @return A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceCreditSpecificationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Information about the credit option for CPU usage.
     * </p>
     * 
     * @return Information about the credit option for CPU usage.
     */

    public java.util.List<InstanceCreditSpecificationRequest> getInstanceCreditSpecifications() {
        if (instanceCreditSpecifications == null) {
            instanceCreditSpecifications = new com.amazonaws.internal.SdkInternalList<InstanceCreditSpecificationRequest>();
        }
        return instanceCreditSpecifications;
    }

    /**
     * <p>
     * Information about the credit option for CPU usage.
     * </p>
     * 
     * @param instanceCreditSpecifications
     *        Information about the credit option for CPU usage.
     */

    public void setInstanceCreditSpecifications(java.util.Collection<InstanceCreditSpecificationRequest> instanceCreditSpecifications) {
        if (instanceCreditSpecifications == null) {
            this.instanceCreditSpecifications = null;
            return;
        }

        this.instanceCreditSpecifications = new com.amazonaws.internal.SdkInternalList<InstanceCreditSpecificationRequest>(instanceCreditSpecifications);
    }

    /**
     * <p>
     * Information about the credit option for CPU usage.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceCreditSpecifications(java.util.Collection)} or
     * {@link #withInstanceCreditSpecifications(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param instanceCreditSpecifications
     *        Information about the credit option for CPU usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceCreditSpecificationRequest withInstanceCreditSpecifications(InstanceCreditSpecificationRequest... instanceCreditSpecifications) {
        if (this.instanceCreditSpecifications == null) {
            setInstanceCreditSpecifications(new com.amazonaws.internal.SdkInternalList<InstanceCreditSpecificationRequest>(instanceCreditSpecifications.length));
        }
        for (InstanceCreditSpecificationRequest ele : instanceCreditSpecifications) {
            this.instanceCreditSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the credit option for CPU usage.
     * </p>
     * 
     * @param instanceCreditSpecifications
     *        Information about the credit option for CPU usage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceCreditSpecificationRequest withInstanceCreditSpecifications(
            java.util.Collection<InstanceCreditSpecificationRequest> instanceCreditSpecifications) {
        setInstanceCreditSpecifications(instanceCreditSpecifications);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyInstanceCreditSpecificationRequest> getDryRunRequest() {
        Request<ModifyInstanceCreditSpecificationRequest> request = new ModifyInstanceCreditSpecificationRequestMarshaller().marshall(this);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getInstanceCreditSpecifications() != null)
            sb.append("InstanceCreditSpecifications: ").append(getInstanceCreditSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyInstanceCreditSpecificationRequest == false)
            return false;
        ModifyInstanceCreditSpecificationRequest other = (ModifyInstanceCreditSpecificationRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getInstanceCreditSpecifications() == null ^ this.getInstanceCreditSpecifications() == null)
            return false;
        if (other.getInstanceCreditSpecifications() != null && other.getInstanceCreditSpecifications().equals(this.getInstanceCreditSpecifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getInstanceCreditSpecifications() == null) ? 0 : getInstanceCreditSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public ModifyInstanceCreditSpecificationRequest clone() {
        return (ModifyInstanceCreditSpecificationRequest) super.clone();
    }
}
