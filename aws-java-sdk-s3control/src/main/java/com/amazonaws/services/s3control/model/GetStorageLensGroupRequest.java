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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetStorageLensGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetStorageLensGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Storage Lens group that you're trying to retrieve the configuration details for.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Web Services account ID associated with the Storage Lens group that you're trying to retrieve the
     * details for.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * The name of the Storage Lens group that you're trying to retrieve the configuration details for.
     * </p>
     * 
     * @param name
     *        The name of the Storage Lens group that you're trying to retrieve the configuration details for.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Storage Lens group that you're trying to retrieve the configuration details for.
     * </p>
     * 
     * @return The name of the Storage Lens group that you're trying to retrieve the configuration details for.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Storage Lens group that you're trying to retrieve the configuration details for.
     * </p>
     * 
     * @param name
     *        The name of the Storage Lens group that you're trying to retrieve the configuration details for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStorageLensGroupRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID associated with the Storage Lens group that you're trying to retrieve the
     * details for.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID associated with the Storage Lens group that you're trying to retrieve
     *        the details for.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID associated with the Storage Lens group that you're trying to retrieve the
     * details for.
     * </p>
     * 
     * @return The Amazon Web Services account ID associated with the Storage Lens group that you're trying to retrieve
     *         the details for.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID associated with the Storage Lens group that you're trying to retrieve the
     * details for.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID associated with the Storage Lens group that you're trying to retrieve
     *        the details for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStorageLensGroupRequest withAccountId(String accountId) {
        setAccountId(accountId);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetStorageLensGroupRequest == false)
            return false;
        GetStorageLensGroupRequest other = (GetStorageLensGroupRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        return hashCode;
    }

    @Override
    public GetStorageLensGroupRequest clone() {
        return (GetStorageLensGroupRequest) super.clone();
    }

}
