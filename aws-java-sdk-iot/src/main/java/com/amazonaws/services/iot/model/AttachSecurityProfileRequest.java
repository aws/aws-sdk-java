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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachSecurityProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The security profile that is attached.
     * </p>
     */
    private String securityProfileName;
    /**
     * <p>
     * The ARN of the target (thing group) to which the security profile is attached.
     * </p>
     */
    private String securityProfileTargetArn;

    /**
     * <p>
     * The security profile that is attached.
     * </p>
     * 
     * @param securityProfileName
     *        The security profile that is attached.
     */

    public void setSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
    }

    /**
     * <p>
     * The security profile that is attached.
     * </p>
     * 
     * @return The security profile that is attached.
     */

    public String getSecurityProfileName() {
        return this.securityProfileName;
    }

    /**
     * <p>
     * The security profile that is attached.
     * </p>
     * 
     * @param securityProfileName
     *        The security profile that is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachSecurityProfileRequest withSecurityProfileName(String securityProfileName) {
        setSecurityProfileName(securityProfileName);
        return this;
    }

    /**
     * <p>
     * The ARN of the target (thing group) to which the security profile is attached.
     * </p>
     * 
     * @param securityProfileTargetArn
     *        The ARN of the target (thing group) to which the security profile is attached.
     */

    public void setSecurityProfileTargetArn(String securityProfileTargetArn) {
        this.securityProfileTargetArn = securityProfileTargetArn;
    }

    /**
     * <p>
     * The ARN of the target (thing group) to which the security profile is attached.
     * </p>
     * 
     * @return The ARN of the target (thing group) to which the security profile is attached.
     */

    public String getSecurityProfileTargetArn() {
        return this.securityProfileTargetArn;
    }

    /**
     * <p>
     * The ARN of the target (thing group) to which the security profile is attached.
     * </p>
     * 
     * @param securityProfileTargetArn
     *        The ARN of the target (thing group) to which the security profile is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachSecurityProfileRequest withSecurityProfileTargetArn(String securityProfileTargetArn) {
        setSecurityProfileTargetArn(securityProfileTargetArn);
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
        if (getSecurityProfileName() != null)
            sb.append("SecurityProfileName: ").append(getSecurityProfileName()).append(",");
        if (getSecurityProfileTargetArn() != null)
            sb.append("SecurityProfileTargetArn: ").append(getSecurityProfileTargetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachSecurityProfileRequest == false)
            return false;
        AttachSecurityProfileRequest other = (AttachSecurityProfileRequest) obj;
        if (other.getSecurityProfileName() == null ^ this.getSecurityProfileName() == null)
            return false;
        if (other.getSecurityProfileName() != null && other.getSecurityProfileName().equals(this.getSecurityProfileName()) == false)
            return false;
        if (other.getSecurityProfileTargetArn() == null ^ this.getSecurityProfileTargetArn() == null)
            return false;
        if (other.getSecurityProfileTargetArn() != null && other.getSecurityProfileTargetArn().equals(this.getSecurityProfileTargetArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityProfileName() == null) ? 0 : getSecurityProfileName().hashCode());
        hashCode = prime * hashCode + ((getSecurityProfileTargetArn() == null) ? 0 : getSecurityProfileTargetArn().hashCode());
        return hashCode;
    }

    @Override
    public AttachSecurityProfileRequest clone() {
        return (AttachSecurityProfileRequest) super.clone();
    }

}
