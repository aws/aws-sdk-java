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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/GetEnabledBaseline" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEnabledBaselineResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details of the <code>EnabledBaseline</code> resource.
     * </p>
     */
    private EnabledBaselineDetails enabledBaselineDetails;

    /**
     * <p>
     * Details of the <code>EnabledBaseline</code> resource.
     * </p>
     * 
     * @param enabledBaselineDetails
     *        Details of the <code>EnabledBaseline</code> resource.
     */

    public void setEnabledBaselineDetails(EnabledBaselineDetails enabledBaselineDetails) {
        this.enabledBaselineDetails = enabledBaselineDetails;
    }

    /**
     * <p>
     * Details of the <code>EnabledBaseline</code> resource.
     * </p>
     * 
     * @return Details of the <code>EnabledBaseline</code> resource.
     */

    public EnabledBaselineDetails getEnabledBaselineDetails() {
        return this.enabledBaselineDetails;
    }

    /**
     * <p>
     * Details of the <code>EnabledBaseline</code> resource.
     * </p>
     * 
     * @param enabledBaselineDetails
     *        Details of the <code>EnabledBaseline</code> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnabledBaselineResult withEnabledBaselineDetails(EnabledBaselineDetails enabledBaselineDetails) {
        setEnabledBaselineDetails(enabledBaselineDetails);
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
        if (getEnabledBaselineDetails() != null)
            sb.append("EnabledBaselineDetails: ").append(getEnabledBaselineDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEnabledBaselineResult == false)
            return false;
        GetEnabledBaselineResult other = (GetEnabledBaselineResult) obj;
        if (other.getEnabledBaselineDetails() == null ^ this.getEnabledBaselineDetails() == null)
            return false;
        if (other.getEnabledBaselineDetails() != null && other.getEnabledBaselineDetails().equals(this.getEnabledBaselineDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabledBaselineDetails() == null) ? 0 : getEnabledBaselineDetails().hashCode());
        return hashCode;
    }

    @Override
    public GetEnabledBaselineResult clone() {
        try {
            return (GetEnabledBaselineResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
