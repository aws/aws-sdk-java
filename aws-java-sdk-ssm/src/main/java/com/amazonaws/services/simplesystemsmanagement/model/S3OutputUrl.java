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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A URL for the Amazon S3 bucket where you want to store the results of this request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/S3OutputUrl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3OutputUrl implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A URL for an Amazon S3 bucket where you want to store the results of this request.
     * </p>
     */
    private String outputUrl;

    /**
     * <p>
     * A URL for an Amazon S3 bucket where you want to store the results of this request.
     * </p>
     * 
     * @param outputUrl
     *        A URL for an Amazon S3 bucket where you want to store the results of this request.
     */

    public void setOutputUrl(String outputUrl) {
        this.outputUrl = outputUrl;
    }

    /**
     * <p>
     * A URL for an Amazon S3 bucket where you want to store the results of this request.
     * </p>
     * 
     * @return A URL for an Amazon S3 bucket where you want to store the results of this request.
     */

    public String getOutputUrl() {
        return this.outputUrl;
    }

    /**
     * <p>
     * A URL for an Amazon S3 bucket where you want to store the results of this request.
     * </p>
     * 
     * @param outputUrl
     *        A URL for an Amazon S3 bucket where you want to store the results of this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3OutputUrl withOutputUrl(String outputUrl) {
        setOutputUrl(outputUrl);
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
        if (getOutputUrl() != null)
            sb.append("OutputUrl: ").append(getOutputUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3OutputUrl == false)
            return false;
        S3OutputUrl other = (S3OutputUrl) obj;
        if (other.getOutputUrl() == null ^ this.getOutputUrl() == null)
            return false;
        if (other.getOutputUrl() != null && other.getOutputUrl().equals(this.getOutputUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutputUrl() == null) ? 0 : getOutputUrl().hashCode());
        return hashCode;
    }

    @Override
    public S3OutputUrl clone() {
        try {
            return (S3OutputUrl) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.S3OutputUrlMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
