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

package com.amazonaws.services.inspector.model;

import java.io.Serializable;

/**
 * 
 */
public class GetAssessmentTelemetryResult implements Serializable, Cloneable {

    /**
     * <p>
     * Telemetry details.
     * </p>
     */
    private java.util.List<Telemetry> telemetry;

    /**
     * <p>
     * Telemetry details.
     * </p>
     * 
     * @return Telemetry details.
     */
    public java.util.List<Telemetry> getTelemetry() {
        return telemetry;
    }

    /**
     * <p>
     * Telemetry details.
     * </p>
     * 
     * @param telemetry
     *        Telemetry details.
     */
    public void setTelemetry(java.util.Collection<Telemetry> telemetry) {
        if (telemetry == null) {
            this.telemetry = null;
            return;
        }

        this.telemetry = new java.util.ArrayList<Telemetry>(telemetry);
    }

    /**
     * <p>
     * Telemetry details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTelemetry(java.util.Collection)} or
     * {@link #withTelemetry(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param telemetry
     *        Telemetry details.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetAssessmentTelemetryResult withTelemetry(Telemetry... telemetry) {
        if (this.telemetry == null) {
            setTelemetry(new java.util.ArrayList<Telemetry>(telemetry.length));
        }
        for (Telemetry ele : telemetry) {
            this.telemetry.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Telemetry details.
     * </p>
     * 
     * @param telemetry
     *        Telemetry details.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetAssessmentTelemetryResult withTelemetry(
            java.util.Collection<Telemetry> telemetry) {
        setTelemetry(telemetry);
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
        if (getTelemetry() != null)
            sb.append("Telemetry: " + getTelemetry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAssessmentTelemetryResult == false)
            return false;
        GetAssessmentTelemetryResult other = (GetAssessmentTelemetryResult) obj;
        if (other.getTelemetry() == null ^ this.getTelemetry() == null)
            return false;
        if (other.getTelemetry() != null
                && other.getTelemetry().equals(this.getTelemetry()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTelemetry() == null) ? 0 : getTelemetry().hashCode());
        return hashCode;
    }

    @Override
    public GetAssessmentTelemetryResult clone() {
        try {
            return (GetAssessmentTelemetryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}