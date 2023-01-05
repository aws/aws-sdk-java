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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateSecurityProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSecurityProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the security profle.
     * </p>
     */
    private String securityProfileId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the security profile.
     * </p>
     */
    private String securityProfileArn;

    /**
     * <p>
     * The identifier for the security profle.
     * </p>
     * 
     * @param securityProfileId
     *        The identifier for the security profle.
     */

    public void setSecurityProfileId(String securityProfileId) {
        this.securityProfileId = securityProfileId;
    }

    /**
     * <p>
     * The identifier for the security profle.
     * </p>
     * 
     * @return The identifier for the security profle.
     */

    public String getSecurityProfileId() {
        return this.securityProfileId;
    }

    /**
     * <p>
     * The identifier for the security profle.
     * </p>
     * 
     * @param securityProfileId
     *        The identifier for the security profle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityProfileResult withSecurityProfileId(String securityProfileId) {
        setSecurityProfileId(securityProfileId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the security profile.
     * </p>
     * 
     * @param securityProfileArn
     *        The Amazon Resource Name (ARN) for the security profile.
     */

    public void setSecurityProfileArn(String securityProfileArn) {
        this.securityProfileArn = securityProfileArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the security profile.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the security profile.
     */

    public String getSecurityProfileArn() {
        return this.securityProfileArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the security profile.
     * </p>
     * 
     * @param securityProfileArn
     *        The Amazon Resource Name (ARN) for the security profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityProfileResult withSecurityProfileArn(String securityProfileArn) {
        setSecurityProfileArn(securityProfileArn);
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
        if (getSecurityProfileId() != null)
            sb.append("SecurityProfileId: ").append(getSecurityProfileId()).append(",");
        if (getSecurityProfileArn() != null)
            sb.append("SecurityProfileArn: ").append(getSecurityProfileArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSecurityProfileResult == false)
            return false;
        CreateSecurityProfileResult other = (CreateSecurityProfileResult) obj;
        if (other.getSecurityProfileId() == null ^ this.getSecurityProfileId() == null)
            return false;
        if (other.getSecurityProfileId() != null && other.getSecurityProfileId().equals(this.getSecurityProfileId()) == false)
            return false;
        if (other.getSecurityProfileArn() == null ^ this.getSecurityProfileArn() == null)
            return false;
        if (other.getSecurityProfileArn() != null && other.getSecurityProfileArn().equals(this.getSecurityProfileArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityProfileId() == null) ? 0 : getSecurityProfileId().hashCode());
        hashCode = prime * hashCode + ((getSecurityProfileArn() == null) ? 0 : getSecurityProfileArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateSecurityProfileResult clone() {
        try {
            return (CreateSecurityProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
