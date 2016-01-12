/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * 
 */
public class TrafficPolicyInstance implements Serializable, Cloneable {

    private String id;

    private String hostedZoneId;

    private String name;

    private Long tTL;

    private String state;

    private String message;

    private String trafficPolicyId;

    private Integer trafficPolicyVersion;

    private String trafficPolicyType;

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return
     */
    public String getId() {
        return this.id;
    }

    /**
     * @param id
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TrafficPolicyInstance withId(String id) {
        setId(id);
        return this;
    }

    /**
     * @param hostedZoneId
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * @return
     */
    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * @param hostedZoneId
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TrafficPolicyInstance withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TrafficPolicyInstance withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param tTL
     */
    public void setTTL(Long tTL) {
        this.tTL = tTL;
    }

    /**
     * @return
     */
    public Long getTTL() {
        return this.tTL;
    }

    /**
     * @param tTL
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TrafficPolicyInstance withTTL(Long tTL) {
        setTTL(tTL);
        return this;
    }

    /**
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return
     */
    public String getState() {
        return this.state;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TrafficPolicyInstance withState(String state) {
        setState(state);
        return this;
    }

    /**
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @param message
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TrafficPolicyInstance withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * @param trafficPolicyId
     */
    public void setTrafficPolicyId(String trafficPolicyId) {
        this.trafficPolicyId = trafficPolicyId;
    }

    /**
     * @return
     */
    public String getTrafficPolicyId() {
        return this.trafficPolicyId;
    }

    /**
     * @param trafficPolicyId
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TrafficPolicyInstance withTrafficPolicyId(String trafficPolicyId) {
        setTrafficPolicyId(trafficPolicyId);
        return this;
    }

    /**
     * @param trafficPolicyVersion
     */
    public void setTrafficPolicyVersion(Integer trafficPolicyVersion) {
        this.trafficPolicyVersion = trafficPolicyVersion;
    }

    /**
     * @return
     */
    public Integer getTrafficPolicyVersion() {
        return this.trafficPolicyVersion;
    }

    /**
     * @param trafficPolicyVersion
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public TrafficPolicyInstance withTrafficPolicyVersion(
            Integer trafficPolicyVersion) {
        setTrafficPolicyVersion(trafficPolicyVersion);
        return this;
    }

    /**
     * @param trafficPolicyType
     * @see RRType
     */
    public void setTrafficPolicyType(String trafficPolicyType) {
        this.trafficPolicyType = trafficPolicyType;
    }

    /**
     * @return
     * @see RRType
     */
    public String getTrafficPolicyType() {
        return this.trafficPolicyType;
    }

    /**
     * @param trafficPolicyType
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RRType
     */
    public TrafficPolicyInstance withTrafficPolicyType(String trafficPolicyType) {
        setTrafficPolicyType(trafficPolicyType);
        return this;
    }

    /**
     * @param trafficPolicyType
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RRType
     */
    public void setTrafficPolicyType(RRType trafficPolicyType) {
        this.trafficPolicyType = trafficPolicyType.toString();
    }

    /**
     * @param trafficPolicyType
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RRType
     */
    public TrafficPolicyInstance withTrafficPolicyType(RRType trafficPolicyType) {
        setTrafficPolicyType(trafficPolicyType);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: " + getHostedZoneId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getTTL() != null)
            sb.append("TTL: " + getTTL() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getTrafficPolicyId() != null)
            sb.append("TrafficPolicyId: " + getTrafficPolicyId() + ",");
        if (getTrafficPolicyVersion() != null)
            sb.append("TrafficPolicyVersion: " + getTrafficPolicyVersion()
                    + ",");
        if (getTrafficPolicyType() != null)
            sb.append("TrafficPolicyType: " + getTrafficPolicyType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrafficPolicyInstance == false)
            return false;
        TrafficPolicyInstance other = (TrafficPolicyInstance) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null
                && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null
                && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTTL() == null ^ this.getTTL() == null)
            return false;
        if (other.getTTL() != null
                && other.getTTL().equals(this.getTTL()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null
                && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null
                && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getTrafficPolicyId() == null
                ^ this.getTrafficPolicyId() == null)
            return false;
        if (other.getTrafficPolicyId() != null
                && other.getTrafficPolicyId().equals(this.getTrafficPolicyId()) == false)
            return false;
        if (other.getTrafficPolicyVersion() == null
                ^ this.getTrafficPolicyVersion() == null)
            return false;
        if (other.getTrafficPolicyVersion() != null
                && other.getTrafficPolicyVersion().equals(
                        this.getTrafficPolicyVersion()) == false)
            return false;
        if (other.getTrafficPolicyType() == null
                ^ this.getTrafficPolicyType() == null)
            return false;
        if (other.getTrafficPolicyType() != null
                && other.getTrafficPolicyType().equals(
                        this.getTrafficPolicyType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime
                * hashCode
                + ((getHostedZoneId() == null) ? 0 : getHostedZoneId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getTTL() == null) ? 0 : getTTL().hashCode());
        hashCode = prime * hashCode
                + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime
                * hashCode
                + ((getTrafficPolicyId() == null) ? 0 : getTrafficPolicyId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTrafficPolicyVersion() == null) ? 0
                        : getTrafficPolicyVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getTrafficPolicyType() == null) ? 0
                        : getTrafficPolicyType().hashCode());
        return hashCode;
    }

    @Override
    public TrafficPolicyInstance clone() {
        try {
            return (TrafficPolicyInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}