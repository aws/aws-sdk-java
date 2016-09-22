/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Represents the output of an acknowledge third party job action.
 * </p>
 */
public class AcknowledgeThirdPartyJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status information for the third party job, if any.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The status information for the third party job, if any.
     * </p>
     * 
     * @param status
     *        The status information for the third party job, if any.
     * @see JobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status information for the third party job, if any.
     * </p>
     * 
     * @return The status information for the third party job, if any.
     * @see JobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status information for the third party job, if any.
     * </p>
     * 
     * @param status
     *        The status information for the third party job, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public AcknowledgeThirdPartyJobResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status information for the third party job, if any.
     * </p>
     * 
     * @param status
     *        The status information for the third party job, if any.
     * @see JobStatus
     */

    public void setStatus(JobStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status information for the third party job, if any.
     * </p>
     * 
     * @param status
     *        The status information for the third party job, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public AcknowledgeThirdPartyJobResult withStatus(JobStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcknowledgeThirdPartyJobResult == false)
            return false;
        AcknowledgeThirdPartyJobResult other = (AcknowledgeThirdPartyJobResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public AcknowledgeThirdPartyJobResult clone() {
        try {
            return (AcknowledgeThirdPartyJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
