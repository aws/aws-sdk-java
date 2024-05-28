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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DeleteKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ForceDelete bypasses an API key's expiry conditions and deletes the key. Set the parameter <code>true</code> to
     * delete the key or to <code>false</code> to not preemptively delete the API key.
     * </p>
     * <p>
     * Valid values: <code>true</code>, or <code>false</code>.
     * </p>
     * <p>
     * Required: No
     * </p>
     * <note>
     * <p>
     * This action is irreversible. Only use ForceDelete if you are certain the key is no longer in use.
     * </p>
     * </note>
     */
    private Boolean forceDelete;
    /**
     * <p>
     * The name of the API key to delete.
     * </p>
     */
    private String keyName;

    /**
     * <p>
     * ForceDelete bypasses an API key's expiry conditions and deletes the key. Set the parameter <code>true</code> to
     * delete the key or to <code>false</code> to not preemptively delete the API key.
     * </p>
     * <p>
     * Valid values: <code>true</code>, or <code>false</code>.
     * </p>
     * <p>
     * Required: No
     * </p>
     * <note>
     * <p>
     * This action is irreversible. Only use ForceDelete if you are certain the key is no longer in use.
     * </p>
     * </note>
     * 
     * @param forceDelete
     *        ForceDelete bypasses an API key's expiry conditions and deletes the key. Set the parameter
     *        <code>true</code> to delete the key or to <code>false</code> to not preemptively delete the API key.</p>
     *        <p>
     *        Valid values: <code>true</code>, or <code>false</code>.
     *        </p>
     *        <p>
     *        Required: No
     *        </p>
     *        <note>
     *        <p>
     *        This action is irreversible. Only use ForceDelete if you are certain the key is no longer in use.
     *        </p>
     */

    public void setForceDelete(Boolean forceDelete) {
        this.forceDelete = forceDelete;
    }

    /**
     * <p>
     * ForceDelete bypasses an API key's expiry conditions and deletes the key. Set the parameter <code>true</code> to
     * delete the key or to <code>false</code> to not preemptively delete the API key.
     * </p>
     * <p>
     * Valid values: <code>true</code>, or <code>false</code>.
     * </p>
     * <p>
     * Required: No
     * </p>
     * <note>
     * <p>
     * This action is irreversible. Only use ForceDelete if you are certain the key is no longer in use.
     * </p>
     * </note>
     * 
     * @return ForceDelete bypasses an API key's expiry conditions and deletes the key. Set the parameter
     *         <code>true</code> to delete the key or to <code>false</code> to not preemptively delete the API key.</p>
     *         <p>
     *         Valid values: <code>true</code>, or <code>false</code>.
     *         </p>
     *         <p>
     *         Required: No
     *         </p>
     *         <note>
     *         <p>
     *         This action is irreversible. Only use ForceDelete if you are certain the key is no longer in use.
     *         </p>
     */

    public Boolean getForceDelete() {
        return this.forceDelete;
    }

    /**
     * <p>
     * ForceDelete bypasses an API key's expiry conditions and deletes the key. Set the parameter <code>true</code> to
     * delete the key or to <code>false</code> to not preemptively delete the API key.
     * </p>
     * <p>
     * Valid values: <code>true</code>, or <code>false</code>.
     * </p>
     * <p>
     * Required: No
     * </p>
     * <note>
     * <p>
     * This action is irreversible. Only use ForceDelete if you are certain the key is no longer in use.
     * </p>
     * </note>
     * 
     * @param forceDelete
     *        ForceDelete bypasses an API key's expiry conditions and deletes the key. Set the parameter
     *        <code>true</code> to delete the key or to <code>false</code> to not preemptively delete the API key.</p>
     *        <p>
     *        Valid values: <code>true</code>, or <code>false</code>.
     *        </p>
     *        <p>
     *        Required: No
     *        </p>
     *        <note>
     *        <p>
     *        This action is irreversible. Only use ForceDelete if you are certain the key is no longer in use.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteKeyRequest withForceDelete(Boolean forceDelete) {
        setForceDelete(forceDelete);
        return this;
    }

    /**
     * <p>
     * ForceDelete bypasses an API key's expiry conditions and deletes the key. Set the parameter <code>true</code> to
     * delete the key or to <code>false</code> to not preemptively delete the API key.
     * </p>
     * <p>
     * Valid values: <code>true</code>, or <code>false</code>.
     * </p>
     * <p>
     * Required: No
     * </p>
     * <note>
     * <p>
     * This action is irreversible. Only use ForceDelete if you are certain the key is no longer in use.
     * </p>
     * </note>
     * 
     * @return ForceDelete bypasses an API key's expiry conditions and deletes the key. Set the parameter
     *         <code>true</code> to delete the key or to <code>false</code> to not preemptively delete the API key.</p>
     *         <p>
     *         Valid values: <code>true</code>, or <code>false</code>.
     *         </p>
     *         <p>
     *         Required: No
     *         </p>
     *         <note>
     *         <p>
     *         This action is irreversible. Only use ForceDelete if you are certain the key is no longer in use.
     *         </p>
     */

    public Boolean isForceDelete() {
        return this.forceDelete;
    }

    /**
     * <p>
     * The name of the API key to delete.
     * </p>
     * 
     * @param keyName
     *        The name of the API key to delete.
     */

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The name of the API key to delete.
     * </p>
     * 
     * @return The name of the API key to delete.
     */

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * <p>
     * The name of the API key to delete.
     * </p>
     * 
     * @param keyName
     *        The name of the API key to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteKeyRequest withKeyName(String keyName) {
        setKeyName(keyName);
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
        if (getForceDelete() != null)
            sb.append("ForceDelete: ").append(getForceDelete()).append(",");
        if (getKeyName() != null)
            sb.append("KeyName: ").append(getKeyName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteKeyRequest == false)
            return false;
        DeleteKeyRequest other = (DeleteKeyRequest) obj;
        if (other.getForceDelete() == null ^ this.getForceDelete() == null)
            return false;
        if (other.getForceDelete() != null && other.getForceDelete().equals(this.getForceDelete()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getForceDelete() == null) ? 0 : getForceDelete().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteKeyRequest clone() {
        return (DeleteKeyRequest) super.clone();
    }

}
