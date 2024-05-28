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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetSecurityControlDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSecurityControlDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the security control to retrieve the definition for. This field doesn’t accept an Amazon Resource Name
     * (ARN).
     * </p>
     */
    private String securityControlId;

    /**
     * <p>
     * The ID of the security control to retrieve the definition for. This field doesn’t accept an Amazon Resource Name
     * (ARN).
     * </p>
     * 
     * @param securityControlId
     *        The ID of the security control to retrieve the definition for. This field doesn’t accept an Amazon
     *        Resource Name (ARN).
     */

    public void setSecurityControlId(String securityControlId) {
        this.securityControlId = securityControlId;
    }

    /**
     * <p>
     * The ID of the security control to retrieve the definition for. This field doesn’t accept an Amazon Resource Name
     * (ARN).
     * </p>
     * 
     * @return The ID of the security control to retrieve the definition for. This field doesn’t accept an Amazon
     *         Resource Name (ARN).
     */

    public String getSecurityControlId() {
        return this.securityControlId;
    }

    /**
     * <p>
     * The ID of the security control to retrieve the definition for. This field doesn’t accept an Amazon Resource Name
     * (ARN).
     * </p>
     * 
     * @param securityControlId
     *        The ID of the security control to retrieve the definition for. This field doesn’t accept an Amazon
     *        Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSecurityControlDefinitionRequest withSecurityControlId(String securityControlId) {
        setSecurityControlId(securityControlId);
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
        if (getSecurityControlId() != null)
            sb.append("SecurityControlId: ").append(getSecurityControlId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSecurityControlDefinitionRequest == false)
            return false;
        GetSecurityControlDefinitionRequest other = (GetSecurityControlDefinitionRequest) obj;
        if (other.getSecurityControlId() == null ^ this.getSecurityControlId() == null)
            return false;
        if (other.getSecurityControlId() != null && other.getSecurityControlId().equals(this.getSecurityControlId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityControlId() == null) ? 0 : getSecurityControlId().hashCode());
        return hashCode;
    }

    @Override
    public GetSecurityControlDefinitionRequest clone() {
        return (GetSecurityControlDefinitionRequest) super.clone();
    }

}
