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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The channel through which AWS Config delivers notifications and updated configuration states.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeliveryChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeliveryChannel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the delivery channel. By default, AWS Config assigns the name "default" when creating the delivery
     * channel. To change the delivery channel name, you must use the DeleteDeliveryChannel action to delete your
     * current delivery channel, and then you must use the PutDeliveryChannel command to create a delivery channel that
     * has the desired name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the Amazon S3 bucket to which AWS Config delivers configuration snapshots and configuration history
     * files.
     * </p>
     * <p>
     * If you specify a bucket that belongs to another AWS account, that bucket must have policies that grant access
     * permissions to AWS Config. For more information, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/s3-bucket-policy.html">Permissions for the Amazon
     * S3 Bucket</a> in the AWS Config Developer Guide.
     * </p>
     */
    private String s3BucketName;
    /**
     * <p>
     * The prefix for the specified Amazon S3 bucket.
     * </p>
     */
    private String s3KeyPrefix;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which AWS Config sends notifications about
     * configuration changes.
     * </p>
     * <p>
     * If you choose a topic from another account, the topic must have policies that grant access permissions to AWS
     * Config. For more information, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/sns-topic-policy.html">Permissions for the Amazon
     * SNS Topic</a> in the AWS Config Developer Guide.
     * </p>
     */
    private String snsTopicARN;
    /**
     * <p>
     * The options for how often AWS Config delivers configuration snapshots to the Amazon S3 bucket.
     * </p>
     */
    private ConfigSnapshotDeliveryProperties configSnapshotDeliveryProperties;

    /**
     * <p>
     * The name of the delivery channel. By default, AWS Config assigns the name "default" when creating the delivery
     * channel. To change the delivery channel name, you must use the DeleteDeliveryChannel action to delete your
     * current delivery channel, and then you must use the PutDeliveryChannel command to create a delivery channel that
     * has the desired name.
     * </p>
     * 
     * @param name
     *        The name of the delivery channel. By default, AWS Config assigns the name "default" when creating the
     *        delivery channel. To change the delivery channel name, you must use the DeleteDeliveryChannel action to
     *        delete your current delivery channel, and then you must use the PutDeliveryChannel command to create a
     *        delivery channel that has the desired name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the delivery channel. By default, AWS Config assigns the name "default" when creating the delivery
     * channel. To change the delivery channel name, you must use the DeleteDeliveryChannel action to delete your
     * current delivery channel, and then you must use the PutDeliveryChannel command to create a delivery channel that
     * has the desired name.
     * </p>
     * 
     * @return The name of the delivery channel. By default, AWS Config assigns the name "default" when creating the
     *         delivery channel. To change the delivery channel name, you must use the DeleteDeliveryChannel action to
     *         delete your current delivery channel, and then you must use the PutDeliveryChannel command to create a
     *         delivery channel that has the desired name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the delivery channel. By default, AWS Config assigns the name "default" when creating the delivery
     * channel. To change the delivery channel name, you must use the DeleteDeliveryChannel action to delete your
     * current delivery channel, and then you must use the PutDeliveryChannel command to create a delivery channel that
     * has the desired name.
     * </p>
     * 
     * @param name
     *        The name of the delivery channel. By default, AWS Config assigns the name "default" when creating the
     *        delivery channel. To change the delivery channel name, you must use the DeleteDeliveryChannel action to
     *        delete your current delivery channel, and then you must use the PutDeliveryChannel command to create a
     *        delivery channel that has the desired name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryChannel withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket to which AWS Config delivers configuration snapshots and configuration history
     * files.
     * </p>
     * <p>
     * If you specify a bucket that belongs to another AWS account, that bucket must have policies that grant access
     * permissions to AWS Config. For more information, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/s3-bucket-policy.html">Permissions for the Amazon
     * S3 Bucket</a> in the AWS Config Developer Guide.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the Amazon S3 bucket to which AWS Config delivers configuration snapshots and configuration
     *        history files.</p>
     *        <p>
     *        If you specify a bucket that belongs to another AWS account, that bucket must have policies that grant
     *        access permissions to AWS Config. For more information, see <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/s3-bucket-policy.html">Permissions for the
     *        Amazon S3 Bucket</a> in the AWS Config Developer Guide.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket to which AWS Config delivers configuration snapshots and configuration history
     * files.
     * </p>
     * <p>
     * If you specify a bucket that belongs to another AWS account, that bucket must have policies that grant access
     * permissions to AWS Config. For more information, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/s3-bucket-policy.html">Permissions for the Amazon
     * S3 Bucket</a> in the AWS Config Developer Guide.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket to which AWS Config delivers configuration snapshots and configuration
     *         history files.</p>
     *         <p>
     *         If you specify a bucket that belongs to another AWS account, that bucket must have policies that grant
     *         access permissions to AWS Config. For more information, see <a
     *         href="https://docs.aws.amazon.com/config/latest/developerguide/s3-bucket-policy.html">Permissions for the
     *         Amazon S3 Bucket</a> in the AWS Config Developer Guide.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket to which AWS Config delivers configuration snapshots and configuration history
     * files.
     * </p>
     * <p>
     * If you specify a bucket that belongs to another AWS account, that bucket must have policies that grant access
     * permissions to AWS Config. For more information, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/s3-bucket-policy.html">Permissions for the Amazon
     * S3 Bucket</a> in the AWS Config Developer Guide.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the Amazon S3 bucket to which AWS Config delivers configuration snapshots and configuration
     *        history files.</p>
     *        <p>
     *        If you specify a bucket that belongs to another AWS account, that bucket must have policies that grant
     *        access permissions to AWS Config. For more information, see <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/s3-bucket-policy.html">Permissions for the
     *        Amazon S3 Bucket</a> in the AWS Config Developer Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryChannel withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
        return this;
    }

    /**
     * <p>
     * The prefix for the specified Amazon S3 bucket.
     * </p>
     * 
     * @param s3KeyPrefix
     *        The prefix for the specified Amazon S3 bucket.
     */

    public void setS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }

    /**
     * <p>
     * The prefix for the specified Amazon S3 bucket.
     * </p>
     * 
     * @return The prefix for the specified Amazon S3 bucket.
     */

    public String getS3KeyPrefix() {
        return this.s3KeyPrefix;
    }

    /**
     * <p>
     * The prefix for the specified Amazon S3 bucket.
     * </p>
     * 
     * @param s3KeyPrefix
     *        The prefix for the specified Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryChannel withS3KeyPrefix(String s3KeyPrefix) {
        setS3KeyPrefix(s3KeyPrefix);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which AWS Config sends notifications about
     * configuration changes.
     * </p>
     * <p>
     * If you choose a topic from another account, the topic must have policies that grant access permissions to AWS
     * Config. For more information, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/sns-topic-policy.html">Permissions for the Amazon
     * SNS Topic</a> in the AWS Config Developer Guide.
     * </p>
     * 
     * @param snsTopicARN
     *        The Amazon Resource Name (ARN) of the Amazon SNS topic to which AWS Config sends notifications about
     *        configuration changes.</p>
     *        <p>
     *        If you choose a topic from another account, the topic must have policies that grant access permissions to
     *        AWS Config. For more information, see <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/sns-topic-policy.html">Permissions for the
     *        Amazon SNS Topic</a> in the AWS Config Developer Guide.
     */

    public void setSnsTopicARN(String snsTopicARN) {
        this.snsTopicARN = snsTopicARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which AWS Config sends notifications about
     * configuration changes.
     * </p>
     * <p>
     * If you choose a topic from another account, the topic must have policies that grant access permissions to AWS
     * Config. For more information, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/sns-topic-policy.html">Permissions for the Amazon
     * SNS Topic</a> in the AWS Config Developer Guide.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon SNS topic to which AWS Config sends notifications about
     *         configuration changes.</p>
     *         <p>
     *         If you choose a topic from another account, the topic must have policies that grant access permissions to
     *         AWS Config. For more information, see <a
     *         href="https://docs.aws.amazon.com/config/latest/developerguide/sns-topic-policy.html">Permissions for the
     *         Amazon SNS Topic</a> in the AWS Config Developer Guide.
     */

    public String getSnsTopicARN() {
        return this.snsTopicARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which AWS Config sends notifications about
     * configuration changes.
     * </p>
     * <p>
     * If you choose a topic from another account, the topic must have policies that grant access permissions to AWS
     * Config. For more information, see <a
     * href="https://docs.aws.amazon.com/config/latest/developerguide/sns-topic-policy.html">Permissions for the Amazon
     * SNS Topic</a> in the AWS Config Developer Guide.
     * </p>
     * 
     * @param snsTopicARN
     *        The Amazon Resource Name (ARN) of the Amazon SNS topic to which AWS Config sends notifications about
     *        configuration changes.</p>
     *        <p>
     *        If you choose a topic from another account, the topic must have policies that grant access permissions to
     *        AWS Config. For more information, see <a
     *        href="https://docs.aws.amazon.com/config/latest/developerguide/sns-topic-policy.html">Permissions for the
     *        Amazon SNS Topic</a> in the AWS Config Developer Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryChannel withSnsTopicARN(String snsTopicARN) {
        setSnsTopicARN(snsTopicARN);
        return this;
    }

    /**
     * <p>
     * The options for how often AWS Config delivers configuration snapshots to the Amazon S3 bucket.
     * </p>
     * 
     * @param configSnapshotDeliveryProperties
     *        The options for how often AWS Config delivers configuration snapshots to the Amazon S3 bucket.
     */

    public void setConfigSnapshotDeliveryProperties(ConfigSnapshotDeliveryProperties configSnapshotDeliveryProperties) {
        this.configSnapshotDeliveryProperties = configSnapshotDeliveryProperties;
    }

    /**
     * <p>
     * The options for how often AWS Config delivers configuration snapshots to the Amazon S3 bucket.
     * </p>
     * 
     * @return The options for how often AWS Config delivers configuration snapshots to the Amazon S3 bucket.
     */

    public ConfigSnapshotDeliveryProperties getConfigSnapshotDeliveryProperties() {
        return this.configSnapshotDeliveryProperties;
    }

    /**
     * <p>
     * The options for how often AWS Config delivers configuration snapshots to the Amazon S3 bucket.
     * </p>
     * 
     * @param configSnapshotDeliveryProperties
     *        The options for how often AWS Config delivers configuration snapshots to the Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryChannel withConfigSnapshotDeliveryProperties(ConfigSnapshotDeliveryProperties configSnapshotDeliveryProperties) {
        setConfigSnapshotDeliveryProperties(configSnapshotDeliveryProperties);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getS3BucketName() != null)
            sb.append("S3BucketName: ").append(getS3BucketName()).append(",");
        if (getS3KeyPrefix() != null)
            sb.append("S3KeyPrefix: ").append(getS3KeyPrefix()).append(",");
        if (getSnsTopicARN() != null)
            sb.append("SnsTopicARN: ").append(getSnsTopicARN()).append(",");
        if (getConfigSnapshotDeliveryProperties() != null)
            sb.append("ConfigSnapshotDeliveryProperties: ").append(getConfigSnapshotDeliveryProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeliveryChannel == false)
            return false;
        DeliveryChannel other = (DeliveryChannel) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getS3KeyPrefix() == null ^ this.getS3KeyPrefix() == null)
            return false;
        if (other.getS3KeyPrefix() != null && other.getS3KeyPrefix().equals(this.getS3KeyPrefix()) == false)
            return false;
        if (other.getSnsTopicARN() == null ^ this.getSnsTopicARN() == null)
            return false;
        if (other.getSnsTopicARN() != null && other.getSnsTopicARN().equals(this.getSnsTopicARN()) == false)
            return false;
        if (other.getConfigSnapshotDeliveryProperties() == null ^ this.getConfigSnapshotDeliveryProperties() == null)
            return false;
        if (other.getConfigSnapshotDeliveryProperties() != null
                && other.getConfigSnapshotDeliveryProperties().equals(this.getConfigSnapshotDeliveryProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getS3KeyPrefix() == null) ? 0 : getS3KeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicARN() == null) ? 0 : getSnsTopicARN().hashCode());
        hashCode = prime * hashCode + ((getConfigSnapshotDeliveryProperties() == null) ? 0 : getConfigSnapshotDeliveryProperties().hashCode());
        return hashCode;
    }

    @Override
    public DeliveryChannel clone() {
        try {
            return (DeliveryChannel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.DeliveryChannelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
