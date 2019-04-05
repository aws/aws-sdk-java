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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A response to a PollForThirdPartyJobs request returned by AWS CodePipeline when there is a job to be worked upon by a
 * partner action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ThirdPartyJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThirdPartyJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed
     * access to the job and its details.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * The identifier used to identify the job in AWS CodePipeline.
     * </p>
     */
    private String jobId;

    /**
     * <p>
     * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed
     * access to the job and its details.
     * </p>
     * 
     * @param clientId
     *        The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is
     *        allowed access to the job and its details.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed
     * access to the job and its details.
     * </p>
     * 
     * @return The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is
     *         allowed access to the job and its details.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed
     * access to the job and its details.
     * </p>
     * 
     * @param clientId
     *        The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is
     *        allowed access to the job and its details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThirdPartyJob withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * The identifier used to identify the job in AWS CodePipeline.
     * </p>
     * 
     * @param jobId
     *        The identifier used to identify the job in AWS CodePipeline.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The identifier used to identify the job in AWS CodePipeline.
     * </p>
     * 
     * @return The identifier used to identify the job in AWS CodePipeline.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The identifier used to identify the job in AWS CodePipeline.
     * </p>
     * 
     * @param jobId
     *        The identifier used to identify the job in AWS CodePipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThirdPartyJob withJobId(String jobId) {
        setJobId(jobId);
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
        if (getClientId() != null)
            sb.append("ClientId: ").append(getClientId()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThirdPartyJob == false)
            return false;
        ThirdPartyJob other = (ThirdPartyJob) obj;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        return hashCode;
    }

    @Override
    public ThirdPartyJob clone() {
        try {
            return (ThirdPartyJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ThirdPartyJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
