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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DeleteVcenterClient" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteVcenterClientRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ID of resource to be deleted.
     * </p>
     */
    private String vcenterClientID;

    /**
     * <p>
     * ID of resource to be deleted.
     * </p>
     * 
     * @param vcenterClientID
     *        ID of resource to be deleted.
     */

    public void setVcenterClientID(String vcenterClientID) {
        this.vcenterClientID = vcenterClientID;
    }

    /**
     * <p>
     * ID of resource to be deleted.
     * </p>
     * 
     * @return ID of resource to be deleted.
     */

    public String getVcenterClientID() {
        return this.vcenterClientID;
    }

    /**
     * <p>
     * ID of resource to be deleted.
     * </p>
     * 
     * @param vcenterClientID
     *        ID of resource to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVcenterClientRequest withVcenterClientID(String vcenterClientID) {
        setVcenterClientID(vcenterClientID);
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
        if (getVcenterClientID() != null)
            sb.append("VcenterClientID: ").append(getVcenterClientID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteVcenterClientRequest == false)
            return false;
        DeleteVcenterClientRequest other = (DeleteVcenterClientRequest) obj;
        if (other.getVcenterClientID() == null ^ this.getVcenterClientID() == null)
            return false;
        if (other.getVcenterClientID() != null && other.getVcenterClientID().equals(this.getVcenterClientID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVcenterClientID() == null) ? 0 : getVcenterClientID().hashCode());
        return hashCode;
    }

    @Override
    public DeleteVcenterClientRequest clone() {
        return (DeleteVcenterClientRequest) super.clone();
    }

}
