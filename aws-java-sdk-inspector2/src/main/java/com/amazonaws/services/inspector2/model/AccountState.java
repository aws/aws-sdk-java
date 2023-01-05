/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object with details the status of an Amazon Web Services account within your Amazon Inspector environment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/AccountState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * An object detailing which resources Amazon Inspector is enabled to scan for the account.
     * </p>
     */
    private ResourceState resourceState;
    /**
     * <p>
     * An object detailing the status of Amazon Inspector for the account.
     * </p>
     */
    private State state;

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * 
     * @return The Amazon Web Services account ID.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountState withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * An object detailing which resources Amazon Inspector is enabled to scan for the account.
     * </p>
     * 
     * @param resourceState
     *        An object detailing which resources Amazon Inspector is enabled to scan for the account.
     */

    public void setResourceState(ResourceState resourceState) {
        this.resourceState = resourceState;
    }

    /**
     * <p>
     * An object detailing which resources Amazon Inspector is enabled to scan for the account.
     * </p>
     * 
     * @return An object detailing which resources Amazon Inspector is enabled to scan for the account.
     */

    public ResourceState getResourceState() {
        return this.resourceState;
    }

    /**
     * <p>
     * An object detailing which resources Amazon Inspector is enabled to scan for the account.
     * </p>
     * 
     * @param resourceState
     *        An object detailing which resources Amazon Inspector is enabled to scan for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountState withResourceState(ResourceState resourceState) {
        setResourceState(resourceState);
        return this;
    }

    /**
     * <p>
     * An object detailing the status of Amazon Inspector for the account.
     * </p>
     * 
     * @param state
     *        An object detailing the status of Amazon Inspector for the account.
     */

    public void setState(State state) {
        this.state = state;
    }

    /**
     * <p>
     * An object detailing the status of Amazon Inspector for the account.
     * </p>
     * 
     * @return An object detailing the status of Amazon Inspector for the account.
     */

    public State getState() {
        return this.state;
    }

    /**
     * <p>
     * An object detailing the status of Amazon Inspector for the account.
     * </p>
     * 
     * @param state
     *        An object detailing the status of Amazon Inspector for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountState withState(State state) {
        setState(state);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getResourceState() != null)
            sb.append("ResourceState: ").append(getResourceState()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountState == false)
            return false;
        AccountState other = (AccountState) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getResourceState() == null ^ this.getResourceState() == null)
            return false;
        if (other.getResourceState() != null && other.getResourceState().equals(this.getResourceState()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getResourceState() == null) ? 0 : getResourceState().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public AccountState clone() {
        try {
            return (AccountState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.AccountStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
