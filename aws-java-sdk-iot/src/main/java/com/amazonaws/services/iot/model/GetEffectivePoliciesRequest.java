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
public class GetEffectivePoliciesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The principal.
     * </p>
     */
    private String principal;
    /**
     * <p>
     * The Cognito identity pool ID.
     * </p>
     */
    private String cognitoIdentityPoolId;
    /**
     * <p>
     * The thing name.
     * </p>
     */
    private String thingName;

    /**
     * <p>
     * The principal.
     * </p>
     * 
     * @param principal
     *        The principal.
     */

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The principal.
     * </p>
     * 
     * @return The principal.
     */

    public String getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * The principal.
     * </p>
     * 
     * @param principal
     *        The principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEffectivePoliciesRequest withPrincipal(String principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * The Cognito identity pool ID.
     * </p>
     * 
     * @param cognitoIdentityPoolId
     *        The Cognito identity pool ID.
     */

    public void setCognitoIdentityPoolId(String cognitoIdentityPoolId) {
        this.cognitoIdentityPoolId = cognitoIdentityPoolId;
    }

    /**
     * <p>
     * The Cognito identity pool ID.
     * </p>
     * 
     * @return The Cognito identity pool ID.
     */

    public String getCognitoIdentityPoolId() {
        return this.cognitoIdentityPoolId;
    }

    /**
     * <p>
     * The Cognito identity pool ID.
     * </p>
     * 
     * @param cognitoIdentityPoolId
     *        The Cognito identity pool ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEffectivePoliciesRequest withCognitoIdentityPoolId(String cognitoIdentityPoolId) {
        setCognitoIdentityPoolId(cognitoIdentityPoolId);
        return this;
    }

    /**
     * <p>
     * The thing name.
     * </p>
     * 
     * @param thingName
     *        The thing name.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The thing name.
     * </p>
     * 
     * @return The thing name.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * The thing name.
     * </p>
     * 
     * @param thingName
     *        The thing name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEffectivePoliciesRequest withThingName(String thingName) {
        setThingName(thingName);
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
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal()).append(",");
        if (getCognitoIdentityPoolId() != null)
            sb.append("CognitoIdentityPoolId: ").append(getCognitoIdentityPoolId()).append(",");
        if (getThingName() != null)
            sb.append("ThingName: ").append(getThingName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEffectivePoliciesRequest == false)
            return false;
        GetEffectivePoliciesRequest other = (GetEffectivePoliciesRequest) obj;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getCognitoIdentityPoolId() == null ^ this.getCognitoIdentityPoolId() == null)
            return false;
        if (other.getCognitoIdentityPoolId() != null && other.getCognitoIdentityPoolId().equals(this.getCognitoIdentityPoolId()) == false)
            return false;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getCognitoIdentityPoolId() == null) ? 0 : getCognitoIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        return hashCode;
    }

    @Override
    public GetEffectivePoliciesRequest clone() {
        return (GetEffectivePoliciesRequest) super.clone();
    }

}
