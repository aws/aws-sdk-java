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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListAWSServiceAccessForOrganization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAWSServiceAccessForOrganizationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of the service principals for the services that are enabled to integrate with your organization. Each
     * principal is a structure that includes the name and the date that it was enabled for integration with AWS
     * Organizations.
     * </p>
     */
    private java.util.List<EnabledServicePrincipal> enabledServicePrincipals;
    /**
     * <p>
     * If present, this value indicates that there is more output available than is included in the current response.
     * Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     * next part of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the service principals for the services that are enabled to integrate with your organization. Each
     * principal is a structure that includes the name and the date that it was enabled for integration with AWS
     * Organizations.
     * </p>
     * 
     * @return A list of the service principals for the services that are enabled to integrate with your organization.
     *         Each principal is a structure that includes the name and the date that it was enabled for integration
     *         with AWS Organizations.
     */

    public java.util.List<EnabledServicePrincipal> getEnabledServicePrincipals() {
        return enabledServicePrincipals;
    }

    /**
     * <p>
     * A list of the service principals for the services that are enabled to integrate with your organization. Each
     * principal is a structure that includes the name and the date that it was enabled for integration with AWS
     * Organizations.
     * </p>
     * 
     * @param enabledServicePrincipals
     *        A list of the service principals for the services that are enabled to integrate with your organization.
     *        Each principal is a structure that includes the name and the date that it was enabled for integration with
     *        AWS Organizations.
     */

    public void setEnabledServicePrincipals(java.util.Collection<EnabledServicePrincipal> enabledServicePrincipals) {
        if (enabledServicePrincipals == null) {
            this.enabledServicePrincipals = null;
            return;
        }

        this.enabledServicePrincipals = new java.util.ArrayList<EnabledServicePrincipal>(enabledServicePrincipals);
    }

    /**
     * <p>
     * A list of the service principals for the services that are enabled to integrate with your organization. Each
     * principal is a structure that includes the name and the date that it was enabled for integration with AWS
     * Organizations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnabledServicePrincipals(java.util.Collection)} or
     * {@link #withEnabledServicePrincipals(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param enabledServicePrincipals
     *        A list of the service principals for the services that are enabled to integrate with your organization.
     *        Each principal is a structure that includes the name and the date that it was enabled for integration with
     *        AWS Organizations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAWSServiceAccessForOrganizationResult withEnabledServicePrincipals(EnabledServicePrincipal... enabledServicePrincipals) {
        if (this.enabledServicePrincipals == null) {
            setEnabledServicePrincipals(new java.util.ArrayList<EnabledServicePrincipal>(enabledServicePrincipals.length));
        }
        for (EnabledServicePrincipal ele : enabledServicePrincipals) {
            this.enabledServicePrincipals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the service principals for the services that are enabled to integrate with your organization. Each
     * principal is a structure that includes the name and the date that it was enabled for integration with AWS
     * Organizations.
     * </p>
     * 
     * @param enabledServicePrincipals
     *        A list of the service principals for the services that are enabled to integrate with your organization.
     *        Each principal is a structure that includes the name and the date that it was enabled for integration with
     *        AWS Organizations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAWSServiceAccessForOrganizationResult withEnabledServicePrincipals(java.util.Collection<EnabledServicePrincipal> enabledServicePrincipals) {
        setEnabledServicePrincipals(enabledServicePrincipals);
        return this;
    }

    /**
     * <p>
     * If present, this value indicates that there is more output available than is included in the current response.
     * Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     * next part of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If present, this value indicates that there is more output available than is included in the current
     *        response. Use this value in the <code>NextToken</code> request parameter in a subsequent call to the
     *        operation to get the next part of the output. You should repeat this until the <code>NextToken</code>
     *        response element comes back as <code>null</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If present, this value indicates that there is more output available than is included in the current response.
     * Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     * next part of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>.
     * </p>
     * 
     * @return If present, this value indicates that there is more output available than is included in the current
     *         response. Use this value in the <code>NextToken</code> request parameter in a subsequent call to the
     *         operation to get the next part of the output. You should repeat this until the <code>NextToken</code>
     *         response element comes back as <code>null</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If present, this value indicates that there is more output available than is included in the current response.
     * Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     * next part of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If present, this value indicates that there is more output available than is included in the current
     *        response. Use this value in the <code>NextToken</code> request parameter in a subsequent call to the
     *        operation to get the next part of the output. You should repeat this until the <code>NextToken</code>
     *        response element comes back as <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAWSServiceAccessForOrganizationResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getEnabledServicePrincipals() != null)
            sb.append("EnabledServicePrincipals: ").append(getEnabledServicePrincipals()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAWSServiceAccessForOrganizationResult == false)
            return false;
        ListAWSServiceAccessForOrganizationResult other = (ListAWSServiceAccessForOrganizationResult) obj;
        if (other.getEnabledServicePrincipals() == null ^ this.getEnabledServicePrincipals() == null)
            return false;
        if (other.getEnabledServicePrincipals() != null && other.getEnabledServicePrincipals().equals(this.getEnabledServicePrincipals()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabledServicePrincipals() == null) ? 0 : getEnabledServicePrincipals().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAWSServiceAccessForOrganizationResult clone() {
        try {
            return (ListAWSServiceAccessForOrganizationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
