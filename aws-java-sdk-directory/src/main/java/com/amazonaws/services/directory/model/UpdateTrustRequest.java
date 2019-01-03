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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/UpdateTrust" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTrustRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Identifier of the trust relationship.
     * </p>
     */
    private String trustId;
    /**
     * <p>
     * Updates selective authentication for the trust.
     * </p>
     */
    private String selectiveAuth;

    /**
     * <p>
     * Identifier of the trust relationship.
     * </p>
     * 
     * @param trustId
     *        Identifier of the trust relationship.
     */

    public void setTrustId(String trustId) {
        this.trustId = trustId;
    }

    /**
     * <p>
     * Identifier of the trust relationship.
     * </p>
     * 
     * @return Identifier of the trust relationship.
     */

    public String getTrustId() {
        return this.trustId;
    }

    /**
     * <p>
     * Identifier of the trust relationship.
     * </p>
     * 
     * @param trustId
     *        Identifier of the trust relationship.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrustRequest withTrustId(String trustId) {
        setTrustId(trustId);
        return this;
    }

    /**
     * <p>
     * Updates selective authentication for the trust.
     * </p>
     * 
     * @param selectiveAuth
     *        Updates selective authentication for the trust.
     * @see SelectiveAuth
     */

    public void setSelectiveAuth(String selectiveAuth) {
        this.selectiveAuth = selectiveAuth;
    }

    /**
     * <p>
     * Updates selective authentication for the trust.
     * </p>
     * 
     * @return Updates selective authentication for the trust.
     * @see SelectiveAuth
     */

    public String getSelectiveAuth() {
        return this.selectiveAuth;
    }

    /**
     * <p>
     * Updates selective authentication for the trust.
     * </p>
     * 
     * @param selectiveAuth
     *        Updates selective authentication for the trust.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SelectiveAuth
     */

    public UpdateTrustRequest withSelectiveAuth(String selectiveAuth) {
        setSelectiveAuth(selectiveAuth);
        return this;
    }

    /**
     * <p>
     * Updates selective authentication for the trust.
     * </p>
     * 
     * @param selectiveAuth
     *        Updates selective authentication for the trust.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SelectiveAuth
     */

    public UpdateTrustRequest withSelectiveAuth(SelectiveAuth selectiveAuth) {
        this.selectiveAuth = selectiveAuth.toString();
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
        if (getTrustId() != null)
            sb.append("TrustId: ").append(getTrustId()).append(",");
        if (getSelectiveAuth() != null)
            sb.append("SelectiveAuth: ").append(getSelectiveAuth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTrustRequest == false)
            return false;
        UpdateTrustRequest other = (UpdateTrustRequest) obj;
        if (other.getTrustId() == null ^ this.getTrustId() == null)
            return false;
        if (other.getTrustId() != null && other.getTrustId().equals(this.getTrustId()) == false)
            return false;
        if (other.getSelectiveAuth() == null ^ this.getSelectiveAuth() == null)
            return false;
        if (other.getSelectiveAuth() != null && other.getSelectiveAuth().equals(this.getSelectiveAuth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrustId() == null) ? 0 : getTrustId().hashCode());
        hashCode = prime * hashCode + ((getSelectiveAuth() == null) ? 0 : getSelectiveAuth().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTrustRequest clone() {
        return (UpdateTrustRequest) super.clone();
    }

}
