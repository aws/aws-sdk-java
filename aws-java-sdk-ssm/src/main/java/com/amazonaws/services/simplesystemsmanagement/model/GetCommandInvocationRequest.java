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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetCommandInvocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCommandInvocationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * (Required) The parent command ID of the invocation plugin.
     * </p>
     */
    private String commandId;
    /**
     * <p>
     * (Required) The ID of the managed instance targeted by the command. A managed instance can be an Amazon Elastic
     * Compute Cloud (Amazon EC2) instance or an instance in your hybrid environment that is configured for Amazon Web
     * Services Systems Manager.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The name of the plugin for which you want detailed results. If the document contains only one plugin, you can
     * omit the name and details for that plugin. If the document contains more than one plugin, you must specify the
     * name of the plugin for which you want to view details.
     * </p>
     * <p>
     * Plugin names are also referred to as <i>step names</i> in Systems Manager documents (SSM documents). For example,
     * <code>aws:RunShellScript</code> is a plugin.
     * </p>
     * <p>
     * To find the <code>PluginName</code>, check the document content and find the name of the plugin. Alternatively,
     * use <a>ListCommandInvocations</a> with the <code>CommandId</code> and <code>Details</code> parameters. The
     * <code>PluginName</code> is the <code>Name</code> attribute of the <code>CommandPlugin</code> object in the
     * <code>CommandPlugins</code> list.
     * </p>
     */
    private String pluginName;

    /**
     * <p>
     * (Required) The parent command ID of the invocation plugin.
     * </p>
     * 
     * @param commandId
     *        (Required) The parent command ID of the invocation plugin.
     */

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    /**
     * <p>
     * (Required) The parent command ID of the invocation plugin.
     * </p>
     * 
     * @return (Required) The parent command ID of the invocation plugin.
     */

    public String getCommandId() {
        return this.commandId;
    }

    /**
     * <p>
     * (Required) The parent command ID of the invocation plugin.
     * </p>
     * 
     * @param commandId
     *        (Required) The parent command ID of the invocation plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommandInvocationRequest withCommandId(String commandId) {
        setCommandId(commandId);
        return this;
    }

    /**
     * <p>
     * (Required) The ID of the managed instance targeted by the command. A managed instance can be an Amazon Elastic
     * Compute Cloud (Amazon EC2) instance or an instance in your hybrid environment that is configured for Amazon Web
     * Services Systems Manager.
     * </p>
     * 
     * @param instanceId
     *        (Required) The ID of the managed instance targeted by the command. A managed instance can be an Amazon
     *        Elastic Compute Cloud (Amazon EC2) instance or an instance in your hybrid environment that is configured
     *        for Amazon Web Services Systems Manager.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * (Required) The ID of the managed instance targeted by the command. A managed instance can be an Amazon Elastic
     * Compute Cloud (Amazon EC2) instance or an instance in your hybrid environment that is configured for Amazon Web
     * Services Systems Manager.
     * </p>
     * 
     * @return (Required) The ID of the managed instance targeted by the command. A managed instance can be an Amazon
     *         Elastic Compute Cloud (Amazon EC2) instance or an instance in your hybrid environment that is configured
     *         for Amazon Web Services Systems Manager.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * (Required) The ID of the managed instance targeted by the command. A managed instance can be an Amazon Elastic
     * Compute Cloud (Amazon EC2) instance or an instance in your hybrid environment that is configured for Amazon Web
     * Services Systems Manager.
     * </p>
     * 
     * @param instanceId
     *        (Required) The ID of the managed instance targeted by the command. A managed instance can be an Amazon
     *        Elastic Compute Cloud (Amazon EC2) instance or an instance in your hybrid environment that is configured
     *        for Amazon Web Services Systems Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommandInvocationRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The name of the plugin for which you want detailed results. If the document contains only one plugin, you can
     * omit the name and details for that plugin. If the document contains more than one plugin, you must specify the
     * name of the plugin for which you want to view details.
     * </p>
     * <p>
     * Plugin names are also referred to as <i>step names</i> in Systems Manager documents (SSM documents). For example,
     * <code>aws:RunShellScript</code> is a plugin.
     * </p>
     * <p>
     * To find the <code>PluginName</code>, check the document content and find the name of the plugin. Alternatively,
     * use <a>ListCommandInvocations</a> with the <code>CommandId</code> and <code>Details</code> parameters. The
     * <code>PluginName</code> is the <code>Name</code> attribute of the <code>CommandPlugin</code> object in the
     * <code>CommandPlugins</code> list.
     * </p>
     * 
     * @param pluginName
     *        The name of the plugin for which you want detailed results. If the document contains only one plugin, you
     *        can omit the name and details for that plugin. If the document contains more than one plugin, you must
     *        specify the name of the plugin for which you want to view details.</p>
     *        <p>
     *        Plugin names are also referred to as <i>step names</i> in Systems Manager documents (SSM documents). For
     *        example, <code>aws:RunShellScript</code> is a plugin.
     *        </p>
     *        <p>
     *        To find the <code>PluginName</code>, check the document content and find the name of the plugin.
     *        Alternatively, use <a>ListCommandInvocations</a> with the <code>CommandId</code> and <code>Details</code>
     *        parameters. The <code>PluginName</code> is the <code>Name</code> attribute of the
     *        <code>CommandPlugin</code> object in the <code>CommandPlugins</code> list.
     */

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    /**
     * <p>
     * The name of the plugin for which you want detailed results. If the document contains only one plugin, you can
     * omit the name and details for that plugin. If the document contains more than one plugin, you must specify the
     * name of the plugin for which you want to view details.
     * </p>
     * <p>
     * Plugin names are also referred to as <i>step names</i> in Systems Manager documents (SSM documents). For example,
     * <code>aws:RunShellScript</code> is a plugin.
     * </p>
     * <p>
     * To find the <code>PluginName</code>, check the document content and find the name of the plugin. Alternatively,
     * use <a>ListCommandInvocations</a> with the <code>CommandId</code> and <code>Details</code> parameters. The
     * <code>PluginName</code> is the <code>Name</code> attribute of the <code>CommandPlugin</code> object in the
     * <code>CommandPlugins</code> list.
     * </p>
     * 
     * @return The name of the plugin for which you want detailed results. If the document contains only one plugin, you
     *         can omit the name and details for that plugin. If the document contains more than one plugin, you must
     *         specify the name of the plugin for which you want to view details.</p>
     *         <p>
     *         Plugin names are also referred to as <i>step names</i> in Systems Manager documents (SSM documents). For
     *         example, <code>aws:RunShellScript</code> is a plugin.
     *         </p>
     *         <p>
     *         To find the <code>PluginName</code>, check the document content and find the name of the plugin.
     *         Alternatively, use <a>ListCommandInvocations</a> with the <code>CommandId</code> and <code>Details</code>
     *         parameters. The <code>PluginName</code> is the <code>Name</code> attribute of the
     *         <code>CommandPlugin</code> object in the <code>CommandPlugins</code> list.
     */

    public String getPluginName() {
        return this.pluginName;
    }

    /**
     * <p>
     * The name of the plugin for which you want detailed results. If the document contains only one plugin, you can
     * omit the name and details for that plugin. If the document contains more than one plugin, you must specify the
     * name of the plugin for which you want to view details.
     * </p>
     * <p>
     * Plugin names are also referred to as <i>step names</i> in Systems Manager documents (SSM documents). For example,
     * <code>aws:RunShellScript</code> is a plugin.
     * </p>
     * <p>
     * To find the <code>PluginName</code>, check the document content and find the name of the plugin. Alternatively,
     * use <a>ListCommandInvocations</a> with the <code>CommandId</code> and <code>Details</code> parameters. The
     * <code>PluginName</code> is the <code>Name</code> attribute of the <code>CommandPlugin</code> object in the
     * <code>CommandPlugins</code> list.
     * </p>
     * 
     * @param pluginName
     *        The name of the plugin for which you want detailed results. If the document contains only one plugin, you
     *        can omit the name and details for that plugin. If the document contains more than one plugin, you must
     *        specify the name of the plugin for which you want to view details.</p>
     *        <p>
     *        Plugin names are also referred to as <i>step names</i> in Systems Manager documents (SSM documents). For
     *        example, <code>aws:RunShellScript</code> is a plugin.
     *        </p>
     *        <p>
     *        To find the <code>PluginName</code>, check the document content and find the name of the plugin.
     *        Alternatively, use <a>ListCommandInvocations</a> with the <code>CommandId</code> and <code>Details</code>
     *        parameters. The <code>PluginName</code> is the <code>Name</code> attribute of the
     *        <code>CommandPlugin</code> object in the <code>CommandPlugins</code> list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCommandInvocationRequest withPluginName(String pluginName) {
        setPluginName(pluginName);
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
        if (getCommandId() != null)
            sb.append("CommandId: ").append(getCommandId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getPluginName() != null)
            sb.append("PluginName: ").append(getPluginName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCommandInvocationRequest == false)
            return false;
        GetCommandInvocationRequest other = (GetCommandInvocationRequest) obj;
        if (other.getCommandId() == null ^ this.getCommandId() == null)
            return false;
        if (other.getCommandId() != null && other.getCommandId().equals(this.getCommandId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getPluginName() == null ^ this.getPluginName() == null)
            return false;
        if (other.getPluginName() != null && other.getPluginName().equals(this.getPluginName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCommandId() == null) ? 0 : getCommandId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getPluginName() == null) ? 0 : getPluginName().hashCode());
        return hashCode;
    }

    @Override
    public GetCommandInvocationRequest clone() {
        return (GetCommandInvocationRequest) super.clone();
    }

}
