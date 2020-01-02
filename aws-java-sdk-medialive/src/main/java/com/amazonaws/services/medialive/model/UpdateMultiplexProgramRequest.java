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
 * A request to update a program in a multiplex.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateMultiplexProgram" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMultiplexProgramRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ID of the multiplex of the program to update. */
    private String multiplexId;
    /** The new settings for a multiplex program. */
    private MultiplexProgramSettings multiplexProgramSettings;
    /** The name of the program to update. */
    private String programName;

    /**
     * The ID of the multiplex of the program to update.
     * 
     * @param multiplexId
     *        The ID of the multiplex of the program to update.
     */

    public void setMultiplexId(String multiplexId) {
        this.multiplexId = multiplexId;
    }

    /**
     * The ID of the multiplex of the program to update.
     * 
     * @return The ID of the multiplex of the program to update.
     */

    public String getMultiplexId() {
        return this.multiplexId;
    }

    /**
     * The ID of the multiplex of the program to update.
     * 
     * @param multiplexId
     *        The ID of the multiplex of the program to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMultiplexProgramRequest withMultiplexId(String multiplexId) {
        setMultiplexId(multiplexId);
        return this;
    }

    /**
     * The new settings for a multiplex program.
     * 
     * @param multiplexProgramSettings
     *        The new settings for a multiplex program.
     */

    public void setMultiplexProgramSettings(MultiplexProgramSettings multiplexProgramSettings) {
        this.multiplexProgramSettings = multiplexProgramSettings;
    }

    /**
     * The new settings for a multiplex program.
     * 
     * @return The new settings for a multiplex program.
     */

    public MultiplexProgramSettings getMultiplexProgramSettings() {
        return this.multiplexProgramSettings;
    }

    /**
     * The new settings for a multiplex program.
     * 
     * @param multiplexProgramSettings
     *        The new settings for a multiplex program.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMultiplexProgramRequest withMultiplexProgramSettings(MultiplexProgramSettings multiplexProgramSettings) {
        setMultiplexProgramSettings(multiplexProgramSettings);
        return this;
    }

    /**
     * The name of the program to update.
     * 
     * @param programName
     *        The name of the program to update.
     */

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    /**
     * The name of the program to update.
     * 
     * @return The name of the program to update.
     */

    public String getProgramName() {
        return this.programName;
    }

    /**
     * The name of the program to update.
     * 
     * @param programName
     *        The name of the program to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMultiplexProgramRequest withProgramName(String programName) {
        setProgramName(programName);
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
            sb.append("ProgramName: ").append(getProgramName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMultiplexProgramRequest == false)
            return false;
        UpdateMultiplexProgramRequest other = (UpdateMultiplexProgramRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMultiplexId() == null) ? 0 : getMultiplexId().hashCode());
        hashCode = prime * hashCode + ((getMultiplexProgramSettings() == null) ? 0 : getMultiplexProgramSettings().hashCode());
        hashCode = prime * hashCode + ((getProgramName() == null) ? 0 : getProgramName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateMultiplexProgramRequest clone() {
        return (UpdateMultiplexProgramRequest) super.clone();
    }

}
