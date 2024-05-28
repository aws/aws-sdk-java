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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Start import request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/StartImport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartImportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Start import request client token.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Start import request s3 bucket source.
     * </p>
     */
    private S3BucketSource s3BucketSource;

    /**
     * <p>
     * Start import request client token.
     * </p>
     * 
     * @param clientToken
     *        Start import request client token.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Start import request client token.
     * </p>
     * 
     * @return Start import request client token.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Start import request client token.
     * </p>
     * 
     * @param clientToken
     *        Start import request client token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Start import request s3 bucket source.
     * </p>
     * 
     * @param s3BucketSource
     *        Start import request s3 bucket source.
     */

    public void setS3BucketSource(S3BucketSource s3BucketSource) {
        this.s3BucketSource = s3BucketSource;
    }

    /**
     * <p>
     * Start import request s3 bucket source.
     * </p>
     * 
     * @return Start import request s3 bucket source.
     */

    public S3BucketSource getS3BucketSource() {
        return this.s3BucketSource;
    }

    /**
     * <p>
     * Start import request s3 bucket source.
     * </p>
     * 
     * @param s3BucketSource
     *        Start import request s3 bucket source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportRequest withS3BucketSource(S3BucketSource s3BucketSource) {
        setS3BucketSource(s3BucketSource);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getS3BucketSource() != null)
            sb.append("S3BucketSource: ").append(getS3BucketSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartImportRequest == false)
            return false;
        StartImportRequest other = (StartImportRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getS3BucketSource() == null ^ this.getS3BucketSource() == null)
            return false;
        if (other.getS3BucketSource() != null && other.getS3BucketSource().equals(this.getS3BucketSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getS3BucketSource() == null) ? 0 : getS3BucketSource().hashCode());
        return hashCode;
    }

    @Override
    public StartImportRequest clone() {
        return (StartImportRequest) super.clone();
    }

}
