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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the anomalies.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/Anomaly" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Anomaly implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the types of profiles.
     * </p>
     */
    private java.util.Map<String, java.util.Map<String, java.util.List<AnomalyObject>>> profiles;
    /**
     * <p>
     * Information about the behavior of the anomalies.
     * </p>
     */
    private AnomalyUnusual unusual;

    /**
     * <p>
     * Information about the types of profiles.
     * </p>
     * 
     * @return Information about the types of profiles.
     */

    public java.util.Map<String, java.util.Map<String, java.util.List<AnomalyObject>>> getProfiles() {
        return profiles;
    }

    /**
     * <p>
     * Information about the types of profiles.
     * </p>
     * 
     * @param profiles
     *        Information about the types of profiles.
     */

    public void setProfiles(java.util.Map<String, java.util.Map<String, java.util.List<AnomalyObject>>> profiles) {
        this.profiles = profiles;
    }

    /**
     * <p>
     * Information about the types of profiles.
     * </p>
     * 
     * @param profiles
     *        Information about the types of profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Anomaly withProfiles(java.util.Map<String, java.util.Map<String, java.util.List<AnomalyObject>>> profiles) {
        setProfiles(profiles);
        return this;
    }

    /**
     * Add a single Profiles entry
     *
     * @see Anomaly#withProfiles
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Anomaly addProfilesEntry(String key, java.util.Map<String, java.util.List<AnomalyObject>> value) {
        if (null == this.profiles) {
            this.profiles = new java.util.HashMap<String, java.util.Map<String, java.util.List<AnomalyObject>>>();
        }
        if (this.profiles.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.profiles.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Profiles.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Anomaly clearProfilesEntries() {
        this.profiles = null;
        return this;
    }

    /**
     * <p>
     * Information about the behavior of the anomalies.
     * </p>
     * 
     * @param unusual
     *        Information about the behavior of the anomalies.
     */

    public void setUnusual(AnomalyUnusual unusual) {
        this.unusual = unusual;
    }

    /**
     * <p>
     * Information about the behavior of the anomalies.
     * </p>
     * 
     * @return Information about the behavior of the anomalies.
     */

    public AnomalyUnusual getUnusual() {
        return this.unusual;
    }

    /**
     * <p>
     * Information about the behavior of the anomalies.
     * </p>
     * 
     * @param unusual
     *        Information about the behavior of the anomalies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Anomaly withUnusual(AnomalyUnusual unusual) {
        setUnusual(unusual);
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
        if (getProfiles() != null)
            sb.append("Profiles: ").append(getProfiles()).append(",");
        if (getUnusual() != null)
            sb.append("Unusual: ").append(getUnusual());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Anomaly == false)
            return false;
        Anomaly other = (Anomaly) obj;
        if (other.getProfiles() == null ^ this.getProfiles() == null)
            return false;
        if (other.getProfiles() != null && other.getProfiles().equals(this.getProfiles()) == false)
            return false;
        if (other.getUnusual() == null ^ this.getUnusual() == null)
            return false;
        if (other.getUnusual() != null && other.getUnusual().equals(this.getUnusual()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfiles() == null) ? 0 : getProfiles().hashCode());
        hashCode = prime * hashCode + ((getUnusual() == null) ? 0 : getUnusual().hashCode());
        return hashCode;
    }

    @Override
    public Anomaly clone() {
        try {
            return (Anomaly) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.AnomalyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
