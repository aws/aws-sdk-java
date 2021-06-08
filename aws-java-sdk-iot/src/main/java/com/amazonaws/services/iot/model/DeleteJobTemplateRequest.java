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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteJobTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the job template to delete.
     * </p>
     */
    private String jobTemplateId;

    /**
     * <p>
     * The unique identifier of the job template to delete.
     * </p>
     * 
     * @param jobTemplateId
     *        The unique identifier of the job template to delete.
     */

    public void setJobTemplateId(String jobTemplateId) {
        this.jobTemplateId = jobTemplateId;
    }

    /**
     * <p>
     * The unique identifier of the job template to delete.
     * </p>
     * 
     * @return The unique identifier of the job template to delete.
     */

    public String getJobTemplateId() {
        return this.jobTemplateId;
    }

    /**
     * <p>
     * The unique identifier of the job template to delete.
     * </p>
     * 
     * @param jobTemplateId
     *        The unique identifier of the job template to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteJobTemplateRequest withJobTemplateId(String jobTemplateId) {
        setJobTemplateId(jobTemplateId);
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
        if (getJobTemplateId() != null)
            sb.append("JobTemplateId: ").append(getJobTemplateId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteJobTemplateRequest == false)
            return false;
        DeleteJobTemplateRequest other = (DeleteJobTemplateRequest) obj;
        if (other.getJobTemplateId() == null ^ this.getJobTemplateId() == null)
            return false;
        if (other.getJobTemplateId() != null && other.getJobTemplateId().equals(this.getJobTemplateId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobTemplateId() == null) ? 0 : getJobTemplateId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteJobTemplateRequest clone() {
        return (DeleteJobTemplateRequest) super.clone();
    }

}
