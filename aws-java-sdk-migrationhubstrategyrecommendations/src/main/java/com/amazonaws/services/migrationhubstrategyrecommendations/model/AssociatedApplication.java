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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object containing details about applications as defined in Application Discovery Service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/AssociatedApplication"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociatedApplication implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ID of the application as defined in Application Discovery Service.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Name of the application as defined in Application Discovery Service.
     * </p>
     */
    private String name;

    /**
     * <p>
     * ID of the application as defined in Application Discovery Service.
     * </p>
     * 
     * @param id
     *        ID of the application as defined in Application Discovery Service.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * ID of the application as defined in Application Discovery Service.
     * </p>
     * 
     * @return ID of the application as defined in Application Discovery Service.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * ID of the application as defined in Application Discovery Service.
     * </p>
     * 
     * @param id
     *        ID of the application as defined in Application Discovery Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociatedApplication withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Name of the application as defined in Application Discovery Service.
     * </p>
     * 
     * @param name
     *        Name of the application as defined in Application Discovery Service.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the application as defined in Application Discovery Service.
     * </p>
     * 
     * @return Name of the application as defined in Application Discovery Service.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the application as defined in Application Discovery Service.
     * </p>
     * 
     * @param name
     *        Name of the application as defined in Application Discovery Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociatedApplication withName(String name) {
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

        if (obj instanceof AssociatedApplication == false)
            return false;
        AssociatedApplication other = (AssociatedApplication) obj;
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
    public AssociatedApplication clone() {
        try {
            return (AssociatedApplication) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.AssociatedApplicationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
