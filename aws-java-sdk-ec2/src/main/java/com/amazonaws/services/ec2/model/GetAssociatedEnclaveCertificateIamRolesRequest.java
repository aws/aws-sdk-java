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
import com.amazonaws.services.ec2.model.transform.GetAssociatedEnclaveCertificateIamRolesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAssociatedEnclaveCertificateIamRolesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<GetAssociatedEnclaveCertificateIamRolesRequest> {

    /**
     * <p>
     * The ARN of the ACM certificate for which to view the associated IAM roles, encryption keys, and Amazon S3 object
     * information.
     * </p>
     */
    private String certificateArn;

    /**
     * <p>
     * The ARN of the ACM certificate for which to view the associated IAM roles, encryption keys, and Amazon S3 object
     * information.
     * </p>
     * 
     * @param certificateArn
     *        The ARN of the ACM certificate for which to view the associated IAM roles, encryption keys, and Amazon S3
     *        object information.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The ARN of the ACM certificate for which to view the associated IAM roles, encryption keys, and Amazon S3 object
     * information.
     * </p>
     * 
     * @return The ARN of the ACM certificate for which to view the associated IAM roles, encryption keys, and Amazon S3
     *         object information.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The ARN of the ACM certificate for which to view the associated IAM roles, encryption keys, and Amazon S3 object
     * information.
     * </p>
     * 
     * @param certificateArn
     *        The ARN of the ACM certificate for which to view the associated IAM roles, encryption keys, and Amazon S3
     *        object information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssociatedEnclaveCertificateIamRolesRequest withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<GetAssociatedEnclaveCertificateIamRolesRequest> getDryRunRequest() {
        Request<GetAssociatedEnclaveCertificateIamRolesRequest> request = new GetAssociatedEnclaveCertificateIamRolesRequestMarshaller().marshall(this);
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
            sb.append("CertificateArn: ").append(getCertificateArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAssociatedEnclaveCertificateIamRolesRequest == false)
            return false;
        GetAssociatedEnclaveCertificateIamRolesRequest other = (GetAssociatedEnclaveCertificateIamRolesRequest) obj;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        return hashCode;
    }

    @Override
    public GetAssociatedEnclaveCertificateIamRolesRequest clone() {
        return (GetAssociatedEnclaveCertificateIamRolesRequest) super.clone();
    }
}
