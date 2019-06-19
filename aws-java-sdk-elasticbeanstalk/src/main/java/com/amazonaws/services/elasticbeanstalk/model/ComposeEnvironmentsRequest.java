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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request to create or update a group of environments.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ComposeEnvironments"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComposeEnvironmentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application to which the specified source bundles belong.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The name of the group to which the target environments belong. Specify a group name only if the environment name
     * defined in each target environment's manifest ends with a + (plus) character. See <a
     * href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html">Environment Manifest
     * (env.yaml)</a> for details.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * A list of version labels, specifying one or more application source bundles that belong to the target
     * application. Each source bundle must include an environment manifest that specifies the name of the environment
     * and the name of the solution stack to use, and optionally can specify environment links to create.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> versionLabels;

    /**
     * <p>
     * The name of the application to which the specified source bundles belong.
     * </p>
     * 
     * @param applicationName
     *        The name of the application to which the specified source bundles belong.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application to which the specified source bundles belong.
     * </p>
     * 
     * @return The name of the application to which the specified source bundles belong.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application to which the specified source bundles belong.
     * </p>
     * 
     * @param applicationName
     *        The name of the application to which the specified source bundles belong.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComposeEnvironmentsRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The name of the group to which the target environments belong. Specify a group name only if the environment name
     * defined in each target environment's manifest ends with a + (plus) character. See <a
     * href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html">Environment Manifest
     * (env.yaml)</a> for details.
     * </p>
     * 
     * @param groupName
     *        The name of the group to which the target environments belong. Specify a group name only if the
     *        environment name defined in each target environment's manifest ends with a + (plus) character. See <a
     *        href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html">Environment
     *        Manifest (env.yaml)</a> for details.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the group to which the target environments belong. Specify a group name only if the environment name
     * defined in each target environment's manifest ends with a + (plus) character. See <a
     * href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html">Environment Manifest
     * (env.yaml)</a> for details.
     * </p>
     * 
     * @return The name of the group to which the target environments belong. Specify a group name only if the
     *         environment name defined in each target environment's manifest ends with a + (plus) character. See <a
     *         href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html">Environment
     *         Manifest (env.yaml)</a> for details.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the group to which the target environments belong. Specify a group name only if the environment name
     * defined in each target environment's manifest ends with a + (plus) character. See <a
     * href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html">Environment Manifest
     * (env.yaml)</a> for details.
     * </p>
     * 
     * @param groupName
     *        The name of the group to which the target environments belong. Specify a group name only if the
     *        environment name defined in each target environment's manifest ends with a + (plus) character. See <a
     *        href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html">Environment
     *        Manifest (env.yaml)</a> for details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComposeEnvironmentsRequest withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * A list of version labels, specifying one or more application source bundles that belong to the target
     * application. Each source bundle must include an environment manifest that specifies the name of the environment
     * and the name of the solution stack to use, and optionally can specify environment links to create.
     * </p>
     * 
     * @return A list of version labels, specifying one or more application source bundles that belong to the target
     *         application. Each source bundle must include an environment manifest that specifies the name of the
     *         environment and the name of the solution stack to use, and optionally can specify environment links to
     *         create.
     */

    public java.util.List<String> getVersionLabels() {
        if (versionLabels == null) {
            versionLabels = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return versionLabels;
    }

    /**
     * <p>
     * A list of version labels, specifying one or more application source bundles that belong to the target
     * application. Each source bundle must include an environment manifest that specifies the name of the environment
     * and the name of the solution stack to use, and optionally can specify environment links to create.
     * </p>
     * 
     * @param versionLabels
     *        A list of version labels, specifying one or more application source bundles that belong to the target
     *        application. Each source bundle must include an environment manifest that specifies the name of the
     *        environment and the name of the solution stack to use, and optionally can specify environment links to
     *        create.
     */

    public void setVersionLabels(java.util.Collection<String> versionLabels) {
        if (versionLabels == null) {
            this.versionLabels = null;
            return;
        }

        this.versionLabels = new com.amazonaws.internal.SdkInternalList<String>(versionLabels);
    }

    /**
     * <p>
     * A list of version labels, specifying one or more application source bundles that belong to the target
     * application. Each source bundle must include an environment manifest that specifies the name of the environment
     * and the name of the solution stack to use, and optionally can specify environment links to create.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVersionLabels(java.util.Collection)} or {@link #withVersionLabels(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param versionLabels
     *        A list of version labels, specifying one or more application source bundles that belong to the target
     *        application. Each source bundle must include an environment manifest that specifies the name of the
     *        environment and the name of the solution stack to use, and optionally can specify environment links to
     *        create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComposeEnvironmentsRequest withVersionLabels(String... versionLabels) {
        if (this.versionLabels == null) {
            setVersionLabels(new com.amazonaws.internal.SdkInternalList<String>(versionLabels.length));
        }
        for (String ele : versionLabels) {
            this.versionLabels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of version labels, specifying one or more application source bundles that belong to the target
     * application. Each source bundle must include an environment manifest that specifies the name of the environment
     * and the name of the solution stack to use, and optionally can specify environment links to create.
     * </p>
     * 
     * @param versionLabels
     *        A list of version labels, specifying one or more application source bundles that belong to the target
     *        application. Each source bundle must include an environment manifest that specifies the name of the
     *        environment and the name of the solution stack to use, and optionally can specify environment links to
     *        create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComposeEnvironmentsRequest withVersionLabels(java.util.Collection<String> versionLabels) {
        setVersionLabels(versionLabels);
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
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getVersionLabels() != null)
            sb.append("VersionLabels: ").append(getVersionLabels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComposeEnvironmentsRequest == false)
            return false;
        ComposeEnvironmentsRequest other = (ComposeEnvironmentsRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getVersionLabels() == null ^ this.getVersionLabels() == null)
            return false;
        if (other.getVersionLabels() != null && other.getVersionLabels().equals(this.getVersionLabels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getVersionLabels() == null) ? 0 : getVersionLabels().hashCode());
        return hashCode;
    }

    @Override
    public ComposeEnvironmentsRequest clone() {
        return (ComposeEnvironmentsRequest) super.clone();
    }

}
