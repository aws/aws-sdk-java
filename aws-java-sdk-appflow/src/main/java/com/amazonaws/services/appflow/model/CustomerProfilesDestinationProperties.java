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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The properties that are applied when Amazon Connect Customer Profiles is used as a destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/CustomerProfilesDestinationProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomerProfilesDestinationProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique name of the Amazon Connect Customer Profiles domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The object specified in the Amazon Connect Customer Profiles flow destination.
     * </p>
     */
    private String objectTypeName;

    /**
     * <p>
     * The unique name of the Amazon Connect Customer Profiles domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the Amazon Connect Customer Profiles domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The unique name of the Amazon Connect Customer Profiles domain.
     * </p>
     * 
     * @return The unique name of the Amazon Connect Customer Profiles domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The unique name of the Amazon Connect Customer Profiles domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the Amazon Connect Customer Profiles domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerProfilesDestinationProperties withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The object specified in the Amazon Connect Customer Profiles flow destination.
     * </p>
     * 
     * @param objectTypeName
     *        The object specified in the Amazon Connect Customer Profiles flow destination.
     */

    public void setObjectTypeName(String objectTypeName) {
        this.objectTypeName = objectTypeName;
    }

    /**
     * <p>
     * The object specified in the Amazon Connect Customer Profiles flow destination.
     * </p>
     * 
     * @return The object specified in the Amazon Connect Customer Profiles flow destination.
     */

    public String getObjectTypeName() {
        return this.objectTypeName;
    }

    /**
     * <p>
     * The object specified in the Amazon Connect Customer Profiles flow destination.
     * </p>
     * 
     * @param objectTypeName
     *        The object specified in the Amazon Connect Customer Profiles flow destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerProfilesDestinationProperties withObjectTypeName(String objectTypeName) {
        setObjectTypeName(objectTypeName);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getObjectTypeName() != null)
            sb.append("ObjectTypeName: ").append(getObjectTypeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomerProfilesDestinationProperties == false)
            return false;
        CustomerProfilesDestinationProperties other = (CustomerProfilesDestinationProperties) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getObjectTypeName() == null ^ this.getObjectTypeName() == null)
            return false;
        if (other.getObjectTypeName() != null && other.getObjectTypeName().equals(this.getObjectTypeName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getObjectTypeName() == null) ? 0 : getObjectTypeName().hashCode());
        return hashCode;
    }

    @Override
    public CustomerProfilesDestinationProperties clone() {
        try {
            return (CustomerProfilesDestinationProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.CustomerProfilesDestinationPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
