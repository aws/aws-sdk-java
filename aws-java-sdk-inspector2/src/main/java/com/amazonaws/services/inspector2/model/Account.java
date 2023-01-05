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
 * An Amazon Web Services account within your environment that Amazon Inspector has been enabled for.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/Account" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Account implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Amazon Web Services account.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * Details of the status of Amazon Inspector scans by resource type.
     * </p>
     */
    private ResourceStatus resourceStatus;
    /**
     * <p>
     * The status of Amazon Inspector for the account.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The ID of the Amazon Web Services account.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Account withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * Details of the status of Amazon Inspector scans by resource type.
     * </p>
     * 
     * @param resourceStatus
     *        Details of the status of Amazon Inspector scans by resource type.
     */

    public void setResourceStatus(ResourceStatus resourceStatus) {
        this.resourceStatus = resourceStatus;
    }

    /**
     * <p>
     * Details of the status of Amazon Inspector scans by resource type.
     * </p>
     * 
     * @return Details of the status of Amazon Inspector scans by resource type.
     */

    public ResourceStatus getResourceStatus() {
        return this.resourceStatus;
    }

    /**
     * <p>
     * Details of the status of Amazon Inspector scans by resource type.
     * </p>
     * 
     * @param resourceStatus
     *        Details of the status of Amazon Inspector scans by resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Account withResourceStatus(ResourceStatus resourceStatus) {
        setResourceStatus(resourceStatus);
        return this;
    }

    /**
     * <p>
     * The status of Amazon Inspector for the account.
     * </p>
     * 
     * @param status
     *        The status of Amazon Inspector for the account.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of Amazon Inspector for the account.
     * </p>
     * 
     * @return The status of Amazon Inspector for the account.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of Amazon Inspector for the account.
     * </p>
     * 
     * @param status
     *        The status of Amazon Inspector for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public Account withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of Amazon Inspector for the account.
     * </p>
     * 
     * @param status
     *        The status of Amazon Inspector for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public Account withStatus(Status status) {
        this.status = status.toString();
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
        if (getResourceStatus() != null)
            sb.append("ResourceStatus: ").append(getResourceStatus()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Account == false)
            return false;
        Account other = (Account) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getResourceStatus() == null ^ this.getResourceStatus() == null)
            return false;
        if (other.getResourceStatus() != null && other.getResourceStatus().equals(this.getResourceStatus()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getResourceStatus() == null) ? 0 : getResourceStatus().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public Account clone() {
        try {
            return (Account) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.AccountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
