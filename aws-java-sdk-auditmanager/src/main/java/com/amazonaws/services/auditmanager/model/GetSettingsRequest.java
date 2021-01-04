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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of <code>SettingAttribute</code> enum values.
     * </p>
     */
    private String attribute;

    /**
     * <p>
     * The list of <code>SettingAttribute</code> enum values.
     * </p>
     * 
     * @param attribute
     *        The list of <code>SettingAttribute</code> enum values.
     * @see SettingAttribute
     */

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The list of <code>SettingAttribute</code> enum values.
     * </p>
     * 
     * @return The list of <code>SettingAttribute</code> enum values.
     * @see SettingAttribute
     */

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * The list of <code>SettingAttribute</code> enum values.
     * </p>
     * 
     * @param attribute
     *        The list of <code>SettingAttribute</code> enum values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SettingAttribute
     */

    public GetSettingsRequest withAttribute(String attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * The list of <code>SettingAttribute</code> enum values.
     * </p>
     * 
     * @param attribute
     *        The list of <code>SettingAttribute</code> enum values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SettingAttribute
     */

    public GetSettingsRequest withAttribute(SettingAttribute attribute) {
        this.attribute = attribute.toString();
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
        if (getAttribute() != null)
            sb.append("Attribute: ").append(getAttribute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSettingsRequest == false)
            return false;
        GetSettingsRequest other = (GetSettingsRequest) obj;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        return hashCode;
    }

    @Override
    public GetSettingsRequest clone() {
        return (GetSettingsRequest) super.clone();
    }

}
