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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartImportTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Optional. A unique token that you can provide to prevent the same import request from occurring more than once.
     * If you don't provide a token, a token is automatically generated.
     * </p>
     * <p>
     * Sending more than one <code>StartImportTask</code> request with the same client request token will return
     * information about the original import task with that client request token.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * A descriptive name for this request. You can use this name to filter future requests related to this import task,
     * such as identifying applications and servers that were included in this import task. We recommend that you use a
     * meaningful name for each import task.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The URL for your import file that you've uploaded to Amazon S3.
     * </p>
     * <note>
     * <p>
     * If you're using the AWS CLI, this URL is structured as follows: <code>s3://BucketName/ImportFileName.CSV</code>
     * </p>
     * </note>
     */
    private String importUrl;

    /**
     * <p>
     * Optional. A unique token that you can provide to prevent the same import request from occurring more than once.
     * If you don't provide a token, a token is automatically generated.
     * </p>
     * <p>
     * Sending more than one <code>StartImportTask</code> request with the same client request token will return
     * information about the original import task with that client request token.
     * </p>
     * 
     * @param clientRequestToken
     *        Optional. A unique token that you can provide to prevent the same import request from occurring more than
     *        once. If you don't provide a token, a token is automatically generated.</p>
     *        <p>
     *        Sending more than one <code>StartImportTask</code> request with the same client request token will return
     *        information about the original import task with that client request token.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Optional. A unique token that you can provide to prevent the same import request from occurring more than once.
     * If you don't provide a token, a token is automatically generated.
     * </p>
     * <p>
     * Sending more than one <code>StartImportTask</code> request with the same client request token will return
     * information about the original import task with that client request token.
     * </p>
     * 
     * @return Optional. A unique token that you can provide to prevent the same import request from occurring more than
     *         once. If you don't provide a token, a token is automatically generated.</p>
     *         <p>
     *         Sending more than one <code>StartImportTask</code> request with the same client request token will return
     *         information about the original import task with that client request token.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Optional. A unique token that you can provide to prevent the same import request from occurring more than once.
     * If you don't provide a token, a token is automatically generated.
     * </p>
     * <p>
     * Sending more than one <code>StartImportTask</code> request with the same client request token will return
     * information about the original import task with that client request token.
     * </p>
     * 
     * @param clientRequestToken
     *        Optional. A unique token that you can provide to prevent the same import request from occurring more than
     *        once. If you don't provide a token, a token is automatically generated.</p>
     *        <p>
     *        Sending more than one <code>StartImportTask</code> request with the same client request token will return
     *        information about the original import task with that client request token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportTaskRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * A descriptive name for this request. You can use this name to filter future requests related to this import task,
     * such as identifying applications and servers that were included in this import task. We recommend that you use a
     * meaningful name for each import task.
     * </p>
     * 
     * @param name
     *        A descriptive name for this request. You can use this name to filter future requests related to this
     *        import task, such as identifying applications and servers that were included in this import task. We
     *        recommend that you use a meaningful name for each import task.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A descriptive name for this request. You can use this name to filter future requests related to this import task,
     * such as identifying applications and servers that were included in this import task. We recommend that you use a
     * meaningful name for each import task.
     * </p>
     * 
     * @return A descriptive name for this request. You can use this name to filter future requests related to this
     *         import task, such as identifying applications and servers that were included in this import task. We
     *         recommend that you use a meaningful name for each import task.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A descriptive name for this request. You can use this name to filter future requests related to this import task,
     * such as identifying applications and servers that were included in this import task. We recommend that you use a
     * meaningful name for each import task.
     * </p>
     * 
     * @param name
     *        A descriptive name for this request. You can use this name to filter future requests related to this
     *        import task, such as identifying applications and servers that were included in this import task. We
     *        recommend that you use a meaningful name for each import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportTaskRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The URL for your import file that you've uploaded to Amazon S3.
     * </p>
     * <note>
     * <p>
     * If you're using the AWS CLI, this URL is structured as follows: <code>s3://BucketName/ImportFileName.CSV</code>
     * </p>
     * </note>
     * 
     * @param importUrl
     *        The URL for your import file that you've uploaded to Amazon S3.</p> <note>
     *        <p>
     *        If you're using the AWS CLI, this URL is structured as follows:
     *        <code>s3://BucketName/ImportFileName.CSV</code>
     *        </p>
     */

    public void setImportUrl(String importUrl) {
        this.importUrl = importUrl;
    }

    /**
     * <p>
     * The URL for your import file that you've uploaded to Amazon S3.
     * </p>
     * <note>
     * <p>
     * If you're using the AWS CLI, this URL is structured as follows: <code>s3://BucketName/ImportFileName.CSV</code>
     * </p>
     * </note>
     * 
     * @return The URL for your import file that you've uploaded to Amazon S3.</p> <note>
     *         <p>
     *         If you're using the AWS CLI, this URL is structured as follows:
     *         <code>s3://BucketName/ImportFileName.CSV</code>
     *         </p>
     */

    public String getImportUrl() {
        return this.importUrl;
    }

    /**
     * <p>
     * The URL for your import file that you've uploaded to Amazon S3.
     * </p>
     * <note>
     * <p>
     * If you're using the AWS CLI, this URL is structured as follows: <code>s3://BucketName/ImportFileName.CSV</code>
     * </p>
     * </note>
     * 
     * @param importUrl
     *        The URL for your import file that you've uploaded to Amazon S3.</p> <note>
     *        <p>
     *        If you're using the AWS CLI, this URL is structured as follows:
     *        <code>s3://BucketName/ImportFileName.CSV</code>
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportTaskRequest withImportUrl(String importUrl) {
        setImportUrl(importUrl);
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getImportUrl() != null)
            sb.append("ImportUrl: ").append(getImportUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartImportTaskRequest == false)
            return false;
        StartImportTaskRequest other = (StartImportTaskRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getImportUrl() == null ^ this.getImportUrl() == null)
            return false;
        if (other.getImportUrl() != null && other.getImportUrl().equals(this.getImportUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getImportUrl() == null) ? 0 : getImportUrl().hashCode());
        return hashCode;
    }

    @Override
    public StartImportTaskRequest clone() {
        return (StartImportTaskRequest) super.clone();
    }

}
