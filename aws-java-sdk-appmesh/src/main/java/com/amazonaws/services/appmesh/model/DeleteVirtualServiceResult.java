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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DeleteVirtualService" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteVirtualServiceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The virtual service that was deleted.
     * </p>
     */
    private VirtualServiceData virtualService;

    /**
     * <p>
     * The virtual service that was deleted.
     * </p>
     * 
     * @param virtualService
     *        The virtual service that was deleted.
     */

    public void setVirtualService(VirtualServiceData virtualService) {
        this.virtualService = virtualService;
    }

    /**
     * <p>
     * The virtual service that was deleted.
     * </p>
     * 
     * @return The virtual service that was deleted.
     */

    public VirtualServiceData getVirtualService() {
        return this.virtualService;
    }

    /**
     * <p>
     * The virtual service that was deleted.
     * </p>
     * 
     * @param virtualService
     *        The virtual service that was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVirtualServiceResult withVirtualService(VirtualServiceData virtualService) {
        setVirtualService(virtualService);
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
        if (getVirtualService() != null)
            sb.append("VirtualService: ").append(getVirtualService());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteVirtualServiceResult == false)
            return false;
        DeleteVirtualServiceResult other = (DeleteVirtualServiceResult) obj;
        if (other.getVirtualService() == null ^ this.getVirtualService() == null)
            return false;
        if (other.getVirtualService() != null && other.getVirtualService().equals(this.getVirtualService()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVirtualService() == null) ? 0 : getVirtualService().hashCode());
        return hashCode;
    }

    @Override
    public DeleteVirtualServiceResult clone() {
        try {
            return (DeleteVirtualServiceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
