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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The combination of AWS Regions and accounts targeted by the current Automation execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/TargetLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS accounts targeted by the current Automation execution.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> accounts;
    /**
     * <p>
     * The AWS Regions targeted by the current Automation execution.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> regions;
    /**
     * <p>
     * The maxium number of AWS accounts and AWS regions allowed to run the Automation concurrently
     * </p>
     */
    private String targetLocationMaxConcurrency;
    /**
     * <p>
     * The maxium number of errors allowed before the system stops queueing additional Automation executions for the
     * currently running Automation.
     * </p>
     */
    private String targetLocationMaxErrors;
    /**
     * <p>
     * The Automation execution role used by the currently running Automation.
     * </p>
     */
    private String executionRoleName;

    /**
     * <p>
     * The AWS accounts targeted by the current Automation execution.
     * </p>
     * 
     * @return The AWS accounts targeted by the current Automation execution.
     */

    public java.util.List<String> getAccounts() {
        if (accounts == null) {
            accounts = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return accounts;
    }

    /**
     * <p>
     * The AWS accounts targeted by the current Automation execution.
     * </p>
     * 
     * @param accounts
     *        The AWS accounts targeted by the current Automation execution.
     */

    public void setAccounts(java.util.Collection<String> accounts) {
        if (accounts == null) {
            this.accounts = null;
            return;
        }

        this.accounts = new com.amazonaws.internal.SdkInternalList<String>(accounts);
    }

    /**
     * <p>
     * The AWS accounts targeted by the current Automation execution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccounts(java.util.Collection)} or {@link #withAccounts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param accounts
     *        The AWS accounts targeted by the current Automation execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetLocation withAccounts(String... accounts) {
        if (this.accounts == null) {
            setAccounts(new com.amazonaws.internal.SdkInternalList<String>(accounts.length));
        }
        for (String ele : accounts) {
            this.accounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The AWS accounts targeted by the current Automation execution.
     * </p>
     * 
     * @param accounts
     *        The AWS accounts targeted by the current Automation execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetLocation withAccounts(java.util.Collection<String> accounts) {
        setAccounts(accounts);
        return this;
    }

    /**
     * <p>
     * The AWS Regions targeted by the current Automation execution.
     * </p>
     * 
     * @return The AWS Regions targeted by the current Automation execution.
     */

    public java.util.List<String> getRegions() {
        if (regions == null) {
            regions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return regions;
    }

    /**
     * <p>
     * The AWS Regions targeted by the current Automation execution.
     * </p>
     * 
     * @param regions
     *        The AWS Regions targeted by the current Automation execution.
     */

    public void setRegions(java.util.Collection<String> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new com.amazonaws.internal.SdkInternalList<String>(regions);
    }

    /**
     * <p>
     * The AWS Regions targeted by the current Automation execution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegions(java.util.Collection)} or {@link #withRegions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param regions
     *        The AWS Regions targeted by the current Automation execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetLocation withRegions(String... regions) {
        if (this.regions == null) {
            setRegions(new com.amazonaws.internal.SdkInternalList<String>(regions.length));
        }
        for (String ele : regions) {
            this.regions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The AWS Regions targeted by the current Automation execution.
     * </p>
     * 
     * @param regions
     *        The AWS Regions targeted by the current Automation execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetLocation withRegions(java.util.Collection<String> regions) {
        setRegions(regions);
        return this;
    }

    /**
     * <p>
     * The maxium number of AWS accounts and AWS regions allowed to run the Automation concurrently
     * </p>
     * 
     * @param targetLocationMaxConcurrency
     *        The maxium number of AWS accounts and AWS regions allowed to run the Automation concurrently
     */

    public void setTargetLocationMaxConcurrency(String targetLocationMaxConcurrency) {
        this.targetLocationMaxConcurrency = targetLocationMaxConcurrency;
    }

    /**
     * <p>
     * The maxium number of AWS accounts and AWS regions allowed to run the Automation concurrently
     * </p>
     * 
     * @return The maxium number of AWS accounts and AWS regions allowed to run the Automation concurrently
     */

    public String getTargetLocationMaxConcurrency() {
        return this.targetLocationMaxConcurrency;
    }

    /**
     * <p>
     * The maxium number of AWS accounts and AWS regions allowed to run the Automation concurrently
     * </p>
     * 
     * @param targetLocationMaxConcurrency
     *        The maxium number of AWS accounts and AWS regions allowed to run the Automation concurrently
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetLocation withTargetLocationMaxConcurrency(String targetLocationMaxConcurrency) {
        setTargetLocationMaxConcurrency(targetLocationMaxConcurrency);
        return this;
    }

    /**
     * <p>
     * The maxium number of errors allowed before the system stops queueing additional Automation executions for the
     * currently running Automation.
     * </p>
     * 
     * @param targetLocationMaxErrors
     *        The maxium number of errors allowed before the system stops queueing additional Automation executions for
     *        the currently running Automation.
     */

    public void setTargetLocationMaxErrors(String targetLocationMaxErrors) {
        this.targetLocationMaxErrors = targetLocationMaxErrors;
    }

    /**
     * <p>
     * The maxium number of errors allowed before the system stops queueing additional Automation executions for the
     * currently running Automation.
     * </p>
     * 
     * @return The maxium number of errors allowed before the system stops queueing additional Automation executions for
     *         the currently running Automation.
     */

    public String getTargetLocationMaxErrors() {
        return this.targetLocationMaxErrors;
    }

    /**
     * <p>
     * The maxium number of errors allowed before the system stops queueing additional Automation executions for the
     * currently running Automation.
     * </p>
     * 
     * @param targetLocationMaxErrors
     *        The maxium number of errors allowed before the system stops queueing additional Automation executions for
     *        the currently running Automation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetLocation withTargetLocationMaxErrors(String targetLocationMaxErrors) {
        setTargetLocationMaxErrors(targetLocationMaxErrors);
        return this;
    }

    /**
     * <p>
     * The Automation execution role used by the currently running Automation.
     * </p>
     * 
     * @param executionRoleName
     *        The Automation execution role used by the currently running Automation.
     */

    public void setExecutionRoleName(String executionRoleName) {
        this.executionRoleName = executionRoleName;
    }

    /**
     * <p>
     * The Automation execution role used by the currently running Automation.
     * </p>
     * 
     * @return The Automation execution role used by the currently running Automation.
     */

    public String getExecutionRoleName() {
        return this.executionRoleName;
    }

    /**
     * <p>
     * The Automation execution role used by the currently running Automation.
     * </p>
     * 
     * @param executionRoleName
     *        The Automation execution role used by the currently running Automation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetLocation withExecutionRoleName(String executionRoleName) {
        setExecutionRoleName(executionRoleName);
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
        if (getAccounts() != null)
            sb.append("Accounts: ").append(getAccounts()).append(",");
        if (getRegions() != null)
            sb.append("Regions: ").append(getRegions()).append(",");
        if (getTargetLocationMaxConcurrency() != null)
            sb.append("TargetLocationMaxConcurrency: ").append(getTargetLocationMaxConcurrency()).append(",");
        if (getTargetLocationMaxErrors() != null)
            sb.append("TargetLocationMaxErrors: ").append(getTargetLocationMaxErrors()).append(",");
        if (getExecutionRoleName() != null)
            sb.append("ExecutionRoleName: ").append(getExecutionRoleName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetLocation == false)
            return false;
        TargetLocation other = (TargetLocation) obj;
        if (other.getAccounts() == null ^ this.getAccounts() == null)
            return false;
        if (other.getAccounts() != null && other.getAccounts().equals(this.getAccounts()) == false)
            return false;
        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false)
            return false;
        if (other.getTargetLocationMaxConcurrency() == null ^ this.getTargetLocationMaxConcurrency() == null)
            return false;
        if (other.getTargetLocationMaxConcurrency() != null && other.getTargetLocationMaxConcurrency().equals(this.getTargetLocationMaxConcurrency()) == false)
            return false;
        if (other.getTargetLocationMaxErrors() == null ^ this.getTargetLocationMaxErrors() == null)
            return false;
        if (other.getTargetLocationMaxErrors() != null && other.getTargetLocationMaxErrors().equals(this.getTargetLocationMaxErrors()) == false)
            return false;
        if (other.getExecutionRoleName() == null ^ this.getExecutionRoleName() == null)
            return false;
        if (other.getExecutionRoleName() != null && other.getExecutionRoleName().equals(this.getExecutionRoleName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccounts() == null) ? 0 : getAccounts().hashCode());
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        hashCode = prime * hashCode + ((getTargetLocationMaxConcurrency() == null) ? 0 : getTargetLocationMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getTargetLocationMaxErrors() == null) ? 0 : getTargetLocationMaxErrors().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleName() == null) ? 0 : getExecutionRoleName().hashCode());
        return hashCode;
    }

    @Override
    public TargetLocation clone() {
        try {
            return (TargetLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.TargetLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
