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
package com.amazonaws.services.verifiedpermissions.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/UpdateIdentitySource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateIdentitySourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the ID of the policy store that contains the identity source that you want to update.
     * </p>
     */
    private String policyStoreId;
    /**
     * <p>
     * Specifies the ID of the identity source that you want to update.
     * </p>
     */
    private String identitySourceId;
    /**
     * <p>
     * Specifies the details required to communicate with the identity provider (IdP) associated with this identity
     * source.
     * </p>
     * <note>
     * <p>
     * At this time, the only valid member of this structure is a Amazon Cognito user pool configuration.
     * </p>
     * <p>
     * You must specify a <code>userPoolArn</code>, and optionally, a <code>ClientId</code>.
     * </p>
     * </note>
     */
    private UpdateConfiguration updateConfiguration;
    /**
     * <p>
     * Specifies the data type of principals generated for identities authenticated by the identity source.
     * </p>
     */
    private String principalEntityType;

    /**
     * <p>
     * Specifies the ID of the policy store that contains the identity source that you want to update.
     * </p>
     * 
     * @param policyStoreId
     *        Specifies the ID of the policy store that contains the identity source that you want to update.
     */

    public void setPolicyStoreId(String policyStoreId) {
        this.policyStoreId = policyStoreId;
    }

    /**
     * <p>
     * Specifies the ID of the policy store that contains the identity source that you want to update.
     * </p>
     * 
     * @return Specifies the ID of the policy store that contains the identity source that you want to update.
     */

    public String getPolicyStoreId() {
        return this.policyStoreId;
    }

    /**
     * <p>
     * Specifies the ID of the policy store that contains the identity source that you want to update.
     * </p>
     * 
     * @param policyStoreId
     *        Specifies the ID of the policy store that contains the identity source that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdentitySourceRequest withPolicyStoreId(String policyStoreId) {
        setPolicyStoreId(policyStoreId);
        return this;
    }

    /**
     * <p>
     * Specifies the ID of the identity source that you want to update.
     * </p>
     * 
     * @param identitySourceId
     *        Specifies the ID of the identity source that you want to update.
     */

    public void setIdentitySourceId(String identitySourceId) {
        this.identitySourceId = identitySourceId;
    }

    /**
     * <p>
     * Specifies the ID of the identity source that you want to update.
     * </p>
     * 
     * @return Specifies the ID of the identity source that you want to update.
     */

    public String getIdentitySourceId() {
        return this.identitySourceId;
    }

    /**
     * <p>
     * Specifies the ID of the identity source that you want to update.
     * </p>
     * 
     * @param identitySourceId
     *        Specifies the ID of the identity source that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdentitySourceRequest withIdentitySourceId(String identitySourceId) {
        setIdentitySourceId(identitySourceId);
        return this;
    }

    /**
     * <p>
     * Specifies the details required to communicate with the identity provider (IdP) associated with this identity
     * source.
     * </p>
     * <note>
     * <p>
     * At this time, the only valid member of this structure is a Amazon Cognito user pool configuration.
     * </p>
     * <p>
     * You must specify a <code>userPoolArn</code>, and optionally, a <code>ClientId</code>.
     * </p>
     * </note>
     * 
     * @param updateConfiguration
     *        Specifies the details required to communicate with the identity provider (IdP) associated with this
     *        identity source.</p> <note>
     *        <p>
     *        At this time, the only valid member of this structure is a Amazon Cognito user pool configuration.
     *        </p>
     *        <p>
     *        You must specify a <code>userPoolArn</code>, and optionally, a <code>ClientId</code>.
     *        </p>
     */

    public void setUpdateConfiguration(UpdateConfiguration updateConfiguration) {
        this.updateConfiguration = updateConfiguration;
    }

    /**
     * <p>
     * Specifies the details required to communicate with the identity provider (IdP) associated with this identity
     * source.
     * </p>
     * <note>
     * <p>
     * At this time, the only valid member of this structure is a Amazon Cognito user pool configuration.
     * </p>
     * <p>
     * You must specify a <code>userPoolArn</code>, and optionally, a <code>ClientId</code>.
     * </p>
     * </note>
     * 
     * @return Specifies the details required to communicate with the identity provider (IdP) associated with this
     *         identity source.</p> <note>
     *         <p>
     *         At this time, the only valid member of this structure is a Amazon Cognito user pool configuration.
     *         </p>
     *         <p>
     *         You must specify a <code>userPoolArn</code>, and optionally, a <code>ClientId</code>.
     *         </p>
     */

    public UpdateConfiguration getUpdateConfiguration() {
        return this.updateConfiguration;
    }

    /**
     * <p>
     * Specifies the details required to communicate with the identity provider (IdP) associated with this identity
     * source.
     * </p>
     * <note>
     * <p>
     * At this time, the only valid member of this structure is a Amazon Cognito user pool configuration.
     * </p>
     * <p>
     * You must specify a <code>userPoolArn</code>, and optionally, a <code>ClientId</code>.
     * </p>
     * </note>
     * 
     * @param updateConfiguration
     *        Specifies the details required to communicate with the identity provider (IdP) associated with this
     *        identity source.</p> <note>
     *        <p>
     *        At this time, the only valid member of this structure is a Amazon Cognito user pool configuration.
     *        </p>
     *        <p>
     *        You must specify a <code>userPoolArn</code>, and optionally, a <code>ClientId</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdentitySourceRequest withUpdateConfiguration(UpdateConfiguration updateConfiguration) {
        setUpdateConfiguration(updateConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies the data type of principals generated for identities authenticated by the identity source.
     * </p>
     * 
     * @param principalEntityType
     *        Specifies the data type of principals generated for identities authenticated by the identity source.
     */

    public void setPrincipalEntityType(String principalEntityType) {
        this.principalEntityType = principalEntityType;
    }

    /**
     * <p>
     * Specifies the data type of principals generated for identities authenticated by the identity source.
     * </p>
     * 
     * @return Specifies the data type of principals generated for identities authenticated by the identity source.
     */

    public String getPrincipalEntityType() {
        return this.principalEntityType;
    }

    /**
     * <p>
     * Specifies the data type of principals generated for identities authenticated by the identity source.
     * </p>
     * 
     * @param principalEntityType
     *        Specifies the data type of principals generated for identities authenticated by the identity source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateIdentitySourceRequest withPrincipalEntityType(String principalEntityType) {
        setPrincipalEntityType(principalEntityType);
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
        if (getPolicyStoreId() != null)
            sb.append("PolicyStoreId: ").append(getPolicyStoreId()).append(",");
        if (getIdentitySourceId() != null)
            sb.append("IdentitySourceId: ").append(getIdentitySourceId()).append(",");
        if (getUpdateConfiguration() != null)
            sb.append("UpdateConfiguration: ").append(getUpdateConfiguration()).append(",");
        if (getPrincipalEntityType() != null)
            sb.append("PrincipalEntityType: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateIdentitySourceRequest == false)
            return false;
        UpdateIdentitySourceRequest other = (UpdateIdentitySourceRequest) obj;
        if (other.getPolicyStoreId() == null ^ this.getPolicyStoreId() == null)
            return false;
        if (other.getPolicyStoreId() != null && other.getPolicyStoreId().equals(this.getPolicyStoreId()) == false)
            return false;
        if (other.getIdentitySourceId() == null ^ this.getIdentitySourceId() == null)
            return false;
        if (other.getIdentitySourceId() != null && other.getIdentitySourceId().equals(this.getIdentitySourceId()) == false)
            return false;
        if (other.getUpdateConfiguration() == null ^ this.getUpdateConfiguration() == null)
            return false;
        if (other.getUpdateConfiguration() != null && other.getUpdateConfiguration().equals(this.getUpdateConfiguration()) == false)
            return false;
        if (other.getPrincipalEntityType() == null ^ this.getPrincipalEntityType() == null)
            return false;
        if (other.getPrincipalEntityType() != null && other.getPrincipalEntityType().equals(this.getPrincipalEntityType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyStoreId() == null) ? 0 : getPolicyStoreId().hashCode());
        hashCode = prime * hashCode + ((getIdentitySourceId() == null) ? 0 : getIdentitySourceId().hashCode());
        hashCode = prime * hashCode + ((getUpdateConfiguration() == null) ? 0 : getUpdateConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPrincipalEntityType() == null) ? 0 : getPrincipalEntityType().hashCode());
        return hashCode;
    }

    @Override
    public UpdateIdentitySourceRequest clone() {
        return (UpdateIdentitySourceRequest) super.clone();
    }

}
