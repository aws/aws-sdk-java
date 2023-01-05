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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DeleteMultiRegionAccessPoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteMultiRegionAccessPointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.s3control.S3ControlResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * The request token associated with the request. You can use this token with <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeMultiRegionAccessPointOperation.html"
     * >DescribeMultiRegionAccessPointOperation</a> to determine the status of asynchronous requests.
     * </p>
     */
    private String requestTokenARN;

    /**
     * <p>
     * The request token associated with the request. You can use this token with <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeMultiRegionAccessPointOperation.html"
     * >DescribeMultiRegionAccessPointOperation</a> to determine the status of asynchronous requests.
     * </p>
     * 
     * @param requestTokenARN
     *        The request token associated with the request. You can use this token with <a href=
     *        "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeMultiRegionAccessPointOperation.html"
     *        >DescribeMultiRegionAccessPointOperation</a> to determine the status of asynchronous requests.
     */

    public void setRequestTokenARN(String requestTokenARN) {
        this.requestTokenARN = requestTokenARN;
    }

    /**
     * <p>
     * The request token associated with the request. You can use this token with <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeMultiRegionAccessPointOperation.html"
     * >DescribeMultiRegionAccessPointOperation</a> to determine the status of asynchronous requests.
     * </p>
     * 
     * @return The request token associated with the request. You can use this token with <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeMultiRegionAccessPointOperation.html"
     *         >DescribeMultiRegionAccessPointOperation</a> to determine the status of asynchronous requests.
     */

    public String getRequestTokenARN() {
        return this.requestTokenARN;
    }

    /**
     * <p>
     * The request token associated with the request. You can use this token with <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeMultiRegionAccessPointOperation.html"
     * >DescribeMultiRegionAccessPointOperation</a> to determine the status of asynchronous requests.
     * </p>
     * 
     * @param requestTokenARN
     *        The request token associated with the request. You can use this token with <a href=
     *        "https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DescribeMultiRegionAccessPointOperation.html"
     *        >DescribeMultiRegionAccessPointOperation</a> to determine the status of asynchronous requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteMultiRegionAccessPointResult withRequestTokenARN(String requestTokenARN) {
        setRequestTokenARN(requestTokenARN);
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
        if (getRequestTokenARN() != null)
            sb.append("RequestTokenARN: ").append(getRequestTokenARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteMultiRegionAccessPointResult == false)
            return false;
        DeleteMultiRegionAccessPointResult other = (DeleteMultiRegionAccessPointResult) obj;
        if (other.getRequestTokenARN() == null ^ this.getRequestTokenARN() == null)
            return false;
        if (other.getRequestTokenARN() != null && other.getRequestTokenARN().equals(this.getRequestTokenARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestTokenARN() == null) ? 0 : getRequestTokenARN().hashCode());
        return hashCode;
    }

    @Override
    public DeleteMultiRegionAccessPointResult clone() {
        try {
            return (DeleteMultiRegionAccessPointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
