/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * A request to create a program in a multiplex.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateMultiplexProgram" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMultiplexProgramRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** ID of the multiplex where the program is to be created. */
    private String multiplexId;
    /** The settings for this multiplex program. */
    private MultiplexProgramSettings multiplexProgramSettings;
    /** Name of multiplex program. */
    private String programName;
    /**
     * Unique request ID. This prevents retries from creating multiple resources.
     */
    private String requestId;

    /**
     * ID of the multiplex where the program is to be created.
     * 
     * @param multiplexId
     *        ID of the multiplex where the program is to be created.
     */

    public void setMultiplexId(String multiplexId) {
        this.multiplexId = multiplexId;
    }

    /**
     * ID of the multiplex where the program is to be created.
     * 
     * @return ID of the multiplex where the program is to be created.
     */

    public String getMultiplexId() {
        return this.multiplexId;
    }

    /**
     * ID of the multiplex where the program is to be created.
     * 
     * @param multiplexId
     *        ID of the multiplex where the program is to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMultiplexProgramRequest withMultiplexId(String multiplexId) {
        setMultiplexId(multiplexId);
        return this;
    }

    /**
     * The settings for this multiplex program.
     * 
     * @param multiplexProgramSettings
     *        The settings for this multiplex program.
     */

    public void setMultiplexProgramSettings(MultiplexProgramSettings multiplexProgramSettings) {
        this.multiplexProgramSettings = multiplexProgramSettings;
    }

    /**
     * The settings for this multiplex program.
     * 
     * @return The settings for this multiplex program.
     */

    public MultiplexProgramSettings getMultiplexProgramSettings() {
        return this.multiplexProgramSettings;
    }

    /**
     * The settings for this multiplex program.
     * 
     * @param multiplexProgramSettings
     *        The settings for this multiplex program.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMultiplexProgramRequest withMultiplexProgramSettings(MultiplexProgramSettings multiplexProgramSettings) {
        setMultiplexProgramSettings(multiplexProgramSettings);
        return this;
    }

    /**
     * Name of multiplex program.
     * 
     * @param programName
     *        Name of multiplex program.
     */

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    /**
     * Name of multiplex program.
     * 
     * @return Name of multiplex program.
     */

    public String getProgramName() {
        return this.programName;
    }

    /**
     * Name of multiplex program.
     * 
     * @param programName
     *        Name of multiplex program.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMultiplexProgramRequest withProgramName(String programName) {
        setProgramName(programName);
        return this;
    }

    /**
     * Unique request ID. This prevents retries from creating multiple resources.
     * 
     * @param requestId
     *        Unique request ID. This prevents retries from creating multiple resources.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Unique request ID. This prevents retries from creating multiple resources.
     * 
     * @return Unique request ID. This prevents retries from creating multiple resources.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Unique request ID. This prevents retries from creating multiple resources.
     * 
     * @param requestId
     *        Unique request ID. This prevents retries from creating multiple resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMultiplexProgramRequest withRequestId(String requestId) {
        setRequestId(requestId);
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
        if (getMultiplexId() != null)
            sb.append("MultiplexId: ").append(getMultiplexId()).append(",");
        if (getMultiplexProgramSettings() != null)
            sb.append("MultiplexProgramSettings: ").append(getMultiplexProgramSettings()).append(",");
        if (getProgramName() != null)
            sb.append("ProgramName: ").append(getProgramName()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMultiplexProgramRequest == false)
            return false;
        CreateMultiplexProgramRequest other = (CreateMultiplexProgramRequest) obj;
        if (other.getMultiplexId() == null ^ this.getMultiplexId() == null)
            return false;
        if (other.getMultiplexId() != null && other.getMultiplexId().equals(this.getMultiplexId()) == false)
            return false;
        if (other.getMultiplexProgramSettings() == null ^ this.getMultiplexProgramSettings() == null)
            return false;
        if (other.getMultiplexProgramSettings() != null && other.getMultiplexProgramSettings().equals(this.getMultiplexProgramSettings()) == false)
            return false;
        if (other.getProgramName() == null ^ this.getProgramName() == null)
            return false;
        if (other.getProgramName() != null && other.getProgramName().equals(this.getProgramName()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMultiplexId() == null) ? 0 : getMultiplexId().hashCode());
        hashCode = prime * hashCode + ((getMultiplexProgramSettings() == null) ? 0 : getMultiplexProgramSettings().hashCode());
        hashCode = prime * hashCode + ((getProgramName() == null) ? 0 : getProgramName().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        return hashCode;
    }

    @Override
    public CreateMultiplexProgramRequest clone() {
        return (CreateMultiplexProgramRequest) super.clone();
    }

}
