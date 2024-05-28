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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details new user agents used either at the resource or account level.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/NewUserAgentDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NewUserAgentDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * New user agent which accessed the resource.
     * </p>
     */
    private String userAgent;
    /**
     * <p>
     * Checks if the user agent is new for the entire account.
     * </p>
     */
    private Boolean isNewForEntireAccount;

    /**
     * <p>
     * New user agent which accessed the resource.
     * </p>
     * 
     * @param userAgent
     *        New user agent which accessed the resource.
     */

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * <p>
     * New user agent which accessed the resource.
     * </p>
     * 
     * @return New user agent which accessed the resource.
     */

    public String getUserAgent() {
        return this.userAgent;
    }

    /**
     * <p>
     * New user agent which accessed the resource.
     * </p>
     * 
     * @param userAgent
     *        New user agent which accessed the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewUserAgentDetail withUserAgent(String userAgent) {
        setUserAgent(userAgent);
        return this;
    }

    /**
     * <p>
     * Checks if the user agent is new for the entire account.
     * </p>
     * 
     * @param isNewForEntireAccount
     *        Checks if the user agent is new for the entire account.
     */

    public void setIsNewForEntireAccount(Boolean isNewForEntireAccount) {
        this.isNewForEntireAccount = isNewForEntireAccount;
    }

    /**
     * <p>
     * Checks if the user agent is new for the entire account.
     * </p>
     * 
     * @return Checks if the user agent is new for the entire account.
     */

    public Boolean getIsNewForEntireAccount() {
        return this.isNewForEntireAccount;
    }

    /**
     * <p>
     * Checks if the user agent is new for the entire account.
     * </p>
     * 
     * @param isNewForEntireAccount
     *        Checks if the user agent is new for the entire account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewUserAgentDetail withIsNewForEntireAccount(Boolean isNewForEntireAccount) {
        setIsNewForEntireAccount(isNewForEntireAccount);
        return this;
    }

    /**
     * <p>
     * Checks if the user agent is new for the entire account.
     * </p>
     * 
     * @return Checks if the user agent is new for the entire account.
     */

    public Boolean isNewForEntireAccount() {
        return this.isNewForEntireAccount;
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
        if (getUserAgent() != null)
            sb.append("UserAgent: ").append(getUserAgent()).append(",");
        if (getIsNewForEntireAccount() != null)
            sb.append("IsNewForEntireAccount: ").append(getIsNewForEntireAccount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NewUserAgentDetail == false)
            return false;
        NewUserAgentDetail other = (NewUserAgentDetail) obj;
        if (other.getUserAgent() == null ^ this.getUserAgent() == null)
            return false;
        if (other.getUserAgent() != null && other.getUserAgent().equals(this.getUserAgent()) == false)
            return false;
        if (other.getIsNewForEntireAccount() == null ^ this.getIsNewForEntireAccount() == null)
            return false;
        if (other.getIsNewForEntireAccount() != null && other.getIsNewForEntireAccount().equals(this.getIsNewForEntireAccount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserAgent() == null) ? 0 : getUserAgent().hashCode());
        hashCode = prime * hashCode + ((getIsNewForEntireAccount() == null) ? 0 : getIsNewForEntireAccount().hashCode());
        return hashCode;
    }

    @Override
    public NewUserAgentDetail clone() {
        try {
            return (NewUserAgentDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.detective.model.transform.NewUserAgentDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
