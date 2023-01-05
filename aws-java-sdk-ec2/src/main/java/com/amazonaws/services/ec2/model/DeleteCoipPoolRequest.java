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
import com.amazonaws.services.ec2.model.transform.DeleteCoipPoolRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCoipPoolRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DeleteCoipPoolRequest> {

    /**
     * <p>
     * The ID of the CoIP pool that you want to delete.
     * </p>
     */
    private String coipPoolId;

    /**
     * <p>
     * The ID of the CoIP pool that you want to delete.
     * </p>
     * 
     * @param coipPoolId
     *        The ID of the CoIP pool that you want to delete.
     */

    public void setCoipPoolId(String coipPoolId) {
        this.coipPoolId = coipPoolId;
    }

    /**
     * <p>
     * The ID of the CoIP pool that you want to delete.
     * </p>
     * 
     * @return The ID of the CoIP pool that you want to delete.
     */

    public String getCoipPoolId() {
        return this.coipPoolId;
    }

    /**
     * <p>
     * The ID of the CoIP pool that you want to delete.
     * </p>
     * 
     * @param coipPoolId
     *        The ID of the CoIP pool that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCoipPoolRequest withCoipPoolId(String coipPoolId) {
        setCoipPoolId(coipPoolId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteCoipPoolRequest> getDryRunRequest() {
        Request<DeleteCoipPoolRequest> request = new DeleteCoipPoolRequestMarshaller().marshall(this);
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
        if (getCoipPoolId() != null)
            sb.append("CoipPoolId: ").append(getCoipPoolId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCoipPoolRequest == false)
            return false;
        DeleteCoipPoolRequest other = (DeleteCoipPoolRequest) obj;
        if (other.getCoipPoolId() == null ^ this.getCoipPoolId() == null)
            return false;
        if (other.getCoipPoolId() != null && other.getCoipPoolId().equals(this.getCoipPoolId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoipPoolId() == null) ? 0 : getCoipPoolId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCoipPoolRequest clone() {
        return (DeleteCoipPoolRequest) super.clone();
    }
}
