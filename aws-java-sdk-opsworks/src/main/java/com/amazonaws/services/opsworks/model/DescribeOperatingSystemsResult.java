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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The response to a <code>DescribeOperatingSystems</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeOperatingSystems" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOperatingSystemsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains information in response to a <code>DescribeOperatingSystems</code> request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OperatingSystem> operatingSystems;

    /**
     * <p>
     * Contains information in response to a <code>DescribeOperatingSystems</code> request.
     * </p>
     * 
     * @return Contains information in response to a <code>DescribeOperatingSystems</code> request.
     */

    public java.util.List<OperatingSystem> getOperatingSystems() {
        if (operatingSystems == null) {
            operatingSystems = new com.amazonaws.internal.SdkInternalList<OperatingSystem>();
        }
        return operatingSystems;
    }

    /**
     * <p>
     * Contains information in response to a <code>DescribeOperatingSystems</code> request.
     * </p>
     * 
     * @param operatingSystems
     *        Contains information in response to a <code>DescribeOperatingSystems</code> request.
     */

    public void setOperatingSystems(java.util.Collection<OperatingSystem> operatingSystems) {
        if (operatingSystems == null) {
            this.operatingSystems = null;
            return;
        }

        this.operatingSystems = new com.amazonaws.internal.SdkInternalList<OperatingSystem>(operatingSystems);
    }

    /**
     * <p>
     * Contains information in response to a <code>DescribeOperatingSystems</code> request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOperatingSystems(java.util.Collection)} or {@link #withOperatingSystems(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param operatingSystems
     *        Contains information in response to a <code>DescribeOperatingSystems</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOperatingSystemsResult withOperatingSystems(OperatingSystem... operatingSystems) {
        if (this.operatingSystems == null) {
            setOperatingSystems(new com.amazonaws.internal.SdkInternalList<OperatingSystem>(operatingSystems.length));
        }
        for (OperatingSystem ele : operatingSystems) {
            this.operatingSystems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains information in response to a <code>DescribeOperatingSystems</code> request.
     * </p>
     * 
     * @param operatingSystems
     *        Contains information in response to a <code>DescribeOperatingSystems</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOperatingSystemsResult withOperatingSystems(java.util.Collection<OperatingSystem> operatingSystems) {
        setOperatingSystems(operatingSystems);
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
        if (getOperatingSystems() != null)
            sb.append("OperatingSystems: ").append(getOperatingSystems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeOperatingSystemsResult == false)
            return false;
        DescribeOperatingSystemsResult other = (DescribeOperatingSystemsResult) obj;
        if (other.getOperatingSystems() == null ^ this.getOperatingSystems() == null)
            return false;
        if (other.getOperatingSystems() != null && other.getOperatingSystems().equals(this.getOperatingSystems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperatingSystems() == null) ? 0 : getOperatingSystems().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOperatingSystemsResult clone() {
        try {
            return (DescribeOperatingSystemsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
