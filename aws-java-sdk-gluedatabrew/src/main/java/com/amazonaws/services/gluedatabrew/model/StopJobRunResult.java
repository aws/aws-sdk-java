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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/StopJobRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopJobRunResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the job run that you stopped.
     * </p>
     */
    private String runId;

    /**
     * <p>
     * The ID of the job run that you stopped.
     * </p>
     * 
     * @param runId
     *        The ID of the job run that you stopped.
     */

    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * The ID of the job run that you stopped.
     * </p>
     * 
     * @return The ID of the job run that you stopped.
     */

    public String getRunId() {
        return this.runId;
    }

    /**
     * <p>
     * The ID of the job run that you stopped.
     * </p>
     * 
     * @param runId
     *        The ID of the job run that you stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopJobRunResult withRunId(String runId) {
        setRunId(runId);
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
        if (getRunId() != null)
            sb.append("RunId: ").append(getRunId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopJobRunResult == false)
            return false;
        StopJobRunResult other = (StopJobRunResult) obj;
        if (other.getRunId() == null ^ this.getRunId() == null)
            return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRunId() == null) ? 0 : getRunId().hashCode());
        return hashCode;
    }

    @Override
    public StopJobRunResult clone() {
        try {
            return (StopJobRunResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
