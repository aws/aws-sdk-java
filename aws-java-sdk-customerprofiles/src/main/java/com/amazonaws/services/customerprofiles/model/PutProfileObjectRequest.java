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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/PutProfileObject" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutProfileObjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the profile object type.
     * </p>
     */
    private String objectTypeName;
    /**
     * <p>
     * A string that is serialized from a JSON object.
     * </p>
     */
    private String object;
    /**
     * <p>
     * The unique name of the domain.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * The name of the profile object type.
     * </p>
     * 
     * @param objectTypeName
     *        The name of the profile object type.
     */

    public void setObjectTypeName(String objectTypeName) {
        this.objectTypeName = objectTypeName;
    }

    /**
     * <p>
     * The name of the profile object type.
     * </p>
     * 
     * @return The name of the profile object type.
     */

    public String getObjectTypeName() {
        return this.objectTypeName;
    }

    /**
     * <p>
     * The name of the profile object type.
     * </p>
     * 
     * @param objectTypeName
     *        The name of the profile object type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutProfileObjectRequest withObjectTypeName(String objectTypeName) {
        setObjectTypeName(objectTypeName);
        return this;
    }

    /**
     * <p>
     * A string that is serialized from a JSON object.
     * </p>
     * 
     * @param object
     *        A string that is serialized from a JSON object.
     */

    public void setObject(String object) {
        this.object = object;
    }

    /**
     * <p>
     * A string that is serialized from a JSON object.
     * </p>
     * 
     * @return A string that is serialized from a JSON object.
     */

    public String getObject() {
        return this.object;
    }

    /**
     * <p>
     * A string that is serialized from a JSON object.
     * </p>
     * 
     * @param object
     *        A string that is serialized from a JSON object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutProfileObjectRequest withObject(String object) {
        setObject(object);
        return this;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @return The unique name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutProfileObjectRequest withDomainName(String domainName) {
        setDomainName(domainName);
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
        if (getObjectTypeName() != null)
            sb.append("ObjectTypeName: ").append(getObjectTypeName()).append(",");
        if (getObject() != null)
            sb.append("Object: ").append(getObject()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutProfileObjectRequest == false)
            return false;
        PutProfileObjectRequest other = (PutProfileObjectRequest) obj;
        if (other.getObjectTypeName() == null ^ this.getObjectTypeName() == null)
            return false;
        if (other.getObjectTypeName() != null && other.getObjectTypeName().equals(this.getObjectTypeName()) == false)
            return false;
        if (other.getObject() == null ^ this.getObject() == null)
            return false;
        if (other.getObject() != null && other.getObject().equals(this.getObject()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObjectTypeName() == null) ? 0 : getObjectTypeName().hashCode());
        hashCode = prime * hashCode + ((getObject() == null) ? 0 : getObject().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        return hashCode;
    }

    @Override
    public PutProfileObjectRequest clone() {
        return (PutProfileObjectRequest) super.clone();
    }

}
