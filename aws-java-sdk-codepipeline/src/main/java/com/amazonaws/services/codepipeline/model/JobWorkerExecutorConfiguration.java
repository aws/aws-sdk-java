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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the polling configuration for the <code>JobWorker</code> action engine, or executor.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/JobWorkerExecutorConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobWorkerExecutorConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The accounts in which the job worker is configured and might poll for jobs as part of the action execution.
     * </p>
     */
    private java.util.List<String> pollingAccounts;
    /**
     * <p>
     * The service Principals in which the job worker is configured and might poll for jobs as part of the action
     * execution.
     * </p>
     */
    private java.util.List<String> pollingServicePrincipals;

    /**
     * <p>
     * The accounts in which the job worker is configured and might poll for jobs as part of the action execution.
     * </p>
     * 
     * @return The accounts in which the job worker is configured and might poll for jobs as part of the action
     *         execution.
     */

    public java.util.List<String> getPollingAccounts() {
        return pollingAccounts;
    }

    /**
     * <p>
     * The accounts in which the job worker is configured and might poll for jobs as part of the action execution.
     * </p>
     * 
     * @param pollingAccounts
     *        The accounts in which the job worker is configured and might poll for jobs as part of the action
     *        execution.
     */

    public void setPollingAccounts(java.util.Collection<String> pollingAccounts) {
        if (pollingAccounts == null) {
            this.pollingAccounts = null;
            return;
        }

        this.pollingAccounts = new java.util.ArrayList<String>(pollingAccounts);
    }

    /**
     * <p>
     * The accounts in which the job worker is configured and might poll for jobs as part of the action execution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPollingAccounts(java.util.Collection)} or {@link #withPollingAccounts(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param pollingAccounts
     *        The accounts in which the job worker is configured and might poll for jobs as part of the action
     *        execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobWorkerExecutorConfiguration withPollingAccounts(String... pollingAccounts) {
        if (this.pollingAccounts == null) {
            setPollingAccounts(new java.util.ArrayList<String>(pollingAccounts.length));
        }
        for (String ele : pollingAccounts) {
            this.pollingAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The accounts in which the job worker is configured and might poll for jobs as part of the action execution.
     * </p>
     * 
     * @param pollingAccounts
     *        The accounts in which the job worker is configured and might poll for jobs as part of the action
     *        execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobWorkerExecutorConfiguration withPollingAccounts(java.util.Collection<String> pollingAccounts) {
        setPollingAccounts(pollingAccounts);
        return this;
    }

    /**
     * <p>
     * The service Principals in which the job worker is configured and might poll for jobs as part of the action
     * execution.
     * </p>
     * 
     * @return The service Principals in which the job worker is configured and might poll for jobs as part of the
     *         action execution.
     */

    public java.util.List<String> getPollingServicePrincipals() {
        return pollingServicePrincipals;
    }

    /**
     * <p>
     * The service Principals in which the job worker is configured and might poll for jobs as part of the action
     * execution.
     * </p>
     * 
     * @param pollingServicePrincipals
     *        The service Principals in which the job worker is configured and might poll for jobs as part of the action
     *        execution.
     */

    public void setPollingServicePrincipals(java.util.Collection<String> pollingServicePrincipals) {
        if (pollingServicePrincipals == null) {
            this.pollingServicePrincipals = null;
            return;
        }

        this.pollingServicePrincipals = new java.util.ArrayList<String>(pollingServicePrincipals);
    }

    /**
     * <p>
     * The service Principals in which the job worker is configured and might poll for jobs as part of the action
     * execution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPollingServicePrincipals(java.util.Collection)} or
     * {@link #withPollingServicePrincipals(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param pollingServicePrincipals
     *        The service Principals in which the job worker is configured and might poll for jobs as part of the action
     *        execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobWorkerExecutorConfiguration withPollingServicePrincipals(String... pollingServicePrincipals) {
        if (this.pollingServicePrincipals == null) {
            setPollingServicePrincipals(new java.util.ArrayList<String>(pollingServicePrincipals.length));
        }
        for (String ele : pollingServicePrincipals) {
            this.pollingServicePrincipals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The service Principals in which the job worker is configured and might poll for jobs as part of the action
     * execution.
     * </p>
     * 
     * @param pollingServicePrincipals
     *        The service Principals in which the job worker is configured and might poll for jobs as part of the action
     *        execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobWorkerExecutorConfiguration withPollingServicePrincipals(java.util.Collection<String> pollingServicePrincipals) {
        setPollingServicePrincipals(pollingServicePrincipals);
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
        if (getPollingAccounts() != null)
            sb.append("PollingAccounts: ").append(getPollingAccounts()).append(",");
        if (getPollingServicePrincipals() != null)
            sb.append("PollingServicePrincipals: ").append(getPollingServicePrincipals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobWorkerExecutorConfiguration == false)
            return false;
        JobWorkerExecutorConfiguration other = (JobWorkerExecutorConfiguration) obj;
        if (other.getPollingAccounts() == null ^ this.getPollingAccounts() == null)
            return false;
        if (other.getPollingAccounts() != null && other.getPollingAccounts().equals(this.getPollingAccounts()) == false)
            return false;
        if (other.getPollingServicePrincipals() == null ^ this.getPollingServicePrincipals() == null)
            return false;
        if (other.getPollingServicePrincipals() != null && other.getPollingServicePrincipals().equals(this.getPollingServicePrincipals()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPollingAccounts() == null) ? 0 : getPollingAccounts().hashCode());
        hashCode = prime * hashCode + ((getPollingServicePrincipals() == null) ? 0 : getPollingServicePrincipals().hashCode());
        return hashCode;
    }

    @Override
    public JobWorkerExecutorConfiguration clone() {
        try {
            return (JobWorkerExecutorConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.JobWorkerExecutorConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
