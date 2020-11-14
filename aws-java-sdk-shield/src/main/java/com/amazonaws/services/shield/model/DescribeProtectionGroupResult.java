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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeProtectionGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProtectionGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A grouping of protected resources that you and AWS Shield Advanced can monitor as a collective. This resource
     * grouping improves the accuracy of detection and reduces false positives.
     * </p>
     */
    private ProtectionGroup protectionGroup;

    /**
     * <p>
     * A grouping of protected resources that you and AWS Shield Advanced can monitor as a collective. This resource
     * grouping improves the accuracy of detection and reduces false positives.
     * </p>
     * 
     * @param protectionGroup
     *        A grouping of protected resources that you and AWS Shield Advanced can monitor as a collective. This
     *        resource grouping improves the accuracy of detection and reduces false positives.
     */

    public void setProtectionGroup(ProtectionGroup protectionGroup) {
        this.protectionGroup = protectionGroup;
    }

    /**
     * <p>
     * A grouping of protected resources that you and AWS Shield Advanced can monitor as a collective. This resource
     * grouping improves the accuracy of detection and reduces false positives.
     * </p>
     * 
     * @return A grouping of protected resources that you and AWS Shield Advanced can monitor as a collective. This
     *         resource grouping improves the accuracy of detection and reduces false positives.
     */

    public ProtectionGroup getProtectionGroup() {
        return this.protectionGroup;
    }

    /**
     * <p>
     * A grouping of protected resources that you and AWS Shield Advanced can monitor as a collective. This resource
     * grouping improves the accuracy of detection and reduces false positives.
     * </p>
     * 
     * @param protectionGroup
     *        A grouping of protected resources that you and AWS Shield Advanced can monitor as a collective. This
     *        resource grouping improves the accuracy of detection and reduces false positives.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProtectionGroupResult withProtectionGroup(ProtectionGroup protectionGroup) {
        setProtectionGroup(protectionGroup);
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
        if (getProtectionGroup() != null)
            sb.append("ProtectionGroup: ").append(getProtectionGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProtectionGroupResult == false)
            return false;
        DescribeProtectionGroupResult other = (DescribeProtectionGroupResult) obj;
        if (other.getProtectionGroup() == null ^ this.getProtectionGroup() == null)
            return false;
        if (other.getProtectionGroup() != null && other.getProtectionGroup().equals(this.getProtectionGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtectionGroup() == null) ? 0 : getProtectionGroup().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProtectionGroupResult clone() {
        try {
            return (DescribeProtectionGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
