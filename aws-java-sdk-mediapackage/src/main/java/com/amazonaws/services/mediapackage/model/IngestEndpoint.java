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
package com.amazonaws.services.mediapackage.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * An endpoint for ingesting source content for a Channel.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/IngestEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IngestEndpoint implements Serializable, Cloneable, StructuredPojo {

    /** The system generated unique identifier for the IngestEndpoint */
    private String id;
    /** The system generated password for ingest authentication. */
    private String password;
    /** The ingest URL to which the source stream should be sent. */
    private String url;
    /** The system generated username for ingest authentication. */
    private String username;

    /**
     * The system generated unique identifier for the IngestEndpoint
     * 
     * @param id
     *        The system generated unique identifier for the IngestEndpoint
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The system generated unique identifier for the IngestEndpoint
     * 
     * @return The system generated unique identifier for the IngestEndpoint
     */

    public String getId() {
        return this.id;
    }

    /**
     * The system generated unique identifier for the IngestEndpoint
     * 
     * @param id
     *        The system generated unique identifier for the IngestEndpoint
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestEndpoint withId(String id) {
        setId(id);
        return this;
    }

    /**
     * The system generated password for ingest authentication.
     * 
     * @param password
     *        The system generated password for ingest authentication.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * The system generated password for ingest authentication.
     * 
     * @return The system generated password for ingest authentication.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * The system generated password for ingest authentication.
     * 
     * @param password
     *        The system generated password for ingest authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestEndpoint withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * The ingest URL to which the source stream should be sent.
     * 
     * @param url
     *        The ingest URL to which the source stream should be sent.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * The ingest URL to which the source stream should be sent.
     * 
     * @return The ingest URL to which the source stream should be sent.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * The ingest URL to which the source stream should be sent.
     * 
     * @param url
     *        The ingest URL to which the source stream should be sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestEndpoint withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * The system generated username for ingest authentication.
     * 
     * @param username
     *        The system generated username for ingest authentication.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * The system generated username for ingest authentication.
     * 
     * @return The system generated username for ingest authentication.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * The system generated username for ingest authentication.
     * 
     * @param username
     *        The system generated username for ingest authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestEndpoint withUsername(String username) {
        setUsername(username);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append(getPassword()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IngestEndpoint == false)
            return false;
        IngestEndpoint other = (IngestEndpoint) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return hashCode;
    }

    @Override
    public IngestEndpoint clone() {
        try {
            return (IngestEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackage.model.transform.IngestEndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
