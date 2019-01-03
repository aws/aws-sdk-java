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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Returns information about the specified configuration revision.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/ConfigurationRevision" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigurationRevision implements Serializable, Cloneable, StructuredPojo {

    /** Required. The date and time of the configuration revision. */
    private java.util.Date created;
    /** The description of the configuration revision. */
    private String description;
    /** Required. The revision number of the configuration. */
    private Integer revision;

    /**
     * Required. The date and time of the configuration revision.
     * 
     * @param created
     *        Required. The date and time of the configuration revision.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * Required. The date and time of the configuration revision.
     * 
     * @return Required. The date and time of the configuration revision.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * Required. The date and time of the configuration revision.
     * 
     * @param created
     *        Required. The date and time of the configuration revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationRevision withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * The description of the configuration revision.
     * 
     * @param description
     *        The description of the configuration revision.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The description of the configuration revision.
     * 
     * @return The description of the configuration revision.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * The description of the configuration revision.
     * 
     * @param description
     *        The description of the configuration revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationRevision withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * Required. The revision number of the configuration.
     * 
     * @param revision
     *        Required. The revision number of the configuration.
     */

    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    /**
     * Required. The revision number of the configuration.
     * 
     * @return Required. The revision number of the configuration.
     */

    public Integer getRevision() {
        return this.revision;
    }

    /**
     * Required. The revision number of the configuration.
     * 
     * @param revision
     *        Required. The revision number of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationRevision withRevision(Integer revision) {
        setRevision(revision);
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
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigurationRevision == false)
            return false;
        ConfigurationRevision other = (ConfigurationRevision) obj;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        return hashCode;
    }

    @Override
    public ConfigurationRevision clone() {
        try {
            return (ConfigurationRevision) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mq.model.transform.ConfigurationRevisionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
