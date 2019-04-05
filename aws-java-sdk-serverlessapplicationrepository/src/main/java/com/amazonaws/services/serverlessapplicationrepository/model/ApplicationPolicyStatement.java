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
package com.amazonaws.services.serverlessapplicationrepository.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Policy statement applied to the application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/serverlessrepo-2017-09-08/ApplicationPolicyStatement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationPolicyStatement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * For the list of actions supported for this operation, see <a href=
     * "https://docs.aws.amazon.com/serverlessrepo/latest/devguide/access-control-resource-based.html#application-permissions"
     * >Application Permissions</a>.
     * </p>
     */
    private java.util.List<String> actions;
    /**
     * <p>
     * An array of AWS account IDs, or * to make the application public.
     * </p>
     */
    private java.util.List<String> principals;
    /**
     * <p>
     * A unique ID for the statement.
     * </p>
     */
    private String statementId;

    /**
     * <p>
     * For the list of actions supported for this operation, see <a href=
     * "https://docs.aws.amazon.com/serverlessrepo/latest/devguide/access-control-resource-based.html#application-permissions"
     * >Application Permissions</a>.
     * </p>
     * 
     * @return For the list of actions supported for this operation, see <a href=
     *         "https://docs.aws.amazon.com/serverlessrepo/latest/devguide/access-control-resource-based.html#application-permissions"
     *         >Application Permissions</a>.
     */

    public java.util.List<String> getActions() {
        return actions;
    }

    /**
     * <p>
     * For the list of actions supported for this operation, see <a href=
     * "https://docs.aws.amazon.com/serverlessrepo/latest/devguide/access-control-resource-based.html#application-permissions"
     * >Application Permissions</a>.
     * </p>
     * 
     * @param actions
     *        For the list of actions supported for this operation, see <a href=
     *        "https://docs.aws.amazon.com/serverlessrepo/latest/devguide/access-control-resource-based.html#application-permissions"
     *        >Application Permissions</a>.
     */

    public void setActions(java.util.Collection<String> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<String>(actions);
    }

    /**
     * <p>
     * For the list of actions supported for this operation, see <a href=
     * "https://docs.aws.amazon.com/serverlessrepo/latest/devguide/access-control-resource-based.html#application-permissions"
     * >Application Permissions</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        For the list of actions supported for this operation, see <a href=
     *        "https://docs.aws.amazon.com/serverlessrepo/latest/devguide/access-control-resource-based.html#application-permissions"
     *        >Application Permissions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationPolicyStatement withActions(String... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<String>(actions.length));
        }
        for (String ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For the list of actions supported for this operation, see <a href=
     * "https://docs.aws.amazon.com/serverlessrepo/latest/devguide/access-control-resource-based.html#application-permissions"
     * >Application Permissions</a>.
     * </p>
     * 
     * @param actions
     *        For the list of actions supported for this operation, see <a href=
     *        "https://docs.aws.amazon.com/serverlessrepo/latest/devguide/access-control-resource-based.html#application-permissions"
     *        >Application Permissions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationPolicyStatement withActions(java.util.Collection<String> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * An array of AWS account IDs, or * to make the application public.
     * </p>
     * 
     * @return An array of AWS account IDs, or * to make the application public.
     */

    public java.util.List<String> getPrincipals() {
        return principals;
    }

    /**
     * <p>
     * An array of AWS account IDs, or * to make the application public.
     * </p>
     * 
     * @param principals
     *        An array of AWS account IDs, or * to make the application public.
     */

    public void setPrincipals(java.util.Collection<String> principals) {
        if (principals == null) {
            this.principals = null;
            return;
        }

        this.principals = new java.util.ArrayList<String>(principals);
    }

    /**
     * <p>
     * An array of AWS account IDs, or * to make the application public.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrincipals(java.util.Collection)} or {@link #withPrincipals(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param principals
     *        An array of AWS account IDs, or * to make the application public.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationPolicyStatement withPrincipals(String... principals) {
        if (this.principals == null) {
            setPrincipals(new java.util.ArrayList<String>(principals.length));
        }
        for (String ele : principals) {
            this.principals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of AWS account IDs, or * to make the application public.
     * </p>
     * 
     * @param principals
     *        An array of AWS account IDs, or * to make the application public.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationPolicyStatement withPrincipals(java.util.Collection<String> principals) {
        setPrincipals(principals);
        return this;
    }

    /**
     * <p>
     * A unique ID for the statement.
     * </p>
     * 
     * @param statementId
     *        A unique ID for the statement.
     */

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    /**
     * <p>
     * A unique ID for the statement.
     * </p>
     * 
     * @return A unique ID for the statement.
     */

    public String getStatementId() {
        return this.statementId;
    }

    /**
     * <p>
     * A unique ID for the statement.
     * </p>
     * 
     * @param statementId
     *        A unique ID for the statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationPolicyStatement withStatementId(String statementId) {
        setStatementId(statementId);
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
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getPrincipals() != null)
            sb.append("Principals: ").append(getPrincipals()).append(",");
        if (getStatementId() != null)
            sb.append("StatementId: ").append(getStatementId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationPolicyStatement == false)
            return false;
        ApplicationPolicyStatement other = (ApplicationPolicyStatement) obj;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getPrincipals() == null ^ this.getPrincipals() == null)
            return false;
        if (other.getPrincipals() != null && other.getPrincipals().equals(this.getPrincipals()) == false)
            return false;
        if (other.getStatementId() == null ^ this.getStatementId() == null)
            return false;
        if (other.getStatementId() != null && other.getStatementId().equals(this.getStatementId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getPrincipals() == null) ? 0 : getPrincipals().hashCode());
        hashCode = prime * hashCode + ((getStatementId() == null) ? 0 : getStatementId().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationPolicyStatement clone() {
        try {
            return (ApplicationPolicyStatement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.serverlessapplicationrepository.model.transform.ApplicationPolicyStatementMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
