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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/AssociateCertificate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ARN of the ACM certificate that you want to associate with your MediaConvert resource. */
    private String arn;

    /**
     * The ARN of the ACM certificate that you want to associate with your MediaConvert resource.
     * 
     * @param arn
     *        The ARN of the ACM certificate that you want to associate with your MediaConvert resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The ARN of the ACM certificate that you want to associate with your MediaConvert resource.
     * 
     * @return The ARN of the ACM certificate that you want to associate with your MediaConvert resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * The ARN of the ACM certificate that you want to associate with your MediaConvert resource.
     * 
     * @param arn
     *        The ARN of the ACM certificate that you want to associate with your MediaConvert resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateCertificateRequest withArn(String arn) {
        setArn(arn);
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
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateCertificateRequest == false)
            return false;
        AssociateCertificateRequest other = (AssociateCertificateRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public AssociateCertificateRequest clone() {
        return (AssociateCertificateRequest) super.clone();
    }

}
