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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/GetEnabledControl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEnabledControlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>controlIdentifier</code> of the enabled control.
     * </p>
     */
    private String enabledControlIdentifier;

    /**
     * <p>
     * The <code>controlIdentifier</code> of the enabled control.
     * </p>
     * 
     * @param enabledControlIdentifier
     *        The <code>controlIdentifier</code> of the enabled control.
     */

    public void setEnabledControlIdentifier(String enabledControlIdentifier) {
        this.enabledControlIdentifier = enabledControlIdentifier;
    }

    /**
     * <p>
     * The <code>controlIdentifier</code> of the enabled control.
     * </p>
     * 
     * @return The <code>controlIdentifier</code> of the enabled control.
     */

    public String getEnabledControlIdentifier() {
        return this.enabledControlIdentifier;
    }

    /**
     * <p>
     * The <code>controlIdentifier</code> of the enabled control.
     * </p>
     * 
     * @param enabledControlIdentifier
     *        The <code>controlIdentifier</code> of the enabled control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnabledControlRequest withEnabledControlIdentifier(String enabledControlIdentifier) {
        setEnabledControlIdentifier(enabledControlIdentifier);
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
        if (getEnabledControlIdentifier() != null)
            sb.append("EnabledControlIdentifier: ").append(getEnabledControlIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEnabledControlRequest == false)
            return false;
        GetEnabledControlRequest other = (GetEnabledControlRequest) obj;
        if (other.getEnabledControlIdentifier() == null ^ this.getEnabledControlIdentifier() == null)
            return false;
        if (other.getEnabledControlIdentifier() != null && other.getEnabledControlIdentifier().equals(this.getEnabledControlIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabledControlIdentifier() == null) ? 0 : getEnabledControlIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public GetEnabledControlRequest clone() {
        return (GetEnabledControlRequest) super.clone();
    }

}
