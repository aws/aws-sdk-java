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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BatchDeletePhoneNumber" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeletePhoneNumberRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * List of phone number IDs.
     * </p>
     */
    private java.util.List<String> phoneNumberIds;

    /**
     * <p>
     * List of phone number IDs.
     * </p>
     * 
     * @return List of phone number IDs.
     */

    public java.util.List<String> getPhoneNumberIds() {
        return phoneNumberIds;
    }

    /**
     * <p>
     * List of phone number IDs.
     * </p>
     * 
     * @param phoneNumberIds
     *        List of phone number IDs.
     */

    public void setPhoneNumberIds(java.util.Collection<String> phoneNumberIds) {
        if (phoneNumberIds == null) {
            this.phoneNumberIds = null;
            return;
        }

        this.phoneNumberIds = new java.util.ArrayList<String>(phoneNumberIds);
    }

    /**
     * <p>
     * List of phone number IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhoneNumberIds(java.util.Collection)} or {@link #withPhoneNumberIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param phoneNumberIds
     *        List of phone number IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeletePhoneNumberRequest withPhoneNumberIds(String... phoneNumberIds) {
        if (this.phoneNumberIds == null) {
            setPhoneNumberIds(new java.util.ArrayList<String>(phoneNumberIds.length));
        }
        for (String ele : phoneNumberIds) {
            this.phoneNumberIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of phone number IDs.
     * </p>
     * 
     * @param phoneNumberIds
     *        List of phone number IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeletePhoneNumberRequest withPhoneNumberIds(java.util.Collection<String> phoneNumberIds) {
        setPhoneNumberIds(phoneNumberIds);
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
        if (getPhoneNumberIds() != null)
            sb.append("PhoneNumberIds: ").append(getPhoneNumberIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeletePhoneNumberRequest == false)
            return false;
        BatchDeletePhoneNumberRequest other = (BatchDeletePhoneNumberRequest) obj;
        if (other.getPhoneNumberIds() == null ^ this.getPhoneNumberIds() == null)
            return false;
        if (other.getPhoneNumberIds() != null && other.getPhoneNumberIds().equals(this.getPhoneNumberIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPhoneNumberIds() == null) ? 0 : getPhoneNumberIds().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeletePhoneNumberRequest clone() {
        return (BatchDeletePhoneNumberRequest) super.clone();
    }

}
