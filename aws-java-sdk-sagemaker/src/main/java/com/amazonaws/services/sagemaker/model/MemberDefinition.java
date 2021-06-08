/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines an Amazon Cognito or your own OIDC IdP user group that is part of a work team.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/MemberDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemberDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Cognito user group that is part of the work team.
     * </p>
     */
    private CognitoMemberDefinition cognitoMemberDefinition;
    /**
     * <p>
     * A list user groups that exist in your OIDC Identity Provider (IdP). One to ten groups can be used to create a
     * single private work team. When you add a user group to the list of <code>Groups</code>, you can add that user
     * group to one or more private work teams. If you add a user group to a private work team, all workers in that user
     * group are added to the work team.
     * </p>
     */
    private OidcMemberDefinition oidcMemberDefinition;

    /**
     * <p>
     * The Amazon Cognito user group that is part of the work team.
     * </p>
     * 
     * @param cognitoMemberDefinition
     *        The Amazon Cognito user group that is part of the work team.
     */

    public void setCognitoMemberDefinition(CognitoMemberDefinition cognitoMemberDefinition) {
        this.cognitoMemberDefinition = cognitoMemberDefinition;
    }

    /**
     * <p>
     * The Amazon Cognito user group that is part of the work team.
     * </p>
     * 
     * @return The Amazon Cognito user group that is part of the work team.
     */

    public CognitoMemberDefinition getCognitoMemberDefinition() {
        return this.cognitoMemberDefinition;
    }

    /**
     * <p>
     * The Amazon Cognito user group that is part of the work team.
     * </p>
     * 
     * @param cognitoMemberDefinition
     *        The Amazon Cognito user group that is part of the work team.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberDefinition withCognitoMemberDefinition(CognitoMemberDefinition cognitoMemberDefinition) {
        setCognitoMemberDefinition(cognitoMemberDefinition);
        return this;
    }

    /**
     * <p>
     * A list user groups that exist in your OIDC Identity Provider (IdP). One to ten groups can be used to create a
     * single private work team. When you add a user group to the list of <code>Groups</code>, you can add that user
     * group to one or more private work teams. If you add a user group to a private work team, all workers in that user
     * group are added to the work team.
     * </p>
     * 
     * @param oidcMemberDefinition
     *        A list user groups that exist in your OIDC Identity Provider (IdP). One to ten groups can be used to
     *        create a single private work team. When you add a user group to the list of <code>Groups</code>, you can
     *        add that user group to one or more private work teams. If you add a user group to a private work team, all
     *        workers in that user group are added to the work team.
     */

    public void setOidcMemberDefinition(OidcMemberDefinition oidcMemberDefinition) {
        this.oidcMemberDefinition = oidcMemberDefinition;
    }

    /**
     * <p>
     * A list user groups that exist in your OIDC Identity Provider (IdP). One to ten groups can be used to create a
     * single private work team. When you add a user group to the list of <code>Groups</code>, you can add that user
     * group to one or more private work teams. If you add a user group to a private work team, all workers in that user
     * group are added to the work team.
     * </p>
     * 
     * @return A list user groups that exist in your OIDC Identity Provider (IdP). One to ten groups can be used to
     *         create a single private work team. When you add a user group to the list of <code>Groups</code>, you can
     *         add that user group to one or more private work teams. If you add a user group to a private work team,
     *         all workers in that user group are added to the work team.
     */

    public OidcMemberDefinition getOidcMemberDefinition() {
        return this.oidcMemberDefinition;
    }

    /**
     * <p>
     * A list user groups that exist in your OIDC Identity Provider (IdP). One to ten groups can be used to create a
     * single private work team. When you add a user group to the list of <code>Groups</code>, you can add that user
     * group to one or more private work teams. If you add a user group to a private work team, all workers in that user
     * group are added to the work team.
     * </p>
     * 
     * @param oidcMemberDefinition
     *        A list user groups that exist in your OIDC Identity Provider (IdP). One to ten groups can be used to
     *        create a single private work team. When you add a user group to the list of <code>Groups</code>, you can
     *        add that user group to one or more private work teams. If you add a user group to a private work team, all
     *        workers in that user group are added to the work team.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberDefinition withOidcMemberDefinition(OidcMemberDefinition oidcMemberDefinition) {
        setOidcMemberDefinition(oidcMemberDefinition);
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
        if (getCognitoMemberDefinition() != null)
            sb.append("CognitoMemberDefinition: ").append(getCognitoMemberDefinition()).append(",");
        if (getOidcMemberDefinition() != null)
            sb.append("OidcMemberDefinition: ").append(getOidcMemberDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MemberDefinition == false)
            return false;
        MemberDefinition other = (MemberDefinition) obj;
        if (other.getCognitoMemberDefinition() == null ^ this.getCognitoMemberDefinition() == null)
            return false;
        if (other.getCognitoMemberDefinition() != null && other.getCognitoMemberDefinition().equals(this.getCognitoMemberDefinition()) == false)
            return false;
        if (other.getOidcMemberDefinition() == null ^ this.getOidcMemberDefinition() == null)
            return false;
        if (other.getOidcMemberDefinition() != null && other.getOidcMemberDefinition().equals(this.getOidcMemberDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCognitoMemberDefinition() == null) ? 0 : getCognitoMemberDefinition().hashCode());
        hashCode = prime * hashCode + ((getOidcMemberDefinition() == null) ? 0 : getOidcMemberDefinition().hashCode());
        return hashCode;
    }

    @Override
    public MemberDefinition clone() {
        try {
            return (MemberDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.MemberDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
