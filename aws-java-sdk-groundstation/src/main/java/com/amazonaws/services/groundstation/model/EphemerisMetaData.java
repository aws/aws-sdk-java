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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Metadata describing a particular ephemeris.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/EphemerisMetaData" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EphemerisMetaData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * UUID of a customer-provided ephemeris.
     * </p>
     * <p>
     * This field is not populated for default ephemerides from Space Track.
     * </p>
     */
    private String ephemerisId;
    /**
     * <p>
     * The epoch of a default, ephemeris from Space Track in UTC.
     * </p>
     * <p>
     * This field is not populated for customer-provided ephemerides.
     * </p>
     */
    private java.util.Date epoch;
    /**
     * <p>
     * A name string associated with the ephemeris. Used as a human-readable identifier for the ephemeris.
     * </p>
     * <p>
     * A name is only returned for customer-provider ephemerides that have a name associated.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The <code>EphemerisSource</code> that generated a given ephemeris.
     * </p>
     */
    private String source;

    /**
     * <p>
     * UUID of a customer-provided ephemeris.
     * </p>
     * <p>
     * This field is not populated for default ephemerides from Space Track.
     * </p>
     * 
     * @param ephemerisId
     *        UUID of a customer-provided ephemeris.</p>
     *        <p>
     *        This field is not populated for default ephemerides from Space Track.
     */

    public void setEphemerisId(String ephemerisId) {
        this.ephemerisId = ephemerisId;
    }

    /**
     * <p>
     * UUID of a customer-provided ephemeris.
     * </p>
     * <p>
     * This field is not populated for default ephemerides from Space Track.
     * </p>
     * 
     * @return UUID of a customer-provided ephemeris.</p>
     *         <p>
     *         This field is not populated for default ephemerides from Space Track.
     */

    public String getEphemerisId() {
        return this.ephemerisId;
    }

    /**
     * <p>
     * UUID of a customer-provided ephemeris.
     * </p>
     * <p>
     * This field is not populated for default ephemerides from Space Track.
     * </p>
     * 
     * @param ephemerisId
     *        UUID of a customer-provided ephemeris.</p>
     *        <p>
     *        This field is not populated for default ephemerides from Space Track.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EphemerisMetaData withEphemerisId(String ephemerisId) {
        setEphemerisId(ephemerisId);
        return this;
    }

    /**
     * <p>
     * The epoch of a default, ephemeris from Space Track in UTC.
     * </p>
     * <p>
     * This field is not populated for customer-provided ephemerides.
     * </p>
     * 
     * @param epoch
     *        The epoch of a default, ephemeris from Space Track in UTC.</p>
     *        <p>
     *        This field is not populated for customer-provided ephemerides.
     */

    public void setEpoch(java.util.Date epoch) {
        this.epoch = epoch;
    }

    /**
     * <p>
     * The epoch of a default, ephemeris from Space Track in UTC.
     * </p>
     * <p>
     * This field is not populated for customer-provided ephemerides.
     * </p>
     * 
     * @return The epoch of a default, ephemeris from Space Track in UTC.</p>
     *         <p>
     *         This field is not populated for customer-provided ephemerides.
     */

    public java.util.Date getEpoch() {
        return this.epoch;
    }

    /**
     * <p>
     * The epoch of a default, ephemeris from Space Track in UTC.
     * </p>
     * <p>
     * This field is not populated for customer-provided ephemerides.
     * </p>
     * 
     * @param epoch
     *        The epoch of a default, ephemeris from Space Track in UTC.</p>
     *        <p>
     *        This field is not populated for customer-provided ephemerides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EphemerisMetaData withEpoch(java.util.Date epoch) {
        setEpoch(epoch);
        return this;
    }

    /**
     * <p>
     * A name string associated with the ephemeris. Used as a human-readable identifier for the ephemeris.
     * </p>
     * <p>
     * A name is only returned for customer-provider ephemerides that have a name associated.
     * </p>
     * 
     * @param name
     *        A name string associated with the ephemeris. Used as a human-readable identifier for the ephemeris.</p>
     *        <p>
     *        A name is only returned for customer-provider ephemerides that have a name associated.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name string associated with the ephemeris. Used as a human-readable identifier for the ephemeris.
     * </p>
     * <p>
     * A name is only returned for customer-provider ephemerides that have a name associated.
     * </p>
     * 
     * @return A name string associated with the ephemeris. Used as a human-readable identifier for the ephemeris.</p>
     *         <p>
     *         A name is only returned for customer-provider ephemerides that have a name associated.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name string associated with the ephemeris. Used as a human-readable identifier for the ephemeris.
     * </p>
     * <p>
     * A name is only returned for customer-provider ephemerides that have a name associated.
     * </p>
     * 
     * @param name
     *        A name string associated with the ephemeris. Used as a human-readable identifier for the ephemeris.</p>
     *        <p>
     *        A name is only returned for customer-provider ephemerides that have a name associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EphemerisMetaData withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The <code>EphemerisSource</code> that generated a given ephemeris.
     * </p>
     * 
     * @param source
     *        The <code>EphemerisSource</code> that generated a given ephemeris.
     * @see EphemerisSource
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The <code>EphemerisSource</code> that generated a given ephemeris.
     * </p>
     * 
     * @return The <code>EphemerisSource</code> that generated a given ephemeris.
     * @see EphemerisSource
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The <code>EphemerisSource</code> that generated a given ephemeris.
     * </p>
     * 
     * @param source
     *        The <code>EphemerisSource</code> that generated a given ephemeris.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EphemerisSource
     */

    public EphemerisMetaData withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The <code>EphemerisSource</code> that generated a given ephemeris.
     * </p>
     * 
     * @param source
     *        The <code>EphemerisSource</code> that generated a given ephemeris.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EphemerisSource
     */

    public EphemerisMetaData withSource(EphemerisSource source) {
        this.source = source.toString();
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
        if (getEphemerisId() != null)
            sb.append("EphemerisId: ").append(getEphemerisId()).append(",");
        if (getEpoch() != null)
            sb.append("Epoch: ").append(getEpoch()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EphemerisMetaData == false)
            return false;
        EphemerisMetaData other = (EphemerisMetaData) obj;
        if (other.getEphemerisId() == null ^ this.getEphemerisId() == null)
            return false;
        if (other.getEphemerisId() != null && other.getEphemerisId().equals(this.getEphemerisId()) == false)
            return false;
        if (other.getEpoch() == null ^ this.getEpoch() == null)
            return false;
        if (other.getEpoch() != null && other.getEpoch().equals(this.getEpoch()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEphemerisId() == null) ? 0 : getEphemerisId().hashCode());
        hashCode = prime * hashCode + ((getEpoch() == null) ? 0 : getEpoch().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        return hashCode;
    }

    @Override
    public EphemerisMetaData clone() {
        try {
            return (EphemerisMetaData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.EphemerisMetaDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
