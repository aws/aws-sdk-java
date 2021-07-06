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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about an identity that performed an action on an affected resource by using temporary security
 * credentials. The credentials were obtained using the GetFederationToken operation of the Security Token Service (STS)
 * API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/FederatedUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FederatedUser implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services access key ID that identifies the credentials.
     * </p>
     */
    private String accessKeyId;
    /**
     * <p>
     * The unique identifier for the Amazon Web Services account that owns the entity that was used to get the
     * credentials.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity that was used to get the credentials.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The unique identifier for the entity that was used to get the credentials.
     * </p>
     */
    private String principalId;
    /**
     * <p>
     * The details of the session that was created for the credentials, including the entity that issued the session.
     * </p>
     */
    private SessionContext sessionContext;

    /**
     * <p>
     * The Amazon Web Services access key ID that identifies the credentials.
     * </p>
     * 
     * @param accessKeyId
     *        The Amazon Web Services access key ID that identifies the credentials.
     */

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services access key ID that identifies the credentials.
     * </p>
     * 
     * @return The Amazon Web Services access key ID that identifies the credentials.
     */

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services access key ID that identifies the credentials.
     * </p>
     * 
     * @param accessKeyId
     *        The Amazon Web Services access key ID that identifies the credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FederatedUser withAccessKeyId(String accessKeyId) {
        setAccessKeyId(accessKeyId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account that owns the entity that was used to get the
     * credentials.
     * </p>
     * 
     * @param accountId
     *        The unique identifier for the Amazon Web Services account that owns the entity that was used to get the
     *        credentials.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account that owns the entity that was used to get the
     * credentials.
     * </p>
     * 
     * @return The unique identifier for the Amazon Web Services account that owns the entity that was used to get the
     *         credentials.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account that owns the entity that was used to get the
     * credentials.
     * </p>
     * 
     * @param accountId
     *        The unique identifier for the Amazon Web Services account that owns the entity that was used to get the
     *        credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FederatedUser withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity that was used to get the credentials.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the entity that was used to get the credentials.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity that was used to get the credentials.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the entity that was used to get the credentials.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the entity that was used to get the credentials.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the entity that was used to get the credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FederatedUser withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the entity that was used to get the credentials.
     * </p>
     * 
     * @param principalId
     *        The unique identifier for the entity that was used to get the credentials.
     */

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * The unique identifier for the entity that was used to get the credentials.
     * </p>
     * 
     * @return The unique identifier for the entity that was used to get the credentials.
     */

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * <p>
     * The unique identifier for the entity that was used to get the credentials.
     * </p>
     * 
     * @param principalId
     *        The unique identifier for the entity that was used to get the credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FederatedUser withPrincipalId(String principalId) {
        setPrincipalId(principalId);
        return this;
    }

    /**
     * <p>
     * The details of the session that was created for the credentials, including the entity that issued the session.
     * </p>
     * 
     * @param sessionContext
     *        The details of the session that was created for the credentials, including the entity that issued the
     *        session.
     */

    public void setSessionContext(SessionContext sessionContext) {
        this.sessionContext = sessionContext;
    }

    /**
     * <p>
     * The details of the session that was created for the credentials, including the entity that issued the session.
     * </p>
     * 
     * @return The details of the session that was created for the credentials, including the entity that issued the
     *         session.
     */

    public SessionContext getSessionContext() {
        return this.sessionContext;
    }

    /**
     * <p>
     * The details of the session that was created for the credentials, including the entity that issued the session.
     * </p>
     * 
     * @param sessionContext
     *        The details of the session that was created for the credentials, including the entity that issued the
     *        session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FederatedUser withSessionContext(SessionContext sessionContext) {
        setSessionContext(sessionContext);
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
        if (getAccessKeyId() != null)
            sb.append("AccessKeyId: ").append(getAccessKeyId()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getPrincipalId() != null)
            sb.append("PrincipalId: ").append(getPrincipalId()).append(",");
        if (getSessionContext() != null)
            sb.append("SessionContext: ").append(getSessionContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FederatedUser == false)
            return false;
        FederatedUser other = (FederatedUser) obj;
        if (other.getAccessKeyId() == null ^ this.getAccessKeyId() == null)
            return false;
        if (other.getAccessKeyId() != null && other.getAccessKeyId().equals(this.getAccessKeyId()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getPrincipalId() == null ^ this.getPrincipalId() == null)
            return false;
        if (other.getPrincipalId() != null && other.getPrincipalId().equals(this.getPrincipalId()) == false)
            return false;
        if (other.getSessionContext() == null ^ this.getSessionContext() == null)
            return false;
        if (other.getSessionContext() != null && other.getSessionContext().equals(this.getSessionContext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessKeyId() == null) ? 0 : getAccessKeyId().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        hashCode = prime * hashCode + ((getSessionContext() == null) ? 0 : getSessionContext().hashCode());
        return hashCode;
    }

    @Override
    public FederatedUser clone() {
        try {
            return (FederatedUser) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.FederatedUserMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
