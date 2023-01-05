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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetCallAnalyticsJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCallAnalyticsJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Provides detailed information about the specified Call Analytics job, including job status and, if applicable,
     * failure reason.
     * </p>
     */
    private CallAnalyticsJob callAnalyticsJob;

    /**
     * <p>
     * Provides detailed information about the specified Call Analytics job, including job status and, if applicable,
     * failure reason.
     * </p>
     * 
     * @param callAnalyticsJob
     *        Provides detailed information about the specified Call Analytics job, including job status and, if
     *        applicable, failure reason.
     */

    public void setCallAnalyticsJob(CallAnalyticsJob callAnalyticsJob) {
        this.callAnalyticsJob = callAnalyticsJob;
    }

    /**
     * <p>
     * Provides detailed information about the specified Call Analytics job, including job status and, if applicable,
     * failure reason.
     * </p>
     * 
     * @return Provides detailed information about the specified Call Analytics job, including job status and, if
     *         applicable, failure reason.
     */

    public CallAnalyticsJob getCallAnalyticsJob() {
        return this.callAnalyticsJob;
    }

    /**
     * <p>
     * Provides detailed information about the specified Call Analytics job, including job status and, if applicable,
     * failure reason.
     * </p>
     * 
     * @param callAnalyticsJob
     *        Provides detailed information about the specified Call Analytics job, including job status and, if
     *        applicable, failure reason.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCallAnalyticsJobResult withCallAnalyticsJob(CallAnalyticsJob callAnalyticsJob) {
        setCallAnalyticsJob(callAnalyticsJob);
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
        if (getCallAnalyticsJob() != null)
            sb.append("CallAnalyticsJob: ").append(getCallAnalyticsJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCallAnalyticsJobResult == false)
            return false;
        GetCallAnalyticsJobResult other = (GetCallAnalyticsJobResult) obj;
        if (other.getCallAnalyticsJob() == null ^ this.getCallAnalyticsJob() == null)
            return false;
        if (other.getCallAnalyticsJob() != null && other.getCallAnalyticsJob().equals(this.getCallAnalyticsJob()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCallAnalyticsJob() == null) ? 0 : getCallAnalyticsJob().hashCode());
        return hashCode;
    }

    @Override
    public GetCallAnalyticsJobResult clone() {
        try {
            return (GetCallAnalyticsJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
