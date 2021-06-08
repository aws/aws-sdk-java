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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The criteria that determine when and how a job abort takes place.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsJobAbortConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of criteria that determine when and how to abort the job.
     * </p>
     */
    private java.util.List<AwsJobAbortCriteria> abortCriteriaList;

    /**
     * <p>
     * The list of criteria that determine when and how to abort the job.
     * </p>
     * 
     * @return The list of criteria that determine when and how to abort the job.
     */

    public java.util.List<AwsJobAbortCriteria> getAbortCriteriaList() {
        return abortCriteriaList;
    }

    /**
     * <p>
     * The list of criteria that determine when and how to abort the job.
     * </p>
     * 
     * @param abortCriteriaList
     *        The list of criteria that determine when and how to abort the job.
     */

    public void setAbortCriteriaList(java.util.Collection<AwsJobAbortCriteria> abortCriteriaList) {
        if (abortCriteriaList == null) {
            this.abortCriteriaList = null;
            return;
        }

        this.abortCriteriaList = new java.util.ArrayList<AwsJobAbortCriteria>(abortCriteriaList);
    }

    /**
     * <p>
     * The list of criteria that determine when and how to abort the job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAbortCriteriaList(java.util.Collection)} or {@link #withAbortCriteriaList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param abortCriteriaList
     *        The list of criteria that determine when and how to abort the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsJobAbortConfig withAbortCriteriaList(AwsJobAbortCriteria... abortCriteriaList) {
        if (this.abortCriteriaList == null) {
            setAbortCriteriaList(new java.util.ArrayList<AwsJobAbortCriteria>(abortCriteriaList.length));
        }
        for (AwsJobAbortCriteria ele : abortCriteriaList) {
            this.abortCriteriaList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of criteria that determine when and how to abort the job.
     * </p>
     * 
     * @param abortCriteriaList
     *        The list of criteria that determine when and how to abort the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsJobAbortConfig withAbortCriteriaList(java.util.Collection<AwsJobAbortCriteria> abortCriteriaList) {
        setAbortCriteriaList(abortCriteriaList);
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
        if (getAbortCriteriaList() != null)
            sb.append("AbortCriteriaList: ").append(getAbortCriteriaList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsJobAbortConfig == false)
            return false;
        AwsJobAbortConfig other = (AwsJobAbortConfig) obj;
        if (other.getAbortCriteriaList() == null ^ this.getAbortCriteriaList() == null)
            return false;
        if (other.getAbortCriteriaList() != null && other.getAbortCriteriaList().equals(this.getAbortCriteriaList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAbortCriteriaList() == null) ? 0 : getAbortCriteriaList().hashCode());
        return hashCode;
    }

    @Override
    public AwsJobAbortConfig clone() {
        try {
            return (AwsJobAbortConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.AwsJobAbortConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
