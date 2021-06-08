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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/DeleteProfileKey" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteProfileKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of a customer profile.
     * </p>
     */
    private String profileId;
    /**
     * <p>
     * A searchable identifier of a customer profile.
     * </p>
     */
    private String keyName;
    /**
     * <p>
     * A list of key values.
     * </p>
     */
    private java.util.List<String> values;
    /**
     * <p>
     * The unique name of the domain.
     * </p>
     */
    private String domainName;

    /**
     * <p>
     * The unique identifier of a customer profile.
     * </p>
     * 
     * @param profileId
     *        The unique identifier of a customer profile.
     */

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    /**
     * <p>
     * The unique identifier of a customer profile.
     * </p>
     * 
     * @return The unique identifier of a customer profile.
     */

    public String getProfileId() {
        return this.profileId;
    }

    /**
     * <p>
     * The unique identifier of a customer profile.
     * </p>
     * 
     * @param profileId
     *        The unique identifier of a customer profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProfileKeyRequest withProfileId(String profileId) {
        setProfileId(profileId);
        return this;
    }

    /**
     * <p>
     * A searchable identifier of a customer profile.
     * </p>
     * 
     * @param keyName
     *        A searchable identifier of a customer profile.
     */

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * A searchable identifier of a customer profile.
     * </p>
     * 
     * @return A searchable identifier of a customer profile.
     */

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * <p>
     * A searchable identifier of a customer profile.
     * </p>
     * 
     * @param keyName
     *        A searchable identifier of a customer profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProfileKeyRequest withKeyName(String keyName) {
        setKeyName(keyName);
        return this;
    }

    /**
     * <p>
     * A list of key values.
     * </p>
     * 
     * @return A list of key values.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * A list of key values.
     * </p>
     * 
     * @param values
     *        A list of key values.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * A list of key values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        A list of key values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProfileKeyRequest withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key values.
     * </p>
     * 
     * @param values
     *        A list of key values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProfileKeyRequest withValues(java.util.Collection<String> values) {
        setValues(values);
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

    public DeleteProfileKeyRequest withDomainName(String domainName) {
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
        if (getProfileId() != null)
            sb.append("ProfileId: ").append(getProfileId()).append(",");
        if (getKeyName() != null)
            sb.append("KeyName: ").append(getKeyName()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues()).append(",");
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

        if (obj instanceof DeleteProfileKeyRequest == false)
            return false;
        DeleteProfileKeyRequest other = (DeleteProfileKeyRequest) obj;
        if (other.getProfileId() == null ^ this.getProfileId() == null)
            return false;
        if (other.getProfileId() != null && other.getProfileId().equals(this.getProfileId()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
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

        hashCode = prime * hashCode + ((getProfileId() == null) ? 0 : getProfileId().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteProfileKeyRequest clone() {
        return (DeleteProfileKeyRequest) super.clone();
    }

}
