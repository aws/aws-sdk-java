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
 * Represents the output of a ListDeploymentConfigs operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/ListDeploymentConfigs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDeploymentConfigsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of deployment configurations, including built-in configurations such as CodeDeployDefault.OneAtATime.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> deploymentConfigsList;
    /**
     * <p>
     * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list
     * deployment configurations call to return the next set of deployment configurations in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of deployment configurations, including built-in configurations such as CodeDeployDefault.OneAtATime.
     * </p>
     * 
     * @return A list of deployment configurations, including built-in configurations such as
     *         CodeDeployDefault.OneAtATime.
     */

    public java.util.List<String> getDeploymentConfigsList() {
        if (deploymentConfigsList == null) {
            deploymentConfigsList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return deploymentConfigsList;
    }

    /**
     * <p>
     * A list of deployment configurations, including built-in configurations such as CodeDeployDefault.OneAtATime.
     * </p>
     * 
     * @param deploymentConfigsList
     *        A list of deployment configurations, including built-in configurations such as
     *        CodeDeployDefault.OneAtATime.
     */

    public void setDeploymentConfigsList(java.util.Collection<String> deploymentConfigsList) {
        if (deploymentConfigsList == null) {
            this.deploymentConfigsList = null;
            return;
        }

        this.deploymentConfigsList = new com.amazonaws.internal.SdkInternalList<String>(deploymentConfigsList);
    }

    /**
     * <p>
     * A list of deployment configurations, including built-in configurations such as CodeDeployDefault.OneAtATime.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeploymentConfigsList(java.util.Collection)} or
     * {@link #withDeploymentConfigsList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param deploymentConfigsList
     *        A list of deployment configurations, including built-in configurations such as
     *        CodeDeployDefault.OneAtATime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentConfigsResult withDeploymentConfigsList(String... deploymentConfigsList) {
        if (this.deploymentConfigsList == null) {
            setDeploymentConfigsList(new com.amazonaws.internal.SdkInternalList<String>(deploymentConfigsList.length));
        }
        for (String ele : deploymentConfigsList) {
            this.deploymentConfigsList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of deployment configurations, including built-in configurations such as CodeDeployDefault.OneAtATime.
     * </p>
     * 
     * @param deploymentConfigsList
     *        A list of deployment configurations, including built-in configurations such as
     *        CodeDeployDefault.OneAtATime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentConfigsResult withDeploymentConfigsList(java.util.Collection<String> deploymentConfigsList) {
        setDeploymentConfigsList(deploymentConfigsList);
        return this;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list
     * deployment configurations call to return the next set of deployment configurations in the list.
     * </p>
     * 
     * @param nextToken
     *        If a large amount of information is returned, an identifier is also returned. It can be used in a
     *        subsequent list deployment configurations call to return the next set of deployment configurations in the
     *        list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list
     * deployment configurations call to return the next set of deployment configurations in the list.
     * </p>
     * 
     * @return If a large amount of information is returned, an identifier is also returned. It can be used in a
     *         subsequent list deployment configurations call to return the next set of deployment configurations in the
     *         list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list
     * deployment configurations call to return the next set of deployment configurations in the list.
     * </p>
     * 
     * @param nextToken
     *        If a large amount of information is returned, an identifier is also returned. It can be used in a
     *        subsequent list deployment configurations call to return the next set of deployment configurations in the
     *        list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDeploymentConfigsResult withNextToken(String nextToken) {
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
        if (getDeploymentConfigsList() != null)
            sb.append("DeploymentConfigsList: ").append(getDeploymentConfigsList()).append(",");
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

        if (obj instanceof ListDeploymentConfigsResult == false)
            return false;
        ListDeploymentConfigsResult other = (ListDeploymentConfigsResult) obj;
        if (other.getDeploymentConfigsList() == null ^ this.getDeploymentConfigsList() == null)
            return false;
        if (other.getDeploymentConfigsList() != null && other.getDeploymentConfigsList().equals(this.getDeploymentConfigsList()) == false)
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

        hashCode = prime * hashCode + ((getDeploymentConfigsList() == null) ? 0 : getDeploymentConfigsList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDeploymentConfigsResult clone() {
        try {
            return (ListDeploymentConfigsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
