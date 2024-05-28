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
 * Contains information about the unusual anomalies.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/AnomalyObject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnomalyObject implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of behavior of the profile.
     * </p>
     */
    private String profileType;
    /**
     * <p>
     * The frequency of the anomaly.
     * </p>
     */
    private String profileSubtype;
    /**
     * <p>
     * The recorded value.
     * </p>
     */
    private Observations observations;

    /**
     * <p>
     * The type of behavior of the profile.
     * </p>
     * 
     * @param profileType
     *        The type of behavior of the profile.
     * @see ProfileType
     */

    public void setProfileType(String profileType) {
        this.profileType = profileType;
    }

    /**
     * <p>
     * The type of behavior of the profile.
     * </p>
     * 
     * @return The type of behavior of the profile.
     * @see ProfileType
     */

    public String getProfileType() {
        return this.profileType;
    }

    /**
     * <p>
     * The type of behavior of the profile.
     * </p>
     * 
     * @param profileType
     *        The type of behavior of the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProfileType
     */

    public AnomalyObject withProfileType(String profileType) {
        setProfileType(profileType);
        return this;
    }

    /**
     * <p>
     * The type of behavior of the profile.
     * </p>
     * 
     * @param profileType
     *        The type of behavior of the profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProfileType
     */

    public AnomalyObject withProfileType(ProfileType profileType) {
        this.profileType = profileType.toString();
        return this;
    }

    /**
     * <p>
     * The frequency of the anomaly.
     * </p>
     * 
     * @param profileSubtype
     *        The frequency of the anomaly.
     * @see ProfileSubtype
     */

    public void setProfileSubtype(String profileSubtype) {
        this.profileSubtype = profileSubtype;
    }

    /**
     * <p>
     * The frequency of the anomaly.
     * </p>
     * 
     * @return The frequency of the anomaly.
     * @see ProfileSubtype
     */

    public String getProfileSubtype() {
        return this.profileSubtype;
    }

    /**
     * <p>
     * The frequency of the anomaly.
     * </p>
     * 
     * @param profileSubtype
     *        The frequency of the anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProfileSubtype
     */

    public AnomalyObject withProfileSubtype(String profileSubtype) {
        setProfileSubtype(profileSubtype);
        return this;
    }

    /**
     * <p>
     * The frequency of the anomaly.
     * </p>
     * 
     * @param profileSubtype
     *        The frequency of the anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProfileSubtype
     */

    public AnomalyObject withProfileSubtype(ProfileSubtype profileSubtype) {
        this.profileSubtype = profileSubtype.toString();
        return this;
    }

    /**
     * <p>
     * The recorded value.
     * </p>
     * 
     * @param observations
     *        The recorded value.
     */

    public void setObservations(Observations observations) {
        this.observations = observations;
    }

    /**
     * <p>
     * The recorded value.
     * </p>
     * 
     * @return The recorded value.
     */

    public Observations getObservations() {
        return this.observations;
    }

    /**
     * <p>
     * The recorded value.
     * </p>
     * 
     * @param observations
     *        The recorded value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyObject withObservations(Observations observations) {
        setObservations(observations);
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
        if (getProfileType() != null)
            sb.append("ProfileType: ").append(getProfileType()).append(",");
        if (getProfileSubtype() != null)
            sb.append("ProfileSubtype: ").append(getProfileSubtype()).append(",");
        if (getObservations() != null)
            sb.append("Observations: ").append(getObservations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnomalyObject == false)
            return false;
        AnomalyObject other = (AnomalyObject) obj;
        if (other.getProfileType() == null ^ this.getProfileType() == null)
            return false;
        if (other.getProfileType() != null && other.getProfileType().equals(this.getProfileType()) == false)
            return false;
        if (other.getProfileSubtype() == null ^ this.getProfileSubtype() == null)
            return false;
        if (other.getProfileSubtype() != null && other.getProfileSubtype().equals(this.getProfileSubtype()) == false)
            return false;
        if (other.getObservations() == null ^ this.getObservations() == null)
            return false;
        if (other.getObservations() != null && other.getObservations().equals(this.getObservations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfileType() == null) ? 0 : getProfileType().hashCode());
        hashCode = prime * hashCode + ((getProfileSubtype() == null) ? 0 : getProfileSubtype().hashCode());
        hashCode = prime * hashCode + ((getObservations() == null) ? 0 : getObservations().hashCode());
        return hashCode;
    }

    @Override
    public AnomalyObject clone() {
        try {
            return (AnomalyObject) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.AnomalyObjectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
