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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateResolverDnssecConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateResolverDnssecConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the virtual private cloud (VPC) that you're updating the DNSSEC validation status for.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The new value that you are specifying for DNSSEC validation for the VPC. The value can be <code>ENABLE</code> or
     * <code>DISABLE</code>. Be aware that it can take time for a validation status change to be completed.
     * </p>
     */
    private String validation;

    /**
     * <p>
     * The ID of the virtual private cloud (VPC) that you're updating the DNSSEC validation status for.
     * </p>
     * 
     * @param resourceId
     *        The ID of the virtual private cloud (VPC) that you're updating the DNSSEC validation status for.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the virtual private cloud (VPC) that you're updating the DNSSEC validation status for.
     * </p>
     * 
     * @return The ID of the virtual private cloud (VPC) that you're updating the DNSSEC validation status for.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the virtual private cloud (VPC) that you're updating the DNSSEC validation status for.
     * </p>
     * 
     * @param resourceId
     *        The ID of the virtual private cloud (VPC) that you're updating the DNSSEC validation status for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResolverDnssecConfigRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The new value that you are specifying for DNSSEC validation for the VPC. The value can be <code>ENABLE</code> or
     * <code>DISABLE</code>. Be aware that it can take time for a validation status change to be completed.
     * </p>
     * 
     * @param validation
     *        The new value that you are specifying for DNSSEC validation for the VPC. The value can be
     *        <code>ENABLE</code> or <code>DISABLE</code>. Be aware that it can take time for a validation status change
     *        to be completed.
     * @see Validation
     */

    public void setValidation(String validation) {
        this.validation = validation;
    }

    /**
     * <p>
     * The new value that you are specifying for DNSSEC validation for the VPC. The value can be <code>ENABLE</code> or
     * <code>DISABLE</code>. Be aware that it can take time for a validation status change to be completed.
     * </p>
     * 
     * @return The new value that you are specifying for DNSSEC validation for the VPC. The value can be
     *         <code>ENABLE</code> or <code>DISABLE</code>. Be aware that it can take time for a validation status
     *         change to be completed.
     * @see Validation
     */

    public String getValidation() {
        return this.validation;
    }

    /**
     * <p>
     * The new value that you are specifying for DNSSEC validation for the VPC. The value can be <code>ENABLE</code> or
     * <code>DISABLE</code>. Be aware that it can take time for a validation status change to be completed.
     * </p>
     * 
     * @param validation
     *        The new value that you are specifying for DNSSEC validation for the VPC. The value can be
     *        <code>ENABLE</code> or <code>DISABLE</code>. Be aware that it can take time for a validation status change
     *        to be completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Validation
     */

    public UpdateResolverDnssecConfigRequest withValidation(String validation) {
        setValidation(validation);
        return this;
    }

    /**
     * <p>
     * The new value that you are specifying for DNSSEC validation for the VPC. The value can be <code>ENABLE</code> or
     * <code>DISABLE</code>. Be aware that it can take time for a validation status change to be completed.
     * </p>
     * 
     * @param validation
     *        The new value that you are specifying for DNSSEC validation for the VPC. The value can be
     *        <code>ENABLE</code> or <code>DISABLE</code>. Be aware that it can take time for a validation status change
     *        to be completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Validation
     */

    public UpdateResolverDnssecConfigRequest withValidation(Validation validation) {
        this.validation = validation.toString();
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getValidation() != null)
            sb.append("Validation: ").append(getValidation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateResolverDnssecConfigRequest == false)
            return false;
        UpdateResolverDnssecConfigRequest other = (UpdateResolverDnssecConfigRequest) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getValidation() == null ^ this.getValidation() == null)
            return false;
        if (other.getValidation() != null && other.getValidation().equals(this.getValidation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getValidation() == null) ? 0 : getValidation().hashCode());
        return hashCode;
    }

    @Override
    public UpdateResolverDnssecConfigRequest clone() {
        return (UpdateResolverDnssecConfigRequest) super.clone();
    }

}
