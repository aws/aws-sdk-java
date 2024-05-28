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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The URI for the run log.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/RunLogLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RunLogLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The log stream ARN for the engine log.
     * </p>
     */
    private String engineLogStream;
    /**
     * <p>
     * The log stream ARN for the run log.
     * </p>
     */
    private String runLogStream;

    /**
     * <p>
     * The log stream ARN for the engine log.
     * </p>
     * 
     * @param engineLogStream
     *        The log stream ARN for the engine log.
     */

    public void setEngineLogStream(String engineLogStream) {
        this.engineLogStream = engineLogStream;
    }

    /**
     * <p>
     * The log stream ARN for the engine log.
     * </p>
     * 
     * @return The log stream ARN for the engine log.
     */

    public String getEngineLogStream() {
        return this.engineLogStream;
    }

    /**
     * <p>
     * The log stream ARN for the engine log.
     * </p>
     * 
     * @param engineLogStream
     *        The log stream ARN for the engine log.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunLogLocation withEngineLogStream(String engineLogStream) {
        setEngineLogStream(engineLogStream);
        return this;
    }

    /**
     * <p>
     * The log stream ARN for the run log.
     * </p>
     * 
     * @param runLogStream
     *        The log stream ARN for the run log.
     */

    public void setRunLogStream(String runLogStream) {
        this.runLogStream = runLogStream;
    }

    /**
     * <p>
     * The log stream ARN for the run log.
     * </p>
     * 
     * @return The log stream ARN for the run log.
     */

    public String getRunLogStream() {
        return this.runLogStream;
    }

    /**
     * <p>
     * The log stream ARN for the run log.
     * </p>
     * 
     * @param runLogStream
     *        The log stream ARN for the run log.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunLogLocation withRunLogStream(String runLogStream) {
        setRunLogStream(runLogStream);
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
        if (getEngineLogStream() != null)
            sb.append("EngineLogStream: ").append(getEngineLogStream()).append(",");
        if (getRunLogStream() != null)
            sb.append("RunLogStream: ").append(getRunLogStream());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RunLogLocation == false)
            return false;
        RunLogLocation other = (RunLogLocation) obj;
        if (other.getEngineLogStream() == null ^ this.getEngineLogStream() == null)
            return false;
        if (other.getEngineLogStream() != null && other.getEngineLogStream().equals(this.getEngineLogStream()) == false)
            return false;
        if (other.getRunLogStream() == null ^ this.getRunLogStream() == null)
            return false;
        if (other.getRunLogStream() != null && other.getRunLogStream().equals(this.getRunLogStream()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngineLogStream() == null) ? 0 : getEngineLogStream().hashCode());
        hashCode = prime * hashCode + ((getRunLogStream() == null) ? 0 : getRunLogStream().hashCode());
        return hashCode;
    }

    @Override
    public RunLogLocation clone() {
        try {
            return (RunLogLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.RunLogLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
