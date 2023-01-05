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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetPosition" target="_top">AWS API
 *      Documentation</a>
 */
@Deprecated
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPositionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The position information of the resource.
     * </p>
     */
    private java.util.List<Float> position;
    /**
     * <p>
     * The accuracy of the estimated position in meters. An empty value indicates that no position data is available. A
     * value of ‘0.0’ value indicates that position data is available. This data corresponds to the position information
     * that you specified instead of the position computed by solver.
     * </p>
     */
    private Accuracy accuracy;
    /**
     * <p>
     * The type of solver used to identify the position of the resource.
     * </p>
     */
    private String solverType;
    /**
     * <p>
     * The vendor of the positioning solver.
     * </p>
     */
    private String solverProvider;
    /**
     * <p>
     * The version of the positioning solver.
     * </p>
     */
    private String solverVersion;
    /**
     * <p>
     * The timestamp at which the device's position was determined.
     * </p>
     */
    private String timestamp;

    /**
     * <p>
     * The position information of the resource.
     * </p>
     * 
     * @return The position information of the resource.
     */

    public java.util.List<Float> getPosition() {
        return position;
    }

    /**
     * <p>
     * The position information of the resource.
     * </p>
     * 
     * @param position
     *        The position information of the resource.
     */

    public void setPosition(java.util.Collection<Float> position) {
        if (position == null) {
            this.position = null;
            return;
        }

        this.position = new java.util.ArrayList<Float>(position);
    }

    /**
     * <p>
     * The position information of the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPosition(java.util.Collection)} or {@link #withPosition(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param position
     *        The position information of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPositionResult withPosition(Float... position) {
        if (this.position == null) {
            setPosition(new java.util.ArrayList<Float>(position.length));
        }
        for (Float ele : position) {
            this.position.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The position information of the resource.
     * </p>
     * 
     * @param position
     *        The position information of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPositionResult withPosition(java.util.Collection<Float> position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * The accuracy of the estimated position in meters. An empty value indicates that no position data is available. A
     * value of ‘0.0’ value indicates that position data is available. This data corresponds to the position information
     * that you specified instead of the position computed by solver.
     * </p>
     * 
     * @param accuracy
     *        The accuracy of the estimated position in meters. An empty value indicates that no position data is
     *        available. A value of ‘0.0’ value indicates that position data is available. This data corresponds to the
     *        position information that you specified instead of the position computed by solver.
     */

    public void setAccuracy(Accuracy accuracy) {
        this.accuracy = accuracy;
    }

    /**
     * <p>
     * The accuracy of the estimated position in meters. An empty value indicates that no position data is available. A
     * value of ‘0.0’ value indicates that position data is available. This data corresponds to the position information
     * that you specified instead of the position computed by solver.
     * </p>
     * 
     * @return The accuracy of the estimated position in meters. An empty value indicates that no position data is
     *         available. A value of ‘0.0’ value indicates that position data is available. This data corresponds to the
     *         position information that you specified instead of the position computed by solver.
     */

    public Accuracy getAccuracy() {
        return this.accuracy;
    }

    /**
     * <p>
     * The accuracy of the estimated position in meters. An empty value indicates that no position data is available. A
     * value of ‘0.0’ value indicates that position data is available. This data corresponds to the position information
     * that you specified instead of the position computed by solver.
     * </p>
     * 
     * @param accuracy
     *        The accuracy of the estimated position in meters. An empty value indicates that no position data is
     *        available. A value of ‘0.0’ value indicates that position data is available. This data corresponds to the
     *        position information that you specified instead of the position computed by solver.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPositionResult withAccuracy(Accuracy accuracy) {
        setAccuracy(accuracy);
        return this;
    }

    /**
     * <p>
     * The type of solver used to identify the position of the resource.
     * </p>
     * 
     * @param solverType
     *        The type of solver used to identify the position of the resource.
     * @see PositionSolverType
     */

    public void setSolverType(String solverType) {
        this.solverType = solverType;
    }

    /**
     * <p>
     * The type of solver used to identify the position of the resource.
     * </p>
     * 
     * @return The type of solver used to identify the position of the resource.
     * @see PositionSolverType
     */

    public String getSolverType() {
        return this.solverType;
    }

    /**
     * <p>
     * The type of solver used to identify the position of the resource.
     * </p>
     * 
     * @param solverType
     *        The type of solver used to identify the position of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionSolverType
     */

    public GetPositionResult withSolverType(String solverType) {
        setSolverType(solverType);
        return this;
    }

    /**
     * <p>
     * The type of solver used to identify the position of the resource.
     * </p>
     * 
     * @param solverType
     *        The type of solver used to identify the position of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionSolverType
     */

    public GetPositionResult withSolverType(PositionSolverType solverType) {
        this.solverType = solverType.toString();
        return this;
    }

    /**
     * <p>
     * The vendor of the positioning solver.
     * </p>
     * 
     * @param solverProvider
     *        The vendor of the positioning solver.
     * @see PositionSolverProvider
     */

    public void setSolverProvider(String solverProvider) {
        this.solverProvider = solverProvider;
    }

    /**
     * <p>
     * The vendor of the positioning solver.
     * </p>
     * 
     * @return The vendor of the positioning solver.
     * @see PositionSolverProvider
     */

    public String getSolverProvider() {
        return this.solverProvider;
    }

    /**
     * <p>
     * The vendor of the positioning solver.
     * </p>
     * 
     * @param solverProvider
     *        The vendor of the positioning solver.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionSolverProvider
     */

    public GetPositionResult withSolverProvider(String solverProvider) {
        setSolverProvider(solverProvider);
        return this;
    }

    /**
     * <p>
     * The vendor of the positioning solver.
     * </p>
     * 
     * @param solverProvider
     *        The vendor of the positioning solver.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionSolverProvider
     */

    public GetPositionResult withSolverProvider(PositionSolverProvider solverProvider) {
        this.solverProvider = solverProvider.toString();
        return this;
    }

    /**
     * <p>
     * The version of the positioning solver.
     * </p>
     * 
     * @param solverVersion
     *        The version of the positioning solver.
     */

    public void setSolverVersion(String solverVersion) {
        this.solverVersion = solverVersion;
    }

    /**
     * <p>
     * The version of the positioning solver.
     * </p>
     * 
     * @return The version of the positioning solver.
     */

    public String getSolverVersion() {
        return this.solverVersion;
    }

    /**
     * <p>
     * The version of the positioning solver.
     * </p>
     * 
     * @param solverVersion
     *        The version of the positioning solver.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPositionResult withSolverVersion(String solverVersion) {
        setSolverVersion(solverVersion);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the device's position was determined.
     * </p>
     * 
     * @param timestamp
     *        The timestamp at which the device's position was determined.
     */

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The timestamp at which the device's position was determined.
     * </p>
     * 
     * @return The timestamp at which the device's position was determined.
     */

    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The timestamp at which the device's position was determined.
     * </p>
     * 
     * @param timestamp
     *        The timestamp at which the device's position was determined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPositionResult withTimestamp(String timestamp) {
        setTimestamp(timestamp);
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
        if (getPosition() != null)
            sb.append("Position: ").append(getPosition()).append(",");
        if (getAccuracy() != null)
            sb.append("Accuracy: ").append(getAccuracy()).append(",");
        if (getSolverType() != null)
            sb.append("SolverType: ").append(getSolverType()).append(",");
        if (getSolverProvider() != null)
            sb.append("SolverProvider: ").append(getSolverProvider()).append(",");
        if (getSolverVersion() != null)
            sb.append("SolverVersion: ").append(getSolverVersion()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPositionResult == false)
            return false;
        GetPositionResult other = (GetPositionResult) obj;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getAccuracy() == null ^ this.getAccuracy() == null)
            return false;
        if (other.getAccuracy() != null && other.getAccuracy().equals(this.getAccuracy()) == false)
            return false;
        if (other.getSolverType() == null ^ this.getSolverType() == null)
            return false;
        if (other.getSolverType() != null && other.getSolverType().equals(this.getSolverType()) == false)
            return false;
        if (other.getSolverProvider() == null ^ this.getSolverProvider() == null)
            return false;
        if (other.getSolverProvider() != null && other.getSolverProvider().equals(this.getSolverProvider()) == false)
            return false;
        if (other.getSolverVersion() == null ^ this.getSolverVersion() == null)
            return false;
        if (other.getSolverVersion() != null && other.getSolverVersion().equals(this.getSolverVersion()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getAccuracy() == null) ? 0 : getAccuracy().hashCode());
        hashCode = prime * hashCode + ((getSolverType() == null) ? 0 : getSolverType().hashCode());
        hashCode = prime * hashCode + ((getSolverProvider() == null) ? 0 : getSolverProvider().hashCode());
        hashCode = prime * hashCode + ((getSolverVersion() == null) ? 0 : getSolverVersion().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public GetPositionResult clone() {
        try {
            return (GetPositionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
