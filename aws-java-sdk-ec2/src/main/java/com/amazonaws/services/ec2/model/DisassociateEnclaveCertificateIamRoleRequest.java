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
import com.amazonaws.services.ec2.model.transform.DisassociateEnclaveCertificateIamRoleRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateEnclaveCertificateIamRoleRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DisassociateEnclaveCertificateIamRoleRequest> {

    /**
     * <p>
     * The ARN of the ACM certificate from which to disassociate the IAM role.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * The ARN of the IAM role to disassociate.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The ARN of the ACM certificate from which to disassociate the IAM role.
     * </p>
     * 
     * @param certificateArn
     *        The ARN of the ACM certificate from which to disassociate the IAM role.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The ARN of the ACM certificate from which to disassociate the IAM role.
     * </p>
     * 
     * @return The ARN of the ACM certificate from which to disassociate the IAM role.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The ARN of the ACM certificate from which to disassociate the IAM role.
     * </p>
     * 
     * @param certificateArn
     *        The ARN of the ACM certificate from which to disassociate the IAM role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateEnclaveCertificateIamRoleRequest withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role to disassociate.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role to disassociate.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role to disassociate.
     * </p>
     * 
     * @return The ARN of the IAM role to disassociate.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role to disassociate.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role to disassociate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateEnclaveCertificateIamRoleRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DisassociateEnclaveCertificateIamRoleRequest> getDryRunRequest() {
        Request<DisassociateEnclaveCertificateIamRoleRequest> request = new DisassociateEnclaveCertificateIamRoleRequestMarshaller().marshall(this);
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
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateEnclaveCertificateIamRoleRequest == false)
            return false;
        DisassociateEnclaveCertificateIamRoleRequest other = (DisassociateEnclaveCertificateIamRoleRequest) obj;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateEnclaveCertificateIamRoleRequest clone() {
        return (DisassociateEnclaveCertificateIamRoleRequest) super.clone();
    }
}
