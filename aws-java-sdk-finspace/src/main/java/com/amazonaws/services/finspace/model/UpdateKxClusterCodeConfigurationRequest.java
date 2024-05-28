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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateKxClusterCodeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateKxClusterCodeConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier of the kdb environment.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The name of the cluster.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     */
    private String clientToken;

    private CodeConfiguration code;
    /**
     * <p>
     * Specifies a Q program that will be run at launch of a cluster. It is a relative path within <i>.zip</i> file that
     * contains the custom code, which will be loaded on the cluster. It must include the file name itself. For example,
     * <code>somedir/init.q</code>.
     * </p>
     * <p>
     * You cannot update this parameter for a <code>NO_RESTART</code> deployment.
     * </p>
     */
    private String initializationScript;
    /**
     * <p>
     * Specifies the key-value pairs to make them available inside the cluster.
     * </p>
     * <p>
     * You cannot update this parameter for a <code>NO_RESTART</code> deployment.
     * </p>
     */
    private java.util.List<KxCommandLineArgument> commandLineArguments;
    /**
     * <p>
     * The configuration that allows you to choose how you want to update the code on a cluster.
     * </p>
     */
    private KxClusterCodeDeploymentConfiguration deploymentConfiguration;

    /**
     * <p>
     * A unique identifier of the kdb environment.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier of the kdb environment.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * A unique identifier of the kdb environment.
     * </p>
     * 
     * @return A unique identifier of the kdb environment.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * A unique identifier of the kdb environment.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier of the kdb environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxClusterCodeConfigurationRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @return The name of the cluster.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxClusterCodeConfigurationRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures idempotency. This token expires in 10 minutes.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @return A token that ensures idempotency. This token expires in 10 minutes.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures idempotency. This token expires in 10 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxClusterCodeConfigurationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * @param code
     */

    public void setCode(CodeConfiguration code) {
        this.code = code;
    }

    /**
     * @return
     */

    public CodeConfiguration getCode() {
        return this.code;
    }

    /**
     * @param code
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxClusterCodeConfigurationRequest withCode(CodeConfiguration code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * Specifies a Q program that will be run at launch of a cluster. It is a relative path within <i>.zip</i> file that
     * contains the custom code, which will be loaded on the cluster. It must include the file name itself. For example,
     * <code>somedir/init.q</code>.
     * </p>
     * <p>
     * You cannot update this parameter for a <code>NO_RESTART</code> deployment.
     * </p>
     * 
     * @param initializationScript
     *        Specifies a Q program that will be run at launch of a cluster. It is a relative path within <i>.zip</i>
     *        file that contains the custom code, which will be loaded on the cluster. It must include the file name
     *        itself. For example, <code>somedir/init.q</code>.</p>
     *        <p>
     *        You cannot update this parameter for a <code>NO_RESTART</code> deployment.
     */

    public void setInitializationScript(String initializationScript) {
        this.initializationScript = initializationScript;
    }

    /**
     * <p>
     * Specifies a Q program that will be run at launch of a cluster. It is a relative path within <i>.zip</i> file that
     * contains the custom code, which will be loaded on the cluster. It must include the file name itself. For example,
     * <code>somedir/init.q</code>.
     * </p>
     * <p>
     * You cannot update this parameter for a <code>NO_RESTART</code> deployment.
     * </p>
     * 
     * @return Specifies a Q program that will be run at launch of a cluster. It is a relative path within <i>.zip</i>
     *         file that contains the custom code, which will be loaded on the cluster. It must include the file name
     *         itself. For example, <code>somedir/init.q</code>.</p>
     *         <p>
     *         You cannot update this parameter for a <code>NO_RESTART</code> deployment.
     */

    public String getInitializationScript() {
        return this.initializationScript;
    }

    /**
     * <p>
     * Specifies a Q program that will be run at launch of a cluster. It is a relative path within <i>.zip</i> file that
     * contains the custom code, which will be loaded on the cluster. It must include the file name itself. For example,
     * <code>somedir/init.q</code>.
     * </p>
     * <p>
     * You cannot update this parameter for a <code>NO_RESTART</code> deployment.
     * </p>
     * 
     * @param initializationScript
     *        Specifies a Q program that will be run at launch of a cluster. It is a relative path within <i>.zip</i>
     *        file that contains the custom code, which will be loaded on the cluster. It must include the file name
     *        itself. For example, <code>somedir/init.q</code>.</p>
     *        <p>
     *        You cannot update this parameter for a <code>NO_RESTART</code> deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxClusterCodeConfigurationRequest withInitializationScript(String initializationScript) {
        setInitializationScript(initializationScript);
        return this;
    }

    /**
     * <p>
     * Specifies the key-value pairs to make them available inside the cluster.
     * </p>
     * <p>
     * You cannot update this parameter for a <code>NO_RESTART</code> deployment.
     * </p>
     * 
     * @return Specifies the key-value pairs to make them available inside the cluster.</p>
     *         <p>
     *         You cannot update this parameter for a <code>NO_RESTART</code> deployment.
     */

    public java.util.List<KxCommandLineArgument> getCommandLineArguments() {
        return commandLineArguments;
    }

    /**
     * <p>
     * Specifies the key-value pairs to make them available inside the cluster.
     * </p>
     * <p>
     * You cannot update this parameter for a <code>NO_RESTART</code> deployment.
     * </p>
     * 
     * @param commandLineArguments
     *        Specifies the key-value pairs to make them available inside the cluster.</p>
     *        <p>
     *        You cannot update this parameter for a <code>NO_RESTART</code> deployment.
     */

    public void setCommandLineArguments(java.util.Collection<KxCommandLineArgument> commandLineArguments) {
        if (commandLineArguments == null) {
            this.commandLineArguments = null;
            return;
        }

        this.commandLineArguments = new java.util.ArrayList<KxCommandLineArgument>(commandLineArguments);
    }

    /**
     * <p>
     * Specifies the key-value pairs to make them available inside the cluster.
     * </p>
     * <p>
     * You cannot update this parameter for a <code>NO_RESTART</code> deployment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommandLineArguments(java.util.Collection)} or {@link #withCommandLineArguments(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param commandLineArguments
     *        Specifies the key-value pairs to make them available inside the cluster.</p>
     *        <p>
     *        You cannot update this parameter for a <code>NO_RESTART</code> deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxClusterCodeConfigurationRequest withCommandLineArguments(KxCommandLineArgument... commandLineArguments) {
        if (this.commandLineArguments == null) {
            setCommandLineArguments(new java.util.ArrayList<KxCommandLineArgument>(commandLineArguments.length));
        }
        for (KxCommandLineArgument ele : commandLineArguments) {
            this.commandLineArguments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the key-value pairs to make them available inside the cluster.
     * </p>
     * <p>
     * You cannot update this parameter for a <code>NO_RESTART</code> deployment.
     * </p>
     * 
     * @param commandLineArguments
     *        Specifies the key-value pairs to make them available inside the cluster.</p>
     *        <p>
     *        You cannot update this parameter for a <code>NO_RESTART</code> deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxClusterCodeConfigurationRequest withCommandLineArguments(java.util.Collection<KxCommandLineArgument> commandLineArguments) {
        setCommandLineArguments(commandLineArguments);
        return this;
    }

    /**
     * <p>
     * The configuration that allows you to choose how you want to update the code on a cluster.
     * </p>
     * 
     * @param deploymentConfiguration
     *        The configuration that allows you to choose how you want to update the code on a cluster.
     */

    public void setDeploymentConfiguration(KxClusterCodeDeploymentConfiguration deploymentConfiguration) {
        this.deploymentConfiguration = deploymentConfiguration;
    }

    /**
     * <p>
     * The configuration that allows you to choose how you want to update the code on a cluster.
     * </p>
     * 
     * @return The configuration that allows you to choose how you want to update the code on a cluster.
     */

    public KxClusterCodeDeploymentConfiguration getDeploymentConfiguration() {
        return this.deploymentConfiguration;
    }

    /**
     * <p>
     * The configuration that allows you to choose how you want to update the code on a cluster.
     * </p>
     * 
     * @param deploymentConfiguration
     *        The configuration that allows you to choose how you want to update the code on a cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxClusterCodeConfigurationRequest withDeploymentConfiguration(KxClusterCodeDeploymentConfiguration deploymentConfiguration) {
        setDeploymentConfiguration(deploymentConfiguration);
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
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getInitializationScript() != null)
            sb.append("InitializationScript: ").append(getInitializationScript()).append(",");
        if (getCommandLineArguments() != null)
            sb.append("CommandLineArguments: ").append(getCommandLineArguments()).append(",");
        if (getDeploymentConfiguration() != null)
            sb.append("DeploymentConfiguration: ").append(getDeploymentConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateKxClusterCodeConfigurationRequest == false)
            return false;
        UpdateKxClusterCodeConfigurationRequest other = (UpdateKxClusterCodeConfigurationRequest) obj;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getInitializationScript() == null ^ this.getInitializationScript() == null)
            return false;
        if (other.getInitializationScript() != null && other.getInitializationScript().equals(this.getInitializationScript()) == false)
            return false;
        if (other.getCommandLineArguments() == null ^ this.getCommandLineArguments() == null)
            return false;
        if (other.getCommandLineArguments() != null && other.getCommandLineArguments().equals(this.getCommandLineArguments()) == false)
            return false;
        if (other.getDeploymentConfiguration() == null ^ this.getDeploymentConfiguration() == null)
            return false;
        if (other.getDeploymentConfiguration() != null && other.getDeploymentConfiguration().equals(this.getDeploymentConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getInitializationScript() == null) ? 0 : getInitializationScript().hashCode());
        hashCode = prime * hashCode + ((getCommandLineArguments() == null) ? 0 : getCommandLineArguments().hashCode());
        hashCode = prime * hashCode + ((getDeploymentConfiguration() == null) ? 0 : getDeploymentConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateKxClusterCodeConfigurationRequest clone() {
        return (UpdateKxClusterCodeConfigurationRequest) super.clone();
    }

}
