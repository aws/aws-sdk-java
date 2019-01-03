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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartOnDemandAuditTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Which checks are performed during the audit. The checks you specify must be enabled for your account or an
     * exception occurs. Use <code>DescribeAccountAuditConfiguration</code> to see the list of all checks including
     * those that are enabled or <code>UpdateAccountAuditConfiguration</code> to select which checks are enabled.
     * </p>
     */
    private java.util.List<String> targetCheckNames;

    /**
     * <p>
     * Which checks are performed during the audit. The checks you specify must be enabled for your account or an
     * exception occurs. Use <code>DescribeAccountAuditConfiguration</code> to see the list of all checks including
     * those that are enabled or <code>UpdateAccountAuditConfiguration</code> to select which checks are enabled.
     * </p>
     * 
     * @return Which checks are performed during the audit. The checks you specify must be enabled for your account or
     *         an exception occurs. Use <code>DescribeAccountAuditConfiguration</code> to see the list of all checks
     *         including those that are enabled or <code>UpdateAccountAuditConfiguration</code> to select which checks
     *         are enabled.
     */

    public java.util.List<String> getTargetCheckNames() {
        return targetCheckNames;
    }

    /**
     * <p>
     * Which checks are performed during the audit. The checks you specify must be enabled for your account or an
     * exception occurs. Use <code>DescribeAccountAuditConfiguration</code> to see the list of all checks including
     * those that are enabled or <code>UpdateAccountAuditConfiguration</code> to select which checks are enabled.
     * </p>
     * 
     * @param targetCheckNames
     *        Which checks are performed during the audit. The checks you specify must be enabled for your account or an
     *        exception occurs. Use <code>DescribeAccountAuditConfiguration</code> to see the list of all checks
     *        including those that are enabled or <code>UpdateAccountAuditConfiguration</code> to select which checks
     *        are enabled.
     */

    public void setTargetCheckNames(java.util.Collection<String> targetCheckNames) {
        if (targetCheckNames == null) {
            this.targetCheckNames = null;
            return;
        }

        this.targetCheckNames = new java.util.ArrayList<String>(targetCheckNames);
    }

    /**
     * <p>
     * Which checks are performed during the audit. The checks you specify must be enabled for your account or an
     * exception occurs. Use <code>DescribeAccountAuditConfiguration</code> to see the list of all checks including
     * those that are enabled or <code>UpdateAccountAuditConfiguration</code> to select which checks are enabled.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetCheckNames(java.util.Collection)} or {@link #withTargetCheckNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param targetCheckNames
     *        Which checks are performed during the audit. The checks you specify must be enabled for your account or an
     *        exception occurs. Use <code>DescribeAccountAuditConfiguration</code> to see the list of all checks
     *        including those that are enabled or <code>UpdateAccountAuditConfiguration</code> to select which checks
     *        are enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOnDemandAuditTaskRequest withTargetCheckNames(String... targetCheckNames) {
        if (this.targetCheckNames == null) {
            setTargetCheckNames(new java.util.ArrayList<String>(targetCheckNames.length));
        }
        for (String ele : targetCheckNames) {
            this.targetCheckNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Which checks are performed during the audit. The checks you specify must be enabled for your account or an
     * exception occurs. Use <code>DescribeAccountAuditConfiguration</code> to see the list of all checks including
     * those that are enabled or <code>UpdateAccountAuditConfiguration</code> to select which checks are enabled.
     * </p>
     * 
     * @param targetCheckNames
     *        Which checks are performed during the audit. The checks you specify must be enabled for your account or an
     *        exception occurs. Use <code>DescribeAccountAuditConfiguration</code> to see the list of all checks
     *        including those that are enabled or <code>UpdateAccountAuditConfiguration</code> to select which checks
     *        are enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartOnDemandAuditTaskRequest withTargetCheckNames(java.util.Collection<String> targetCheckNames) {
        setTargetCheckNames(targetCheckNames);
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
        if (getTargetCheckNames() != null)
            sb.append("TargetCheckNames: ").append(getTargetCheckNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartOnDemandAuditTaskRequest == false)
            return false;
        StartOnDemandAuditTaskRequest other = (StartOnDemandAuditTaskRequest) obj;
        if (other.getTargetCheckNames() == null ^ this.getTargetCheckNames() == null)
            return false;
        if (other.getTargetCheckNames() != null && other.getTargetCheckNames().equals(this.getTargetCheckNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetCheckNames() == null) ? 0 : getTargetCheckNames().hashCode());
        return hashCode;
    }

    @Override
    public StartOnDemandAuditTaskRequest clone() {
        return (StartOnDemandAuditTaskRequest) super.clone();
    }

}
