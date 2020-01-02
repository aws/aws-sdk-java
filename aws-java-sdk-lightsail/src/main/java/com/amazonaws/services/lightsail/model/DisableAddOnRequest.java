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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DisableAddOn" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisableAddOnRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The add-on type to disable.
     * </p>
     */
    private String addOnType;
    /**
     * <p>
     * The name of the source resource for which to disable the add-on.
     * </p>
     */
    private String resourceName;

    /**
     * <p>
     * The add-on type to disable.
     * </p>
     * 
     * @param addOnType
     *        The add-on type to disable.
     * @see AddOnType
     */

    public void setAddOnType(String addOnType) {
        this.addOnType = addOnType;
    }

    /**
     * <p>
     * The add-on type to disable.
     * </p>
     * 
     * @return The add-on type to disable.
     * @see AddOnType
     */

    public String getAddOnType() {
        return this.addOnType;
    }

    /**
     * <p>
     * The add-on type to disable.
     * </p>
     * 
     * @param addOnType
     *        The add-on type to disable.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddOnType
     */

    public DisableAddOnRequest withAddOnType(String addOnType) {
        setAddOnType(addOnType);
        return this;
    }

    /**
     * <p>
     * The add-on type to disable.
     * </p>
     * 
     * @param addOnType
     *        The add-on type to disable.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AddOnType
     */

    public DisableAddOnRequest withAddOnType(AddOnType addOnType) {
        this.addOnType = addOnType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the source resource for which to disable the add-on.
     * </p>
     * 
     * @param resourceName
     *        The name of the source resource for which to disable the add-on.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The name of the source resource for which to disable the add-on.
     * </p>
     * 
     * @return The name of the source resource for which to disable the add-on.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The name of the source resource for which to disable the add-on.
     * </p>
     * 
     * @param resourceName
     *        The name of the source resource for which to disable the add-on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisableAddOnRequest withResourceName(String resourceName) {
        setResourceName(resourceName);
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
        if (getAddOnType() != null)
            sb.append("AddOnType: ").append(getAddOnType()).append(",");
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableAddOnRequest == false)
            return false;
        DisableAddOnRequest other = (DisableAddOnRequest) obj;
        if (other.getAddOnType() == null ^ this.getAddOnType() == null)
            return false;
        if (other.getAddOnType() != null && other.getAddOnType().equals(this.getAddOnType()) == false)
            return false;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddOnType() == null) ? 0 : getAddOnType().hashCode());
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        return hashCode;
    }

    @Override
    public DisableAddOnRequest clone() {
        return (DisableAddOnRequest) super.clone();
    }

}
