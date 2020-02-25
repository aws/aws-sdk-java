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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeCopyJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCopyJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Uniquely identifies a request to AWS Backup to copy a resource.
     * </p>
     */
    private String copyJobId;

    /**
     * <p>
     * Uniquely identifies a request to AWS Backup to copy a resource.
     * </p>
     * 
     * @param copyJobId
     *        Uniquely identifies a request to AWS Backup to copy a resource.
     */

    public void setCopyJobId(String copyJobId) {
        this.copyJobId = copyJobId;
    }

    /**
     * <p>
     * Uniquely identifies a request to AWS Backup to copy a resource.
     * </p>
     * 
     * @return Uniquely identifies a request to AWS Backup to copy a resource.
     */

    public String getCopyJobId() {
        return this.copyJobId;
    }

    /**
     * <p>
     * Uniquely identifies a request to AWS Backup to copy a resource.
     * </p>
     * 
     * @param copyJobId
     *        Uniquely identifies a request to AWS Backup to copy a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCopyJobRequest withCopyJobId(String copyJobId) {
        setCopyJobId(copyJobId);
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
        if (getCopyJobId() != null)
            sb.append("CopyJobId: ").append(getCopyJobId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCopyJobRequest == false)
            return false;
        DescribeCopyJobRequest other = (DescribeCopyJobRequest) obj;
        if (other.getCopyJobId() == null ^ this.getCopyJobId() == null)
            return false;
        if (other.getCopyJobId() != null && other.getCopyJobId().equals(this.getCopyJobId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCopyJobId() == null) ? 0 : getCopyJobId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCopyJobRequest clone() {
        return (DescribeCopyJobRequest) super.clone();
    }

}
