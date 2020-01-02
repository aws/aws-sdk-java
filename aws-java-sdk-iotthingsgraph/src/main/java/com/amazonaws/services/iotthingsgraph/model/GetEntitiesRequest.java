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
package com.amazonaws.services.iotthingsgraph.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetEntities" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEntitiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of entity IDs.
     * </p>
     * <p>
     * The IDs should be in the following format.
     * </p>
     * <p>
     * <code>urn:tdm:REGION/ACCOUNT ID/default:device:DEVICENAME</code>
     * </p>
     */
    private java.util.List<String> ids;
    /**
     * <p>
     * The version of the user's namespace. Defaults to the latest version of the user's namespace.
     * </p>
     */
    private Long namespaceVersion;

    /**
     * <p>
     * An array of entity IDs.
     * </p>
     * <p>
     * The IDs should be in the following format.
     * </p>
     * <p>
     * <code>urn:tdm:REGION/ACCOUNT ID/default:device:DEVICENAME</code>
     * </p>
     * 
     * @return An array of entity IDs.</p>
     *         <p>
     *         The IDs should be in the following format.
     *         </p>
     *         <p>
     *         <code>urn:tdm:REGION/ACCOUNT ID/default:device:DEVICENAME</code>
     */

    public java.util.List<String> getIds() {
        return ids;
    }

    /**
     * <p>
     * An array of entity IDs.
     * </p>
     * <p>
     * The IDs should be in the following format.
     * </p>
     * <p>
     * <code>urn:tdm:REGION/ACCOUNT ID/default:device:DEVICENAME</code>
     * </p>
     * 
     * @param ids
     *        An array of entity IDs.</p>
     *        <p>
     *        The IDs should be in the following format.
     *        </p>
     *        <p>
     *        <code>urn:tdm:REGION/ACCOUNT ID/default:device:DEVICENAME</code>
     */

    public void setIds(java.util.Collection<String> ids) {
        if (ids == null) {
            this.ids = null;
            return;
        }

        this.ids = new java.util.ArrayList<String>(ids);
    }

    /**
     * <p>
     * An array of entity IDs.
     * </p>
     * <p>
     * The IDs should be in the following format.
     * </p>
     * <p>
     * <code>urn:tdm:REGION/ACCOUNT ID/default:device:DEVICENAME</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIds(java.util.Collection)} or {@link #withIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param ids
     *        An array of entity IDs.</p>
     *        <p>
     *        The IDs should be in the following format.
     *        </p>
     *        <p>
     *        <code>urn:tdm:REGION/ACCOUNT ID/default:device:DEVICENAME</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEntitiesRequest withIds(String... ids) {
        if (this.ids == null) {
            setIds(new java.util.ArrayList<String>(ids.length));
        }
        for (String ele : ids) {
            this.ids.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of entity IDs.
     * </p>
     * <p>
     * The IDs should be in the following format.
     * </p>
     * <p>
     * <code>urn:tdm:REGION/ACCOUNT ID/default:device:DEVICENAME</code>
     * </p>
     * 
     * @param ids
     *        An array of entity IDs.</p>
     *        <p>
     *        The IDs should be in the following format.
     *        </p>
     *        <p>
     *        <code>urn:tdm:REGION/ACCOUNT ID/default:device:DEVICENAME</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEntitiesRequest withIds(java.util.Collection<String> ids) {
        setIds(ids);
        return this;
    }

    /**
     * <p>
     * The version of the user's namespace. Defaults to the latest version of the user's namespace.
     * </p>
     * 
     * @param namespaceVersion
     *        The version of the user's namespace. Defaults to the latest version of the user's namespace.
     */

    public void setNamespaceVersion(Long namespaceVersion) {
        this.namespaceVersion = namespaceVersion;
    }

    /**
     * <p>
     * The version of the user's namespace. Defaults to the latest version of the user's namespace.
     * </p>
     * 
     * @return The version of the user's namespace. Defaults to the latest version of the user's namespace.
     */

    public Long getNamespaceVersion() {
        return this.namespaceVersion;
    }

    /**
     * <p>
     * The version of the user's namespace. Defaults to the latest version of the user's namespace.
     * </p>
     * 
     * @param namespaceVersion
     *        The version of the user's namespace. Defaults to the latest version of the user's namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEntitiesRequest withNamespaceVersion(Long namespaceVersion) {
        setNamespaceVersion(namespaceVersion);
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
        if (getIds() != null)
            sb.append("Ids: ").append(getIds()).append(",");
        if (getNamespaceVersion() != null)
            sb.append("NamespaceVersion: ").append(getNamespaceVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEntitiesRequest == false)
            return false;
        GetEntitiesRequest other = (GetEntitiesRequest) obj;
        if (other.getIds() == null ^ this.getIds() == null)
            return false;
        if (other.getIds() != null && other.getIds().equals(this.getIds()) == false)
            return false;
        if (other.getNamespaceVersion() == null ^ this.getNamespaceVersion() == null)
            return false;
        if (other.getNamespaceVersion() != null && other.getNamespaceVersion().equals(this.getNamespaceVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIds() == null) ? 0 : getIds().hashCode());
        hashCode = prime * hashCode + ((getNamespaceVersion() == null) ? 0 : getNamespaceVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetEntitiesRequest clone() {
        return (GetEntitiesRequest) super.clone();
    }

}
