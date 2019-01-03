/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the continuous backups and point in time recovery settings on the table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ContinuousBackupsDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContinuousBackupsDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * <code>ContinuousBackupsStatus</code> can be one of the following states: ENABLED, DISABLED
     * </p>
     */
    private String continuousBackupsStatus;
    /**
     * <p>
     * The description of the point in time recovery settings applied to the table.
     * </p>
     */
    private PointInTimeRecoveryDescription pointInTimeRecoveryDescription;

    /**
     * <p>
     * <code>ContinuousBackupsStatus</code> can be one of the following states: ENABLED, DISABLED
     * </p>
     * 
     * @param continuousBackupsStatus
     *        <code>ContinuousBackupsStatus</code> can be one of the following states: ENABLED, DISABLED
     * @see ContinuousBackupsStatus
     */

    public void setContinuousBackupsStatus(String continuousBackupsStatus) {
        this.continuousBackupsStatus = continuousBackupsStatus;
    }

    /**
     * <p>
     * <code>ContinuousBackupsStatus</code> can be one of the following states: ENABLED, DISABLED
     * </p>
     * 
     * @return <code>ContinuousBackupsStatus</code> can be one of the following states: ENABLED, DISABLED
     * @see ContinuousBackupsStatus
     */

    public String getContinuousBackupsStatus() {
        return this.continuousBackupsStatus;
    }

    /**
     * <p>
     * <code>ContinuousBackupsStatus</code> can be one of the following states: ENABLED, DISABLED
     * </p>
     * 
     * @param continuousBackupsStatus
     *        <code>ContinuousBackupsStatus</code> can be one of the following states: ENABLED, DISABLED
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContinuousBackupsStatus
     */

    public ContinuousBackupsDescription withContinuousBackupsStatus(String continuousBackupsStatus) {
        setContinuousBackupsStatus(continuousBackupsStatus);
        return this;
    }

    /**
     * <p>
     * <code>ContinuousBackupsStatus</code> can be one of the following states: ENABLED, DISABLED
     * </p>
     * 
     * @param continuousBackupsStatus
     *        <code>ContinuousBackupsStatus</code> can be one of the following states: ENABLED, DISABLED
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContinuousBackupsStatus
     */

    public ContinuousBackupsDescription withContinuousBackupsStatus(ContinuousBackupsStatus continuousBackupsStatus) {
        this.continuousBackupsStatus = continuousBackupsStatus.toString();
        return this;
    }

    /**
     * <p>
     * The description of the point in time recovery settings applied to the table.
     * </p>
     * 
     * @param pointInTimeRecoveryDescription
     *        The description of the point in time recovery settings applied to the table.
     */

    public void setPointInTimeRecoveryDescription(PointInTimeRecoveryDescription pointInTimeRecoveryDescription) {
        this.pointInTimeRecoveryDescription = pointInTimeRecoveryDescription;
    }

    /**
     * <p>
     * The description of the point in time recovery settings applied to the table.
     * </p>
     * 
     * @return The description of the point in time recovery settings applied to the table.
     */

    public PointInTimeRecoveryDescription getPointInTimeRecoveryDescription() {
        return this.pointInTimeRecoveryDescription;
    }

    /**
     * <p>
     * The description of the point in time recovery settings applied to the table.
     * </p>
     * 
     * @param pointInTimeRecoveryDescription
     *        The description of the point in time recovery settings applied to the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContinuousBackupsDescription withPointInTimeRecoveryDescription(PointInTimeRecoveryDescription pointInTimeRecoveryDescription) {
        setPointInTimeRecoveryDescription(pointInTimeRecoveryDescription);
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
        if (getContinuousBackupsStatus() != null)
            sb.append("ContinuousBackupsStatus: ").append(getContinuousBackupsStatus()).append(",");
        if (getPointInTimeRecoveryDescription() != null)
            sb.append("PointInTimeRecoveryDescription: ").append(getPointInTimeRecoveryDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContinuousBackupsDescription == false)
            return false;
        ContinuousBackupsDescription other = (ContinuousBackupsDescription) obj;
        if (other.getContinuousBackupsStatus() == null ^ this.getContinuousBackupsStatus() == null)
            return false;
        if (other.getContinuousBackupsStatus() != null && other.getContinuousBackupsStatus().equals(this.getContinuousBackupsStatus()) == false)
            return false;
        if (other.getPointInTimeRecoveryDescription() == null ^ this.getPointInTimeRecoveryDescription() == null)
            return false;
        if (other.getPointInTimeRecoveryDescription() != null
                && other.getPointInTimeRecoveryDescription().equals(this.getPointInTimeRecoveryDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContinuousBackupsStatus() == null) ? 0 : getContinuousBackupsStatus().hashCode());
        hashCode = prime * hashCode + ((getPointInTimeRecoveryDescription() == null) ? 0 : getPointInTimeRecoveryDescription().hashCode());
        return hashCode;
    }

    @Override
    public ContinuousBackupsDescription clone() {
        try {
            return (ContinuousBackupsDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.ContinuousBackupsDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
