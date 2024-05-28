/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The recommended actions to apply to resolve the issues associated with your DB instances, DB clusters, and DB
 * parameter groups.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RecommendedAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendedAction implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the recommended action.
     * </p>
     */
    private String actionId;
    /**
     * <p>
     * A short description to summarize the action. The description might contain markdown.
     * </p>
     */
    private String title;
    /**
     * <p>
     * A detailed description of the action. The description might contain markdown.
     * </p>
     */
    private String description;
    /**
     * <p>
     * An API operation for the action.
     * </p>
     */
    private String operation;
    /**
     * <p>
     * The parameters for the API operation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RecommendedActionParameter> parameters;
    /**
     * <p>
     * The methods to apply the recommended action.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>manual</code> - The action requires you to resolve the recommendation manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>immediately</code> - The action is applied immediately.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>next-maintainance-window</code> - The action is applied during the next scheduled maintainance.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> applyModes;
    /**
     * <p>
     * The status of the action.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ready</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>applied</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scheduled</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resolved</code>
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The details of the issue.
     * </p>
     */
    private IssueDetails issueDetails;
    /**
     * <p>
     * The supporting attributes to explain the recommended action.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ContextAttribute> contextAttributes;

    /**
     * <p>
     * The unique identifier of the recommended action.
     * </p>
     * 
     * @param actionId
     *        The unique identifier of the recommended action.
     */

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    /**
     * <p>
     * The unique identifier of the recommended action.
     * </p>
     * 
     * @return The unique identifier of the recommended action.
     */

    public String getActionId() {
        return this.actionId;
    }

    /**
     * <p>
     * The unique identifier of the recommended action.
     * </p>
     * 
     * @param actionId
     *        The unique identifier of the recommended action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendedAction withActionId(String actionId) {
        setActionId(actionId);
        return this;
    }

    /**
     * <p>
     * A short description to summarize the action. The description might contain markdown.
     * </p>
     * 
     * @param title
     *        A short description to summarize the action. The description might contain markdown.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * A short description to summarize the action. The description might contain markdown.
     * </p>
     * 
     * @return A short description to summarize the action. The description might contain markdown.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * A short description to summarize the action. The description might contain markdown.
     * </p>
     * 
     * @param title
     *        A short description to summarize the action. The description might contain markdown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendedAction withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * A detailed description of the action. The description might contain markdown.
     * </p>
     * 
     * @param description
     *        A detailed description of the action. The description might contain markdown.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A detailed description of the action. The description might contain markdown.
     * </p>
     * 
     * @return A detailed description of the action. The description might contain markdown.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A detailed description of the action. The description might contain markdown.
     * </p>
     * 
     * @param description
     *        A detailed description of the action. The description might contain markdown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendedAction withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * An API operation for the action.
     * </p>
     * 
     * @param operation
     *        An API operation for the action.
     */

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * An API operation for the action.
     * </p>
     * 
     * @return An API operation for the action.
     */

    public String getOperation() {
        return this.operation;
    }

    /**
     * <p>
     * An API operation for the action.
     * </p>
     * 
     * @param operation
     *        An API operation for the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendedAction withOperation(String operation) {
        setOperation(operation);
        return this;
    }

    /**
     * <p>
     * The parameters for the API operation.
     * </p>
     * 
     * @return The parameters for the API operation.
     */

    public java.util.List<RecommendedActionParameter> getParameters() {
        if (parameters == null) {
            parameters = new com.amazonaws.internal.SdkInternalList<RecommendedActionParameter>();
        }
        return parameters;
    }

    /**
     * <p>
     * The parameters for the API operation.
     * </p>
     * 
     * @param parameters
     *        The parameters for the API operation.
     */

    public void setParameters(java.util.Collection<RecommendedActionParameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new com.amazonaws.internal.SdkInternalList<RecommendedActionParameter>(parameters);
    }

    /**
     * <p>
     * The parameters for the API operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        The parameters for the API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendedAction withParameters(RecommendedActionParameter... parameters) {
        if (this.parameters == null) {
            setParameters(new com.amazonaws.internal.SdkInternalList<RecommendedActionParameter>(parameters.length));
        }
        for (RecommendedActionParameter ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The parameters for the API operation.
     * </p>
     * 
     * @param parameters
     *        The parameters for the API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendedAction withParameters(java.util.Collection<RecommendedActionParameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * The methods to apply the recommended action.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>manual</code> - The action requires you to resolve the recommendation manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>immediately</code> - The action is applied immediately.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>next-maintainance-window</code> - The action is applied during the next scheduled maintainance.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The methods to apply the recommended action.</p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>manual</code> - The action requires you to resolve the recommendation manually.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>immediately</code> - The action is applied immediately.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>next-maintainance-window</code> - The action is applied during the next scheduled maintainance.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getApplyModes() {
        if (applyModes == null) {
            applyModes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return applyModes;
    }

    /**
     * <p>
     * The methods to apply the recommended action.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>manual</code> - The action requires you to resolve the recommendation manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>immediately</code> - The action is applied immediately.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>next-maintainance-window</code> - The action is applied during the next scheduled maintainance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param applyModes
     *        The methods to apply the recommended action.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>manual</code> - The action requires you to resolve the recommendation manually.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>immediately</code> - The action is applied immediately.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>next-maintainance-window</code> - The action is applied during the next scheduled maintainance.
     *        </p>
     *        </li>
     */

    public void setApplyModes(java.util.Collection<String> applyModes) {
        if (applyModes == null) {
            this.applyModes = null;
            return;
        }

        this.applyModes = new com.amazonaws.internal.SdkInternalList<String>(applyModes);
    }

    /**
     * <p>
     * The methods to apply the recommended action.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>manual</code> - The action requires you to resolve the recommendation manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>immediately</code> - The action is applied immediately.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>next-maintainance-window</code> - The action is applied during the next scheduled maintainance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplyModes(java.util.Collection)} or {@link #withApplyModes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param applyModes
     *        The methods to apply the recommended action.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>manual</code> - The action requires you to resolve the recommendation manually.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>immediately</code> - The action is applied immediately.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>next-maintainance-window</code> - The action is applied during the next scheduled maintainance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendedAction withApplyModes(String... applyModes) {
        if (this.applyModes == null) {
            setApplyModes(new com.amazonaws.internal.SdkInternalList<String>(applyModes.length));
        }
        for (String ele : applyModes) {
            this.applyModes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The methods to apply the recommended action.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>manual</code> - The action requires you to resolve the recommendation manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>immediately</code> - The action is applied immediately.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>next-maintainance-window</code> - The action is applied during the next scheduled maintainance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param applyModes
     *        The methods to apply the recommended action.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>manual</code> - The action requires you to resolve the recommendation manually.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>immediately</code> - The action is applied immediately.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>next-maintainance-window</code> - The action is applied during the next scheduled maintainance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendedAction withApplyModes(java.util.Collection<String> applyModes) {
        setApplyModes(applyModes);
        return this;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ready</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>applied</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scheduled</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resolved</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the action.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ready</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>applied</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>scheduled</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resolved</code>
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ready</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>applied</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scheduled</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resolved</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the action.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ready</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>applied</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>scheduled</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>resolved</code>
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ready</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>applied</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>scheduled</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resolved</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the action.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ready</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>applied</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>scheduled</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resolved</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendedAction withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The details of the issue.
     * </p>
     * 
     * @param issueDetails
     *        The details of the issue.
     */

    public void setIssueDetails(IssueDetails issueDetails) {
        this.issueDetails = issueDetails;
    }

    /**
     * <p>
     * The details of the issue.
     * </p>
     * 
     * @return The details of the issue.
     */

    public IssueDetails getIssueDetails() {
        return this.issueDetails;
    }

    /**
     * <p>
     * The details of the issue.
     * </p>
     * 
     * @param issueDetails
     *        The details of the issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendedAction withIssueDetails(IssueDetails issueDetails) {
        setIssueDetails(issueDetails);
        return this;
    }

    /**
     * <p>
     * The supporting attributes to explain the recommended action.
     * </p>
     * 
     * @return The supporting attributes to explain the recommended action.
     */

    public java.util.List<ContextAttribute> getContextAttributes() {
        if (contextAttributes == null) {
            contextAttributes = new com.amazonaws.internal.SdkInternalList<ContextAttribute>();
        }
        return contextAttributes;
    }

    /**
     * <p>
     * The supporting attributes to explain the recommended action.
     * </p>
     * 
     * @param contextAttributes
     *        The supporting attributes to explain the recommended action.
     */

    public void setContextAttributes(java.util.Collection<ContextAttribute> contextAttributes) {
        if (contextAttributes == null) {
            this.contextAttributes = null;
            return;
        }

        this.contextAttributes = new com.amazonaws.internal.SdkInternalList<ContextAttribute>(contextAttributes);
    }

    /**
     * <p>
     * The supporting attributes to explain the recommended action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContextAttributes(java.util.Collection)} or {@link #withContextAttributes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param contextAttributes
     *        The supporting attributes to explain the recommended action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendedAction withContextAttributes(ContextAttribute... contextAttributes) {
        if (this.contextAttributes == null) {
            setContextAttributes(new com.amazonaws.internal.SdkInternalList<ContextAttribute>(contextAttributes.length));
        }
        for (ContextAttribute ele : contextAttributes) {
            this.contextAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The supporting attributes to explain the recommended action.
     * </p>
     * 
     * @param contextAttributes
     *        The supporting attributes to explain the recommended action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendedAction withContextAttributes(java.util.Collection<ContextAttribute> contextAttributes) {
        setContextAttributes(contextAttributes);
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
        if (getActionId() != null)
            sb.append("ActionId: ").append(getActionId()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getApplyModes() != null)
            sb.append("ApplyModes: ").append(getApplyModes()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getIssueDetails() != null)
            sb.append("IssueDetails: ").append(getIssueDetails()).append(",");
        if (getContextAttributes() != null)
            sb.append("ContextAttributes: ").append(getContextAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendedAction == false)
            return false;
        RecommendedAction other = (RecommendedAction) obj;
        if (other.getActionId() == null ^ this.getActionId() == null)
            return false;
        if (other.getActionId() != null && other.getActionId().equals(this.getActionId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getApplyModes() == null ^ this.getApplyModes() == null)
            return false;
        if (other.getApplyModes() != null && other.getApplyModes().equals(this.getApplyModes()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getIssueDetails() == null ^ this.getIssueDetails() == null)
            return false;
        if (other.getIssueDetails() != null && other.getIssueDetails().equals(this.getIssueDetails()) == false)
            return false;
        if (other.getContextAttributes() == null ^ this.getContextAttributes() == null)
            return false;
        if (other.getContextAttributes() != null && other.getContextAttributes().equals(this.getContextAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionId() == null) ? 0 : getActionId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getApplyModes() == null) ? 0 : getApplyModes().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getIssueDetails() == null) ? 0 : getIssueDetails().hashCode());
        hashCode = prime * hashCode + ((getContextAttributes() == null) ? 0 : getContextAttributes().hashCode());
        return hashCode;
    }

    @Override
    public RecommendedAction clone() {
        try {
            return (RecommendedAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
