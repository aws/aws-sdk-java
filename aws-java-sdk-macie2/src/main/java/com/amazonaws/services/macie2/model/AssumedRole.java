/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Reserved for future use.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/AssumedRole" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssumedRole implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String accessKeyId;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String principalId;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private SessionContext sessionContext;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param accessKeyId
     *        Reserved for future use.
     */

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param accessKeyId
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumedRole withAccessKeyId(String accessKeyId) {
        setAccessKeyId(accessKeyId);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param accountId
     *        Reserved for future use.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param accountId
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumedRole withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param arn
     *        Reserved for future use.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param arn
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumedRole withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param principalId
     *        Reserved for future use.
     */

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param principalId
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumedRole withPrincipalId(String principalId) {
        setPrincipalId(principalId);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param sessionContext
     *        Reserved for future use.
     */

    public void setSessionContext(SessionContext sessionContext) {
        this.sessionContext = sessionContext;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public SessionContext getSessionContext() {
        return this.sessionContext;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param sessionContext
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssumedRole withSessionContext(SessionContext sessionContext) {
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

        if (obj instanceof AssumedRole == false)
            return false;
        AssumedRole other = (AssumedRole) obj;
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
    public AssumedRole clone() {
        try {
            return (AssumedRole) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.AssumedRoleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
