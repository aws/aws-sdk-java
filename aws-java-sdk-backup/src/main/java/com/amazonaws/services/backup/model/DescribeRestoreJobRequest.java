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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeRestoreJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRestoreJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Uniquely identifies the job that restores a recovery point.
     * </p>
     */
    private String restoreJobId;

    /**
     * <p>
     * Uniquely identifies the job that restores a recovery point.
     * </p>
     * 
     * @param restoreJobId
     *        Uniquely identifies the job that restores a recovery point.
     */

    public void setRestoreJobId(String restoreJobId) {
        this.restoreJobId = restoreJobId;
    }

    /**
     * <p>
     * Uniquely identifies the job that restores a recovery point.
     * </p>
     * 
     * @return Uniquely identifies the job that restores a recovery point.
     */

    public String getRestoreJobId() {
        return this.restoreJobId;
    }

    /**
     * <p>
     * Uniquely identifies the job that restores a recovery point.
     * </p>
     * 
     * @param restoreJobId
     *        Uniquely identifies the job that restores a recovery point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRestoreJobRequest withRestoreJobId(String restoreJobId) {
        setRestoreJobId(restoreJobId);
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
        if (getRestoreJobId() != null)
            sb.append("RestoreJobId: ").append(getRestoreJobId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRestoreJobRequest == false)
            return false;
        DescribeRestoreJobRequest other = (DescribeRestoreJobRequest) obj;
        if (other.getRestoreJobId() == null ^ this.getRestoreJobId() == null)
            return false;
        if (other.getRestoreJobId() != null && other.getRestoreJobId().equals(this.getRestoreJobId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestoreJobId() == null) ? 0 : getRestoreJobId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRestoreJobRequest clone() {
        return (DescribeRestoreJobRequest) super.clone();
    }

}
