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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The resource lifecycle configuration for an application. Defines lifecycle settings for resources that belong to the
 * application, and the service role that AWS Elastic Beanstalk assumes in order to apply lifecycle settings. The
 * version lifecycle configuration defines lifecycle settings for application versions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ApplicationResourceLifecycleConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationResourceLifecycleConfig implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of an IAM service role that Elastic Beanstalk has permission to assume.
     * </p>
     * <p>
     * The <code>ServiceRole</code> property is required the first time that you provide a
     * <code>VersionLifecycleConfig</code> for the application in one of the supporting calls (
     * <code>CreateApplication</code> or <code>UpdateApplicationResourceLifecycle</code>). After you provide it once, in
     * either one of the calls, Elastic Beanstalk persists the Service Role with the application, and you don't need to
     * specify it again in subsequent <code>UpdateApplicationResourceLifecycle</code> calls. You can, however, specify
     * it in subsequent calls to change the Service Role to another value.
     * </p>
     */
    private String serviceRole;
    /**
     * <p>
     * Defines lifecycle settings for application versions.
     * </p>
     */
    private ApplicationVersionLifecycleConfig versionLifecycleConfig;

    /**
     * <p>
     * The ARN of an IAM service role that Elastic Beanstalk has permission to assume.
     * </p>
     * <p>
     * The <code>ServiceRole</code> property is required the first time that you provide a
     * <code>VersionLifecycleConfig</code> for the application in one of the supporting calls (
     * <code>CreateApplication</code> or <code>UpdateApplicationResourceLifecycle</code>). After you provide it once, in
     * either one of the calls, Elastic Beanstalk persists the Service Role with the application, and you don't need to
     * specify it again in subsequent <code>UpdateApplicationResourceLifecycle</code> calls. You can, however, specify
     * it in subsequent calls to change the Service Role to another value.
     * </p>
     * 
     * @param serviceRole
     *        The ARN of an IAM service role that Elastic Beanstalk has permission to assume.</p>
     *        <p>
     *        The <code>ServiceRole</code> property is required the first time that you provide a
     *        <code>VersionLifecycleConfig</code> for the application in one of the supporting calls (
     *        <code>CreateApplication</code> or <code>UpdateApplicationResourceLifecycle</code>). After you provide it
     *        once, in either one of the calls, Elastic Beanstalk persists the Service Role with the application, and
     *        you don't need to specify it again in subsequent <code>UpdateApplicationResourceLifecycle</code> calls.
     *        You can, however, specify it in subsequent calls to change the Service Role to another value.
     */

    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The ARN of an IAM service role that Elastic Beanstalk has permission to assume.
     * </p>
     * <p>
     * The <code>ServiceRole</code> property is required the first time that you provide a
     * <code>VersionLifecycleConfig</code> for the application in one of the supporting calls (
     * <code>CreateApplication</code> or <code>UpdateApplicationResourceLifecycle</code>). After you provide it once, in
     * either one of the calls, Elastic Beanstalk persists the Service Role with the application, and you don't need to
     * specify it again in subsequent <code>UpdateApplicationResourceLifecycle</code> calls. You can, however, specify
     * it in subsequent calls to change the Service Role to another value.
     * </p>
     * 
     * @return The ARN of an IAM service role that Elastic Beanstalk has permission to assume.</p>
     *         <p>
     *         The <code>ServiceRole</code> property is required the first time that you provide a
     *         <code>VersionLifecycleConfig</code> for the application in one of the supporting calls (
     *         <code>CreateApplication</code> or <code>UpdateApplicationResourceLifecycle</code>). After you provide it
     *         once, in either one of the calls, Elastic Beanstalk persists the Service Role with the application, and
     *         you don't need to specify it again in subsequent <code>UpdateApplicationResourceLifecycle</code> calls.
     *         You can, however, specify it in subsequent calls to change the Service Role to another value.
     */

    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * <p>
     * The ARN of an IAM service role that Elastic Beanstalk has permission to assume.
     * </p>
     * <p>
     * The <code>ServiceRole</code> property is required the first time that you provide a
     * <code>VersionLifecycleConfig</code> for the application in one of the supporting calls (
     * <code>CreateApplication</code> or <code>UpdateApplicationResourceLifecycle</code>). After you provide it once, in
     * either one of the calls, Elastic Beanstalk persists the Service Role with the application, and you don't need to
     * specify it again in subsequent <code>UpdateApplicationResourceLifecycle</code> calls. You can, however, specify
     * it in subsequent calls to change the Service Role to another value.
     * </p>
     * 
     * @param serviceRole
     *        The ARN of an IAM service role that Elastic Beanstalk has permission to assume.</p>
     *        <p>
     *        The <code>ServiceRole</code> property is required the first time that you provide a
     *        <code>VersionLifecycleConfig</code> for the application in one of the supporting calls (
     *        <code>CreateApplication</code> or <code>UpdateApplicationResourceLifecycle</code>). After you provide it
     *        once, in either one of the calls, Elastic Beanstalk persists the Service Role with the application, and
     *        you don't need to specify it again in subsequent <code>UpdateApplicationResourceLifecycle</code> calls.
     *        You can, however, specify it in subsequent calls to change the Service Role to another value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationResourceLifecycleConfig withServiceRole(String serviceRole) {
        setServiceRole(serviceRole);
        return this;
    }

    /**
     * <p>
     * Defines lifecycle settings for application versions.
     * </p>
     * 
     * @param versionLifecycleConfig
     *        Defines lifecycle settings for application versions.
     */

    public void setVersionLifecycleConfig(ApplicationVersionLifecycleConfig versionLifecycleConfig) {
        this.versionLifecycleConfig = versionLifecycleConfig;
    }

    /**
     * <p>
     * Defines lifecycle settings for application versions.
     * </p>
     * 
     * @return Defines lifecycle settings for application versions.
     */

    public ApplicationVersionLifecycleConfig getVersionLifecycleConfig() {
        return this.versionLifecycleConfig;
    }

    /**
     * <p>
     * Defines lifecycle settings for application versions.
     * </p>
     * 
     * @param versionLifecycleConfig
     *        Defines lifecycle settings for application versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationResourceLifecycleConfig withVersionLifecycleConfig(ApplicationVersionLifecycleConfig versionLifecycleConfig) {
        setVersionLifecycleConfig(versionLifecycleConfig);
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
        if (getServiceRole() != null)
            sb.append("ServiceRole: ").append(getServiceRole()).append(",");
        if (getVersionLifecycleConfig() != null)
            sb.append("VersionLifecycleConfig: ").append(getVersionLifecycleConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationResourceLifecycleConfig == false)
            return false;
        ApplicationResourceLifecycleConfig other = (ApplicationResourceLifecycleConfig) obj;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null)
            return false;
        if (other.getServiceRole() != null && other.getServiceRole().equals(this.getServiceRole()) == false)
            return false;
        if (other.getVersionLifecycleConfig() == null ^ this.getVersionLifecycleConfig() == null)
            return false;
        if (other.getVersionLifecycleConfig() != null && other.getVersionLifecycleConfig().equals(this.getVersionLifecycleConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getVersionLifecycleConfig() == null) ? 0 : getVersionLifecycleConfig().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationResourceLifecycleConfig clone() {
        try {
            return (ApplicationResourceLifecycleConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
