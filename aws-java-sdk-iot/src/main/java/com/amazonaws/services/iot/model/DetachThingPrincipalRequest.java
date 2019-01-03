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

/**
 * <p>
 * The input for the DetachThingPrincipal operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetachThingPrincipalRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the thing.
     * </p>
     */
    private String thingName;
    /**
     * <p>
     * If the principal is a certificate, this value must be ARN of the certificate. If the principal is an Amazon
     * Cognito identity, this value must be the ID of the Amazon Cognito identity.
     * </p>
     */
    private String principal;

    /**
     * <p>
     * The name of the thing.
     * </p>
     * 
     * @param thingName
     *        The name of the thing.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing.
     * </p>
     * 
     * @return The name of the thing.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * The name of the thing.
     * </p>
     * 
     * @param thingName
     *        The name of the thing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachThingPrincipalRequest withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

    /**
     * <p>
     * If the principal is a certificate, this value must be ARN of the certificate. If the principal is an Amazon
     * Cognito identity, this value must be the ID of the Amazon Cognito identity.
     * </p>
     * 
     * @param principal
     *        If the principal is a certificate, this value must be ARN of the certificate. If the principal is an
     *        Amazon Cognito identity, this value must be the ID of the Amazon Cognito identity.
     */

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * If the principal is a certificate, this value must be ARN of the certificate. If the principal is an Amazon
     * Cognito identity, this value must be the ID of the Amazon Cognito identity.
     * </p>
     * 
     * @return If the principal is a certificate, this value must be ARN of the certificate. If the principal is an
     *         Amazon Cognito identity, this value must be the ID of the Amazon Cognito identity.
     */

    public String getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * If the principal is a certificate, this value must be ARN of the certificate. If the principal is an Amazon
     * Cognito identity, this value must be the ID of the Amazon Cognito identity.
     * </p>
     * 
     * @param principal
     *        If the principal is a certificate, this value must be ARN of the certificate. If the principal is an
     *        Amazon Cognito identity, this value must be the ID of the Amazon Cognito identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachThingPrincipalRequest withPrincipal(String principal) {
        setPrincipal(principal);
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
        if (getThingName() != null)
            sb.append("ThingName: ").append(getThingName()).append(",");
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetachThingPrincipalRequest == false)
            return false;
        DetachThingPrincipalRequest other = (DetachThingPrincipalRequest) obj;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        return hashCode;
    }

    @Override
    public DetachThingPrincipalRequest clone() {
        return (DetachThingPrincipalRequest) super.clone();
    }

}
