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
package com.amazonaws.services.appintegrations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of an event that the application publishes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/Publication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Publication implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the publication.
     * </p>
     */
    private String event;
    /**
     * <p>
     * The JSON schema of the publication event.
     * </p>
     */
    private String schema;
    /**
     * <p>
     * The description of the publication.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The name of the publication.
     * </p>
     * 
     * @param event
     *        The name of the publication.
     */

    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * <p>
     * The name of the publication.
     * </p>
     * 
     * @return The name of the publication.
     */

    public String getEvent() {
        return this.event;
    }

    /**
     * <p>
     * The name of the publication.
     * </p>
     * 
     * @param event
     *        The name of the publication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Publication withEvent(String event) {
        setEvent(event);
        return this;
    }

    /**
     * <p>
     * The JSON schema of the publication event.
     * </p>
     * 
     * @param schema
     *        The JSON schema of the publication event.
     */

    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * The JSON schema of the publication event.
     * </p>
     * 
     * @return The JSON schema of the publication event.
     */

    public String getSchema() {
        return this.schema;
    }

    /**
     * <p>
     * The JSON schema of the publication event.
     * </p>
     * 
     * @param schema
     *        The JSON schema of the publication event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Publication withSchema(String schema) {
        setSchema(schema);
        return this;
    }

    /**
     * <p>
     * The description of the publication.
     * </p>
     * 
     * @param description
     *        The description of the publication.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the publication.
     * </p>
     * 
     * @return The description of the publication.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the publication.
     * </p>
     * 
     * @param description
     *        The description of the publication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Publication withDescription(String description) {
        setDescription(description);
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
        if (getEvent() != null)
            sb.append("Event: ").append(getEvent()).append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Publication == false)
            return false;
        Publication other = (Publication) obj;
        if (other.getEvent() == null ^ this.getEvent() == null)
            return false;
        if (other.getEvent() != null && other.getEvent().equals(this.getEvent()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvent() == null) ? 0 : getEvent().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public Publication clone() {
        try {
            return (Publication) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appintegrations.model.transform.PublicationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
