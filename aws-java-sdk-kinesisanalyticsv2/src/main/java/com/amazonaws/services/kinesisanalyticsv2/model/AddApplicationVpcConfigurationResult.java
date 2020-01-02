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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/AddApplicationVpcConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddApplicationVpcConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ARN of the application.
     * </p>
     */
    private String applicationARN;
    /**
     * <p>
     * Provides the current application version. Kinesis Data Analytics updates the ApplicationVersionId each time you
     * update the application.
     * </p>
     */
    private Long applicationVersionId;
    /**
     * <p>
     * The parameters of the new VPC configuration.
     * </p>
     */
    private VpcConfigurationDescription vpcConfigurationDescription;

    /**
     * <p>
     * The ARN of the application.
     * </p>
     * 
     * @param applicationARN
     *        The ARN of the application.
     */

    public void setApplicationARN(String applicationARN) {
        this.applicationARN = applicationARN;
    }

    /**
     * <p>
     * The ARN of the application.
     * </p>
     * 
     * @return The ARN of the application.
     */

    public String getApplicationARN() {
        return this.applicationARN;
    }

    /**
     * <p>
     * The ARN of the application.
     * </p>
     * 
     * @param applicationARN
     *        The ARN of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationVpcConfigurationResult withApplicationARN(String applicationARN) {
        setApplicationARN(applicationARN);
        return this;
    }

    /**
     * <p>
     * Provides the current application version. Kinesis Data Analytics updates the ApplicationVersionId each time you
     * update the application.
     * </p>
     * 
     * @param applicationVersionId
     *        Provides the current application version. Kinesis Data Analytics updates the ApplicationVersionId each
     *        time you update the application.
     */

    public void setApplicationVersionId(Long applicationVersionId) {
        this.applicationVersionId = applicationVersionId;
    }

    /**
     * <p>
     * Provides the current application version. Kinesis Data Analytics updates the ApplicationVersionId each time you
     * update the application.
     * </p>
     * 
     * @return Provides the current application version. Kinesis Data Analytics updates the ApplicationVersionId each
     *         time you update the application.
     */

    public Long getApplicationVersionId() {
        return this.applicationVersionId;
    }

    /**
     * <p>
     * Provides the current application version. Kinesis Data Analytics updates the ApplicationVersionId each time you
     * update the application.
     * </p>
     * 
     * @param applicationVersionId
     *        Provides the current application version. Kinesis Data Analytics updates the ApplicationVersionId each
     *        time you update the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationVpcConfigurationResult withApplicationVersionId(Long applicationVersionId) {
        setApplicationVersionId(applicationVersionId);
        return this;
    }

    /**
     * <p>
     * The parameters of the new VPC configuration.
     * </p>
     * 
     * @param vpcConfigurationDescription
     *        The parameters of the new VPC configuration.
     */

    public void setVpcConfigurationDescription(VpcConfigurationDescription vpcConfigurationDescription) {
        this.vpcConfigurationDescription = vpcConfigurationDescription;
    }

    /**
     * <p>
     * The parameters of the new VPC configuration.
     * </p>
     * 
     * @return The parameters of the new VPC configuration.
     */

    public VpcConfigurationDescription getVpcConfigurationDescription() {
        return this.vpcConfigurationDescription;
    }

    /**
     * <p>
     * The parameters of the new VPC configuration.
     * </p>
     * 
     * @param vpcConfigurationDescription
     *        The parameters of the new VPC configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationVpcConfigurationResult withVpcConfigurationDescription(VpcConfigurationDescription vpcConfigurationDescription) {
        setVpcConfigurationDescription(vpcConfigurationDescription);
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
        if (getApplicationARN() != null)
            sb.append("ApplicationARN: ").append(getApplicationARN()).append(",");
        if (getApplicationVersionId() != null)
            sb.append("ApplicationVersionId: ").append(getApplicationVersionId()).append(",");
        if (getVpcConfigurationDescription() != null)
            sb.append("VpcConfigurationDescription: ").append(getVpcConfigurationDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddApplicationVpcConfigurationResult == false)
            return false;
        AddApplicationVpcConfigurationResult other = (AddApplicationVpcConfigurationResult) obj;
        if (other.getApplicationARN() == null ^ this.getApplicationARN() == null)
            return false;
        if (other.getApplicationARN() != null && other.getApplicationARN().equals(this.getApplicationARN()) == false)
            return false;
        if (other.getApplicationVersionId() == null ^ this.getApplicationVersionId() == null)
            return false;
        if (other.getApplicationVersionId() != null && other.getApplicationVersionId().equals(this.getApplicationVersionId()) == false)
            return false;
        if (other.getVpcConfigurationDescription() == null ^ this.getVpcConfigurationDescription() == null)
            return false;
        if (other.getVpcConfigurationDescription() != null && other.getVpcConfigurationDescription().equals(this.getVpcConfigurationDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationARN() == null) ? 0 : getApplicationARN().hashCode());
        hashCode = prime * hashCode + ((getApplicationVersionId() == null) ? 0 : getApplicationVersionId().hashCode());
        hashCode = prime * hashCode + ((getVpcConfigurationDescription() == null) ? 0 : getVpcConfigurationDescription().hashCode());
        return hashCode;
    }

    @Override
    public AddApplicationVpcConfigurationResult clone() {
        try {
            return (AddApplicationVpcConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
