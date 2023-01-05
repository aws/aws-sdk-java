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
package com.amazonaws.services.voiceid.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Indicates the completion progress for a batch job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/JobProgress" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobProgress implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Shows the completed percentage of enrollment or registration requests listed in the input file.
     * </p>
     */
    private Integer percentComplete;

    /**
     * <p>
     * Shows the completed percentage of enrollment or registration requests listed in the input file.
     * </p>
     * 
     * @param percentComplete
     *        Shows the completed percentage of enrollment or registration requests listed in the input file.
     */

    public void setPercentComplete(Integer percentComplete) {
        this.percentComplete = percentComplete;
    }

    /**
     * <p>
     * Shows the completed percentage of enrollment or registration requests listed in the input file.
     * </p>
     * 
     * @return Shows the completed percentage of enrollment or registration requests listed in the input file.
     */

    public Integer getPercentComplete() {
        return this.percentComplete;
    }

    /**
     * <p>
     * Shows the completed percentage of enrollment or registration requests listed in the input file.
     * </p>
     * 
     * @param percentComplete
     *        Shows the completed percentage of enrollment or registration requests listed in the input file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobProgress withPercentComplete(Integer percentComplete) {
        setPercentComplete(percentComplete);
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
        if (getPercentComplete() != null)
            sb.append("PercentComplete: ").append(getPercentComplete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobProgress == false)
            return false;
        JobProgress other = (JobProgress) obj;
        if (other.getPercentComplete() == null ^ this.getPercentComplete() == null)
            return false;
        if (other.getPercentComplete() != null && other.getPercentComplete().equals(this.getPercentComplete()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPercentComplete() == null) ? 0 : getPercentComplete().hashCode());
        return hashCode;
    }

    @Override
    public JobProgress clone() {
        try {
            return (JobProgress) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.voiceid.model.transform.JobProgressMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
