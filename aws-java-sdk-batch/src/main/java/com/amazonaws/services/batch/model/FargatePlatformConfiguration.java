/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The platform configuration for jobs running on Fargate resources. Jobs running on EC2 resources must not specify this
 * parameter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/FargatePlatformConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FargatePlatformConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS Fargate platform version on which the jobs are running. A platform version is specified only for jobs
     * running on Fargate resources. If one isn't specified, the <code>LATEST</code> platform version is used by
     * default. This will use a recent, approved version of the AWS Fargate platform for compute resources. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS
     * Fargate platform versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String platformVersion;

    /**
     * <p>
     * The AWS Fargate platform version on which the jobs are running. A platform version is specified only for jobs
     * running on Fargate resources. If one isn't specified, the <code>LATEST</code> platform version is used by
     * default. This will use a recent, approved version of the AWS Fargate platform for compute resources. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS
     * Fargate platform versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param platformVersion
     *        The AWS Fargate platform version on which the jobs are running. A platform version is specified only for
     *        jobs running on Fargate resources. If one isn't specified, the <code>LATEST</code> platform version is
     *        used by default. This will use a recent, approved version of the AWS Fargate platform for compute
     *        resources. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *        platform versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * The AWS Fargate platform version on which the jobs are running. A platform version is specified only for jobs
     * running on Fargate resources. If one isn't specified, the <code>LATEST</code> platform version is used by
     * default. This will use a recent, approved version of the AWS Fargate platform for compute resources. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS
     * Fargate platform versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The AWS Fargate platform version on which the jobs are running. A platform version is specified only for
     *         jobs running on Fargate resources. If one isn't specified, the <code>LATEST</code> platform version is
     *         used by default. This will use a recent, approved version of the AWS Fargate platform for compute
     *         resources. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *         platform versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    /**
     * <p>
     * The AWS Fargate platform version on which the jobs are running. A platform version is specified only for jobs
     * running on Fargate resources. If one isn't specified, the <code>LATEST</code> platform version is used by
     * default. This will use a recent, approved version of the AWS Fargate platform for compute resources. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS
     * Fargate platform versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param platformVersion
     *        The AWS Fargate platform version on which the jobs are running. A platform version is specified only for
     *        jobs running on Fargate resources. If one isn't specified, the <code>LATEST</code> platform version is
     *        used by default. This will use a recent, approved version of the AWS Fargate platform for compute
     *        resources. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *        platform versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FargatePlatformConfiguration withPlatformVersion(String platformVersion) {
        setPlatformVersion(platformVersion);
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
        if (getPlatformVersion() != null)
            sb.append("PlatformVersion: ").append(getPlatformVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FargatePlatformConfiguration == false)
            return false;
        FargatePlatformConfiguration other = (FargatePlatformConfiguration) obj;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        return hashCode;
    }

    @Override
    public FargatePlatformConfiguration clone() {
        try {
            return (FargatePlatformConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.FargatePlatformConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
