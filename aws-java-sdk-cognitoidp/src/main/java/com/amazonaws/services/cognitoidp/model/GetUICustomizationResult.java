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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/GetUICustomization" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUICustomizationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The UI customization information.
     * </p>
     */
    private UICustomizationType uICustomization;

    /**
     * <p>
     * The UI customization information.
     * </p>
     * 
     * @param uICustomization
     *        The UI customization information.
     */

    public void setUICustomization(UICustomizationType uICustomization) {
        this.uICustomization = uICustomization;
    }

    /**
     * <p>
     * The UI customization information.
     * </p>
     * 
     * @return The UI customization information.
     */

    public UICustomizationType getUICustomization() {
        return this.uICustomization;
    }

    /**
     * <p>
     * The UI customization information.
     * </p>
     * 
     * @param uICustomization
     *        The UI customization information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUICustomizationResult withUICustomization(UICustomizationType uICustomization) {
        setUICustomization(uICustomization);
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
        if (getUICustomization() != null)
            sb.append("UICustomization: ").append(getUICustomization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUICustomizationResult == false)
            return false;
        GetUICustomizationResult other = (GetUICustomizationResult) obj;
        if (other.getUICustomization() == null ^ this.getUICustomization() == null)
            return false;
        if (other.getUICustomization() != null && other.getUICustomization().equals(this.getUICustomization()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUICustomization() == null) ? 0 : getUICustomization().hashCode());
        return hashCode;
    }

    @Override
    public GetUICustomizationResult clone() {
        try {
            return (GetUICustomizationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
