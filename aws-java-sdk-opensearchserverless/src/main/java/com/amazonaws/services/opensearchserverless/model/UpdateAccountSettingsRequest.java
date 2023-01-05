/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateAccountSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAccountSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private CapacityLimits capacityLimits;

    /**
     * @param capacityLimits
     */

    public void setCapacityLimits(CapacityLimits capacityLimits) {
        this.capacityLimits = capacityLimits;
    }

    /**
     * @return
     */

    public CapacityLimits getCapacityLimits() {
        return this.capacityLimits;
    }

    /**
     * @param capacityLimits
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountSettingsRequest withCapacityLimits(CapacityLimits capacityLimits) {
        setCapacityLimits(capacityLimits);
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
        if (getCapacityLimits() != null)
            sb.append("CapacityLimits: ").append(getCapacityLimits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAccountSettingsRequest == false)
            return false;
        UpdateAccountSettingsRequest other = (UpdateAccountSettingsRequest) obj;
        if (other.getCapacityLimits() == null ^ this.getCapacityLimits() == null)
            return false;
        if (other.getCapacityLimits() != null && other.getCapacityLimits().equals(this.getCapacityLimits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacityLimits() == null) ? 0 : getCapacityLimits().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAccountSettingsRequest clone() {
        return (UpdateAccountSettingsRequest) super.clone();
    }

}
