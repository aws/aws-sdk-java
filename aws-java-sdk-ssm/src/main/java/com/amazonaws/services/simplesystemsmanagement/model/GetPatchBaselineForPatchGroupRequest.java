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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetPatchBaselineForPatchGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPatchBaselineForPatchGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the patch group whose patch baseline should be retrieved.
     * </p>
     */
    private String patchGroup;
    /**
     * <p>
     * Returns he operating system rule specified for patch groups using the patch baseline.
     * </p>
     */
    private String operatingSystem;

    /**
     * <p>
     * The name of the patch group whose patch baseline should be retrieved.
     * </p>
     * 
     * @param patchGroup
     *        The name of the patch group whose patch baseline should be retrieved.
     */

    public void setPatchGroup(String patchGroup) {
        this.patchGroup = patchGroup;
    }

    /**
     * <p>
     * The name of the patch group whose patch baseline should be retrieved.
     * </p>
     * 
     * @return The name of the patch group whose patch baseline should be retrieved.
     */

    public String getPatchGroup() {
        return this.patchGroup;
    }

    /**
     * <p>
     * The name of the patch group whose patch baseline should be retrieved.
     * </p>
     * 
     * @param patchGroup
     *        The name of the patch group whose patch baseline should be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPatchBaselineForPatchGroupRequest withPatchGroup(String patchGroup) {
        setPatchGroup(patchGroup);
        return this;
    }

    /**
     * <p>
     * Returns he operating system rule specified for patch groups using the patch baseline.
     * </p>
     * 
     * @param operatingSystem
     *        Returns he operating system rule specified for patch groups using the patch baseline.
     * @see OperatingSystem
     */

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * Returns he operating system rule specified for patch groups using the patch baseline.
     * </p>
     * 
     * @return Returns he operating system rule specified for patch groups using the patch baseline.
     * @see OperatingSystem
     */

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * <p>
     * Returns he operating system rule specified for patch groups using the patch baseline.
     * </p>
     * 
     * @param operatingSystem
     *        Returns he operating system rule specified for patch groups using the patch baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public GetPatchBaselineForPatchGroupRequest withOperatingSystem(String operatingSystem) {
        setOperatingSystem(operatingSystem);
        return this;
    }

    /**
     * <p>
     * Returns he operating system rule specified for patch groups using the patch baseline.
     * </p>
     * 
     * @param operatingSystem
     *        Returns he operating system rule specified for patch groups using the patch baseline.
     * @see OperatingSystem
     */

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        withOperatingSystem(operatingSystem);
    }

    /**
     * <p>
     * Returns he operating system rule specified for patch groups using the patch baseline.
     * </p>
     * 
     * @param operatingSystem
     *        Returns he operating system rule specified for patch groups using the patch baseline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public GetPatchBaselineForPatchGroupRequest withOperatingSystem(OperatingSystem operatingSystem) {
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
        if (getPatchGroup() != null)
            sb.append("PatchGroup: ").append(getPatchGroup()).append(",");
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

        if (obj instanceof GetPatchBaselineForPatchGroupRequest == false)
            return false;
        GetPatchBaselineForPatchGroupRequest other = (GetPatchBaselineForPatchGroupRequest) obj;
        if (other.getPatchGroup() == null ^ this.getPatchGroup() == null)
            return false;
        if (other.getPatchGroup() != null && other.getPatchGroup().equals(this.getPatchGroup()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getPatchGroup() == null) ? 0 : getPatchGroup().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        return hashCode;
    }

    @Override
    public GetPatchBaselineForPatchGroupRequest clone() {
        return (GetPatchBaselineForPatchGroupRequest) super.clone();
    }

}
