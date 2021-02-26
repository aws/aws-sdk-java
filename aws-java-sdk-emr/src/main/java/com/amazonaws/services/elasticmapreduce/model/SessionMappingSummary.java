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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details for an Amazon EMR Studio session mapping. The details do not include the time the session mapping was last
 * modified.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/SessionMappingSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SessionMappingSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Amazon EMR Studio.
     * </p>
     */
    private String studioId;
    /**
     * <p>
     * The globally unique identifier (GUID) of the user or group from the AWS SSO Identity Store.
     * </p>
     */
    private String identityId;
    /**
     * <p>
     * The name of the user or group. For more information, see <a href=
     * "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html#singlesignon-Type-User-UserName"
     * >UserName</a> and <a href=
     * "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_Group.html#singlesignon-Type-Group-DisplayName"
     * >DisplayName</a> in the <i>AWS SSO Identity Store API Reference</i>.
     * </p>
     */
    private String identityName;
    /**
     * <p>
     * Specifies whether the identity mapped to the Amazon EMR Studio is a user or a group.
     * </p>
     */
    private String identityType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the session policy associated with the user or group.
     * </p>
     */
    private String sessionPolicyArn;
    /**
     * <p>
     * The time the session mapping was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The ID of the Amazon EMR Studio.
     * </p>
     * 
     * @param studioId
     *        The ID of the Amazon EMR Studio.
     */

    public void setStudioId(String studioId) {
        this.studioId = studioId;
    }

    /**
     * <p>
     * The ID of the Amazon EMR Studio.
     * </p>
     * 
     * @return The ID of the Amazon EMR Studio.
     */

    public String getStudioId() {
        return this.studioId;
    }

    /**
     * <p>
     * The ID of the Amazon EMR Studio.
     * </p>
     * 
     * @param studioId
     *        The ID of the Amazon EMR Studio.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionMappingSummary withStudioId(String studioId) {
        setStudioId(studioId);
        return this;
    }

    /**
     * <p>
     * The globally unique identifier (GUID) of the user or group from the AWS SSO Identity Store.
     * </p>
     * 
     * @param identityId
     *        The globally unique identifier (GUID) of the user or group from the AWS SSO Identity Store.
     */

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    /**
     * <p>
     * The globally unique identifier (GUID) of the user or group from the AWS SSO Identity Store.
     * </p>
     * 
     * @return The globally unique identifier (GUID) of the user or group from the AWS SSO Identity Store.
     */

    public String getIdentityId() {
        return this.identityId;
    }

    /**
     * <p>
     * The globally unique identifier (GUID) of the user or group from the AWS SSO Identity Store.
     * </p>
     * 
     * @param identityId
     *        The globally unique identifier (GUID) of the user or group from the AWS SSO Identity Store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionMappingSummary withIdentityId(String identityId) {
        setIdentityId(identityId);
        return this;
    }

    /**
     * <p>
     * The name of the user or group. For more information, see <a href=
     * "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html#singlesignon-Type-User-UserName"
     * >UserName</a> and <a href=
     * "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_Group.html#singlesignon-Type-Group-DisplayName"
     * >DisplayName</a> in the <i>AWS SSO Identity Store API Reference</i>.
     * </p>
     * 
     * @param identityName
     *        The name of the user or group. For more information, see <a href=
     *        "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html#singlesignon-Type-User-UserName"
     *        >UserName</a> and <a href=
     *        "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_Group.html#singlesignon-Type-Group-DisplayName"
     *        >DisplayName</a> in the <i>AWS SSO Identity Store API Reference</i>.
     */

    public void setIdentityName(String identityName) {
        this.identityName = identityName;
    }

    /**
     * <p>
     * The name of the user or group. For more information, see <a href=
     * "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html#singlesignon-Type-User-UserName"
     * >UserName</a> and <a href=
     * "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_Group.html#singlesignon-Type-Group-DisplayName"
     * >DisplayName</a> in the <i>AWS SSO Identity Store API Reference</i>.
     * </p>
     * 
     * @return The name of the user or group. For more information, see <a href=
     *         "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html#singlesignon-Type-User-UserName"
     *         >UserName</a> and <a href=
     *         "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_Group.html#singlesignon-Type-Group-DisplayName"
     *         >DisplayName</a> in the <i>AWS SSO Identity Store API Reference</i>.
     */

    public String getIdentityName() {
        return this.identityName;
    }

    /**
     * <p>
     * The name of the user or group. For more information, see <a href=
     * "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html#singlesignon-Type-User-UserName"
     * >UserName</a> and <a href=
     * "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_Group.html#singlesignon-Type-Group-DisplayName"
     * >DisplayName</a> in the <i>AWS SSO Identity Store API Reference</i>.
     * </p>
     * 
     * @param identityName
     *        The name of the user or group. For more information, see <a href=
     *        "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_User.html#singlesignon-Type-User-UserName"
     *        >UserName</a> and <a href=
     *        "https://docs.aws.amazon.com/singlesignon/latest/IdentityStoreAPIReference/API_Group.html#singlesignon-Type-Group-DisplayName"
     *        >DisplayName</a> in the <i>AWS SSO Identity Store API Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionMappingSummary withIdentityName(String identityName) {
        setIdentityName(identityName);
        return this;
    }

    /**
     * <p>
     * Specifies whether the identity mapped to the Amazon EMR Studio is a user or a group.
     * </p>
     * 
     * @param identityType
     *        Specifies whether the identity mapped to the Amazon EMR Studio is a user or a group.
     * @see IdentityType
     */

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    /**
     * <p>
     * Specifies whether the identity mapped to the Amazon EMR Studio is a user or a group.
     * </p>
     * 
     * @return Specifies whether the identity mapped to the Amazon EMR Studio is a user or a group.
     * @see IdentityType
     */

    public String getIdentityType() {
        return this.identityType;
    }

    /**
     * <p>
     * Specifies whether the identity mapped to the Amazon EMR Studio is a user or a group.
     * </p>
     * 
     * @param identityType
     *        Specifies whether the identity mapped to the Amazon EMR Studio is a user or a group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityType
     */

    public SessionMappingSummary withIdentityType(String identityType) {
        setIdentityType(identityType);
        return this;
    }

    /**
     * <p>
     * Specifies whether the identity mapped to the Amazon EMR Studio is a user or a group.
     * </p>
     * 
     * @param identityType
     *        Specifies whether the identity mapped to the Amazon EMR Studio is a user or a group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityType
     */

    public SessionMappingSummary withIdentityType(IdentityType identityType) {
        this.identityType = identityType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the session policy associated with the user or group.
     * </p>
     * 
     * @param sessionPolicyArn
     *        The Amazon Resource Name (ARN) of the session policy associated with the user or group.
     */

    public void setSessionPolicyArn(String sessionPolicyArn) {
        this.sessionPolicyArn = sessionPolicyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the session policy associated with the user or group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the session policy associated with the user or group.
     */

    public String getSessionPolicyArn() {
        return this.sessionPolicyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the session policy associated with the user or group.
     * </p>
     * 
     * @param sessionPolicyArn
     *        The Amazon Resource Name (ARN) of the session policy associated with the user or group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionMappingSummary withSessionPolicyArn(String sessionPolicyArn) {
        setSessionPolicyArn(sessionPolicyArn);
        return this;
    }

    /**
     * <p>
     * The time the session mapping was created.
     * </p>
     * 
     * @param creationTime
     *        The time the session mapping was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the session mapping was created.
     * </p>
     * 
     * @return The time the session mapping was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the session mapping was created.
     * </p>
     * 
     * @param creationTime
     *        The time the session mapping was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionMappingSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getStudioId() != null)
            sb.append("StudioId: ").append(getStudioId()).append(",");
        if (getIdentityId() != null)
            sb.append("IdentityId: ").append(getIdentityId()).append(",");
        if (getIdentityName() != null)
            sb.append("IdentityName: ").append(getIdentityName()).append(",");
        if (getIdentityType() != null)
            sb.append("IdentityType: ").append(getIdentityType()).append(",");
        if (getSessionPolicyArn() != null)
            sb.append("SessionPolicyArn: ").append(getSessionPolicyArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SessionMappingSummary == false)
            return false;
        SessionMappingSummary other = (SessionMappingSummary) obj;
        if (other.getStudioId() == null ^ this.getStudioId() == null)
            return false;
        if (other.getStudioId() != null && other.getStudioId().equals(this.getStudioId()) == false)
            return false;
        if (other.getIdentityId() == null ^ this.getIdentityId() == null)
            return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false)
            return false;
        if (other.getIdentityName() == null ^ this.getIdentityName() == null)
            return false;
        if (other.getIdentityName() != null && other.getIdentityName().equals(this.getIdentityName()) == false)
            return false;
        if (other.getIdentityType() == null ^ this.getIdentityType() == null)
            return false;
        if (other.getIdentityType() != null && other.getIdentityType().equals(this.getIdentityType()) == false)
            return false;
        if (other.getSessionPolicyArn() == null ^ this.getSessionPolicyArn() == null)
            return false;
        if (other.getSessionPolicyArn() != null && other.getSessionPolicyArn().equals(this.getSessionPolicyArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStudioId() == null) ? 0 : getStudioId().hashCode());
        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode());
        hashCode = prime * hashCode + ((getIdentityName() == null) ? 0 : getIdentityName().hashCode());
        hashCode = prime * hashCode + ((getIdentityType() == null) ? 0 : getIdentityType().hashCode());
        hashCode = prime * hashCode + ((getSessionPolicyArn() == null) ? 0 : getSessionPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public SessionMappingSummary clone() {
        try {
            return (SessionMappingSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.SessionMappingSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
