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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Application Response.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ApplicationResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationResponse implements Serializable, Cloneable, StructuredPojo {

    /** The unique application ID. */
    private String id;
    /** The display name of the application. */
    private String name;

    /**
     * The unique application ID.
     * 
     * @param id
     *        The unique application ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The unique application ID.
     * 
     * @return The unique application ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The unique application ID.
     * 
     * @param id
     *        The unique application ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationResponse withId(String id) {
        setId(id);
        return this;
    }

    /**
     * The display name of the application.
     * 
     * @param name
     *        The display name of the application.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The display name of the application.
     * 
     * @return The display name of the application.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The display name of the application.
     * 
     * @param name
     *        The display name of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationResponse withName(String name) {
        setName(name);
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
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationResponse == false)
            return false;
        ApplicationResponse other = (ApplicationResponse) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationResponse clone() {
        try {
            return (ApplicationResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.ApplicationResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
