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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/PutSourceServerAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSourceServerActionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Source server post migration custom action ID.
     * </p>
     */
    private String actionID;
    /**
     * <p>
     * Source server post migration custom action name.
     * </p>
     */
    private String actionName;
    /**
     * <p>
     * Source server post migration custom action active status.
     * </p>
     */
    private Boolean active;
    /**
     * <p>
     * Source server post migration custom action document identifier.
     * </p>
     */
    private String documentIdentifier;
    /**
     * <p>
     * Source server post migration custom action document version.
     * </p>
     */
    private String documentVersion;
    /**
     * <p>
     * Source server post migration custom action must succeed for cutover.
     * </p>
     */
    private Boolean mustSucceedForCutover;
    /**
     * <p>
     * Source server post migration custom action order.
     * </p>
     */
    private Integer order;
    /**
     * <p>
     * Source server post migration custom action parameters.
     * </p>
     */
    private java.util.Map<String, java.util.List<SsmParameterStoreParameter>> parameters;
    /**
     * <p>
     * Source server ID.
     * </p>
     */
    private String sourceServerID;
    /**
     * <p>
     * Source server post migration custom action timeout in seconds.
     * </p>
     */
    private Integer timeoutSeconds;

    /**
     * <p>
     * Source server post migration custom action ID.
     * </p>
     * 
     * @param actionID
     *        Source server post migration custom action ID.
     */

    public void setActionID(String actionID) {
        this.actionID = actionID;
    }

    /**
     * <p>
     * Source server post migration custom action ID.
     * </p>
     * 
     * @return Source server post migration custom action ID.
     */

    public String getActionID() {
        return this.actionID;
    }

    /**
     * <p>
     * Source server post migration custom action ID.
     * </p>
     * 
     * @param actionID
     *        Source server post migration custom action ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSourceServerActionRequest withActionID(String actionID) {
        setActionID(actionID);
        return this;
    }

    /**
     * <p>
     * Source server post migration custom action name.
     * </p>
     * 
     * @param actionName
     *        Source server post migration custom action name.
     */

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * Source server post migration custom action name.
     * </p>
     * 
     * @return Source server post migration custom action name.
     */

    public String getActionName() {
        return this.actionName;
    }

    /**
     * <p>
     * Source server post migration custom action name.
     * </p>
     * 
     * @param actionName
     *        Source server post migration custom action name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSourceServerActionRequest withActionName(String actionName) {
        setActionName(actionName);
        return this;
    }

    /**
     * <p>
     * Source server post migration custom action active status.
     * </p>
     * 
     * @param active
     *        Source server post migration custom action active status.
     */

    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * <p>
     * Source server post migration custom action active status.
     * </p>
     * 
     * @return Source server post migration custom action active status.
     */

    public Boolean getActive() {
        return this.active;
    }

    /**
     * <p>
     * Source server post migration custom action active status.
     * </p>
     * 
     * @param active
     *        Source server post migration custom action active status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSourceServerActionRequest withActive(Boolean active) {
        setActive(active);
        return this;
    }

    /**
     * <p>
     * Source server post migration custom action active status.
     * </p>
     * 
     * @return Source server post migration custom action active status.
     */

    public Boolean isActive() {
        return this.active;
    }

    /**
     * <p>
     * Source server post migration custom action document identifier.
     * </p>
     * 
     * @param documentIdentifier
     *        Source server post migration custom action document identifier.
     */

    public void setDocumentIdentifier(String documentIdentifier) {
        this.documentIdentifier = documentIdentifier;
    }

    /**
     * <p>
     * Source server post migration custom action document identifier.
     * </p>
     * 
     * @return Source server post migration custom action document identifier.
     */

    public String getDocumentIdentifier() {
        return this.documentIdentifier;
    }

    /**
     * <p>
     * Source server post migration custom action document identifier.
     * </p>
     * 
     * @param documentIdentifier
     *        Source server post migration custom action document identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSourceServerActionRequest withDocumentIdentifier(String documentIdentifier) {
        setDocumentIdentifier(documentIdentifier);
        return this;
    }

    /**
     * <p>
     * Source server post migration custom action document version.
     * </p>
     * 
     * @param documentVersion
     *        Source server post migration custom action document version.
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * Source server post migration custom action document version.
     * </p>
     * 
     * @return Source server post migration custom action document version.
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * Source server post migration custom action document version.
     * </p>
     * 
     * @param documentVersion
     *        Source server post migration custom action document version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSourceServerActionRequest withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
        return this;
    }

    /**
     * <p>
     * Source server post migration custom action must succeed for cutover.
     * </p>
     * 
     * @param mustSucceedForCutover
     *        Source server post migration custom action must succeed for cutover.
     */

    public void setMustSucceedForCutover(Boolean mustSucceedForCutover) {
        this.mustSucceedForCutover = mustSucceedForCutover;
    }

    /**
     * <p>
     * Source server post migration custom action must succeed for cutover.
     * </p>
     * 
     * @return Source server post migration custom action must succeed for cutover.
     */

    public Boolean getMustSucceedForCutover() {
        return this.mustSucceedForCutover;
    }

    /**
     * <p>
     * Source server post migration custom action must succeed for cutover.
     * </p>
     * 
     * @param mustSucceedForCutover
     *        Source server post migration custom action must succeed for cutover.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSourceServerActionRequest withMustSucceedForCutover(Boolean mustSucceedForCutover) {
        setMustSucceedForCutover(mustSucceedForCutover);
        return this;
    }

    /**
     * <p>
     * Source server post migration custom action must succeed for cutover.
     * </p>
     * 
     * @return Source server post migration custom action must succeed for cutover.
     */

    public Boolean isMustSucceedForCutover() {
        return this.mustSucceedForCutover;
    }

    /**
     * <p>
     * Source server post migration custom action order.
     * </p>
     * 
     * @param order
     *        Source server post migration custom action order.
     */

    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * <p>
     * Source server post migration custom action order.
     * </p>
     * 
     * @return Source server post migration custom action order.
     */

    public Integer getOrder() {
        return this.order;
    }

    /**
     * <p>
     * Source server post migration custom action order.
     * </p>
     * 
     * @param order
     *        Source server post migration custom action order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSourceServerActionRequest withOrder(Integer order) {
        setOrder(order);
        return this;
    }

    /**
     * <p>
     * Source server post migration custom action parameters.
     * </p>
     * 
     * @return Source server post migration custom action parameters.
     */

    public java.util.Map<String, java.util.List<SsmParameterStoreParameter>> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * Source server post migration custom action parameters.
     * </p>
     * 
     * @param parameters
     *        Source server post migration custom action parameters.
     */

    public void setParameters(java.util.Map<String, java.util.List<SsmParameterStoreParameter>> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * Source server post migration custom action parameters.
     * </p>
     * 
     * @param parameters
     *        Source server post migration custom action parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSourceServerActionRequest withParameters(java.util.Map<String, java.util.List<SsmParameterStoreParameter>> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see PutSourceServerActionRequest#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PutSourceServerActionRequest addParametersEntry(String key, java.util.List<SsmParameterStoreParameter> value) {
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

    public PutSourceServerActionRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * Source server ID.
     * </p>
     * 
     * @param sourceServerID
     *        Source server ID.
     */

    public void setSourceServerID(String sourceServerID) {
        this.sourceServerID = sourceServerID;
    }

    /**
     * <p>
     * Source server ID.
     * </p>
     * 
     * @return Source server ID.
     */

    public String getSourceServerID() {
        return this.sourceServerID;
    }

    /**
     * <p>
     * Source server ID.
     * </p>
     * 
     * @param sourceServerID
     *        Source server ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSourceServerActionRequest withSourceServerID(String sourceServerID) {
        setSourceServerID(sourceServerID);
        return this;
    }

    /**
     * <p>
     * Source server post migration custom action timeout in seconds.
     * </p>
     * 
     * @param timeoutSeconds
     *        Source server post migration custom action timeout in seconds.
     */

    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * <p>
     * Source server post migration custom action timeout in seconds.
     * </p>
     * 
     * @return Source server post migration custom action timeout in seconds.
     */

    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    /**
     * <p>
     * Source server post migration custom action timeout in seconds.
     * </p>
     * 
     * @param timeoutSeconds
     *        Source server post migration custom action timeout in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSourceServerActionRequest withTimeoutSeconds(Integer timeoutSeconds) {
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
        if (getActionID() != null)
            sb.append("ActionID: ").append(getActionID()).append(",");
        if (getActionName() != null)
            sb.append("ActionName: ").append(getActionName()).append(",");
        if (getActive() != null)
            sb.append("Active: ").append(getActive()).append(",");
        if (getDocumentIdentifier() != null)
            sb.append("DocumentIdentifier: ").append(getDocumentIdentifier()).append(",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: ").append(getDocumentVersion()).append(",");
        if (getMustSucceedForCutover() != null)
            sb.append("MustSucceedForCutover: ").append(getMustSucceedForCutover()).append(",");
        if (getOrder() != null)
            sb.append("Order: ").append(getOrder()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getSourceServerID() != null)
            sb.append("SourceServerID: ").append(getSourceServerID()).append(",");
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

        if (obj instanceof PutSourceServerActionRequest == false)
            return false;
        PutSourceServerActionRequest other = (PutSourceServerActionRequest) obj;
        if (other.getActionID() == null ^ this.getActionID() == null)
            return false;
        if (other.getActionID() != null && other.getActionID().equals(this.getActionID()) == false)
            return false;
        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getActive() == null ^ this.getActive() == null)
            return false;
        if (other.getActive() != null && other.getActive().equals(this.getActive()) == false)
            return false;
        if (other.getDocumentIdentifier() == null ^ this.getDocumentIdentifier() == null)
            return false;
        if (other.getDocumentIdentifier() != null && other.getDocumentIdentifier().equals(this.getDocumentIdentifier()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        if (other.getMustSucceedForCutover() == null ^ this.getMustSucceedForCutover() == null)
            return false;
        if (other.getMustSucceedForCutover() != null && other.getMustSucceedForCutover().equals(this.getMustSucceedForCutover()) == false)
            return false;
        if (other.getOrder() == null ^ this.getOrder() == null)
            return false;
        if (other.getOrder() != null && other.getOrder().equals(this.getOrder()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getSourceServerID() == null ^ this.getSourceServerID() == null)
            return false;
        if (other.getSourceServerID() != null && other.getSourceServerID().equals(this.getSourceServerID()) == false)
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

        hashCode = prime * hashCode + ((getActionID() == null) ? 0 : getActionID().hashCode());
        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getActive() == null) ? 0 : getActive().hashCode());
        hashCode = prime * hashCode + ((getDocumentIdentifier() == null) ? 0 : getDocumentIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        hashCode = prime * hashCode + ((getMustSucceedForCutover() == null) ? 0 : getMustSucceedForCutover().hashCode());
        hashCode = prime * hashCode + ((getOrder() == null) ? 0 : getOrder().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getSourceServerID() == null) ? 0 : getSourceServerID().hashCode());
        hashCode = prime * hashCode + ((getTimeoutSeconds() == null) ? 0 : getTimeoutSeconds().hashCode());
        return hashCode;
    }

    @Override
    public PutSourceServerActionRequest clone() {
        return (PutSourceServerActionRequest) super.clone();
    }

}
