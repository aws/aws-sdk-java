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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetSecurityControlDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSecurityControlDefinitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private SecurityControlDefinition securityControlDefinition;

    /**
     * @param securityControlDefinition
     */

    public void setSecurityControlDefinition(SecurityControlDefinition securityControlDefinition) {
        this.securityControlDefinition = securityControlDefinition;
    }

    /**
     * @return
     */

    public SecurityControlDefinition getSecurityControlDefinition() {
        return this.securityControlDefinition;
    }

    /**
     * @param securityControlDefinition
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSecurityControlDefinitionResult withSecurityControlDefinition(SecurityControlDefinition securityControlDefinition) {
        setSecurityControlDefinition(securityControlDefinition);
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
        if (getSecurityControlDefinition() != null)
            sb.append("SecurityControlDefinition: ").append(getSecurityControlDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSecurityControlDefinitionResult == false)
            return false;
        GetSecurityControlDefinitionResult other = (GetSecurityControlDefinitionResult) obj;
        if (other.getSecurityControlDefinition() == null ^ this.getSecurityControlDefinition() == null)
            return false;
        if (other.getSecurityControlDefinition() != null && other.getSecurityControlDefinition().equals(this.getSecurityControlDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityControlDefinition() == null) ? 0 : getSecurityControlDefinition().hashCode());
        return hashCode;
    }

    @Override
    public GetSecurityControlDefinitionResult clone() {
        try {
            return (GetSecurityControlDefinitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
