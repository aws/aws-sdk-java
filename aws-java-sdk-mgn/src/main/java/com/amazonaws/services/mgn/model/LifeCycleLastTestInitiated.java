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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Lifecycle last Test initiated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/LifeCycleLastTestInitiated" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifeCycleLastTestInitiated implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Lifecycle last Test initiated API call date and time.
     * </p>
     */
    private String apiCallDateTime;
    /**
     * <p>
     * Lifecycle last Test initiated Job ID.
     * </p>
     */
    private String jobID;

    /**
     * <p>
     * Lifecycle last Test initiated API call date and time.
     * </p>
     * 
     * @param apiCallDateTime
     *        Lifecycle last Test initiated API call date and time.
     */

    public void setApiCallDateTime(String apiCallDateTime) {
        this.apiCallDateTime = apiCallDateTime;
    }

    /**
     * <p>
     * Lifecycle last Test initiated API call date and time.
     * </p>
     * 
     * @return Lifecycle last Test initiated API call date and time.
     */

    public String getApiCallDateTime() {
        return this.apiCallDateTime;
    }

    /**
     * <p>
     * Lifecycle last Test initiated API call date and time.
     * </p>
     * 
     * @param apiCallDateTime
     *        Lifecycle last Test initiated API call date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifeCycleLastTestInitiated withApiCallDateTime(String apiCallDateTime) {
        setApiCallDateTime(apiCallDateTime);
        return this;
    }

    /**
     * <p>
     * Lifecycle last Test initiated Job ID.
     * </p>
     * 
     * @param jobID
     *        Lifecycle last Test initiated Job ID.
     */

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    /**
     * <p>
     * Lifecycle last Test initiated Job ID.
     * </p>
     * 
     * @return Lifecycle last Test initiated Job ID.
     */

    public String getJobID() {
        return this.jobID;
    }

    /**
     * <p>
     * Lifecycle last Test initiated Job ID.
     * </p>
     * 
     * @param jobID
     *        Lifecycle last Test initiated Job ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifeCycleLastTestInitiated withJobID(String jobID) {
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
        if (getApiCallDateTime() != null)
            sb.append("ApiCallDateTime: ").append(getApiCallDateTime()).append(",");
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

        if (obj instanceof LifeCycleLastTestInitiated == false)
            return false;
        LifeCycleLastTestInitiated other = (LifeCycleLastTestInitiated) obj;
        if (other.getApiCallDateTime() == null ^ this.getApiCallDateTime() == null)
            return false;
        if (other.getApiCallDateTime() != null && other.getApiCallDateTime().equals(this.getApiCallDateTime()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getApiCallDateTime() == null) ? 0 : getApiCallDateTime().hashCode());
        hashCode = prime * hashCode + ((getJobID() == null) ? 0 : getJobID().hashCode());
        return hashCode;
    }

    @Override
    public LifeCycleLastTestInitiated clone() {
        try {
            return (LifeCycleLastTestInitiated) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.LifeCycleLastTestInitiatedMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
