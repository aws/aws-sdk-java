/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains the latest status details for an edge agent's recorder and uploader jobs. Use this
 * information to determine the current health of an edge agent.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/EdgeAgentStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EdgeAgentStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The latest status of a stream’s edge recording job.
     * </p>
     */
    private LastRecorderStatus lastRecorderStatus;
    /**
     * <p>
     * The latest status of a stream’s edge to cloud uploader job.
     * </p>
     */
    private LastUploaderStatus lastUploaderStatus;

    /**
     * <p>
     * The latest status of a stream’s edge recording job.
     * </p>
     * 
     * @param lastRecorderStatus
     *        The latest status of a stream’s edge recording job.
     */

    public void setLastRecorderStatus(LastRecorderStatus lastRecorderStatus) {
        this.lastRecorderStatus = lastRecorderStatus;
    }

    /**
     * <p>
     * The latest status of a stream’s edge recording job.
     * </p>
     * 
     * @return The latest status of a stream’s edge recording job.
     */

    public LastRecorderStatus getLastRecorderStatus() {
        return this.lastRecorderStatus;
    }

    /**
     * <p>
     * The latest status of a stream’s edge recording job.
     * </p>
     * 
     * @param lastRecorderStatus
     *        The latest status of a stream’s edge recording job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeAgentStatus withLastRecorderStatus(LastRecorderStatus lastRecorderStatus) {
        setLastRecorderStatus(lastRecorderStatus);
        return this;
    }

    /**
     * <p>
     * The latest status of a stream’s edge to cloud uploader job.
     * </p>
     * 
     * @param lastUploaderStatus
     *        The latest status of a stream’s edge to cloud uploader job.
     */

    public void setLastUploaderStatus(LastUploaderStatus lastUploaderStatus) {
        this.lastUploaderStatus = lastUploaderStatus;
    }

    /**
     * <p>
     * The latest status of a stream’s edge to cloud uploader job.
     * </p>
     * 
     * @return The latest status of a stream’s edge to cloud uploader job.
     */

    public LastUploaderStatus getLastUploaderStatus() {
        return this.lastUploaderStatus;
    }

    /**
     * <p>
     * The latest status of a stream’s edge to cloud uploader job.
     * </p>
     * 
     * @param lastUploaderStatus
     *        The latest status of a stream’s edge to cloud uploader job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeAgentStatus withLastUploaderStatus(LastUploaderStatus lastUploaderStatus) {
        setLastUploaderStatus(lastUploaderStatus);
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
        if (getLastRecorderStatus() != null)
            sb.append("LastRecorderStatus: ").append(getLastRecorderStatus()).append(",");
        if (getLastUploaderStatus() != null)
            sb.append("LastUploaderStatus: ").append(getLastUploaderStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EdgeAgentStatus == false)
            return false;
        EdgeAgentStatus other = (EdgeAgentStatus) obj;
        if (other.getLastRecorderStatus() == null ^ this.getLastRecorderStatus() == null)
            return false;
        if (other.getLastRecorderStatus() != null && other.getLastRecorderStatus().equals(this.getLastRecorderStatus()) == false)
            return false;
        if (other.getLastUploaderStatus() == null ^ this.getLastUploaderStatus() == null)
            return false;
        if (other.getLastUploaderStatus() != null && other.getLastUploaderStatus().equals(this.getLastUploaderStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLastRecorderStatus() == null) ? 0 : getLastRecorderStatus().hashCode());
        hashCode = prime * hashCode + ((getLastUploaderStatus() == null) ? 0 : getLastUploaderStatus().hashCode());
        return hashCode;
    }

    @Override
    public EdgeAgentStatus clone() {
        try {
            return (EdgeAgentStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisvideo.model.transform.EdgeAgentStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
