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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that defines a single grant and its configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GrantItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GrantItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration structure for the selected grant.
     * </p>
     */
    private Grant grant;
    /**
     * <p>
     * The type of the selected grant.
     * </p>
     */
    private String grantType;

    /**
     * <p>
     * The configuration structure for the selected grant.
     * </p>
     * 
     * @param grant
     *        The configuration structure for the selected grant.
     */

    public void setGrant(Grant grant) {
        this.grant = grant;
    }

    /**
     * <p>
     * The configuration structure for the selected grant.
     * </p>
     * 
     * @return The configuration structure for the selected grant.
     */

    public Grant getGrant() {
        return this.grant;
    }

    /**
     * <p>
     * The configuration structure for the selected grant.
     * </p>
     * 
     * @param grant
     *        The configuration structure for the selected grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantItem withGrant(Grant grant) {
        setGrant(grant);
        return this;
    }

    /**
     * <p>
     * The type of the selected grant.
     * </p>
     * 
     * @param grantType
     *        The type of the selected grant.
     * @see GrantType
     */

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    /**
     * <p>
     * The type of the selected grant.
     * </p>
     * 
     * @return The type of the selected grant.
     * @see GrantType
     */

    public String getGrantType() {
        return this.grantType;
    }

    /**
     * <p>
     * The type of the selected grant.
     * </p>
     * 
     * @param grantType
     *        The type of the selected grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GrantType
     */

    public GrantItem withGrantType(String grantType) {
        setGrantType(grantType);
        return this;
    }

    /**
     * <p>
     * The type of the selected grant.
     * </p>
     * 
     * @param grantType
     *        The type of the selected grant.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GrantType
     */

    public GrantItem withGrantType(GrantType grantType) {
        this.grantType = grantType.toString();
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
        if (getGrant() != null)
            sb.append("Grant: ").append(getGrant()).append(",");
        if (getGrantType() != null)
            sb.append("GrantType: ").append(getGrantType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GrantItem == false)
            return false;
        GrantItem other = (GrantItem) obj;
        if (other.getGrant() == null ^ this.getGrant() == null)
            return false;
        if (other.getGrant() != null && other.getGrant().equals(this.getGrant()) == false)
            return false;
        if (other.getGrantType() == null ^ this.getGrantType() == null)
            return false;
        if (other.getGrantType() != null && other.getGrantType().equals(this.getGrantType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGrant() == null) ? 0 : getGrant().hashCode());
        hashCode = prime * hashCode + ((getGrantType() == null) ? 0 : getGrantType().hashCode());
        return hashCode;
    }

    @Override
    public GrantItem clone() {
        try {
            return (GrantItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssoadmin.model.transform.GrantItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
