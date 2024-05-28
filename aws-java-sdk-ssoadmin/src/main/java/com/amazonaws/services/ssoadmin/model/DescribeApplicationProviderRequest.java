/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeApplicationProvider"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeApplicationProviderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the ARN of the application provider for which you want details.
     * </p>
     */
    private String applicationProviderArn;

    /**
     * <p>
     * Specifies the ARN of the application provider for which you want details.
     * </p>
     * 
     * @param applicationProviderArn
     *        Specifies the ARN of the application provider for which you want details.
     */

    public void setApplicationProviderArn(String applicationProviderArn) {
        this.applicationProviderArn = applicationProviderArn;
    }

    /**
     * <p>
     * Specifies the ARN of the application provider for which you want details.
     * </p>
     * 
     * @return Specifies the ARN of the application provider for which you want details.
     */

    public String getApplicationProviderArn() {
        return this.applicationProviderArn;
    }

    /**
     * <p>
     * Specifies the ARN of the application provider for which you want details.
     * </p>
     * 
     * @param applicationProviderArn
     *        Specifies the ARN of the application provider for which you want details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationProviderRequest withApplicationProviderArn(String applicationProviderArn) {
        setApplicationProviderArn(applicationProviderArn);
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
        if (getApplicationProviderArn() != null)
            sb.append("ApplicationProviderArn: ").append(getApplicationProviderArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeApplicationProviderRequest == false)
            return false;
        DescribeApplicationProviderRequest other = (DescribeApplicationProviderRequest) obj;
        if (other.getApplicationProviderArn() == null ^ this.getApplicationProviderArn() == null)
            return false;
        if (other.getApplicationProviderArn() != null && other.getApplicationProviderArn().equals(this.getApplicationProviderArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationProviderArn() == null) ? 0 : getApplicationProviderArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeApplicationProviderRequest clone() {
        return (DescribeApplicationProviderRequest) super.clone();
    }

}
