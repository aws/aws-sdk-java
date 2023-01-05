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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/UpdateEphemeris" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEphemerisRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Whether the ephemeris is enabled or not. Changing this value will not require the ephemeris to be re-validated.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The AWS Ground Station ephemeris ID.
     * </p>
     */
    private String ephemerisId;
    /**
     * <p>
     * A name string associated with the ephemeris. Used as a human-readable identifier for the ephemeris.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Customer-provided priority score to establish the order in which overlapping ephemerides should be used.
     * </p>
     * <p>
     * The default for customer-provided ephemeris priority is 1, and higher numbers take precedence.
     * </p>
     * <p>
     * Priority must be 1 or greater
     * </p>
     */
    private Integer priority;

    /**
     * <p>
     * Whether the ephemeris is enabled or not. Changing this value will not require the ephemeris to be re-validated.
     * </p>
     * 
     * @param enabled
     *        Whether the ephemeris is enabled or not. Changing this value will not require the ephemeris to be
     *        re-validated.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Whether the ephemeris is enabled or not. Changing this value will not require the ephemeris to be re-validated.
     * </p>
     * 
     * @return Whether the ephemeris is enabled or not. Changing this value will not require the ephemeris to be
     *         re-validated.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Whether the ephemeris is enabled or not. Changing this value will not require the ephemeris to be re-validated.
     * </p>
     * 
     * @param enabled
     *        Whether the ephemeris is enabled or not. Changing this value will not require the ephemeris to be
     *        re-validated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEphemerisRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Whether the ephemeris is enabled or not. Changing this value will not require the ephemeris to be re-validated.
     * </p>
     * 
     * @return Whether the ephemeris is enabled or not. Changing this value will not require the ephemeris to be
     *         re-validated.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The AWS Ground Station ephemeris ID.
     * </p>
     * 
     * @param ephemerisId
     *        The AWS Ground Station ephemeris ID.
     */

    public void setEphemerisId(String ephemerisId) {
        this.ephemerisId = ephemerisId;
    }

    /**
     * <p>
     * The AWS Ground Station ephemeris ID.
     * </p>
     * 
     * @return The AWS Ground Station ephemeris ID.
     */

    public String getEphemerisId() {
        return this.ephemerisId;
    }

    /**
     * <p>
     * The AWS Ground Station ephemeris ID.
     * </p>
     * 
     * @param ephemerisId
     *        The AWS Ground Station ephemeris ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEphemerisRequest withEphemerisId(String ephemerisId) {
        setEphemerisId(ephemerisId);
        return this;
    }

    /**
     * <p>
     * A name string associated with the ephemeris. Used as a human-readable identifier for the ephemeris.
     * </p>
     * 
     * @param name
     *        A name string associated with the ephemeris. Used as a human-readable identifier for the ephemeris.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name string associated with the ephemeris. Used as a human-readable identifier for the ephemeris.
     * </p>
     * 
     * @return A name string associated with the ephemeris. Used as a human-readable identifier for the ephemeris.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name string associated with the ephemeris. Used as a human-readable identifier for the ephemeris.
     * </p>
     * 
     * @param name
     *        A name string associated with the ephemeris. Used as a human-readable identifier for the ephemeris.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEphemerisRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Customer-provided priority score to establish the order in which overlapping ephemerides should be used.
     * </p>
     * <p>
     * The default for customer-provided ephemeris priority is 1, and higher numbers take precedence.
     * </p>
     * <p>
     * Priority must be 1 or greater
     * </p>
     * 
     * @param priority
     *        Customer-provided priority score to establish the order in which overlapping ephemerides should be
     *        used.</p>
     *        <p>
     *        The default for customer-provided ephemeris priority is 1, and higher numbers take precedence.
     *        </p>
     *        <p>
     *        Priority must be 1 or greater
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * Customer-provided priority score to establish the order in which overlapping ephemerides should be used.
     * </p>
     * <p>
     * The default for customer-provided ephemeris priority is 1, and higher numbers take precedence.
     * </p>
     * <p>
     * Priority must be 1 or greater
     * </p>
     * 
     * @return Customer-provided priority score to establish the order in which overlapping ephemerides should be
     *         used.</p>
     *         <p>
     *         The default for customer-provided ephemeris priority is 1, and higher numbers take precedence.
     *         </p>
     *         <p>
     *         Priority must be 1 or greater
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * Customer-provided priority score to establish the order in which overlapping ephemerides should be used.
     * </p>
     * <p>
     * The default for customer-provided ephemeris priority is 1, and higher numbers take precedence.
     * </p>
     * <p>
     * Priority must be 1 or greater
     * </p>
     * 
     * @param priority
     *        Customer-provided priority score to establish the order in which overlapping ephemerides should be
     *        used.</p>
     *        <p>
     *        The default for customer-provided ephemeris priority is 1, and higher numbers take precedence.
     *        </p>
     *        <p>
     *        Priority must be 1 or greater
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEphemerisRequest withPriority(Integer priority) {
        setPriority(priority);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getEphemerisId() != null)
            sb.append("EphemerisId: ").append(getEphemerisId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEphemerisRequest == false)
            return false;
        UpdateEphemerisRequest other = (UpdateEphemerisRequest) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getEphemerisId() == null ^ this.getEphemerisId() == null)
            return false;
        if (other.getEphemerisId() != null && other.getEphemerisId().equals(this.getEphemerisId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getEphemerisId() == null) ? 0 : getEphemerisId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEphemerisRequest clone() {
        return (UpdateEphemerisRequest) super.clone();
    }

}
