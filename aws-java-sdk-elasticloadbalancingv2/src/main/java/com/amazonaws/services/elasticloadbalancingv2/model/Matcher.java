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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The codes to use when checking for a successful response from a target. If the protocol version is gRPC, these are
 * gRPC codes. Otherwise, these are HTTP codes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/Matcher" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Matcher implements Serializable, Cloneable {

    /**
     * <p>
     * For Application Load Balancers, you can specify values between 200 and 499, and the default value is 200. You can
     * specify multiple values (for example, "200,202") or a range of values (for example, "200-299").
     * </p>
     * <p>
     * For Network Load Balancers and Gateway Load Balancers, this must be "200–399".
     * </p>
     */
    private String httpCode;
    /**
     * <p>
     * You can specify values between 0 and 99. You can specify multiple values (for example, "0,1") or a range of
     * values (for example, "0-5"). The default value is 12.
     * </p>
     */
    private String grpcCode;

    /**
     * <p>
     * For Application Load Balancers, you can specify values between 200 and 499, and the default value is 200. You can
     * specify multiple values (for example, "200,202") or a range of values (for example, "200-299").
     * </p>
     * <p>
     * For Network Load Balancers and Gateway Load Balancers, this must be "200–399".
     * </p>
     * 
     * @param httpCode
     *        For Application Load Balancers, you can specify values between 200 and 499, and the default value is 200.
     *        You can specify multiple values (for example, "200,202") or a range of values (for example,
     *        "200-299").</p>
     *        <p>
     *        For Network Load Balancers and Gateway Load Balancers, this must be "200–399".
     */

    public void setHttpCode(String httpCode) {
        this.httpCode = httpCode;
    }

    /**
     * <p>
     * For Application Load Balancers, you can specify values between 200 and 499, and the default value is 200. You can
     * specify multiple values (for example, "200,202") or a range of values (for example, "200-299").
     * </p>
     * <p>
     * For Network Load Balancers and Gateway Load Balancers, this must be "200–399".
     * </p>
     * 
     * @return For Application Load Balancers, you can specify values between 200 and 499, and the default value is 200.
     *         You can specify multiple values (for example, "200,202") or a range of values (for example,
     *         "200-299").</p>
     *         <p>
     *         For Network Load Balancers and Gateway Load Balancers, this must be "200–399".
     */

    public String getHttpCode() {
        return this.httpCode;
    }

    /**
     * <p>
     * For Application Load Balancers, you can specify values between 200 and 499, and the default value is 200. You can
     * specify multiple values (for example, "200,202") or a range of values (for example, "200-299").
     * </p>
     * <p>
     * For Network Load Balancers and Gateway Load Balancers, this must be "200–399".
     * </p>
     * 
     * @param httpCode
     *        For Application Load Balancers, you can specify values between 200 and 499, and the default value is 200.
     *        You can specify multiple values (for example, "200,202") or a range of values (for example,
     *        "200-299").</p>
     *        <p>
     *        For Network Load Balancers and Gateway Load Balancers, this must be "200–399".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Matcher withHttpCode(String httpCode) {
        setHttpCode(httpCode);
        return this;
    }

    /**
     * <p>
     * You can specify values between 0 and 99. You can specify multiple values (for example, "0,1") or a range of
     * values (for example, "0-5"). The default value is 12.
     * </p>
     * 
     * @param grpcCode
     *        You can specify values between 0 and 99. You can specify multiple values (for example, "0,1") or a range
     *        of values (for example, "0-5"). The default value is 12.
     */

    public void setGrpcCode(String grpcCode) {
        this.grpcCode = grpcCode;
    }

    /**
     * <p>
     * You can specify values between 0 and 99. You can specify multiple values (for example, "0,1") or a range of
     * values (for example, "0-5"). The default value is 12.
     * </p>
     * 
     * @return You can specify values between 0 and 99. You can specify multiple values (for example, "0,1") or a range
     *         of values (for example, "0-5"). The default value is 12.
     */

    public String getGrpcCode() {
        return this.grpcCode;
    }

    /**
     * <p>
     * You can specify values between 0 and 99. You can specify multiple values (for example, "0,1") or a range of
     * values (for example, "0-5"). The default value is 12.
     * </p>
     * 
     * @param grpcCode
     *        You can specify values between 0 and 99. You can specify multiple values (for example, "0,1") or a range
     *        of values (for example, "0-5"). The default value is 12.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Matcher withGrpcCode(String grpcCode) {
        setGrpcCode(grpcCode);
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
        if (getHttpCode() != null)
            sb.append("HttpCode: ").append(getHttpCode()).append(",");
        if (getGrpcCode() != null)
            sb.append("GrpcCode: ").append(getGrpcCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Matcher == false)
            return false;
        Matcher other = (Matcher) obj;
        if (other.getHttpCode() == null ^ this.getHttpCode() == null)
            return false;
        if (other.getHttpCode() != null && other.getHttpCode().equals(this.getHttpCode()) == false)
            return false;
        if (other.getGrpcCode() == null ^ this.getGrpcCode() == null)
            return false;
        if (other.getGrpcCode() != null && other.getGrpcCode().equals(this.getGrpcCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHttpCode() == null) ? 0 : getHttpCode().hashCode());
        hashCode = prime * hashCode + ((getGrpcCode() == null) ? 0 : getGrpcCode().hashCode());
        return hashCode;
    }

    @Override
    public Matcher clone() {
        try {
            return (Matcher) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
