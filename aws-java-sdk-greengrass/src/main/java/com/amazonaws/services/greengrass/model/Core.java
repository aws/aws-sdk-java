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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Information about a core.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/Core" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Core implements Serializable, Cloneable, StructuredPojo {

    /** The ARN of the certificate associated with the core. */
    private String certificateArn;
    /**
     * A descriptive or arbitrary ID for the core. This value must be unique within the core definition version. Max
     * length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
     */
    private String id;
    /** If true, the core's local shadow is automatically synced with the cloud. */
    private Boolean syncShadow;
    /** The ARN of the thing which is the core. */
    private String thingArn;

    /**
     * The ARN of the certificate associated with the core.
     * 
     * @param certificateArn
     *        The ARN of the certificate associated with the core.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * The ARN of the certificate associated with the core.
     * 
     * @return The ARN of the certificate associated with the core.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * The ARN of the certificate associated with the core.
     * 
     * @param certificateArn
     *        The ARN of the certificate associated with the core.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Core withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * A descriptive or arbitrary ID for the core. This value must be unique within the core definition version. Max
     * length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
     * 
     * @param id
     *        A descriptive or arbitrary ID for the core. This value must be unique within the core definition version.
     *        Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * A descriptive or arbitrary ID for the core. This value must be unique within the core definition version. Max
     * length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
     * 
     * @return A descriptive or arbitrary ID for the core. This value must be unique within the core definition version.
     *         Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
     */

    public String getId() {
        return this.id;
    }

    /**
     * A descriptive or arbitrary ID for the core. This value must be unique within the core definition version. Max
     * length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
     * 
     * @param id
     *        A descriptive or arbitrary ID for the core. This value must be unique within the core definition version.
     *        Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Core withId(String id) {
        setId(id);
        return this;
    }

    /**
     * If true, the core's local shadow is automatically synced with the cloud.
     * 
     * @param syncShadow
     *        If true, the core's local shadow is automatically synced with the cloud.
     */

    public void setSyncShadow(Boolean syncShadow) {
        this.syncShadow = syncShadow;
    }

    /**
     * If true, the core's local shadow is automatically synced with the cloud.
     * 
     * @return If true, the core's local shadow is automatically synced with the cloud.
     */

    public Boolean getSyncShadow() {
        return this.syncShadow;
    }

    /**
     * If true, the core's local shadow is automatically synced with the cloud.
     * 
     * @param syncShadow
     *        If true, the core's local shadow is automatically synced with the cloud.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Core withSyncShadow(Boolean syncShadow) {
        setSyncShadow(syncShadow);
        return this;
    }

    /**
     * If true, the core's local shadow is automatically synced with the cloud.
     * 
     * @return If true, the core's local shadow is automatically synced with the cloud.
     */

    public Boolean isSyncShadow() {
        return this.syncShadow;
    }

    /**
     * The ARN of the thing which is the core.
     * 
     * @param thingArn
     *        The ARN of the thing which is the core.
     */

    public void setThingArn(String thingArn) {
        this.thingArn = thingArn;
    }

    /**
     * The ARN of the thing which is the core.
     * 
     * @return The ARN of the thing which is the core.
     */

    public String getThingArn() {
        return this.thingArn;
    }

    /**
     * The ARN of the thing which is the core.
     * 
     * @param thingArn
     *        The ARN of the thing which is the core.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Core withThingArn(String thingArn) {
        setThingArn(thingArn);
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
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getSyncShadow() != null)
            sb.append("SyncShadow: ").append(getSyncShadow()).append(",");
        if (getThingArn() != null)
            sb.append("ThingArn: ").append(getThingArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Core == false)
            return false;
        Core other = (Core) obj;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getSyncShadow() == null ^ this.getSyncShadow() == null)
            return false;
        if (other.getSyncShadow() != null && other.getSyncShadow().equals(this.getSyncShadow()) == false)
            return false;
        if (other.getThingArn() == null ^ this.getThingArn() == null)
            return false;
        if (other.getThingArn() != null && other.getThingArn().equals(this.getThingArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getSyncShadow() == null) ? 0 : getSyncShadow().hashCode());
        hashCode = prime * hashCode + ((getThingArn() == null) ? 0 : getThingArn().hashCode());
        return hashCode;
    }

    @Override
    public Core clone() {
        try {
            return (Core) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.CoreMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
