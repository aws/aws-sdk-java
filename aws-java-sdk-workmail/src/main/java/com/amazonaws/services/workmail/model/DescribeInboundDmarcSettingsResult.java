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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeInboundDmarcSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInboundDmarcSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists the enforcement setting of the applied policy.
     * </p>
     */
    private Boolean enforced;

    /**
     * <p>
     * Lists the enforcement setting of the applied policy.
     * </p>
     * 
     * @param enforced
     *        Lists the enforcement setting of the applied policy.
     */

    public void setEnforced(Boolean enforced) {
        this.enforced = enforced;
    }

    /**
     * <p>
     * Lists the enforcement setting of the applied policy.
     * </p>
     * 
     * @return Lists the enforcement setting of the applied policy.
     */

    public Boolean getEnforced() {
        return this.enforced;
    }

    /**
     * <p>
     * Lists the enforcement setting of the applied policy.
     * </p>
     * 
     * @param enforced
     *        Lists the enforcement setting of the applied policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInboundDmarcSettingsResult withEnforced(Boolean enforced) {
        setEnforced(enforced);
        return this;
    }

    /**
     * <p>
     * Lists the enforcement setting of the applied policy.
     * </p>
     * 
     * @return Lists the enforcement setting of the applied policy.
     */

    public Boolean isEnforced() {
        return this.enforced;
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
        if (getEnforced() != null)
            sb.append("Enforced: ").append(getEnforced());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInboundDmarcSettingsResult == false)
            return false;
        DescribeInboundDmarcSettingsResult other = (DescribeInboundDmarcSettingsResult) obj;
        if (other.getEnforced() == null ^ this.getEnforced() == null)
            return false;
        if (other.getEnforced() != null && other.getEnforced().equals(this.getEnforced()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnforced() == null) ? 0 : getEnforced().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInboundDmarcSettingsResult clone() {
        try {
            return (DescribeInboundDmarcSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
