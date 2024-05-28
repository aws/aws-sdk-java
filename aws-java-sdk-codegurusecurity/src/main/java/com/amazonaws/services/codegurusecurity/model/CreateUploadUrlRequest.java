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
package com.amazonaws.services.codegurusecurity.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/CreateUploadUrl" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUploadUrlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the scan that will use the uploaded resource. CodeGuru Security uses the unique scan name to track
     * revisions across multiple scans of the same resource. Use this <code>scanName</code> when you call
     * <code>CreateScan</code> on the code resource you upload to this URL.
     * </p>
     */
    private String scanName;

    /**
     * <p>
     * The name of the scan that will use the uploaded resource. CodeGuru Security uses the unique scan name to track
     * revisions across multiple scans of the same resource. Use this <code>scanName</code> when you call
     * <code>CreateScan</code> on the code resource you upload to this URL.
     * </p>
     * 
     * @param scanName
     *        The name of the scan that will use the uploaded resource. CodeGuru Security uses the unique scan name to
     *        track revisions across multiple scans of the same resource. Use this <code>scanName</code> when you call
     *        <code>CreateScan</code> on the code resource you upload to this URL.
     */

    public void setScanName(String scanName) {
        this.scanName = scanName;
    }

    /**
     * <p>
     * The name of the scan that will use the uploaded resource. CodeGuru Security uses the unique scan name to track
     * revisions across multiple scans of the same resource. Use this <code>scanName</code> when you call
     * <code>CreateScan</code> on the code resource you upload to this URL.
     * </p>
     * 
     * @return The name of the scan that will use the uploaded resource. CodeGuru Security uses the unique scan name to
     *         track revisions across multiple scans of the same resource. Use this <code>scanName</code> when you call
     *         <code>CreateScan</code> on the code resource you upload to this URL.
     */

    public String getScanName() {
        return this.scanName;
    }

    /**
     * <p>
     * The name of the scan that will use the uploaded resource. CodeGuru Security uses the unique scan name to track
     * revisions across multiple scans of the same resource. Use this <code>scanName</code> when you call
     * <code>CreateScan</code> on the code resource you upload to this URL.
     * </p>
     * 
     * @param scanName
     *        The name of the scan that will use the uploaded resource. CodeGuru Security uses the unique scan name to
     *        track revisions across multiple scans of the same resource. Use this <code>scanName</code> when you call
     *        <code>CreateScan</code> on the code resource you upload to this URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUploadUrlRequest withScanName(String scanName) {
        setScanName(scanName);
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
        if (getScanName() != null)
            sb.append("ScanName: ").append(getScanName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUploadUrlRequest == false)
            return false;
        CreateUploadUrlRequest other = (CreateUploadUrlRequest) obj;
        if (other.getScanName() == null ^ this.getScanName() == null)
            return false;
        if (other.getScanName() != null && other.getScanName().equals(this.getScanName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScanName() == null) ? 0 : getScanName().hashCode());
        return hashCode;
    }

    @Override
    public CreateUploadUrlRequest clone() {
        return (CreateUploadUrlRequest) super.clone();
    }

}
