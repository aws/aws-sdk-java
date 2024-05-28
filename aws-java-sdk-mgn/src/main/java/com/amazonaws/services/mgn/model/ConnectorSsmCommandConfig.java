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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Connector SSM command config.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ConnectorSsmCommandConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorSsmCommandConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Connector SSM command config CloudWatch log group name.
     * </p>
     */
    private String cloudWatchLogGroupName;
    /**
     * <p>
     * Connector SSM command config CloudWatch output enabled.
     * </p>
     */
    private Boolean cloudWatchOutputEnabled;
    /**
     * <p>
     * Connector SSM command config output S3 bucket name.
     * </p>
     */
    private String outputS3BucketName;
    /**
     * <p>
     * Connector SSM command config S3 output enabled.
     * </p>
     */
    private Boolean s3OutputEnabled;

    /**
     * <p>
     * Connector SSM command config CloudWatch log group name.
     * </p>
     * 
     * @param cloudWatchLogGroupName
     *        Connector SSM command config CloudWatch log group name.
     */

    public void setCloudWatchLogGroupName(String cloudWatchLogGroupName) {
        this.cloudWatchLogGroupName = cloudWatchLogGroupName;
    }

    /**
     * <p>
     * Connector SSM command config CloudWatch log group name.
     * </p>
     * 
     * @return Connector SSM command config CloudWatch log group name.
     */

    public String getCloudWatchLogGroupName() {
        return this.cloudWatchLogGroupName;
    }

    /**
     * <p>
     * Connector SSM command config CloudWatch log group name.
     * </p>
     * 
     * @param cloudWatchLogGroupName
     *        Connector SSM command config CloudWatch log group name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorSsmCommandConfig withCloudWatchLogGroupName(String cloudWatchLogGroupName) {
        setCloudWatchLogGroupName(cloudWatchLogGroupName);
        return this;
    }

    /**
     * <p>
     * Connector SSM command config CloudWatch output enabled.
     * </p>
     * 
     * @param cloudWatchOutputEnabled
     *        Connector SSM command config CloudWatch output enabled.
     */

    public void setCloudWatchOutputEnabled(Boolean cloudWatchOutputEnabled) {
        this.cloudWatchOutputEnabled = cloudWatchOutputEnabled;
    }

    /**
     * <p>
     * Connector SSM command config CloudWatch output enabled.
     * </p>
     * 
     * @return Connector SSM command config CloudWatch output enabled.
     */

    public Boolean getCloudWatchOutputEnabled() {
        return this.cloudWatchOutputEnabled;
    }

    /**
     * <p>
     * Connector SSM command config CloudWatch output enabled.
     * </p>
     * 
     * @param cloudWatchOutputEnabled
     *        Connector SSM command config CloudWatch output enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorSsmCommandConfig withCloudWatchOutputEnabled(Boolean cloudWatchOutputEnabled) {
        setCloudWatchOutputEnabled(cloudWatchOutputEnabled);
        return this;
    }

    /**
     * <p>
     * Connector SSM command config CloudWatch output enabled.
     * </p>
     * 
     * @return Connector SSM command config CloudWatch output enabled.
     */

    public Boolean isCloudWatchOutputEnabled() {
        return this.cloudWatchOutputEnabled;
    }

    /**
     * <p>
     * Connector SSM command config output S3 bucket name.
     * </p>
     * 
     * @param outputS3BucketName
     *        Connector SSM command config output S3 bucket name.
     */

    public void setOutputS3BucketName(String outputS3BucketName) {
        this.outputS3BucketName = outputS3BucketName;
    }

    /**
     * <p>
     * Connector SSM command config output S3 bucket name.
     * </p>
     * 
     * @return Connector SSM command config output S3 bucket name.
     */

    public String getOutputS3BucketName() {
        return this.outputS3BucketName;
    }

    /**
     * <p>
     * Connector SSM command config output S3 bucket name.
     * </p>
     * 
     * @param outputS3BucketName
     *        Connector SSM command config output S3 bucket name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorSsmCommandConfig withOutputS3BucketName(String outputS3BucketName) {
        setOutputS3BucketName(outputS3BucketName);
        return this;
    }

    /**
     * <p>
     * Connector SSM command config S3 output enabled.
     * </p>
     * 
     * @param s3OutputEnabled
     *        Connector SSM command config S3 output enabled.
     */

    public void setS3OutputEnabled(Boolean s3OutputEnabled) {
        this.s3OutputEnabled = s3OutputEnabled;
    }

    /**
     * <p>
     * Connector SSM command config S3 output enabled.
     * </p>
     * 
     * @return Connector SSM command config S3 output enabled.
     */

    public Boolean getS3OutputEnabled() {
        return this.s3OutputEnabled;
    }

    /**
     * <p>
     * Connector SSM command config S3 output enabled.
     * </p>
     * 
     * @param s3OutputEnabled
     *        Connector SSM command config S3 output enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorSsmCommandConfig withS3OutputEnabled(Boolean s3OutputEnabled) {
        setS3OutputEnabled(s3OutputEnabled);
        return this;
    }

    /**
     * <p>
     * Connector SSM command config S3 output enabled.
     * </p>
     * 
     * @return Connector SSM command config S3 output enabled.
     */

    public Boolean isS3OutputEnabled() {
        return this.s3OutputEnabled;
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
        if (getCloudWatchLogGroupName() != null)
            sb.append("CloudWatchLogGroupName: ").append(getCloudWatchLogGroupName()).append(",");
        if (getCloudWatchOutputEnabled() != null)
            sb.append("CloudWatchOutputEnabled: ").append(getCloudWatchOutputEnabled()).append(",");
        if (getOutputS3BucketName() != null)
            sb.append("OutputS3BucketName: ").append(getOutputS3BucketName()).append(",");
        if (getS3OutputEnabled() != null)
            sb.append("S3OutputEnabled: ").append(getS3OutputEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectorSsmCommandConfig == false)
            return false;
        ConnectorSsmCommandConfig other = (ConnectorSsmCommandConfig) obj;
        if (other.getCloudWatchLogGroupName() == null ^ this.getCloudWatchLogGroupName() == null)
            return false;
        if (other.getCloudWatchLogGroupName() != null && other.getCloudWatchLogGroupName().equals(this.getCloudWatchLogGroupName()) == false)
            return false;
        if (other.getCloudWatchOutputEnabled() == null ^ this.getCloudWatchOutputEnabled() == null)
            return false;
        if (other.getCloudWatchOutputEnabled() != null && other.getCloudWatchOutputEnabled().equals(this.getCloudWatchOutputEnabled()) == false)
            return false;
        if (other.getOutputS3BucketName() == null ^ this.getOutputS3BucketName() == null)
            return false;
        if (other.getOutputS3BucketName() != null && other.getOutputS3BucketName().equals(this.getOutputS3BucketName()) == false)
            return false;
        if (other.getS3OutputEnabled() == null ^ this.getS3OutputEnabled() == null)
            return false;
        if (other.getS3OutputEnabled() != null && other.getS3OutputEnabled().equals(this.getS3OutputEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudWatchLogGroupName() == null) ? 0 : getCloudWatchLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchOutputEnabled() == null) ? 0 : getCloudWatchOutputEnabled().hashCode());
        hashCode = prime * hashCode + ((getOutputS3BucketName() == null) ? 0 : getOutputS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getS3OutputEnabled() == null) ? 0 : getS3OutputEnabled().hashCode());
        return hashCode;
    }

    @Override
    public ConnectorSsmCommandConfig clone() {
        try {
            return (ConnectorSsmCommandConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.ConnectorSsmCommandConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
