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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * This configuration determines which HTTP requests are sent to the staging distribution. If the HTTP request contains
 * a header and value that matches what you specify here, the request is sent to the staging distribution. Otherwise the
 * request is sent to the primary distribution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ContinuousDeploymentSingleHeaderConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContinuousDeploymentSingleHeaderConfig implements Serializable, Cloneable {

    /**
     * <p>
     * The request header name that you want CloudFront to send to your staging distribution. The header must contain
     * the prefix <code>aws-cf-cd-</code>.
     * </p>
     */
    private String header;
    /**
     * <p>
     * The request header value.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The request header name that you want CloudFront to send to your staging distribution. The header must contain
     * the prefix <code>aws-cf-cd-</code>.
     * </p>
     * 
     * @param header
     *        The request header name that you want CloudFront to send to your staging distribution. The header must
     *        contain the prefix <code>aws-cf-cd-</code>.
     */

    public void setHeader(String header) {
        this.header = header;
    }

    /**
     * <p>
     * The request header name that you want CloudFront to send to your staging distribution. The header must contain
     * the prefix <code>aws-cf-cd-</code>.
     * </p>
     * 
     * @return The request header name that you want CloudFront to send to your staging distribution. The header must
     *         contain the prefix <code>aws-cf-cd-</code>.
     */

    public String getHeader() {
        return this.header;
    }

    /**
     * <p>
     * The request header name that you want CloudFront to send to your staging distribution. The header must contain
     * the prefix <code>aws-cf-cd-</code>.
     * </p>
     * 
     * @param header
     *        The request header name that you want CloudFront to send to your staging distribution. The header must
     *        contain the prefix <code>aws-cf-cd-</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinuousDeploymentSingleHeaderConfig withHeader(String header) {
        setHeader(header);
        return this;
    }

    /**
     * <p>
     * The request header value.
     * </p>
     * 
     * @param value
     *        The request header value.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The request header value.
     * </p>
     * 
     * @return The request header value.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The request header value.
     * </p>
     * 
     * @param value
     *        The request header value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinuousDeploymentSingleHeaderConfig withValue(String value) {
        setValue(value);
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
        if (getHeader() != null)
            sb.append("Header: ").append(getHeader()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContinuousDeploymentSingleHeaderConfig == false)
            return false;
        ContinuousDeploymentSingleHeaderConfig other = (ContinuousDeploymentSingleHeaderConfig) obj;
        if (other.getHeader() == null ^ this.getHeader() == null)
            return false;
        if (other.getHeader() != null && other.getHeader().equals(this.getHeader()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeader() == null) ? 0 : getHeader().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public ContinuousDeploymentSingleHeaderConfig clone() {
        try {
            return (ContinuousDeploymentSingleHeaderConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
