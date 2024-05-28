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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/DetectProfileObjectType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectProfileObjectTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A string that is serialized from a JSON object.
     * </p>
     */
    private java.util.List<String> objects;
    /**
     * <p>
     * The unique name of the domain.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * A string that is serialized from a JSON object.
     * </p>
     * 
     * @return A string that is serialized from a JSON object.
     */

    public java.util.List<String> getObjects() {
        return objects;
    }

    /**
     * <p>
     * A string that is serialized from a JSON object.
     * </p>
     * 
     * @param objects
     *        A string that is serialized from a JSON object.
     */

    public void setObjects(java.util.Collection<String> objects) {
        if (objects == null) {
            this.objects = null;
            return;
        }

        this.objects = new java.util.ArrayList<String>(objects);
    }

    /**
     * <p>
     * A string that is serialized from a JSON object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setObjects(java.util.Collection)} or {@link #withObjects(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param objects
     *        A string that is serialized from a JSON object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectProfileObjectTypeRequest withObjects(String... objects) {
        if (this.objects == null) {
            setObjects(new java.util.ArrayList<String>(objects.length));
        }
        for (String ele : objects) {
            this.objects.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A string that is serialized from a JSON object.
     * </p>
     * 
     * @param objects
     *        A string that is serialized from a JSON object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectProfileObjectTypeRequest withObjects(java.util.Collection<String> objects) {
        setObjects(objects);
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

    public DetectProfileObjectTypeRequest withDomainName(String domainName) {
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
        if (getObjects() != null)
            sb.append("Objects: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof DetectProfileObjectTypeRequest == false)
            return false;
        DetectProfileObjectTypeRequest other = (DetectProfileObjectTypeRequest) obj;
        if (other.getObjects() == null ^ this.getObjects() == null)
            return false;
        if (other.getObjects() != null && other.getObjects().equals(this.getObjects()) == false)
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

        hashCode = prime * hashCode + ((getObjects() == null) ? 0 : getObjects().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        return hashCode;
    }

    @Override
    public DetectProfileObjectTypeRequest clone() {
        return (DetectProfileObjectTypeRequest) super.clone();
    }

}
