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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/AssociateAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the distribution that you’re associating the alias with.
     * </p>
     */
    private String targetDistributionId;
    /**
     * <p>
     * The alias (also known as a CNAME) to add to the target distribution.
     * </p>
     */
    private String alias;

    /**
     * <p>
     * The ID of the distribution that you’re associating the alias with.
     * </p>
     * 
     * @param targetDistributionId
     *        The ID of the distribution that you’re associating the alias with.
     */

    public void setTargetDistributionId(String targetDistributionId) {
        this.targetDistributionId = targetDistributionId;
    }

    /**
     * <p>
     * The ID of the distribution that you’re associating the alias with.
     * </p>
     * 
     * @return The ID of the distribution that you’re associating the alias with.
     */

    public String getTargetDistributionId() {
        return this.targetDistributionId;
    }

    /**
     * <p>
     * The ID of the distribution that you’re associating the alias with.
     * </p>
     * 
     * @param targetDistributionId
     *        The ID of the distribution that you’re associating the alias with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAliasRequest withTargetDistributionId(String targetDistributionId) {
        setTargetDistributionId(targetDistributionId);
        return this;
    }

    /**
     * <p>
     * The alias (also known as a CNAME) to add to the target distribution.
     * </p>
     * 
     * @param alias
     *        The alias (also known as a CNAME) to add to the target distribution.
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * The alias (also known as a CNAME) to add to the target distribution.
     * </p>
     * 
     * @return The alias (also known as a CNAME) to add to the target distribution.
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * The alias (also known as a CNAME) to add to the target distribution.
     * </p>
     * 
     * @param alias
     *        The alias (also known as a CNAME) to add to the target distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAliasRequest withAlias(String alias) {
        setAlias(alias);
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
        if (getTargetDistributionId() != null)
            sb.append("TargetDistributionId: ").append(getTargetDistributionId()).append(",");
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateAliasRequest == false)
            return false;
        AssociateAliasRequest other = (AssociateAliasRequest) obj;
        if (other.getTargetDistributionId() == null ^ this.getTargetDistributionId() == null)
            return false;
        if (other.getTargetDistributionId() != null && other.getTargetDistributionId().equals(this.getTargetDistributionId()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetDistributionId() == null) ? 0 : getTargetDistributionId().hashCode());
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        return hashCode;
    }

    @Override
    public AssociateAliasRequest clone() {
        return (AssociateAliasRequest) super.clone();
    }

}
