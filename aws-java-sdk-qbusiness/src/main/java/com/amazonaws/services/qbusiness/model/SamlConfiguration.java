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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the SAML 2.0 compliant identity provider (IdP) configuration information Amazon Q Business needs to deploy a
 * Amazon Q Business web experience.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/SamlConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SamlConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The metadata XML that your IdP generated.
     * </p>
     */
    private String metadataXML;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role assumed by users when they authenticate into their Amazon Q
     * Business web experience, containing the relevant Amazon Q Business permissions for conversing with Amazon Q
     * Business.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The user attribute name in your IdP that maps to the user email.
     * </p>
     */
    private String userIdAttribute;
    /**
     * <p>
     * The group attribute name in your IdP that maps to user groups.
     * </p>
     */
    private String userGroupAttribute;

    /**
     * <p>
     * The metadata XML that your IdP generated.
     * </p>
     * 
     * @param metadataXML
     *        The metadata XML that your IdP generated.
     */

    public void setMetadataXML(String metadataXML) {
        this.metadataXML = metadataXML;
    }

    /**
     * <p>
     * The metadata XML that your IdP generated.
     * </p>
     * 
     * @return The metadata XML that your IdP generated.
     */

    public String getMetadataXML() {
        return this.metadataXML;
    }

    /**
     * <p>
     * The metadata XML that your IdP generated.
     * </p>
     * 
     * @param metadataXML
     *        The metadata XML that your IdP generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamlConfiguration withMetadataXML(String metadataXML) {
        setMetadataXML(metadataXML);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role assumed by users when they authenticate into their Amazon Q
     * Business web experience, containing the relevant Amazon Q Business permissions for conversing with Amazon Q
     * Business.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role assumed by users when they authenticate into their Amazon Q
     *        Business web experience, containing the relevant Amazon Q Business permissions for conversing with Amazon
     *        Q Business.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role assumed by users when they authenticate into their Amazon Q
     * Business web experience, containing the relevant Amazon Q Business permissions for conversing with Amazon Q
     * Business.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role assumed by users when they authenticate into their Amazon Q
     *         Business web experience, containing the relevant Amazon Q Business permissions for conversing with Amazon
     *         Q Business.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role assumed by users when they authenticate into their Amazon Q
     * Business web experience, containing the relevant Amazon Q Business permissions for conversing with Amazon Q
     * Business.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role assumed by users when they authenticate into their Amazon Q
     *        Business web experience, containing the relevant Amazon Q Business permissions for conversing with Amazon
     *        Q Business.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamlConfiguration withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The user attribute name in your IdP that maps to the user email.
     * </p>
     * 
     * @param userIdAttribute
     *        The user attribute name in your IdP that maps to the user email.
     */

    public void setUserIdAttribute(String userIdAttribute) {
        this.userIdAttribute = userIdAttribute;
    }

    /**
     * <p>
     * The user attribute name in your IdP that maps to the user email.
     * </p>
     * 
     * @return The user attribute name in your IdP that maps to the user email.
     */

    public String getUserIdAttribute() {
        return this.userIdAttribute;
    }

    /**
     * <p>
     * The user attribute name in your IdP that maps to the user email.
     * </p>
     * 
     * @param userIdAttribute
     *        The user attribute name in your IdP that maps to the user email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamlConfiguration withUserIdAttribute(String userIdAttribute) {
        setUserIdAttribute(userIdAttribute);
        return this;
    }

    /**
     * <p>
     * The group attribute name in your IdP that maps to user groups.
     * </p>
     * 
     * @param userGroupAttribute
     *        The group attribute name in your IdP that maps to user groups.
     */

    public void setUserGroupAttribute(String userGroupAttribute) {
        this.userGroupAttribute = userGroupAttribute;
    }

    /**
     * <p>
     * The group attribute name in your IdP that maps to user groups.
     * </p>
     * 
     * @return The group attribute name in your IdP that maps to user groups.
     */

    public String getUserGroupAttribute() {
        return this.userGroupAttribute;
    }

    /**
     * <p>
     * The group attribute name in your IdP that maps to user groups.
     * </p>
     * 
     * @param userGroupAttribute
     *        The group attribute name in your IdP that maps to user groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamlConfiguration withUserGroupAttribute(String userGroupAttribute) {
        setUserGroupAttribute(userGroupAttribute);
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
        if (getMetadataXML() != null)
            sb.append("MetadataXML: ").append(getMetadataXML()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getUserIdAttribute() != null)
            sb.append("UserIdAttribute: ").append(getUserIdAttribute()).append(",");
        if (getUserGroupAttribute() != null)
            sb.append("UserGroupAttribute: ").append(getUserGroupAttribute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SamlConfiguration == false)
            return false;
        SamlConfiguration other = (SamlConfiguration) obj;
        if (other.getMetadataXML() == null ^ this.getMetadataXML() == null)
            return false;
        if (other.getMetadataXML() != null && other.getMetadataXML().equals(this.getMetadataXML()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getUserIdAttribute() == null ^ this.getUserIdAttribute() == null)
            return false;
        if (other.getUserIdAttribute() != null && other.getUserIdAttribute().equals(this.getUserIdAttribute()) == false)
            return false;
        if (other.getUserGroupAttribute() == null ^ this.getUserGroupAttribute() == null)
            return false;
        if (other.getUserGroupAttribute() != null && other.getUserGroupAttribute().equals(this.getUserGroupAttribute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetadataXML() == null) ? 0 : getMetadataXML().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getUserIdAttribute() == null) ? 0 : getUserIdAttribute().hashCode());
        hashCode = prime * hashCode + ((getUserGroupAttribute() == null) ? 0 : getUserGroupAttribute().hashCode());
        return hashCode;
    }

    @Override
    public SamlConfiguration clone() {
        try {
            return (SamlConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.SamlConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
