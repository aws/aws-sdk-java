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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetMasterAccount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMasterAccountResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of details about the Security Hub master account for the current member account.
     * </p>
     */
    private Invitation master;

    /**
     * <p>
     * A list of details about the Security Hub master account for the current member account.
     * </p>
     * 
     * @param master
     *        A list of details about the Security Hub master account for the current member account.
     */

    public void setMaster(Invitation master) {
        this.master = master;
    }

    /**
     * <p>
     * A list of details about the Security Hub master account for the current member account.
     * </p>
     * 
     * @return A list of details about the Security Hub master account for the current member account.
     */

    public Invitation getMaster() {
        return this.master;
    }

    /**
     * <p>
     * A list of details about the Security Hub master account for the current member account.
     * </p>
     * 
     * @param master
     *        A list of details about the Security Hub master account for the current member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMasterAccountResult withMaster(Invitation master) {
        setMaster(master);
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
        if (getMaster() != null)
            sb.append("Master: ").append(getMaster());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMasterAccountResult == false)
            return false;
        GetMasterAccountResult other = (GetMasterAccountResult) obj;
        if (other.getMaster() == null ^ this.getMaster() == null)
            return false;
        if (other.getMaster() != null && other.getMaster().equals(this.getMaster()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaster() == null) ? 0 : getMaster().hashCode());
        return hashCode;
    }

    @Override
    public GetMasterAccountResult clone() {
        try {
            return (GetMasterAccountResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
