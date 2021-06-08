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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an Automation runbook (Automation document) used in a runbook workflow in Change Manager.
 * </p>
 * <note>
 * <p>
 * The Automation runbooks specified for the runbook workflow can't run until all required approvals for the change
 * request have been received.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/Runbook" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Runbook implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Automation runbook (Automation document) used in a runbook workflow.
     * </p>
     */
    private String documentName;
    /**
     * <p>
     * The version of the Automation runbook (Automation document) used in a runbook workflow.
     * </p>
     */
    private String documentVersion;
    /**
     * <p>
     * The key-value map of execution parameters, which were supplied when calling
     * <code>StartChangeRequestExecution</code>.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> parameters;
    /**
     * <p>
     * The name of the parameter used as the target resource for the rate-controlled runbook workflow. Required if you
     * specify <code>Targets</code>.
     * </p>
     */
    private String targetParameterName;
    /**
     * <p>
     * A key-value mapping to target resources that the Runbook operation performs tasks on. Required if you specify
     * <code>TargetParameterName</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Target> targets;
    /**
     * <p>
     * The <code>MaxConcurrency</code> value specified by the user when the operation started, indicating the maximum
     * number of resources that the runbook operation can run on at the same time.
     * </p>
     */
    private String maxConcurrency;
    /**
     * <p>
     * The <code>MaxErrors</code> value specified by the user when the execution started, indicating the maximum number
     * of errors that can occur during the operation before the updates are stopped or rolled back.
     * </p>
     */
    private String maxErrors;
    /**
     * <p>
     * Information about the AWS Regions and accounts targeted by the current Runbook operation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TargetLocation> targetLocations;

    /**
     * <p>
     * The name of the Automation runbook (Automation document) used in a runbook workflow.
     * </p>
     * 
     * @param documentName
     *        The name of the Automation runbook (Automation document) used in a runbook workflow.
     */

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * <p>
     * The name of the Automation runbook (Automation document) used in a runbook workflow.
     * </p>
     * 
     * @return The name of the Automation runbook (Automation document) used in a runbook workflow.
     */

    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * <p>
     * The name of the Automation runbook (Automation document) used in a runbook workflow.
     * </p>
     * 
     * @param documentName
     *        The name of the Automation runbook (Automation document) used in a runbook workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Runbook withDocumentName(String documentName) {
        setDocumentName(documentName);
        return this;
    }

    /**
     * <p>
     * The version of the Automation runbook (Automation document) used in a runbook workflow.
     * </p>
     * 
     * @param documentVersion
     *        The version of the Automation runbook (Automation document) used in a runbook workflow.
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The version of the Automation runbook (Automation document) used in a runbook workflow.
     * </p>
     * 
     * @return The version of the Automation runbook (Automation document) used in a runbook workflow.
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The version of the Automation runbook (Automation document) used in a runbook workflow.
     * </p>
     * 
     * @param documentVersion
     *        The version of the Automation runbook (Automation document) used in a runbook workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Runbook withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
        return this;
    }

    /**
     * <p>
     * The key-value map of execution parameters, which were supplied when calling
     * <code>StartChangeRequestExecution</code>.
     * </p>
     * 
     * @return The key-value map of execution parameters, which were supplied when calling
     *         <code>StartChangeRequestExecution</code>.
     */

    public java.util.Map<String, java.util.List<String>> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The key-value map of execution parameters, which were supplied when calling
     * <code>StartChangeRequestExecution</code>.
     * </p>
     * 
     * @param parameters
     *        The key-value map of execution parameters, which were supplied when calling
     *        <code>StartChangeRequestExecution</code>.
     */

    public void setParameters(java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The key-value map of execution parameters, which were supplied when calling
     * <code>StartChangeRequestExecution</code>.
     * </p>
     * 
     * @param parameters
     *        The key-value map of execution parameters, which were supplied when calling
     *        <code>StartChangeRequestExecution</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Runbook withParameters(java.util.Map<String, java.util.List<String>> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see Runbook#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Runbook addParametersEntry(String key, java.util.List<String> value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Runbook clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The name of the parameter used as the target resource for the rate-controlled runbook workflow. Required if you
     * specify <code>Targets</code>.
     * </p>
     * 
     * @param targetParameterName
     *        The name of the parameter used as the target resource for the rate-controlled runbook workflow. Required
     *        if you specify <code>Targets</code>.
     */

    public void setTargetParameterName(String targetParameterName) {
        this.targetParameterName = targetParameterName;
    }

    /**
     * <p>
     * The name of the parameter used as the target resource for the rate-controlled runbook workflow. Required if you
     * specify <code>Targets</code>.
     * </p>
     * 
     * @return The name of the parameter used as the target resource for the rate-controlled runbook workflow. Required
     *         if you specify <code>Targets</code>.
     */

    public String getTargetParameterName() {
        return this.targetParameterName;
    }

    /**
     * <p>
     * The name of the parameter used as the target resource for the rate-controlled runbook workflow. Required if you
     * specify <code>Targets</code>.
     * </p>
     * 
     * @param targetParameterName
     *        The name of the parameter used as the target resource for the rate-controlled runbook workflow. Required
     *        if you specify <code>Targets</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Runbook withTargetParameterName(String targetParameterName) {
        setTargetParameterName(targetParameterName);
        return this;
    }

    /**
     * <p>
     * A key-value mapping to target resources that the Runbook operation performs tasks on. Required if you specify
     * <code>TargetParameterName</code>.
     * </p>
     * 
     * @return A key-value mapping to target resources that the Runbook operation performs tasks on. Required if you
     *         specify <code>TargetParameterName</code>.
     */

    public java.util.List<Target> getTargets() {
        if (targets == null) {
            targets = new com.amazonaws.internal.SdkInternalList<Target>();
        }
        return targets;
    }

    /**
     * <p>
     * A key-value mapping to target resources that the Runbook operation performs tasks on. Required if you specify
     * <code>TargetParameterName</code>.
     * </p>
     * 
     * @param targets
     *        A key-value mapping to target resources that the Runbook operation performs tasks on. Required if you
     *        specify <code>TargetParameterName</code>.
     */

    public void setTargets(java.util.Collection<Target> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new com.amazonaws.internal.SdkInternalList<Target>(targets);
    }

    /**
     * <p>
     * A key-value mapping to target resources that the Runbook operation performs tasks on. Required if you specify
     * <code>TargetParameterName</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        A key-value mapping to target resources that the Runbook operation performs tasks on. Required if you
     *        specify <code>TargetParameterName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Runbook withTargets(Target... targets) {
        if (this.targets == null) {
            setTargets(new com.amazonaws.internal.SdkInternalList<Target>(targets.length));
        }
        for (Target ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A key-value mapping to target resources that the Runbook operation performs tasks on. Required if you specify
     * <code>TargetParameterName</code>.
     * </p>
     * 
     * @param targets
     *        A key-value mapping to target resources that the Runbook operation performs tasks on. Required if you
     *        specify <code>TargetParameterName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Runbook withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * The <code>MaxConcurrency</code> value specified by the user when the operation started, indicating the maximum
     * number of resources that the runbook operation can run on at the same time.
     * </p>
     * 
     * @param maxConcurrency
     *        The <code>MaxConcurrency</code> value specified by the user when the operation started, indicating the
     *        maximum number of resources that the runbook operation can run on at the same time.
     */

    public void setMaxConcurrency(String maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    /**
     * <p>
     * The <code>MaxConcurrency</code> value specified by the user when the operation started, indicating the maximum
     * number of resources that the runbook operation can run on at the same time.
     * </p>
     * 
     * @return The <code>MaxConcurrency</code> value specified by the user when the operation started, indicating the
     *         maximum number of resources that the runbook operation can run on at the same time.
     */

    public String getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * <p>
     * The <code>MaxConcurrency</code> value specified by the user when the operation started, indicating the maximum
     * number of resources that the runbook operation can run on at the same time.
     * </p>
     * 
     * @param maxConcurrency
     *        The <code>MaxConcurrency</code> value specified by the user when the operation started, indicating the
     *        maximum number of resources that the runbook operation can run on at the same time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Runbook withMaxConcurrency(String maxConcurrency) {
        setMaxConcurrency(maxConcurrency);
        return this;
    }

    /**
     * <p>
     * The <code>MaxErrors</code> value specified by the user when the execution started, indicating the maximum number
     * of errors that can occur during the operation before the updates are stopped or rolled back.
     * </p>
     * 
     * @param maxErrors
     *        The <code>MaxErrors</code> value specified by the user when the execution started, indicating the maximum
     *        number of errors that can occur during the operation before the updates are stopped or rolled back.
     */

    public void setMaxErrors(String maxErrors) {
        this.maxErrors = maxErrors;
    }

    /**
     * <p>
     * The <code>MaxErrors</code> value specified by the user when the execution started, indicating the maximum number
     * of errors that can occur during the operation before the updates are stopped or rolled back.
     * </p>
     * 
     * @return The <code>MaxErrors</code> value specified by the user when the execution started, indicating the maximum
     *         number of errors that can occur during the operation before the updates are stopped or rolled back.
     */

    public String getMaxErrors() {
        return this.maxErrors;
    }

    /**
     * <p>
     * The <code>MaxErrors</code> value specified by the user when the execution started, indicating the maximum number
     * of errors that can occur during the operation before the updates are stopped or rolled back.
     * </p>
     * 
     * @param maxErrors
     *        The <code>MaxErrors</code> value specified by the user when the execution started, indicating the maximum
     *        number of errors that can occur during the operation before the updates are stopped or rolled back.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Runbook withMaxErrors(String maxErrors) {
        setMaxErrors(maxErrors);
        return this;
    }

    /**
     * <p>
     * Information about the AWS Regions and accounts targeted by the current Runbook operation.
     * </p>
     * 
     * @return Information about the AWS Regions and accounts targeted by the current Runbook operation.
     */

    public java.util.List<TargetLocation> getTargetLocations() {
        if (targetLocations == null) {
            targetLocations = new com.amazonaws.internal.SdkInternalList<TargetLocation>();
        }
        return targetLocations;
    }

    /**
     * <p>
     * Information about the AWS Regions and accounts targeted by the current Runbook operation.
     * </p>
     * 
     * @param targetLocations
     *        Information about the AWS Regions and accounts targeted by the current Runbook operation.
     */

    public void setTargetLocations(java.util.Collection<TargetLocation> targetLocations) {
        if (targetLocations == null) {
            this.targetLocations = null;
            return;
        }

        this.targetLocations = new com.amazonaws.internal.SdkInternalList<TargetLocation>(targetLocations);
    }

    /**
     * <p>
     * Information about the AWS Regions and accounts targeted by the current Runbook operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetLocations(java.util.Collection)} or {@link #withTargetLocations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param targetLocations
     *        Information about the AWS Regions and accounts targeted by the current Runbook operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Runbook withTargetLocations(TargetLocation... targetLocations) {
        if (this.targetLocations == null) {
            setTargetLocations(new com.amazonaws.internal.SdkInternalList<TargetLocation>(targetLocations.length));
        }
        for (TargetLocation ele : targetLocations) {
            this.targetLocations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the AWS Regions and accounts targeted by the current Runbook operation.
     * </p>
     * 
     * @param targetLocations
     *        Information about the AWS Regions and accounts targeted by the current Runbook operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Runbook withTargetLocations(java.util.Collection<TargetLocation> targetLocations) {
        setTargetLocations(targetLocations);
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
        if (getDocumentName() != null)
            sb.append("DocumentName: ").append(getDocumentName()).append(",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: ").append(getDocumentVersion()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getTargetParameterName() != null)
            sb.append("TargetParameterName: ").append(getTargetParameterName()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getMaxConcurrency() != null)
            sb.append("MaxConcurrency: ").append(getMaxConcurrency()).append(",");
        if (getMaxErrors() != null)
            sb.append("MaxErrors: ").append(getMaxErrors()).append(",");
        if (getTargetLocations() != null)
            sb.append("TargetLocations: ").append(getTargetLocations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Runbook == false)
            return false;
        Runbook other = (Runbook) obj;
        if (other.getDocumentName() == null ^ this.getDocumentName() == null)
            return false;
        if (other.getDocumentName() != null && other.getDocumentName().equals(this.getDocumentName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getTargetParameterName() == null ^ this.getTargetParameterName() == null)
            return false;
        if (other.getTargetParameterName() != null && other.getTargetParameterName().equals(this.getTargetParameterName()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getMaxConcurrency() == null ^ this.getMaxConcurrency() == null)
            return false;
        if (other.getMaxConcurrency() != null && other.getMaxConcurrency().equals(this.getMaxConcurrency()) == false)
            return false;
        if (other.getMaxErrors() == null ^ this.getMaxErrors() == null)
            return false;
        if (other.getMaxErrors() != null && other.getMaxErrors().equals(this.getMaxErrors()) == false)
            return false;
        if (other.getTargetLocations() == null ^ this.getTargetLocations() == null)
            return false;
        if (other.getTargetLocations() != null && other.getTargetLocations().equals(this.getTargetLocations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentName() == null) ? 0 : getDocumentName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getTargetParameterName() == null) ? 0 : getTargetParameterName().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrency() == null) ? 0 : getMaxConcurrency().hashCode());
        hashCode = prime * hashCode + ((getMaxErrors() == null) ? 0 : getMaxErrors().hashCode());
        hashCode = prime * hashCode + ((getTargetLocations() == null) ? 0 : getTargetLocations().hashCode());
        return hashCode;
    }

    @Override
    public Runbook clone() {
        try {
            return (Runbook) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.RunbookMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
