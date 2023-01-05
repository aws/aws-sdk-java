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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyIpamScopeRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyIpamScopeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ModifyIpamScopeRequest> {

    /**
     * <p>
     * The ID of the scope you want to modify.
     * </p>
     */
    private String ipamScopeId;
    /**
     * <p>
     * The description of the scope you want to modify.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ID of the scope you want to modify.
     * </p>
     * 
     * @param ipamScopeId
     *        The ID of the scope you want to modify.
     */

    public void setIpamScopeId(String ipamScopeId) {
        this.ipamScopeId = ipamScopeId;
    }

    /**
     * <p>
     * The ID of the scope you want to modify.
     * </p>
     * 
     * @return The ID of the scope you want to modify.
     */

    public String getIpamScopeId() {
        return this.ipamScopeId;
    }

    /**
     * <p>
     * The ID of the scope you want to modify.
     * </p>
     * 
     * @param ipamScopeId
     *        The ID of the scope you want to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamScopeRequest withIpamScopeId(String ipamScopeId) {
        setIpamScopeId(ipamScopeId);
        return this;
    }

    /**
     * <p>
     * The description of the scope you want to modify.
     * </p>
     * 
     * @param description
     *        The description of the scope you want to modify.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the scope you want to modify.
     * </p>
     * 
     * @return The description of the scope you want to modify.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the scope you want to modify.
     * </p>
     * 
     * @param description
     *        The description of the scope you want to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyIpamScopeRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyIpamScopeRequest> getDryRunRequest() {
        Request<ModifyIpamScopeRequest> request = new ModifyIpamScopeRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getIpamScopeId() != null)
            sb.append("IpamScopeId: ").append(getIpamScopeId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyIpamScopeRequest == false)
            return false;
        ModifyIpamScopeRequest other = (ModifyIpamScopeRequest) obj;
        if (other.getIpamScopeId() == null ^ this.getIpamScopeId() == null)
            return false;
        if (other.getIpamScopeId() != null && other.getIpamScopeId().equals(this.getIpamScopeId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpamScopeId() == null) ? 0 : getIpamScopeId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public ModifyIpamScopeRequest clone() {
        return (ModifyIpamScopeRequest) super.clone();
    }
}
