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
package com.amazonaws.services.opsworkscm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/ExportServerEngineAttribute"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportServerEngineAttributeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the export attribute. Currently, the supported export attribute is <code>Userdata</code>. This
     * exports a user data script that includes parameters and values provided in the <code>InputAttributes</code> list.
     * </p>
     */
    private String exportAttributeName;
    /**
     * <p>
     * The name of the server from which you are exporting the attribute.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * The list of engine attributes. The list type is <code>EngineAttribute</code>. An <code>EngineAttribute</code>
     * list item is a pair that includes an attribute name and its value. For the <code>Userdata</code>
     * ExportAttributeName, the following are supported engine attribute names.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RunList</b> In Chef, a list of roles or recipes that are run in the specified order. In Puppet, this parameter
     * is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OrganizationName</b> In Chef, an organization name. AWS OpsWorks for Chef Automate always creates the
     * organization <code>default</code>. In Puppet, this parameter is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NodeEnvironment</b> In Chef, a node environment (for example, development, staging, or one-box). In Puppet,
     * this parameter is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NodeClientVersion</b> In Chef, the version of the Chef engine (three numbers separated by dots, such as
     * 13.8.5). If this attribute is empty, OpsWorks for Chef Automate uses the most current version. In Puppet, this
     * parameter is ignored.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<EngineAttribute> inputAttributes;

    /**
     * <p>
     * The name of the export attribute. Currently, the supported export attribute is <code>Userdata</code>. This
     * exports a user data script that includes parameters and values provided in the <code>InputAttributes</code> list.
     * </p>
     * 
     * @param exportAttributeName
     *        The name of the export attribute. Currently, the supported export attribute is <code>Userdata</code>. This
     *        exports a user data script that includes parameters and values provided in the
     *        <code>InputAttributes</code> list.
     */

    public void setExportAttributeName(String exportAttributeName) {
        this.exportAttributeName = exportAttributeName;
    }

    /**
     * <p>
     * The name of the export attribute. Currently, the supported export attribute is <code>Userdata</code>. This
     * exports a user data script that includes parameters and values provided in the <code>InputAttributes</code> list.
     * </p>
     * 
     * @return The name of the export attribute. Currently, the supported export attribute is <code>Userdata</code>.
     *         This exports a user data script that includes parameters and values provided in the
     *         <code>InputAttributes</code> list.
     */

    public String getExportAttributeName() {
        return this.exportAttributeName;
    }

    /**
     * <p>
     * The name of the export attribute. Currently, the supported export attribute is <code>Userdata</code>. This
     * exports a user data script that includes parameters and values provided in the <code>InputAttributes</code> list.
     * </p>
     * 
     * @param exportAttributeName
     *        The name of the export attribute. Currently, the supported export attribute is <code>Userdata</code>. This
     *        exports a user data script that includes parameters and values provided in the
     *        <code>InputAttributes</code> list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportServerEngineAttributeRequest withExportAttributeName(String exportAttributeName) {
        setExportAttributeName(exportAttributeName);
        return this;
    }

    /**
     * <p>
     * The name of the server from which you are exporting the attribute.
     * </p>
     * 
     * @param serverName
     *        The name of the server from which you are exporting the attribute.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server from which you are exporting the attribute.
     * </p>
     * 
     * @return The name of the server from which you are exporting the attribute.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The name of the server from which you are exporting the attribute.
     * </p>
     * 
     * @param serverName
     *        The name of the server from which you are exporting the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportServerEngineAttributeRequest withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * The list of engine attributes. The list type is <code>EngineAttribute</code>. An <code>EngineAttribute</code>
     * list item is a pair that includes an attribute name and its value. For the <code>Userdata</code>
     * ExportAttributeName, the following are supported engine attribute names.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RunList</b> In Chef, a list of roles or recipes that are run in the specified order. In Puppet, this parameter
     * is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OrganizationName</b> In Chef, an organization name. AWS OpsWorks for Chef Automate always creates the
     * organization <code>default</code>. In Puppet, this parameter is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NodeEnvironment</b> In Chef, a node environment (for example, development, staging, or one-box). In Puppet,
     * this parameter is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NodeClientVersion</b> In Chef, the version of the Chef engine (three numbers separated by dots, such as
     * 13.8.5). If this attribute is empty, OpsWorks for Chef Automate uses the most current version. In Puppet, this
     * parameter is ignored.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The list of engine attributes. The list type is <code>EngineAttribute</code>. An
     *         <code>EngineAttribute</code> list item is a pair that includes an attribute name and its value. For the
     *         <code>Userdata</code> ExportAttributeName, the following are supported engine attribute names.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>RunList</b> In Chef, a list of roles or recipes that are run in the specified order. In Puppet, this
     *         parameter is ignored.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>OrganizationName</b> In Chef, an organization name. AWS OpsWorks for Chef Automate always creates the
     *         organization <code>default</code>. In Puppet, this parameter is ignored.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>NodeEnvironment</b> In Chef, a node environment (for example, development, staging, or one-box). In
     *         Puppet, this parameter is ignored.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>NodeClientVersion</b> In Chef, the version of the Chef engine (three numbers separated by dots, such
     *         as 13.8.5). If this attribute is empty, OpsWorks for Chef Automate uses the most current version. In
     *         Puppet, this parameter is ignored.
     *         </p>
     *         </li>
     */

    public java.util.List<EngineAttribute> getInputAttributes() {
        return inputAttributes;
    }

    /**
     * <p>
     * The list of engine attributes. The list type is <code>EngineAttribute</code>. An <code>EngineAttribute</code>
     * list item is a pair that includes an attribute name and its value. For the <code>Userdata</code>
     * ExportAttributeName, the following are supported engine attribute names.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RunList</b> In Chef, a list of roles or recipes that are run in the specified order. In Puppet, this parameter
     * is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OrganizationName</b> In Chef, an organization name. AWS OpsWorks for Chef Automate always creates the
     * organization <code>default</code>. In Puppet, this parameter is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NodeEnvironment</b> In Chef, a node environment (for example, development, staging, or one-box). In Puppet,
     * this parameter is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NodeClientVersion</b> In Chef, the version of the Chef engine (three numbers separated by dots, such as
     * 13.8.5). If this attribute is empty, OpsWorks for Chef Automate uses the most current version. In Puppet, this
     * parameter is ignored.
     * </p>
     * </li>
     * </ul>
     * 
     * @param inputAttributes
     *        The list of engine attributes. The list type is <code>EngineAttribute</code>. An
     *        <code>EngineAttribute</code> list item is a pair that includes an attribute name and its value. For the
     *        <code>Userdata</code> ExportAttributeName, the following are supported engine attribute names.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>RunList</b> In Chef, a list of roles or recipes that are run in the specified order. In Puppet, this
     *        parameter is ignored.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>OrganizationName</b> In Chef, an organization name. AWS OpsWorks for Chef Automate always creates the
     *        organization <code>default</code>. In Puppet, this parameter is ignored.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>NodeEnvironment</b> In Chef, a node environment (for example, development, staging, or one-box). In
     *        Puppet, this parameter is ignored.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>NodeClientVersion</b> In Chef, the version of the Chef engine (three numbers separated by dots, such as
     *        13.8.5). If this attribute is empty, OpsWorks for Chef Automate uses the most current version. In Puppet,
     *        this parameter is ignored.
     *        </p>
     *        </li>
     */

    public void setInputAttributes(java.util.Collection<EngineAttribute> inputAttributes) {
        if (inputAttributes == null) {
            this.inputAttributes = null;
            return;
        }

        this.inputAttributes = new java.util.ArrayList<EngineAttribute>(inputAttributes);
    }

    /**
     * <p>
     * The list of engine attributes. The list type is <code>EngineAttribute</code>. An <code>EngineAttribute</code>
     * list item is a pair that includes an attribute name and its value. For the <code>Userdata</code>
     * ExportAttributeName, the following are supported engine attribute names.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RunList</b> In Chef, a list of roles or recipes that are run in the specified order. In Puppet, this parameter
     * is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OrganizationName</b> In Chef, an organization name. AWS OpsWorks for Chef Automate always creates the
     * organization <code>default</code>. In Puppet, this parameter is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NodeEnvironment</b> In Chef, a node environment (for example, development, staging, or one-box). In Puppet,
     * this parameter is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NodeClientVersion</b> In Chef, the version of the Chef engine (three numbers separated by dots, such as
     * 13.8.5). If this attribute is empty, OpsWorks for Chef Automate uses the most current version. In Puppet, this
     * parameter is ignored.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputAttributes(java.util.Collection)} or {@link #withInputAttributes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param inputAttributes
     *        The list of engine attributes. The list type is <code>EngineAttribute</code>. An
     *        <code>EngineAttribute</code> list item is a pair that includes an attribute name and its value. For the
     *        <code>Userdata</code> ExportAttributeName, the following are supported engine attribute names.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>RunList</b> In Chef, a list of roles or recipes that are run in the specified order. In Puppet, this
     *        parameter is ignored.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>OrganizationName</b> In Chef, an organization name. AWS OpsWorks for Chef Automate always creates the
     *        organization <code>default</code>. In Puppet, this parameter is ignored.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>NodeEnvironment</b> In Chef, a node environment (for example, development, staging, or one-box). In
     *        Puppet, this parameter is ignored.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>NodeClientVersion</b> In Chef, the version of the Chef engine (three numbers separated by dots, such as
     *        13.8.5). If this attribute is empty, OpsWorks for Chef Automate uses the most current version. In Puppet,
     *        this parameter is ignored.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportServerEngineAttributeRequest withInputAttributes(EngineAttribute... inputAttributes) {
        if (this.inputAttributes == null) {
            setInputAttributes(new java.util.ArrayList<EngineAttribute>(inputAttributes.length));
        }
        for (EngineAttribute ele : inputAttributes) {
            this.inputAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of engine attributes. The list type is <code>EngineAttribute</code>. An <code>EngineAttribute</code>
     * list item is a pair that includes an attribute name and its value. For the <code>Userdata</code>
     * ExportAttributeName, the following are supported engine attribute names.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>RunList</b> In Chef, a list of roles or recipes that are run in the specified order. In Puppet, this parameter
     * is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OrganizationName</b> In Chef, an organization name. AWS OpsWorks for Chef Automate always creates the
     * organization <code>default</code>. In Puppet, this parameter is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NodeEnvironment</b> In Chef, a node environment (for example, development, staging, or one-box). In Puppet,
     * this parameter is ignored.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NodeClientVersion</b> In Chef, the version of the Chef engine (three numbers separated by dots, such as
     * 13.8.5). If this attribute is empty, OpsWorks for Chef Automate uses the most current version. In Puppet, this
     * parameter is ignored.
     * </p>
     * </li>
     * </ul>
     * 
     * @param inputAttributes
     *        The list of engine attributes. The list type is <code>EngineAttribute</code>. An
     *        <code>EngineAttribute</code> list item is a pair that includes an attribute name and its value. For the
     *        <code>Userdata</code> ExportAttributeName, the following are supported engine attribute names.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>RunList</b> In Chef, a list of roles or recipes that are run in the specified order. In Puppet, this
     *        parameter is ignored.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>OrganizationName</b> In Chef, an organization name. AWS OpsWorks for Chef Automate always creates the
     *        organization <code>default</code>. In Puppet, this parameter is ignored.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>NodeEnvironment</b> In Chef, a node environment (for example, development, staging, or one-box). In
     *        Puppet, this parameter is ignored.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>NodeClientVersion</b> In Chef, the version of the Chef engine (three numbers separated by dots, such as
     *        13.8.5). If this attribute is empty, OpsWorks for Chef Automate uses the most current version. In Puppet,
     *        this parameter is ignored.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportServerEngineAttributeRequest withInputAttributes(java.util.Collection<EngineAttribute> inputAttributes) {
        setInputAttributes(inputAttributes);
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
        if (getExportAttributeName() != null)
            sb.append("ExportAttributeName: ").append(getExportAttributeName()).append(",");
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName()).append(",");
        if (getInputAttributes() != null)
            sb.append("InputAttributes: ").append(getInputAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportServerEngineAttributeRequest == false)
            return false;
        ExportServerEngineAttributeRequest other = (ExportServerEngineAttributeRequest) obj;
        if (other.getExportAttributeName() == null ^ this.getExportAttributeName() == null)
            return false;
        if (other.getExportAttributeName() != null && other.getExportAttributeName().equals(this.getExportAttributeName()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getInputAttributes() == null ^ this.getInputAttributes() == null)
            return false;
        if (other.getInputAttributes() != null && other.getInputAttributes().equals(this.getInputAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportAttributeName() == null) ? 0 : getExportAttributeName().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getInputAttributes() == null) ? 0 : getInputAttributes().hashCode());
        return hashCode;
    }

    @Override
    public ExportServerEngineAttributeRequest clone() {
        return (ExportServerEngineAttributeRequest) super.clone();
    }

}
