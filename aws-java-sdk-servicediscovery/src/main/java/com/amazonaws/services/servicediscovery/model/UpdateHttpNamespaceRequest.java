/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/UpdateHttpNamespace"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateHttpNamespaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the namespace that you want to update.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>UpdateHttpNamespace</code> requests to
     * be retried without the risk of running the operation twice. <code>UpdaterRequestId</code> can be any unique
     * string (for example, a date/timestamp).
     * </p>
     */
    private String updaterRequestId;
    /**
     * <p>
     * Updated properties for the the HTTP namespace.
     * </p>
     */
    private HttpNamespaceChange namespace;

    /**
     * <p>
     * The ID of the namespace that you want to update.
     * </p>
     * 
     * @param id
     *        The ID of the namespace that you want to update.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the namespace that you want to update.
     * </p>
     * 
     * @return The ID of the namespace that you want to update.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the namespace that you want to update.
     * </p>
     * 
     * @param id
     *        The ID of the namespace that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHttpNamespaceRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>UpdateHttpNamespace</code> requests to
     * be retried without the risk of running the operation twice. <code>UpdaterRequestId</code> can be any unique
     * string (for example, a date/timestamp).
     * </p>
     * 
     * @param updaterRequestId
     *        A unique string that identifies the request and that allows failed <code>UpdateHttpNamespace</code>
     *        requests to be retried without the risk of running the operation twice. <code>UpdaterRequestId</code> can
     *        be any unique string (for example, a date/timestamp).
     */

    public void setUpdaterRequestId(String updaterRequestId) {
        this.updaterRequestId = updaterRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>UpdateHttpNamespace</code> requests to
     * be retried without the risk of running the operation twice. <code>UpdaterRequestId</code> can be any unique
     * string (for example, a date/timestamp).
     * </p>
     * 
     * @return A unique string that identifies the request and that allows failed <code>UpdateHttpNamespace</code>
     *         requests to be retried without the risk of running the operation twice. <code>UpdaterRequestId</code> can
     *         be any unique string (for example, a date/timestamp).
     */

    public String getUpdaterRequestId() {
        return this.updaterRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>UpdateHttpNamespace</code> requests to
     * be retried without the risk of running the operation twice. <code>UpdaterRequestId</code> can be any unique
     * string (for example, a date/timestamp).
     * </p>
     * 
     * @param updaterRequestId
     *        A unique string that identifies the request and that allows failed <code>UpdateHttpNamespace</code>
     *        requests to be retried without the risk of running the operation twice. <code>UpdaterRequestId</code> can
     *        be any unique string (for example, a date/timestamp).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHttpNamespaceRequest withUpdaterRequestId(String updaterRequestId) {
        setUpdaterRequestId(updaterRequestId);
        return this;
    }

    /**
     * <p>
     * Updated properties for the the HTTP namespace.
     * </p>
     * 
     * @param namespace
     *        Updated properties for the the HTTP namespace.
     */

    public void setNamespace(HttpNamespaceChange namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * Updated properties for the the HTTP namespace.
     * </p>
     * 
     * @return Updated properties for the the HTTP namespace.
     */

    public HttpNamespaceChange getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * Updated properties for the the HTTP namespace.
     * </p>
     * 
     * @param namespace
     *        Updated properties for the the HTTP namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHttpNamespaceRequest withNamespace(HttpNamespaceChange namespace) {
        setNamespace(namespace);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getUpdaterRequestId() != null)
            sb.append("UpdaterRequestId: ").append(getUpdaterRequestId()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateHttpNamespaceRequest == false)
            return false;
        UpdateHttpNamespaceRequest other = (UpdateHttpNamespaceRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getUpdaterRequestId() == null ^ this.getUpdaterRequestId() == null)
            return false;
        if (other.getUpdaterRequestId() != null && other.getUpdaterRequestId().equals(this.getUpdaterRequestId()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getUpdaterRequestId() == null) ? 0 : getUpdaterRequestId().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        return hashCode;
    }

    @Override
    public UpdateHttpNamespaceRequest clone() {
        return (UpdateHttpNamespaceRequest) super.clone();
    }

}
