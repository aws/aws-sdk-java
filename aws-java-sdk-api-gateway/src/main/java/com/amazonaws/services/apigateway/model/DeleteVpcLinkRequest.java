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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes an existing <a>VpcLink</a> of a specified identifier.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteVpcLinkRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] The identifier of the <a>VpcLink</a>. It is used in an <a>Integration</a> to reference this
     * <a>VpcLink</a>.
     * </p>
     */
    private String vpcLinkId;

    /**
     * <p>
     * [Required] The identifier of the <a>VpcLink</a>. It is used in an <a>Integration</a> to reference this
     * <a>VpcLink</a>.
     * </p>
     * 
     * @param vpcLinkId
     *        [Required] The identifier of the <a>VpcLink</a>. It is used in an <a>Integration</a> to reference this
     *        <a>VpcLink</a>.
     */

    public void setVpcLinkId(String vpcLinkId) {
        this.vpcLinkId = vpcLinkId;
    }

    /**
     * <p>
     * [Required] The identifier of the <a>VpcLink</a>. It is used in an <a>Integration</a> to reference this
     * <a>VpcLink</a>.
     * </p>
     * 
     * @return [Required] The identifier of the <a>VpcLink</a>. It is used in an <a>Integration</a> to reference this
     *         <a>VpcLink</a>.
     */

    public String getVpcLinkId() {
        return this.vpcLinkId;
    }

    /**
     * <p>
     * [Required] The identifier of the <a>VpcLink</a>. It is used in an <a>Integration</a> to reference this
     * <a>VpcLink</a>.
     * </p>
     * 
     * @param vpcLinkId
     *        [Required] The identifier of the <a>VpcLink</a>. It is used in an <a>Integration</a> to reference this
     *        <a>VpcLink</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVpcLinkRequest withVpcLinkId(String vpcLinkId) {
        setVpcLinkId(vpcLinkId);
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
        if (getVpcLinkId() != null)
            sb.append("VpcLinkId: ").append(getVpcLinkId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteVpcLinkRequest == false)
            return false;
        DeleteVpcLinkRequest other = (DeleteVpcLinkRequest) obj;
        if (other.getVpcLinkId() == null ^ this.getVpcLinkId() == null)
            return false;
        if (other.getVpcLinkId() != null && other.getVpcLinkId().equals(this.getVpcLinkId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcLinkId() == null) ? 0 : getVpcLinkId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteVpcLinkRequest clone() {
        return (DeleteVpcLinkRequest) super.clone();
    }

}
