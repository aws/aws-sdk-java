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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * AWS Systems Manager Document.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/SsmDocument" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SsmDocument implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * User-friendly name for the AWS Systems Manager Document.
     * </p>
     */
    private String actionName;
    /**
     * <p>
     * If true, Cutover will not be enabled if the document has failed.
     * </p>
     */
    private Boolean mustSucceedForCutover;
    /**
     * <p>
     * AWS Systems Manager Document parameters.
     * </p>
     */
    private java.util.Map<String, java.util.List<SsmParameterStoreParameter>> parameters;
    /**
     * <p>
     * AWS Systems Manager Document name or full ARN.
     * </p>
     */
    private String ssmDocumentName;
    /**
     * <p>
     * AWS Systems Manager Document timeout seconds.
     * </p>
     */
    private Integer timeoutSeconds;

    /**
     * <p>
     * User-friendly name for the AWS Systems Manager Document.
     * </p>
     * 
     * @param actionName
     *        User-friendly name for the AWS Systems Manager Document.
     */

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * User-friendly name for the AWS Systems Manager Document.
     * </p>
     * 
     * @return User-friendly name for the AWS Systems Manager Document.
     */

    public String getActionName() {
        return this.actionName;
    }

    /**
     * <p>
     * User-friendly name for the AWS Systems Manager Document.
     * </p>
     * 
     * @param actionName
     *        User-friendly name for the AWS Systems Manager Document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SsmDocument withActionName(String actionName) {
        setActionName(actionName);
        return this;
    }

    /**
     * <p>
     * If true, Cutover will not be enabled if the document has failed.
     * </p>
     * 
     * @param mustSucceedForCutover
     *        If true, Cutover will not be enabled if the document has failed.
     */

    public void setMustSucceedForCutover(Boolean mustSucceedForCutover) {
        this.mustSucceedForCutover = mustSucceedForCutover;
    }

    /**
     * <p>
     * If true, Cutover will not be enabled if the document has failed.
     * </p>
     * 
     * @return If true, Cutover will not be enabled if the document has failed.
     */

    public Boolean getMustSucceedForCutover() {
        return this.mustSucceedForCutover;
    }

    /**
     * <p>
     * If true, Cutover will not be enabled if the document has failed.
     * </p>
     * 
     * @param mustSucceedForCutover
     *        If true, Cutover will not be enabled if the document has failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SsmDocument withMustSucceedForCutover(Boolean mustSucceedForCutover) {
        setMustSucceedForCutover(mustSucceedForCutover);
        return this;
    }

    /**
     * <p>
     * If true, Cutover will not be enabled if the document has failed.
     * </p>
     * 
     * @return If true, Cutover will not be enabled if the document has failed.
     */

    public Boolean isMustSucceedForCutover() {
        return this.mustSucceedForCutover;
    }

    /**
     * <p>
     * AWS Systems Manager Document parameters.
     * </p>
     * 
     * @return AWS Systems Manager Document parameters.
     */

    public java.util.Map<String, java.util.List<SsmParameterStoreParameter>> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * AWS Systems Manager Document parameters.
     * </p>
     * 
     * @param parameters
     *        AWS Systems Manager Document parameters.
     */

    public void setParameters(java.util.Map<String, java.util.List<SsmParameterStoreParameter>> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * AWS Systems Manager Document parameters.
     * </p>
     * 
     * @param parameters
     *        AWS Systems Manager Document parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SsmDocument withParameters(java.util.Map<String, java.util.List<SsmParameterStoreParameter>> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see SsmDocument#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SsmDocument addParametersEntry(String key, java.util.List<SsmParameterStoreParameter> value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, java.util.List<SsmParameterStoreParameter>>();
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

    public SsmDocument clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * AWS Systems Manager Document name or full ARN.
     * </p>
     * 
     * @param ssmDocumentName
     *        AWS Systems Manager Document name or full ARN.
     */

    public void setSsmDocumentName(String ssmDocumentName) {
        this.ssmDocumentName = ssmDocumentName;
    }

    /**
     * <p>
     * AWS Systems Manager Document name or full ARN.
     * </p>
     * 
     * @return AWS Systems Manager Document name or full ARN.
     */

    public String getSsmDocumentName() {
        return this.ssmDocumentName;
    }

    /**
     * <p>
     * AWS Systems Manager Document name or full ARN.
     * </p>
     * 
     * @param ssmDocumentName
     *        AWS Systems Manager Document name or full ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SsmDocument withSsmDocumentName(String ssmDocumentName) {
        setSsmDocumentName(ssmDocumentName);
        return this;
    }

    /**
     * <p>
     * AWS Systems Manager Document timeout seconds.
     * </p>
     * 
     * @param timeoutSeconds
     *        AWS Systems Manager Document timeout seconds.
     */

    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * <p>
     * AWS Systems Manager Document timeout seconds.
     * </p>
     * 
     * @return AWS Systems Manager Document timeout seconds.
     */

    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    /**
     * <p>
     * AWS Systems Manager Document timeout seconds.
     * </p>
     * 
     * @param timeoutSeconds
     *        AWS Systems Manager Document timeout seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SsmDocument withTimeoutSeconds(Integer timeoutSeconds) {
        setTimeoutSeconds(timeoutSeconds);
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
        if (getActionName() != null)
            sb.append("ActionName: ").append(getActionName()).append(",");
        if (getMustSucceedForCutover() != null)
            sb.append("MustSucceedForCutover: ").append(getMustSucceedForCutover()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getSsmDocumentName() != null)
            sb.append("SsmDocumentName: ").append(getSsmDocumentName()).append(",");
        if (getTimeoutSeconds() != null)
            sb.append("TimeoutSeconds: ").append(getTimeoutSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SsmDocument == false)
            return false;
        SsmDocument other = (SsmDocument) obj;
        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getMustSucceedForCutover() == null ^ this.getMustSucceedForCutover() == null)
            return false;
        if (other.getMustSucceedForCutover() != null && other.getMustSucceedForCutover().equals(this.getMustSucceedForCutover()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getSsmDocumentName() == null ^ this.getSsmDocumentName() == null)
            return false;
        if (other.getSsmDocumentName() != null && other.getSsmDocumentName().equals(this.getSsmDocumentName()) == false)
            return false;
        if (other.getTimeoutSeconds() == null ^ this.getTimeoutSeconds() == null)
            return false;
        if (other.getTimeoutSeconds() != null && other.getTimeoutSeconds().equals(this.getTimeoutSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getMustSucceedForCutover() == null) ? 0 : getMustSucceedForCutover().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getSsmDocumentName() == null) ? 0 : getSsmDocumentName().hashCode());
        hashCode = prime * hashCode + ((getTimeoutSeconds() == null) ? 0 : getTimeoutSeconds().hashCode());
        return hashCode;
    }

    @Override
    public SsmDocument clone() {
        try {
            return (SsmDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.SsmDocumentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
