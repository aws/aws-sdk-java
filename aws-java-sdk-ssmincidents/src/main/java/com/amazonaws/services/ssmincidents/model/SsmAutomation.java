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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the Systems Manager automation document that will be used as a runbook during an incident.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/SsmAutomation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SsmAutomation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The automation document's name.
     * </p>
     */
    private String documentName;
    /**
     * <p>
     * The automation document's version to use when running.
     * </p>
     */
    private String documentVersion;
    /**
     * <p>
     * The key-value pair parameters to use when running the automation document.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> parameters;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that the automation document will assume when running commands.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The account that the automation document will be run in. This can be in either the management account or an
     * application account.
     * </p>
     */
    private String targetAccount;

    /**
     * <p>
     * The automation document's name.
     * </p>
     * 
     * @param documentName
     *        The automation document's name.
     */

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * <p>
     * The automation document's name.
     * </p>
     * 
     * @return The automation document's name.
     */

    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * <p>
     * The automation document's name.
     * </p>
     * 
     * @param documentName
     *        The automation document's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SsmAutomation withDocumentName(String documentName) {
        setDocumentName(documentName);
        return this;
    }

    /**
     * <p>
     * The automation document's version to use when running.
     * </p>
     * 
     * @param documentVersion
     *        The automation document's version to use when running.
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The automation document's version to use when running.
     * </p>
     * 
     * @return The automation document's version to use when running.
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The automation document's version to use when running.
     * </p>
     * 
     * @param documentVersion
     *        The automation document's version to use when running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SsmAutomation withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
        return this;
    }

    /**
     * <p>
     * The key-value pair parameters to use when running the automation document.
     * </p>
     * 
     * @return The key-value pair parameters to use when running the automation document.
     */

    public java.util.Map<String, java.util.List<String>> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The key-value pair parameters to use when running the automation document.
     * </p>
     * 
     * @param parameters
     *        The key-value pair parameters to use when running the automation document.
     */

    public void setParameters(java.util.Map<String, java.util.List<String>> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The key-value pair parameters to use when running the automation document.
     * </p>
     * 
     * @param parameters
     *        The key-value pair parameters to use when running the automation document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SsmAutomation withParameters(java.util.Map<String, java.util.List<String>> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see SsmAutomation#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SsmAutomation addParametersEntry(String key, java.util.List<String> value) {
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

    public SsmAutomation clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that the automation document will assume when running commands.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role that the automation document will assume when running commands.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that the automation document will assume when running commands.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role that the automation document will assume when running
     *         commands.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that the automation document will assume when running commands.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role that the automation document will assume when running commands.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SsmAutomation withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The account that the automation document will be run in. This can be in either the management account or an
     * application account.
     * </p>
     * 
     * @param targetAccount
     *        The account that the automation document will be run in. This can be in either the management account or
     *        an application account.
     * @see SsmTargetAccount
     */

    public void setTargetAccount(String targetAccount) {
        this.targetAccount = targetAccount;
    }

    /**
     * <p>
     * The account that the automation document will be run in. This can be in either the management account or an
     * application account.
     * </p>
     * 
     * @return The account that the automation document will be run in. This can be in either the management account or
     *         an application account.
     * @see SsmTargetAccount
     */

    public String getTargetAccount() {
        return this.targetAccount;
    }

    /**
     * <p>
     * The account that the automation document will be run in. This can be in either the management account or an
     * application account.
     * </p>
     * 
     * @param targetAccount
     *        The account that the automation document will be run in. This can be in either the management account or
     *        an application account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SsmTargetAccount
     */

    public SsmAutomation withTargetAccount(String targetAccount) {
        setTargetAccount(targetAccount);
        return this;
    }

    /**
     * <p>
     * The account that the automation document will be run in. This can be in either the management account or an
     * application account.
     * </p>
     * 
     * @param targetAccount
     *        The account that the automation document will be run in. This can be in either the management account or
     *        an application account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SsmTargetAccount
     */

    public SsmAutomation withTargetAccount(SsmTargetAccount targetAccount) {
        this.targetAccount = targetAccount.toString();
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getTargetAccount() != null)
            sb.append("TargetAccount: ").append(getTargetAccount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SsmAutomation == false)
            return false;
        SsmAutomation other = (SsmAutomation) obj;
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
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTargetAccount() == null ^ this.getTargetAccount() == null)
            return false;
        if (other.getTargetAccount() != null && other.getTargetAccount().equals(this.getTargetAccount()) == false)
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
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTargetAccount() == null) ? 0 : getTargetAccount().hashCode());
        return hashCode;
    }

    @Override
    public SsmAutomation clone() {
        try {
            return (SsmAutomation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.SsmAutomationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
