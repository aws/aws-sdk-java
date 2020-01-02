/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/EnableAddOn" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableAddOnRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the source resource for which to enable or modify the add-on.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * An array of strings representing the add-on to enable or modify.
     * </p>
     */
    private AddOnRequest addOnRequest;

    /**
     * <p>
     * The name of the source resource for which to enable or modify the add-on.
     * </p>
     * 
     * @param resourceName
     *        The name of the source resource for which to enable or modify the add-on.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The name of the source resource for which to enable or modify the add-on.
     * </p>
     * 
     * @return The name of the source resource for which to enable or modify the add-on.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The name of the source resource for which to enable or modify the add-on.
     * </p>
     * 
     * @param resourceName
     *        The name of the source resource for which to enable or modify the add-on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableAddOnRequest withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * An array of strings representing the add-on to enable or modify.
     * </p>
     * 
     * @param addOnRequest
     *        An array of strings representing the add-on to enable or modify.
     */

    public void setAddOnRequest(AddOnRequest addOnRequest) {
        this.addOnRequest = addOnRequest;
    }

    /**
     * <p>
     * An array of strings representing the add-on to enable or modify.
     * </p>
     * 
     * @return An array of strings representing the add-on to enable or modify.
     */

    public AddOnRequest getAddOnRequest() {
        return this.addOnRequest;
    }

    /**
     * <p>
     * An array of strings representing the add-on to enable or modify.
     * </p>
     * 
     * @param addOnRequest
     *        An array of strings representing the add-on to enable or modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableAddOnRequest withAddOnRequest(AddOnRequest addOnRequest) {
        setAddOnRequest(addOnRequest);
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
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
        if (getAddOnRequest() != null)
            sb.append("AddOnRequest: ").append(getAddOnRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableAddOnRequest == false)
            return false;
        EnableAddOnRequest other = (EnableAddOnRequest) obj;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getAddOnRequest() == null ^ this.getAddOnRequest() == null)
            return false;
        if (other.getAddOnRequest() != null && other.getAddOnRequest().equals(this.getAddOnRequest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getAddOnRequest() == null) ? 0 : getAddOnRequest().hashCode());
        return hashCode;
    }

    @Override
    public EnableAddOnRequest clone() {
        return (EnableAddOnRequest) super.clone();
    }

}
