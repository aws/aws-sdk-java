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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a ListDeploymentGroups operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListDeploymentGroups" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDeploymentGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The application name.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * A list of deployment group names.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> deploymentGroups;
    /**
     * <p>
     * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list
     * deployment groups call to return the next set of deployment groups in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The application name.
     * </p>
     * 
     * @param applicationName
     *        The application name.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The application name.
     * </p>
     * 
     * @return The application name.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The application name.
     * </p>
     * 
     * @param applicationName
     *        The application name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentGroupsResult withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * A list of deployment group names.
     * </p>
     * 
     * @return A list of deployment group names.
     */

    public java.util.List<String> getDeploymentGroups() {
        if (deploymentGroups == null) {
            deploymentGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return deploymentGroups;
    }

    /**
     * <p>
     * A list of deployment group names.
     * </p>
     * 
     * @param deploymentGroups
     *        A list of deployment group names.
     */

    public void setDeploymentGroups(java.util.Collection<String> deploymentGroups) {
        if (deploymentGroups == null) {
            this.deploymentGroups = null;
            return;
        }

        this.deploymentGroups = new com.amazonaws.internal.SdkInternalList<String>(deploymentGroups);
    }

    /**
     * <p>
     * A list of deployment group names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeploymentGroups(java.util.Collection)} or {@link #withDeploymentGroups(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param deploymentGroups
     *        A list of deployment group names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentGroupsResult withDeploymentGroups(String... deploymentGroups) {
        if (this.deploymentGroups == null) {
            setDeploymentGroups(new com.amazonaws.internal.SdkInternalList<String>(deploymentGroups.length));
        }
        for (String ele : deploymentGroups) {
            this.deploymentGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of deployment group names.
     * </p>
     * 
     * @param deploymentGroups
     *        A list of deployment group names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentGroupsResult withDeploymentGroups(java.util.Collection<String> deploymentGroups) {
        setDeploymentGroups(deploymentGroups);
        return this;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list
     * deployment groups call to return the next set of deployment groups in the list.
     * </p>
     * 
     * @param nextToken
     *        If a large amount of information is returned, an identifier is also returned. It can be used in a
     *        subsequent list deployment groups call to return the next set of deployment groups in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list
     * deployment groups call to return the next set of deployment groups in the list.
     * </p>
     * 
     * @return If a large amount of information is returned, an identifier is also returned. It can be used in a
     *         subsequent list deployment groups call to return the next set of deployment groups in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list
     * deployment groups call to return the next set of deployment groups in the list.
     * </p>
     * 
     * @param nextToken
     *        If a large amount of information is returned, an identifier is also returned. It can be used in a
     *        subsequent list deployment groups call to return the next set of deployment groups in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentGroupsResult withNextToken(String nextToken) {
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getDeploymentGroups() != null)
            sb.append("DeploymentGroups: ").append(getDeploymentGroups()).append(",");
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

        if (obj instanceof ListDeploymentGroupsResult == false)
            return false;
        ListDeploymentGroupsResult other = (ListDeploymentGroupsResult) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getDeploymentGroups() == null ^ this.getDeploymentGroups() == null)
            return false;
        if (other.getDeploymentGroups() != null && other.getDeploymentGroups().equals(this.getDeploymentGroups()) == false)
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

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getDeploymentGroups() == null) ? 0 : getDeploymentGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDeploymentGroupsResult clone() {
        try {
            return (ListDeploymentGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
