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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateWave" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWaveRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Wave description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Wave name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Wave ID.
     * </p>
     */
    private String waveID;

    /**
     * <p>
     * Wave description.
     * </p>
     * 
     * @param description
     *        Wave description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Wave description.
     * </p>
     * 
     * @return Wave description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Wave description.
     * </p>
     * 
     * @param description
     *        Wave description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWaveRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Wave name.
     * </p>
     * 
     * @param name
     *        Wave name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Wave name.
     * </p>
     * 
     * @return Wave name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Wave name.
     * </p>
     * 
     * @param name
     *        Wave name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWaveRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Wave ID.
     * </p>
     * 
     * @param waveID
     *        Wave ID.
     */

    public void setWaveID(String waveID) {
        this.waveID = waveID;
    }

    /**
     * <p>
     * Wave ID.
     * </p>
     * 
     * @return Wave ID.
     */

    public String getWaveID() {
        return this.waveID;
    }

    /**
     * <p>
     * Wave ID.
     * </p>
     * 
     * @param waveID
     *        Wave ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWaveRequest withWaveID(String waveID) {
        setWaveID(waveID);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getWaveID() != null)
            sb.append("WaveID: ").append(getWaveID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWaveRequest == false)
            return false;
        UpdateWaveRequest other = (UpdateWaveRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getWaveID() == null ^ this.getWaveID() == null)
            return false;
        if (other.getWaveID() != null && other.getWaveID().equals(this.getWaveID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getWaveID() == null) ? 0 : getWaveID().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWaveRequest clone() {
        return (UpdateWaveRequest) super.clone();
    }

}
