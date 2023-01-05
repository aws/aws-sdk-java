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
package com.amazonaws.services.route53recoveryreadiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateCrossAccountAuthorization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCrossAccountAuthorizationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The cross-account authorization.
     * </p>
     */
    private String crossAccountAuthorization;

    /**
     * <p>
     * The cross-account authorization.
     * </p>
     * 
     * @param crossAccountAuthorization
     *        The cross-account authorization.
     */

    public void setCrossAccountAuthorization(String crossAccountAuthorization) {
        this.crossAccountAuthorization = crossAccountAuthorization;
    }

    /**
     * <p>
     * The cross-account authorization.
     * </p>
     * 
     * @return The cross-account authorization.
     */

    public String getCrossAccountAuthorization() {
        return this.crossAccountAuthorization;
    }

    /**
     * <p>
     * The cross-account authorization.
     * </p>
     * 
     * @param crossAccountAuthorization
     *        The cross-account authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCrossAccountAuthorizationRequest withCrossAccountAuthorization(String crossAccountAuthorization) {
        setCrossAccountAuthorization(crossAccountAuthorization);
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
        if (getCrossAccountAuthorization() != null)
            sb.append("CrossAccountAuthorization: ").append(getCrossAccountAuthorization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCrossAccountAuthorizationRequest == false)
            return false;
        CreateCrossAccountAuthorizationRequest other = (CreateCrossAccountAuthorizationRequest) obj;
        if (other.getCrossAccountAuthorization() == null ^ this.getCrossAccountAuthorization() == null)
            return false;
        if (other.getCrossAccountAuthorization() != null && other.getCrossAccountAuthorization().equals(this.getCrossAccountAuthorization()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrossAccountAuthorization() == null) ? 0 : getCrossAccountAuthorization().hashCode());
        return hashCode;
    }

    @Override
    public CreateCrossAccountAuthorizationRequest clone() {
        return (CreateCrossAccountAuthorizationRequest) super.clone();
    }

}
