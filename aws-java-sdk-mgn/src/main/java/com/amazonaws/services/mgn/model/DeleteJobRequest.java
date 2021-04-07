/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DeleteJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Request to delete Job from service by Job ID.
     * </p>
     */
    private String jobID;

    /**
     * <p>
     * Request to delete Job from service by Job ID.
     * </p>
     * 
     * @param jobID
     *        Request to delete Job from service by Job ID.
     */

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    /**
     * <p>
     * Request to delete Job from service by Job ID.
     * </p>
     * 
     * @return Request to delete Job from service by Job ID.
     */

    public String getJobID() {
        return this.jobID;
    }

    /**
     * <p>
     * Request to delete Job from service by Job ID.
     * </p>
     * 
     * @param jobID
     *        Request to delete Job from service by Job ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteJobRequest withJobID(String jobID) {
        setJobID(jobID);
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
        if (getJobID() != null)
            sb.append("JobID: ").append(getJobID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteJobRequest == false)
            return false;
        DeleteJobRequest other = (DeleteJobRequest) obj;
        if (other.getJobID() == null ^ this.getJobID() == null)
            return false;
        if (other.getJobID() != null && other.getJobID().equals(this.getJobID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobID() == null) ? 0 : getJobID().hashCode());
        return hashCode;
    }

    @Override
    public DeleteJobRequest clone() {
        return (DeleteJobRequest) super.clone();
    }

}
