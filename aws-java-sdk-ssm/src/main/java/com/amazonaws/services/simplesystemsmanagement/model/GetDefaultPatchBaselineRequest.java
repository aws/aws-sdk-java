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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetDefaultPatchBaseline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDefaultPatchBaselineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the default patch baseline for the specified operating system.
     * </p>
     */
    private String operatingSystem;

    /**
     * <p>
     * Returns the default patch baseline for the specified operating system.
     * </p>
     * 
     * @param operatingSystem
     *        Returns the default patch baseline for the specified operating system.
     * @see OperatingSystem
     */

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * Returns the default patch baseline for the specified operating system.
     * </p>
     * 
     * @return Returns the default patch baseline for the specified operating system.
     * @see OperatingSystem
     */

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * <p>
     * Returns the default patch baseline for the specified operating system.
     * </p>
     * 
     * @param operatingSystem
     *        Returns the default patch baseline for the specified operating system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public GetDefaultPatchBaselineRequest withOperatingSystem(String operatingSystem) {
        setOperatingSystem(operatingSystem);
        return this;
    }

    /**
     * <p>
     * Returns the default patch baseline for the specified operating system.
     * </p>
     * 
     * @param operatingSystem
     *        Returns the default patch baseline for the specified operating system.
     * @see OperatingSystem
     */

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        withOperatingSystem(operatingSystem);
    }

    /**
     * <p>
     * Returns the default patch baseline for the specified operating system.
     * </p>
     * 
     * @param operatingSystem
     *        Returns the default patch baseline for the specified operating system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public GetDefaultPatchBaselineRequest withOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem.toString();
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
        if (getOperatingSystem() != null)
            sb.append("OperatingSystem: ").append(getOperatingSystem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDefaultPatchBaselineRequest == false)
            return false;
        GetDefaultPatchBaselineRequest other = (GetDefaultPatchBaselineRequest) obj;
        if (other.getOperatingSystem() == null ^ this.getOperatingSystem() == null)
            return false;
        if (other.getOperatingSystem() != null && other.getOperatingSystem().equals(this.getOperatingSystem()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        return hashCode;
    }

    @Override
    public GetDefaultPatchBaselineRequest clone() {
        return (GetDefaultPatchBaselineRequest) super.clone();
    }

}
