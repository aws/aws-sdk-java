/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/EulaAcceptance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EulaAcceptance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the EULA was accepted.
     * </p>
     */
    private java.util.Date acceptedAt;
    /**
     * <p>
     * The ID of the person who accepted the EULA.
     * </p>
     */
    private String acceptedBy;
    /**
     * <p>
     * The ID of the acceptee.
     * </p>
     */
    private String accepteeId;
    /**
     * <p>
     * The EULA acceptance ID.
     * </p>
     */
    private String eulaAcceptanceId;
    /**
     * <p>
     * The EULA ID.
     * </p>
     */
    private String eulaId;

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the EULA was accepted.
     * </p>
     * 
     * @param acceptedAt
     *        The Unix epoch timestamp in seconds for when the EULA was accepted.
     */

    public void setAcceptedAt(java.util.Date acceptedAt) {
        this.acceptedAt = acceptedAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the EULA was accepted.
     * </p>
     * 
     * @return The Unix epoch timestamp in seconds for when the EULA was accepted.
     */

    public java.util.Date getAcceptedAt() {
        return this.acceptedAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the EULA was accepted.
     * </p>
     * 
     * @param acceptedAt
     *        The Unix epoch timestamp in seconds for when the EULA was accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EulaAcceptance withAcceptedAt(java.util.Date acceptedAt) {
        setAcceptedAt(acceptedAt);
        return this;
    }

    /**
     * <p>
     * The ID of the person who accepted the EULA.
     * </p>
     * 
     * @param acceptedBy
     *        The ID of the person who accepted the EULA.
     */

    public void setAcceptedBy(String acceptedBy) {
        this.acceptedBy = acceptedBy;
    }

    /**
     * <p>
     * The ID of the person who accepted the EULA.
     * </p>
     * 
     * @return The ID of the person who accepted the EULA.
     */

    public String getAcceptedBy() {
        return this.acceptedBy;
    }

    /**
     * <p>
     * The ID of the person who accepted the EULA.
     * </p>
     * 
     * @param acceptedBy
     *        The ID of the person who accepted the EULA.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EulaAcceptance withAcceptedBy(String acceptedBy) {
        setAcceptedBy(acceptedBy);
        return this;
    }

    /**
     * <p>
     * The ID of the acceptee.
     * </p>
     * 
     * @param accepteeId
     *        The ID of the acceptee.
     */

    public void setAccepteeId(String accepteeId) {
        this.accepteeId = accepteeId;
    }

    /**
     * <p>
     * The ID of the acceptee.
     * </p>
     * 
     * @return The ID of the acceptee.
     */

    public String getAccepteeId() {
        return this.accepteeId;
    }

    /**
     * <p>
     * The ID of the acceptee.
     * </p>
     * 
     * @param accepteeId
     *        The ID of the acceptee.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EulaAcceptance withAccepteeId(String accepteeId) {
        setAccepteeId(accepteeId);
        return this;
    }

    /**
     * <p>
     * The EULA acceptance ID.
     * </p>
     * 
     * @param eulaAcceptanceId
     *        The EULA acceptance ID.
     */

    public void setEulaAcceptanceId(String eulaAcceptanceId) {
        this.eulaAcceptanceId = eulaAcceptanceId;
    }

    /**
     * <p>
     * The EULA acceptance ID.
     * </p>
     * 
     * @return The EULA acceptance ID.
     */

    public String getEulaAcceptanceId() {
        return this.eulaAcceptanceId;
    }

    /**
     * <p>
     * The EULA acceptance ID.
     * </p>
     * 
     * @param eulaAcceptanceId
     *        The EULA acceptance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EulaAcceptance withEulaAcceptanceId(String eulaAcceptanceId) {
        setEulaAcceptanceId(eulaAcceptanceId);
        return this;
    }

    /**
     * <p>
     * The EULA ID.
     * </p>
     * 
     * @param eulaId
     *        The EULA ID.
     */

    public void setEulaId(String eulaId) {
        this.eulaId = eulaId;
    }

    /**
     * <p>
     * The EULA ID.
     * </p>
     * 
     * @return The EULA ID.
     */

    public String getEulaId() {
        return this.eulaId;
    }

    /**
     * <p>
     * The EULA ID.
     * </p>
     * 
     * @param eulaId
     *        The EULA ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EulaAcceptance withEulaId(String eulaId) {
        setEulaId(eulaId);
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
        if (getAcceptedAt() != null)
            sb.append("AcceptedAt: ").append(getAcceptedAt()).append(",");
        if (getAcceptedBy() != null)
            sb.append("AcceptedBy: ").append(getAcceptedBy()).append(",");
        if (getAccepteeId() != null)
            sb.append("AccepteeId: ").append(getAccepteeId()).append(",");
        if (getEulaAcceptanceId() != null)
            sb.append("EulaAcceptanceId: ").append(getEulaAcceptanceId()).append(",");
        if (getEulaId() != null)
            sb.append("EulaId: ").append(getEulaId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EulaAcceptance == false)
            return false;
        EulaAcceptance other = (EulaAcceptance) obj;
        if (other.getAcceptedAt() == null ^ this.getAcceptedAt() == null)
            return false;
        if (other.getAcceptedAt() != null && other.getAcceptedAt().equals(this.getAcceptedAt()) == false)
            return false;
        if (other.getAcceptedBy() == null ^ this.getAcceptedBy() == null)
            return false;
        if (other.getAcceptedBy() != null && other.getAcceptedBy().equals(this.getAcceptedBy()) == false)
            return false;
        if (other.getAccepteeId() == null ^ this.getAccepteeId() == null)
            return false;
        if (other.getAccepteeId() != null && other.getAccepteeId().equals(this.getAccepteeId()) == false)
            return false;
        if (other.getEulaAcceptanceId() == null ^ this.getEulaAcceptanceId() == null)
            return false;
        if (other.getEulaAcceptanceId() != null && other.getEulaAcceptanceId().equals(this.getEulaAcceptanceId()) == false)
            return false;
        if (other.getEulaId() == null ^ this.getEulaId() == null)
            return false;
        if (other.getEulaId() != null && other.getEulaId().equals(this.getEulaId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptedAt() == null) ? 0 : getAcceptedAt().hashCode());
        hashCode = prime * hashCode + ((getAcceptedBy() == null) ? 0 : getAcceptedBy().hashCode());
        hashCode = prime * hashCode + ((getAccepteeId() == null) ? 0 : getAccepteeId().hashCode());
        hashCode = prime * hashCode + ((getEulaAcceptanceId() == null) ? 0 : getEulaAcceptanceId().hashCode());
        hashCode = prime * hashCode + ((getEulaId() == null) ? 0 : getEulaId().hashCode());
        return hashCode;
    }

    @Override
    public EulaAcceptance clone() {
        try {
            return (EulaAcceptance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.nimblestudio.model.transform.EulaAcceptanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
